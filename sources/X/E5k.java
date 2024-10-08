package X;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public abstract class E5k extends AnonymousClass4DH implements C268594df {
    public static final String __redex_internal_original_name = "BaseManageDataSheetFragment";

    public final float CMx() {
        return 0.8f;
    }

    public final void DMt() {
    }

    public final void DMu(int i) {
    }

    public final boolean Erf() {
        return true;
    }

    public final void onBottomSheetClosed() {
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final int AqL() {
        if (this instanceof C47883ELd) {
            return ((C47883ELd) this).A00;
        }
        return -1;
    }

    public final View C4U() {
        return this.mView;
    }

    public final int C8P() {
        return 0;
    }

    public final boolean CPc() {
        if (this instanceof C47883ELd) {
            return false;
        }
        return true;
    }

    public final boolean isScrolledToTop() {
        return false;
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        String str;
        if (this instanceof C47882ELc) {
            C47882ELc eLc = (C47882ELc) this;
            int i3 = (-i) - i2;
            LinearLayout linearLayout = eLc.A02;
            if (linearLayout == null) {
                str = "buttonContainer";
            } else {
                float f = (float) i3;
                linearLayout.setTranslationY(f);
                Button button = eLc.A01;
                if (button == null) {
                    str = "saveButton";
                } else {
                    button.setTranslationY(f);
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final /* synthetic */ float CoU() {
        return 0.8f;
    }
}
