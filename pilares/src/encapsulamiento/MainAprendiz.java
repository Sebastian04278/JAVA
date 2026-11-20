public class MainAprendiz {
    public static void main(String[] args) {
        Aprendiz a = new Aprendiz("1090123456", "Laura Gomez");
        a.setEdad(19);
        a.setNotaFinal(4.2);
        a.setNotaFinal(7.0); // Invalido - sera rechazado por la clase
        a.setCorreoInstitucional("laura.ejemplo.com"); // Invalido - no contiene @
        a.setCorreoInstitucional("laura@institucion.edu.co"); // Valido
        System.out.println("Aprendiz: " + a.getNombre());
        System.out.println("Correo institucional: " + a.getCorreoInstitucional());
        System.out.println("Edad: " + a.getEdad());
        System.out.println("Nota: " + a.getNotaFinal());
        System.out.println("Aprobo? " + (a.aprobo() ? "Si" : "No"));
    }
}
