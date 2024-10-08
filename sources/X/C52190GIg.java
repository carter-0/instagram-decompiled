package X;

import android.view.ViewTreeObserver;
import com.facebook.litho.widget.LithoScrollView;

/* renamed from: X.GIg  reason: case insensitive filesystem */
public final class C52190GIg implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ GIM A00;
    public final /* synthetic */ LithoScrollView A01;

    public C52190GIg(GIM gim, LithoScrollView lithoScrollView) {
        this.A01 = lithoScrollView;
        this.A00 = gim;
    }

    public final boolean onPreDraw() {
        LithoScrollView lithoScrollView = this.A01;
        lithoScrollView.setScrollY(this.A00.A00);
        ViewTreeObserver viewTreeObserver = lithoScrollView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        return true;
    }
}
