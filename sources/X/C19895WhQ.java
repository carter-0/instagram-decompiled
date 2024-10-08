package X;

/* renamed from: X.WhQ  reason: case insensitive filesystem */
public final class C19895WhQ implements Runnable {
    public final /* synthetic */ WDV A00;

    public C19895WhQ(WDV wdv) {
        this.A00 = wdv;
    }

    public final void run() {
        WDV wdv = this.A00;
        U5Q u5q = wdv.A0A;
        if (u5q != null && u5q.isAttachedToWindow() && wdv.A0A.getCount() > wdv.A0A.getChildCount()) {
            wdv.A0A.getChildCount();
            wdv.A09.setInputMethodMode(2);
            wdv.show();
        }
    }
}
