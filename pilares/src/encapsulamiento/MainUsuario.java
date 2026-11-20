public class MainUsuario {
    public static void main(String[] args) {
        Usuario u = new Usuario("carlos.dev", "clave1234");
        System.out.println("Usuario: " + u.getNombreUsuario());
        u.cambiarPassword("hola"); // Invalida
        System.out.println("Intento fallido 1? " + u.verificarPassword("otra1"));
        System.out.println("Intento fallido 2? " + u.verificarPassword("otra2"));
        System.out.println("Intento fallido 3? " + u.verificarPassword("otra3"));
        System.out.println("Login tras bloqueo? " + u.verificarPassword("clave1234"));
    }
}
