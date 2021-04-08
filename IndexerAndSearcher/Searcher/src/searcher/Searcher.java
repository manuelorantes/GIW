/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searcher;

import java.io.IOException;
import org.apache.lucene.document.Document;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;

/**
 *
 * @author manuel-aircury
 */
public class Searcher {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws org.apache.lucene.queryparser.classic.ParseException
     */
    public static void main(String[] args) throws IOException, ParseException {
        SearcherEngine searcher = new SearcherEngine("../../Indices");
        
        TopDocs hits = searcher.search(args[0]);
        for(ScoreDoc scoreDoc : hits.scoreDocs) {
            Document doc = searcher.getDocument(scoreDoc);
            System.out.print("Score: "+ scoreDoc.score + " ");
            System.out.println("File: " + doc.get(LuceneConstants.FILE_PATH));
        }            
    }   
}
