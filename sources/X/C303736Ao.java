package X;

/* renamed from: X.6Ao  reason: invalid class name and case insensitive filesystem */
public final class C303736Ao implements 1aL, C65051aA {
    public C65051aA A00;
    public boolean A01;
    public final 1aL A02;
    public final 1aO A03;

    public final void DUK(Object obj) {
        if (!this.A01) {
            try {
                if (!this.A03.test(obj)) {
                    this.A01 = true;
                    this.A00.dispose();
                    1aL r1 = this.A02;
                    r1.DUK(false);
                    r1.onComplete();
                }
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
            this.A01 = true;
            1aL r1 = this.A02;
            r1.DUK(true);
            r1.onComplete();
        }
    }

    public final void onError(Throwable th) {
        if (this.A01) {
            C318176oW.A01(th);
            return;
        }
        this.A01 = true;
        this.A02.onError(th);
    }

    public C303736Ao(1aL r1, 1aO r2) {
        this.A02 = r1;
        this.A03 = r2;
    }
}
