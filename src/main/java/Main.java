import cz.uhk.zlomekws.ws.*;

public class Main {
    public static void main(String[] args) {
        ZlomekWSImplService zlomekClient = new ZlomekWSImplService();

        ZlomekWS zlomekService = zlomekClient.getZlomekWSImplPort();

        Zlomek a = new Zlomek();
        a.setCitatel(3);a.setJmenovatel(4);
        Zlomek b = new Zlomek();
        b.setCitatel(2);b.setJmenovatel(4);
        Zlomek c = zlomekService.add(a,b);

        System.out.printf("%d\n---------\n%d\n", c.getCitatel(), c.getJmenovatel());
    }
}
