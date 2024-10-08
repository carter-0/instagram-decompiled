package X;

import android.view.View;

/* renamed from: X.Oly  reason: case insensitive filesystem */
public final class C71507Oly implements X21 {
    public final /* synthetic */ int A00;

    public C71507Oly(int i) {
        this.A00 = i;
    }

    public final void FHo(View view, float f) {
        view.setTranslationX(((float) (-this.A00)) * f);
        float abs = 1.0f - (Math.abs(f) * 0.25f);
        view.setScaleY(abs);
        view.setScaleX(abs);
    }
}
