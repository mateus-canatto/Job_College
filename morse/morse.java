public class morse{

    private no raiz;

    public void inicializar(){
        raiz = new no();
    }

    public void inserir(String morse, String caracter){
        no atual = raiz;
        for(int i = 0; i < morse.length(); i++){
            char simbolo = morse.charAt(i);
            if(simbolo == '.'){
                if(atual.esquerda == null){
                    atual.esquerda = new no();
                }
                atual = atual.esquerda;
            }
            if(simbolo == '-'){
                if(atual.direita == null){
                    atual.direita = new no();
                }
                atual = atual.direita;
            }
        }
        atual.set(caracter);
    }
    public String buscar(String morse){
        no atual = raiz;
        for(int i = 0; i < morse.length(); i++){
            char simbolo = morse.charAt(i);
            if(simbolo == '.'){
                atual = atual.esquerda;
            }
            else if(simbolo == '-'){
                atual = atual.direita;
            }
            if(atual == null){
                return null;
            }
        } 
        return atual.get();
    }

    public void carregarTabelaMorsePadrao() {
        inserir(".-", "A");
        inserir("-...", "B");
        inserir("-.-.", "C");
        inserir("-..", "D");
        inserir(".", "E");
        inserir("..-.", "F");
        inserir("--.", "G");
        inserir("....", "H");
        inserir("..", "I");
        inserir(".---", "J");
        inserir("-.-", "K");
        inserir(".-..", "L");
        inserir("--", "M");
        inserir("-.", "N");
        inserir("---", "O");
        inserir(".--.", "P");
        inserir("--.-", "Q");
        inserir(".-.", "R");
        inserir("...", "S");
        inserir("-", "T");
        inserir("..-", "U");
        inserir("...-", "V");
        inserir(".--", "W");
        inserir("-..-", "X");
        inserir("-.--", "Y");
        inserir("--..", "Z");
        inserir("-----", "0");
        inserir(".----", "1");
        inserir("..---", "2");
        inserir("...--", "3");
        inserir("....-", "4");
        inserir(".....", "5");
        inserir("-....", "6");
        inserir("--...", "7");
        inserir("---..", "8");
        inserir("----.", "9");
    }

    public void buscarRecursivo(no novo, int profundidade){
        if(novo == null){
            return;
        }
        if(novo.get() != null){
            for(int i = 0; i < profundidade; i++){
                System.out.print(" ");
            }
            System.out.println(novo.get());
        }
        buscarRecursivo(novo.esquerda, profundidade + 1);
        buscarRecursivo(novo.direita, profundidade + 1);
    }

    public void Exibir(){
        buscarRecursivo(raiz, 0);
    }

    public String decodificar(String morse){
        String resultado = "";
        String letraAtual = "";

        for(int i = 0; i < morse.length(); i++){
             char simbolo = morse.charAt(i);
             if(simbolo == ' '){
                if(letraAtual.length() > 0){
                    String letraCodificada = buscar(letraAtual);
                    if(letraAtual != null){
                    resultado += letraCodificada;
                }
                }
                letraAtual = "";
             }
             else if(simbolo == '/'){
                resultado += " ";
             }
             else {
                letraAtual += simbolo;
            }
        }
    if(letraAtual.length() > 0){
        String letraCodificada = buscar(letraAtual);
        if(letraAtual != null){
            resultado += letraCodificada;
        }
    }
    return resultado;
    }
}