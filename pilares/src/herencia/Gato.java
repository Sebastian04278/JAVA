public class Gato extends Animal {
    public Gato(String nombremascota, int edadmascota) {
        super(nombre, edad);
    }
    @Override
    public void hacerSonido() {
        System.out.println(nombremascota + " dice: Miau!");
    }
    public void ronronear() {
        System.out.println(nombremascota + " ronronea felizmente.");
    }
}
