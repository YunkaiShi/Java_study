public class FindMess {
    public static void main(String args[]) {
        String mess = "书名:Java程序设计,出版时间:2011.10.01," +
                "出版社:清华大学出版社,价格:29.8元,页数:389页";

        // 判断mess中是否含有"程序"
        if(mess.contains("程序")) {
            System.out.println("图书信息包含\"程序\"");
        }

        // 获取出版日期
        int index = mess.indexOf(":", mess.indexOf(":") + 1); // 第2个冒号的位置
        String date = mess.substring(index + 1, index + 11);
        System.out.println(date);

        // 处理价格信息
        int pricePosition = mess.indexOf("价格");
        int endPosition = mess.indexOf("元");
        String priceMess = mess.substring(pricePosition + 3, endPosition);
        System.out.println("图书价格:" + priceMess);
        double price = Double.parseDouble(priceMess);
        if(price >= 29) {
            System.out.println("图书价格" + price + "大于或等于29元");
        } else {
            System.out.println("图书价格" + price + "小于29元");
        }

        // 处理页数信息
        index = mess.lastIndexOf(":");
        endPosition = mess.lastIndexOf("页");
        String pageMess = mess.substring(index + 1, endPosition);
        int p = Integer.parseInt(pageMess);
        if(p >= 360) {
            System.out.println("图书的页数" + p + "大于或等于360");
        } else {
            System.out.println("图书的页数" + p + "小于360");
        }
    }
}