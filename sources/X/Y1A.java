package X;

import java.util.Arrays;

public final class Y1A implements 1aL, C65051aA {
    public C65051aA A00;
    public boolean A01;
    public final 1aL A02;
    public final C3033668l A03;
    public final C3033668l A04;
    public final C3033868n A05;
    public final C3033868n A06;

    public final void DUK(Object obj) {
        if (!this.A01) {
            try {
                this.A06.accept(obj);
                this.A02.DUK(obj);
            } catch (Throwable th) {
                C9877Riq.A00(th);
                this.A00.dispose();
                onError(th);
            }
        }
    }

    public final void Do4(C65051aA r2) {
        if (1af.A02(this.A00, r2)) {
            this.A00 = r2;
            this.A02.Do4(this);
        }
    }

    public final void dispose() {
        this.A00.dispose();
    }

    public final void onComplete() {
        if (!this.A01) {
            try {
                this.A04.run();
                this.A01 = true;
                this.A02.onComplete();
                try {
                    this.A03.run();
                } catch (Throwable th) {
                    C9877Riq.A00(th);
                    C318176oW.A01(th);
                }
            } catch (Throwable th2) {
                C9877Riq.A00(th2);
                onError(th2);
            }
        }
    }

    public final void onError(Throwable th) {
        if (this.A01) {
            C318176oW.A01(th);
            return;
        }
        this.A01 = true;
        try {
            this.A05.accept(th);
        } catch (Throwable th2) {
            C9877Riq.A00(th2);
            th = new C13225TQr(Arrays.asList(new Throwable[]{th, th2}));
        }
        this.A02.onError(th);
        try {
            this.A03.run();
        } catch (Throwable th3) {
            C9877Riq.A00(th3);
            C318176oW.A01(th3);
        }
    }

    public Y1A(1aL r1, C3033668l r2, C3033668l r3, C3033868n r4, C3033868n r5) {
        this.A02 = r1;
        this.A06 = r4;
        this.A05 = r5;
        this.A04 = r2;
        this.A03 = r3;
    }
}
