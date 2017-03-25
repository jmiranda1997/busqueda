/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jdk.nashorn.internal.ir.CatchNode;

/**
 *
 * @author USUARIO
 */
public class Archivos extends Thread{
    private Pattern ER;
    private Matcher evaluador;
    public static final String SEPARADOR = System.getProperty("file.separator");
    public static final String CARPETA_PRINCIPAL =  System.getProperty("user.home")+ SEPARADOR +"archivos";
    public static final String IA = CARPETA_PRINCIPAL+SEPARADOR+"IA.txt";
    public static final String IB = CARPETA_PRINCIPAL+SEPARADOR+"IB.txt";
    public static final String IC = CARPETA_PRINCIPAL+SEPARADOR+"IC.txt";
    public static final String ID = CARPETA_PRINCIPAL+SEPARADOR+"ID.txt";
    public static final String IE = CARPETA_PRINCIPAL+SEPARADOR+"IE.txt";
    public static final String IF = CARPETA_PRINCIPAL+SEPARADOR+"IF.txt";
    public static final String IG = CARPETA_PRINCIPAL+SEPARADOR+"IG.txt";
    public static final String IH = CARPETA_PRINCIPAL+SEPARADOR+"IH.txt";
    public static final String II = CARPETA_PRINCIPAL+SEPARADOR+"II.txt";
    public static final String IJ = CARPETA_PRINCIPAL+SEPARADOR+"IJ.txt";
    public static final String IK = CARPETA_PRINCIPAL+SEPARADOR+"IK.txt";
    public static final String IL = CARPETA_PRINCIPAL+SEPARADOR+"IL.txt";
    public static final String IM = CARPETA_PRINCIPAL+SEPARADOR+"IM.txt";
    public static final String IN = CARPETA_PRINCIPAL+SEPARADOR+"IN.txt";
    public static final String IÑ = CARPETA_PRINCIPAL+SEPARADOR+"IÑ.txt";
    public static final String IO = CARPETA_PRINCIPAL+SEPARADOR+"IO.txt";
    public static final String IP = CARPETA_PRINCIPAL+SEPARADOR+"IP.txt";
    public static final String IQ = CARPETA_PRINCIPAL+SEPARADOR+"IQ.txt";
    public static final String IR = CARPETA_PRINCIPAL+SEPARADOR+"IR.txt";
    public static final String IS = CARPETA_PRINCIPAL+SEPARADOR+"IS.txt";
    public static final String IT = CARPETA_PRINCIPAL+SEPARADOR+"IT.txt";
    public static final String IU = CARPETA_PRINCIPAL+SEPARADOR+"IU.txt";
    public static final String IV = CARPETA_PRINCIPAL+SEPARADOR+"IV.txt";
    public static final String IW = CARPETA_PRINCIPAL+SEPARADOR+"IW.txt";
    public static final String IX = CARPETA_PRINCIPAL+SEPARADOR+"IX.txt";
    public static final String IY = CARPETA_PRINCIPAL+SEPARADOR+"IY.txt";
    public static final String IZ = CARPETA_PRINCIPAL+SEPARADOR+"IZ.txt";
    public static final String FA = CARPETA_PRINCIPAL+SEPARADOR+"FA.txt";
    public static final String FB = CARPETA_PRINCIPAL+SEPARADOR+"FB.txt";
    public static final String FC = CARPETA_PRINCIPAL+SEPARADOR+"FC.txt";
    public static final String FD = CARPETA_PRINCIPAL+SEPARADOR+"FD.txt";
    public static final String FE = CARPETA_PRINCIPAL+SEPARADOR+"FE.txt";
    public static final String FF = CARPETA_PRINCIPAL+SEPARADOR+"FF.txt";
    public static final String FG = CARPETA_PRINCIPAL+SEPARADOR+"FG.txt";
    public static final String FH = CARPETA_PRINCIPAL+SEPARADOR+"FH.txt";
    public static final String FI = CARPETA_PRINCIPAL+SEPARADOR+"FI.txt";
    public static final String FJ = CARPETA_PRINCIPAL+SEPARADOR+"FJ.txt";
    public static final String FK = CARPETA_PRINCIPAL+SEPARADOR+"FK.txt";
    public static final String FL = CARPETA_PRINCIPAL+SEPARADOR+"FL.txt";
    public static final String FM = CARPETA_PRINCIPAL+SEPARADOR+"FM.txt";
    public static final String FN = CARPETA_PRINCIPAL+SEPARADOR+"FN.txt";
    public static final String FÑ = CARPETA_PRINCIPAL+SEPARADOR+"FÑ.txt";
    public static final String FO = CARPETA_PRINCIPAL+SEPARADOR+"FO.txt";
    public static final String FP = CARPETA_PRINCIPAL+SEPARADOR+"FP.txt";
    public static final String FQ = CARPETA_PRINCIPAL+SEPARADOR+"FQ.txt";
    public static final String FR = CARPETA_PRINCIPAL+SEPARADOR+"FR.txt";
    public static final String FS = CARPETA_PRINCIPAL+SEPARADOR+"FS.txt";
    public static final String FT = CARPETA_PRINCIPAL+SEPARADOR+"FT.txt";
    public static final String FU = CARPETA_PRINCIPAL+SEPARADOR+"FU.txt";
    public static final String FV = CARPETA_PRINCIPAL+SEPARADOR+"FV.txt";
    public static final String FW = CARPETA_PRINCIPAL+SEPARADOR+"FW.txt";
    public static final String FX = CARPETA_PRINCIPAL+SEPARADOR+"FX.txt";
    public static final String FY = CARPETA_PRINCIPAL+SEPARADOR+"FY.txt";
    public static final String FZ = CARPETA_PRINCIPAL+SEPARADOR+"FZ.txt";

    public Archivos() throws IOException {
     File princi = new File(CARPETA_PRINCIPAL);
     princi.mkdir();
//     File principal = new File(IA);
//     principal.createNewFile();
//     principal = new File(IB);
//     principal.createNewFile();
//     principal = new File(IC);
//     principal.createNewFile();
//     principal = new File(ID);
//     principal.createNewFile();
//     principal = new File(IE);
//     principal.mkdir();
//     principal = new File(IF);
//     principal.mkdir();
//     principal = new File(IG);
//     principal.mkdir();
//     principal = new File(IH);
//     principal.mkdir();
//     principal = new File(II);
//     principal.mkdir();
//     principal = new File(IJ);
//     principal.mkdir();
//     principal = new File(IK);
//     principal.mkdir();
//     principal = new File(IL);
//     principal.mkdir();
//     principal = new File(IM);
//     principal.mkdir();
//     principal = new File(IN);
//     principal.mkdir();
//     principal = new File(IÑ);
//     principal.mkdir();
//     principal = new File(IO);
//     principal.mkdir();
//     principal = new File(IP);
//     principal.mkdir();
//     principal = new File(IQ);
//     principal.mkdir();
//     principal = new File(IR);
//     principal.mkdir();
//     principal = new File(IS);
//     principal.mkdir();
//     principal = new File(IT);
//     principal.mkdir();
//     principal = new File(IU);
//     principal.mkdir();
//     principal = new File(IV);
//     principal.mkdir();
//     principal = new File(IW);
//     principal.mkdir();
//     principal = new File(IX);
//     principal.mkdir();
//     principal = new File(IY);
//     principal.mkdir();
//     principal = new File(IZ);
//     principal.mkdir();
     
     
     
    }
    
    public void run(){
        File inicio = new File("C:\\");
        buscar_archivos(inicio);
    }
    
    
    private void buscar_archivos(File archivo){
       try{
           System.out.println("entro");
        String nombreArchivo = archivo.getName();
           System.out.println(nombreArchivo);
      //  evaluador = ER.matcher(nombreArchivo);
        System.out.println(archivo.isDirectory());
           inicializar(nombreArchivo, archivo.getAbsolutePath());
           
        if(archivo.isDirectory()) {
        File[] subdirectorio = archivo.listFiles();
        for (File subdirectorio1 : subdirectorio) {
        buscar_archivos(subdirectorio1);
       }
      }
    }
     catch (Exception e){}
    
    }
    public void inicializar(String nombre,String Ruta) throws IOException{
        try{
        int a=0;
        System.out.println(Ruta);
        String letra_inicial = nombre.substring(0,1);
        System.out.println(letra_inicial);
        File archivo;
        FileWriter ruta;
        BufferedWriter escritor;
        switch(letra_inicial){
            case ("a"):
                archivo = new File(IA);
                ruta = new FileWriter(archivo,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                System.out.println("entro a");
                escritor.close();
                ruta.close();
                break;
            case ("A"):
                archivo = new File(IA);
                ruta = new FileWriter(archivo,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                System.out.println("entro a");
                escritor.close();
                ruta.close();
                break;
            case ("b"):
                archivo = new File(IB);
                ruta = new FileWriter(archivo,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                System.out.println("entro b");
                break;
            case ("B"):
                ruta = new FileWriter(IB,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                System.out.println("entro b");
                break;
            case ("c"):
                ruta = new FileWriter(IC,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                System.out.println("entro c");
                break;
            case ("C"):
                ruta = new FileWriter(IC,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                System.out.println("entro c");
                break;
            case ("d"):
                ruta = new FileWriter(ID,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("D"):
                ruta = new FileWriter(ID,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("e"):
                ruta = new FileWriter(IE,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("E"):
                ruta = new FileWriter(IE,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("f"):
                ruta = new FileWriter(IF,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("F"):
                ruta = new FileWriter(IF,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("g"):
                ruta = new FileWriter(IG,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("G"):
                ruta = new FileWriter(IG,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("h"):
                ruta = new FileWriter(IH,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("H"):
                ruta = new FileWriter(IH,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("i"):
                ruta = new FileWriter(II,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("I"):
                ruta = new FileWriter(II,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("j"):
                ruta = new FileWriter(IJ,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("J"):
                ruta = new FileWriter(IJ,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("k"):
                ruta = new FileWriter(IK,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("K"):
                ruta = new FileWriter(IK,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("l"):
                ruta = new FileWriter(IL,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("L"):
                ruta = new FileWriter(IL,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("m"):
                ruta = new FileWriter(IM,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("M"):
                ruta = new FileWriter(IM,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("n"):
                ruta = new FileWriter(IN,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("N"):
                ruta = new FileWriter(IN,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("ñ"):
                ruta = new FileWriter(IÑ,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("Ñ"):
                ruta = new FileWriter(IÑ,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("o"):
                ruta = new FileWriter(IO,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("O"):
                ruta = new FileWriter(IO,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;   
            case ("p"):
                ruta = new FileWriter(IP,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("P"):
                ruta = new FileWriter(IP,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;    
            case ("q"):
                ruta = new FileWriter(IQ,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("Q"):
                ruta = new FileWriter(IQ,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("r"):
                ruta = new FileWriter(IR,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("R"):
                ruta = new FileWriter(IR,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("s"):
                ruta = new FileWriter(IS,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("S"):
                ruta = new FileWriter(IS,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("t"):
                ruta = new FileWriter(IT,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("T"):
                ruta = new FileWriter(IT,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("u"):
                ruta = new FileWriter(IU,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("U"):
                ruta = new FileWriter(IU,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("v"):
                ruta = new FileWriter(IV,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("V"):
                ruta = new FileWriter(IV,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;    
            case ("w"):
                ruta = new FileWriter(IW,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("W"):
                ruta = new FileWriter(IW,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("x"):
                ruta = new FileWriter(IX,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("X"):
                ruta = new FileWriter(IX,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("y"):
                ruta = new FileWriter(IY,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("Y"):
                ruta = new FileWriter(IY,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("z"):
                ruta = new FileWriter(IZ,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("Z"):
                ruta = new FileWriter(IZ,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
                
            default: break;    
        } 
        }catch(Exception e){}
    }
     public void finalizar_1(String nombre,String Ruta) throws IOException{
        int a=0;
        System.out.println(Ruta);
        int tamaño = nombre.length();
        String letra_inicial = nombre.substring(tamaño-1,tamaño);
        System.out.println(letra_inicial);
        File archivo;
        FileWriter ruta;
        BufferedWriter escritor;
        switch(letra_inicial){
            case ("a"):
                archivo = new File(FA);
                ruta = new FileWriter(archivo,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                System.out.println("entro a");
                escritor.close();
                ruta.close();
                break;
            case ("A"):
                archivo = new File(FA);
                ruta = new FileWriter(archivo,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                System.out.println("entro a");
                escritor.close();
                ruta.close();
                break;
            case ("b"):
                archivo = new File(FB);
                ruta = new FileWriter(archivo,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                System.out.println("entro b");
                break;
            case ("B"):
                ruta = new FileWriter(FB,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                System.out.println("entro b");
                break;
            case ("c"):
                ruta = new FileWriter(FC,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                System.out.println("entro c");
                break;
            case ("C"):
                ruta = new FileWriter(FC,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                System.out.println("entro c");
                break;
            case ("d"):
                ruta = new FileWriter(FD,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("D"):
                ruta = new FileWriter(FD,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("e"):
                ruta = new FileWriter(FE,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("E"):
                ruta = new FileWriter(FE,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("f"):
                ruta = new FileWriter(FF,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("F"):
                ruta = new FileWriter(FF,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("g"):
                ruta = new FileWriter(FG,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("G"):
                ruta = new FileWriter(FG,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("h"):
                ruta = new FileWriter(FH,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("H"):
                ruta = new FileWriter(FH,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("i"):
                ruta = new FileWriter(FI,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("I"):
                ruta = new FileWriter(FI,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("j"):
                ruta = new FileWriter(FJ,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("J"):
                ruta = new FileWriter(FJ,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("k"):
                ruta = new FileWriter(FK,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("K"):
                ruta = new FileWriter(FK,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("l"):
                ruta = new FileWriter(FL,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("L"):
                ruta = new FileWriter(FL,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("m"):
                ruta = new FileWriter(FM,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("M"):
                ruta = new FileWriter(FM,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("n"):
                ruta = new FileWriter(FN,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("N"):
                ruta = new FileWriter(FN,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("ñ"):
                ruta = new FileWriter(FÑ,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("Ñ"):
                ruta = new FileWriter(FÑ,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("o"):
                ruta = new FileWriter(FO,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("O"):
                ruta = new FileWriter(FO,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;   
            case ("p"):
                ruta = new FileWriter(FP,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("P"):
                ruta = new FileWriter(FP,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;    
            case ("q"):
                ruta = new FileWriter(FQ,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("Q"):
                ruta = new FileWriter(FQ,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("r"):
                ruta = new FileWriter(FR,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("R"):
                ruta = new FileWriter(FR,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("s"):
                ruta = new FileWriter(FS,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("S"):
                ruta = new FileWriter(FS,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("t"):
                ruta = new FileWriter(FT,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("T"):
                ruta = new FileWriter(FT,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("u"):
                ruta = new FileWriter(FU,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("U"):
                ruta = new FileWriter(FU,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("v"):
                ruta = new FileWriter(FV,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("V"):
                ruta = new FileWriter(FV,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;    
            case ("w"):
                ruta = new FileWriter(FW,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("W"):
                ruta = new FileWriter(FW,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("x"):
                ruta = new FileWriter(FX,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("X"):
                ruta = new FileWriter(FX,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("y"):
                ruta = new FileWriter(FY,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("Y"):
                ruta = new FileWriter(FY,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("z"):
                ruta = new FileWriter(FZ,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;
            case ("Z"):
                ruta = new FileWriter(FZ,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                break;    
        } 
    }
    
}
