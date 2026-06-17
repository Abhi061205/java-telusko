class Human{
    private String name;
    private int age;

    public String getName(){

        return name;
    }

    public void setName(String n){

        name = n;
    }

    public int getAge(){

        return age;
    }
    public void setAge(int a){
        
        age = a;
    }
     
}

public class getSet{

    public static void main(String[] args){

        Human h = new Human();

        h.setName("abhi");
        h.setAge(20);

        System.out.println("name : "+ h.getName() + "  age "+ h.getAge());

    }
}
