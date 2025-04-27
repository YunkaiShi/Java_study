public class Rectangle {
    private double width = 1.0;
    private double height = 1.0;

    // 无参构造方法
    public Rectangle() {}

    // 带参数的构造方法
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 获取宽度
    public double getWidth() {
        return width;
    }

    // 获取高度
    public double getHeight() {
        return height;
    }

    // 计算面积
    public double getArea() {
        return width * height;
    }

    // 计算周长
    public double getPerimeter() {
        return 2 * (width + height);
    }
}