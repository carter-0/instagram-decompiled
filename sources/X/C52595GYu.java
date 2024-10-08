package X;

/* renamed from: X.GYu  reason: case insensitive filesystem */
public final class C52595GYu implements Runnable {
    public final /* synthetic */ C52593GYs A00;

    public C52595GYu(C52593GYs gYs) {
        this.A00 = gYs;
    }

    public final void run() {
        C52593GYs gYs = this.A00;
        int i = C52593GYs.A0A;
        gYs.A06.postDelayed(this, 1000);
        gYs.A00++;
    }
}
