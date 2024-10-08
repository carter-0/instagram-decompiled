package X;

import java.util.concurrent.atomic.AtomicReference;

public final class XD0 extends AtomicReference implements 1aL {
    public int A00;
    public final long A01;
    public final XCz A02;
    public volatile C3029566q A03;
    public volatile boolean A04;

    public final void onComplete() {
        this.A04 = true;
        this.A02.A00();
    }

    public final void DUK(Object obj) {
        if (this.A00 == 0) {
            XCz xCz = this.A02;
            if (xCz.get() != 0 || !xCz.compareAndSet(0, 1)) {
                C3029566q r1 = this.A03;
                if (r1 == null) {
                    r1 = new XCy(xCz.A06);
                    this.A03 = r1;
                }
                r1.offer(obj);
                if (xCz.getAndIncrement() != 0) {
                    return;
                }
            } else {
                xCz.A08.DUK(obj);
                if (xCz.decrementAndGet() == 0) {
                    return;
                }
            }
            xCz.A01();
            return;
        }
        this.A02.A00();
    }

    public final void onError(Throwable th) {
        XCz xCz = this.A02;
        if (C22013Xr3.A02(th, xCz.A0A)) {
            xCz.A05();
            this.A04 = true;
            xCz.A00();
            return;
        }
        C318176oW.A01(th);
    }

    public XD0(XCz xCz, long j) {
        this.A01 = j;
        this.A02 = xCz;
    }

    public final void Do4(C65051aA r3) {
        if (1af.A03(r3, this) && (r3 instanceof AnonymousClass66o)) {
            C3029466p r32 = (C3029466p) r3;
            int EHR = r32.EHR(7);
            if (EHR == 1) {
                this.A00 = EHR;
                this.A03 = r32;
                this.A04 = true;
                this.A02.A00();
            } else if (EHR == 2) {
                this.A00 = EHR;
                this.A03 = r32;
            }
        }
    }
}
