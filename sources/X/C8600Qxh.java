package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.Qxh  reason: case insensitive filesystem */
public final class C8600Qxh extends V4O {
    public final /* synthetic */ C8134QhS A00;
    public final /* synthetic */ BottomSheetBehavior A01;

    public final void A02(View view, int i) {
    }

    public C8600Qxh(C8134QhS qhS, BottomSheetBehavior bottomSheetBehavior) {
        this.A00 = qhS;
        this.A01 = bottomSheetBehavior;
    }

    public final void A01(View view, float f) {
        C8134QhS qhS = this.A00;
        if (C8134QhS.A03(qhS) && f == 0.0f && !qhS.A03) {
            int i = this.A01.A0G;
            if (i == 4 || i == 1) {
                qhS.A0A.invoke();
            }
        }
    }
}
