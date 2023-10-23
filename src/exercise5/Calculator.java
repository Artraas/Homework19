package exercise5;

public class Calculator {
    double a;
    double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }
    double add(double a, double b){
        return a + b;
    }
    double sub(double a, double b){
        return a - b;
    }
    double mul(double a, double b){
        return a * b;
    }
    double div(double a, double b){
        Exception ex = new Exception();
        if (b == 0){
            try {
                throw ex;
            }catch (Exception e){
                System.out.println("Divaided by null");
                System.out.println(e.getMessage());
            }
        }
        return a / b;
    }
}
