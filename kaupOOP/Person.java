package kaupOOP;

public class Person {
    private String name;
    private double height;
    private double weight;
    private double bmi;
    private String bodyMass;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getBmi() {
        return this.bmi;
    }

    public String getBodyMass() {
        return this.bodyMass;
    }

    public void createBMI() {
        double bmi = 0.0;
        bmi = weight/((height*0.01)*(height*0.01));
        this.bmi = bmi;
    }
    public void createBodyMass() {
        String bodyMass = "";
        if(this.bmi>25){
            bodyMass = "비만";
        }else if(this.bmi>23){
            bodyMass = "과체중";
        }else if(this.bmi>18.5){
            bodyMass = "정상";
        }else{
            bodyMass="저체중";
        }
        this.bodyMass = bodyMass;
    }
    public double createRandomWeight(){
        double weight=0;
        weight = Math.random() * 69 + 30;
        return weight;
    }
    public double createRandomHeight(){
        double height=0;
        height = (Math.random() * 50 + 150);
        return height;
    }
}
