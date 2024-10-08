package X;

public final class Y19 implements 1aL, C65051aA {
    public C65051aA A00;
    public Object A01;
    public boolean A02;
    public final C21099XEn A03;
    public final 1aL A04;

    public final void DUK(Object obj) {
        if (!this.A02) {
            try {
                Object apply = this.A03.A00.apply(this.A01, obj);
                1aP.A01(apply, "The accumulator returned a null value");
                this.A01 = apply;
                this.A04.DUK(apply);
            } catch (Throwable th) {
                C9877Riq.A00(th);
                this.A00.dispose();
                onError(th);
            }
        }
    }

    public final void Do4(C65051aA r3) {
        if (1af.A02(this.A00, r3)) {
            this.A00 = r3;
            1aL r1 = this.A04;
            r1.Do4(this);
            r1.DUK(this.A01);
        }
    }

    public final void dispose() {
        this.A00.dispose();
    }

    public final void onComplete() {
        if (!this.A02) {
            this.A02 = true;
            this.A04.onComplete();
        }
    }

    public final void onError(Throwable th) {
        if (this.A02) {
            C318176oW.A01(th);
            return;
        }
        this.A02 = true;
        this.A04.onError(th);
    }

    public Y19(C21099XEn xEn, 1aL r2, Object obj) {
        this.A04 = r2;
        this.A03 = xEn;
        this.A01 = obj;
    }
}
