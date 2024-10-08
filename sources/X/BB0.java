package X;

public final class BB0 extends AnonymousClass0T0 {
    public final 1Xj A00;
    public final Integer A01;

    public BB0(1Xj r2, Integer num) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BB0) {
                BB0 bb0 = (BB0) obj;
                if (!0qQ.A0K(this.A00, bb0.A00) || !0qQ.A0K(this.A01, bb0.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0C(this.A01);
    }
}
