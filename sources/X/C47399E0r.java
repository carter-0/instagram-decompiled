package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.E0r  reason: case insensitive filesystem */
public final class C47399E0r extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ClipsBrandSurveyLearnMoreFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "clips_brand_survey_learn_more";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C50109FOz.A00(view.findViewById(R.id.got_it_button), 30, this);
        C50109FOz.A00(view.findViewById(R.id.read_our_data_policy_link), 31, this);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(800325658);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.brand_survey_learn_more, viewGroup, false);
        AnonymousClass0fD.A09(1822122906, A02);
        return inflate;
    }
}
