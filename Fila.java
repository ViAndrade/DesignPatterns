package ExDesignPatternSingleton;

public class Fila {

    static Fila singleton;
    String imprimeDocumentos;
    String removeDocumentos;
    String removeTodosDocumentos;

    private Fila() {
    }

    public void setImprimeDocumentos(String imprimeDocumentos) {
        this.imprimeDocumentos = imprimeDocumentos;
    }

    public void setRemoveDocumentos(String removeDocumentos) {
        this.removeDocumentos = removeDocumentos;
    }

    public void setRemoveTodosDocumentos(String removeTodosDocumentos) {
        this.removeTodosDocumentos = removeTodosDocumentos;
    }

    public String getImprimeDocumentos() {
        return imprimeDocumentos;
    }

    public String getRemoveDocumentos() {
        return removeDocumentos;
    }

    public String getRemoveTodosDocumentos() {
        return removeTodosDocumentos;
    }

    public static Fila getSingleton() {
        if(singleton == null)
            singleton = new Fila();
        return singleton;
    }
}