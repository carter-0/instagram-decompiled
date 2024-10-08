package X;

public final class KYN extends L2R {
    public final G5E A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KYN(G5E g5e) {
        super("navigate");
        0qQ.A0B(g5e, 1);
        this.A00 = g5e;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof KYN) && 0qQ.A0K(this.A00, ((KYN) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
