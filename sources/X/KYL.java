package X;

public final class KYL extends L2R {
    public final C66460MSo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KYL(C66460MSo mSo) {
        super("cancel");
        0qQ.A0B(mSo, 1);
        this.A00 = mSo;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof KYL) && 0qQ.A0K(this.A00, ((KYL) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
