public class Magazyn {
    public LinkedListQueue<Klient> magazyn;
    int sumaCen=0;
    public Magazyn(LinkedListQueue<Klient> magazyn){
        this.magazyn=magazyn;
    }
    public Magazyn(){
        magazyn = new LinkedListQueue<>();
    }
    public void realizacja(){
        int suma=0;
        try{
            while (!magazyn.isEmpty()){
                int tempSuma=0;
                Klient k = magazyn.dequeue();
                while(!k.zamowienia.isEmpty()){
                    Zamowienie z = k.zamowienia.dequeue();
                    tempSuma+=z.cena*z.liczba;
                }
                suma+=tempSuma;
                System.out.println("Zlecenie zrealizowane: "+k.nazwa+" kwota do zapłaty = "+tempSuma);
            }
        } catch (EmptyQueueException e) {
            e.printStackTrace();
        }
        System.out.println("Suma kwot: "+suma);
    }
    public void dodajKlienta(Klient k){
        try{
            magazyn.enqueue(k);
        } catch (FullQueueException e) {
            e.printStackTrace();
        }
    }

}
