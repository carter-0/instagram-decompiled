package X;

/* renamed from: X.8f0  reason: invalid class name and case insensitive filesystem */
public final class C360698f0 {
    public final C360758f6 A00;

    public final void A00(C361098ff r3) {
        Object obj;
        C360758f6 r1 = this.A00;
        if (r1 instanceof C361158fl) {
            if (r3 instanceof C361088fe) {
                obj = C46620Di0.A00(((C361088fe) r3).A00);
            } else if (r3 instanceof C379799Vi) {
                obj = ((C379799Vi) r3).A00;
            } else {
                throw new RuntimeException();
            }
        } else if (r1 instanceof C361168fm) {
            boolean z = r3 instanceof C361088fe;
            obj = r3;
            if (!z) {
                if (!(r3 instanceof C379799Vi)) {
                    throw new RuntimeException();
                }
                return;
            }
        } else if (!(r1 instanceof C361178fn)) {
            return;
        } else {
            if (r3 instanceof C361088fe) {
                obj = ((C361088fe) r3).A00;
            } else if (!(r3 instanceof C379799Vi)) {
                throw new RuntimeException();
            } else {
                return;
            }
        }
        r1.A05(obj);
    }

    public final void A01(C361098ff r10) {
        C360758f6 r1 = this.A00;
        if (r1 instanceof C360748f5) {
            if (!(r10 instanceof C361088fe)) {
                if (!(r10 instanceof C379799Vi)) {
                    throw new RuntimeException();
                }
                return;
            }
        } else if (!(r1 instanceof C385029iH)) {
            return;
        } else {
            if (r10 instanceof C361088fe) {
                C361088fe r102 = (C361088fe) r10;
                0qQ.A0B(r102, 1);
                r1.A05(new C379799Vi(C46620Di0.A00(r102.A00), r102.A00, r102.A02, r102.A01));
                return;
            } else if (!(r10 instanceof C379799Vi)) {
                throw new RuntimeException();
            }
        }
        r1.A05(r10);
    }

    public final void A02(C268654dm r2) {
        C360758f6 r0 = this.A00;
        if (r0 != null) {
            r0.A04(r2);
        }
    }

    public C360698f0(C360758f6 r1) {
        this.A00 = r1;
    }
}
