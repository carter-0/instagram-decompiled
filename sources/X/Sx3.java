package X;

public final class Sx3 implements AnonymousClass63L {
    public static final Sx3 A01 = new Sx3((String) null);
    public final String A00;

    public /* synthetic */ Sx3(String str) {
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Sx3)) {
            return false;
        }
        return SA1.A01(this.A00, ((Sx3) obj).A00);
    }

    public final int hashCode() {
        return Pxf.A08(this.A00);
    }
}
