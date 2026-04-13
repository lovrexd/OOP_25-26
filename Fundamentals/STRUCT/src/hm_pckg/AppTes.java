package hm_pckg;

public class AppTes {

    public static void main(String[] args) {
        String resultFile = POM_CLS.readDataFromTxtFile("./STRUCT/src/hm_pckg/data.txt");
        System.out.println(resultFile);
    }
}
