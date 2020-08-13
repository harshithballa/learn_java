import java.io.IOException;
import java.util.Scanner;

class Document{
    int id;
    String title;
    String folderName;
    int pages;
    Document(int id, String ti, String fo, int pa){
        this.id = id;
        this.title = ti;
        this.folderName = fo;
        this.pages = pa;
    }
}

public class ja1 {
    public static void main(String[] args) throws IOException {
        int did, dpa, x =0;
        String dti, dfn;
        Document[] darray = new Document[4];
        Document[] oddarr = new Document[4];
        Scanner sc = new Scanner(System.in);
        for (int i =0; i<4;i++){
            did = sc.nextInt();
            dti = sc.next();
            dfn = sc.next();
            dpa = sc.nextInt();
            Document d = new Document(did, dti, dfn, dpa);
            darray[i] = d;
        }
        for (Document nd :docsWithOddPages(darray)){
            try {
                oddarr[x] = nd;
                x+=1;
            }
            catch(NullPointerException ignored){

            }
        }
        for (int a = 0; a < oddarr.length -1; a++){
            for (int b = 0; b < oddarr.length - a - 1; b++){
                try {
                    if (oddarr[b].id > oddarr[b + 1].id) {
                        Document temp = oddarr[b + 1];
                        oddarr[b + 1] = oddarr[b];
                        oddarr[b] = temp;
                    }
                }
                catch(NullPointerException ignored){

                }
            }
        }
        for (Document ed : oddarr){
            try {
                System.out.println(ed.id + " " + ed.title + " " + ed.folderName + " " + ed.pages);
            }
            catch(NullPointerException ignored){

            }
        }
    }
    static Document[] docsWithOddPages(Document[] darr){
        int i = 0;
        Document[] ndarr = new Document[darr.length];
        for (Document d: darr){
            if (d.pages % 2 != 0){
                ndarr[i]= d;
                i+=1;
            }
        }
        return ndarr;
    }
}
