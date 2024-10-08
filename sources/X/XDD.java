package X;

import java.util.concurrent.TimeUnit;

public final class XDD implements 1aL, C65051aA {
    public C65051aA A00;
    public final long A01;
    public final 1aL A02;
    public final C318286oh A03;
    public final TimeUnit A04;

    public final void DUK(Object obj) {
        this.A03.A01(new XDE(this, obj), this.A04, this.A01);
    }

    public final void Do4(C65051aA r2) {
        if (1af.A02(this.A00, r2)) {
            this.A00 = r2;
            this.A02.Do4(this);
        }
    }

    public final void dispose() {
        this.A00.dispose();
        this.A03.dispose();
    }

    public final void onComplete() {
        this.A03.A01(new Y2A(this), this.A04, this.A01);
    }

    public final void onError(Throwable th) {
        this.A03.A01(new C22415Y2x(this, th), this.A04, 0);
    }

    public XDD(1aL r1, C318286oh r2, TimeUnit timeUnit, long j) {
        this.A02 = r1;
        this.A01 = j;
        this.A04 = timeUnit;
        this.A03 = r2;
    }
}
