

public class Asiento {
    
    private int precio = 0;
    private String material = "Tela";
    private String color = "Rojo";
    private boolean reclinables = true; 
    private int fila = 0;

    public Asiento(){

        
    }

    public Asiento(int fila, int precio){
        this.fila = fila;
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }

    public void setPrecio(int fila) {
        
    }
    public int getPrecio() {
        return precio;
    }

    public void setReclinables(boolean reclinables) {
        this.reclinables = reclinables;
    }
    public boolean getReclinables(){
        return reclinables;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }
    public int getFila() {
        return fila;
    }

    @Override
    public String toString() {
        return "Asiento{" + precio +
                "}";
    }




    /* 
    @Override
    public String toString() {
        return "Asiento{" +
                "Precio='" + precio + '\'' +
                " Material='" + material + '\'' +
                " Color='" + color + '\'' +
                " Fila='" + fila + '\'' +
                ", Reclinable='" + reclinables +
                '}' + "\n";
    }*/

}
