/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hotel;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    
    public static ArrayList<Client> Clients= new ArrayList<>();
    public static ArrayList<Estada> Chekin= new ArrayList<>();
    public static ArrayList<Habitacio> Habitacions= new ArrayList<>();
    


    public static void main(String[] args) {
        
          double IVA = 0.16;
          double PIVA = 0.0;
          double PREUN = 60.0;
       Estada estades = null;        
        
        int opcio = 0;
        Scanner sc = new Scanner(System.in);
        
       while(opcio !=8){     
           System.out.println();
           System.out.println("========================");
           System.out.println("    ESCULL UNA OPCIO   ");
           System.out.println("========================");
           System.out.println();
           System.out.println("1. Alta nou client ");
           System.out.println("2. Llistar clients");
           System.out.println("3. Modificar dades client ");
           System.out.println("4. Submenu amb opcions");
           System.out.println("5. Alta habitacio");
           System.out.println("6. Llistar Habitacions");
           System.out.println("7. Modificar habitacio");
           System.out.println("8. Sortir del sistema");
           System.out.println();
        
           opcio = sc.nextInt();
           sc.nextLine(); 

           switch (opcio){
               case 1: 
                    System.out.println("nom nou client");
                    String nom = sc.nextLine();
                    System.out.println("Cognom del nou client");
                    String cognom = sc.nextLine();
                    System.out.println("NIF del nou client");
                    String NIF = sc.nextLine();

                    System.out.println("Introdueix la data de neixament (dd/MM/yyyy)");
                    String nei = sc.nextLine();
                    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate dataNaixement = LocalDate.parse(nei, format);

                    System.out.println("localitat del nou client");
                    String localitat = sc.nextLine();

                    Clients.add(new Client(nom, cognom, NIF, dataNaixement, localitat));
                    System.out.println(Clients.getLast().toString());

                                      
                   break;
               case 2: 
                    Clients.forEach(n -> System.out.println(n));  
                   //Chekin.forEach(n -> System.out.println(n));
                   break;
               case 3:
                    System.out.println("Introdueix NIF del client");
                    String canvi = sc.nextLine();
                    for (int i = 0; i < Clients.size();i++){
                        if (Clients.get(i).getNIF().equals(canvi)) {

                                 int opcioCan = 0;

                             while(opcioCan !=6){ 
                                 System.out.println("------------------------");
                                 System.out.println("    ESCULL UNA OPCIO   ");
                                 System.out.println("------------------------");
                                 System.out.println();
                                 System.out.println("1. Cnvi NOM ");
                                 System.out.println("2. Canvi COGNOM");
                                 System.out.println("3. Canvi NIF ");
                                 System.out.println("4. Canvi DATA DE NEIXAMENT");
                                 System.out.println("5. Canvi de LOCALITAT");
                                 System.out.println("6. Tornar menu principal");

                                 System.out.println();

                                 opcioCan = sc.nextInt();
                                    sc.nextLine();
                                 switch (opcioCan) {
                                     case 1:
                                         System.out.println("Introdueix el nou nom del client");
                                         Clients.get(i).setNom(sc.nextLine());
                                         break;
                                     case 2:
                                         System.out.println("Introdueix el nou cognom del client");
                                         Clients.get(i).setCognom(sc.nextLine());
                                         break;
                                    case 3:
                                         System.out.println("Introdueix el nou NIF del client");
                                         Clients.get(i).setNIF(sc.nextLine());
                                         break;
                                    case 4:
                                         System.out.println("Introdueix la data de neixament (dd/MM/yyyy)");
                                            String change = sc.nextLine();
                                            DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                                            LocalDate dataNaix = LocalDate.parse(change, forma);
                                         Clients.get(i).setDataNaixement(dataNaix);
                                         break;
                                    case 5:
                                         System.out.println("Introdueix la nova localitat");
                                         Clients.get(i).setLocalitat(sc.nextLine());
                                         break;
                                    case 6:
                                         System.out.println("Sortir del sistema");
                                                                            
                                         break;
                                    default:
                                        System.out.println("Opció no vàlida");
                                        break;
                                 }

                        }}}
                        
                   break;
                   
               case 4:
                    System.out.println("Introdueix NIF del client");
                    canvi = sc.nextLine();
                    for (int i = 0; i < Clients.size();i++){
                        if (Clients.get(i).getNIF().equals(canvi)) {

                                 int opcioCan = 0;

                             while(opcioCan !=8){ 
                                System.out.println("========================");
                                System.out.println("    ESCULL UNA OPCIÓ   ");
                                System.out.println("========================");
                                System.out.println();
                                System.out.println("1. Checkin");
                                System.out.println("2. Servei Bugaderia");
                                System.out.println("3. Servei Esmorzar");
                                System.out.println("4. Servei Dinar");
                                System.out.println("5. Servei Sopar");
                                System.out.println("6. Consultar import actual");
                                System.out.println("7. Checkout");
                                System.out.println("8. Sortir del sistema");
                                System.out.println();

                                 System.out.println();

                                 opcioCan = sc.nextInt();
                                 sc.nextLine();

                               //     sc.nextLine();
                                 switch (opcioCan) {
                                     case 1:
                                        DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                                        System.out.println("Introdueix la data i hora de entrada a l'hotel (dd/MM/yyyy HH:mm)");
                                        String entrada = sc.nextLine();
                                        LocalDateTime hEntrada = LocalDateTime.parse(entrada, forma);
                                        LocalDateTime hSortida = hEntrada;
                                        

                                        for (Habitacio h : Habitacions) {
                                            if (!h.isOcupada()) {
                                                System.out.println("Habitació lliure: " + h.getNumHabitacio());
                                            }
                                        }
                                        Chekin.add(new Estada(Clients.get(i), hEntrada, hSortida));
                                        
                                        System.out.println("Introdueix la nova habitacio del client.");
                                        int habi = sc.nextInt();

                                        for (Habitacio h : Habitacions) {
                                            if (h.getNumHabitacio() == habi) { 
                                                if (!h.isOcupada()) { 
                                                    h.setOcupada(true);
                                                    Chekin.get(i).setHabitacio(h);
                                                    System.out.println("La habitacio s'ha assignat correctament.");
                                                } else {
                                                    System.out.println("La habitacio esto ocupada.");
                                                }
                                                break; 
                                            }
                                        }
                                        
                                        
                                        break;
                                     case 2:

                                        for (Estada e : Chekin) {
                                            if (e.getClient().getNIF().equals(canvi)) {
                                                estades = e;
                                                break;
                                            }
                                        }

                                        if (estades != null) {
                                            Servei serveiBugaderia = new Servei(1, "Servei Bugaderia", 10.00);
                                            estades.getServeis().add(serveiBugaderia);
                                            estades.setImportActualGastat(estades.getImportActualGastat() + serveiBugaderia.getPreu());
                                            System.out.println("Servei Bugaderia afegit correctament. Import actual: " + estades.getImportActualGastat());
                                        } else {
                                            System.out.println("Aquest client no te cap estada.");
                                        }
                                        
                                        break;
                                        
                                     case 3:
                                         for (Estada e : Chekin) {
                                             if (e.getClient().getNIF().equals(canvi)){
                                                 estades = e;
                                                 break;
                                             }
                                         }
                                         
                                         if (estades != null){
                                             Servei serveiEsmorzar = new Servei (2, "Servei Esmorzar", 11.00);
                                             estades.getServeis().add(serveiEsmorzar);
                                             estades.setImportActualGastat(estades.getImportActualGastat() + serveiEsmorzar.getPreu());
                                             System.out.println("Servei Esmorzar afegit correctament. Import actual: " + estades.getImportActualGastat());
                                         }else {
                                            System.out.println("Aquest client no te cap estada.");
                                        }
                                         
                                         break;
                                     case 4:
                                         for(Estada a : Chekin){
                                             if (a.getClient().getNIF().equals(canvi)){
                                                estades = a;
                                                break;
                                             }
                                         }
                                         
                                         if(estades != null){
                                             Servei serveiDinar = new Servei(3, "Servei Dinar", 20.00);
                                             estades.getServeis().add(serveiDinar);
                                             estades.setImportActualGastat(estades.getImportActualGastat() + serveiDinar.getPreu());
                                             System.out.println("Servei Dinar afegit correctament. Import actual: " + estades.getImportActualGastat());

                                         }else {
                                            System.out.println("Aquest client no te cap estada.");
                                        }
                                         
                                         break;
                                     case 5:
                                         for (Estada s : Chekin){
                                             if (s.getClient().getNIF().equals(canvi)){
                                                 estades = s;
                                                 break;
                                             }
                                         }
                                         
                                         if (estades != null){
                                             Servei serviSopar = new Servei (4, "Servei sopar", 18.00);
                                             estades.getServeis().add(serviSopar);
                                             estades.setImportActualGastat(estades.getImportActualGastat() + serviSopar.getPreu());
                                             System.out.println("Servei Dinar afegit correctament. Import actual: " + estades.getImportActualGastat());

                                         }else {
                                            System.out.println("Aquest client no te cap estada.");
                                        }
                                         
                                         break;
                                     case 6:
                                         System.out.println("L'import actual gastat del client " + Clients.get(i).getNom() +" es: " + estades.getImportActualGastat());
                                         break; 
                                         
                                     case 7:
                                            DateTimeFormatter formes = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

                                            System.out.println("Introdueix la data i hora de sortida de l'hotel (dd/MM/yyyy HH:mm)");
                                            String sortida = sc.nextLine();
                                            hSortida = LocalDateTime.parse(sortida, formes);
                                            System.out.println();
                                            
                                            Chekin.get(i).setDataSortida(hSortida);
                                            
                                            long dies = ChronoUnit.DAYS.between(Chekin.get(i).getDataEntrada(), Chekin.get(i).getDataSortida());
                                                double impor = 0.0;
                                                double imports = 0.0;
                                                double total = 0.0;

                                                PIVA = Chekin.get(i).getHabitacio().getPreuPerNit() * PREUN;
                                                impor = (PIVA * (1 + IVA));
                                                
                                                
                                                System.out.println("L'import total ha pagar pels dies d'estancie mes extres es");
                                                System.out.println();
                                                System.out.printf( "%.2f$\n", impor);
                                                
                                                imports = (Chekin.get(i).getImportActualGastat() * (1 + IVA));
                                                
                                                System.out.println("L'import total ha pagar pels serveis fets servir es de:");
                                                System.out.println();
                                                System.out.printf( "%.2f$\n", imports);
                                                
                                                total = impor + imports;
                                                
                                                System.out.println("El total a pagar es de:");
                                                System.out.println();
                                                System.out.printf( "%.2f$\n", total);
                                                
                                                Chekin.get(i).getHabitacio().setOcupada(false);
                                                
                                                
                                         break;
                                          default:
                                        System.out.println("Opció no vàlida");
                                        break;
                                 }
                        }}}
                        
                   break;
                   
               case 5:
                   if (Habitacions.isEmpty()) {
                   for (int i = 1; i < 21; i++){
                       Habitacions.add(new Habitacio (i, i * 15.00, false));
                       
                   }}
                    System.out.println("S'han creat 20 Habitacions ");

                   break;
                   
               case 6:
                   Habitacions.forEach(n -> System.out.println(n));
                    
                   break;
               case 7:
                    System.out.println("Escriu el numero de la habitacio");
                   int hab = sc.nextInt();
                    for (int i = 0; i < 20;i++){
                        if (Habitacions.get(i).getNumHabitacio() == hab) {
                              int opcioCan = 0;

                             while(opcioCan !=3){ 
                                 System.out.println("---------------------------");
                                 System.out.println("    CANVI DE PARAMETRES   ");
                                 System.out.println("---------------------------");
                                 System.out.println();
                                 System.out.println("1. Canvi de NUMERO");
                                 System.out.println("2. Canvi de PREU");
                                 System.out.println("3. Sortir del sistema");

                                 System.out.println();

                                 opcioCan = sc.nextInt();
                                    sc.nextLine();
                                 switch (opcioCan) {
                                     case 1:
                                         
                                      System.out.println("Introdueix el nou Numero de l'habitacio");
                                        int nouNum = sc.nextInt();
                                        boolean existeix = false;

                                        for (int j = 0; j < Habitacions.size(); j++) {
                                            if (Habitacions.get(j).getNumHabitacio() == nouNum) {
                                                existeix = true;
                                                break;
                                            }
                                        }

                                        if (!existeix) {
                                             Habitacions.get(i).setNumHabitacio(nouNum);
                                            System.out.println("Número de habitacio actualitzat correctament.");
                                        } else {
                                            System.out.println("Aquest numero de ja s'esta fent servir.");
                                        }
                                         break;
                                     case 2:
                                         System.out.println("Introdueix el nou Preu de l'habitacio");
                                         Double nouPreu = sc.nextDouble();
                                         Habitacions.get(i).setPreuPerNit(nouPreu);
                                         break;
                                     case 3:
                                         System.out.println("Sortint del sistema...");
                                         break;
                                     default:
                                        System.out.println("Opcio no valida");
                                        break;
                                 }
                             }
                        }
                    }
                            
                        
                   
                   break;
                   
                   
                   
                   
               
            

               
           }
           
   }
 }
 }

