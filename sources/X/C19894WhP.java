package X;

/* renamed from: X.WhP  reason: case insensitive filesystem */
public final class C19894WhP implements Runnable {
    public final /* synthetic */ WDV A00;

    public C19894WhP(WDV wdv) {
        this.A00 = wdv;
    }

    public final void run() {
        U5Q u5q = this.A00.A0A;
        if (u5q != null) {
            u5q.A07 = true;
            u5q.requestLayout();
        }
    }
}
