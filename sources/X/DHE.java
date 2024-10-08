package X;

public final class DHE implements C46218DQz {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final String Anf() {
        return this.A01;
    }

    public final Integer Bly() {
        return this.A00;
    }

    public final String Bm0() {
        return this.A02;
    }

    public final String C4Z() {
        return this.A03;
    }

    public DHE(DUQ duq) {
        this.A01 = duq.Anf();
        this.A02 = duq.Bm0();
        this.A03 = duq.C4Z();
        Integer Blx = duq.Blx();
        Integer num = AnonymousClass05K.A01;
        if (Blx == null || Blx.intValue() != 1) {
            num = AnonymousClass05K.A00;
            if (Blx == null || Blx.intValue() != 0) {
                num = null;
            }
        }
        this.A00 = num;
    }
}
