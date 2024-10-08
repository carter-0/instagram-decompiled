package X;

/* renamed from: X.3X8  reason: invalid class name */
public final class AnonymousClass3X8 implements AnonymousClass2TL, AnonymousClass0hF, AnonymousClass3X9 {
    public final 2TK A00 = new 2TK();
    public final AnonymousClass07Z A01;

    public final void Dms(07T r3, AnonymousClass07Z r4) {
        Integer num;
        0qQ.A0B(r3, 1);
        int ordinal = r3.ordinal();
        if (ordinal == 2) {
            num = AnonymousClass05K.A00;
        } else if (ordinal == 3) {
            num = AnonymousClass05K.A01;
        } else if (ordinal == 5) {
            this.A00.A00(AnonymousClass05K.A0C);
            this.A01.getLifecycle().A0A(this);
            return;
        } else {
            return;
        }
        this.A00.A00(num);
    }

    public final void A8w(2Sp r2) {
        this.A00.A8w(r2);
    }

    public final AnonymousClass07Z BMV() {
        return this.A01;
    }

    public final Integer CFa() {
        return this.A00.A00;
    }

    public final void EDr(2Sp r2) {
        this.A00.EDr(r2);
    }

    public AnonymousClass3X8(AnonymousClass07Z r2) {
        this.A01 = r2;
        r2.getLifecycle().A09(this);
    }
}
