package X;

public final class AUS implements B16 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AUS(C341737nR r1, Throwable th, int i) {
        this.A00 = i;
        this.A01 = r1;
        this.A02 = th;
    }

    public final void onFinished() {
        ((C341737nR) this.A01).onError((Throwable) this.A02);
    }
}
