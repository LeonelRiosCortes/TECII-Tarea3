public class Arbol {
    private String nombre;
    private String colorMadera;
    private String colorHojas;
    private int altura;
    private int grosor;

    public Arbol(){

    }

    public Arbol (String nombre, String colorMadera, String colorHojas, int altura, int grosor){
        this.nombre = nombre;
        this.colorHojas = colorHojas;
        this.colorMadera = colorMadera;
        this.altura = altura;
        this.grosor = grosor;
    }

    public void Crecer(){
    System.out.println("Estoy creciendo uwu");        
    }

    public void Moverhojas(){
        System.out.println("Toy bailando");
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }
    public int getGrosor() {
        return grosor;
    }

    public void setColorMadera(String colorMadera) {
        this.colorMadera = colorMadera;
    }
    public String getColorMadera() {
        return colorMadera;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }
    public String getColorHojas() {
        return colorHojas;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "Nombre='" + nombre + '\'' +
                " colorMadera='" + colorMadera + '\'' +
                " colorHojas='" + colorHojas + '\'' +
                " Altura='" + altura + '\'' +
                ", Grosor='" + grosor +
                '}' + "\n";
    }

}
