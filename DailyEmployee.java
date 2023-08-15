public class DailyEmployee extends Employee {
    private float dayPrice;
    private int dayNum;

    public DailyEmployee(String name, String dep, String email, float salary) {
        super(name, dep, email, salary);
        this.dayPrice= dayPrice;
        this.dayNum= dayNum;
    }


    public float getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(float dayPrice) {
        this.dayPrice = dayPrice;
    }


    public int getDayNum() {
        return dayNum;
    }

    public void setDayNum(int dayNum) {
        this.dayNum = dayNum;
    }



}
