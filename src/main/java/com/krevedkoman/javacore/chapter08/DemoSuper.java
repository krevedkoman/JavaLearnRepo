package main.java.com.krevedkoman.javacore.chapter08;
class Box1{
    private double width;
    private double height;
    private double depth;

    Box1(Box1 ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box1(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    Box1(){
        width = -1;
        height = -1;
        depth = -1;
    }

    Box1(double len){
        width = height = depth = len;
    }
    double volume(){
        return width*height*depth;
    }

}

class BoxWeight1 extends Box1{
    double weight;
    BoxWeight1(BoxWeight1 ob){
        super(ob);
        weight = ob.weight;
    }
    BoxWeight1(double w, double h, double d, double m){
        super(w,h,d);
        weight = m;
    }
    BoxWeight1(){
        super();
        weight = -1;
    }
    BoxWeight1(double len, double m){
        super(len);
        weight = m;
    }
}


public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight1 mybox1 = new BoxWeight1(10,20,15,34.3);
        BoxWeight1 mybox2 = new BoxWeight1(2,3,4,0.076);
        BoxWeight1 mybox3 = new BoxWeight1();
        BoxWeight1 mycube = new BoxWeight1(3,2);
        BoxWeight1 myclone = new BoxWeight1(mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Объем mybox3 равен " + vol);
        System.out.println("Вес mybox3 равен " + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Объем myclone равен " + vol);
        System.out.println("Вес myclone равен " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
        System.out.println("Вес mycube равен " + mycube.weight);
        System.out.println();

    }
}
