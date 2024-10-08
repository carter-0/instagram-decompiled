package X;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.M2r  reason: case insensitive filesystem */
public final class C65876M2r implements Runnable {
    public final /* synthetic */ C63847L9c A00;

    public C65876M2r(C63847L9c l9c) {
        this.A00 = l9c;
    }

    public final void run() {
        C63847L9c l9c = this.A00;
        Set keySet = l9c.A03.keySet();
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : keySet) {
            View view = (View) next;
            if (view.isShown() && view.getVisibility() == 0 && view.getParent() != null) {
                Rect rect = l9c.A01;
                if (view.getGlobalVisibleRect(rect)) {
                    int width = rect.width() * rect.height();
                    int width2 = view.getWidth() * view.getHeight();
                    if (width2 > 0 && ((float) (width / width2)) > 0.6f) {
                        A1C.add(next);
                    }
                }
            }
        }
        Set A0k = 00k.A0k(A1C);
        Set set = l9c.A04;
        set.clear();
        set.addAll(A0k);
        l9c.A00 = false;
    }
}
