package Static_NonStatic;

public class BaseClase {
    static int staticVar = 10;
     int nonStaticVar = 20;

    public static void main(String[] args) {
        BaseClase baseClase1 = new BaseClase();BaseClase baseClase2 = new BaseClase();BaseClase baseClase3 = new BaseClase();

        System.out.println("Base Class 1");
        baseClase1.nonStaticMethod();
        //11 //20 -> osama //11 //20 -> esraa //10 //21 -> mustafa
        System.out.println("Base Class 2");
        baseClase2.nonStaticMethod();
        //12 //20 -> osama //11 //20 -> esraa //10 //21 -> mustafa
        System.out.println("Base Class 3");
        baseClase3.nonStaticMethod();
        //13 //20 -> osama //11 //20 -> esraa //10 //21 -> mustafa

    }

    public  void nonStaticMethod(){
        staticVar++;
        nonStaticVar++;
        System.out.println("static Variable :- "+staticVar);
        System.out.println("static Variable :- "+nonStaticVar);
    }

}
