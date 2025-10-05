package lab2;

public class Main {
    public static void main(String[] args) {
        // Цилиндр
        cylinder clndr = new cylinder(10, 5);
        clndr.name = "Цилиндр";
        
        clndr.GetInfo();
        System.out.println("площадь поверхности: " + clndr.GetS());
        System.out.println("объем: " + clndr.GetV());

        // Шар 
        circle crcl = new circle();
        crcl.name = "\nШар";
        crcl.color = "черный";
        crcl.radius = 10;

        crcl.GetInfo();
        System.out.println("площадь поверхности: " + crcl.GetS());
        System.out.println("объем: " + crcl.GetV());

        // Параллелепипед
        square sqr = new square();
        sqr.name = "\nПараллелепипед";
        sqr.height = 10;
        sqr.weidth = 5;
        sqr.length = 1;

        sqr.GetInfo();
        System.out.println("площадь поверхности: " + sqr.GetS());
        System.out.println("объем: " + sqr.GetV() + "\n");
    }
}