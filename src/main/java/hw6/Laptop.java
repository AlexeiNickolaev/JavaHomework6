package hw6;

public class Laptop {
    private String brand;
    private double screenSize;
    private int ramSize;
    private int ssdSize;
    private String color;

    // Конструктор класса
    public Laptop(String brand, double screenSize, int ramSize, int ssdSize, String color) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.ramSize = ramSize;
        this.ssdSize = ssdSize;
        this.color = color;
    }

    // Геттеры и сеттеры для полей
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getSsdSize() {
        return ssdSize;
    }

    public void setSsdSize(int ssdSize) {
        this.ssdSize = ssdSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Метод, возвращающий информацию о ноутбуке
    public String getInfo() {
        return "Производитель: " + this.brand + ", Диагональ экрана: " + this.screenSize + ", Оперативная память: "
                + this.ramSize + "GB, SSD: " + this.ssdSize + "GB, Цвет: " + this.color;
    }
}



