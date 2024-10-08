package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import com.facebook.litho.LithoView;

public final class WCH implements ViewTreeObserver.OnPreDrawListener {
    public final int A00;
    public final LithoView A01;

    public final boolean onPreDraw() {
        LithoView lithoView = this.A01;
        if (lithoView.getMeasuredWidth() == 0 || lithoView.getMeasuredHeight() == 0) {
            return true;
        }
        Drawable mutate = new ColorDrawable(this.A00).mutate();
        0qQ.A07(mutate);
        mutate.setAlpha(175);
        mutate.setBounds(0, 0, lithoView.getMeasuredWidth(), lithoView.getMeasuredHeight());
        lithoView.getOverlay().add(mutate);
        C13988Tno.A12(lithoView, this);
        return true;
    }

    public WCH(LithoView lithoView, int i) {
        this.A01 = lithoView;
        this.A00 = i;
    }
}
