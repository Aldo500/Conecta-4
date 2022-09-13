package com.example.conecta4aldo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected Button a1, a2, a3, a4, a5, a6, b1, b2, b3, b4, b5, b6, c1, c2, c3, c4, c5, c6, d1, d2, d3, d4, d5, d6, e1, e2, e3, e4, e5, e6, f1, f2, f3, f4, f5, f6;
    protected Button[] ArrButton;
    TextView etiqueta;
    int[][] unaMatriz;
    boolean esTurno;
    int contador_tiros;
    Button click;

    public void init() {
        unaMatriz = new int[6][6];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                unaMatriz[i][j] = R.drawable.t;
            }
        }
        esTurno = true;
        contador_tiros = 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1 = (Button) findViewById(R.id.a1);
        a2 = (Button) findViewById(R.id.a2);
        a3 = (Button) findViewById(R.id.a3);
        a4 = (Button) findViewById(R.id.a4);
        a5 = (Button) findViewById(R.id.a5);
        a6 = (Button) findViewById(R.id.a6);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        c1 = (Button) findViewById(R.id.c1);
        c2 = (Button) findViewById(R.id.c2);
        c3 = (Button) findViewById(R.id.c3);
        c4 = (Button) findViewById(R.id.c4);
        c5 = (Button) findViewById(R.id.c5);
        c6 = (Button) findViewById(R.id.c6);
        d1 = (Button) findViewById(R.id.d1);
        d2 = (Button) findViewById(R.id.d2);
        d3 = (Button) findViewById(R.id.d3);
        d4 = (Button) findViewById(R.id.d4);
        d5 = (Button) findViewById(R.id.d5);
        d6 = (Button) findViewById(R.id.d6);
        e1 = (Button) findViewById(R.id.e1);
        e2 = (Button) findViewById(R.id.e2);
        e3 = (Button) findViewById(R.id.e3);
        e4 = (Button) findViewById(R.id.e4);
        e5 = (Button) findViewById(R.id.e5);
        e6 = (Button) findViewById(R.id.e6);
        f1 = (Button) findViewById(R.id.f1);
        f2 = (Button) findViewById(R.id.f2);
        f3 = (Button) findViewById(R.id.f3);
        f4 = (Button) findViewById(R.id.f4);
        f5 = (Button) findViewById(R.id.f5);
        f6 = (Button) findViewById(R.id.f6);
        etiqueta = (TextView) findViewById(R.id.etPrueba);
        this.init();
        ArrButton = new Button[]{a1, a2, a3, a4, a5, a6, b1, b2, b3, b4, b5, b6, c1, c2, c3, c4, c5, c6, d1, d2, d3, d4, d5, d6, e1, e2, e3, e4, e5, e6, f1, f2, f3, f4, f5, f6};
        for (Button b : ArrButton)
        {
            b.setOnClickListener(this);
        }
        click = findViewById(R.id.click);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateUpTo(new Intent(MainActivity.this, MainActivity.class));
                startActivity(getIntent());
            }
        });
    }

    @Override
    public void onClick(View v) {
        Button b = (Button) v;
        this.click(b);

    }

    public void click(Button b) {
        int x = 0;
        if (esTurno) {
            x = R.drawable.x;
            b.setBackgroundResource(x);
        } else {
            x = R.drawable.o;
            b.setBackgroundResource(x);
        }

        switch (b.getId()) {
            case R.id.a1:
                unaMatriz[0][0] = x;
                break;
            case R.id.a2:
                unaMatriz[0][1] = x;
                break;
            case R.id.a3:
                unaMatriz[0][2] = x;
                break;
            case R.id.a4:
                unaMatriz[0][3] = x;
                break;
            case R.id.a5:
                unaMatriz[0][4] = x;
                break;
            case R.id.a6:
                unaMatriz[0][5] = x;
                break;
            case R.id.b1:
                unaMatriz[1][0] = x;
                break;
            case R.id.b2:
                unaMatriz[1][1] = x;
                break;
            case R.id.b3:
                unaMatriz[1][2] = x;
                break;
            case R.id.b4:
                unaMatriz[1][3] = x;
                break;
            case R.id.b5:
                unaMatriz[1][4] = x;
                break;
            case R.id.b6:
                unaMatriz[1][5] = x;
                break;
            case R.id.c1:
                unaMatriz[2][0] = x;
                break;
            case R.id.c2:
                unaMatriz[2][1] = x;
                break;
            case R.id.c3:
                unaMatriz[2][2] = x;
                break;
            case R.id.c4:
                unaMatriz[2][3] = x;
                break;
            case R.id.c5:
                unaMatriz[2][4] = x;
                break;
            case R.id.c6:
                unaMatriz[2][5] = x;
            case R.id.d1:
                unaMatriz[3][0] = x;
                break;
            case R.id.d2:
                unaMatriz[3][1] = x;
                break;
            case R.id.d3:
                unaMatriz[3][2] = x;
                break;
            case R.id.d4:
                unaMatriz[3][3] = x;
                break;
            case R.id.d5:
                unaMatriz[3][4] = x;
                break;
            case R.id.d6:
                unaMatriz[3][5] = x;
                break;
            case R.id.e1:
                unaMatriz[4][0] = x;
                break;
            case R.id.e2:
                unaMatriz[4][1] = x;
                break;
            case R.id.e3:
                unaMatriz[4][2] = x;
                break;
            case R.id.e4:
                unaMatriz[4][3] = x;
                break;
            case R.id.e5:
                unaMatriz[4][4] = x;
                break;
            case R.id.e6:
                unaMatriz[4][5] = x;
                break;
            case R.id.f1:
                unaMatriz[5][0] = x;
                break;
            case R.id.f2:
                unaMatriz[5][1] = x;
                break;
            case R.id.f3:
                unaMatriz[5][2] = x;
                break;
            case R.id.f4:
                unaMatriz[5][3] = x;
                break;
            case R.id.f5:
                unaMatriz[5][4] = x;
                break;
            case R.id.f6:
                unaMatriz[5][5] = x;
                break;
        }

        esTurno = !esTurno;
        b.setClickable(true);
        contador_tiros++;
        this.verificarMatriz();
    }

    public void verificarMatriz() {
        int contador_X_F = 0, contador_O_F = 0, contador_X_C = 0, contador_O_C = 0,
                contador_X_DP = 0, contador_O_DP = 0, contador_X_DI = 0, contador_O_DI = 0, tamanioGato = 3;
        boolean hayGanador = false;

        for (int i = 0; i < unaMatriz.length; i++) {
            for (int j = 0; j < unaMatriz.length; j++) {
                if (unaMatriz[i][j] == R.drawable.x) {
                    contador_X_F++;
                    if (contador_X_F == 4) {
                        hayGanador = true;
                    }
                }

                if (unaMatriz[i][j] == R.drawable.o) {
                    contador_O_F++;
                    if (contador_O_F == 4) {
                        hayGanador = true;
                    }
                }

                if (unaMatriz[j][i] == R.drawable.o) {
                    contador_X_C++;
                    if (contador_X_C == 4) {
                        hayGanador = true;
                    }
                }

                if (unaMatriz[j][i] == R.drawable.o) {
                    contador_O_C++;
                    if (contador_O_C == 4) {
                        hayGanador = true;
                    }
                }

                if (i == j) {
                    if (unaMatriz[i][j] == R.drawable.x) {
                        contador_X_DP++;
                        if (contador_X_DP == 4) {
                            hayGanador = true;
                        }
                    }

                    if (unaMatriz[i][j] == R.drawable.o) {
                        contador_O_DP++;
                        if (contador_O_DP == 4) {
                            hayGanador = true;
                        }
                    }
                }

                if ((i + j) == tamanioGato - 1) {
                    if (i == j) {
                        if (unaMatriz[i][j] == R.drawable.x) {
                            contador_X_DI++;
                            if (contador_X_DI == 4) {
                                hayGanador = true;
                            }
                        }

                        if (unaMatriz[i][j] == R.drawable.o) {
                            contador_O_DI++;
                            if (contador_O_DI == 4) {
                                hayGanador = true;
                            }
                        }
                    }
                }

            }
            contador_X_F = 0;
            contador_O_F = 0;
            contador_X_C = 0;
            contador_O_C = 0;
        }
        if (hayGanador) {
            String v = "";
            if (!esTurno) {
                v = "Ganó X";
            } else {
                v = "Ganó O";
            }

            etiqueta.setText(v);
            contador_tiros = 0;
        }

        if (contador_tiros == 30) {
            etiqueta.setText("Empate");
        }
    }

}