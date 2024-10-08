package X;

public final class BDy extends AnonymousClass0T0 implements DR2 {
    public final Float A00;
    public final Float A01;
    public final Float A02;
    public final Float A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BDy) {
                BDy bDy = (BDy) obj;
                if (!0qQ.A0K(this.A00, bDy.A00) || !0qQ.A0K(this.A01, bDy.A01) || !0qQ.A0K(this.A02, bDy.A02) || !0qQ.A0K(this.A03, bDy.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public BDy(Float f, Float f2, Float f3, Float f4) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
    }
}
