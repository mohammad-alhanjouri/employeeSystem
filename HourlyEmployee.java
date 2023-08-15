public class HourlyEmployee extends Employee{
    private float hrPrice;
    private int hrsNum;

    public HourlyEmployee(String name, String dep, String email, float salary) {
        super(name, dep, email, salary);
        this.hrPrice= hrPrice;
        this.hrsNum= hrsNum;

    }

    public float getHrPrice() {
        return hrPrice;
    }

    public void setHrPrice(float hrPrice) {
        this.hrPrice = hrPrice;
    }

    public int getHrsNum() {
        return hrsNum;
    }

    public void setHrsNum(int hrsNum) {
        this.hrsNum = hrsNum;
    }
}
