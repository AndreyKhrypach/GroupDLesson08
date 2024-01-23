public class User {
    //public
    //protected
    //default
    //private
    public String name;
    public int age;
    public String profession;
    public boolean sex;
    public User(String name, int age, String profession, boolean sex) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.sex = sex;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                ", sex=" + (sex ? "male" : "female") +
                '}';
    }
}
