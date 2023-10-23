package exercise2;

class Worker implements Comparable<Worker> {
    String name;
    String position;
    int yearOfEmployment;

    public Worker(String name, String position, Integer yearOfEmployment) {
        this.name = name;
        this.position = position;
        this.yearOfEmployment = yearOfEmployment;
    }

    public Worker() {

    }

    @Override
    public String toString() {
        return "exercise2.Worker{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    @Override
    public int compareTo(Worker o) {
        return name.compareTo(o.name);
    }
}
