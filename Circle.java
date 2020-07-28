public class Circle extends Shape{
    //vars
    private double radius;
    private final double PI = Math.PI;
    //constructors
    Circle () {
        super();
        this.radius = 1;
    }
    
    Circle (double radius) {
        super();
        this.radius = radius;
    }
    //methods
    public double getRadius () {
        return this.radius;
    }
    
    public void setRadius (double radius) {
        this.radius = (radius > 0) ? radius : 1;
    }
    
    @Override
    public double getArea() {
        double area = Math.pow(this.radius, 2) * PI;
        return area;
    }
}
