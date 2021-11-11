package t4;

import java.awt.*;
import java.util.InputMismatchException;

/**
 * Project name(项目名称)：练习_循环分支
 * Package(包名): t4
 * Class(类名): FindZhiShu
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/11
 * Time(创建时间)： 20:48
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class FindZhiShu
{
    public static void printPrime(int num)
    {
        boolean[] isPrimes = new boolean[num + 1];
        for (int i = 2; i < isPrimes.length; i++)
        {
            isPrimes[i] = true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (isPrimes[i] == true)
            {
                for (int j = 2; i * j <= num; j++)
                {
                    isPrimes[i * j] = false;
                }
            }
        }

        System.out.println("质数有: ");
        for (int i = 2; i < isPrimes.length; i++)
        {
            if (isPrimes[i])
            {
                System.out.print(i + " ");
            }
        }
        /*
        System.out.println("");
        System.out.print("非质数有: ");
        for (int i = 2; i < isPrimes.length; i++)
        {
            if (!isPrimes[i])
            {
                System.out.print(i + " ");
            }
        }

         */
    }

    public static void main(String[] args)
    {
		   /*
		     打印输出质数的时候务必按照如下格式：System.out.print(质数+" ")；
		     使用print进行打印同时被打印输出的质数后加上一个空格，
		     以便于与平台提供的结果格式保持一致！
            */
        /**********begin**********/
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        if (args.length == 0)
        {
            printPrime(1000);
        }
        else
        {
            try
            {
                printPrime(Integer.parseInt(args[0]));
            }
            catch (InputMismatchException e)
            {
                Toolkit.getDefaultToolkit().beep();
                System.out.println("参数异常！！！参数应该为一个数字");
            }
            catch (Exception e)
            {
                Toolkit.getDefaultToolkit().beep();
                System.out.println("参数异常！！！");
            }
        }
        System.out.println();
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

        /**********end**********/
    }
}
