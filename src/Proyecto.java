public class Proyecto {
    private String nombre;
    private int progreso;
    private String responsable;
    private boolean terminado;

    //set


    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            System.out.println("El nombre no puede ser nulo ni estar vacio");
        } else {
            this.nombre = nombre;
        }
    }

    public void setProgreso(int progreso) {
        if (progreso >= 0 && progreso <= 100) {//cuando esta dentro del rango
            this.progreso = progreso;
        } else {
            System.out.println("El progreso debe estar entre 0 y 100");
        }
    }

    public void setResponsable(String responsable) {
        if (responsable == null || nombre.isBlank()) {
            System.out.println("El responsable no puede ser nulo ni estar vacio");
        } else {
            this.responsable = responsable;
        }
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    //get

    public String getNombre() {
        return nombre;
    }

    public int getProgreso() {
        return progreso;
    }

    public String getResponsable() {
        return responsable;
    }

    public boolean isTerminado() {
        return terminado;
    }

    public void avanzar(int porcentaje) {
        int nuevoProgreso = this.progreso + porcentaje;

        // Si al avanzar supera 100, lo dejamos exactamente en 100
        if (nuevoProgreso > 100) {
            this.progreso = 100;
        } else if (nuevoProgreso < 0) {
            this.progreso = 0;
        } else {
            this.progreso = nuevoProgreso;
        }
    }
}