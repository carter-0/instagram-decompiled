package X;

import android.view.View;

public final class WBU implements View.OnLayoutChangeListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;

    public WBU(View view, View view2, float f) {
        this.A02 = view;
        this.A01 = view2;
        this.A00 = f;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C18531Vtj vtj = C18531Vtj.A00;
        View view2 = this.A02;
        View view3 = this.A01;
        vtj.A00(view2, view3, this.A00);
        view3.removeOnLayoutChangeListener(this);
    }
}
