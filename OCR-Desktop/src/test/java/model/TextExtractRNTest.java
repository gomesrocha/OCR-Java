/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fabio
 */
public class TextExtractRNTest {
    
    public TextExtractRNTest() {
    }
    
    @Before
    public void setUp() {
    }
    
     @Test
    public void testExtract() {
        System.out.println("Extract");
        //Substituir pelo caminho e imagem desejada
        String imagem = "C:\\Dev\\DigitalSE\\Imagens_Exemplo\\4.png";
        File imageFile = new File(imagem);
        TextExtractRN instance = new TextExtractRN(imageFile, "por");
        String expResult = "Aula OCR ".toLowerCase();
        String result = instance.extract().toLowerCase();
        assertEquals("Texto retornado é diferente do texto indicado",expResult.toString().trim(), result.toString().trim());
    }
}
