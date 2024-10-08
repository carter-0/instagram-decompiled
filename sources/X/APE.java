package X;

import android.view.View;
import android.view.ViewTreeObserver;

public final class APE implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C353298Hb A02;

    public APE(View view, C353298Hb r2, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = view;
    }

    public final void onGlobalLayout() {
        this.A02.A01.A08(this.A00);
        this.A01.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
