package X;

import android.view.View;

public final class M9V implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ LMT A01;
    public final /* synthetic */ 2D6 A02;
    public final /* synthetic */ String A03;

    public M9V(View view, LMT lmt, 2D6 r3, String str) {
        this.A01 = lmt;
        this.A00 = view;
        this.A02 = r3;
        this.A03 = str;
    }

    public final void run() {
        LMT lmt = this.A01;
        View view = this.A00;
        String A0d = AnonymousClass7TF.A0d(view.getResources(), 2131971861);
        LMT.A00(view, lmt, new KSM(lmt, this.A02, this.A03), C226262fy.ABOVE_ANCHOR, A0d);
    }
}
