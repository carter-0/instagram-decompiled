package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

public final class E2S extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AiAgentAssistantDisclaimerInterstitialFragment";
    public boolean A00;
    public final AnonymousClass0eM A01 = DbW.A0p(this, 17);
    public final AnonymousClass0eM A02 = DbW.A0p(this, 18);
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        if (!AnonymousClass7TF.A0R(0Tu.A05, DbT.A0X(this.A03), 36329367420420166L).booleanValue()) {
            r5.Eiy(getString(2131954722), FPI.A00(this, 24));
        }
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        Resources A05;
        int i;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        0nA.A0N(view);
        IgdsHeadline igdsHeadline = (IgdsHeadline) view.findViewById(R.id.interstitial_headline);
        AnonymousClass0eM r5 = this.A03;
        0lg A0X = DbT.A0X(r5);
        0Tu r4 = 0Tu.A05;
        if (!AnonymousClass7TF.A0R(r4, A0X, 36329367420420166L).booleanValue()) {
            boolean A06 = 182.A06(r4, DbT.A0X(r5), 36330088975188422L);
            int i2 = R.drawable.instagram_icons_exceptions_genai_agent_profile_filled_100;
            if (A06) {
                i2 = R.drawable.instagram_icons_exceptions_genai_agent_new_profile_filled_100;
            }
            igdsHeadline.setImageResource(i2);
        }
        Context requireContext = requireContext();
        requireContext.getResources();
        boolean A062 = 182.A06(r4, DbT.A0X(r5), 36319398804462833L);
        FGX A012 = FGX.A01(requireContext, AnonymousClass7TE.A0v());
        if (A062) {
            string = FGX.A00(this, A012, FGX.A00(this, A012, DbV.A05(this).getString(2131952548), DbV.A05(this).getString(2131952547), R.drawable.instagram_group_pano_outline_24).getString(2131952550), DbV.A05(this).getString(2131952549), R.drawable.instagram_gen_ai_pano_outline_24).getString(2131952553);
            A05 = DbV.A05(this);
            i = 2131952552;
        } else {
            string = FGX.A00(this, A012, FGX.A00(this, A012, DbV.A05(this).getString(2131952548), DbV.A05(this).getString(2131952546), R.drawable.instagram_group_pano_outline_24).getString(2131952550), DbV.A05(this).getString(2131952549), R.drawable.instagram_gen_ai_pano_outline_24).getString(2131952553);
            A05 = DbV.A05(this);
            i = 2131952551;
        }
        FGX.A03(A012, igdsHeadline, string, A05.getString(i), R.drawable.instagram_channels_pano_outline_24);
        igdsHeadline.A0D();
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) view.findViewById(R.id.interstitial_bottom_button_layout);
        Resources A052 = DbV.A05(this);
        int i3 = 2131952568;
        if (!AnonymousClass7TF.A0R(r4, DbT.A0X(r5), 36329367420420166L).booleanValue()) {
            i3 = 2131952566;
        }
        igdsBottomButtonLayout.setPrimaryAction(A052.getString(i3), FPI.A00(this, 25));
        igdsBottomButtonLayout.setSecondaryAction(A052.getString(2131952567), FPI.A00(this, 26));
        UserSession A0l = AnonymousClass7TE.A0l(r5);
        igdsBottomButtonLayout.setFooterAboveActionText(C48800EkO.A00(requireContext(), requireActivity(), A0l, 2EG.A0L));
        ((AnonymousClass7I3) this.A01.getValue()).A07((C69503Nml) this.A02.getValue());
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2003358801);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_ai_agent_assistant_disclaimer_interstitial, false);
        AnonymousClass0fD.A09(1796079822, A022);
        return A0D;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1294277758);
        super.onDestroy();
        if (!this.A00) {
            ((AnonymousClass7I3) this.A01.getValue()).A06((C69503Nml) this.A02.getValue());
        }
        AnonymousClass0fD.A09(-1468242148, A022);
    }
}
