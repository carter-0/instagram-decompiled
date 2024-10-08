package X;

/* renamed from: X.GRe  reason: case insensitive filesystem */
public final class C52404GRe extends AnonymousClass0T0 implements C59643JRl {
    public final int A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52404GRe) {
                C52404GRe gRe = (C52404GRe) obj;
                if (this.A00 != gRe.A00 || !0qQ.A0K(this.A01, gRe.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + AnonymousClass7TG.A0C(this.A01);
    }

    public C52404GRe(int i, Integer num) {
        this.A00 = i;
        this.A01 = num;
    }
}
