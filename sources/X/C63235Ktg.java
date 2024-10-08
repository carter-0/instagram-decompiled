package X;

import android.widget.LinearLayout;

/* renamed from: X.Ktg  reason: case insensitive filesystem */
public abstract class C63235Ktg {
    public static final void A00(KHK khk, C62444Kfu kfu) {
        float f;
        AnonymousClass7TF.A1H(khk, kfu);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        int A0C = AnonymousClass7TE.A0C(khk.getResources());
        layoutParams.setMarginStart(A0C);
        layoutParams.setMarginEnd(A0C);
        if (kfu == C62444Kfu.FIXED) {
            layoutParams.width = 0;
            f = 1.0f;
        } else {
            layoutParams.width = -2;
            f = 0.0f;
        }
        layoutParams.weight = f;
        khk.setLayoutParams(layoutParams);
    }
}
