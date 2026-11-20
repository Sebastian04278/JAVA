public class Usuario {
    private String nombreUsuario;
    private String password; // Nunca tendra getter publico
    private int intentosFallidos;
    private boolean bloqueado;
    public Usuario(String nombreUsuario, String passwordInicial) {
        this.nombreUsuario = nombreUsuario;
        cambiarPassword(passwordInicial);
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void cambiarPassword(String nueva) {
        if (esPasswordValida(nueva)) {
            this.password = nueva;
            System.out.println("Contrasena actualizada correctamente.");
        } else {
            System.out.println("Contrasena invalida: min 8 caracteres " +
                    "y al menos un numero.");
        }
    }
    public boolean verificarPassword(String intento) {
        if (bloqueado) {
            return false;
        }
        boolean correcta = this.password != null && this.password.equals(intento);
        if (!correcta) {
            intentosFallidos++;
            if (intentosFallidos >= 3) {
                bloqueado = true;
                System.out.println("Cuenta bloqueada por intentos fallidos.");
            }
        }
        return correcta;
    }
    private boolean esPasswordValida(String pass) {
        if (pass == null || pass.length() < 8) return false;
        for (char c : pass.toCharArray()) {
            if (Character.isDigit(c)) return true;
        }
        return false;
    }
}
