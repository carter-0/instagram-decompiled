package X;

/* renamed from: X.WpB  reason: case insensitive filesystem */
public final class C20316WpB implements Runnable {
    public final /* synthetic */ H5B A00;
    public final /* synthetic */ C307786Rm A01;
    public final /* synthetic */ C276544tV A02;
    public final /* synthetic */ C277014uI A03;

    public C20316WpB(H5B h5b, C307786Rm r2, C276544tV r3, C277014uI r4) {
        this.A00 = h5b;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void run() {
        C277014uI r3 = this.A03;
        C276544tV r2 = this.A02;
        C307786Rm r1 = this.A01;
        if (r3 != null) {
            C307886Rw.A03(r1, r2, Pxj.A0a(r1), r3);
        }
    }
}
