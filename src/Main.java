public class Main {
    public static void main(String[] args) {
        Magazyn m = new Magazyn();
        Klient k1 = new Klient("Janusz Zając");
        Klient k2 = new Klient("Adrian Konieczny");
        Klient k3 = new Klient("Karol Marks");
        Zamowienie z1 = new Zamowienie("Opony", 4, 800);
        Zamowienie z2 = new Zamowienie("Rower", 1, 2500);
        Zamowienie z3 = new Zamowienie("Truskawki", 70, 5);
        Zamowienie z4 = new Zamowienie("Kapelusz", 1, 60);
        Zamowienie z5 = new Zamowienie("Felgi", 4, 40);
        Zamowienie z6 = new Zamowienie("Jeżyny", 100, 6);
        k1.dodajZamowienie(z2);
        k1.dodajZamowienie(z6);
        k2.dodajZamowienie(z1);
        k2.dodajZamowienie(z5);
        k3.dodajZamowienie(z3);
        k3.dodajZamowienie(z4);
        m.dodajKlienta(k1);
        m.dodajKlienta(k2);
        m.dodajKlienta(k3);
        m.realizacja();

    }
}
