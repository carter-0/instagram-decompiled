package X;

import android.view.View;

public final class WBV implements View.OnLayoutChangeListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public WBV(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A01 = i;
        this.A02 = obj2;
        this.A03 = obj;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.A00 != 0) {
            C15670Ugb ugb = (C15670Ugb) this.A03;
            int i9 = ugb.A00;
            View view2 = (View) this.A02;
            if (i9 != 0) {
                if (i9 != view2.getHeight()) {
                    C15670Ugb.A00(ugb, this.A01 + (view2.getHeight() - ugb.A00));
                } else {
                    return;
                }
            }
            ugb.A00 = view2.getHeight();
            return;
        }
        float min = Math.min((((float) (this.A01 - ((AnonymousClass87F) this.A02).A03.A01)) * 0.7f) / ((float) (i4 - i2)), 1.0f);
        View view3 = (View) this.A03;
        view3.setScaleX(min);
        view3.setScaleY(min);
    }
}
