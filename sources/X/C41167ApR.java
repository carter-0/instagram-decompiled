package X;

/* renamed from: X.ApR  reason: case insensitive filesystem */
public final class C41167ApR implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass9H7 A01;
    public final /* synthetic */ C331157Pu A02;

    public C41167ApR(AnonymousClass9H7 r1, C331157Pu r2, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = r2;
    }

    public final void run() {
        2dZ r0 = this.A01.A04;
        if (r0 != null) {
            r0.A0O.setBackgroundColor(this.A00);
        }
        C331157Pu r1 = this.A02;
        if (r1 != null) {
            int i = this.A00;
            r1.A0B(i, i);
        }
    }
}
