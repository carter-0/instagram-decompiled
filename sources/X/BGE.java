package X;

public final class BGE extends AnonymousClass0T0 implements DRQ {
    public final Float A00;
    public final Float A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGE) {
                BGE bge = (BGE) obj;
                if (!0qQ.A0K(this.A00, bge.A00) || !0qQ.A0K(this.A01, bge.A01)) {
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

    public BGE(Float f, Float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
