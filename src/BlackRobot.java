public class BlackRobot extends Robot {

    BlackRobot(String name, String eyesColor, int weight) {
        super(name, eyesColor, weight);

    }


    int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int calculate(int num1, int num2) {
        return sub(num1, num2);
    }

}
