package t3;

import java.awt.*;

/**
 * Project name(项目名称)：练习_循环分支
 * Package(包名): t3
 * Class(类名): ShiXinSanJiaoXing
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/11
 * Time(创建时间)： 20:40
 * Version(版本): 1.0
 * Description(描述)： 编写一个利用for循环打印实心三角形的小程序。
 */

public class ShiXinSanJiaoXing
{
    public static void main(String[] args)
    {
        //创建Scanner对象用于获取平台给定的输入信息
        java.util.Scanner input = new java.util.Scanner(System.in);
        //定义需要打印的总行数
        int lineNum;
        //控制台输入变量:lineNum
        int errCount = 0;
        while (true)
        {
            try
            {
                //min:0
                //max:1000
                System.out.print("请输入：");
                lineNum = input.nextInt();
                if (lineNum >= 0 && lineNum <= 1000)
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
                    System.out.println("输入的数据不在范围内! 范围：[0,1000]");
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
                    input.nextLine();
                }
            }
        }
		/*
		 i（行号）      空格数量（lineNum－i）　   星星数量 （２＊i　－１）
			1                    5                      1
			2                    4                      3
			3                    3                      5
			4                    2                      7
			5                    1                      9
			6                    0                      11
		*/

        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        //通过外循环控制需要打印的行数
        for (int i = 1; i <= lineNum; i++)
        {
            for (int j = 1; j <= lineNum - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print("*");
            }
            //当前行中的空格以及星星打印完成之后进行换行操作 \n表示换行
            System.out.println();
        }
        System.out.println();
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
             double final_runtime;
             final_runtime = (endTime - startTime);
             final_runtime = final_runtime / 1000;
             System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
         }
        else
        {
             double final_runtime;
             final_runtime = (endTime - startTime) / 10000;
             final_runtime = final_runtime / 100000;
             System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
    }
}
