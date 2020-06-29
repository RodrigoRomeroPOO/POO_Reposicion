//Clase que administra procesos C.R.U.D  de la estructura pila
package main;

import Clases.*;
import javax.swing.JOptionPane;

/**
 *
 * @author fernando
 */
public class ControlPaciente {

    public static void main(String[] args) {
        AdminPaciente admin = new AdminPaciente();
        int op = 0;
        int nro = 0;
        String fecha;
        String dui;
        String rut;
        String nombre;
        String status;
        String estado="Emergencia";
        String estado2="Atendido";
        String estado3="Abierta";
        BeanPaciente paciente=new BeanPaciente();

        //menu de control
        do {
            
            System.out.println("\n\n---------------");
            System.out.println("--Menu de control--");
            System.out.println("\n1.-Ingresar datos");
            System.out.println("2.-Atender pacientes y modificar");
            System.out.println("3.-Eliminar datos");
            System.out.println("4.-Listar los datos");
            System.out.println("\n\nIngrese una opcion");
            op = Teclado.datoint();

            switch (op) {
                case 1:
                    System.out.println("\n\n--------------");
                    System.out.println("--Ingresar datos--");
                    System.out.println("-------------------");
                    System.out.println("Ingrese numero: ");
                    nro = Teclado.datoint();
                    System.out.println("Ingrese fecha: ");
                    fecha = Teclado.dato();
                    System.out.println("Ingrese dui: ");
                    dui = Teclado.dato();
                    System.out.println("Ingrese rut del paciente: ");
                    rut = Teclado.dato();
                    System.out.println("Ingrese el nombre: ");
                    nombre = Teclado.dato();
                    System.out.println("Tipo consulta llamada/emergencia: ");
                    status = Teclado.dato();
                    if(status.equalsIgnoreCase(estado)){
                        JOptionPane.showMessageDialog(null, "Paciente Atendido");
                        admin.agregarDatosPila(nro, dui, rut, fecha, nombre, estado2);
                    }else{
                        JOptionPane.showMessageDialog(null, "Paciente debe esperar");
                        admin.agregarDatosPila(nro, dui, rut, fecha, nombre, estado3);
                        
                    }
                    

                    
                    System.out.println("Datos almacenados");
                    break;
                case 2:
                    System.out.println("\n\n----------------");
                    System.out.println("--Edicion de datos--");
                    System.out.println("--------------------");
                    System.out.println("Numero: ");
                    nro = Teclado.datoint();
                    //Llamar funcion editarPAcientes refactorizando codigo
                    admin.editarPacientes(nro);
                    break;
                case 3:
                    System.out.println("\n\n--------------");
                    System.out.println("--Eliminar datos--");
                    System.out.println("-------------------");
                    System.out.println("Ingrese numero a eliminar");
                    admin.eliminarNodoPacientes();
                    break;
                case 4:
                    System.out.println("\n\n----------------");
                    System.out.println("--Listar los datos--");
                    System.out.println("--------------------");
                    admin.imprimirPilaPaciente();
                    break;
                case 5:
                    System.out.println("\n\n----------------");
                    System.out.println("Saliendo del sistema");
                default:
                    System.out.println("\n\n-----------");
                    System.out.println("Opcion invalida");
            }

        } while (op != 5);
        System.out.println(0);

    }

}
