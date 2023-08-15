public class SalariedEmployee extends Employee{
    float bonus;

    public SalariedEmployee(String name, String dep, String email, float salary, float bonus) {
        super(name, dep, email, salary);
        /*
        this.name= name;
        this.dep= dep;
        this.email= email;
        this.salary= salary;
        */
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

//        @Override
//    public float getSalary() {
//        return super.getSalary();
//    }
}
