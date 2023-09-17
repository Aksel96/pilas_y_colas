public class Pila {
    Nodo cabeza;
    int tamanio;

    public Pila() {
        cabeza = null;
        tamanio = 0;
    }
    public boolean estaVacia(){
        return tamanio == 0;
    }
    public Object peek(){
        if (estaVacia()){
            System.out.println("\tLa pila esta vacia");
            return null;
        }else {
            return cabeza.getValor();
        }
    };
    public void push(Object valor){
        Nodo nuevoNodo = new Nodo(valor);
        if (estaVacia()){
            cabeza = nuevoNodo;
        }else {
            nuevoNodo.setEnlace(cabeza);
            cabeza = nuevoNodo;
        }
        tamanio++;
    }
    public Object pop(){
        if (estaVacia()){
            System.out.println("\tLa pila esta vacia");
            return null;
        }
        Nodo nodoEliminado = cabeza;
        cabeza = cabeza.getEnlace();
        tamanio--;
        return nodoEliminado.getValor();
    }
    public int tamanioPila(){
        return tamanio;
    }


}
