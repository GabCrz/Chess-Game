public class Board {  

public static void arrayBoard() {
   int row = 8;int col = 8;int value = 1; 
   //create 8x8 array
    int[][] board = new int[row][col];
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){ 
            board[i][j] = value;
            value++; 
        }
    }
    for(int i=0; i < row;i++){ 
        for(int j=0; j < col; j++) { 
            System.out.println(board[i][j] + " ");
        }
        System.out.println();
    }
}    
}
