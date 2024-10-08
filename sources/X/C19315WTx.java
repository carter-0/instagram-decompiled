package X;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.WTx  reason: case insensitive filesystem */
public final class C19315WTx implements AnonymousClass2eo {
    public final WeakReference A00;
    public final int[] A01 = new int[2];

    public final void Ann(Rect rect) {
        View view = (View) this.A00.get();
        if (view == null) {
            rect.setEmpty();
            return;
        }
        int[] iArr = this.A01;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getMeasuredWidth() + i, iArr[1] + view.getMeasuredHeight());
    }

    public C19315WTx(View view) {
        this.A00 = new WeakReference(view);
    }
}
