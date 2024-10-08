package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import com.facebook.msys.mci.TraceLogger;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class E6S extends AnonymousClass32G implements AnonymousClass0iw, AnonymousClass08W {
    public static final String __redex_internal_original_name = "AccountSwitchFragment";
    public Context A00;
    public Intent A01;
    public UserSession A02;
    public C46712Dji A03;
    public String A04;
    public List A05;
    public boolean A06;
    public G5z A07 = C50592Ff6.A00;
    public final 1wn A08 = FXZ.A00(this, 29);

    public final String getModuleName() {
        return "account_switch_fragment";
    }

    public static void A02(E6S e6s, String str, boolean z, boolean z2) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(e6s.A02), "account_switch_user_tapped");
        if (A0e.isSampled()) {
            DbS.A1N(A0e, e6s.A04);
            A0e.A7p("is_current_user_in", Boolean.valueOf(z));
            A0e.A7p("is_logged_in", Boolean.valueOf(z2));
            DbS.A1K(A0e, "account_switch_fragment");
            A0e.AAJ(Dbj.A03(), str);
            A0e.Cgf();
        }
        C46400DeN.A05(e6s.A02, "native", e6s.A04);
        if (e6s.A04 == "direct_inbox") {
            C282375Cv.A00(e6s.A02);
            String str2 = null;
            TraceLogger.broadcastEvent(10000008, 0, (List) null);
            User BNx = AnonymousClass0BO.A00(e6s.A02).BNx(str);
            AnonymousClass3H3 A002 = FFg.A00(BNx);
            C67537MpW A003 = C67537MpW.A00(02m.A0p);
            A003.A01();
            A003.A02(A002);
            String str3 = e6s.A02.A06;
            if (BNx != null) {
                str2 = BNx.A03.getPkId();
            }
            A003.A03(str3, str2);
        }
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return this.A02;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        super.onViewCreated(view2, bundle);
        0S7.A00(this);
        this.A04.setOnItemClickListener(this.A03);
        0S7.A00(this);
        this.A04.setDivider((Drawable) null);
        UserSession userSession = this.A02;
        0qQ.A0B(userSession, 0);
        if (DbU.A1Z(userSession)) {
            0S7.A00(this);
            this.A04.setOnItemLongClickListener(this.A03);
        }
        1xC.A01.A02(this.A08, AnonymousClass3H2.class);
        List list = this.A05;
        HashSet A1F = AnonymousClass7TE.A1F();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DbY.A1W(A1F, it);
        }
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this, this.A02), "account_switcher_impression");
        A0e.AAF("array_accounts_logged_in", A1F);
        A0e.Cgf();
        C62880wX r10 = C61170le.A00;
        0xm A002 = AnonymousClass0xl.A00(r10);
        long currentTimeMillis = System.currentTimeMillis();
        0xY A0d = DbS.A0d(A002);
        A0d.E5c("account_switcher_impression_last_log_time", currentTimeMillis);
        A0d.apply();
        UserSession userSession2 = this.A02;
        0qQ.A0B(userSession2, 0);
        long j = DbT.A0g(r10).getLong("long_press_account_switcher_row_to_create_shortcut_tooltip_last_impression_time", -1);
        long j2 = DbT.A0g(r10).getLong("dedicated_account_shortcut_last_tap_time", -1);
        long j3 = DbT.A0g(r10).getLong("long_press_account_switcher_row_to_create_shortcut_last_timestamp", -1);
        long currentTimeMillis2 = System.currentTimeMillis();
        int i = (((long) DbT.A0g(r10).getInt("long_press_account_switcher_row_to_create_shortcut_tooltip_impressions", 0)) > 2 ? 1 : (((long) DbT.A0g(r10).getInt("long_press_account_switcher_row_to_create_shortcut_tooltip_impressions", 0)) == 2 ? 0 : -1));
        boolean z = false;
        if (i < 0) {
            z = true;
        }
        boolean A1U = Dba.A1U((604800000 > (currentTimeMillis2 - j) ? 1 : (604800000 == (currentTimeMillis2 - j) ? 0 : -1)));
        boolean A1U2 = Dba.A1U((604800000 > (currentTimeMillis2 - j2) ? 1 : (604800000 == (currentTimeMillis2 - j2) ? 0 : -1)));
        boolean A1U3 = Dba.A1U((604800000 > (currentTimeMillis2 - j3) ? 1 : (604800000 == (currentTimeMillis2 - j3) ? 0 : -1)));
        if (DbU.A1Z(userSession2) && z && A1U && A1U3 && A1U2) {
            view2.postDelayed(new C51463FuX(Html.fromHtml(this.A00.getResources().getString(2131965613)), view2, this), 500);
        }
        new C55973Hqe(view2, new C51586Fwa(this, 4), false).A00();
    }

    public static void A01(E6S e6s) {
        AnonymousClass37D A0i = DbT.A0i(e6s.requireActivity());
        if (A0i != null) {
            A0i.A0B();
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(e6s.A02), "account_switch_add_account_sheet_dismissed");
            if (A0e.isSampled()) {
                DbS.A1N(A0e, e6s.A04);
                A0e.A7p("is_short_copy", AnonymousClass7TE.A0u());
                A0e.Cgf();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.07Z, X.E6S, X.0S7, X.07g, androidx.fragment.app.Fragment] */
    /* JADX WARNING: type inference failed for: r0v91, types: [java.lang.Object, X.2YM] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00e1, code lost:
        if (X.1AW.A06(r13, 18302436196291244L) == false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00e5, code lost:
        if (r19 == false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00e7, code lost:
        r35 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00f2, code lost:
        if (X.1AW.A06(r13, 18302436196225707L) != false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00f4, code lost:
        r35 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00f6, code lost:
        if (r19 == false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00f8, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0102, code lost:
        if (X.1AW.A06(r13, 18302436196356781L) != false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0104, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0105, code lost:
        r24 = new X.C46712Dji(r2, r2.A02, r2, r28, r2.A05, r30, r31, r5, r33, r34, r35);
        r2.A03 = r24;
        A0V(r24);
        r3 = X.AnonymousClass7TE.A0e(X.AnonymousClass0kN.A02(r2.A02), "account_switch_button_tapped");
        r4 = X.FFT.A00(r2.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0135, code lost:
        if (r3.isSampled() == false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0137, code lost:
        r3.AAJ(com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r2.A04);
        r3.A9F("number_of_accounts", java.lang.Long.valueOf(X.AnonymousClass7TE.A0R(r4.get(1))));
        r3.A9F("number_of_logged_in_accounts", java.lang.Long.valueOf(X.AnonymousClass7TE.A0R(r4.get(0))));
        X.DbS.A1K(r3, "account_switch_fragment");
        r3.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x016a, code lost:
        r9 = r2.A02;
        r15 = X.AnonymousClass3H7.A02(r9);
        r0 = (long) X.AnonymousClass3H7.A00(r2.A02);
        r3 = r2.A02.A06;
        r11 = X.DbV.A0q(r3);
        r12 = X.DbV.A0q(r3);
        r4 = r2.A04;
        r3 = X.C46400DeN.A04;
        X.0qQ.A0B(r4, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0192, code lost:
        switch(r4.hashCode()) {
            case -1814342561: goto L_0x0216;
            case -657162262: goto L_0x0207;
            case -309425751: goto L_0x01fc;
            case 441111834: goto L_0x01f1;
            case 660917936: goto L_0x01e6;
            case 1434631203: goto L_0x01db;
            case 2005378358: goto L_0x01d0;
            default: goto L_0x0195;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0195, code lost:
        r8 = X.C46398DeL.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0197, code lost:
        X.C46400DeN.A02(r8, r9, false, r11, r12, r0, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x019b, code lost:
        if (r34 == false) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x019d, code lost:
        if (r6 == false) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x019f, code lost:
        X.2aN.A00(r2.A02).A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01a8, code lost:
        r1 = new X.2YN(new java.lang.Object(), r2).A00(X.C46796DlX.class);
        r2.A07 = r1;
        X.C50139FQw.A00(r2, r1.AD7(r2.A02), 21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01c7, code lost:
        X.AnonymousClass0fD.A09(-1142796779, r23);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01cf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01d6, code lost:
        if (r4.equals("bookmark") == false) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01d8, code lost:
        r8 = X.C46398DeL.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01e1, code lost:
        if (r4.equals("settings") == false) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01e3, code lost:
        r8 = X.C46398DeL.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01ec, code lost:
        if (r4.equals("direct_inbox") == false) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01ee, code lost:
        r8 = X.C46398DeL.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01f7, code lost:
        if (r4.equals("unknown_nt_action") == false) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01f9, code lost:
        r8 = X.C46398DeL.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0202, code lost:
        if (r4.equals("profile") == false) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0204, code lost:
        r8 = X.C46398DeL.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0211, code lost:
        if (r4.equals(X.AnonymousClass000.A00(5018)) == false) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0213, code lost:
        r8 = X.C46398DeL.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x021c, code lost:
        if (r4.equals("double_tap_tab_bar") == false) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x021e, code lost:
        r8 = X.C46398DeL.A0C;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0222  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r37) {
        /*
            r36 = this;
            r0 = -336929187(0xffffffffebeade5d, float:-5.6787745E26)
            int r23 = X.AnonymousClass0fD.A02(r0)
            r2 = r36
            r0 = r37
            X.E6S.super.onCreate(r0)
            android.os.Bundle r1 = r2.requireArguments()
            com.instagram.common.session.UserSession r0 = X.DbX.A0U(r2)
            r2.A02 = r0
            java.lang.String r22 = "entry_point"
            r0 = r22
            java.lang.String r0 = X.DbU.A0l(r1, r0)
            r2.A04 = r0
            android.content.Context r0 = r2.getContext()
            r2.A00 = r0
            r0 = 647(0x287, float:9.07E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r0 = r1.getParcelable(r0)
            android.content.Intent r0 = (android.content.Intent) r0
            r2.A01 = r0
            r0 = 93
            java.lang.String r0 = X.C273654mx.A00(r0)
            r14 = 0
            boolean r21 = r1.getBoolean(r0, r14)
            r0 = 627(0x273, float:8.79E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0, r14)
            r2.A06 = r0
            r0 = 628(0x274, float:8.8E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r33 = r1.getBoolean(r0, r14)
            com.instagram.common.session.UserSession r0 = r2.A02
            java.util.List r3 = X.DbV.A17(r0)
            int r1 = r3.size()
            r20 = 1
            r19 = 0
            r0 = r20
            if (r1 <= r0) goto L_0x006b
            r19 = 1
        L_0x006b:
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r3)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x0080
            com.instagram.common.session.UserSession r0 = r2.A02
            com.instagram.user.model.User r0 = X.DbT.A0j(r0)
            r1.remove(r0)
        L_0x0080:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>(r1)
            r2.A05 = r0
            com.instagram.common.session.UserSession r0 = r2.A02
            X.9BF r0 = X.AnonymousClass9BE.A00(r0)
            r0.A02()
            com.instagram.common.session.UserSession r0 = r2.A02
            X.3EO r0 = X.AnonymousClass3EO.A00(r0)
            java.util.HashMap r0 = r0.A01
            java.util.Collection r0 = r0.values()
            com.google.common.collect.ImmutableList r30 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            com.instagram.common.session.UserSession r0 = r2.A02
            X.3EO r0 = X.AnonymousClass3EO.A00(r0)
            java.util.HashMap r0 = r0.A02
            java.util.Collection r0 = r0.values()
            com.google.common.collect.ImmutableList r31 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            com.instagram.common.session.UserSession r0 = r2.A02
            r25 = r0
            X.0Tu r13 = X.DbS.A0J(r0, r14)
            r0 = 18298523481081384(0x41026900010628, double:1.892360196880068E-307)
            boolean r0 = X.1AW.A06(r13, r0)
            if (r0 != 0) goto L_0x0226
            r0 = 18298523481015847(0x41026900000627, double:1.892360196854164E-307)
            boolean r0 = X.1AW.A06(r13, r0)
            if (r0 != 0) goto L_0x0226
        L_0x00ce:
            X.0sn r5 = X.0sn.A00
        L_0x00d0:
            if (r21 == 0) goto L_0x0222
            java.lang.Integer r28 = X.AnonymousClass05K.A01
        L_0x00d4:
            if (r19 == 0) goto L_0x00e3
            r0 = 18302436196291244(0x4105f8000112ac, double:1.8939067074137897E-307)
            boolean r0 = X.1AW.A06(r13, r0)
            r34 = 1
            if (r0 != 0) goto L_0x00e7
        L_0x00e3:
            r34 = 0
            if (r19 == 0) goto L_0x00f4
        L_0x00e7:
            r0 = 18302436196225707(0x4105f8000012ab, double:1.893906707387886E-307)
            boolean r0 = X.1AW.A06(r13, r0)
            r35 = 1
            if (r0 != 0) goto L_0x00f8
        L_0x00f4:
            r35 = 0
            if (r19 == 0) goto L_0x0104
        L_0x00f8:
            r0 = 18302436196356781(0x4105f8000212ad, double:1.8939067074396934E-307)
            boolean r0 = X.1AW.A06(r13, r0)
            r6 = 1
            if (r0 != 0) goto L_0x0105
        L_0x0104:
            r6 = 0
        L_0x0105:
            com.instagram.common.session.UserSession r3 = r2.A02
            java.util.List r1 = r2.A05
            X.Dji r0 = new X.Dji
            r24 = r0
            r25 = r2
            r26 = r3
            r27 = r2
            r29 = r1
            r32 = r5
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r2.A03 = r0
            r2.A0V(r0)
            com.instagram.common.session.UserSession r0 = r2.A02
            X.0wc r1 = X.AnonymousClass0kN.A02(r0)
            java.lang.String r0 = "account_switch_button_tapped"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            com.instagram.common.session.UserSession r0 = r2.A02
            java.util.ArrayList r4 = X.FFT.A00(r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x016a
            java.lang.String r1 = r2.A04
            r0 = r22
            r3.AAJ(r0, r1)
            r0 = r20
            java.lang.Object r0 = r4.get(r0)
            long r0 = X.AnonymousClass7TE.A0R(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "number_of_accounts"
            r3.A9F(r0, r1)
            java.lang.Object r0 = r4.get(r14)
            long r0 = X.AnonymousClass7TE.A0R(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "number_of_logged_in_accounts"
            r3.A9F(r0, r1)
            java.lang.String r0 = "account_switch_fragment"
            X.DbS.A1K(r3, r0)
            r3.Cgf()
        L_0x016a:
            com.instagram.common.session.UserSession r9 = r2.A02
            boolean r15 = X.AnonymousClass3H7.A02(r9)
            com.instagram.common.session.UserSession r0 = r2.A02
            int r0 = X.AnonymousClass3H7.A00(r0)
            long r0 = (long) r0
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r14)
            com.instagram.common.session.UserSession r3 = r2.A02
            java.lang.String r3 = r3.A06
            java.lang.Long r11 = X.DbV.A0q(r3)
            java.lang.Long r12 = X.DbV.A0q(r3)
            java.lang.String r4 = r2.A04
            boolean r3 = X.C46400DeN.A04
            X.0qQ.A0B(r4, r14)
            int r3 = r4.hashCode()
            switch(r3) {
                case -1814342561: goto L_0x0216;
                case -657162262: goto L_0x0207;
                case -309425751: goto L_0x01fc;
                case 441111834: goto L_0x01f1;
                case 660917936: goto L_0x01e6;
                case 1434631203: goto L_0x01db;
                case 2005378358: goto L_0x01d0;
                default: goto L_0x0195;
            }
        L_0x0195:
            X.DeL r8 = X.C46398DeL.A0E
        L_0x0197:
            r13 = r0
            X.C46400DeN.A02(r8, r9, r10, r11, r12, r13, r15)
            if (r34 == 0) goto L_0x01c7
            if (r6 == 0) goto L_0x01a8
            com.instagram.common.session.UserSession r0 = r2.A02
            X.2aO r0 = X.2aN.A00(r0)
            r0.A03()
        L_0x01a8:
            X.EEY r0 = new X.EEY
            r0.<init>()
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r2)
            java.lang.Class<X.DlX> r0 = X.C46796DlX.class
            X.2YL r1 = r1.A00(r0)
            X.G5z r1 = (X.G5z) r1
            r2.A07 = r1
            com.instagram.common.session.UserSession r0 = r2.A02
            X.2Fk r1 = r1.AD7(r0)
            r0 = 21
            X.C50139FQw.A00(r2, r1, r0)
        L_0x01c7:
            r1 = -1142796779(0xffffffffbbe24e15, float:-0.0069062808)
            r0 = r23
            X.AnonymousClass0fD.A09(r1, r0)
            return
        L_0x01d0:
            java.lang.String r3 = "bookmark"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0195
            X.DeL r8 = X.C46398DeL.A03
            goto L_0x0197
        L_0x01db:
            java.lang.String r3 = "settings"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0195
            X.DeL r8 = X.C46398DeL.A0A
            goto L_0x0197
        L_0x01e6:
            java.lang.String r3 = "direct_inbox"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0195
            X.DeL r8 = X.C46398DeL.A04
            goto L_0x0197
        L_0x01f1:
            java.lang.String r3 = "unknown_nt_action"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0195
            X.DeL r8 = X.C46398DeL.A0F
            goto L_0x0197
        L_0x01fc:
            java.lang.String r3 = "profile"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0195
            X.DeL r8 = X.C46398DeL.A09
            goto L_0x0197
        L_0x0207:
            r3 = 5018(0x139a, float:7.032E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0195
            X.DeL r8 = X.C46398DeL.A0D
            goto L_0x0197
        L_0x0216:
            java.lang.String r3 = "double_tap_tab_bar"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0195
            X.DeL r8 = X.C46398DeL.A0C
            goto L_0x0197
        L_0x0222:
            java.lang.Integer r28 = X.AnonymousClass05K.A00
            goto L_0x00d4
        L_0x0226:
            X.35F r7 = new X.35F
            r0 = r25
            r7.<init>(r0)
            X.1Am r1 = X.1Al.A01(r25)
            X.1An r0 = X.1An.A2I
            X.0xa r6 = r1.A03(r0)
            X.0sl r3 = X.0sl.A00
            java.lang.String r5 = "ndx_ig4a_steps"
            java.util.Set r4 = r6.getStringSet(r5, r3)
            if (r4 == 0) goto L_0x00ce
            java.lang.String r8 = "multiple_account"
            boolean r0 = r4.contains(r8)
            if (r0 == 0) goto L_0x00ce
            X.FB9 r15 = X.FB9.A00
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = "written_timestamp"
            long r0 = r6.getLong(r9, r0)
            long r11 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r0
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.DAYS
            r0 = 1
            long r9 = r9.toMillis(r0)
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0295
            java.util.Set r1 = X.00k.A0j(r4)
            r1.remove(r8)
            X.0xY r0 = r6.AR4()
            r0.E5h(r5, r1)
            r0.apply()
            X.0wc r1 = r7.A00
            java.lang.String r0 = "ig4a_ndx_request"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "flow_name"
            r1.AAJ(r0, r8)
            java.lang.String r0 = "fail_ttl_check"
            X.DbY.A1F(r1, r0)
            java.lang.String r3 = "NDX_IG4A_MA_FEATURE"
            java.lang.String r0 = "ig_ndx_source"
            r1.AAJ(r0, r3)
        L_0x0290:
            r1.Cgf()
            goto L_0x00ce
        L_0x0295:
            X.0wc r12 = r7.A00
            java.lang.String r18 = "ig4a_ndx_request"
            X.0kJ r0 = r12.A00
            r24 = r0
            r1 = r0
            r0 = r18
            X.0Aj r0 = r12.A00(r1, r0)
            java.lang.String r17 = "flow_name"
            r1 = r17
            r0.AAJ(r1, r8)
            java.lang.String r1 = "pass_ttl_check"
            java.lang.String r11 = "action"
            r0.AAJ(r11, r1)
            java.lang.String r10 = "567067343352427"
            java.lang.String r9 = "ig_appid"
            r0.AAJ(r9, r10)
            java.lang.String r7 = "NDX_IG4A_MA_FEATURE"
            java.lang.String r6 = "ig_ndx_source"
            r0.AAJ(r6, r7)
            r0.Cgf()
            r0 = r25
            X.1CV r15 = r15.A00(r0)
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            X.Pzc r5 = new X.Pzc
            r5.<init>()
            java.lang.Class<X.Jtv> r1 = X.C60937Jtv.class
            com.instagram.nux.aymh.accountprovider.AccountDeserializer r4 = new com.instagram.nux.aymh.accountprovider.AccountDeserializer
            r4.<init>()
            r5.A02(r4, r1)
            com.google.gson.Gson r5 = r5.A00()
            java.lang.String r4 = "additional_accounts"
            java.util.Set r3 = r15.getStringSet(r4, r3)
            if (r3 == 0) goto L_0x030a
            java.util.Iterator r15 = r3.iterator()
        L_0x02ec:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L_0x030a
            java.lang.String r3 = X.AnonymousClass7TE.A18(r15)
            java.lang.Object r3 = r5.A09(r3, r1)     // Catch:{ Exception -> 0x0303 }
            X.Jtv r3 = (X.C60937Jtv) r3     // Catch:{ Exception -> 0x0303 }
            X.0qQ.A0A(r3)     // Catch:{ Exception -> 0x0303 }
            r0.add(r3)     // Catch:{ Exception -> 0x0303 }
            goto L_0x02ec
        L_0x0303:
            r4 = move-exception
            java.lang.String r3 = "Account Deserialization Error"
            X.0wb.A07(r3, r4)
            goto L_0x02ec
        L_0x030a:
            boolean r1 = X.DbT.A1b(r0)
            if (r1 == 0) goto L_0x0394
            X.0sm r5 = X.0Yt.A0E()
            r1 = 9
            int r1 = X.0Yv.A1E(r0, r1)
            if (r1 != 0) goto L_0x0354
            java.util.List r4 = X.AnonymousClass7TE.A1I(r5)
        L_0x0320:
            java.lang.Object r0 = X.00k.A0K(r4)
            java.util.Map r0 = (java.util.Map) r0
            java.util.Collection r0 = r0.values()
            java.util.List r15 = X.00k.A0a(r0)
        L_0x032e:
            X.0BQ r0 = X.AnonymousClass0BO.A00(r25)
            java.util.List r0 = r0.BNu()
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x033e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0397
            com.instagram.user.model.User r0 = X.DbT.A0k(r4)
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = r0.getUsername()
            X.AnonymousClass7TF.A1I(r1, r0, r3)
            goto L_0x033e
        L_0x0354:
            int r1 = r1 + 1
            java.util.ArrayList r4 = X.DbS.A0v(r1)
            r4.add(r5)
            java.util.Iterator r16 = r0.iterator()
        L_0x0361:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0320
            java.lang.Object r3 = r16.next()
            X.Jtv r3 = (X.C60937Jtv) r3
            java.lang.String r15 = r3.A03
            java.lang.Integer r0 = r3.A01
            X.LEe r1 = new X.LEe
            r1.<init>(r15, r0)
            java.lang.Object r0 = r5.get(r1)
            X.JwH r0 = (X.C61079JwH) r0
            if (r0 == 0) goto L_0x038e
            X.JwH r0 = r0.A03(r3)
        L_0x0382:
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r0)
            java.util.Map r5 = X.0Yt.A0C(r5, r0)
            r4.add(r5)
            goto L_0x0361
        L_0x038e:
            X.JwH r0 = new X.JwH
            r0.<init>((X.C60937Jtv) r3)
            goto L_0x0382
        L_0x0394:
            X.0sn r15 = X.0sn.A00
            goto L_0x032e
        L_0x0397:
            java.util.Map r3 = X.0Yt.A08(r3)
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r15 = r15.iterator()
        L_0x03a3:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x03c6
            java.lang.Object r1 = r15.next()
            r4 = r1
            X.JwH r4 = (X.C61079JwH) r4
            java.lang.String r0 = r4.A05()
            boolean r0 = r3.containsKey(r0)
            if (r0 != 0) goto L_0x03a3
            java.lang.String r0 = r4.A02
            boolean r0 = r3.containsValue(r0)
            if (r0 != 0) goto L_0x03a3
            r5.add(r1)
            goto L_0x03a3
        L_0x03c6:
            int r1 = r5.size()
            r0 = r20
            if (r1 != r0) goto L_0x03f6
            r0 = 18298519186048550(0x41026800000626, double:1.892358499257531E-307)
            boolean r0 = X.1AW.A06(r13, r0)
            if (r0 == 0) goto L_0x00ce
            r1 = r24
            r0 = r18
            X.0Aj r1 = r12.A00(r1, r0)
            r0 = r17
            r1.AAJ(r0, r8)
            java.lang.String r0 = "push_impression"
            r1.AAJ(r11, r0)
            r1.AAJ(r9, r10)
            r1.AAJ(r6, r7)
            r1.Cgf()
            goto L_0x00d0
        L_0x03f6:
            int r1 = r5.size()
            if (r1 <= r0) goto L_0x00ce
            r1 = r24
            r0 = r18
            X.0Aj r1 = r12.A00(r1, r0)
            r0 = r17
            r1.AAJ(r0, r8)
            java.lang.String r0 = "too_many_accounts"
            r1.AAJ(r11, r0)
            r1.AAJ(r9, r10)
            r1.AAJ(r6, r7)
            goto L_0x0290
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E6S.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1168770187);
        super.onDestroy();
        AnonymousClass0fD.A09(1247110987, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1849595034);
        super.onDestroyView();
        1xC.A01.A03(this.A08, AnonymousClass3H2.class);
        AnonymousClass0fD.A09(-2057028173, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-198884373);
        super.onResume();
        0S7.A00(this);
        2eQ.A06(this.A04, 500);
        AnonymousClass0fD.A09(642859148, A022);
    }
}
