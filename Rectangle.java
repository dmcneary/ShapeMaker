public class Rectangle extends Shape {  
    //vars
    private double length, width;
    //constructors
    Rectangle () {
        super();
        this.length = 1;
        this.width = 2;
    }
    
    Rectangle (double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }
    //methods
    public double getLength () {
        return this.length;
    }
    
    public void setLength (double length) {
        this.length = (length > 0) ? length : 1;
    }
    
    public double getWidth () {
        return this.width;
    }
    
    public void setWidth (double width) {
        this.width = (width > 0) ? width : 1;
    }
    
    @Override
    public double getArea() {
        double area = length * width;
        return area;
    }
}
