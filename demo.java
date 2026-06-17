class calculator{

    public int add(){

        System.out.println("in add method");
        return 0;

    }
}

class Computer{

    public void musicPlayer(){

    System.out.println("music playing...");
    }

    public String getPen(int cost){

        System.out.println("cost of pen is " + cost);

        return "pen";
    }
}

class demo{
    public static void main(String[] args){

        int a = 10;
        int b = 20;

        int result = a % 2 == 1 ? b : 40;

        System.out.println(result);

        calculator cal = new calculator();
        cal.add();

        Computer com = new Computer();

        com.musicPlayer();

        String str = com.getPen(10);

        System.out.println("string return " + str);

        
    
    }
}