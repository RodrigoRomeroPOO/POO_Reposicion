/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import main.Teclado;


public class AdminPaciente {
    
    BeanPaciente cab;//cabecera
    
    //2-constructor

    public AdminPaciente() {
        cab=null;
    }

    //3-metodo pila vacia
    
    public boolean pilaVacia(){
        return cab==null;//sin datos retorna un true
    }
    
    //4-metodo agregar datos a una pila
    public void agregarDatosPila(int numero, String DUI, String rut, String fecha, String nombre, String Status){
        
        //ptr=puntero
        //puch=ingreso de datos
        BeanPaciente ptr=new BeanPaciente(numero,DUI,rut,fecha,nombre,Status);
        ptr.siguiente=cab;
        cab=ptr;
        System.out.println("Nodo agregado a la pila/pacientes");
    }
    //5-metodo eliminar datos de una pila de modo natural
    //proceso de tipo POP
    //ptr=puntero=> es un nodo
    //cab=cabecera=>es un nodo
    
    public void eliminarNodoPacientes(){
        BeanPaciente ptr=cab;
        cab=cab.siguiente;
        ptr=null;
        System.out.println("Nodo eliminado correctamente");
    }
    
    public void imprimirPilaPaciente(){
        if(pilaVacia()){
            System.out.println("Pila no tiene nodos");  
        }else{
            BeanPaciente muestra=cab;
            do{
                System.out.println("\n\n-------------------------");
                System.out.println("Muestra: " +muestra.toString());
                muestra=muestra.siguiente;
            }while(muestra !=null);
        }
    }
    
    
    //Metodo para modificar datos y atender consulta
    public void editarPacientes(int nro){
        
        //Declarando variables
        
        int modi=0;
        int siga=1;
        String dato=null;
        
        if(pilaVacia()){
            System.out.println("Pila sin nodos");
        }else{
            BeanPaciente muestra=cab;
            do{
                if(muestra.getNumero()==nro){
                    System.out.println("\n\n-------------------------");
                    System.out.println("Muestra encontrada: " + muestra.toString());
                    while(siga==1){
                        System.out.println("\n\n-------------------------");
                        System.out.println("--Menu de opciones--");
                        System.out.println("1.-Modificar Fecha");
                        System.out.println("2.-Modificar Rut");
                        System.out.println("3-.Modificar DUI");
                        System.out.println("4-.Modificar Nombre");
                        System.out.println("5-.Modificar consulta");
                        System.out.println("\n\nIngrese una opcion");
                        modi=Teclado.datoint();
                        switch(modi){
                            case 1:
                                System.out.println("Fecha:");
                                dato=Teclado.dato();
                                muestra.setFecha(dato);
                                break;
                            case 2:
                                System.out.println("Rut:");
                                dato=Teclado.dato();
                                muestra.setRut(dato);
                                break;
                            case 3:
                                System.out.println("DUi:");
                                dato=Teclado.dato();
                                muestra.setDUI(dato);
                                break;
                            case 4:
                                System.out.println("Nombre:");
                                dato=Teclado.dato();
                                muestra.setNombre(dato);
                                break;
                            case 5:
                                System.out.println("Modificar asistencia Abierta/Atendida: ");
                                dato=Teclado.dato();
                                muestra.setStatus(dato);
                                break;
                                default:
                                    throw new AssertionError();
                        }
                        System.out.println("\n\n-------------------------");
                        System.out.println("Nodo modificado: " + muestra.toString());
                        System.out.println("--------------------------------------");
                        System.out.println("1.-Seguir modificando");
                        System.out.println("2.-Salir de modificar");
                        System.out.println("Ingrese opcion: ");
                        siga=Teclado.datoint();
                        
                                
                    }
                }
                muestra=muestra.siguiente;
            }while(muestra!=null);
        }
        
    }
    
    
    
}
