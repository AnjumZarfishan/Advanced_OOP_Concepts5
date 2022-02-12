import java.util.Objects;

/* TODO : Complete the Square class.
 Add variables if you need.
 Remember to use the @Override to override methods.
intelliJ will be helpful if you do).*/
public class Square extends Shape{
    private double side;

    public Square(double side, String name) {
        super(name);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null && !(o instanceof Square))
            return false;
        Square obj = (Square) o;
        if(this.side == obj.side
                && this.name.equals(obj.name))
            return true;

        return false;
    }

    @Override
    public String toString() {
        return this.name + ":" + this.side;
    }
}
