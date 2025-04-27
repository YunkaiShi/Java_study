public class SongGame implements ComputerAverage {
    public double average(double x[]) {
        int count = x.length;
        double aver = 0, temp = 0;
        for (int i = 0; i < count; i++) {
            for (int j = i; j < count; j++) {
                if (x[j] < x[i]) {
                    temp = x[j];
                    x[j] = x[i];

//后续片段
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