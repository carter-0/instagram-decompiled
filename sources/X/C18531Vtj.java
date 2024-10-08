package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.Vtj  reason: case insensitive filesystem */
public final class C18531Vtj {
    public static final C18531Vtj A00 = new Object();

    public final void A00(View view, View view2, float f) {
        0qQ.A0B(view2, 1);
        Rect rect = new Rect();
        view2.getGlobalVisibleRect(rect);
        int width = rect.width();
        if (width == 0) {
            view2.setAlpha(0.0f);
            view2.addOnLayoutChangeListener(new WBU(view, view2, f));
            return;
        }
        view2.setAlpha(C229632nm.A02(1.0f - (((((float) width) / ((float) view.getWidth())) * 100.0f) / (f * 100.0f)), 0.0f, 1.0f));
    }
}
