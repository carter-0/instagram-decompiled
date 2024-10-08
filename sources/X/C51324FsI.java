package X;

/* renamed from: X.FsI  reason: case insensitive filesystem */
public final class C51324FsI implements Runnable {
    public final /* synthetic */ AnonymousClass3GH A00;

    public C51324FsI(AnonymousClass3GH r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass3GH r2 = this.A00;
        C227802jw r1 = r2.A0I;
        if (r1.mView != null) {
            r1.getScrollingViewProxy().Ejl(0);
            r2.A09.A07();
        }
    }
}
