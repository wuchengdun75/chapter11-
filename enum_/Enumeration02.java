package enum_;

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season9.AUTUMN);
        System.out.println(Season9.SPRING);
    }
}

class Season9 {
    private String name;
    private String desc;

    public static final Season9 SPRING = new Season9("春天", "温暖");
    public static final Season9 WINTER = new Season9("冬天", "寒冷");
    public static final Season9 AUTUMN = new Season9("秋天", "凉爽");
    public static final Season9 SUMMER = new Season9("夏天", "炎热");

    private Season9(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season9{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}