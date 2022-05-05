package web.models;

public class Car {
    private String model;
    private int year;
    private boolean isActual;

    @Override
    public String toString() {
        return "Car model is: " + model + ", car year is: " + year + ", car isActual: " + isActual;
    }

    public Car(String model, int year, boolean isActual) {
        this.model = model;
        this.year = year;
        this.isActual = isActual;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isActual() {
        return isActual;
    }

    public void setActual(boolean actual) {
        isActual = actual;
    }
}
