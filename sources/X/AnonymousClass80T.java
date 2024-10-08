package X;

/* renamed from: X.80T  reason: invalid class name */
public final class AnonymousClass80T implements AnonymousClass80U {
    public final AnonymousClass80Z A00;
    public final AnonymousClass80W A01 = new AnonymousClass80W(AnonymousClass80V.HIDDEN);
    public final AnonymousClass80W A02;

    public final void A7w(C3493580b r2) {
        0qQ.A0B(r2, 0);
        this.A01.A02(r2);
    }

    public final void A7z(C3493580b r2) {
        0qQ.A0B(r2, 0);
        this.A02.A02(r2);
    }

    public final boolean CQ0(AnonymousClass80V r3) {
        0qQ.A0B(r3, 0);
        if (this.A01.A00.first == r3) {
            return true;
        }
        return false;
    }

    public final void A7x(AnonymousClass80V r2, AnonymousClass80V r3, Class cls) {
        this.A01.A03(cls, r2, r3);
    }

    public final AnonymousClass80V Atr() {
        Object obj = this.A01.A00.first;
        0qQ.A07(obj);
        return (AnonymousClass80V) obj;
    }

    public final AnonymousClass80X Ats() {
        Object obj = this.A02.A00.first;
        0qQ.A07(obj);
        return (AnonymousClass80X) obj;
    }

    public final boolean CZU() {
        if (this.A02.A00.first == AnonymousClass80X.POST_CAPTURE) {
            return true;
        }
        return false;
    }

    public final boolean CZe() {
        if (this.A02.A00.first == AnonymousClass80X.PRE_CAPTURE) {
            return true;
        }
        return false;
    }

    public final void E3H(Object obj) {
        this.A01.A04(obj);
    }

    public AnonymousClass80T() {
        AnonymousClass80Y r0;
        AnonymousClass80W r2 = new AnonymousClass80W(AnonymousClass80X.UNINITIALIZED);
        this.A02 = r2;
        if (r2.A00.first == AnonymousClass80X.POST_CAPTURE) {
            r0 = AnonymousClass80Y.EDITING;
        } else {
            r0 = AnonymousClass80Y.CURATION;
        }
        AnonymousClass80Z r1 = new AnonymousClass80Z(r0);
        this.A00 = r1;
        r2.A02(new C3493480a(r1));
    }
}
