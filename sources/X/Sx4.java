package X;

@Deprecated
public class Sx4 implements AnonymousClass63L {
    public static final Sx4 A02 = new Sx4((String) null, AnonymousClass7TE.A0u());
    public final String A00;
    public final boolean A01;

    public Sx4(String str, Boolean bool) {
        this.A01 = bool.booleanValue();
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Sx4) {
                Sx4 sx4 = (Sx4) obj;
                if (this.A01 != sx4.A01 || !SA1.A01(this.A00, sx4.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Pxf.A0B((Object) null, Boolean.valueOf(this.A01), this.A00);
    }
}
