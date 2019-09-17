class BlueRobot extends Robot {

    BlueRobot() {
    }

    BlueRobot(String name, String eyesColor, int weight) {
        super(name, eyesColor, weight);
        // this.color = "Blue";
        ChangeColor("Brown");

    }

    public int multiply(int num1, int num2) {

        return num1 * num2;

    }

    public int calculate(int num1, int num2) {
        return multiply(num1, num2);
    }

    public void introduce() {

        System.out.println("Hey, I am a  BlueRobot! I know how to multiply integers.");
        super.introduce();


    }

}
