class Rettangolo implements Poligono {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza){
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaPerimetro(){
        return 2 * (base + altezza);
    }

    @Override
    public double calcolaArea(){
        return base * altezza;
    }

    @Override
    public String toString(){
        return "Rettangolo [base = " + base + ", altezza = " + altezza + ", perimetro = " + calcolaPerimetro() + ", area = " + calcolaArea() + "]";
    }
}
