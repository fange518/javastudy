package Example2;

import java.util.Arrays;

public class Example2_4 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int b[] = {100,200,300};
        System.out.println("����a��Ԫ�ظ�����"+a.length);
        System.out.println("����b��Ԫ�ظ�����"+b.length);
        System.out.println("����a�����ã�"+ a);
        System.out.println("����b�����ã�"+ b);
        a = b;
        System.out.println("����a��Ԫ�ظ�����"+a.length);
        System.out.println("����b��Ԫ�ظ�����"+b.length);
        System.out.println("a[0]="+a[0]+",a[1]"+a[1]+",a[2]"+a[2]);
        System.out.println("b[0]="+b[0]+",b[1]="+b[1]+",b[2]="+b[2]);

    }
}
