package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

public final class E2X extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AiAgentNuxFragment";
    public boolean A00;
    public final AnonymousClass0eM A01 = DbW.A0p(this, 21);
    public final AnonymousClass0eM A02 = DbW.A0p(this, 22);
    public final AnonymousClass0eM A03 = DbW.A0p(this, 23);
    public final AnonymousClass0eM A04 = DbW.A0p(this, 25);
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Eiy(getString(2131954722), FPI.A00(this, 27));
    }

    public final String getModuleName() {
        return C66579MXk.A00(477);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        FGX fgx;
        String string;
        int i;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsHeadline igdsHeadline = (IgdsHeadline) view.findViewById(R.id.interstitial_headline);
        Context requireContext = requireContext();
        AnonymousClass0eM r5 = this.A05;
        0lg A0X = DbT.A0X(r5);
        0qQ.A0B(A0X, 1);
        Resources resources = requireContext.getResources();
        if (182.A06(0Tu.A05, A0X, 36319398804462833L)) {
            fgx.A05(resources.getString(2131952588), resources.getString(2131952585), R.drawable.instagram_gen_ai_pano_outline_24);
            fgx.A05(resources.getString(2131952586), resources.getString(2131952584), R.drawable.instagram_user_circle_pano_outline_24);
            string = resources.getString(2131952591);
            i = 2131952590;
        } else {
            fgx = new FGX(requireContext, (Boolean) true, 4);
            fgx.A05(resources.getString(2131952586), resources.getString(2131952584), R.drawable.instagram_user_circle_pano_outline_24);
            fgx.A05(resources.getString(2131952588), resources.getString(2131952587), R.drawable.instagram_gen_ai_pano_outline_24);
            string = resources.getString(2131952591);
            i = 2131952589;
        }
        FGX.A03(fgx, igdsHeadline, string, resources.getString(i), R.drawable.instagram_channels_pano_outline_24);
        igdsHeadline.A0D();
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) view.findViewById(R.id.interstitial_bottom_button_layout);
        Resources A052 = DbV.A05(this);
        igdsBottomButtonLayout.setPrimaryAction(AnonymousClass7TF.A0d(DbV.A05(this), 2131952566), FPI.A00(this, 28));
        igdsBottomButtonLayout.setSecondaryAction(A052.getString(2131952567), FPI.A00(this, 29));
        UserSession A0l = AnonymousClass7TE.A0l(r5);
        igdsBottomButtonLayout.setFooterAboveActionText(C48800EkO.A00(requireContext(), requireActivity(), A0l, 2EG.A46));
        C69503Nml nml = (C69503Nml) this.A03.getValue();
        1Ln A0J = 1Ln.A0J(((AnonymousClass7I3) this.A02.getValue()).A01);
        if (DbT.A1Y(A0J)) {
            A0J.A0Z(11);
            A0J.A0X(1);
            A0J.A0M(nml, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0J.Cgf();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1807576037);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_ai_agent_upsell_interstitial, false);
        AnonymousClass0fD.A09(-355416030, A022);
        return A0D;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1272043933);
        super.onDestroy();
        if (!this.A00) {
            C69503Nml nml = (C69503Nml) this.A03.getValue();
            1Ln A0J = 1Ln.A0J(((AnonymousClass7I3) this.A02.getValue()).A01);
            if (DbT.A1Y(A0J)) {
                A0J.A0Z(11);
                A0J.A0X(0);
                A0J.A0M(nml, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A0J.A0R("selected_item", "cancel");
                A0J.Cgf();
            }
        }
        AnonymousClass0fD.A09(5205132, A022);
    }
}
