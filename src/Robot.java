
class Robot {

    int weight;
    String name;
    private String color;
    String eyesColor;


    Robot() {
        this.name = "Berlin";
        this.color = "yellow";
    }

    Robot(String name, String color, String eyesColor, int weight) {
        // this(name, eyesColor);
        this.name = name;
        this.eyesColor = eyesColor;
        this.color = color;
        this.weight = weight;
    }

    Robot(String name) {
        this.name = name;
    }

    Robot(String name, String eyesColor) {
        this.name = name;
        this.eyesColor = eyesColor;
    }

    Robot(String name, String eyeColor, int weight) {
        this.name = name;
        this.eyesColor = eyeColor;
        this.weight = weight;

    }


    void introduce() {

        System.out.println("Hello! My name is " + this.name + ", I am " + this.color + ", I have "
                + this.eyesColor + " eyes and I weight " + this.weight + " kilograms");

    }


    public void ChangeColor(String NewColor) {
        this.color = NewColor;
    }


    public int calculate(int num1, int num2) {
        return 0;
    }

    void fly(int des) {
        System.out.println("the robot " + this.name + " can fly des: " + des + " m");
    }

    void run(int des) {
        System.out.println("the robot " + this.name + " can run des: " + des + " m");
    }

    void swim(int des) {
        System.out.println("the robot " + this.name + " can swim des: " + des + " m");
    }


}




