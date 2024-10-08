package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

public final class UZD extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "PromoteSpecialRequirementsPolicyFragment";
    public View A00;
    public UserSession A01;
    public PromoteData A02;

    public final String getModuleName() {
        return "promote_special_requirements_policy";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View requireViewById = view.requireViewById(R.id.special_requirement_policy_layout);
        this.A00 = requireViewById;
        if (requireViewById != null) {
            AnonymousClass7TG.A0R(requireViewById, R.id.special_requirement_header_text).setText(2131970783);
            View view2 = this.A00;
            if (view2 != null) {
                AnonymousClass0fU.A00(new FP5(this, 12), AnonymousClass7TF.A0G(view2, R.id.special_requirement_back_button));
                View view3 = this.A00;
                if (view3 != null) {
                    View A0G = AnonymousClass7TF.A0G(view3, R.id.advertising_policy_row);
                    A00(A0G, 2131970775, 2131970776);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(2131970776));
                    AnonymousClass7AV.A05(spannableStringBuilder, new C48040ESf(this, Dbb.A04(this)), DbU.A0m(this, 2131970775));
                    DbX.A1G(AnonymousClass7TG.A0R(A0G, R.id.secondary_text), spannableStringBuilder);
                    View view4 = this.A00;
                    if (view4 != null) {
                        A00(AnonymousClass7TF.A0G(view4, R.id.audience_row), 2131970777, 2131970778);
                        View view5 = this.A00;
                        if (view5 != null) {
                            A00(AnonymousClass7TF.A0G(view5, R.id.creative_consideration_row), 2131970779, 2131970780);
                            View view6 = this.A00;
                            if (view6 != null) {
                                A00(AnonymousClass7TF.A0G(view6, R.id.additional_resource_row), 2131970773, 2131970774);
                                View view7 = this.A00;
                                if (view7 != null) {
                                    View A0G2 = AnonymousClass7TF.A0G(view7, R.id.credit_row);
                                    A00(A0G2, 2131970760, 2131970781);
                                    A01(AnonymousClass7TG.A0R(A0G2, R.id.secondary_text), "https://www.consumerfinance.gov/", 2131970781, 2131970781);
                                    View view8 = this.A00;
                                    if (view8 != null) {
                                        View A0G3 = AnonymousClass7TF.A0G(view8, R.id.employment_row);
                                        A00(A0G3, 2131970763, 2131970782);
                                        A01(AnonymousClass7TG.A0R(A0G3, R.id.secondary_text), "https://www.eeoc.gov/", 2131970782, 2131970782);
                                        View view9 = this.A00;
                                        str = "mainContainer";
                                        if (view9 != null) {
                                            View A0F = AnonymousClass7TF.A0F(view9, R.id.housing_row);
                                            View view10 = this.A00;
                                            if (view10 != null) {
                                                TextView A0R = AnonymousClass7TG.A0R(view10, R.id.housing_nfha_link_text);
                                                A00(A0F, 2131970766, 2131970784);
                                                A0R.setText(2131970785);
                                                A01(AnonymousClass7TG.A0R(A0F, R.id.secondary_text), "https://www.hud.gov/", 2131970784, 2131970784);
                                                A01(A0R, "https://nationalfairhousing.org/", 2131970785, 2131970785);
                                                return;
                                            }
                                        }
                                        0qQ.A0F(str);
                                        throw AnonymousClass00P.createAndThrow();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        str = "mainContainer";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        UserSession userSession = this.A01;
        if (userSession != null) {
            return userSession;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(View view, int i, int i2) {
        AnonymousClass7TG.A0R(view, R.id.primary_text).setText(i);
        AnonymousClass7TG.A0R(view, R.id.secondary_text).setText(i2);
    }

    private final void A01(TextView textView, String str, int i, int i2) {
        AnonymousClass7AV.A07(new UsQ(this, str, Dbb.A04(this)), textView, DbU.A0m(this, i), getString(i2));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1000974158);
        UZD.super.onCreate(bundle);
        PromoteData A002 = XAI.A00(this);
        this.A02 = A002;
        this.A01 = A002.A0y;
        AnonymousClass0fD.A09(-1777617273, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1660159014);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_special_requirements_policy_view, viewGroup, false);
        AnonymousClass0fD.A09(294547183, A022);
        return inflate;
    }
}
