package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.XDf  reason: case insensitive filesystem */
public final class C21067XDf extends AtomicBoolean implements 1aL, C65051aA {
    public C65051aA A00;
    public final 1aL A01;
    public final C21102XEr A02;
    public final C21093XEh A03;

    public final void onComplete() {
        if (compareAndSet(false, true)) {
            this.A03.A03(this.A02);
            this.A01.onComplete();
        }
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.A03.A03(this.A02);
            this.A01.onError(th);
            return;
        }
        C318176oW.A01(th);
    }

    public final void DUK(Object obj) {
        this.A01.DUK(obj);
    }

    public final void Do4(C65051aA r2) {
        if (1af.A02(this.A00, r2)) {
            this.A00 = r2;
            this.A01.Do4(this);
        }
    }

    public final void dispose() {
        this.A00.dispose();
        if (compareAndSet(false, true)) {
            C21093XEh xEh = this.A03;
            C21102XEr xEr = this.A02;
            synchronized (xEh) {
                C21102XEr xEr2 = xEh.A00;
                if (xEr2 != null && xEr2 == xEr) {
                    long j = xEr.A00 - 1;
                    xEr.A00 = j;
                    if (j == 0 && xEr.A01) {
                        xEh.A04(xEr);
                    }
                }
            }
        }
    }

    public C21067XDf(1aL r1, C21102XEr xEr, C21093XEh xEh) {
        this.A01 = r1;
        this.A03 = xEh;
        this.A02 = xEr;
    }
}
