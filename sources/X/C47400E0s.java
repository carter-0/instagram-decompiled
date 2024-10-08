package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.E0s  reason: case insensitive filesystem */
public final class C47400E0s extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ReelFundraiserAmountRaisedDisclaimerBottomsheetFragment";
    public AnonymousClass0wW A00;

    public final String getModuleName() {
        return "reel_fundraiser_amount_raised_disclaimer_bottomsheet_fragment";
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-2032076819);
        C47400E0s.super.onCreate(bundle);
        this.A00 = DbS.A0T(C227642jf.A02(this));
        AnonymousClass0fD.A09(13174517, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1949458806);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.reel_dashboard_fundraiser_results_amount_raised_disclaimer, viewGroup, false);
        AnonymousClass0fD.A09(1089689941, A02);
        return inflate;
    }
}
