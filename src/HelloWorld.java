public class HelloWorld {
    public static void main(String[] args) {
        char[][] arrJ = letraJ();
        escrever(arrJ);

        char[][] arrO = letraO();
        escrever(arrO);

        char[][] arrA = letraA();
        escrever(arrA);

        char[][] arrOO = letraOO();
        escrever(arrOO);
    }
    public static char[][] letraJ() {
        char[][] arr = {
                {' ', 'J', 'J', 'J', ' '},
                {' ', ' ', 'J', ' ', ' '},
                {' ', ' ', 'J', ' ', ' '},
                {'J', ' ', 'J', ' ', ' '},
                {'J', 'J', 'J', ' ', ' '}
        };
        return arr;
    }
    public static char[][] letraO() {
        char[][] arr = {
                {'O','O','O','O','O'},
                {'O', ' ', ' ', ' ','O'},
                {'O', ' ', ' ', ' ','O'},
                {'O', ' ', ' ',' ','O'},
                {'O', 'O','O','O','O'}
        };
        return arr;
    }
    public static char[][] letraA() {
        char[][] arr = {
                {'A', 'A', 'A', 'A', 'A'},
                {'A', ' ', ' ', ' ', 'A'},
                {'A', 'A', 'A', 'A', 'A'},
                {'A', ' ', ' ', ' ', 'A'},
                {'A', ' ', ' ', ' ', 'A'}
        };
        return arr;
    }
    public static char[][] letraOO() {
        char[][] arr = {
                {'O','O','O','O','O'},
                {'O', ' ', ' ', ' ','O'},
                {'O', ' ', ' ', ' ','O'},
                {'O', ' ', ' ',' ','O'},
                {'O', 'O','O','O','O'}
        };
        return arr;
    }


    public static void escrever(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}




