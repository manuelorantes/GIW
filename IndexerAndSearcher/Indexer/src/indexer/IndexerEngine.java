/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indexer;

/**
 *
 * @author manuel-aircury
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.apache.lucene.analysis.CharArraySet;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
public class IndexerEngine {
   private final IndexWriter writer;
   
   public IndexerEngine(String indexDirectoryPath) throws IOException {
      Directory indexDirectory = FSDirectory.open(Paths.get(indexDirectoryPath));
      List<String> stopWords = new ArrayList<>();
      String cadena;
      FileReader f = new FileReader("PalabrasVaciasIngles.txt");
      BufferedReader b = new BufferedReader(f);
      while((cadena = b.readLine())!=null) {
          stopWords.add(cadena);
      }
      b.close();
      CharArraySet stopSet = new CharArraySet(stopWords, true);
      StandardAnalyzer analyzer = new StandardAnalyzer(stopSet);
      IndexWriterConfig iwc = new IndexWriterConfig(analyzer);
      writer = new IndexWriter(indexDirectory, iwc);
      if(DirectoryReader.indexExists(indexDirectory)){
        writer.deleteAll();
      }
   }
   
   public void close() throws CorruptIndexException, IOException {
      writer.close();
   }
   
   private Document getDocument(File file) throws IOException {
      Document document = new Document();
      TextField contentField = new TextField(LuceneConstants.CONTENTS, new FileReader(file));
      TextField fileNameField = new TextField(LuceneConstants.FILE_NAME, file.getName(), TextField.Store.YES);
      TextField filePathField = new TextField(LuceneConstants.FILE_PATH, file.getCanonicalPath(), TextField.Store.YES);
      

      document.add(contentField);
      document.add(fileNameField);
      document.add(filePathField);
      
      return document;
   }   
   
   private void indexFile(File file) throws IOException {
      System.out.println("Indexing "+file.getCanonicalPath());
      Document document = getDocument(file);
      writer.addDocument(document);
   }
   
   public int createIndex(String dataDirPath, FileFilter filter) 
      throws IOException {
      File[] files = new File(dataDirPath).listFiles();
      for (File file : files) {
         if(!file.isDirectory()
            && !file.isHidden()
            && file.exists()
            && file.canRead()
            && filter.accept(file)
         ){
            indexFile(file);
         }
      }
      return writer.numRamDocs();
   }
} 