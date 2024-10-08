package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class E0V extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "FanClubApproximateEarningsInfoFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1450257229);
        0qQ.A0B(layoutInflater, 0);
        E0V.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.fan_club_approximate_earnings_info_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1001313884, A02);
        return inflate;
    }
}
