package X;

import androidx.core.widget.NestedScrollView;

/* renamed from: X.TpF  reason: case insensitive filesystem */
public final class C14067TpF implements C585602l {
    public final /* synthetic */ NestedScrollView A00;

    public final boolean Ews(float f) {
        if (f == 0.0f) {
            return false;
        }
        Ey9();
        this.A00.A0B((int) f);
        return true;
    }

    public C14067TpF(NestedScrollView nestedScrollView) {
        this.A00 = nestedScrollView;
    }

    public final float BpZ() {
        return -this.A00.getVerticalScrollFactorCompat();
    }

    public final void Ey9() {
        NestedScrollView nestedScrollView = this.A00;
        float f = NestedScrollView.A0T;
        nestedScrollView.A09.abortAnimation();
    }
}
