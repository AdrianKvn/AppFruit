package dto;


import java.text.DecimalFormat;
import java.util.ArrayList;

public class Fruit {
    public String name;
    private Float averageWeight;
    public ArrayList<String> colors = new ArrayList<>();
    public Float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(Float averageWeight) {
        this.averageWeight = averageWeight;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    public void sell(){
        System.out.println("Fruta comprada "+this.getName()+" el peso es "+this.averageWeight+
                "g, el color es la fruta es "+this.getColors()+" Valor a pagar es $"+cost(this.averageWeight)+" USD");
    }

    public String cost(Float averageWeight){
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return  decimalFormat.format(price*averageWeight);
    }

}
