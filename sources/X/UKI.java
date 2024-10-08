package X;

public final class UKI extends AnonymousClass0T0 {
    public final UKS A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UKI) {
                UKI uki = (UKI) obj;
                if (!0qQ.A0K(this.A01, uki.A01) || !0qQ.A0K(this.A00, uki.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public UKI(UKS uks, String str) {
        this.A01 = str;
        this.A00 = uks;
    }
}
