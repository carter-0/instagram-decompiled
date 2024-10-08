package X;

public final class PK8 implements C74424Pue, C74267Prv {
    public final boolean A00;
    public final C69417Nkz A01;
    public final 0sP A02;

    public PK8(Integer num, boolean z) {
        C69417Nkz nkz;
        this.A00 = z;
        int intValue = num.intValue();
        if (intValue == 1) {
            nkz = C69417Nkz.A1I;
        } else if (intValue == 0) {
            nkz = C69417Nkz.A1K;
        } else if (intValue == 3) {
            nkz = C69417Nkz.A1J;
        } else if (intValue == 2) {
            nkz = C69417Nkz.A1L;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        this.A01 = nkz;
        this.A02 = C74190PqW.A00(this, 43);
    }

    public final 0sP AvD() {
        return this.A02;
    }

    public final C69417Nkz BzR() {
        return this.A01;
    }
}
