package X;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.opal.impl.data.OpalProfileData;

public final class EO2 extends E3K implements AnonymousClass4DU, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "OpalFragment";
    public MotionEvent A00;
    public AnonymousClass2uE A01;
    public C49636Ezt A02;
    public AnonymousClass32A A03;
    public C249763kK A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D;
    public final C50296FXb A0E;
    public final C14005To7 A0F;
    public final String A0G = AnonymousClass7TG.A0j();
    public final String A0H;
    public final AnonymousClass0eM A0I;
    public final FX1 A0J;
    public final FX1 A0K;
    public final FX1 A0L;
    public final AnonymousClass0eM A0M;

    public static final void A04(EO2 eo2, String str) {
        EO2 eo22 = eo2;
        String A012 = A01(eo2);
        String str2 = eo2.A05;
        if (str2 == null) {
            str2 = "";
        }
        C49049EoT.A00(eo22, AnonymousClass7TE.A0l(eo2.A00), str, "back_button", A012, str2, (String) null);
    }

    public static final void A05(EO2 eo2, String str) {
        EO2 eo22 = eo2;
        String A012 = A01(eo2);
        String str2 = eo2.A05;
        if (str2 == null) {
            str2 = "";
        }
        C49049EoT.A00(eo22, AnonymousClass7TE.A0l(eo2.A00), "tap", str, A012, str2, (String) null);
    }

    public static final void A06(EO2 eo2, String str) {
        EO2 eo22 = eo2;
        String A012 = A01(eo2);
        String str2 = eo2.A05;
        if (str2 == null) {
            str2 = "";
        }
        C49049EoT.A00(eo22, AnonymousClass7TE.A0l(eo2.A00), str, "empty", A012, str2, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r4 == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r6) {
        /*
            r5 = this;
            r3 = 0
            X.0qQ.A0B(r6, r3)
            super.configureActionBar(r6)
            android.os.Bundle r1 = r5.mArguments
            if (r1 == 0) goto L_0x0049
            java.lang.String r0 = "argument_is_profile_tab"
            boolean r4 = r1.getBoolean(r0)
            if (r4 != 0) goto L_0x0032
        L_0x0013:
            r2 = 1
            r1 = 34
            X.FPD r0 = new X.FPD
            r0.<init>((java.lang.Object) r5, (int) r1)
            r6.Eu5(r0, r2)
            r0 = -1
            android.graphics.ColorFilter r1 = X.AnonymousClass37O.A00(r0)
            r0 = r6
            X.2dZ r0 = (X.2dZ) r0
            android.widget.ImageView r0 = r0.A0Q()
            r0.setColorFilter(r1)
            java.lang.String r0 = "impression"
            A04(r5, r0)
        L_0x0032:
            r0 = 17
            X.J73 r2 = new X.J73
            r2.<init>(r0, r5, r4)
            r0 = 721916716(0x2b07932c, float:4.8165877E-13)
            r1 = 1
            X.5PJ r0 = X.AnonymousClass5PI.A04(r2, r0, r1)
            androidx.compose.ui.platform.ComposeView r0 = X.GTX.A01(r5, r0, r1, r3)
            r6.ETi(r0, r3, r3, r3)
            return
        L_0x0049:
            r4 = 0
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EO2.configureActionBar(X.2da):void");
    }

    public final String getModuleName() {
        return "opal_fragment";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        C49636Ezt ezt = this.A02;
        if (ezt != null) {
            ezt.A00.onSaveInstanceState(bundle);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = new C49636Ezt(requireContext(), AnonymousClass7TE.A0l(this.A00), new C50640Ffz(this));
        view.requestFocus();
        C49636Ezt ezt = this.A02;
        if (ezt != null) {
            ezt.A00.DfL(bundle);
        }
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66170MGh(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 45), AnonymousClass07a.A00(viewLifecycleOwner));
        this.A0D.postDelayed(new C51248Fr3(this), 1000);
    }

    public static final C46789DlJ A00(EO2 eo2) {
        return (C46789DlJ) eo2.A0M.getValue();
    }

    public static final String A01(EO2 eo2) {
        if (2R8.A05(AnonymousClass7TE.A0l(eo2.A00), eo2.A05)) {
            return "opal_self_profile";
        }
        return "opal_profile";
    }

    public static final void A02(EO2 eo2) {
        Object value;
        if (eo2.A0C) {
            eo2.A0C = false;
            C46789DlJ A002 = A00(eo2);
            if (AnonymousClass7TE.A0q(A002.A01).getInt("opal_delight_animation_count", 0) < 1) {
                05G r3 = A002.A05;
                do {
                    value = r3.getValue();
                } while (!r3.AIY(value, C47183Dry.A00((C61052Jvq) null, (OpalProfileData) null, (OpalProfileData) null, (C62520KhB) null, (C47183Dry) value, AnonymousClass05K.A01, 0, 1791, false, false)));
                return;
            }
            C46789DlJ.A00(A002);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0058, code lost:
        if (r10 > 0) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.EO2 r17) {
        /*
            r11 = r17
            X.DlJ r0 = A00(r11)
            X.0Ud r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.Dry r0 = (X.C47183Dry) r0
            com.instagram.opal.impl.data.OpalProfileData r0 = r0.A05
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x00bc
            X.0eM r4 = r11.A00
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r4)
            java.lang.String r0 = r11.A05
            boolean r0 = X.2R8.A05(r1, r0)
            r2 = 1
            if (r0 == 0) goto L_0x0100
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r4)
            r5 = 0
            X.0Tu r3 = X.DbS.A0J(r6, r5)
            r0 = 36602557407105681(0x8209d5001f1291, double:3.210942918697678E-306)
            int r10 = X.DbS.A04(r3, r6, r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.0xa r0 = X.AnonymousClass7TE.A0q(r0)
            java.lang.String r3 = "opal_unship_nux_count"
            int r9 = r0.getInt(r3, r5)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.1Av r1 = X.1Au.A00(r0)
            X.0s0 r0 = r1.A4u
            X.0YZ[] r8 = X.1Av.A8a
            r7 = 453(0x1c5, float:6.35E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r1, r0, r8, r7)
            if (r0 != 0) goto L_0x005a
            r1 = 0
            if (r10 <= 0) goto L_0x005b
        L_0x005a:
            r1 = 1
        L_0x005b:
            X.0eM r0 = r11.A0I
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 != 0) goto L_0x00bd
            if (r9 < r10) goto L_0x00bd
            if (r1 != 0) goto L_0x01af
            android.content.Context r3 = r11.getContext()
            if (r3 == 0) goto L_0x00bc
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.1Av r1 = X.1Au.A00(r0)
            X.0s0 r0 = r1.A4u
            X.DbS.A1a(r1, r6, r0, r8, r7)
            r11.A09 = r5
            X.Ffx r2 = new X.Ffx
            r2.<init>(r11)
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r4)
            r0 = 2
            X.0qQ.A0B(r12, r0)
            X.7Pr r1 = X.DbX.A0e(r12, r5)
            r0 = 2131100285(0x7f06027d, float:1.7812947E38)
            int r0 = r3.getColor(r0)
            r1.A06 = r0
            r0 = 6
            X.7Pu r1 = X.FmG.A00(r1, r2, r0)
            X.ENy r0 = new X.ENy
            r0.<init>()
            r0.A00 = r2
            r1.A03(r3, r0)
            java.lang.String r0 = r12.A06
            java.lang.String r15 = "opal_self_profile"
            java.lang.String r13 = "surface_appear"
            java.lang.String r14 = "opal_nux"
            r17 = 0
            r16 = r0
        L_0x00b9:
            X.C49049EoT.A00(r11, r12, r13, r14, r15, r16, r17)
        L_0x00bc:
            return
        L_0x00bd:
            android.content.Context r6 = r11.getContext()
            if (r6 == 0) goto L_0x00bc
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.1Av r0 = X.1Au.A00(r0)
            int r1 = r9 + 1
            X.0xa r0 = r0.A01
            X.AnonymousClass7TG.A1M(r0, r3, r1)
            r11.A09 = r5
            X.Ffv r3 = new X.Ffv
            r3.<init>(r11)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r4)
            r0 = 2
            X.0qQ.A0B(r1, r0)
            X.7Pr r1 = X.DbX.A0e(r1, r5)
            r0 = 2131100285(0x7f06027d, float:1.7812947E38)
            int r0 = r6.getColor(r0)
            r1.A06 = r0
            r0 = 5
            X.7Pu r1 = X.FmG.A00(r1, r3, r0)
            X.ENy r0 = new X.ENy
            r0.<init>()
            r0.A00 = r3
            r0.A01 = r2
            r1.A03(r6, r0)
            return
        L_0x0100:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.1Av r1 = X.1Au.A00(r0)
            X.0s0 r0 = r1.A5T
            X.0YZ[] r5 = X.1Av.A8a
            r3 = 456(0x1c8, float:6.39E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r1, r0, r5, r3)
            if (r0 != 0) goto L_0x01af
            androidx.fragment.app.FragmentActivity r7 = r11.getActivity()
            if (r7 == 0) goto L_0x00bc
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.1Av r1 = X.1Au.A00(r0)
            X.0s0 r0 = r1.A5T
            X.AnonymousClass7TF.A1J(r1, r0, r5, r3, r2)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.17i r1 = X.17h.A00(r0)
            java.lang.String r0 = r11.A05
            com.instagram.user.model.User r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x01ad
            java.lang.String r6 = r0.getUsername()
        L_0x013b:
            java.lang.String r3 = r11.A05
            if (r3 != 0) goto L_0x0141
            java.lang.String r3 = ""
        L_0x0141:
            X.Ffw r5 = new X.Ffw
            r5.<init>(r11)
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r4)
            r0 = 4
            X.0qQ.A0B(r12, r0)
            X.8ab r4 = X.DbS.A0X(r7)
            r0 = 3
            X.C50036FJv.A00(r4, r5, r0)
            r0 = 2131237594(0x7f081ada, float:1.8091443E38)
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r0)
            r4.A0j(r0)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131968874(0x7f13436a, float:1.9574655E38)
            java.lang.String r0 = r1.getString(r0)
            r4.A05 = r0
            android.content.res.Resources r1 = r7.getResources()
            if (r6 == 0) goto L_0x01a5
            r0 = 2131968918(0x7f134396, float:1.9574744E38)
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r1, r6, r0)
        L_0x017a:
            r4.A0q(r0)
            r4.A0s(r2)
            r1 = 2131963117(0x7f132ced, float:1.9562978E38)
            r0 = 66
            X.C50020FJf.A01(r4, r5, r0, r1)
            r2 = 2131963118(0x7f132cee, float:1.956298E38)
            r0 = 67
            X.FJf r1 = X.C50020FJf.A00(r5, r0)
            X.8ae r0 = X.C358278ae.BLUE_BOLD
            r4.A0O(r1, r0, r2)
            X.DbT.A1V(r4)
            java.lang.String r15 = "opal_profile"
            java.lang.String r13 = "surface_appear"
            java.lang.String r14 = "opal_nux"
            r17 = 0
            r16 = r3
            goto L_0x00b9
        L_0x01a5:
            r0 = 2131968919(0x7f134397, float:1.9574746E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x017a
        L_0x01ad:
            r6 = 0
            goto L_0x013b
        L_0x01af:
            A02(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EO2.A03(X.EO2):void");
    }

    public final AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A00);
    }

    public EO2() {
        C51794G2d g2d = new C51794G2d(this, 42);
        C51794G2d g2d2 = new C51794G2d(this, 39);
        0eO r6 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r6, new C51794G2d(g2d2, 40));
        this.A0M = DbS.A0I(new C51794G2d(A002, 41), g2d, new MJ7(43, (Object) null, A002), DbS.A0z(C46789DlJ.class));
        this.A0I = AnonymousClass0eN.A00(r6, new C51680Fyg(this));
        this.A09 = true;
        this.A0C = true;
        this.A0H = AnonymousClass7TG.A0j();
        this.A0D = AnonymousClass7TF.A0D();
        this.A0F = new C14005To7();
        this.A0E = new C50296FXb(this, 5);
        this.A0J = FX1.A00(this, 5);
        this.A0L = FX1.A00(this, 7);
        this.A0K = FX1.A00(this, 6);
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        String str;
        String str2;
        int A022 = AnonymousClass0fD.A02(2123976406);
        AnonymousClass0eM r4 = this.A00;
        UserSession A0l = AnonymousClass7TE.A0l(r4);
        this.A08 = 182.A06(AnonymousClass7TF.A0H(A0l), A0l, 36321082429416530L);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            z = bundle2.getBoolean("argument_show_flip_shimmer");
        } else {
            z = false;
        }
        this.A0B = z;
        super.onCreate(bundle);
        this.A04 = 1L2.A00();
        FragmentActivity requireActivity = requireActivity();
        0hq parentFragmentManager = getParentFragmentManager();
        UserSession A0l2 = AnonymousClass7TE.A0l(r4);
        C249763kK r13 = this.A04;
        String str3 = null;
        if (r13 == null) {
            0qQ.A0F("sessionIdProvider");
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = new AnonymousClass2uE(requireActivity, this, parentFragmentManager, A0l2, (AnonymousClass57N) null, this, (C231292rN) null, r13, true, true, true);
        this.A03 = new AnonymousClass32A(this, AnonymousClass7TE.A0l(r4), new AnonymousClass328(this, 60574));
        IgFragmentActivity requireActivity2 = requireActivity();
        if (requireActivity2 instanceof BaseFragmentActivity) {
            requireActivity2.registerOnActivityResultListener(this.A0E);
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str = bundle3.getString("argument_profile_id");
        } else {
            str = null;
        }
        this.A05 = str;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            str2 = bundle4.getString("argument_source_media_id");
        } else {
            str2 = null;
        }
        this.A06 = str2;
        Bundle bundle5 = this.mArguments;
        if (bundle5 != null) {
            str3 = bundle5.getString("argument_source_ranking_info_token");
        }
        this.A07 = str3;
        String str4 = this.A05;
        if (str4 != null) {
            C46789DlJ A002 = A00(this);
            A002.A00 = str4;
            DbX.A1W(A002, str4, C318116oQ.A00(A002), 11);
        }
        if (2R8.A05(AnonymousClass7TE.A0l(r4), this.A05)) {
            0xY A0p = AnonymousClass7TE.A0p(1Au.A00(AnonymousClass7TE.A0l(r4)));
            A0p.E5Z("opal_profile_menu_option_view_count", 2);
            A0p.apply();
            1Ng A003 = AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(r4));
            A003.A01(this.A0J, C2370936h.class);
            A003.A01(this.A0L, AnonymousClass376.class);
            A003.A01(this.A0K, WQ9.class);
        }
        A06(this, "surface_appear");
        AnonymousClass0fD.A09(1598464890, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-58126569);
        FrameLayout frameLayout = new FrameLayout(requireContext());
        ComposeView A012 = GTX.A01(this, AnonymousClass5PI.A04(new JG3(31, this, this, frameLayout), 126459618, true), true, false);
        A012.setTag("opal_content_view");
        frameLayout.addView(A012);
        AnonymousClass0eM r6 = this.A00;
        UserSession A0l = AnonymousClass7TE.A0l(r6);
        0Tu A0J2 = DbS.A0J(A0l, 0);
        if (182.A06(A0J2, A0l, 36321082429416530L)) {
            C51794G2d g2d = new C51794G2d(this, 27);
            String str = this.A05;
            if (str == null) {
                str = "";
            }
            frameLayout.addView(C55073Hbi.A00(this, this, str, g2d, true, true, false));
        }
        UserSession A0l2 = AnonymousClass7TE.A0l(r6);
        0qQ.A0B(A0l2, 0);
        if (DbS.A04(A0J2, A0l2, 36602557405860494L) == 1) {
            frameLayout.setCameraDistance(20000.0f * DbV.A05(this).getDisplayMetrics().density);
        }
        AnonymousClass0fD.A09(2019827986, A022);
        return frameLayout;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1866608669);
        super.onDestroy();
        IgFragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof BaseFragmentActivity) {
            requireActivity.unregisterOnActivityResultListener(this.A0E);
        }
        1Ng A002 = AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.A00));
        A002.A02(this.A0J, C2370936h.class);
        A002.A02(this.A0L, AnonymousClass376.class);
        A002.A02(this.A0K, WQ9.class);
        A06(this, "surface_disappear");
        AnonymousClass0fD.A09(-1290403091, A022);
    }

    public final void onResume() {
        Reel reel;
        Object value;
        C47183Dry dry;
        C61052Jvq jvq;
        int A022 = AnonymousClass0fD.A02(1822906500);
        super.onResume();
        this.A09 = true;
        C46789DlJ A002 = A00(this);
        C61052Jvq jvq2 = ((C47183Dry) A002.A06.getValue()).A01;
        if (jvq2 == null || (reel = (Reel) jvq2.A01) == null) {
            AnonymousClass0fD.A09(2049771795, A022);
        }
        05G r3 = A002.A05;
        do {
            value = r3.getValue();
            dry = (C47183Dry) value;
            C61052Jvq jvq3 = dry.A01;
            if (jvq3 != null) {
                boolean z = true;
                if (!reel.A16(A002.A01)) {
                    z = false;
                }
                jvq = new C61052Jvq(jvq3.A01, jvq3.A00, 4, z);
            } else {
                jvq = null;
            }
        } while (!r3.AIY(value, C47183Dry.A00(jvq, (OpalProfileData) null, (OpalProfileData) null, (C62520KhB) null, dry, (Integer) null, 0, 2031, false, false)));
        AnonymousClass0fD.A09(2049771795, A022);
    }
}
