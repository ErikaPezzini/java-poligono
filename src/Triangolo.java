class Triangolo implements Poligono {
    private double lato1;
    private double lato2;
    private double lato3;
    private double altezza;

    public Triangolo(double lato1, double lato2, double lato3, double altezza) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
        this.altezza = altezza;
    }

    @Override
    public double calcolaPerimetro() {
        return lato1 + lato2 + lato3;
    }

    @Override
    public double calcolaArea(){
        double base = lato1;
        return (base * altezza) / 2;
    }

    @Override
    public String toString(){
        return "Triangolo [lati = " + lato1 + ", " + lato2 + ", " + lato3 + ", altezza = " + altezza + ", perimetro = " + calcolaPerimetro() + ", area = " + calcolaArea() + "]";
    }
}