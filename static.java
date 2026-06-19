class mobile{

    String brand;
    int price;
    static String name;
    
    public void show(){
        System.out.println("brand is " + brand + " price is " + price + " name is " + name);

    }

    public static void show1 (mobile obj){
        System.out.println("this is static method");
        System.out.println(obj.brand+" : "+ obj.price +" : "+obj.name);
    }
}
class Static {
    public static void main(String[] args){

        mobile obj1 = new mobile();
        obj1.brand = "apple";
        obj1.price = 1000;
        obj1.name = "iPhone";

        mobile obj2 = new mobile();
        obj2.brand = "samsumg";
        obj2.price = 2100;
        obj2.name = "galaxy";

        obj1.show();
        obj2.show();

        mobile.show1(obj1);


    }    
}
