public class User {
    private double actualWeight;
    private String firstName;
    private String lastName;
    private double bodyFrame;
    private double age;
    private double height;
    private String gender;
    private double BMIScore;
    private double idealWeight;
    private String weightStatus;
    Calculator calculator;

    public User(){
        this.calculator = new Calculator();
    }


    public double getBMIScore() {
        this.BMIScore = calculator.calculateBMI(this.height, this.actualWeight);

        return BMIScore;
    }

    public double getIdealWeight() {
        this.idealWeight = calculator.calculateIdealWeight(this.bodyFrame , this.height*100 , this.age);

        return idealWeight;
    }

    public String getWeightStatus() {
        this.weightStatus = calculator.calculateWeightStatus(BMIScore);
        return weightStatus;
    }

    public void setActualWeight(double actualWeight) {
        this.actualWeight = actualWeight;
    }
    public void setAge(double age) {
        this.age = age;
    }

    public void setBodyFrame(String bodyFrame) {
        switch (bodyFrame) {
            case "Small" -> this.bodyFrame = 0.9;
            case "Medium" -> this.bodyFrame = 1.0;
            case "Large" -> this.bodyFrame = 1.1;
        }
    }
    public void setGender(String gender) {
        this.gender = gender;

    }

    public void setHeight(double height) {
        this.height = height / 100;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;

    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }
}
