public class SingleLoopPrintableImpl implements MatrixPrintable{
    @Override
    public void print(int[][] data) {
        System.out.println("Single");
        if(data == null) {
            System.out.println("null");
            return;
        }
        for (int i = 0, j = 0; i < data.length; ) {
            if (data[i] != null && j < data[i].length) {
                System.out.print(data[i][j] + " ");
                j++;
            } else if(data[i] == null){
                System.out.println("null");
                i++;
                j = 0;
            }else if(data[i].length == 0){
                System.out.println("empty");
                j = 0;
                i++;
            }else {
                j = 0;
                i++;
                System.out.println();
            }
        }
    }
}
