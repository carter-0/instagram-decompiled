package com.instagram.business.fragment;

import X.0Tu;
import X.1KM;
import X.2da;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.C22030Xtl;
import X.C319586qr;
import X.C48152EZu;
import X.C48920EmK;
import X.C50961Flo;
import X.C51130Fp2;
import X.C51925G7t;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbY;
import X.DbZ;
import X.Dba;
import X.EEJ;
import X.ELU;
import X.EXN;
import X.FCU;
import X.FFL;
import X.FG1;
import X.FPB;
import X.G6P;
import X.G8D;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.List;
import java.util.Map;

public final class ConnectFBPageFragment extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, C51925G7t {
    public BusinessFlowAnalyticsLogger A00;
    public G8D A01;
    public BusinessNavBar A02;
    public EEJ A03;
    public AnonymousClass0wW A04;
    public IgdsBottomButtonLayout A05;
    public String A06;
    public boolean A07;
    public final G6P A08 = new C50961Flo(this, 0);

    public final void APF() {
    }

    public final void ARL() {
    }

    public final String getModuleName() {
        return "connect_fb_page";
    }

    public static void A00(ConnectFBPageFragment connectFBPageFragment) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = connectFBPageFragment.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Ckg(new C22030Xtl("facebook_connect", connectFBPageFragment.A06, "facebook_connect", (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    public static void A01(ConnectFBPageFragment connectFBPageFragment) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = connectFBPageFragment.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Ckh(new C22030Xtl("facebook_connect", connectFBPageFragment.A06, "facebook_connect", (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    private void A02(String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Ckp(new C22030Xtl("facebook_connect", this.A06, str, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    private boolean A03() {
        G8D g8d;
        if (!FG1.A03(this.A01) && ((g8d = this.A01) == null || g8d.B6a() != C319586qr.CREATOR_SIGNUP_FLOW)) {
            return false;
        }
        AnonymousClass0wW r2 = this.A04;
        0Tu r3 = 0Tu.A06;
        if (DbY.A1Y(r3, r2, 36313974257486164L) || DbY.A1Y(r3, this.A04, 36313974257617237L)) {
            return true;
        }
        return false;
    }

    public final void DZI() {
        EXN exn;
        G8D g8d;
        A02("continue");
        if (A03()) {
            FFL.A00(C48152EZu.A02, this.A04, "upsell_primary_click");
        }
        ELU A012 = C48920EmK.A00().A01(this, this.A04, FCU.A01(requireActivity(), this.A04, new C51130Fp2(this, 0)));
        if (FG1.A03(this.A01) || ((g8d = this.A01) != null && g8d.B6a() == C319586qr.CREATOR_SIGNUP_FLOW)) {
            exn = EXN.A07;
        } else {
            exn = EXN.A04;
        }
        A012.A06(exn.A01(), (List) null);
    }

    public final void Di0() {
        A02("skip");
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.CkV(new C22030Xtl("facebook_connect", this.A06, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        if (A03()) {
            FFL.A00(C48152EZu.A02, this.A04, AnonymousClass000.A00(389));
        }
        G8D g8d = this.A01;
        if (g8d != null) {
            ((BusinessConversionActivity) g8d).A0p(DbV.A0C("fb_account_linked", (String) null), true);
        }
    }

    public final void configureActionBar(2da r3) {
        if (this.A07) {
            FPB.A02(DbV.A0K(), r3, this, 34);
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A04;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        UserSession userSession = this.A04;
        if (i2 == -1) {
            1KM.A01(intent, userSession, FCU.A00(requireActivity(), userSession, this.A08));
        } else {
            CallerContext callerContext = 1KM.A00;
            if (i == 64206) {
                DbZ.A0s(2131965609);
                A01(this);
                super.onActivityResult(i, i2, intent);
            }
        }
        A00(this);
        super.onActivityResult(i, i2, intent);
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.ChP(new C22030Xtl("facebook_connect", this.A06, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        if (!this.A07) {
            return true;
        }
        this.A01.EJN(DbV.A0C("fb_account_linked", (String) null));
        return true;
    }

    public final void onAttach(Context context) {
        ConnectFBPageFragment.super.onAttach(context);
        this.A01 = FG1.A01(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0043, code lost:
        if (r2 != com.instagram.business.controller.datamodel.ConversionStep.RENEW) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            r0 = -275909405(0xffffffffef8df4e3, float:-8.786687E28)
            int r3 = X.AnonymousClass0fD.A02(r0)
            com.instagram.business.fragment.ConnectFBPageFragment.super.onCreate(r5)
            java.lang.String r0 = X.DbX.A0o(r4)
            r4.A06 = r0
            X.0wW r0 = X.DbX.A0T(r4)
            r4.A04 = r0
            r0.getClass()
            X.Dbc.A0p(r4)
            X.G8D r0 = r4.A01
            if (r0 == 0) goto L_0x0038
            X.0wW r2 = r4.A04
            X.6qr r1 = r0.B6a()
            X.G8D r0 = r4.A01
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            X.0eM r0 = r0.A0C
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = X.C319596qs.A00(r1, r4, r2, r0)
            r4.A00 = r0
        L_0x0038:
            X.G8D r0 = r4.A01
            if (r0 == 0) goto L_0x0045
            com.instagram.business.controller.datamodel.ConversionStep r2 = r0.E2J()
            com.instagram.business.controller.datamodel.ConversionStep r1 = com.instagram.business.controller.datamodel.ConversionStep.RENEW
            r0 = 0
            if (r2 == r1) goto L_0x0046
        L_0x0045:
            r0 = 1
        L_0x0046:
            r4.A07 = r0
            r0 = -616750385(0xffffffffdb3d22cf, float:-5.3237043E16)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.ConnectFBPageFragment.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EEJ eej;
        int A022 = AnonymousClass0fD.A02(2006500486);
        boolean A032 = A03();
        int i = R.layout.connect_fb_fragment;
        if (A032) {
            i = R.layout.connect_fb_igds_fragment;
        }
        View A0C = DbT.A0C(layoutInflater, viewGroup, i);
        boolean A033 = A03();
        View findViewById = A0C.findViewById(R.id.navigation_bar);
        if (A033) {
            this.A05 = (IgdsBottomButtonLayout) findViewById;
            int i2 = 2131965608;
            if (A03()) {
                i2 = 2131956701;
            }
            int i3 = 2131973916;
            if (A03()) {
                i3 = 2131968515;
            }
            eej = new EEJ((C51925G7t) this, this.A05, i2, i3);
        } else {
            BusinessNavBar businessNavBar = (BusinessNavBar) findViewById;
            this.A02 = businessNavBar;
            int i4 = 2131965608;
            if (A03()) {
                i4 = 2131956701;
            }
            int i5 = 2131973916;
            if (A03()) {
                i5 = 2131968515;
            }
            eej = new EEJ(businessNavBar, (C51925G7t) this, i4, i5);
        }
        this.A03 = eej;
        registerLifecycleListener(eej);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cka(new C22030Xtl("facebook_connect", this.A06, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        if (A03()) {
            FFL.A00(C48152EZu.A02, this.A04, "upsell_impressions");
        }
        AnonymousClass0fD.A09(2026544249, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1379720923);
        super.onDestroyView();
        unregisterLifecycleListener(this.A03);
        AnonymousClass0fD.A09(379728544, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1715915950);
        super.onResume();
        Drawable drawable = requireContext().getDrawable(R.drawable.ig_illustrations_illo_fb_connect_refresh);
        drawable.getClass();
        if (A03()) {
            IgdsHeadline A0U = DbZ.A0U(requireView(), R.id.headline);
            A0U.setImageDrawable(requireContext().getDrawable(R.drawable.fx_upsell_assets_account_center_logout_value_prop_image));
            A0U.setHeadline(2131962861);
            int i = 2131962859;
            if (DbY.A1Y(0Tu.A05, this.A04, 36318337944262742L)) {
                i = 2131962860;
            }
            A0U.setBody(i);
        } else {
            View view = this.mView;
            view.getClass();
            DbU.A0F(view, R.id.image).setImageDrawable(drawable);
            Dba.A06(view).setText(2131956539);
            Dba.A05(this.mView).setText(2131956543);
        }
        AnonymousClass0fD.A09(-1360048063, A022);
    }
}
