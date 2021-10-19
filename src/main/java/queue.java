import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Project name(项目名称)：使用linkedlist实现栈和队列
 * Package(包名): PACKAGE_NAME
 * Class(类名): queue
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/19
 * Time(创建时间)： 20:24
 * Version(版本): 1.0
 * Description(描述)： 使用linkedlist实现队列
 */

public class queue implements linkedlist
{
    private LinkedList<Character> p = new LinkedList<Character>();
    private final long startTime = System.nanoTime();

    @Override
    public char pop()
    {
        if (p.isEmpty())
        {
            System.out.println("队空！！！");
            return '\0';
        }
        else
        {
            char c;
            c = p.getFirst();
            p.removeFirst();
            return c;
        }
    }

    @Override
    public void push(char c)
    {
        p.addLast(c);
    }

    @Override
    public void display()
    {
        System.out.println("全部元素如下：");
        for (char c : p)
        {
            System.out.print(c + " ");
        }
        System.out.print("      -----长度为" + p.size());
        System.out.println();
    }

    @Override
    public void exit_the_system()
    {
        System.out.println("感谢使用！！！");
        System.out.println();
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
        System.exit(1);
    }

    public static void main(String... args)
    {
        queue qu = new queue();
        System.out.println("----队列-----");
        char n = '0';
        while (true)
        {
            System.out.println("1.进队   2.出队   3.显示   4.退出");
            System.out.print("请输入序号：");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try
            {
                n = (char) br.read();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            if (n == '1')
            {
                System.out.print("请输入要进栈的字符：");
                char c1 = '\0';
                try
                {
                    c1 = (char) br.read();
                    c1 = (char) br.read();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                qu.push(c1);
            }
            else if (n == '2')
            {
                char c3 = '\0';
                c3 = qu.pop();
                if (c3 != '\0')
                {
                    System.out.println("出队元素：" + c3);
                }
            }
            else if (n == '3')
            {
                qu.display();
            }
            else if (n == '4')
            {
                qu.exit_the_system();
            }
            else
            {
                System.out.println("输入错误！！！ 自动退出");
                qu.exit_the_system();
            }
        }
    }
}
