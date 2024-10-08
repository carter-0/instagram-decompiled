package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class UYo extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "SimilarAdvertiserBudgetDurationRecommendationBottomSheetFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "zero_outcome_warning_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Dbb.A0l(DbV.A05(this), AnonymousClass7TG.A0R(view, R.id.similar_business), 2131970256);
        Dbb.A0l(DbV.A05(this), AnonymousClass7TG.A0R(view, R.id.ad_spend), 2131970240);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1524862390);
        UYo.super.onCreate(bundle);
        AnonymousClass0fD.A09(402768414, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-547489905);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.similar_advertiser_budget_duration_recommendation_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(-292741526, A02);
        return inflate;
    }
}
