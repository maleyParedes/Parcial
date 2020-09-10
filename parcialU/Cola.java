import java.util.Scanner;

public class Cola {

    Nodo primero;
    Nodo ultimo;
    Scanner teclado = new Scanner(System.in);

    public Cola() {
        primero = null;
        ultimo = null;
    }

    public void insertarNodo() {
        Nodo nuevo = new Nodo();
        System.out.println("Nombre");
        nuevo.nombre = teclado.next();

        System.out.println("Apellido");
        nuevo.apellido = teclado.next();

        System.out.println("Cedula");
        nuevo.cedula = Integer.parseInt(teclado.next());

        System.out.println("Horas trabajadas");
        nuevo.hT = Integer.parseInt(teclado.next());

        if (primero == null) {

            primero = nuevo;
            primero.siguiente = null;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = null;
            ultimo = nuevo;
        }
        System.out.println("Nodo ingresado");
    }

    public void buscarNodo() {
        Nodo actual = new Nodo();
        actual = primero;
        boolean encontrado = false;
        System.out.print("Ingrese la cedula de la persona que desea buscar: ");
        int nodoBuscado = teclado.nextInt();
        if (primero != null) {
            while (actual != null && encontrado != true) {
                if (actual.cedula == nodoBuscado) {
                    System.out.println("Busqueda exitosa:\nNombres y Apellidos: " + actual.nombre + " "
                            + actual.apellido + "\nCedula:" + actual.cedula + "\nHoras Trabajadas" + actual.hT);
                    encontrado = true;
                }
                actual = actual.siguiente;
            }
            if (!encontrado) {
                System.out.println("Persona no encontrada\n");
            }
        } else {
            System.out.println("La cola está vacia\n");
        }
    }

    public void eliminarNodo(){
        
    }

    public void mostrarCola() {
        Nodo actual = new Nodo();
        actual = primero;
        if (primero != null) {
            while (actual != null) {
                System.out.println("Nombres y Apellidos: " + actual.nombre + " " + actual.apellido + "\nCedula:"
                        + actual.cedula + "\nHoras Trabajadas" + actual.hT);
                actual = actual.siguiente;
            }
        } else {
            System.out.println("La cola está vacia");
        }

    }
}