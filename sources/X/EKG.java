package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;

public final class EKG extends E0Q {
    public static final String __redex_internal_original_name = "RemoveUnsendInterstitialFragment";

    public final String getModuleName() {
        return "remove_unsend_interstitial_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0G = AnonymousClass7TF.A0G(view, R.id.wellbeing_interstitial_list);
        0nA.A0d(A0G, 0);
        0nA.A0U(A0G, 0);
        int dimensionPixelSize = DbV.A05(this).getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
        0nA.A0h(A0G, dimensionPixelSize, dimensionPixelSize);
    }
}
