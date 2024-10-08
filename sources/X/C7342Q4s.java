package X;

/* renamed from: X.Q4s  reason: case insensitive filesystem */
public final class C7342Q4s implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ RF9 A01;
    public final /* synthetic */ C7341Q4r A02;

    public C7342Q4s(RF9 rf9, C7341Q4r q4r, float f) {
        this.A02 = q4r;
        this.A01 = rf9;
        this.A00 = f;
    }

    public final void run() {
        this.A02.A00.DiX(this.A01, this.A00);
    }
}
