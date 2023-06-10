public class Calculator {
    private double BMI;
    private double idealWeight;
    private String WeightStatus;


    public double calculateBMI(double height , double actualWeight){
        this.BMI = actualWeight / (height * height);

        return this.BMI;
    }

    public double calculateIdealWeight(double bodyFrame , double height , double age){
        this.idealWeight = (height - 100 + (age / 10)) * 0.9 * bodyFrame;
        System.out.println(height);
        System.out.println(age);
        System.out.println(bodyFrame);
        return idealWeight;
    }

    public String calculateWeightStatus(double BMI){
        if (BMI < 15){
            return this.WeightStatus = "Anorexic";
        }
        if (BMI >= 15 && BMI < 18.5){
            return this.WeightStatus = "Underweight";
        }
        if (BMI >= 18.5 && BMI < 24.9){
            return this.WeightStatus = "Normal";
        }
        if (BMI >= 24.9 && BMI < 29.9){
            return this.WeightStatus = "Overweight";
        }
        if (BMI >= 29.9 && BMI < 35){
            return this.WeightStatus = "Obese";
        }
        if (BMI >= 35){
            return this.WeightStatus = "Extreme Obese";
        }
        this.WeightStatus = "invalid";
        return this.WeightStatus;
    }



}
