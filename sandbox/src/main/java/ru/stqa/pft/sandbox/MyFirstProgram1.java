package ru.stqa.pft.sandbox;


class MyFirstProgram1 {
    public static void main(String args[]) {
       hello("world");
       hello("viktor");
       hello("anna");
       double l=5;
       double a=4;
       double b=6;
        System.out.println("площадь квадрата со стороной "+l+ " равна"+area(l));
        System.out.println("площадь прямоугольника равна "+area(a,b));


    }
    public static void hello(String somebody){
        System.out.println("Hello "+somebody);
    }
    public static double area(double Len){
        return Len*Len;

    }
    public static double area(double a,double b){
        return a*b;
    }

}
