public class Square extends Shape {
     //vars
    private double side;
    //constructors
    Square () {
        super();
        this.side = 1;
    }
    
    Square (double side) {
        super();
        this.side = side;
    }
    //methods
    public double getRadius () {
        return this.side;
    }
    
    public void setRadius (double side) {
        this.side = (side > 0) ? side : 1;
    }
    
    @Override
    public double getArea() {
        double area = Math.pow(side, 2);
        return area;
    }
}
