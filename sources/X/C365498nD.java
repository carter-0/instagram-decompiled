package X;

/* renamed from: X.8nD  reason: invalid class name and case insensitive filesystem */
public final class C365498nD {
    public final AnonymousClass9GD A00 = new AnonymousClass9GD();

    public C365498nD() {
    }

    public final void A00(Exception exc) {
        this.A00.A0B(exc);
    }

    public final void A01(Object obj) {
        this.A00.A0C(obj);
    }

    public final boolean A02(Exception exc) {
        AnonymousClass9GD r3 = this.A00;
        AnonymousClass3Qk.A03(exc, "Exception must not be null");
        synchronized (r3.A04) {
            if (r3.A02) {
                return false;
            }
            r3.A02 = true;
            r3.A00 = exc;
            r3.A03.A01(r3);
            return true;
        }
    }

    public C365498nD(C10272RpW rpW) {
        rpW.A00.A04(new AW9(new AWB(this)), AnonymousClass9GH.A00);
    }
}
