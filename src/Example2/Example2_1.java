package Example2;
//用类型转换显示一些字符在Unicode表中的位置

public class Example2_1 {
    public static void main(String[] args) {
        char chinaWord ='好',japanWordd = '$';
        char you = '\u4F60';
        int position = 20320;
        System.out.println("汉字："+chinaWord+"的位置："+(int)chinaWord);
        System.out.println(position +"位置上的字符是："+(char)position);
        System.out.println("you:"+you);
        System.out.println("test");


    }

}
