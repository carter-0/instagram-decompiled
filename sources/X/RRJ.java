package X;

public final class RRJ {
    public C266724aF A00;
    public String A01;
    public boolean A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((RRJ) obj).A01);
    }

    public final int hashCode() {
        return Pxf.A08(this.A01);
    }
}
