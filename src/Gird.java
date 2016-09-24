import java.util.concurrent.TimeUnit;

/**
 * Created by Steven on 7/19/2016.
 */
public class Gird {


    public static void main(String[] args) {
        TimeWatch watch= TimeWatch.start();

        GridGen gridGen = new GridGen();
        gridGen.gridSet();
        int[][] gridData = gridGen.gridDataAdd();
        largestValue(gridData);
        long passedTimeInMs = watch.time();
        long passedTimeInSeconds = watch.time(TimeUnit.SECONDS);
        System.out.println(passedTimeInMs);
    }
    private static long largestValue(int[][] grid) {
        long largest=0;
        //System.out.println(grid[20][20]);
        for (int r = 0; r < 20; r++) {
            for (int c = 0; c < 20; c++) {
                if (c < 17 ) {
                    if (rightCalc(grid, r, c) > largest) {

                        largest = rightCalc(grid, r, c);

                    }
                }
                if (c < 17 && r<17 ) {
                    if (diagRCalc(grid, r, c) > largest) {

                        largest = diagRCalc(grid, r, c);

                    }
                }
                if (c > 2 && r<17 ) {
                    if (diagLCalc(grid, r, c) > largest) {

                        largest = diagLCalc(grid, r, c);

                    }
                }

                if (r < 17 ) {
                    if (downCalc(grid, r, c)>largest){

                        largest=downCalc(grid, r, c);

                    }
                }
            }


        }
        System.out.println(largest);
        return largest;
    }


    private static long rightCalc(int[][] grid, int r, int c) {
        long total;

        total=grid[r][c] * grid[r][c+1] * grid[r][c+2] * grid[r][c+3];
        return total;
    }
    private static long diagRCalc(int[][] grid, int r, int c) {

        long total;
        total=grid[r][c] * grid[r+1][c+1] * grid[r+2][c+2] * grid[r+3][c+3];
        return total;
    }
    private static long diagLCalc(int[][] grid, int r, int c) {
        long total;
        total=grid[r][c] * grid[r+1][c-1] * grid[r+2][c-2] * grid[r+3][c-3];
        return total;
    }
    private static long downCalc(int[][] grid, int r, int c) {

        long total;
        total=grid[r][c] * grid[r+1][c] * grid[r+2][c] * grid[r+3][c] ;
        return total;
    }


}
