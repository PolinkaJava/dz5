public class zadanie2 {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        String currentColor;

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                currentColor = (i + j) % 2 == 0 ? "W" : "B";
                chessBoard[i][j] = currentColor;
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}
