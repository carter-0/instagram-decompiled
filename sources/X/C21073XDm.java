package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.XDm  reason: case insensitive filesystem */
public final class C21073XDm extends AtomicReference implements 1aL, C65051aA {
    public int A00;
    public C3029566q A01;
    public final int A02;
    public final C22550Y9d A03;
    public volatile boolean A04;

    public final void DUK(Object obj) {
        if (this.A00 == 0) {
            this.A01.offer(obj);
            ((C21072XDl) this.A03).AQE();
            return;
        }
        this.A03.AQE();
    }

    public final void onComplete() {
        this.A04 = true;
        ((C21072XDl) this.A03).AQE();
    }

    public final void onError(Throwable th) {
        C21072XDl xDl = (C21072XDl) this.A03;
        if (C22013Xr3.A02(th, xDl.A09)) {
            if (xDl.A0A == AnonymousClass05K.A00) {
                xDl.A02.dispose();
            }
            this.A04 = true;
            xDl.AQE();
            return;
        }
        C318176oW.A01(th);
    }

    public C21073XDm(C22550Y9d y9d, int i) {
        this.A03 = y9d;
        this.A02 = i;
    }

    public final void Do4(C65051aA r4) {
        C3029466p r42;
        if (1af.A03(r4, this)) {
            if (r4 instanceof AnonymousClass66o) {
                C3029466p r43 = (C3029466p) r4;
                int EHR = r43.EHR(3);
                if (EHR == 1) {
                    this.A00 = EHR;
                    this.A01 = r43;
                    this.A04 = true;
                    this.A04 = true;
                    ((C21072XDl) this.A03).AQE();
                    return;
                } else if (EHR == 2) {
                    this.A00 = EHR;
                    r42 = r43;
                    this.A01 = r42;
                }
            }
            int i = -this.A02;
            if (i < 0) {
                r42 = new XCy(-i);
            } else {
                r42 = new XDL(i);
            }
            this.A01 = r42;
        }
    }

    public final void dispose() {
        1af.A01(this);
    }
}
