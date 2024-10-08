package X;

import android.view.View;

/* renamed from: X.Haq  reason: case insensitive filesystem */
public abstract class C55019Haq {
    public static final void A00(View view, 1Xj r5, AnonymousClass3W1 r6) {
        int A02 = DbW.A02(1, r5, r6);
        if (!r5.CeS() || r6.A0o == 1sy.A0U) {
            view.setImportantForAccessibility(A02);
            return;
        }
        2eS.A01(view);
        view.setImportantForAccessibility(1);
        DbU.A12(view.getContext(), view, 2131969500);
    }
}
