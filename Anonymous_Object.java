class A{
    public A(){
        System.out.println("in constructor");
    }

    public void show(){
        System.out.println("in show method");
    }
}

public class Anonymous_Object {
    public static void main(String[] args){

        new A().show();
        new A().show();

    }
}
