package X;

public final class PRT implements C242713Vq {
    public int A00;
    public C68167N3h A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof PRT)) {
            return false;
        }
        PRT prt = (PRT) obj;
        if (prt.A00 == this.A00) {
            return C51971G9r.A1Z(prt.A01.A01(), this.A01.A01(), false);
        }
        return false;
    }

    public final int hashCode() {
        return C66583MXo.A06(this.A01.A01()) + this.A00;
    }
}
