import java.util.Arrays;

import javax.swing.JFrame;

import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDAOTreeMap;
import controllers.EmpleadoDao;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Mateo Cordero"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        // runMapExamlpe();
        // runEmpleadoExample();
        runEjerccios();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        // runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        // runEjerccios();
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        System.out.println();
        System.out.println("--IMPLEMENTACION DE HASMAP--");
        mapa.runHashMap();
        System.out.println();
        System.out.println("--IMPLEMENTACION DE LINKEDHASMAP--");
        mapa.runLinkedHashMap();
        System.out.println();
        System.out.println("--IMPLEMENTACION DE TREEMAP--");
        mapa.runTreeMap();
        System.out.println();
        System.out.println("--IMPLEMENTACION DE HASHMAP CON OBJETOS--");
        mapa.runHashMapObj();
        System.out.println();
        System.out.println("--IMPLEMENTACION DE TREEMAP CON OBJETOS--");
        mapa.runTreeMapObj();
        System.out.println();
    }

    private static void runEmpleadoExample() {
        EmpleadoDao empDaoHash = new EmpleadoDAOHashMap();
        EmpleadoContoller empControllerHash = new EmpleadoContoller(empDaoHash);
        EmpleadoDao empDaoTree = new EmpleadoDAOTreeMap();
        EmpleadoContoller empControllerTree = new EmpleadoContoller(empDaoTree);

        Empleado emp1 = new Empleado(4, "Pedro", "DEV");
        Empleado emp2 = new Empleado(2, "Pedro", "DEV");
        Empleado emp3 = new Empleado(5, "Juan", "DEV");
        Empleado emp4 = new Empleado(3, "Maria", "DEV");
        Empleado emp5 = new Empleado(1, "Juan", "DEV");

        empControllerHash.agregarEmpleado(emp1);
        empControllerHash.agregarEmpleado(emp2);
        empControllerHash.agregarEmpleado(emp3);
        empControllerHash.agregarEmpleado(emp4);
        empControllerHash.agregarEmpleado(emp5);
        empControllerTree.agregarEmpleado(emp1);
        empControllerTree.agregarEmpleado(emp2);
        empControllerTree.agregarEmpleado(emp3);
        empControllerTree.agregarEmpleado(emp4);
        empControllerTree.agregarEmpleado(emp5);

        System.out.println();
        System.out.println("--LISTADO DE EMPLEADOS USANDO MAPHASHCODE--");
        empControllerHash.listarEmps();
        System.out.println("!Se removio el empleado id(2)! OSEA SE ELIMINO A --> " + emp2);
        empControllerHash.removerEmps(2);
        empControllerHash.listarEmps();
        System.out.println();
        System.out.println("--LISTADO DE EMPLEADOS USANDO TREEMAP--");
        empControllerTree.listarEmps();
        System.out.println("!Se removio el empleado id(2)! OSEA SE ELIMINO A --> " + emp2);
        empControllerTree.removerEmps(2);
        empControllerTree.listarEmps();

    }

    private static void runEjerccios() {
        Ejercicios ejercicios = new Ejercicios();
        System.out.println();
        System.out.println("--AREANAGRAMAS--");
        System.out.println("Ejemplos de uso: ");
        System.out.println("listen vs silent: " + Ejercicios.areAnagrams("listen", "silent"));
        System.out.println("hello vs bello: " + Ejercicios.areAnagrams("hello", "bello"));
        System.out.println("triangle vs integral: " + Ejercicios.areAnagrams("triangle", "integral"));
        System.out.println();

        System.out.println("--SUMATORIA DE DOS--");
        System.out.println("Ejemplos de uso: ");
        int[] nums1 = { 9, 2, 3, 6 };
        int objetivo1 = 5;
        int[] resultado1 = ejercicios.sumatoriaDeDos(nums1, objetivo1);
        System.out.println("nums = [9,2,3,6], objetivo = 5 -> " + Arrays.toString(resultado1));

        int objetivo2 = 10;
        int[] resultado2 = ejercicios.sumatoriaDeDos(nums1, objetivo2);
        System.out.println("nums = [9,2,3,6], objetivo = 10 -> " + Arrays.toString(resultado2));
        System.out.println();

        System.out.println("--CONTAR CARACTERES--");
        System.out.println("Ejemplos de uso: ");
        String texto = "hola";
        System.out.print("Texto: \"" + texto + "\" -> ");
        ejercicios.contarCaracteres(texto);
        System.out.println();

        System.out.println("--SON ANAGRAMAS--");
        System.out.println("Ejemplos de uso: ");
        System.out.println("roma vs amor: " + ejercicios.sonAnagramas("roma", "amor"));
        System.out.println();

    }

}
