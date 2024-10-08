package X;

import android.view.View;

/* renamed from: X.IaE  reason: case insensitive filesystem */
public final class C57408IaE implements AnonymousClass3TK {
    public final View A00;

    public final /* synthetic */ void CvC() {
    }

    public final void CvR(boolean z, float f) {
        View view = this.A00;
        view.setScaleX(f);
        view.setScaleY(f);
        if (z) {
            f = (float) Math.min(Math.max((double) f, (double) view.getAlpha()), 1.0d);
        }
        view.setAlpha(f);
    }

    public C57408IaE(View view) {
        this.A00 = view;
    }
}
