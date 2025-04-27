public class Main {
    public static void main(String[] args) {
        // 创建两个矩形对象
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        // 输出第一个矩形的信息
        System.out.println("矩形1:");
        System.out.println("宽: " + rect1.getWidth());
        System.out.println("高: " + rect1.getHeight());
        System.out.println("面积: " + rect1.getArea());
        System.out.println("周长: " + rect1.getPerimeter());

        // 输出第二个矩形的信息
        System.out.println("\n矩形2:");
        System.out.println("宽: " + rect2.getWidth());
        System.out.println("高: " + rect2.getHeight());
        System.out.println("面积: " + rect2.getArea());
        System.out.println("周长: " + rect2.getPerimeter());
    }
}