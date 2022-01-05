public class NestedLoopsPrintableImpl implements MatrixPrintable{
    @Override
    public void print(int[][] data) {
        System.out.println("Nested");
        if(data == null) {
            System.out.println("null");
            return;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                System.out.println("null");
                continue;
            } else if(data[i].length == 0) {
                System.out.println("empty");
                continue;
            }
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
