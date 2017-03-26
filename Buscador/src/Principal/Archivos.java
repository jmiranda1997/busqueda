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
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jdk.nashorn.internal.ir.CatchNode;

/**
 *
 * @author USUARIO
 */
public class Archivos extends Thread{
    private Matcher evaluador;
    public Pattern termina ;
    public Pattern contiene ;
    
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
    public static final String CA = CARPETA_PRINCIPAL+SEPARADOR+"CA.txt";
    public static final String CB = CARPETA_PRINCIPAL+SEPARADOR+"CB.txt";
    public static final String CC = CARPETA_PRINCIPAL+SEPARADOR+"CC.txt";
    public static final String CD = CARPETA_PRINCIPAL+SEPARADOR+"CD.txt";
    public static final String CE = CARPETA_PRINCIPAL+SEPARADOR+"CE.txt";
    public static final String CF = CARPETA_PRINCIPAL+SEPARADOR+"CF.txt";
    public static final String CG = CARPETA_PRINCIPAL+SEPARADOR+"CG.txt";
    public static final String CH = CARPETA_PRINCIPAL+SEPARADOR+"CH.txt";
    public static final String CI = CARPETA_PRINCIPAL+SEPARADOR+"CI.txt";
    public static final String CJ = CARPETA_PRINCIPAL+SEPARADOR+"CJ.txt";
    public static final String CK = CARPETA_PRINCIPAL+SEPARADOR+"CK.txt";
    public static final String CL = CARPETA_PRINCIPAL+SEPARADOR+"CL.txt";
    public static final String CM = CARPETA_PRINCIPAL+SEPARADOR+"CM.txt";
    public static final String CN = CARPETA_PRINCIPAL+SEPARADOR+"CN.txt";
    public static final String CÑ = CARPETA_PRINCIPAL+SEPARADOR+"CÑ.txt";
    public static final String CO = CARPETA_PRINCIPAL+SEPARADOR+"CO.txt";
    public static final String CP = CARPETA_PRINCIPAL+SEPARADOR+"CP.txt";
    public static final String CQ = CARPETA_PRINCIPAL+SEPARADOR+"CQ.txt";
    public static final String CR = CARPETA_PRINCIPAL+SEPARADOR+"CR.txt";
    public static final String CS = CARPETA_PRINCIPAL+SEPARADOR+"CS.txt";
    public static final String CT = CARPETA_PRINCIPAL+SEPARADOR+"CT.txt";
    public static final String CU = CARPETA_PRINCIPAL+SEPARADOR+"CU.txt";
    public static final String CV = CARPETA_PRINCIPAL+SEPARADOR+"CV.txt";
    public static final String CW = CARPETA_PRINCIPAL+SEPARADOR+"CW.txt";
    public static final String CX = CARPETA_PRINCIPAL+SEPARADOR+"CX.txt";
    public static final String CY = CARPETA_PRINCIPAL+SEPARADOR+"CY.txt";
    public static final String CZ = CARPETA_PRINCIPAL+SEPARADOR+"CZ.txt";

    public Archivos() throws IOException {
     File princi = new File(CARPETA_PRINCIPAL);
     princi.mkdir();
    }
    
    public void run(){
        File inicio = new File("C:\\");
        buscar_archivos(inicio);
    }
    
    
    private void buscar_archivos(File archivo){
       try{
           if((archivo.canRead() && archivo.canExecute() && archivo.canWrite() && !archivo.isHidden())||(archivo.getAbsolutePath().equals("C:\\"))){
           System.out.println("entro");
        String nombreArchivo = archivo.getName();
          System.out.println(nombreArchivo);
      //  evaluador = ER.matcher(nombreArchivo);
       // System.out.println(archivo.isDirectory());
           inicializar(nombreArchivo, archivo.getAbsolutePath());
           finaliza(nombreArchivo, archivo.getAbsolutePath());
           contiene(nombreArchivo,archivo.getAbsolutePath());
         //  System.out.println("salio");
        if(archivo.isDirectory()) {
        File[] subdirectorio = archivo.listFiles();
        for (File subdirectorio1 : subdirectorio) {
        buscar_archivos(subdirectorio1);
       }
      }
     }
           
    }
     catch (Exception e){}
    
    }
    public void inicializar(String nombre,String Ruta) throws IOException{
        FileVisitor b = new FileVisitor() {
            @Override
            public FileVisitResult preVisitDirectory(Object t, BasicFileAttributes bfa) throws IOException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public FileVisitResult visitFile(Object t, BasicFileAttributes bfa) throws IOException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public FileVisitResult visitFileFailed(Object t, IOException ioe) throws IOException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public FileVisitResult postVisitDirectory(Object t, IOException ioe) throws IOException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        try{
        int a=0;
        System.out.println(Ruta);
        String letra_inicial = nombre.substring(0,1);
       // System.out.println(letra_inicial);
        File archivo;
        FileWriter ruta;
        BufferedWriter escritor;
        switch(letra_inicial){
            case ("a"):
                archivo = new File(IA);
                ruta = new FileWriter(archivo,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                
                escritor.close();
                ruta.close();
                break;
            case ("A"):
                archivo = new File(IA);
                ruta = new FileWriter(archivo,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                
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
                
                break;
            case ("B"):
                ruta = new FileWriter(IB,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                
                break;
            case ("c"):
                ruta = new FileWriter(IC,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                
                break;
            case ("C"):
                ruta = new FileWriter(IC,true);
                escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                
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
     
     
     public void finaliza(String nombre,String Ruta) throws IOException{
         String[] contenido = new String[27];
         String[] archivos = new String[27];
         
         contenido[0] = "a|A";
         contenido[1] = "b|B";
         contenido[2] = "c|C";
         contenido[3] = "d|D";
         contenido[4] = "e|E";
         contenido[5] = "f|F";
         contenido[6] = "g|G";
         contenido[7] = "h|H";
         contenido[8] = "i|I";
         contenido[9] = "j|J";
         contenido[10] = "k|K";
         contenido[11] = "l|L";
         contenido[12] = "m|M";
         contenido[13] = "n|N";
         contenido[14] = "ñ|Ñ";
         contenido[15] = "o|O";
         contenido[16] = "p|P";
         contenido[17] = "q|Q";
         contenido[18] = "r|R";
         contenido[19] = "s|S";
         contenido[20] = "t|T";
         contenido[21] = "u|U";
         contenido[22] = "v|V";
         contenido[23] = "w|W";
         contenido[24] = "x|X";
         contenido[25] = "y|Y";
         contenido[26] = "z|Z";
         
         archivos[0] = FA;
         archivos[1] = FB;
         archivos[2] = FC;
         archivos[3] = FD;
         archivos[4] = FE;
         archivos[5] = FF;
         archivos[6] = FG;
         archivos[7] = FH;
         archivos[8] = FI;
         archivos[9] = FJ;
         archivos[10] = FK;
         archivos[11] = FL;
         archivos[12] = FM;
         archivos[13] = FN;
         archivos[14] = FÑ;
         archivos[15] = FO;
         archivos[16] = FP;
         archivos[17] = FQ;
         archivos[18] = FR;
         archivos[19] = FS;
         archivos[20] = FT;
         archivos[21] = FU;
         archivos[22] = FV;
         archivos[23] = FW;
         archivos[24] = FX;
         archivos[25] = FY;
         archivos[26] = FZ;
         
         
         for (int i = 0; i < contenido.length; i++) {
             
             
             termina = Pattern.compile(".*"+contenido[i]+"(\\..*)?");
             
             evaluador = termina.matcher(nombre);
             
             if(evaluador.matches()){
                 
                FileWriter ruta = new FileWriter(archivos[i],true);
                BufferedWriter escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
                i = contenido.length;
             }
         }
     }
    public void contiene(String nombre,String Ruta) throws IOException{
         String[] contenido = new String[27];
         String[] archivos = new String[27];
         
         contenido[0] = "a|A";
         contenido[1] = "b|B";
         contenido[2] = "c|C";
         contenido[3] = "d|D";
         contenido[4] = "e|E";
         contenido[5] = "f|F";
         contenido[6] = "g|G";
         contenido[7] = "h|H";
         contenido[8] = "i|I";
         contenido[9] = "j|J";
         contenido[10] = "k|K";
         contenido[11] = "l|L";
         contenido[12] = "m|M";
         contenido[13] = "n|N";
         contenido[14] = "ñ|Ñ";
         contenido[15] = "o|O";
         contenido[16] = "p|P";
         contenido[17] = "q|Q";
         contenido[18] = "r|R";
         contenido[19] = "s|S";
         contenido[20] = "t|T";
         contenido[21] = "u|U";
         contenido[22] = "v|V";
         contenido[23] = "w|W";
         contenido[24] = "x|X";
         contenido[25] = "y|Y";
         contenido[26] = "z|Z";
         
         archivos[0] = CA;
         archivos[1] = CB;
         archivos[2] = CC;
         archivos[3] = CD;
         archivos[4] = CE;
         archivos[5] = CF;
         archivos[6] = CG;
         archivos[7] = CH;
         archivos[8] = CI;
         archivos[9] = CJ;
         archivos[10] = CK;
         archivos[11] = CL;
         archivos[12] = CM;
         archivos[13] = CN;
         archivos[14] = CÑ;
         archivos[15] = CO;
         archivos[16] = CP;
         archivos[17] = CQ;
         archivos[18] = CR;
         archivos[19] = CS;
         archivos[20] = CT;
         archivos[21] = CU;
         archivos[22] = CV;
         archivos[23] = CW;
         archivos[24] = CX;
         archivos[25] = CY;
         archivos[26] = CZ;
         
         
         for (int i = 0; i < contenido.length; i++) {
             
             
             termina = Pattern.compile(".*"+contenido[i]+".*");
             
             evaluador = termina.matcher(nombre);
             
             if(evaluador.matches()){
                 
                FileWriter ruta = new FileWriter(archivos[i],true);
                BufferedWriter escritor = new BufferedWriter(ruta);
                escritor.write(Ruta +"\n");
                escritor.close();
                ruta.close();
             }
         }
     }
}
