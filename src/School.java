public class School implements ComputerAverage {
    public double average(double[] x) { //定义一个方法average,用于计算数组元素的算术平均值
        double sum = 0; //定义一个变量sum,用于存储数组元素的和
        for (double v : x) { //遍历数组元素
            sum += v; //将数组元素的和加到sum变量中
        }
        double average = sum / x.length; //计算数组元素的算术平均值
        return average; //返回数组元素的算术平均值
    }

    //重写 public double average(double x[])方法,返回数组 x[]的元素的算术平均值
}