package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public abstract class E3K extends AnonymousClass4DH implements AnonymousClass4DS, C227332j2 {
    public static final String __redex_internal_original_name = "OpalBaseFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final C50303FXi A01 = new C50303FXi(this);

    public void A08(boolean z) {
        FragmentActivity requireActivity = requireActivity();
        UserSession A0l = AnonymousClass7TE.A0l(this.A00);
        if (z) {
            C317756nm.A03(requireActivity, this, A0l, true, false);
        } else {
            C317756nm.A02(requireActivity, this, A0l, true, false);
        }
    }

    public void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        boolean A07 = C61670oa.A07();
        Context requireContext = requireContext();
        int i = R.color.black;
        if (A07) {
            i = R.color.igds_prism_black;
        }
        Drawable drawable = requireContext.getDrawable(i);
        if (drawable != null) {
            r4.ENd(drawable);
        }
        A08(true);
    }

    public final UserSession A07() {
        return AnonymousClass7TE.A0l(this.A00);
    }

    public final boolean Ez8() {
        if (!(this instanceof EO2)) {
            return true;
        }
        EO2 eo2 = (EO2) this;
        AnonymousClass0eM r4 = eo2.A00;
        UserSession A0l = AnonymousClass7TE.A0l(r4);
        if (!182.A06(AnonymousClass7TF.A0H(A0l), A0l, 36321082429547603L) || !2R8.A05(AnonymousClass7TE.A0l(r4), eo2.A05)) {
            return false;
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1103621507);
        E3K.super.onCreate(bundle);
        addFragmentVisibilityListener(this.A01);
        A08(true);
        AnonymousClass0fD.A09(1603707508, A02);
    }

    public void onDestroy() {
        int A02 = AnonymousClass0fD.A02(-1799972432);
        super.onDestroy();
        removeFragmentVisibilityListener(this.A01);
        AnonymousClass0fD.A09(-1269920532, A02);
    }

    public final void onPause() {
        boolean z;
        int A02 = AnonymousClass0fD.A02(1830172168);
        E3K.super.onPause();
        if (!(this instanceof C47948ENz) && !(this instanceof C47947ENy)) {
            if (this instanceof EO2) {
                z = ((EO2) this).A09;
            } else if (!(this instanceof EO1)) {
                z = ((EO0) this).A00;
            }
            if (z) {
                A08(false);
            }
        }
        AnonymousClass0fD.A09(1995773103, A02);
    }

    public void onResume() {
        int A02 = AnonymousClass0fD.A02(1330730282);
        super.onResume();
        A08(true);
        AnonymousClass0fD.A09(-2075290763, A02);
    }
}
