package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Main {
    public static void main(String[] args) {
   try {
//      ObjectMapper para leer archivos
       ObjectMapper on = new ObjectMapper();
       Highschool federica = on.readValue(
               new File(Main.class.getResource("/instituto.json").toURI()),
               Highschool.class);

       System.out.println(federica.toString());
       System.out.println("Estudiantes");
       for (Student student : federica.getEstudiantes()){
           System.out.println(student.toString());
       }
   }catch (Exception e){
       e.printStackTrace();
   }

    }
}