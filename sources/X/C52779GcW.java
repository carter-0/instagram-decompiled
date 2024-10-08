package X;

import android.app.Dialog;
import android.util.Log;
import android.view.WindowManager;

/* renamed from: X.GcW  reason: case insensitive filesystem */
public final class C52779GcW extends Dialog {
    public final void show() {
        0ob r0 = 0ob.A03;
        if (r0 != null) {
            boolean A06 = 182.A06(0Tu.A05, 0ob.A00(r0), 36325768237757646L);
            if (Boolean.valueOf(A06) != null && A06) {
                try {
                    super.show();
                    return;
                } catch (WindowManager.BadTokenException e) {
                    Log.e("IgdsDialog", "Failed to show dialog", e);
                    return;
                }
            }
        }
        super.show();
    }
}
