package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }

    public void runHashMap() {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("001", "Celular");
        mapa.put("002", "Laptop");
        mapa.put("003", "Celular");
        mapa.put("003", "PC"); // Put o agrega o actualiza la key con otro valor nuevo

        System.out.println("IMPRIMIR EL MAPA CON CLAVE-VALOR");
        System.out.println(mapa);
        System.out.println("IMPRIMIR EL MAPA CON LA CLAVE");
        System.out.println(mapa.keySet());

        System.out.println("IMPRIMIR TODOS LOS ELEMENTOS SEGUN LAS CLAVES CON UN FOREACH");
        for (String claveMapa : mapa.keySet()) {
            System.out.println(mapa.get(claveMapa));
        }
        System.out.println();
        System.out.println("IMPRIMIR UN ELEMENTO SEGUN SU CLAVE");
        System.out.println(mapa.get("001"));
        System.out.println(mapa.get("005"));
    }

    public void runLinkedHashMap() {
        Map<Integer, String> mapaLinked = new LinkedHashMap<>();

        mapaLinked.put(1, "Mateo");
        mapaLinked.put(2, "Ariel");
        mapaLinked.put(3, "Daniel");
        mapaLinked.put(4, "Michael");
        mapaLinked.put(5, "Andres");

        System.out.println("IMPRIMIR UN ELEMENTO SEGUN SU CLAVE");
        System.out.println(mapaLinked.values());

    }

    public void runTreeMap() {
        Map<Integer, String> items = new TreeMap<>();

        items.put(3, "carro");
        items.put(6, "bicicleta");
        items.put(1, "moto");

        System.out.println(items.values());

    }

    public void runHashMapObj() {
        Map<Empleado, Integer> empleados = new HashMap<>();
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Juan", "Dev"), 2500);
        empleados.put(new Empleado(1, "Diego", "Dev"), 3000);
        System.out.println();
        System.out.println(empleados);
    }

    public void runTreeMapObj() {
        Map<Empleado, Integer> empleados = new TreeMap<>();
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Diego", "Dev"), 1200);
        empleados.put(new Empleado(1, "Juan", "Senior"), 3000);
        System.out.println(empleados);
    }

}
