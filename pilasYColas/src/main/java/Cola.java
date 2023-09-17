public class Cola {
    Nodo inicio;
    Nodo fin;
    int tamanio;
    public Cola(){
        inicio = null;
        fin = null;
        tamanio = 0;
    }
    public boolean estaVacia(){
        return tamanio == 0;
    }
    public void enqueue(Object valor){
        Nodo nuevoNodo = new Nodo(valor);
        if (estaVacia()){
            inicio = nuevoNodo;
            fin = nuevoNodo;
        }else {
            fin.setEnlace(nuevoNodo);
            fin = nuevoNodo;
        }
        tamanio++;
    }
    public Object dequeue(){
        if (estaVacia()){
            System.out.println("\tLa cola esta vacia");
            return null;
        }
        Nodo nodoEliminado = inicio;
        inicio = inicio.getEnlace();
        if (inicio == null){
            fin = null;
        }
        tamanio--;
        return nodoEliminado.getValor();
    }
    public Object peek(){
        if (estaVacia()){
            System.out.println("\tLa cola esta vacia");
            return null;
        }
        return inicio.getValor();
    }
    public int tamanioCola(){
        return tamanio;
    }
}
