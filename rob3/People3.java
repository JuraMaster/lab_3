package lab.rob3;

import lab.rob2.People2;

public class People3 {

    public People2 people2;

    public People3(People2 people2) {
        this.people2 = people2;
    }

    private double salary() {
        return people2.people.salary();
    }

    private int age (int age) {
        return people2.people.age(age);
    }

    private void moveInfo() {
        people2.moreInfo();
    }

    private double bonus() {
        return people2.bonus();
    }

    public double getBonus() {
        return bonus();
    }

    public void getMoveInfo() {
        moveInfo();
    }

    public int getAge (int age) {
        return age(age);
    }

    public double getSalary() {
        return salary();
    }


}
