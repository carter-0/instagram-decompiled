package X;

import android.graphics.Rect;
import android.view.View;

public final class WBR implements View.OnLayoutChangeListener {
    public final U3r A00;

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        U3r u3r = this.A00;
        if (u3r.A07 && u3r.getParent() != null) {
            0Sd.A00(u3r.A01);
            0Sd.A00(u3r.A08);
            Rect rect = U3r.A0E;
            C13992Tns.A0b(view, rect);
            if (u3r.A01.intersects(rect.left, rect.top, rect.right, rect.bottom) != AnonymousClass7TF.A1V(view.getParent())) {
                int i9 = 0;
                for (int i10 = 0; i10 < u3r.A00; i10++) {
                    View view2 = u3r.A08[i10];
                    if (view2 == view) {
                        U3r.A03(u3r.A01, u3r, i10, i9);
                        return;
                    }
                    if (view2.getParent() == null) {
                        i9++;
                    }
                }
            }
        }
    }

    public WBR(U3r u3r) {
        this.A00 = u3r;
    }
}
