// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }


    public static int[][] movimientoCaballo(int fila, int columna) {
        int[][] tablero = new int[8][8];  //Cria uma matriz 8x8 de zeros

        int[][] movimientos = {
                {2, 1}, {2, -1}, {-2, 1}, {-2, -1},
                {1, 2}, {1, -2}, {-1, 2}, {-1, -2},
        };

        for (int[] movimiento : movimientos) {          // recebe todos os movimentos do cavalo
            int nuevaFila = fila + movimiento[0];       //Calcula a nova linha após o movimento.
            int nuevaColumna = columna + movimiento[1]; //Calcula a nova columna após o movimento.

            if (nuevaFila >= 0 && nuevaFila < 8 && nuevaColumna >= 0 && nuevaColumna < 8) {   //verifica se o movimento ta dentro do tabuleiro
                tablero[nuevaFila][nuevaColumna] = 1;   //Se nova posiçao for igual 1. É uma posicao valida
            }
        }


        return tablero;
    }

    public static int[][] movimientoAlfil(int fila, int columna) {
        int[][] tablero = new int[8][8];


        return tablero;
    }

    public static int[][] movimientoTorre(int fila, int columna) {
        int[][] tablero = new int[8][8];

        // Marca todas as posições possíveis da torre (na mesma fila e coluna)
        for (int i = 0; i < 8; i++) {
            // mesma coluna (mover na vertical)
            if (i != fila) {                           //fila e columna é onde ta a torre no momento
                tablero[i][columna] = 1;
            }

            // mesma fila (mover na horizontal)
            if (i != columna) {
                tablero[fila][i] = 1;
            }
        }
        return tablero;
    }
}
