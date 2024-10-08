package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.Map;

public final class E4X extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LearnProfessionalToolsFragment";
    public FragmentActivity A00;
    public 2dZ A01;
    public AnonymousClass4DH A02;
    public BusinessFlowAnalyticsLogger A03;
    public C46383De2 A04;
    public UserSession A05;
    public String A06;
    public boolean A07;
    public boolean A08 = true;
    public G8D A09;
    public final 1wn A0A = FXZ.A00(this, 8);

    public final String getModuleName() {
        return "learn_professional_tools_fragment";
    }

    public static void A01(E4X e4x, String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = e4x.A03;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Ckp(new C22030Xtl("learn_professional_tools", e4x.A06, str, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    public final void configureActionBar(2da r3) {
        r3.setTitle("");
        r3.ErD(FPB.A00(this, 54), R.drawable.instagram_check_pano_outline_24);
        Dbb.A0s(FPB.A00(this, 55), DbX.A0M(), r3);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return this.A05;
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (!this.A08 || (businessFlowAnalyticsLogger = this.A03) == null) {
            return false;
        }
        businessFlowAnalyticsLogger.ChP(new C22030Xtl("learn_professional_tools", this.A06, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        return false;
    }

    public static void A00(View.OnClickListener onClickListener, View view, int i, int i2, int i3, int i4) {
        DbU.A0F(view, R.id.education_icon).setImageResource(i);
        DbU.A0G(view, R.id.education_title).setText(i2);
        DbU.A0G(view, R.id.education_body).setText(i3);
        TextView A0G = DbU.A0G(view, R.id.education_cta);
        A0G.setText(i4);
        AnonymousClass0fU.A00(onClickListener, A0G);
        view.setVisibility(0);
    }

    public final void onAttach(Context context) {
        G8D g8d;
        E4X.super.onAttach(context);
        G8D requireActivity = requireActivity();
        if (requireActivity instanceof G8D) {
            g8d = requireActivity;
        } else {
            g8d = null;
        }
        this.A09 = g8d;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1288471162);
        E4X.super.onCreate(bundle);
        this.A05 = DbX.A0U(this);
        this.A02 = this;
        this.A00 = requireActivity();
        String A0o = DbX.A0o(this);
        A0o.getClass();
        this.A06 = A0o;
        this.A03 = FG1.A00(this.A09, this, this.A05);
        1xC.A01.A02(this.A0A, AnonymousClass0KZ.class);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A03;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cka(new C22030Xtl("learn_professional_tools", this.A06, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        this.A04 = new C46383De2(this.A05, this);
        this.A07 = DbT.A1X(requireArguments(), "ARG_CHECKLIST_ITEM_COMPLETED");
        this.A01 = DbT.A0K(requireActivity());
        AnonymousClass0fD.A09(693508883, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2067503940);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.learn_professional_tools_fragment);
        AnonymousClass0fD.A09(256592803, A022);
        return A0C;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-311879858);
        super.onDestroy();
        AnonymousClass0fD.A09(-1054788520, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1645962728);
        super.onDestroyView();
        1xC.A01.A03(this.A0A, AnonymousClass0KZ.class);
        AnonymousClass0fD.A09(1915593613, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        IgdsHeadline A0U = DbZ.A0U(view, R.id.onboarding_checklist_headline);
        A0U.setHeadline(2131964899);
        A0U.setBody(2131964898);
        A0U.setVisibility(0);
        A00(FPB.A00(this, 50), view.requireViewById(R.id.insights_education_unit), R.drawable.instagram_insights_pano_outline_24, 2131964357, 2131964355, 2131964356);
        A00(FPB.A00(this, 51), view.requireViewById(R.id.promote_education_unit), R.drawable.instagram_promote_pano_outline_24, 2131970518, 2131970516, 2131970517);
        if (AnonymousClass431.A00(this.A05)) {
            A00(FPB.A00(this, 52), view.requireViewById(R.id.activity_status_education_unit), R.drawable.instagram_activity_status_pano_outline_24, 2131963000, 2131952206, 2131952207);
        }
        if (AnonymousClass431.A00(this.A05)) {
            OyN.A00(this.A05).A05();
            A00(FPB.A00(this, 53), view.requireViewById(R.id.faq_education_unit), R.drawable.instagram_app_imessage_pano_outline_24, 2131962080, 2131962078, 2131962079);
        }
        super.onViewCreated(view, bundle);
    }
}
