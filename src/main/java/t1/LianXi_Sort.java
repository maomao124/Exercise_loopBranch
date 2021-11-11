package t1;

/**
 * Project name(项目名称)：练习_循环分支
 * Package(包名): t1
 * Class(类名): LianXi_Sort
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/11
 * Time(创建时间)： 20:27
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class LianXi_Sort
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        /*
         * 定义三个整数x,y,z，将这三个整数由小到大排序并输出。
         * 例如定义 int x = 9; int y = 10; int z = 8;   -- > x的值改成8  y的值改成9 z的值改成10
         *
         * 实现思路：通过if语句对x y z 的值进行匹配，比如x大于y则x和y进行数据交换
         * */
        java.util.Scanner sc = new java.util.Scanner(System.in);
        //获取平台分配的x的值
        int x = sc.nextInt();
        //获取平台分配的y的值
        int y = sc.nextInt();
        ;
        //获取平台分配的z的值
        int z = sc.nextInt();
        ;

        /**********begin**********/
        int temp;
        if (x > y)
        {
            temp = y;
            y = x;
            x = temp;
        }
        if (x > z)
        {
            temp = z;
            z = x;
            x = temp;
        }
        if (y > z)
        {
            temp = z;
            z = y;
            y = temp;
        }
        /**********end**********/
        System.out.print("x:" + x + " y:" + y + " z:" + z);

    }
}
