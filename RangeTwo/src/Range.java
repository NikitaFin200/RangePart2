public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {   // конструктор для заполнения полей
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getLength() {
        return to - from;
    }

    public boolean isInside(double number) {
        return number >= from && number <= to;
    }

    public double[] interval(double from1, double to1, double from2, double to2) {
        if (from2 >= from1 && from2 <= to1) {
            double[] mas = new double[2];
            mas[0] = from2;
            mas[1] = to1;
        }
    }
}
