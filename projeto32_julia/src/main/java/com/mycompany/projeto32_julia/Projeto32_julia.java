/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto32_julia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author jpaixao
 */
public class Projeto32_julia {

    public static void main(String[] args) throws  IOException {
     String nomeArquivo = "P:\\TURMAS\\HTC-DDS-16\\PROG_APP\\Júlia_Paixão\\tabuada2.txt"; 
     
     try {
        FileReader fileReader = new FileReader (nomeArquivo); 

      BufferedReader bufferedReader = new BufferedReader (fileReader); 
      String linha; 
      
     while ((linha = bufferedReader.readLine()) != null) { 
         System.out.println(linha); 
     }
         bufferedReader.close();
         
         fileReader.close();
     } catch (IOException e) { 
             System.err.println("Ocorreu um erro ao ler o arquivo:" + e.getMessage());
             }
    }
         
    
}
    