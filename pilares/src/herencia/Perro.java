public class Perro extends Animal {
    public Perro(String nombremascota, int edadmascota) {
        super(nombremascota, edadmascota); // Llama al constructor del padre
    }
    @Override
    public void hacerSonido() {
        System.out.println(nombremascota + " dice: Guau guau!");
    }
    public void perseguirCola() {
        System.out.println(nombremascota + " persigue su cola.");
    }
}
