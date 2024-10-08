package X;

import android.view.TextureView;

/* renamed from: X.6kV  reason: invalid class name and case insensitive filesystem */
public abstract class C315756kV extends TextureView {
    public Y8V A00;

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(-611666345);
        super.onAttachedToWindow();
        AnonymousClass0fD.A0D(386020713, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(-191577135);
        super.onDetachedFromWindow();
        AnonymousClass0fD.A0D(1096905583, A06);
    }

    public void setManagedSurfaceCallback(Y8V y8v) {
        this.A00 = y8v;
    }
}
