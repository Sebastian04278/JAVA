public class Animal {
    protected String nombremascota;
    protected int edadmascota;
    public Animal(String nombremascota, int edadmascota) {
        this.nombremascota = nombremascota;
        this.edadmascota = edadmascota;
    }
    public void comer() {
        System.out.println(nombremascota + " esta comiendo.");
    }
    public void dormir() {
        System.out.println(nombremascota + " esta durmiendo.");
    }
    public void hacerSonido() {
        System.out.println(nombremascota + " emite un sonido.");
    }
}
