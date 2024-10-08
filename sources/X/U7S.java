package X;

import android.view.View;
import android.widget.PopupWindow;

public final class U7S extends AnonymousClass0uU {
    public final int A00;
    public final Object A01;

    public U7S(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void CvE(View view) {
        View view2;
        View view3;
        switch (this.A00) {
            case 0:
                2X4 r2 = ((C19886WhH) this.A01).A00;
                r2.A0M.setAlpha(1.0f);
                r2.A0O.A07((AnonymousClass04L) null);
                r2.A0O = null;
                return;
            case 1:
                2X4 r22 = ((WDI) this.A01).A01;
                r22.A0M.setVisibility(8);
                PopupWindow popupWindow = r22.A0B;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (r22.A0M.getParent() instanceof View) {
                    ((View) r22.A0M.getParent()).requestApplyInsets();
                }
                r22.A0M.A04();
                r22.A0O.A07((AnonymousClass04L) null);
                r22.A0O = null;
                view2 = r22.A09;
                break;
            case 2:
                U5n u5n = (U5n) this.A01;
                if (u5n.A0D && (view3 = u5n.A03) != null) {
                    view3.setTranslationY(0.0f);
                    u5n.A08.setTranslationY(0.0f);
                }
                u5n.A08.setVisibility(8);
                u5n.A08.setTransitioning(false);
                u5n.A07 = null;
                X8B x8b = u5n.A05;
                if (x8b != null) {
                    x8b.D8S(u5n.A06);
                    u5n.A06 = null;
                    u5n.A05 = null;
                }
                view2 = u5n.A0A;
                if (view2 == null) {
                    return;
                }
                break;
            default:
                U5n u5n2 = (U5n) this.A01;
                u5n2.A07 = null;
                u5n2.A08.requestLayout();
                return;
        }
        view2.requestApplyInsets();
    }

    public final void CvM(View view) {
        if (this.A00 != 0) {
            super.CvM(view);
        } else {
            ((C19886WhH) this.A01).A00.A0M.setVisibility(0);
        }
    }
}
