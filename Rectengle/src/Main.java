public class TestRectangle {
    public static void main(String[] args) {
        // 创建两个矩形对象
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        // 显示第一个矩形的信息
        System.out.println("矩形1:");
        System.out.println("宽度: " + rectangle1.getWidth());
        System.out.println("高度: " + rectangle1.getHeight());
        System.out.println("面积: " + rectangle1.getArea());
        System.out.println("周长: " + rectangle1.getPerimeter());

        System.out.println(); // 空行分隔

        // 显示第二个矩形的信息
        System.out.println("矩形2:");
        System.out.println("宽度: " + rectangle2.getWidth());
        System.out.println("高度: " + rectangle2.getHeight());
        System.out.println("面积: " + rectangle2.getArea());
        System.out.println("周长: " + rectangle2.getPerimeter());
    }
}