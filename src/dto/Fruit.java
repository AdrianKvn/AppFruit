package dto;

/**
 * Clase Fruit
 * Nos permite crear un objeto tipo Fruta con sus respectivos atributos
 * @author Adrian Luengas
 */

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Fruit {
    public String name;
    private Float averageWeight;
    public ArrayList<String> colors = new ArrayList<>();
    public Float price;

    /**
     * Método que nos devuelve el nombre de la fruta
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Método que recibe como parametro el nombre de la fruta
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método que nos devuelve el peso de la fruta
     * @return
     */
    public Float getAverageWeight() {
        return averageWeight;
    }

    /**
     * Este método recibe como parametro el peso de la fruta
     * @param averageWeight
     */
    public void setAverageWeight(Float averageWeight) {
        this.averageWeight = averageWeight;
    }

    /**
     * Este método nos devuelve una lista de colores
     * @return
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Este método nos devuelve el precio de la fruta
     * @return
     */
    public Float getPrice() {
        return price;
    }

    /**
     * Este método nos recibe como parametro el precio de la fruta
     * @param price
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * Este método nos recibe como parametro un arrays de colores
     * @param colors
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    /**
     * En este método mostramos la información completa del objeto tipo Fruta
     */
    public void sell(){
        System.out.println("Fruta comprada "+this.getName()+" el peso es "+this.averageWeight+
                "g, el color es la fruta es "+this.getColors()+" Valor a pagar es $"+cost(this.averageWeight)+" USD");
    }

    /**
     * En este método calculamos el valor a pagar por la fruta, recibimos el peso de la fruta como parametro
     * @param averageWeight y devolvemos el valor a pagar dando formato a el valor tomando 2 decimales
     * @return
     */
    public String cost(Float averageWeight){
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return  decimalFormat.format(price*averageWeight);
    }

}
