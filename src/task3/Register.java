package task3;

public class Register {
     Document[] documents = new Document[10];
    public void saveDocsToRegister(Document document){
        for (int i = 0; i < documents.length; i++) {
            if(documents[i] == null){
                documents[i] = document;
                break;
            }
        }
    }
    public void showDocsInfo(Document document){
        document.info();
    }
}
