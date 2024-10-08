package X;

/* renamed from: X.8Ys  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8Ys implements AnonymousClass19L {
    public final /* synthetic */ Runnable A00;
    public final /* synthetic */ 132 A01;

    public /* synthetic */ AnonymousClass8Ys(Runnable runnable, 132 r2) {
        this.A01 = r2;
        this.A00 = runnable;
    }

    public final void dispose() {
        132 r0 = this.A01;
        r0.A00.removeCallbacks(this.A00);
    }
}
