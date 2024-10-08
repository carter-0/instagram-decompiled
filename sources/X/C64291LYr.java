package X;

import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;

/* renamed from: X.LYr  reason: case insensitive filesystem */
public final class C64291LYr implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C64291LYr(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final void onGlobalLayout() {
        int i;
        switch (this.A00) {
            case 0:
                C66545MVz mVz = ((KB5) this.A02).A0R;
                mVz.CEp().removeOnGlobalLayoutListener(this);
                mVz.EKa(this.A01, mVz.CDb());
                return;
            case 1:
                NestedScrollView nestedScrollView = (NestedScrollView) this.A02;
                nestedScrollView.post(new C65979M6q(nestedScrollView, this.A01));
                C51967G9n.A0y(nestedScrollView, this);
                return;
            default:
                C65063Lmh lmh = (C65063Lmh) this.A02;
                C60715Jq4 jq4 = lmh.A03;
                if (jq4 != null) {
                    ViewTreeObserver viewTreeObserver = jq4.getViewTreeObserver();
                    if (viewTreeObserver != null) {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    }
                    boolean A022 = 2Ht.A02(lmh.A04);
                    C60715Jq4 jq42 = lmh.A03;
                    if (A022) {
                        if (jq42 != null) {
                            i = this.A01;
                        }
                    } else if (jq42 != null) {
                        i = 0;
                    }
                    jq42.A1I(i);
                    return;
                }
                0qQ.A0F("filterPicker");
                throw AnonymousClass00P.createAndThrow();
        }
    }
}
