public class Main {
    public static void main(String[] args) {
        int[][] data = {{1,2,3}, null, { }, {7,8}};
        double init = Math.random();
        if(init < 0.5) {
            NestedLoopsPrintableImpl nestedLoopsPrintable = new NestedLoopsPrintableImpl();
            nestedLoopsPrintable.print(data);
        } else {
            SingleLoopPrintableImpl singleLoopPrintable = new SingleLoopPrintableImpl();
            singleLoopPrintable.print(data);
        }
    }
}
