public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() { this.target = new Calculator(); }

    @Override
    public int sum(int arg0, int arg1) {
        int summ = 0;
        //считаем через target
        return summ;
    }

    @Override
    public int mult(int arg0, int arg1) {
        int mult = 1;
        //считаем через target
        return mult;
    }

    @Override
    public int pow(int a, int b) {  // a в степень b
        int pow = 1;
        //считаем через target
        return pow;
    }
}