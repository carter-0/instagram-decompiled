package X;

/* renamed from: X.XDc  reason: case insensitive filesystem */
public final class C21064XDc implements C65051aA, YCU {
    public YAH A00;
    public final 1aL A01;

    public final void DUK(Object obj) {
        this.A01.DUK(obj);
    }

    public final void Do5(YAH yah) {
        if (this.A00 != null) {
            yah.cancel();
            C318176oW.A01(new IllegalStateException("Subscription already set!"));
            return;
        }
        this.A00 = yah;
        this.A01.Do4(this);
        yah.EHJ(Long.MAX_VALUE);
    }

    public final void dispose() {
        this.A00.cancel();
        this.A00 = C21279XSj.A01;
    }

    public final void onComplete() {
        this.A01.onComplete();
    }

    public final void onError(Throwable th) {
        this.A01.onError(th);
    }

    public C21064XDc(1aL r1) {
        this.A01 = r1;
    }
}
