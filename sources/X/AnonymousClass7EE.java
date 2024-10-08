package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.7EE  reason: invalid class name */
public final class AnonymousClass7EE implements AnonymousClass7EF {
    public View A00;

    public final void CDN(Rect rect) {
        View view = this.A00;
        if (view == null || !view.isAttachedToWindow()) {
            rect.setEmpty();
            return;
        }
        this.A00.getDrawingRect(rect);
        ((ViewGroup) this.A00.getRootView()).offsetDescendantRectToMyCoords(this.A00, rect);
    }
}
