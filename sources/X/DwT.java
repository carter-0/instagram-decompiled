package X;

public final class DwT extends 1XP {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08 = true;

    public final boolean isOk() {
        if (this.mStatusCode != 200) {
            return false;
        }
        if (this.A02 == null && this.A05 == null) {
            return false;
        }
        return true;
    }
}
