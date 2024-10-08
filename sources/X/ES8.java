package X;

import android.os.Bundle;
import android.view.View;

public final class ES8 extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AdsOptionsFragment";
    public C47088DqP A00;
    public Boolean A01;
    public String A02;
    public boolean A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05;

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Eom(2131952515);
        r3.Eu4(AnonymousClass7TF.A1R(getParentFragmentManager().A0M()));
        F3V f3v = new F3V(AnonymousClass05K.A00);
        f3v.A06 = Dbb.A0A(requireContext(), this);
        r3.ErJ(f3v.A00());
    }

    public final String getModuleName() {
        return "settings_ads_options";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r2 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MH5(r2, this, viewLifecycleOwner, (AnonymousClass4D7) null, 45), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00af, code lost:
        if (r0 == false) goto L_0x00b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.ES8 r16) {
        /*
            r7 = r16
            X.0eM r0 = r7.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.EzL r6 = new X.EzL
            r6.<init>(r0, r7)
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            boolean r2 = r7.A03
            java.lang.String r11 = r7.A02
            X.0eM r0 = r7.A05
            java.lang.Object r0 = r0.getValue()
            X.Jgo r0 = (X.C60169Jgo) r0
            X.05G r0 = r0.A04
            java.lang.Object r10 = r0.getValue()
            java.util.List r10 = (java.util.List) r10
            com.instagram.common.session.UserSession r4 = r6.A02
            X.0Tu r8 = X.0Tu.A06
            r0 = 36310993550180762(0x8100a80000019a, double:3.0265567615449423E-306)
            boolean r3 = X.182.A06(r8, r4, r0)
            r0 = 36313587710429349(0x810304000008a5, double:3.0281973189319936E-306)
            boolean r0 = X.182.A06(r8, r4, r0)
            if (r3 != 0) goto L_0x0052
            if (r0 == 0) goto L_0x0052
            r0 = 58
            X.FP2 r1 = new X.FP2
            r1.<init>((X.C49602EzL) r6, (int) r0)
            X.EvC r0 = new X.EvC
            r0.<init>(r1)
            r5.add(r0)
            r0 = 1
            X.DbV.A1W(r5, r0)
        L_0x0052:
            androidx.fragment.app.FragmentActivity r9 = r6.A01
            r3 = 2131952257(0x7f130281, float:1.9540952E38)
            r1 = 55
            X.FP2 r0 = new X.FP2
            r0.<init>((X.C49602EzL) r6, (int) r1)
            X.Fmc r0 = X.C50989Fmc.A00(r9, r0, r3)
            r14 = r2 ^ 1
            r0.A0A = r14
            r5.add(r0)
            r16 = 1
            X.0Tu r3 = X.0Tu.A05
            r1 = 36310993550180762(0x8100a80000019a, double:3.0265567615449423E-306)
            boolean r0 = X.182.A06(r3, r4, r1)
            r12 = 0
            if (r0 != 0) goto L_0x0106
            r13 = 0
        L_0x007a:
            r13 = r13 | r16
            com.instagram.user.model.User r0 = X.DbT.A0j(r4)
            boolean r0 = r0.A2L()
            if (r0 != 0) goto L_0x0104
            if (r10 == 0) goto L_0x0104
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0104
            r12 = 2131969110(0x7f134456, float:1.9575134E38)
            r11 = 53
            X.FPG r0 = new X.FPG
            r0.<init>((int) r11, (java.lang.Object) r6, (java.lang.Object) r10)
            X.C50989Fmc.A02(r9, r0, r5, r12)
            r0 = 1
        L_0x009c:
            r13 = r13 | r0
            if (r13 == 0) goto L_0x00c0
            boolean r2 = X.182.A06(r8, r4, r1)
            r0 = 36313587710429349(0x810304000008a5, double:3.0281973189319936E-306)
            boolean r0 = X.182.A06(r8, r4, r0)
            if (r2 != 0) goto L_0x00b1
            r1 = 2
            if (r0 != 0) goto L_0x00b2
        L_0x00b1:
            r1 = 0
        L_0x00b2:
            r0 = 2131952247(0x7f130277, float:1.9540931E38)
            X.DfA r0 = X.C46448DfA.A00(r0)
            r5.add(r1, r0)
            r0 = 1
            X.DbV.A1W(r5, r0)
        L_0x00c0:
            int r1 = r5.size()
            r0 = 2131952233(0x7f130269, float:1.9540903E38)
            X.DfA r0 = X.C46448DfA.A00(r0)
            r5.add(r1, r0)
            r0 = 36316456748585355(0x8105a00000118b, double:3.030011710214541E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x00e6
            r2 = 2131952242(0x7f130272, float:1.9540921E38)
            r1 = 59
            X.FP2 r0 = new X.FP2
            r0.<init>((X.C49602EzL) r6, (int) r1)
            X.C50989Fmc.A02(r9, r0, r5, r2)
        L_0x00e6:
            r2 = 2131952209(0x7f130251, float:1.9540854E38)
            r1 = 56
            X.FP2 r0 = new X.FP2
            r0.<init>((X.C49602EzL) r6, (int) r1)
            X.C50989Fmc.A02(r9, r0, r5, r2)
            r2 = 2131951983(0x7f13016f, float:1.9540396E38)
            r1 = 57
            X.FP2 r0 = new X.FP2
            r0.<init>((X.C49602EzL) r6, (int) r1)
            X.C50989Fmc.A02(r9, r0, r5, r2)
            r7.setItems(r5)
            return
        L_0x0104:
            r0 = 0
            goto L_0x009c
        L_0x0106:
            if (r11 == 0) goto L_0x0119
            java.lang.String r0 = "detailed_version_group"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0118
            java.lang.String r0 = "concise_version_group"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0119
        L_0x0118:
            r12 = 1
        L_0x0119:
            java.util.HashMap r15 = X.AnonymousClass7TE.A1E()
            r13 = 2131957388(0x7f13168c, float:1.9551359E38)
            if (r12 == 0) goto L_0x0125
            r13 = 2131952204(0x7f13024c, float:1.9540844E38)
        L_0x0125:
            r12 = 10
            X.FNn r0 = new X.FNn
            r0.<init>(r6, r15, r11, r12)
            X.Fmc r0 = X.C50989Fmc.A00(r9, r0, r13)
            r0.A0A = r14
            r5.add(r0)
            r13 = 1
            goto L_0x007a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ES8.A06(X.ES8):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public ES8() {
        C13998To0 to0 = new C13998To0(this, 32);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C13998To0(new C13998To0(this, 29), 30));
        this.A05 = DbS.A0I(new C13998To0(A002, 31), to0, new C58691Iw0(43, (Object) null, A002), DbS.A0z(C60169Jgo.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2114286793);
        super.onCreate(bundle);
        C239113Fa r1 = new C239113Fa(C41845B3m.A04(), C47123Dqz.class, "BasicAdsOptInQuery", false);
        AnonymousClass0eM r4 = this.A04;
        C239123Fb A012 = C46479Dfi.A01(DbT.A0X(r4));
        A012.A08(r1);
        C47696EDf.A00(this, A012.A06(), 28);
        C47696EDf.A00(this, C46479Dfi.A00(new C239113Fa(C41845B3m.A04(), C47090DqR.class, "FxSettingsAdsTransition", false), DbT.A0X(r4)), 27);
        AnonymousClass0fD.A09(-244685617, A022);
    }
}
