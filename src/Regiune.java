public class Regiune extends Vacanta {

    private String regiune, tara;

    public Regiune(String sport, int locuri, int perioada1, int perioada2, double cost_mediu, String regiune, String tara) {
        super(sport, locuri, perioada1, perioada2, cost_mediu);
        this.regiune = regiune;
        this.tara = tara;
    }

    public String getRegiune() {
        return regiune;
    }

    public void setRegiune(String regiune) {
        this.regiune = regiune;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }
}
