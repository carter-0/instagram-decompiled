package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.Hac  reason: case insensitive filesystem */
public abstract class C55005Hac {
    public static boolean A00(View view, double d) {
        if (view == null || view.getVisibility() != 0 || view.getParent() == null) {
            return false;
        }
        Rect A0W = AnonymousClass7TE.A0W();
        if (!view.getGlobalVisibleRect(A0W)) {
            return false;
        }
        long height = ((long) A0W.height()) * ((long) A0W.width());
        long height2 = ((long) view.getHeight()) * ((long) view.getWidth());
        return height2 > 0 && ((double) height) >= d * ((double) height2);
    }
}
