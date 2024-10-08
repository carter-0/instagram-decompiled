package X;

import android.view.View;

/* renamed from: X.OhN  reason: case insensitive filesystem */
public final class C71282OhN implements View.OnAttachStateChangeListener {
    public final /* synthetic */ OHI A00;

    public final void onViewAttachedToWindow(View view) {
    }

    public C71282OhN(OHI ohi) {
        this.A00 = ohi;
    }

    public final void onViewDetachedFromWindow(View view) {
        C66819MdB mdB = this.A00.A00;
        if (mdB != null) {
            mdB.Dds();
        }
    }
}
