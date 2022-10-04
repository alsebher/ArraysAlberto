/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import dominio.Persona;
import java.util.ArrayList;

/**
 *
 * @author Alumno Mañana
 */
public class TestArrays {
    static int [] listaNum = new int[4];
    static ArrayList<Persona> lista = new ArrayList<>();
    static Persona [][] matriPer = new Persona[2][2];
    public static void main(String[] args) {
        listaNum[0] = 2;
        listaNum[1] = 4;
        listaNum[2] = 6;
        listaNum[3] = 8;
        System.out.println("NUMEROS");
        for(int i=0;i<4;i++){
            System.out.println(listaNum[i]);
        }
        Persona p1 = new Persona("1A","Alberto","Sebasti",21);
        Persona p2 = new Persona("2B");
        Persona p3 = new Persona("3C","Anibal","Prieto",22);
        Persona p4 = new Persona("4D","Nico","Beltre",19);
        p2.setNombre("Elias");
        p2.setApellido("Alconz"); 
        p2.setEdad(20);
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        System.out.println("PERSONAS:");
        for(Persona i:lista){
            System.out.println(i.toString());
        }
        matriPer[0][0] = p1;
        matriPer[0][1] = p2;
        matriPer[1][0] = p3;
        matriPer[1][1] = p4;
        System.out.println("MATRIZ DE PERSONAS:");
        imprimir("empleados");
        System.out.println("");
        System.out.println("EDADES DE LOS EMPLEADOS: ");
        imprimir("edades");
                
    }
    public static void imprimir(String a){
        if(a.equalsIgnoreCase("edades")){
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    System.out.print("\t"+matriPer[i][j].getEdad());
                }
                System.out.println("");
            }
        }else{
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    System.out.print("\t"+matriPer[i][j].toString());
                }
                System.out.println("");
            }
        }
    }
}
