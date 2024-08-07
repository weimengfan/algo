package space.wmf.algo;

/**
 * 递归和迭代方式比较
 * @Auther weimengfan
 * @Date 2024/08/07
 */
public class IterationAndRecursion {

    public static void main(String[] args) {
        int i = 100000;
//        iteration(i);
        recursion(i);
    }
    public static void iteration(int num){
        for (int i = 0; i < num; i++) {
            System.out.println(i);
        }
    }
    public static void recursion(int num){
        if (num > 0) {
            recursion(num-1);
            System.out.println(num-1);
        }
    }


}
