package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Map;

public final class E3R extends AnonymousClass4DH implements AnonymousClass0iw, AnonymousClass4DR, AnonymousClass4DS, C51925G7t {
    public static final String __redex_internal_original_name = "SafetyStepFragment";
    public BusinessFlowAnalyticsLogger A00;
    public IgdsListCell A01;
    public IgdsListCell A02;
    public String A03;
    public boolean A04 = true;
    public boolean A05 = true;
    public boolean A06;
    public boolean A07;
    public G8D A08;
    public EEJ A09;
    public boolean A0A = true;
    public boolean A0B = true;
    public final AnonymousClass0eM A0C = AnonymousClass1YB.A00(new C20703Wxa(this, 14));
    public final AnonymousClass0eM A0D = AnonymousClass1YB.A00(new C20703Wxa(this, 15));
    public final AnonymousClass0eM A0E = C227642jf.A02(this);

    public final void APF() {
    }

    public final void ARL() {
    }

    public final String getModuleName() {
        return "safety_step_fragment";
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        E3R.super.onAttach(context);
        this.A08 = FG1.A01(this);
    }

    public static final void A00(AnonymousClass1XT r8, E3R e3r, String str) {
        String str2 = null;
        String str3 = null;
        String str4 = e3r.A03;
        if (r8 != null) {
            str3 = r8.getErrorMessage();
            str2 = r8.getErrorType();
        }
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = e3r.A00;
        if (businessFlowAnalyticsLogger == null) {
            DbS.A12();
            throw AnonymousClass00P.createAndThrow();
        } else {
            businessFlowAnalyticsLogger.Ckh(new C22030Xtl("safety", str4, str, str3, str2, (Map) null, (Map) null, (Map) null));
        }
    }

    public static final void A01(E3R e3r, String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = e3r.A00;
        if (businessFlowAnalyticsLogger == null) {
            DbS.A12();
            throw AnonymousClass00P.createAndThrow();
        }
        String str2 = e3r.A03;
        HashMap A1E = AnonymousClass7TE.A1E();
        if (e3r.A06) {
            A1E.put("hide_more_comments_setting", String.valueOf(e3r.A05));
        }
        if (e3r.A07) {
            A1E.put("hide_message_requests_setting", String.valueOf(e3r.A04));
        }
        businessFlowAnalyticsLogger.Ckp(new C22030Xtl("safety", str2, str, (String) null, (String) null, (Map) null, A1E, (Map) null));
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.E3R, X.07Z, X.0iw, androidx.fragment.app.Fragment, java.lang.Object] */
    public final void DZI() {
        2ZS A002;
        A01(this, "continue");
        if (this.A06) {
            Context requireContext = requireContext();
            0gy A003 = AnonymousClass07i.A00(this);
            1NY A0a = AnonymousClass7TG.A0a(DbT.A0X(this.A0E));
            A0a.A0A(AnonymousClass000.A00(1067));
            A0a.A0O((15p) null, 1XP.class, 1XY.class, true);
            A0a.A0C("config_value", this.A05 ? 1 : 0);
            1OC A0U = DbT.A0U(A0a, true);
            A0U.A00 = C47697EDg.A00(this, 24);
            1ES.A00(requireContext, A003, A0U);
        }
        if (this.A07) {
            AnonymousClass0eM r1 = this.A0E;
            AnonymousClass631 r2 = new AnonymousClass631(AnonymousClass7TE.A0l(r1));
            if (r2.A04()) {
                r2.A00(new C50425FbY(this), this.A04);
            } else {
                Context requireContext2 = requireContext();
                0gy A004 = AnonymousClass07i.A00(this);
                1NY A0a2 = AnonymousClass7TG.A0a(DbT.A0X(r1));
                A0a2.A0A("accounts/set_hide_message_requests_global/");
                A0a2.A0O((15p) null, 1XP.class, 1XY.class, true);
                A0a2.A0C("config_value", this.A04 ? 1 : 0);
                1OC A0U2 = DbT.A0U(A0a2, true);
                A0U2.A00 = C47697EDg.A00(this, 25);
                1ES.A00(requireContext2, A004, A0U2);
            }
        }
        FCT.A01(this, AnonymousClass7TE.A0l(this.A0E), "igwb", "primary_button_did_tapped", (String) null);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger == null) {
            DbS.A12();
            throw AnonymousClass00P.createAndThrow();
        }
        String str = this.A03;
        HashMap A1E = AnonymousClass7TE.A1E();
        if (this.A06) {
            A1E.put("hide_more_comments_setting", String.valueOf(this.A05));
        }
        if (this.A07) {
            A1E.put("hide_message_requests_setting", String.valueOf(this.A04));
        }
        businessFlowAnalyticsLogger.Ci7(new C22030Xtl("safety", str, (String) null, (String) null, (String) null, (Map) null, A1E, (Map) null));
        G8D g8d = this.A08;
        if (g8d != null) {
            ((BusinessConversionActivity) g8d).Clz((Bundle) null);
        }
        if (AnonymousClass7TF.A1Z(this.A0D) && (A002 = C71172bH.A00()) != null) {
            C240073Jm.A00 = true;
            A002.Enh(1QK.A0E);
        }
    }

    public final void Di0() {
        2ZS A002;
        A01(this, "skip");
        FCT.A01(this, AnonymousClass7TE.A0l(this.A0E), "igwb", "secondary_button_did_tapped", (String) null);
        G8D g8d = this.A08;
        if (g8d != null) {
            ((BusinessConversionActivity) g8d).A0p((Bundle) null, true);
        }
        if (AnonymousClass7TF.A1Z(this.A0D) && (A002 = C71172bH.A00()) != null) {
            C240073Jm.A00 = true;
            A002.Enh(1QK.A0E);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0E);
    }

    public final boolean onBackPressed() {
        G8D g8d = this.A08;
        if (g8d == null) {
            return true;
        }
        Dba.A1R(g8d);
        return true;
    }

    public final void configureActionBar(2da r3) {
        Dbb.A1J(r3);
        if (!AnonymousClass7TF.A1Z(this.A0C)) {
            FPB.A02(DbV.A0K(), r3, this, 66);
        }
    }

    public final void onCreate(Bundle bundle) {
        C319586qr r1;
        String str;
        int A022 = AnonymousClass0fD.A02(335311956);
        E3R.super.onCreate(bundle);
        this.A03 = DbX.A0o(this);
        0eE r0 = AnonymousClass0t1.A01;
        AnonymousClass0eM r4 = this.A0E;
        User A0l = DbX.A0l(r0, r4);
        Boolean CUd = A0l.A03.CUd();
        if (CUd != null) {
            this.A06 = !CUd.booleanValue();
        }
        boolean z = !A0l.A2I();
        this.A07 = z;
        if (!z && !this.A06) {
            this.A07 = true;
            this.A06 = true;
            0wb.A03("safety_step_fragment", "Both settings are already on");
        }
        0lg A0X = DbT.A0X(r4);
        G8D g8d = this.A08;
        if (g8d != null) {
            r1 = g8d.B6a();
        } else {
            r1 = C319586qr.SHORTENED_CREATOR_CONVERSION_FLOW;
        }
        G8D g8d2 = this.A08;
        if (g8d2 != null) {
            str = (String) AnonymousClass7TE.A14(((BusinessConversionActivity) g8d2).A0C);
        } else {
            str = null;
        }
        BusinessFlowAnalyticsLogger A002 = C319596qs.A00(r1, this, A0X, str);
        if (A002 != null) {
            this.A00 = A002;
            AnonymousClass0fD.A09(-621006612, A022);
            return;
        }
        IllegalStateException A0z = AnonymousClass7TE.A0z("received null flowType or unexpected value for flowType");
        AnonymousClass0fD.A09(-222337591, A022);
        throw A0z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0100, code lost:
        if (r14.A06 == false) goto L_0x0102;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r15, android.view.ViewGroup r16, android.os.Bundle r17) {
        /*
            r14 = this;
            r0 = -334002398(0xffffffffec178722, float:-7.327438E26)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r3 = 0
            X.0qQ.A0B(r15, r3)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r4 = r14.A00
            if (r4 != 0) goto L_0x0017
            X.DbS.A12()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0017:
            java.lang.String r6 = "safety"
            r8 = 0
            java.lang.String r7 = r14.A03
            java.util.HashMap r11 = X.AnonymousClass7TE.A1E()
            X.0eE r1 = X.AnonymousClass0t1.A01
            X.0eM r0 = r14.A0E
            com.instagram.user.model.User r5 = X.DbX.A0l(r1, r0)
            boolean r0 = r14.A06
            if (r0 == 0) goto L_0x003b
            X.4Cl r0 = r5.A03
            java.lang.Boolean r0 = r0.CUd()
            java.lang.String r1 = X.DbX.A0t(r0)
            java.lang.String r0 = "hide_more_comments_setting"
            r11.put(r0, r1)
        L_0x003b:
            boolean r0 = r14.A07
            if (r0 == 0) goto L_0x004c
            boolean r0 = r5.A2I()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "hide_message_requests_setting"
            r11.put(r0, r1)
        L_0x004c:
            X.Xtl r5 = new X.Xtl
            r9 = r8
            r10 = r8
            r12 = r8
            r13 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r4.Cka(r5)
            r0 = 2131629250(0x7f0e14c2, float:1.8885816E38)
            r1 = r16
            android.view.View r5 = r15.inflate(r0, r1, r3)
            r0 = 2131440610(0x7f0b33e2, float:1.8503208E38)
            android.view.View r1 = X.AnonymousClass7TF.A0F(r5, r0)
            com.instagram.igds.components.headline.IgdsHeadline r1 = (com.instagram.igds.components.headline.IgdsHeadline) r1
            boolean r0 = r14.A06
            if (r0 == 0) goto L_0x0139
            boolean r0 = r14.A07
            if (r0 == 0) goto L_0x012e
            r0 = 2131972487(0x7f135187, float:1.9581983E38)
            r1.setHeadline((int) r0)
            r0 = 2131972486(0x7f135186, float:1.958198E38)
        L_0x007b:
            r1.setBody((int) r0)
            r0 = 2131237696(0x7f081b40, float:1.809165E38)
            r1.setImageResource(r0)
            r0 = 2131433927(0x7f0b19c7, float:1.8489654E38)
            android.view.View r4 = X.AnonymousClass7TF.A0F(r5, r0)
            com.instagram.igds.components.textcell.IgdsListCell r4 = (com.instagram.igds.components.textcell.IgdsListCell) r4
            boolean r0 = r14.A07
            if (r0 == 0) goto L_0x0128
            r14.A02 = r4
            r4.setVisibility(r3)
            X.Njo r0 = X.C69349Njo.TYPE_SWITCH
            r4.setTextCellType(r0)
            r0 = 2131237893(0x7f081c05, float:1.809205E38)
            r4.A05(r0)
            r0 = 2131972497(0x7f135191, float:1.9582003E38)
            X.Dba.A14(r14, r4, r0)
            boolean r1 = r14.A06
            r0 = 2131972490(0x7f13518a, float:1.958199E38)
            if (r1 == 0) goto L_0x00b1
            r0 = 2131972495(0x7f13518f, float:1.9582E38)
        L_0x00b1:
            java.lang.String r0 = X.DbU.A0m(r14, r0)
            r4.A0H(r0)
            boolean r0 = r14.A04
            r4.setChecked(r0)
            r0 = 5
            X.FdS.A00(r4, r14, r0)
        L_0x00c1:
            r0 = 2131433929(0x7f0b19c9, float:1.8489658E38)
            android.view.View r1 = X.AnonymousClass7TF.A0F(r5, r0)
            com.instagram.igds.components.textcell.IgdsListCell r1 = (com.instagram.igds.components.textcell.IgdsListCell) r1
            boolean r0 = r14.A06
            if (r0 == 0) goto L_0x0122
            r14.A01 = r1
            r1.setVisibility(r3)
            X.Njo r0 = X.C69349Njo.TYPE_SWITCH
            r1.setTextCellType(r0)
            r0 = 2131238274(0x7f081d82, float:1.8092822E38)
            r1.A05(r0)
            r0 = 2131972494(0x7f13518e, float:1.9581997E38)
            X.Dba.A14(r14, r1, r0)
            r0 = 2131972493(0x7f13518d, float:1.9581995E38)
            java.lang.String r0 = X.DbU.A0m(r14, r0)
            r1.A0H(r0)
            boolean r0 = r14.A05
            r1.setChecked(r0)
            r0 = 6
            X.FdS.A00(r1, r14, r0)
        L_0x00f7:
            boolean r0 = r14.A07
            if (r0 == 0) goto L_0x0102
            boolean r0 = r14.A06
            r4 = 2131972491(0x7f13518b, float:1.9581991E38)
            if (r0 != 0) goto L_0x0105
        L_0x0102:
            r4 = 2131972492(0x7f13518c, float:1.9581993E38)
        L_0x0105:
            r3 = 2131968513(0x7f134201, float:1.9573923E38)
            r0 = 2131428887(0x7f0b0617, float:1.8479431E38)
            android.view.View r1 = X.AnonymousClass7TE.A0b(r5, r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r1
            X.EEJ r0 = new X.EEJ
            r0.<init>((X.C51925G7t) r14, (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r1, (int) r4, (int) r3)
            r14.A09 = r0
            r14.registerLifecycleListener(r0)
            r0 = 1995151414(0x76eb9836, float:2.3892128E33)
            X.AnonymousClass0fD.A09(r0, r2)
            return r5
        L_0x0122:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x00f7
        L_0x0128:
            r0 = 8
            r4.setVisibility(r0)
            goto L_0x00c1
        L_0x012e:
            r0 = 2131972485(0x7f135185, float:1.9581979E38)
            r1.setHeadline((int) r0)
            r0 = 2131972484(0x7f135184, float:1.9581977E38)
            goto L_0x007b
        L_0x0139:
            r0 = 2131972489(0x7f135189, float:1.9581987E38)
            r1.setHeadline((int) r0)
            r0 = 2131972488(0x7f135188, float:1.9581985E38)
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E3R.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-831642313);
        super.onDestroyView();
        EEJ eej = this.A09;
        if (eej == null) {
            0qQ.A0F("businessNavBarHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        unregisterLifecycleListener(eej);
        AnonymousClass0fD.A09(1831060114, A022);
    }

    public final void onStart() {
        String str;
        int A022 = AnonymousClass0fD.A02(817817808);
        E3R.super.onStart();
        boolean z = this.A0B;
        this.A05 = z;
        this.A04 = this.A0A;
        if (this.A06) {
            IgdsListCell igdsListCell = this.A01;
            if (igdsListCell == null) {
                str = "commentSwitch";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            igdsListCell.setChecked(z);
        }
        if (this.A07) {
            IgdsListCell igdsListCell2 = this.A02;
            if (igdsListCell2 == null) {
                str = "messageSwitch";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            igdsListCell2.setChecked(this.A04);
        }
        AnonymousClass0fD.A09(-1859739362, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1345090128);
        this.A0B = this.A05;
        this.A0A = this.A04;
        E3R.super.onStop();
        AnonymousClass0fD.A09(1214529011, A022);
    }
}
