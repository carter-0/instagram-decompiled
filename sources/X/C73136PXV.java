package X;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.util.Rational;
import android.view.View;

/* renamed from: X.PXV  reason: case insensitive filesystem */
public final class C73136PXV implements Runnable {
    public final /* synthetic */ C69103Nei A00;

    public C73136PXV(C69103Nei nei) {
        this.A00 = nei;
    }

    public final void run() {
        Rational rational;
        try {
            C69103Nei nei = this.A00;
            if (nei.A05 && AnonymousClass7TF.A1Z(nei.A0E) && (rational = nei.A02) != null) {
                C69103Nei.A00((Rect) null, rational, nei);
                if (Build.VERSION.SDK_INT == 31) {
                    Activity activity = nei.A07;
                    View A0A = C66581MXm.A0A(activity);
                    0qQ.A07(A0A);
                    activity.getWindowManager().updateViewLayout(A0A, A0A.getLayoutParams());
                }
            }
        } catch (Exception e) {
            0wb.A06("RtcCallPipPresenter", "Failed to update PIP params", e);
        }
    }
}
