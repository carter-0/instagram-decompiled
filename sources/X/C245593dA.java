package X;

import com.facebook.litho.LithoView;
import java.lang.ref.WeakReference;

/* renamed from: X.3dA  reason: invalid class name and case insensitive filesystem */
public final class C245593dA extends AnonymousClass0uK {
    public final WeakReference A00;

    public final void onAccessibilityStateChanged(boolean z) {
        synchronized (2VH.class) {
            2VH.A02 = false;
        }
        LithoView lithoView = (LithoView) this.A00.get();
        if (lithoView != null) {
            lithoView.A0O(z);
            lithoView.A04 = true;
            lithoView.requestLayout();
        }
    }

    public C245593dA(LithoView lithoView) {
        this.A00 = new WeakReference(lithoView);
    }
}
