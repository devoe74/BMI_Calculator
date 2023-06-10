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
    Calculator calculator = new Calculator();
    public User(){

    }

//
//    public double getActualWeight() {
//        return actualWeight;
//    }
//
//    public double getAge() {
//        return age;
//    }
//
//    public double getBodyFrame() {
//        return bodyFrame;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public int getHeight() {
//        return height;
//    }


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

    public double getHeight() {
        return height;
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
//    double actualWeight , String firstName , String lastName , int bodyFrame , double age , int height , int gender
//    this.actualWeight = actualWeight;
//        this.firstName = firstName;
//        this.bodyFrame = bodyFrame;
//        this.lastName = lastName;
//        this.height = height;
//        this.age = age;
//        this.gender = gender;