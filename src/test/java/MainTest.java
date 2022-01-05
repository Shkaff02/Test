
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest extends Assert {
    private NestedLoopsPrintableImpl nestedLoopsPrintable;
    private SingleLoopPrintableImpl singleLoopPrintable;

    private int[][] data;

    @Before
    public void init() {
        nestedLoopsPrintable = new NestedLoopsPrintableImpl();
        singleLoopPrintable = new SingleLoopPrintableImpl();
    }

    //распечатка матрицы с помощью вложенного цикла
    @Test
    public void nestedTestCase1(){
        data = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        nestedLoopsPrintable.print(data);
    }

    @Test
    public void nestedTestCase2(){
        data = new int[][]{{1,2,3}, {4,5,6,7,8}, {10}};
        nestedLoopsPrintable.print(data);
    }

    @Test
    public void nestedTestCase3(){
        data = new int[][]{null, {}, {10}};
        nestedLoopsPrintable.print(data);
    }

    @Test
    public void nestedTestCase4(){
        data = null;
        nestedLoopsPrintable.print(data);
    }

    //распечатка матрицы с помощью одного цикла

    @Test
    public void singleTestCase1(){
        data = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        singleLoopPrintable.print(data);
    }

    @Test
    public void singleTestCase2(){
        data = new int[][]{{1,2,3}, {4,5,6,7,8}, {10}};
        singleLoopPrintable.print(data);
    }

    @Test
    public void singleTestCase3(){
        data = new int[][]{null, {}, {10}};
        singleLoopPrintable.print(data);
    }

    @Test
    public void singleTestCase4(){
        data = null;
        singleLoopPrintable.print(data);
    }


}
