class Human{
    private String name;
    private int age;

    public Human(){
        this .age = 111;
    }

    public Human(int age , String name){
        this.age = age;
        this.name = name;
    }
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
        Human h1 = new Human(10 , "donnn");

        // h.setName("abhi");
        // h.setAge(20);

        //System.out.println("name : "+ h.getName() + "  age "+ h.getAge());
        System.out.println("name : "+ h1.getName() + "  age "+ h1.getAge());

    }
}
