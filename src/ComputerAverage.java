// 计算平均值的接口
public interface ComputerAverage { //接口
    public double average(double x[]);
}

// 主类，用于测试平均值计算
public class Estimator{
    public static void main(String args[]) {
        double a[] = {9.89, 9.88, 9.99, 9.12, 9.69, 9.76, 8.97};
        double b[] = {56, 55.5, 65, 50, 51.5, 53.6, 70, 49, 66, 62, 46};
        ComputerAverage computer;
        computer = new SongGame();
        double result = computer.average(a);
        System.out.printf("歌手最后得分: %5.3f\n", result);
        computer = new School();
        result = computer.average(b);
        System.out.printf("学生平均体重: %-5.2f kg",result);
    }
}

// 学校类，实现计算平均值的接口
public class School implements ComputerAverage {
    public double average(double[] x) {
        double sum = 0;
        for (double v : x) {
            sum += v;
        }
        double average = sum / x.length;
        return average;
    }
}

// 歌唱比赛类，实现计算平均值的接口
public class SongGame implements ComputerAverage {
    public double average(double x[]) {
        int count = x.length;
        double aver = 0, temp = 0;
        for (int i = 0; i < count; i++) {
            for (int j = i; j < count; j++) {
                if (x[j] < x[i]) {
                    temp = x[j];
                    x[j] = x[i];
                    x[i] = temp;
                }
            }
            for (int u = 1; u < count - 1; u++) {
                aver = aver + x[u];
            }
            if (count > 2)
                aver = aver / (count - 2);
            else
                aver = 0;
            return aver;
        }
    return aver;
    }
}

// 圆形类，继承几何图形类
public class Circle extends Geometry {
    double r;
    Circle(double r) {
        this.r = r;
    }
    public double getArea() {
        return Math.PI * r * r;
    }
}

// 几何图形的抽象类
public abstract class Geometry {
    public abstract double getArea();
}

// 主类，计算各种图形的总面积
public class MainClass {
    public static void main(String args[]) {
        Geometry[] tuxing = new Geometry[29];
        for (int i = 0; i < tuxing.length; i++) {
            if (i % 2 == 0)
                tuxing[i] = new Rect(16 + i, 68);
            else if (i % 2 == 1)
                tuxing[i] = new Circle(10 + i);
        }
        TotalArea computer = new TotalArea();
        computer.setTuxing(tuxing);
        System.out.printf("各种图形的面积之和:\n %f", computer.computerTotalArea());
    }
}

// 矩形类，继承几何图形类
public class Rect extends Geometry {
    double a, b;
    Rect(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double getArea() {
        return a * b;
    }
}

// 计算总面积的类
public class TotalArea {
    Geometry[] tuxing;
    double totalArea = 0;
    public void setTuxing(Geometry[] t) {
        tuxing = t;
    }
    public double computerTotalArea() {
        totalArea = 0;
        for (int i = 0; i < tuxing.length; i++) {
            totalArea += tuxing[i].getArea();
        }
        return totalArea;
    }
}

// 美国人类，继承人类
public class AmericanPeople extends People {
    public void speakHello() {
        System.out.println("How do you do");
    }
    public void averageHeight() {
        height = 176;
        System.out.println("American's average height:" + height + " cm");
    }
    public void averageWeight() {
        weight = 75;
        System.out.println("American's average weight:" + weight + " kg");
    }
    public void AmericanBoxing() {
        System.out.println("直拳、勾拳、组合拳");
    }
}
