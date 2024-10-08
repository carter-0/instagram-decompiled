package X;

public final class DwY extends 1XP {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    public final String getErrorMessage() {
        return this.A06;
    }

    public final boolean isOk() {
        if (!DwY.super.isOk() || !this.A09) {
            return false;
        }
        return true;
    }
}
