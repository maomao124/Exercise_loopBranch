package t2;

import java.awt.*;

/**
 * Project name(项目名称)：练习_循环分支
 * Package(包名): t2
 * Class(类名): LianXi
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/11
 * Time(创建时间)： 20:30
 * Version(版本): 1.0
 * Description(描述)： 根据平台提供的四个小于10的正整数，将这些正整数组成互不相同三位数，将满足条件的三位数进行输出！
 */

public class LianXi
{
    public static void main(String[] args)
    {
        /*
         * 假设平台分配的四个整数为 1 2 3 4
         * 那么百位有可能是  1 2 3 4   十位：有可能是  1 2 3 4    个位：有可能是  1 2 3 4，
         * 要求是 百位 十位  各位上的数字不能重复
         * 比如：123  124  132  134 等都满足条件
         * 比如：122  131  121  232 等都不满足条件
         *
         * */

        //定义长度为4的int数组
        int[] array = new int[4];
        //创建Scanner对象获取平台输入的信息
        java.util.Scanner sc = new java.util.Scanner(System.in);
        //获取平台给定的输入值并填充至数组中
        for (int i = 0; i < array.length; i++)
        {
            //控制台输入变量:array[i]
            int errCount = 0;
            while (true)
            {
                try
                {
                    //min:0
                    //max:9
                    //System.out.print("请输入数字：");
                    array[i] = sc.nextInt();
                    if (array[i] >= 0 && array[i] <= 9)
                    {
                        break;
                    }
                    else
                    {
                        errCount++;
                        Toolkit.getDefaultToolkit().beep();
                        if (errCount > 10)
                        {
                            System.err.println("错误次数过多！！！退出");
                            System.exit(1);
                        }
                        System.out.println("输入的数据不在范围内! 范围：[0,9]");
                    }
                }
                catch (Exception e)
                {
                    errCount++;
                    if (errCount > 5)
                    {
                        Toolkit.getDefaultToolkit().beep();
                        System.err.println("错误次数过多！！！退出");
                        System.exit(1);
                    }
                    else
                    {
                        Toolkit.getDefaultToolkit().beep();
                        System.out.println("输入错误！！！请重新输入！");
                        sc.nextLine();
                    }
                }
            }
        }

        //通过第一层循环控制百位的数字    array[i]表示百位的值
        for (int i = 0; i < array.length; i++)
        {
            //通过第二层循环控制十位的数字    array[j]表示十位的值
            for (int j = 0; j < array.length; j++)
            {
                //通过第三层循环控制个位的数字   array[k]表示个位的值
                for (int k = 0; k < array.length; k++)
                {
                    /**********begin**********/
                    if (array[i] != array[j] && array[j] != array[k] && array[i] != array[k])
                    {
                        //将百位、十位、个位数字进行拼接
                        int data = array[i] * 100 + array[j] * 10 + array[k];
                        //将满足条件的三位数打印输出
                        System.out.println(data);
                    }
                    /**********end**********/
                }
            }
        }
    }
}
