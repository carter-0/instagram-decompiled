package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;

public final class EKH extends E0Q {
    public static final String __redex_internal_original_name = "UnsendWarningInterstitialFragment";

    public final String getModuleName() {
        return DbU.A0l(requireArguments(), AnonymousClass000.A00(246));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View requireViewById = view.requireViewById(R.id.wellbeing_interstitial_list);
        0nA.A0d(requireViewById, 0);
        0nA.A0U(requireViewById, 0);
        int dimensionPixelSize = DbV.A05(this).getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
        0nA.A0h(requireViewById, dimensionPixelSize, dimensionPixelSize);
    }
}
