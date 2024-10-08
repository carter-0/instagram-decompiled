package X;

import android.view.ViewTreeObserver;

public final class APD implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C362868ic A00;
    public final /* synthetic */ boolean A01;

    public APD(C362868ic r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void onGlobalLayout() {
        C362868ic r2 = this.A00;
        if (r2.A03) {
            r2.A02(this.A01);
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = r2.A01;
        if (onGlobalLayoutListener != null) {
            r2.A0D.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }
}
