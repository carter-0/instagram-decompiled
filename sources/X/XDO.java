package X;

public final class XDO implements AnonymousClass2TL, 2Sp, AnonymousClass3X9 {
    public 2TK A00 = new 2TK();
    public final /* synthetic */ C295015nP A01;

    public final synchronized void A8w(2Sp r2) {
        this.A00.A8w(r2);
    }

    public final synchronized void EDr(2Sp r2) {
        this.A00.EDr(r2);
    }

    public XDO(C295015nP r2) {
        this.A01 = r2;
        r2.A0C.A8w(this);
    }

    public final AnonymousClass07Z BMV() {
        AnonymousClass2TL r1 = this.A01.A0C;
        if (r1 == null || !(r1 instanceof AnonymousClass3X9)) {
            return null;
        }
        return ((AnonymousClass3X9) r1).BMV();
    }

    public final Integer CFa() {
        return this.A00.A00;
    }

    public final void A00(Integer num) {
        AnonymousClass2VL.A00();
        this.A00.A00(num);
        if (num == AnonymousClass05K.A0C) {
            C295015nP r1 = this.A01;
            r1.A0C.EDr(this);
            r1.A01 = null;
            r1.A06 = false;
        }
    }

    public final void DSW(Integer num) {
        Integer num2;
        int intValue = num.intValue();
        if (intValue == 0) {
            num2 = AnonymousClass05K.A00;
        } else if (intValue != 1) {
            num2 = AnonymousClass05K.A0C;
        } else {
            num2 = AnonymousClass05K.A01;
        }
        A00(num2);
    }
}
