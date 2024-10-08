package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* renamed from: X.WiL  reason: case insensitive filesystem */
public final class C19948WiL implements Runnable {
    public final /* synthetic */ C19058WIk A00;

    public C19948WiL(C19058WIk wIk) {
        this.A00 = wIk;
    }

    public final void run() {
        int scrollY;
        float y;
        int height;
        C19058WIk wIk = this.A00;
        if (wIk.A01 != null) {
            ViewGroup viewGroup = wIk.A04;
            ViewGroup viewGroup2 = (ViewGroup) C13988Tno.A0G(viewGroup);
            if (viewGroup2 != null) {
                boolean z = wIk.A05;
                if (z) {
                    scrollY = viewGroup.getScrollX();
                } else {
                    scrollY = viewGroup.getScrollY();
                }
                for (int i = wIk.A01.A00; i < viewGroup2.getChildCount(); i++) {
                    View childAt = viewGroup2.getChildAt(i);
                    if (z) {
                        y = childAt.getX();
                        height = childAt.getWidth();
                    } else {
                        y = childAt.getY();
                        height = childAt.getHeight();
                    }
                    if (y + ((float) height) > ((float) scrollY) || i == viewGroup2.getChildCount() - 1) {
                        wIk.A02 = new WeakReference(childAt);
                        Rect rect = new Rect();
                        childAt.getHitRect(rect);
                        wIk.A00 = rect;
                        return;
                    }
                }
            }
        }
    }
}
