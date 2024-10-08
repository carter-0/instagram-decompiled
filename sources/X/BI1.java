package X;

public final class BI1 extends AnonymousClass0T0 implements DRZ {
    public final DRY A00;
    public final C46219DRa A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BI1) {
                BI1 bi1 = (BI1) obj;
                if (!0qQ.A0K(this.A00, bi1.A00) || !0qQ.A0K(this.A01, bi1.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public BI1(DRY dry, C46219DRa dRa) {
        this.A00 = dry;
        this.A01 = dRa;
    }
}
