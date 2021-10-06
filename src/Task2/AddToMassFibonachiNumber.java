package Task2;

public class AddToMassFibonachiNumber {
    public void addFibonachiToMass(int[] mass) {
        int num1 = 0;
        int num2 = 1;
        mass[0] = num1;
        mass[1] = num2;


        for (int i = 2; i < 12; i++) {
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            mass[i] = num3;

        }
    }
}