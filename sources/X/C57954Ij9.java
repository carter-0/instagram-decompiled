package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.Ij9  reason: case insensitive filesystem */
public final class C57954Ij9 implements Runnable {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C255783ui A01;
    public final /* synthetic */ C316896mO A02;
    public final /* synthetic */ C317686nf A03;

    public C57954Ij9(C255773uh r1, C255783ui r2, C316896mO r3, C317686nf r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final void run() {
        C316896mO r5 = this.A02;
        C255773uh r4 = this.A00;
        C255783ui r3 = this.A01;
        View A002 = C316896mO.A00(r5);
        if (A002.getVisibility() == 0) {
            int width = r5.A03.getWidth();
            ViewParent parent = C316896mO.A00(r5).getParent();
            parent.getClass();
            C51975G9x.A10(A002, r4, r3, width, ((View) parent).getHeight());
        }
        C317686nf r1 = this.A03;
        if (r1 != null) {
            r1.DnC(C316896mO.A00(r5), r4, r3);
        }
    }
}
