package X;

import android.graphics.drawable.ColorDrawable;
import android.widget.FrameLayout;

/* renamed from: X.4cT  reason: invalid class name and case insensitive filesystem */
public abstract class C267924cT extends FrameLayout implements C267934cU {
    public ColorDrawable A00;

    public final ColorDrawable getPlaceHolderDrawable() {
        return this.A00;
    }

    public final void setPlaceHolderColor(int i) {
        this.A00 = new ColorDrawable(i);
    }

    public void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(471924653);
        super.onDetachedFromWindow();
        Dz8();
        AnonymousClass0fD.A0D(-1497581712, A06);
    }
}
