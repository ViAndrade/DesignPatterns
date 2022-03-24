package ExDesignPatternSingleton;

public class Main {

    public static void main(String[] args) {

        Fila singleton1 = Fila.getSingleton();
        Fila singleton2 = Fila.getSingleton();

        singleton1.setImprimeDocumentos("Imprimindo os documentos do ID 1 solicitados.");
        singleton1.setRemoveDocumentos("Removendo os documentos do ID 1 desejados.");
        singleton1.setRemoveTodosDocumentos("Removendo todos os documentos do ID 1.");

        singleton2.setImprimeDocumentos("Imprimindo os documentos do ID 2 solicitados.");
        singleton2.setRemoveDocumentos("Removendo os documentos do ID 2 desejados.");
        singleton2.setRemoveTodosDocumentos("Removendo todos os documentos do ID 2.");

        System.out.println(singleton1.getImprimeDocumentos());
        System.out.println(singleton2.getImprimeDocumentos());

        System.out.println(singleton1.getRemoveDocumentos());
        System.out.println(singleton2.getRemoveDocumentos());

        System.out.println(singleton1.getRemoveTodosDocumentos());
        System.out.println(singleton2.getRemoveTodosDocumentos());

        /*
            Nessa condição, sempre será mostrado/sinalizado informações do Singleton 2.
         */
    }
}
