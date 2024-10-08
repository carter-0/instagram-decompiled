package X;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.3Dk  reason: invalid class name and case insensitive filesystem */
public final class C238783Dk implements AnonymousClass2eo {
    public final WeakReference A00;

    public final void Ann(Rect rect) {
        0qQ.A0B(rect, 0);
        View view = (View) this.A00.get();
        if (view != null) {
            view.getGlobalVisibleRect(rect);
        } else {
            rect.setEmpty();
        }
    }

    public C238783Dk(View view) {
        this.A00 = new WeakReference(view);
    }
}
