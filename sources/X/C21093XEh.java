package X;

/* renamed from: X.XEh  reason: case insensitive filesystem */
public final class C21093XEh extends 1aJ {
    public C21102XEr A00;
    public final int A01 = 1;
    public final C318206oZ A02;
    public final C3033168g A03;

    public C21093XEh(C318206oZ r2, C3033168g r3) {
        this.A03 = r3;
        this.A02 = r2;
    }

    public final void A02(1aL r8) {
        C21102XEr xEr;
        boolean z;
        synchronized (this) {
            xEr = this.A00;
            if (xEr == null) {
                xEr = new C21102XEr(this);
                this.A00 = xEr;
            }
            long j = xEr.A00 + 1;
            xEr.A00 = j;
            z = true;
            if (xEr.A01 || j != ((long) this.A01)) {
                z = false;
            } else {
                xEr.A01 = true;
            }
        }
        C3033168g r1 = this.A03;
        r1.Eyt(new C21067XDf(r8, xEr, this));
        if (z) {
            r1.A03(xEr);
        }
    }

    public final void A03(C21102XEr xEr) {
        synchronized (this) {
            C21102XEr xEr2 = this.A00;
            if (xEr2 != null && xEr2 == xEr) {
                this.A00 = null;
            }
            long j = xEr.A00 - 1;
            xEr.A00 = j;
            if (j == 0) {
                C3033168g r1 = this.A03;
                if (r1 instanceof C65051aA) {
                    ((C65051aA) r1).dispose();
                } else if (r1 instanceof C3033068f) {
                    1FH.A00((C65051aA) xEr.get(), (Object) null, ((C3033068f) r1).A03);
                }
            }
        }
    }

    public final void A04(C21102XEr xEr) {
        synchronized (this) {
            if (xEr.A00 == 0 && xEr == this.A00) {
                this.A00 = null;
                C65051aA r2 = (C65051aA) xEr.get();
                1af.A01(xEr);
                C3033168g r1 = this.A03;
                if (r1 instanceof C65051aA) {
                    ((C65051aA) r1).dispose();
                } else if (r1 instanceof C3033068f) {
                    if (r2 == null) {
                        xEr.A02 = true;
                    } else {
                        1FH.A00(r2, (Object) null, ((C3033068f) r1).A03);
                    }
                }
            }
        }
    }
}
