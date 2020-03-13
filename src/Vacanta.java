public class Vacanta {

    private String sport;
    private int locuri, perioada1, perioada2;
    private double cost_mediu;

    @Override
    public String toString() {
        return "Sport : " + sport +
                ", perioada : " + perioada1 + " - " + perioada2 +
                ", cost mediu : " + cost_mediu + " lei" +
                ", numar locuri : " + locuri + ".";
    }

    public Vacanta(String sport, int locuri, int perioada1, int perioada2, double cost_mediu) {
        this.sport = sport;
        this.locuri = locuri;
        this.perioada1 = perioada1;
        this.perioada2 = perioada2;
        this.cost_mediu = cost_mediu;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getLocuri() {
        return locuri;
    }

    public void setLocuri(int locuri) {
        this.locuri = locuri;
    }

    public int getPerioada1() {
        return perioada1;
    }

    public void setPerioada1(int perioada1) {
        this.perioada1 = perioada1;
    }

    public int getPerioada2() {
        return perioada2;
    }

    public void setPerioada2(int perioada2) {
        this.perioada2 = perioada2;
    }

    public double getCost_mediu() {
        return cost_mediu;
    }

    public void setCost_mediu(double cost_mediu) {
        this.cost_mediu = cost_mediu;
    }

    public void ocupare_loc()
    {
        this.locuri--;
    }
}
