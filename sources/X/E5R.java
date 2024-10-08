package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class E5R extends AnonymousClass4DH implements AnonymousClass4DU, G9c {
    public static final String __redex_internal_original_name = "SuperlativeNonNullStateBottomSheet";
    public View.OnClickListener A00 = C50096FOm.A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return "superlative";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final Integer BkZ() {
        return AnonymousClass05K.A0I;
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(950164640);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_superlative_non_null_state_bottomsheet, viewGroup, false);
        FP2.A00(AnonymousClass7TF.A0G(inflate, R.id.superlative_non_null_state_bottom_sheet_cta_button), 32, this);
        AnonymousClass0fD.A09(-913581895, A02);
        return inflate;
    }
}
