public class Rectangle {
    private double width;
    private double height;

    // 无参构造方法，默认宽高为1
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    // 带参构造方法
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 计算面积
    public double getArea() {
        return width * height;
    }

    // 计算周长
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // getter 和 setter 方法
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
