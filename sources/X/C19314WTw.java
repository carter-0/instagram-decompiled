package X;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.WTw  reason: case insensitive filesystem */
public final class C19314WTw implements AnonymousClass2eo {
    public final WeakReference A00;
    public final int[] A01 = new int[2];

    public final void Ann(Rect rect) {
        0qQ.A0B(rect, 0);
        View view = (View) this.A00.get();
        if (view != null) {
            int[] iArr = this.A01;
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            rect.set(i, iArr[1], view.getMeasuredWidth() + i, iArr[1] + view.getMeasuredHeight());
        }
    }

    public C19314WTw(View view) {
        this.A00 = new WeakReference(view);
    }
}
