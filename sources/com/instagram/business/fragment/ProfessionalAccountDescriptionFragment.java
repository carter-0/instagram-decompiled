package com.instagram.business.fragment;

import X.0qQ;
import X.16U;
import X.16V;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.C22030Xtl;
import X.C319596qs;
import X.C51925G7t;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbX;
import X.Dba;
import X.Dbc;
import X.EEJ;
import X.F5D;
import X.FAM;
import X.FG1;
import X.FPB;
import X.G8D;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;
import java.util.Map;

public class ProfessionalAccountDescriptionFragment extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, C51925G7t {
    public BusinessFlowAnalyticsLogger A00;
    public G8D A01;
    public String A02;
    public UserSession A03;
    public 16V A04;
    public BusinessNavBar mBusinessNavBar;
    public EEJ mBusinessNavBarHelper;
    public View mMainView;

    public final void APF() {
    }

    public final void ARL() {
    }

    public final void Di0() {
    }

    public final String getModuleName() {
        return "professional_account_description_fragment";
    }

    public final void DZI() {
        ((BusinessConversionActivity) this.A01).Clz((Bundle) null);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Ckp(new C22030Xtl("value_props", this.A02, "continue", (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger2 = this.A00;
        if (businessFlowAnalyticsLogger2 != null) {
            businessFlowAnalyticsLogger2.Ci7(new C22030Xtl("value_props", this.A02, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A03;
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.ChP(new C22030Xtl("value_props", this.A02, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        if (!FG1.A03(this.A01) || DbT.A0j(this.A03).A0J() == 16V.A07) {
            Dba.A1R(this.A01);
            return true;
        }
        this.A01.AGV();
        return true;
    }

    public final void configureActionBar(2da r3) {
        FPB.A02(DbV.A0K(), r3, this, 60);
    }

    public final void onAttach(Context context) {
        ProfessionalAccountDescriptionFragment.super.onAttach(context);
        G8D A012 = FG1.A01(this);
        A012.getClass();
        this.A01 = A012;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(523760863);
        ProfessionalAccountDescriptionFragment.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        bundle2.getClass();
        UserSession A0U = DbX.A0U(this);
        this.A03 = A0U;
        this.A00 = C319596qs.A00(this.A01.B6a(), this, A0U, (String) AnonymousClass7TE.A14(((BusinessConversionActivity) this.A01).A0C));
        this.A02 = bundle2.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "");
        this.A04 = 16U.A00(bundle2.getInt("selected_account_type"));
        Dbc.A0p(this);
        AnonymousClass0fD.A09(506673393, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String str2;
        Drawable drawable;
        int A022 = AnonymousClass0fD.A02(1562725913);
        LayoutInflater layoutInflater2 = layoutInflater;
        View inflate = layoutInflater2.inflate(R.layout.stacked_value_props, viewGroup, false);
        this.mMainView = inflate;
        ViewGroup A0C = DbU.A0C(inflate, R.id.value_props_container);
        View findViewById = this.mMainView.findViewById(R.id.scroll_view);
        BusinessNavBar businessNavBar = (BusinessNavBar) this.mMainView.requireViewById(R.id.navigation_bar);
        this.mBusinessNavBar = businessNavBar;
        EEJ eej = new EEJ(businessNavBar, (C51925G7t) this, 2131968361, -1);
        this.mBusinessNavBarHelper = eej;
        registerLifecycleListener(eej);
        this.mBusinessNavBar.A01(findViewById);
        Context requireContext = requireContext();
        UserSession userSession = this.A03;
        16V r1 = this.A04;
        Context requireContext2 = requireContext();
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r1, 1);
        List<FAM> A012 = F5D.A01(requireContext2, r1, false);
        int ordinal = r1.ordinal();
        if (ordinal == 2) {
            str2 = AnonymousClass7TE.A16(requireContext2, 2131952102);
            str = AnonymousClass7TE.A16(requireContext2, 2131952101);
            drawable = requireContext2.getDrawable(R.drawable.instagram_business_pano_outline_24);
            if (drawable == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else if (ordinal == 3) {
            str2 = AnonymousClass7TE.A16(requireContext2, 2131952104);
            str = AnonymousClass7TE.A16(requireContext2, 2131952103);
            drawable = requireContext2.getDrawable(R.drawable.instagram_media_account_pano_outline_24);
            if (drawable == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else if (ordinal == 1 || ordinal == 0) {
            throw AnonymousClass7TE.A0w("No supported onboarding configuration for account type");
        } else {
            throw AnonymousClass7TE.A0w("No supported onboarding configuration for account type");
        }
        ImageView A0G = DbS.A0G(A0C, R.id.title_icon);
        TextView A0d = AnonymousClass7TE.A0d(A0C, R.id.title);
        TextView A0d2 = AnonymousClass7TE.A0d(A0C, R.id.subtitle);
        if (A0G != null) {
            A0G.setImageDrawable(drawable);
        }
        if (A0d != null) {
            A0d.setText(str2);
        }
        if (A0d2 != null) {
            A0d2.setText(str);
        }
        for (FAM fam : A012) {
            View inflate2 = layoutInflater2.inflate(R.layout.stacked_value_props_row, A0C, false);
            String str3 = fam.A03;
            String str4 = fam.A02;
            Drawable drawable2 = requireContext.getDrawable(fam.A01);
            TextView A0G2 = DbU.A0G(inflate2, R.id.title);
            TextView A0G3 = DbU.A0G(inflate2, R.id.subtitle);
            ImageView A0F = DbU.A0F(inflate2, R.id.icon);
            A0G2.setText(str3);
            A0G3.setText(str4);
            A0F.setImageDrawable(drawable2);
            A0C.addView(inflate2);
        }
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cka(new C22030Xtl("value_props", this.A02, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        View view = this.mMainView;
        AnonymousClass0fD.A09(-1558325978, A022);
        return view;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-590947068);
        super.onDestroyView();
        unregisterLifecycleListener(this.mBusinessNavBarHelper);
        AnonymousClass0fD.A09(-1613655386, A022);
    }
}
