package md.kalkulator_grid_layout;

public class Dzialania {
    private float num1, num2, result;

    public void setNum1(float num1) {
        this.num1 = num1;
        System.err.println(""+num1);
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
    
    public void dodawanie(){
        result=num1+num2;
    }
    
    public void odejmowanie(){
        result=num1-num2;
    }
    
    public void mnozenie(){
        result=num1*num2;
    }
    
    public void dzielenie(){
        result=num1/num2;
    }
    
    public float getResult() {
        return result;
    }
}
