package cn.zhu.four;

import java.util.Scanner;

/**
 * @ClassName FeiBo
 * @Description TODO
 * @Author Lenovo
 * @Date 2021/9/4 22:34
 * @Version 1.0
 **/
public class FeiBo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要求得斐波那契数：");
        System.out.println("yang commit"); 
        System.out.println("hhhhhcreeper"); 
        int i = scanner.nextInt();
        int s = fn(i);
        System.out.println(s);
        System.out.println(s);
    }

    private static int fn(int n) {
        if (n==0 || n==1){
            return n;
        }
        else {
            int a = 0,b=1;
            for(int i = 1;i<n;i++){
                b= a+b;
                a= b-a;
                b%=1000000007;
            }
            return b;
        }
    }
}
