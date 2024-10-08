package X;

import android.view.View;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import java.util.List;

/* renamed from: X.FOy  reason: case insensitive filesystem */
public final class C50108FOy implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public C50108FOy(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj4;
        this.A03 = obj;
        this.A06 = obj5;
        this.A04 = obj2;
        this.A01 = i;
        this.A07 = obj6;
        this.A05 = obj3;
    }

    /* JADX WARNING: type inference failed for: r7v9, types: [X.FpO, java.lang.Object, java.lang.Runnable] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0242, code lost:
        X.DbX.A1S(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0324, code lost:
        X.C46521DgO.A04(r0, r1, X.002.A0R(r10.A02, "_clicked"), r3);
        r5 = X.Dd3.A00(r0.A03, r10.A02, r1.A09, r1.A04.A0s, (java.util.HashMap) r10.A00);
        r5.A00 = new X.ECA(r12, r10, r0, r1, r3, r17);
        r7 = new java.lang.Object();
        r7.A00 = r5;
        r5 = X.DbS.A0a();
        X.DbZ.A10(r12, r5, r10.A03);
        r5.A0A = new X.FdE(r10, r7, r0, r1, r3, r17);
        r5.A0L = true;
        r5.A06();
        r5.A02 = 0;
        X.DbY.A1N(r5);
        X.C46521DgO.A0B.postDelayed(r7, (long) X.C46521DgO.A0A);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x037e, code lost:
        if (r17 == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0380, code lost:
        r0.A06.EEA(r1, true);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r25) {
        /*
            r24 = this;
            r4 = r24
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x0514;
                case 1: goto L_0x04d5;
                case 2: goto L_0x049f;
                case 3: goto L_0x0471;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 1406225033(0x53d14a89, float:1.79779731E12)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r4.A02
            X.DgO r0 = (X.C46521DgO) r0
            java.lang.Object r12 = r4.A03
            android.content.Context r12 = (android.content.Context) r12
            java.lang.Object r1 = r4.A06
            X.5Gi r1 = (X.C283155Gi) r1
            java.lang.Object r10 = r4.A04
            X.9JH r10 = (X.AnonymousClass9JH) r10
            int r3 = r4.A01
            java.lang.Object r7 = r4.A07
            com.instagram.user.model.User r7 = (com.instagram.user.model.User) r7
            java.lang.Object r11 = r4.A05
            X.JV7 r11 = (X.JV7) r11
            int r2 = X.C46521DgO.A0A
            java.lang.String r5 = r10.A02
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L_0x003f
            X.4HS r2 = r0.A05
            r2.A00()
            int r4 = r5.hashCode()
            r2 = 1
            switch(r4) {
                case -1840722463: goto L_0x0454;
                case -336545092: goto L_0x03d7;
                case -250367239: goto L_0x0387;
                case -101739776: goto L_0x0306;
                case 3202370: goto L_0x029d;
                case 93832333: goto L_0x0267;
                case 134534829: goto L_0x0247;
                case 281394031: goto L_0x01e0;
                case 499953017: goto L_0x01ae;
                case 1191002059: goto L_0x00bc;
                case 1449514870: goto L_0x0046;
                default: goto L_0x003f;
            }
        L_0x003f:
            r0 = -1133300935(0xffffffffbc733339, float:-0.014843755)
        L_0x0042:
            X.AnonymousClass0fD.A0C(r0, r6)
            return
        L_0x0046:
            java.lang.String r2 = "report_a_problem"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x003f
            java.lang.String r2 = "report_a_problem_clicked"
            X.C46521DgO.A04(r0, r1, r2, r3)
            androidx.fragment.app.Fragment r2 = r0.A00
            androidx.fragment.app.FragmentActivity r9 = r2.requireActivity()
            X.OWB r3 = new X.OWB
            r3.<init>()
            com.instagram.common.session.UserSession r14 = r0.A03
            java.lang.String r0 = r14.A06
            r2 = 0
            r3.A0I = r0
            com.instagram.bugreporter.source.BugReportSource r0 = com.instagram.bugreporter.source.BugReportSource.NEWSFEED_STORY
            X.0qQ.A0B(r0, r2)
            r3.A00 = r0
            java.lang.String r0 = X.DbS.A0k()
            r3.A0B = r0
            X.2cb r0 = X.2cc.A0T
            java.lang.String r0 = r0.A01(r14)
            r3.A0H = r0
            java.lang.String r0 = r1.A09
            r3.A0C = r0
            int r0 = r1.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.A0E = r0
            java.lang.String r0 = r1.A0C
            r3.A0D = r0
            com.instagram.bugreporter.model.BugReport r13 = r3.A01()
            X.OLY r1 = new X.OLY
            r1.<init>(r9)
            r0 = 2131954333(0x7f130a9d, float:1.9545162E38)
            java.lang.String r0 = r12.getString(r0)
            X.0qQ.A0B(r0, r2)
            r1.A01 = r0
            r0 = 2131971293(0x7f134cdd, float:1.9579561E38)
            java.lang.String r0 = r12.getString(r0)
            X.0qQ.A0B(r0, r2)
            r1.A00 = r0
            com.instagram.bugreporter.BugReportComposerViewModel r11 = r1.A00()
            r10 = 0
            X.NMP r8 = new X.NMP
            r12 = r10
            r8.<init>(r9, r10, r11, r12, r13, r14)
            java.lang.Void[] r0 = new java.lang.Void[r2]
            r8.A02(r0)
            goto L_0x003f
        L_0x00bc:
            java.lang.String r4 = "delete_comment"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x003f
            java.lang.String r4 = "delete_comment_clicked"
            X.C46521DgO.A04(r0, r1, r4, r3)
            java.lang.String r10 = "more_option"
            X.5Gj r4 = r1.A04
            java.lang.String r11 = r4.A0b
            java.lang.String r8 = r1.A07()
            if (r11 == 0) goto L_0x003f
            if (r8 == 0) goto L_0x003f
            X.D9g r4 = X.C65211bM.A00
            X.DDf r4 = r4.A00()
            r4.A0r = r11
            X.1bK r5 = r4.A02()
            X.3gp r4 = new X.3gp
            r4.<init>(r5)
            java.util.HashSet r7 = X.AnonymousClass7TE.A1F()
            r7.add(r4)
            com.instagram.common.session.UserSession r14 = r0.A03
            X.DgJ r4 = X.C46512DgF.A00(r14)
            java.util.HashMap r9 = X.DbZ.A0q()
            com.instagram.common.session.UserSession r5 = r4.A01
            X.0xG r4 = r4.A00
            X.0wc r5 = X.AnonymousClass0kN.A01(r4, r5)
            java.lang.String r4 = "instagram_wellbeing_notify_filter_event"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r5, r4)
            java.lang.String r4 = "comment_id"
            r5.AAJ(r4, r11)
            java.lang.String r4 = "tap"
            X.DbS.A1H(r5, r4)
            java.lang.String r4 = "entrypoint"
            r5.AAJ(r4, r10)
            java.lang.String r4 = "extra_values"
            r5.A9H(r4, r9)
            r5.Cgf()
            X.FTz r13 = new X.FTz
            r13.<init>(r12, r0, r1, r3)
            X.1Xj r15 = X.DbV.A0U(r14, r8)
            java.util.ArrayList r4 = X.A27.A00
            if (r15 == 0) goto L_0x0173
            int r18 = X.C48775Ejy.A00(r14)
            X.0iw r4 = r0.A01
            java.lang.String r16 = r4.getModuleName()
            r17 = r7
            X.IjH r14 = X.I7G.A01(r13, r14, r15, r16, r17, r18)
        L_0x013b:
            X.6ap r9 = X.DbS.A0a()
            android.content.res.Resources r10 = r12.getResources()
            r8 = 2131821016(0x7f1101d8, float:1.9274763E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r5 = 0
            java.lang.String r4 = X.DbV.A0v(r10, r4, r8, r2)
            X.DbZ.A10(r12, r9, r4)
            X.IVf r12 = new X.IVf
            r16 = r0
            r17 = r1
            r18 = r7
            r19 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r9.A0A = r12
            r9.A0L = r2
            r9.A06()
            r9.A02 = r5
            X.Dc2 r3 = r9.A00()
            X.G7F r0 = r0.A06
            r0.EEA(r1, r2)
            goto L_0x0242
        L_0x0173:
            int r9 = X.C48775Ejy.A00(r14)
            X.0iw r4 = r0.A01
            java.lang.String r5 = r4.getModuleName()
            X.AnonymousClass7TG.A1R(r14, r5)
            java.util.HashSet r4 = X.I7G.A04(r7)
            X.1OC r10 = X.C56631I5k.A03(r14, r8, r5, r4)
            java.lang.String r8 = X.AnonymousClass7TG.A0j()
            r4 = 41
            X.IwJ r5 = new X.IwJ
            r5.<init>(r14, r4)
            java.lang.Class<X.7a8> r4 = X.C333787a8.class
            java.lang.Object r5 = r14.A01(r4, r5)
            X.7a8 r5 = (X.C333787a8) r5
            X.H51 r4 = new X.H51
            r4.<init>((int) r2, (java.lang.Object) r13, (java.lang.Object) r7)
            r10.A00 = r4
            X.IjH r14 = new X.IjH
            r14.<init>(r5, r10, r8)
            android.os.Handler r8 = X.I7G.A00
            long r4 = (long) r9
            r8.postDelayed(r14, r4)
            goto L_0x013b
        L_0x01ae:
            java.lang.String r2 = "remove_follower"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x003f
            java.lang.String r2 = "remove_follower_clicked"
            X.C46521DgO.A04(r0, r1, r2, r3)
            com.instagram.common.session.UserSession r15 = r0.A03
            com.instagram.user.model.User r17 = X.F6W.A00(r15, r1)
            if (r17 == 0) goto L_0x003f
            r11 = r12
            android.app.Activity r11 = (android.app.Activity) r11
            X.0iw r14 = r0.A01
            androidx.fragment.app.Fragment r13 = r0.A00
            X.FnQ r16 = new X.FnQ
            r18 = r16
            r19 = r12
            r20 = r0
            r21 = r1
            r22 = r17
            r23 = r3
            r18.<init>(r19, r20, r21, r22, r23)
            X.C49174Eqf.A00(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x003f
        L_0x01e0:
            r4 = 385(0x181, float:5.4E-43)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x003f
            java.lang.String r5 = r10.A02
            java.lang.String r4 = "_clicked"
            java.lang.String r4 = X.002.A0R(r5, r4)
            X.C46521DgO.A04(r0, r1, r4, r3)
            com.instagram.common.session.UserSession r9 = r0.A03
            r8 = 0
            X.0qQ.A0B(r9, r8)
            boolean r4 = X.AnonymousClass5OS.A00(r9)
            if (r4 == 0) goto L_0x003f
            X.0Tu r7 = X.0Tu.A06
            r4 = 36321481861375413(0x810a32001025b5, double:3.033189611777479E-306)
            boolean r4 = X.182.A06(r7, r9, r4)
            if (r4 == 0) goto L_0x003f
            X.5Gf r4 = X.C283115Ge.A00(r9)
            r4.A00(r8)
            X.6ap r7 = X.DbS.A0a()
            android.content.res.Resources r5 = r12.getResources()
            r4 = 2131968341(0x7f134155, float:1.9573574E38)
            java.lang.String r4 = r5.getString(r4)
            X.DbZ.A10(r12, r7, r4)
            X.IVY r4 = new X.IVY
            r11 = r4
            r12 = r3
            r13 = r8
            r14 = r10
            r15 = r0
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            r7.A0A = r4
            r7.A0L = r2
            r7.A06()
            r7.A02 = r8
            X.Dc2 r3 = r7.A00()
        L_0x0242:
            X.DbX.A1S(r3)
            goto L_0x003f
        L_0x0247:
            java.lang.String r4 = "turn_off"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x003f
            X.DgW r4 = r0.A07
            int r8 = r1.A00
            java.lang.String r7 = r10.A02
            X.0qQ.A0B(r7, r2)
            java.util.HashSet r5 = r4.A00
            r4 = 58
            java.lang.String r4 = X.002.A0H(r7, r4, r8)
            r5.add(r4)
            r17 = 1
            goto L_0x0324
        L_0x0267:
            java.lang.String r2 = "block"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x003f
            if (r7 == 0) goto L_0x029a
            boolean r2 = r7.CPV()
            if (r2 == 0) goto L_0x029a
            java.lang.String r2 = "unblock_user_clicked"
        L_0x0279:
            X.C46521DgO.A04(r0, r1, r2, r3)
            com.instagram.common.session.UserSession r14 = r0.A03
            com.instagram.user.model.User r15 = X.F6W.A00(r14, r1)
            if (r15 == 0) goto L_0x003f
            X.1Z4 r11 = X.1Z4.A00
            r13 = 0
            X.0iw r0 = r0.A01
            java.lang.String r17 = r0.getModuleName()
            java.lang.String r19 = r15.getUsername()
            r16 = r13
            r18 = r13
            r11.A00(r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x003f
        L_0x029a:
            java.lang.String r2 = "block_user_clicked"
            goto L_0x0279
        L_0x029d:
            java.lang.String r4 = "hide"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x003f
            com.instagram.common.session.UserSession r10 = r0.A03
            boolean r4 = X.C324536zU.A00(r10)
            if (r4 == 0) goto L_0x02b4
            java.lang.String r0 = "delete_notifications"
            X.FFO.A02(r12, r10, r0)
            goto L_0x003f
        L_0x02b4:
            java.lang.String r4 = "delete_notification_clicked"
            X.C46521DgO.A04(r0, r1, r4, r3)
            X.1Av r5 = X.1Au.A00(r10)
            X.0s0 r4 = r5.A4A
            X.0YZ[] r8 = X.1Av.A8a
            r7 = 109(0x6d, float:1.53E-43)
            boolean r4 = X.AnonymousClass7TG.A1a(r5, r4, r8, r7)
            if (r4 == 0) goto L_0x02ce
            X.C46521DgO.A02(r12, r11, r0, r1, r3)
            goto L_0x003f
        L_0x02ce:
            X.8ab r9 = X.DbS.A0Y(r12)
            r4 = 2131957605(0x7f131765, float:1.9551799E38)
            r9.A09(r4)
            r5 = 2131957531(0x7f13171b, float:1.9551649E38)
            r19 = 0
            X.W51 r4 = new X.W51
            r13 = r4
            r14 = r12
            r15 = r11
            r16 = r0
            r17 = r1
            r18 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r9.A0I(r4, r5)
            r3 = 31
            X.I8z r1 = new X.I8z
            r1.<init>(r0, r3)
            r9.A0C(r1)
            X.AnonymousClass7TH.A0a(r9, r2)
            X.1Av r1 = X.1Au.A00(r10)
            X.0s0 r0 = r1.A4A
            X.AnonymousClass7TF.A1J(r1, r0, r8, r7, r2)
            goto L_0x003f
        L_0x0306:
            java.lang.String r4 = "deprioritize"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x003f
            X.DgW r4 = r0.A07
            int r8 = r1.A00
            java.lang.String r7 = r10.A02
            X.0qQ.A0B(r7, r2)
            java.util.HashSet r5 = r4.A00
            r4 = 58
            java.lang.String r4 = X.002.A0H(r7, r4, r8)
            r5.add(r4)
            r17 = 0
        L_0x0324:
            java.lang.String r5 = r10.A02
            java.lang.String r4 = "_clicked"
            java.lang.String r4 = X.002.A0R(r5, r4)
            X.C46521DgO.A04(r0, r1, r4, r3)
            com.instagram.common.session.UserSession r9 = r0.A03
            java.lang.String r8 = r10.A02
            java.lang.String r7 = r1.A09
            X.5Gj r4 = r1.A04
            java.lang.String r5 = r4.A0s
            java.lang.Object r4 = r10.A00
            java.util.HashMap r4 = (java.util.HashMap) r4
            X.1OC r5 = X.Dd3.A00(r9, r8, r7, r5, r4)
            X.ECA r4 = new X.ECA
            r11 = r4
            r13 = r10
            r14 = r0
            r15 = r1
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r5.A00 = r4
            X.FpO r7 = new X.FpO
            r7.<init>()
            r7.A00 = r5
            X.6ap r5 = X.DbS.A0a()
            java.lang.String r4 = r10.A03
            X.DbZ.A10(r12, r5, r4)
            X.FdE r9 = new X.FdE
            r11 = r7
            r12 = r0
            r13 = r1
            r14 = r3
            r15 = r17
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r5.A0A = r9
            r5.A0L = r2
            r5.A06()
            r3 = 0
            r5.A02 = r3
            X.DbY.A1N(r5)
            android.os.Handler r5 = X.C46521DgO.A0B
            int r3 = X.C46521DgO.A0A
            long r3 = (long) r3
            r5.postDelayed(r7, r3)
            if (r17 == 0) goto L_0x003f
            X.G7F r0 = r0.A06
            r0.EEA(r1, r2)
            goto L_0x003f
        L_0x0387:
            java.lang.String r4 = "tag_options"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x003f
            java.lang.String r4 = "tag_options_clicked"
            X.C46521DgO.A04(r0, r1, r4, r3)
            X.1Xj r14 = r1.A02
            if (r14 != 0) goto L_0x03a5
            r4 = 2131974093(0x7f1357cd, float:1.958524E38)
            java.lang.String r3 = "show_tag_options_media_is_null"
            X.C59689JTv.A01(r12, r3, r4, r2)
            X.C46521DgO.A03(r12, r0, r1)
            goto L_0x003f
        L_0x03a5:
            X.1Xy r4 = r14.A0C
            java.lang.Boolean r4 = r4.Bc5()
            boolean r21 = X.AnonymousClass7TF.A1Y(r4, r2)
            X.1a0 r7 = X.C46447Df9.A03()
            androidx.fragment.app.Fragment r8 = r0.A00
            com.instagram.common.session.UserSession r13 = r0.A03
            X.0gy r9 = X.AnonymousClass07i.A00(r8)
            X.0iw r10 = r0.A01
            X.H4o r11 = new X.H4o
            r11.<init>(r3, r2, r1, r0)
            X.UfT r12 = new X.UfT
            r15 = r12
            r16 = r1
            r17 = r0
            r18 = r14
            r19 = r3
            r20 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r7.A00(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x003f
        L_0x03d7:
            java.lang.String r2 = "restrict"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x003f
            if (r7 == 0) goto L_0x0425
            boolean r2 = r7.isRestricted()
            if (r2 == 0) goto L_0x0425
            java.lang.String r2 = "unrestrict_user_clicked"
        L_0x03e9:
            X.C46521DgO.A04(r0, r1, r2, r3)
            com.instagram.common.session.UserSession r3 = r0.A03
            com.instagram.user.model.User r4 = X.F6W.A00(r3, r1)
            X.1YZ r7 = X.1YZ.A02
            if (r4 == 0) goto L_0x003f
            if (r7 == 0) goto L_0x003f
            java.lang.String r5 = r4.getId()
            boolean r1 = r4.isRestricted()
            java.lang.String r2 = "click"
            X.0wc r15 = r0.A02
            if (r1 == 0) goto L_0x0428
            java.lang.String r1 = "unrestrict_option"
            X.AnonymousClass73V.A0F(r15, r2, r1, r5)
            androidx.fragment.app.Fragment r1 = r0.A00
            X.0gy r9 = X.AnonymousClass07i.A00(r1)
            X.0iw r1 = r0.A01
            java.lang.String r13 = r1.getModuleName()
            X.FoL r1 = new X.FoL
            r1.<init>(r12, r0, r4, r5)
            r8 = r12
            r10 = r3
            r11 = r1
            r12 = r5
            r7.A02(r8, r9, r10, r11, r12, r13)
            goto L_0x003f
        L_0x0425:
            java.lang.String r2 = "restrict_user_clicked"
            goto L_0x03e9
        L_0x0428:
            java.lang.String r1 = "restrict_option"
            X.AnonymousClass73V.A0F(r15, r2, r1, r5)
            X.I0s r11 = r7.A00()
            X.0iw r1 = r0.A01
            java.lang.String r21 = r1.getModuleName()
            X.EVg r19 = X.C48088EVg.ACTIVITY_FEED
            r13 = 0
            X.FoX r2 = new X.FoX
            r2.<init>(r12, r0, r4, r5)
            X.FoR r1 = new X.FoR
            r1.<init>(r0, r4)
            r14 = r13
            r22 = r13
            r16 = r3
            r17 = r4
            r18 = r1
            r20 = r2
            r11.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x003f
        L_0x0454:
            java.lang.String r3 = "debug_copy"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x003f
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = X.C283145Gh.A00(r1)     // Catch:{ IOException -> 0x0469 }
            X.C48300EcJ.A00(r12, r0)     // Catch:{ IOException -> 0x0469 }
            goto L_0x003f
        L_0x0469:
            java.lang.String r1 = "[employee only] JSON copy to clipboard failed!"
            r0 = 0
            X.C59689JTv.A03(r12, r1, r0, r2)
            goto L_0x003f
        L_0x0471:
            r0 = -1509563439(0xffffffffa605e3d1, float:-4.6452393E-16)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A04
            X.2jw r2 = (X.C227802jw) r2
            java.lang.Object r1 = r4.A07
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r4.A02
            X.1Xj r0 = (X.1Xj) r0
            java.lang.Object r5 = r4.A03
            X.Gz1 r5 = (X.C54077Gz1) r5
            java.lang.Object r3 = r4.A06
            com.instagram.feed.ui.state.IntentAwareAdPivotState r3 = (com.instagram.feed.ui.state.IntentAwareAdPivotState) r3
            r2.A0H(r0, r3, r5, r1)
            java.lang.Object r2 = r4.A05
            X.2pK r2 = (X.C230282pK) r2
            int r1 = r4.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.A0F(r3, r5, r0, r1)
            r0 = 1462815590(0x5730cb66, float:1.94387636E14)
            goto L_0x0042
        L_0x049f:
            r0 = 2131798951(0x7f10aba7, float:1.923001E38)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r4.A06
            com.instagram.feed.ui.state.IntentAwareAdPivotState r5 = (com.instagram.feed.ui.state.IntentAwareAdPivotState) r5
            java.lang.Object r2 = r4.A02
            X.1Xj r2 = (X.1Xj) r2
            java.lang.String r0 = r2.getId()
            if (r0 == 0) goto L_0x0569
            r5.A05 = r0
            java.lang.Object r1 = r4.A04
            X.2jw r1 = (X.C227802jw) r1
            java.lang.Object r0 = r4.A07
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r3 = r4.A03
            X.Gz1 r3 = (X.C54077Gz1) r3
            r1.A0H(r2, r5, r3, r0)
            java.lang.Object r2 = r4.A05
            X.2pK r2 = (X.C230282pK) r2
            int r1 = r4.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r2.A0F(r5, r3, r0, r1)
            r0 = 45481591(0x2b5fe77, float:2.6741615E-37)
            goto L_0x0042
        L_0x04d5:
            r0 = -1354801925(0xffffffffaf3f5cfb, float:-1.7404382E-10)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r4.A06
            X.1Av r1 = (X.1Av) r1
            int r0 = r4.A01
            int r2 = r0 + 1
            X.0xY r1 = X.AnonymousClass7TE.A0p(r1)
            r0 = 1212(0x4bc, float:1.698E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r1.E5Z(r0, r2)
            r1.apply()
            java.lang.Object r7 = r4.A03
            X.OJ1 r7 = (X.OJ1) r7
            java.lang.Object r5 = r4.A07
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r3 = r4.A02
            java.lang.Object r2 = r4.A05
            X.5qq r2 = (X.C296905qq) r2
            java.lang.Object r1 = r4.A04
            X.5qz r1 = (X.C296995qz) r1
            boolean r0 = r3 instanceof X.1Xj
            if (r0 == 0) goto L_0x050f
            X.1Xj r3 = (X.1Xj) r3
            r7.A00(r5, r1, r2, r3)
        L_0x050f:
            r0 = 1203375089(0x47ba0bf1, float:95255.88)
            goto L_0x0042
        L_0x0514:
            r0 = 1662489769(0x631794a9, float:2.7961704E21)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r4.A07
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            java.lang.Object r1 = r4.A04
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r9 = r4.A05
            X.2Er r9 = (X.2Er) r9
            java.lang.Object r0 = r4.A06
            X.6iJ r0 = (X.C314466iJ) r0
            java.lang.Object r7 = r4.A03
            X.0iw r7 = (X.AnonymousClass0iw) r7
            X.OPL.A01(r1, r0)
            X.4kA r2 = X.AnonymousClass4k9.A00(r8)
            int r0 = r4.A01
            java.util.Map r1 = X.AnonymousClass4kA.A0b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r0)
            X.9JG r1 = (X.AnonymousClass9JG) r1
            if (r1 == 0) goto L_0x055b
            X.0xa r0 = r2.A00
            java.lang.String r5 = r1.A00
            long r3 = X.DbW.A06(r0, r5)
            X.0xY r2 = r0.AR4()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 + r0
            r2.E5c(r5, r3)
            r2.apply()
        L_0x055b:
            java.lang.String r1 = r9.C6C()
            java.lang.String r0 = "thread_ctd_upsell_opt_out_click"
            X.C48805EkT.A00(r7, r8, r0, r1)
            r0 = 793524443(0x2f4c38db, float:1.8573891E-10)
            goto L_0x0042
        L_0x0569:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 1186988658(0x46c00272, float:24577.223)
            X.AnonymousClass0fD.A0C(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50108FOy.onClick(android.view.View):void");
    }

    public C50108FOy(1Xj r1, IntentAwareAdPivotState intentAwareAdPivotState, C54077Gz1 gz1, C230282pK r4, C227802jw r5, List list, int i, int i2) {
        this.A00 = i2;
        if (2 - i2 != 0) {
            this.A04 = r5;
            this.A07 = list;
            this.A02 = r1;
            this.A03 = gz1;
            this.A06 = intentAwareAdPivotState;
        } else {
            this.A06 = intentAwareAdPivotState;
            this.A02 = r1;
            this.A04 = r5;
            this.A07 = list;
            this.A03 = gz1;
        }
        this.A05 = r4;
        this.A01 = i;
    }
}
