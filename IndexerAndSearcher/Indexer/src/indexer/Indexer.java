/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indexer;

import java.io.IOException;
import org.apache.lucene.queryparser.classic.ParseException;

/**
 *
 * @author manuel-aircury
 */
public class Indexer {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws org.apache.lucene.queryparser.classic.ParseException
     */
    public static void main(String[] args) throws IOException, ParseException {
        
        System.out.println("Cargando ficheros de: " + args[0]);
        
        IndexerEngine indexer = new IndexerEngine("Indices");
        
        indexer.createIndex(args[0], new TextFileFilter());
                
        indexer.close();   
    }   
}
