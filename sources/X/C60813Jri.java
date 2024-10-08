package X;

/* renamed from: X.Jri  reason: case insensitive filesystem */
public final class C60813Jri extends C62977KpT {
    public final Integer A00;
    public final Exception A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60813Jri) {
                C60813Jri jri = (C60813Jri) obj;
                if (this.A00 != jri.A00 || !0qQ.A0K(this.A01, jri.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        if (1 != intValue) {
            str = "CAPTURE_VIEW";
        } else {
            str = "OUTPUT_VALIDATION";
        }
        return AnonymousClass7TE.A0N(this.A01, C51968G9o.A0F(str, intValue));
    }

    public C60813Jri(Exception exc, Integer num) {
        this.A00 = num;
        this.A01 = exc;
    }
}
