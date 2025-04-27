public class Main {
    public static void main(String[] args) {
        // 创建 Stock 对象
        Stock stock = new Stock("ORCL", "Oracle Corporation");

        // 设置前一日收盘价和当前价格
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);

        // 计算并输出百分比变化
        double percentChange = stock.getChangePercent();
        System.out.printf("股票代码: %s\n股票名称: %s\n", stock.getSymbol(), stock.getName());
        System.out.printf("前一日收盘价: %.2f\n当前价格: %.2f\n", stock.getPreviousClosingPrice(), stock.getCurrentPrice());
        System.out.printf("市值变化百分比: %.2f%%", percentChange);
    }
}
