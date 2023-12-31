import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
                //            0     1    2     3    4    5     6    7    8    9    10   11   12    13   14   15    16   17   18    19
        String[][] grid=   {{"⬜","⬜","⬛","⬜","⬜","⬜","⬛","⬛","⬜","⬜","⬛","⬛","⬜","⬜","⬜","⬜","⬛","⬜","⬜","⬜"},//0
                            {"⬛","⬜","⬜","⬜","⬛","⬜","⬜","⬛","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬜"},//1
                            {"⬜","⬜","⬜","⬜","⬜","⬜","⬛","⬜","⬜","⬜","⬜","⬜","⬛","⬜","⬜","⬛","⬜","⬜","⬜","⬛"},//2
                            {"⬛","⬜","⬜","⬜","⬛","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬛","⬜","⬛","⬛","⬜","⬜"},//3
                            {"⬛","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬛","⬜","⬜","⬜","⬛","⬜","⬛","⬛","⬜","⬜","⬜","⬜"},//4
                            {"⬛","⬜","⬛","⬜","⬛","⬜","⬜","⬛","⬜","⬜","⬜","⬜","⬜","⬛","⬜","⬜","⬜","⬛","⬜","⬜"},//5
                            {"⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬛","⬜","⬜","⬛","⬛","⬜","⬜","⬛","⬜"},//6
                            {"⬜","⬜","⬜","⬜","⬛","⬜","⬜","⬜","⬜","⬜","⬛","⬜","⬜","⬛","⬛","⬜","⬜","⬜","⬜","⬜"},//7
                            {"⬜","⬜","⬜","⬜","⬜","⬜","⬛","⬜","⬜","⬜","⬜","⬛","⬛","⬜","⬛","⬜","⬜","⬛","⬜","⬛"},//8
                            {"⬜","⬜","⬜","⬜","⬜","⬜","⬛","⬜","⬛","⬜","⬜","⬜","⬜","⬛","⬛","⬜","⬜","⬜","⬜","⬜"},//9
                            {"⬜","⬜","⬜","⬛","⬜","⬜","⬜","⬜","⬜","⬜","⬛","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬛"},//10
                            {"⬜","⬜","⬜","⬜","⬜","⬜","⬛","⬛","⬜","⬛","⬛","⬜","⬜","⬜","⬜","⬜","⬜","⬛","⬜","⬜"},//11
                            {"⬛","⬜","⬛","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬛","⬜","⬜","⬜","⬜","⬜","⬜","⬜"},//12
                            {"⬛","⬛","⬜","⬜","⬜","⬜","⬜","⬛","⬛","⬜","⬜","⬜","⬜","⬜","⬛","⬛","⬜","⬜","⬜","⬜"},//13
                            {"⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬛","⬜","⬛","⬜","⬜","⬛","⬛","⬜","⬜","⬛","⬜","⬛","⬜"},//14
                            {"⬛","⬜","⬛","⬜","⬜","⬜","⬛","⬜","⬛","⬜","⬛","⬛","⬜","⬜","⬜","⬜","⬛","⬛","⬜","⬜"},//15
                            {"⬜","⬜","⬛","⬛","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬜","⬛","⬜"},//16
                            {"⬜","⬜","⬛","⬜","⬜","⬜","⬜","⬛","⬜","⬜","⬜","⬛","⬜","⬛","⬜","⬜","⬜","⬜","⬜","⬛"},//17
                            {"⬛","⬜","⬜","⬜","⬜","⬛","⬛","⬜","⬜","⬜","⬜","⬛","⬛","⬛","⬛","⬜","⬜","⬜","⬜","⬜"},//18
                            {"⬜","⬜","⬜","⬛","⬛","⬜","⬛","⬜","⬛","⬜","⬜","⬛","⬜","⬜","⬜","⬜","⬛","⬛","⬜","⬜"}//19			
        };


		for(String[] row: grid){
            for(String cell : row){
				System.out.print(cell);
            }
            System.out.println();
		}
	}
}