package test;

public class Son extends Fa{
    public Son() {
        System.out.println();

    }
    public Son(String s){
        super("");
        System.out.println("son");
    }

    public static void main(String[] args) {
        float t=9.0f;
        int q=6;
        //System.out.println((t++)*(--q));

        System.out.println(t++);
        System.out.println(++q);
        char a = 'a';char b = 'b';
        int s = 's';
        System.out.println(s);
        short i = 10;
        int k = i + 2;
    }
}
