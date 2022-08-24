package AtividadeExtra2;

public class ExThreads implements Runnable{
    private static int contador = 0;

    @Override
    public void run(){
        System.out.println("Thread iniciada: " + Thread.currentThread().getName());
        while(contador < 50000000)
            contador++;

            System.out.println(Thread.currentThread().getName() + " concluída após join");
    }

    public static void main(String[] args) throws Exception{
        System.out.println("Thread iniciada: " + Thread.currentThread().getName());
        Runnable runnable = new ExThreads();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("Contador antes do sleep: " + contador);
        Thread.sleep(1);
        System.out.println("Contador depois do sleep e antes do join: " + contador);
        thread.join();
        System.out.println("Contador depois do join: " + contador);
    }
}

/*
* Exercícios de Thread :
*
* a) Implemente a interface Runnable; - OK
* 
* b) Faça um exemplo usando o método sleep nas Threads; - OK
*
* c) Faça um exemplo do método join da Thread; - OK
*/