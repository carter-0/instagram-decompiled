package X;

import android.content.Context;

/* renamed from: X.QbR  reason: case insensitive filesystem */
public final class C7843QbR extends U3r {
    public final 0lg A00;
    public final C9847RiJ A01;

    public C7843QbR(Context context, 0lg r2, C9847RiJ riJ) {
        super(context);
        this.A00 = r2;
        this.A01 = riJ;
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(2015222884);
        super.onAttachedToWindow();
        if (this.A01 != null) {
            T8A t8a = (T8A) 1WM.getInstance().getPerformanceLogger(this.A00);
            Pxh.A1S(t8a.A0K);
            t8a.Cje();
        }
        AnonymousClass0fD.A0D(1411489335, A06);
    }
}
