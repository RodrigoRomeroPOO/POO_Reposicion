package Clases;

public class BeanPaciente {

    public int numero;
    public String DUI;
    public String rut;
    public String fecha;
    public String nombre;
    public String Status;
    public BeanPaciente siguiente;

    public BeanPaciente() {
    }

    //constructor sobrecargado
    public BeanPaciente(int numero, String DUI, String rut, String fecha, String nombre, String Status, BeanPaciente siguiente) {
        this.numero = numero;
        this.DUI = DUI;
        this.rut = rut;
        this.fecha = fecha;
        this.nombre = nombre;
        this.Status = Status;
        this.siguiente = siguiente;
    }

    public BeanPaciente(int numero, String DUI, String rut, String fecha, String nombre, String Status) {
        this.numero = numero;
        this.DUI = DUI;
        this.rut = rut;
        this.fecha = fecha;
        this.nombre = nombre;
        this.Status = Status;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public BeanPaciente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(BeanPaciente siguiente) {
        this.siguiente = siguiente;
    }

    //toString
    //usado para la muestra de los datos en la pantalla
    //metodo customizado par amejor lectura de datos
    @Override
    public String toString() {
        return "\n\n--Lista de paciente--"
                + "----------------------------------------"
                + "\nNumero: " + numero
                + "\nIdentificacion paciente: " + DUI
                + "\nCodigo paciente: " + rut
                + "\nFecha: " + fecha
                + "\nNombre paciente: " + nombre
                + "\nStatus: " + Status
                + "\nSiguiente: " + siguiente;
    }

}
