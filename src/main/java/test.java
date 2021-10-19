import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Project name(项目名称)：使用linkedlist实现栈和队列
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/19
 * Time(创建时间)： 20:32
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        System.out.println("1.栈    2.队列    3.退出");
        System.out.print("请输入序号：");
        char n = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            n = (char) br.read();
            char c;
            c=(char)br.read();   //清掉\n
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        if (n == '1')
        {
            Stack.main();
        }
        else if (n == '2')
        {
            queue.main();
        }
        else if (n != '3')
        {
            System.out.println("输入错误！！！自动退出！！！");
        }
    }
}
