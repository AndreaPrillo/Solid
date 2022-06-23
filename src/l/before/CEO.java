package l.before;

public class CEO extends Employee implements AssignManager {



    @Override
    public void calculatePerHourRate(int rank) {
        double baseAmount = 150;

        salary = baseAmount * rank;
    }

    public void fireSomeone() {
        System.out.println("You're Fired!");
    }

    @Override
    public void assignManager(Employee manager) {
        throw new UnsupportedOperationException("This CEO has no manager");
    }
}
