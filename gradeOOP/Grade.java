package gradeOOP;

public class Grade {
    private String name;
    private int kor;
    private int eng;
    private int math;
    private double avg;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setKor(int kor){
        this.kor = kor;
    }
    public int getKor(){
        return this.kor;
    }

    public void setEng(int eng){
        this.eng = eng;
    }
    public int getEng(){
        return this.eng;
    }

    public void setMath(int math){
        this.math = math;
    }
    public int getMath(){
        return this.math;
    }

    public double getAvg(){
        return this.avg;
    }
    public int createRandomScore(){
        int randomScore = 0;
        return randomScore = (int)(Math.random() * 100);
    }

    public void createAvg(){
        double avg = 0;
        this.avg = (double)(kor+eng+math)/3.0;
    }
}
