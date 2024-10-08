package X;

import android.graphics.Rect;
import android.view.View;

public final class IDB implements View.OnLayoutChangeListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public IDB(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.A00;
        view.removeOnLayoutChangeListener(this);
        if (i9 != 0) {
            View view2 = (View) this.A02;
            int A022 = AnonymousClass7TG.A02(view2.getContext());
            int i10 = this.A01;
            C51976G9y.A0P(new Rect(0, 0, A022, i10), view2, A022, i10);
            return;
        }
        C56626I5e i5e = (C56626I5e) this.A02;
        C56626I5e.A01(i5e, (this.A01 * i5e.A01.getWidth()) / 100, C51968G9o.A04(i5e.A00));
    }
}
