public class Main { 
    
    private String nombre;
    private int cantidadSatelites;
    private double masa;
    private double volumen;
    private int diametro;
    private double distanciaSol;
    private boolean observable;

    
    public Main(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, double distanciaSol, boolean observable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.observable = observable;
    }

    
    public double calcularDensidad() {
        return masa / volumen;
    }

    
    public void imprimirValores() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadSatelites);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Volumen: " + volumen + " km^3");
        System.out.println("Diámetro: " + diametro + " km");
        System.out.println("Distancia al sol: " + distanciaSol + " km");
        System.out.println("Observable: " + observable);
        System.out.println("Densidad: " + calcularDensidad() + " kg/km^3");
    }

    
    public static void main(String[] args) {
        
        Main p1 = new Main("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, true);
        Main p2 = new Main("Jupiter", 79, 1.899E27, 1.4313E15, 139820, 750000000, true);

        
        System.out.println("Planeta 1:");
        p1.imprimirValores();

        System.out.println("\nPlaneta 2:");
        p2.imprimirValores();
    }
}