public class Cylinder extends Circle{
    double height;

    public Cylinder() {
    }

    public Cylinder(double radius, double height,String color ) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume(){
        double area = super.getArea();
        return area*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +super.toString()+
                '}';
    }
}
