package entities;

public class Rectangle {

    public double width;
    public double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return width + width + height + height;
    }

    public double diagonal() {
        double diagonalRectangle = Math.sqrt(Math.pow(2, width) + Math.pow(2, height));

        return Math.ceil(diagonalRectangle);
    }
}
