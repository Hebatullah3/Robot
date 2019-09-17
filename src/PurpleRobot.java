public class PurpleRobot extends Robot {

    PurpleRobot() {

    }

    PurpleRobot(String name, String eyesColor, int weight) {
        super(name, eyesColor, weight);
        // this.color = "Blue";
        ChangeColor("Purple");


    }

    //  int pow(int num) {
    //    return super.multiply(num, num);

    //}

    int pow(int num1, int num2) {
        return ((int) Math.pow(num1, num2));
    }

    public int calculate(int num1, int num2) {
        return pow(num1, num2);
    }
}


