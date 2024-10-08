package X;

import android.widget.LinearLayout;

/* renamed from: X.KuU  reason: case insensitive filesystem */
public abstract class C63285KuU {
    public static final void A00(C62445Kfv kfv, C46720Djx djx) {
        float f;
        AnonymousClass7TF.A1H(djx, kfv);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (kfv == C62445Kfv.FIXED) {
            layoutParams.width = 0;
            f = 1.0f;
        } else {
            layoutParams.width = -2;
            f = 0.0f;
        }
        layoutParams.weight = f;
        djx.setLayoutParams(layoutParams);
    }
}
