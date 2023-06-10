public class Calculator {

    public double calculateBMI(double height , double actualWeight){
        return actualWeight / (height * height);
    }

    public double calculateIdealWeight(double bodyFrame , double height , double age){
        double idealWeight = (height - 100 + (age / 10)) * 0.9 * bodyFrame;
        System.out.println(height);
        System.out.println(age);
        System.out.println(bodyFrame);
        return idealWeight;
    }

    public String calculateWeightStatus(double BMI){
        String weightStatus;
        if (BMI < 15){
            return weightStatus = "Anorexic";
        }
        if (BMI >= 15 && BMI < 18.5){
            return weightStatus = "Underweight";
        }
        if (BMI >= 18.5 && BMI < 24.9){
            return weightStatus = "Normal";
        }
        if (BMI >= 24.9 && BMI < 29.9){
            return weightStatus = "Overweight";
        }
        if (BMI >= 29.9 && BMI < 35){
            return weightStatus = "Obese";
        }
        if (BMI >= 35){
            return weightStatus = "Extreme Obese";
        }
        weightStatus = "invalid";
        return weightStatus;
    }


}
