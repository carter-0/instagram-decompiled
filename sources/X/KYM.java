package X;

public final class KYM extends L2R {
    public final C66460MSo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KYM(C66460MSo mSo) {
        super("confirm");
        0qQ.A0B(mSo, 1);
        this.A00 = mSo;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof KYM) && 0qQ.A0K(this.A00, ((KYM) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
