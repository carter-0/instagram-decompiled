package X;

import android.graphics.Rect;
import android.view.View;

public final class ID8 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;

    public ID8(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        int i9 = this.A01;
        int i10 = this.A00;
        C51976G9y.A0P(new Rect(0, 0, i9, i10), view, i9, i10);
    }
}
