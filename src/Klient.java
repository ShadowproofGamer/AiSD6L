public class Klient {
    public String nazwa;
    public LinkedListQueue<Zamowienie> zamowienia = new LinkedListQueue<>();
    public Klient(String nazwa){
        this.nazwa=nazwa;
    }
    public Klient(String nazwa, Zamowienie zam){
        this.nazwa=nazwa;
        try{
            zamowienia.enqueue(zam);
        } catch (FullQueueException e) {
            e.printStackTrace();
        }
    }
    public Klient(String nazwa, LinkedListQueue<Zamowienie> zamowienia){
        this.nazwa=nazwa;
        this.zamowienia=zamowienia;
    }

    public void dodajZamowienie(String nazwa, int liczba, int cena){
        try{
            zamowienia.enqueue(new Zamowienie(nazwa, liczba, cena));
        } catch (FullQueueException e) {
            e.printStackTrace();
        }
    }
    public void dodajZamowienie(Zamowienie zam){
        try{
            zamowienia.enqueue(zam);
        } catch (FullQueueException e) {
            e.printStackTrace();
        }
    }
}
