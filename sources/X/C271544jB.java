package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.4jB  reason: invalid class name and case insensitive filesystem */
public final class C271544jB implements View.OnLongClickListener {
    public final /* synthetic */ C247453gM A00;

    public C271544jB(C247453gM r1) {
        this.A00 = r1;
    }

    public final boolean onLongClick(View view) {
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            Rect rect = new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
            ViewParent parent = view.getParent();
            0qQ.A07(parent);
            ((0sL) this.A00.A00.A04).invoke(rect, parent);
        }
        return true;
    }
}
