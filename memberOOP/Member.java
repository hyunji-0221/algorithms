package memberOOP;

public class Member {
    private String userName;
    private String password;
    private String passwordCheck;
    private String name;
    private String rrn;
    private String pNum;
    private String address;
    private String job;

    //Person에서 가져온 필드
    private double height;
    private double weight;

    //kaup지수에서 사용하는 생성자
    public Member(double height,double weight){
        this.height = height;
        this.weight = weight;
    }


    //회원가입에서 사용하는 생성자
    public Member(String userName, String password, String passwordChecks,
                  String name, String rrn, String pNum, String address, String job){
        this.userName = userName;
        this.password = password;
        this.passwordCheck = passwordChecks;
        this.name = name;
        this.rrn = rrn;
        this.pNum = pNum;
        this.address = address;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Member{" +
                "userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", rrn='" + rrn + '\'' +
                ", pNum='" + pNum + '\'' +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPasswordCheck(String passwordCheck) {
        this.passwordCheck = passwordCheck;
    }

    public String getPasswordCheck() {
        return this.passwordCheck;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setRrn(String rrn) {
        this.rrn = rrn;
    }

    public String getRrn() {
        return this.rrn;
    }

    public void setPNum(String pNum) {
        this.pNum = pNum;
    }

    public String getPNum() {
        return this.pNum;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return this.job;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}
