package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.WfK  reason: case insensitive filesystem */
public final class C19777WfK implements C227182im {
    public final /* synthetic */ 0rm A00;

    public C19777WfK(0rm r1) {
        this.A00 = r1;
    }

    public final void DmH(int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        View view = (View) this.A00.A00;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.height = i + i2;
        }
    }
}
