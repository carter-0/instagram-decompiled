package X;

import android.view.View;

/* renamed from: X.AOg  reason: case insensitive filesystem */
public final class C40024AOg implements View.OnLayoutChangeListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;

    public C40024AOg(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        float f = this.A00;
        view.setScaleX(f);
        view.setScaleY(f);
        view.setTranslationY(AnonymousClass7TE.A03(view) * this.A01 * f);
    }
}
