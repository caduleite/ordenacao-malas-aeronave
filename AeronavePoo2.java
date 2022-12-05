package Programa;

import java.util.Scanner;

public class AeronavePoo2 {
    public static void main(String[] args) {
        
        // Variaveis:
        int np = 0;
        int nm = 0;
        int contMala = 0;
        int qtdMalaA = 0;
        int qtdMalaB = 0;
        int numVet;
        int[] mp = new int[45];
        int[] ba = new int[45];
        int[] bb = new int[45];
        float bagageiroA = 0, bagageiroB = 0;
        
        // Classe Scanner:
        Scanner scan = new Scanner(System.in);
        
        // Declaração dados de entrada Passageiros:
        System.out.println("-> Informe o n° de passageiros: ");
        np = scan.nextInt();

      
        // Declaração dados de entrada quantidade de malas:
        for (int i=0; i<np; i++) {
            System.out.println("-> Informe a quantidade de malas do passageiro n°" + (i+1) + ":");
            nm = scan.nextInt();
        }
        
        // Declaração dados de entrada PESO:
        for (int j=0; j<nm; j++) {
            
            System.out.println("-> Informe o PESO (KG) da mala n°" + (j+1) + ":");
            mp[contMala] = scan.nextInt(); 
            contMala++;
            }
        
        
         // Ordernação das Malas:
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (mp[i] > mp[j]) {
                    numVet = mp[i];
                    mp[i] = mp[j];
                    mp[j] = numVet;
                }
            }
        } 
        
        // Restrições:
        for (int i = 4; i >= 0; i--) {
            if (i == 4) {
                bagageiroA += mp[i];
                ba[i] = mp[i];
                qtdMalaA++;
            } else {
                if (bagageiroA > bagageiroB) {
                    bagageiroB += mp[i];
                    bb[i] = mp[i];
                    qtdMalaB++;
                } else {
                    bagageiroA += mp[i];
                    ba[i] = mp[i];
                    qtdMalaA++;
                }
            }
        }
        
        // Saída de dados bagageiroA:
        System.out.println("\nO valor/peso TOTAL do bagageiro A: " + bagageiroA + " KG \n");
        System.out.println("\nN° de malas alocadas no bagageiro A: " + qtdMalaA + "\n");
        System.out.println("\nMalas alocadas no bagageiro A: ");
        
         for (int i = 4; i >= 0; i--) {
            if (ba[i] != 0) {
                System.out.println("[" + ba[i] + "]");
            }
        }
         
         // Saída de dados bagageiroB:
        System.out.println("\nO valor/peso TOTAL do bagageiro B: " + bagageiroB + " KG.\n");
        System.out.println("\nN° de malas alocadas no bagageiro B: " + qtdMalaB + "\n");
        System.out.println("\nMalas alocadas no bagageiro B: ");
        
        for (int i = 14; i >= 0; i--) {
            if (bb[i] != 0) {
                System.out.println("[" + bb[i] + "]");
            }
        }
        
        //Saída de dados totalizações:
        System.out.println("\nO N° TOTAL de malas alocadas é: "+(qtdMalaA + qtdMalaB) + "\n");
        System.out.println("\nO valor/peso TOTAL das malas: "+ (bagageiroA + bagageiroB)  + "KG.\n");
    }
}
