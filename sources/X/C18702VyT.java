package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.VyT  reason: case insensitive filesystem */
public final class C18702VyT {
    public static final Rect A00 = new Rect();

    public static void A00(View view, Rect rect) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (parent instanceof X7W) {
                X7W x7w = (X7W) parent;
                if (x7w.getRemoveClippedSubviews()) {
                    Rect rect2 = A00;
                    x7w.Anq(rect2);
                    if (rect2.intersect(view.getLeft(), view.getTop() + ((int) view.getTranslationY()), view.getRight(), view.getBottom() + ((int) view.getTranslationY()))) {
                        rect2.offset(-view.getLeft(), -view.getTop());
                        rect2.offset(-((int) view.getTranslationX()), -((int) view.getTranslationY()));
                        rect2.offset(view.getScrollX(), view.getScrollY());
                        rect.set(rect2);
                        return;
                    }
                }
            }
            view.getDrawingRect(rect);
            return;
        }
        rect.setEmpty();
    }
}
