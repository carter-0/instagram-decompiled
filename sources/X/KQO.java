package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.user.model.User;
import java.util.List;

public final class KQO extends C65261LqG {
    public boolean A00;
    public final FragmentActivity A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final AnonymousClass0eM A06;
    public final boolean A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        if (r5.equals(r0) == false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.KQO r13, boolean r14) {
        /*
            X.0eM r0 = r13.A06
            java.lang.Object r0 = r0.getValue()
            X.OTV r0 = (X.OTV) r0
            X.02m r2 = r0.A00
            r1 = 31786177(0x1e504c1, float:8.4128136E-38)
            r0 = 0
            boolean r0 = r2.isMarkerOn(r1, r0)
            if (r0 != 0) goto L_0x0017
            r2.markerStart(r1)
        L_0x0017:
            java.lang.String r0 = "Join_Channel_Start"
            r2.markerPoint(r1, r0)
            X.KgD r0 = X.C62463KgD.IN_PROGRESS
            r13.A04(r0)
            java.lang.String r5 = r13.A04
            r9 = 0
            if (r5 == 0) goto L_0x0096
            X.2Er r3 = r13.A02
            if (r3 == 0) goto L_0x0096
            int r2 = r3.C6a()
            java.lang.String r0 = r3.AsX()
            r1 = 29
            if (r2 != r1) goto L_0x003d
            boolean r0 = r5.equals(r0)
            r9 = 1
            if (r0 != 0) goto L_0x003e
        L_0x003d:
            r9 = 0
        L_0x003e:
            r10 = 0
            int r0 = r3.C6a()
            if (r0 != r1) goto L_0x0052
            java.util.List r0 = r3.BJl()
            if (r0 == 0) goto L_0x0052
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x0052
            r10 = 1
        L_0x0052:
            boolean r11 = X.C329997La.A07(r3, r5)
        L_0x0056:
            com.instagram.common.session.UserSession r0 = r13.A01
            X.6gx r1 = X.C313746gw.A00(r0)
            java.lang.String r2 = r13.A02()
            java.lang.String r3 = r13.A03()
            java.lang.String r4 = r13.A03
            int r7 = r13.A01()
            boolean r8 = r13.A07
            java.lang.String r6 = r13.A02
            r12 = r14
            r1.A0V(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.OyY r2 = X.C72208OyY.A00(r0)
            X.0qQ.A07(r2)
            int r1 = r13.A01()
            r0 = 2
            if (r1 != r0) goto L_0x0093
            X.Nmd r0 = X.C69495Nmd.JOIN_SUBSCRIBER_BROADCAST_CHANNEL
        L_0x0082:
            r3 = 0
            r2.A07(r0)
            X.4Cq r2 = r13.A03
            r1 = 22
            X.MFR r0 = new X.MFR
            r0.<init>(r13, r3, r1)
            X.AnonymousClass7TE.A1Z(r0, r2)
            return
        L_0x0093:
            X.Nmd r0 = X.C69495Nmd.JOIN_BROADCAST_CHANNEL
            goto L_0x0082
        L_0x0096:
            r11 = 0
            r10 = 0
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KQO.A00(X.KQO, boolean):void");
    }

    public final String AtC() {
        return this.A08;
    }

    public final /* bridge */ /* synthetic */ CharSequence Axd() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        if (r0 == null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        r5 = r7.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence B7G() {
        /*
            r7 = this;
            X.2Er r0 = r7.A02
            if (r0 == 0) goto L_0x00ab
            java.lang.String r4 = r0.Asi()
        L_0x0008:
            com.instagram.common.session.UserSession r2 = r7.A01
            X.0Tu r3 = X.0Tu.A05
            r0 = 36320472543470057(0x810947000721e9, double:3.032551315069935E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 == 0) goto L_0x0021
            android.content.Context r1 = r7.A00
            r0 = 2131954259(0x7f130a53, float:1.9545012E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
        L_0x0020:
            return r0
        L_0x0021:
            int r1 = r7.A01()
            r6 = 0
            r0 = 1
            if (r1 == 0) goto L_0x006a
            if (r1 == r0) goto L_0x0085
            r0 = 2
            if (r1 == r0) goto L_0x0062
            android.content.Context r5 = r7.A00
            r0 = 2131954198(0x7f130a16, float:1.9544888E38)
            android.text.SpannableStringBuilder r0 = X.DbW.A08(r5, r0)
        L_0x0037:
            X.17i r1 = X.17h.A00(r2)
            java.util.concurrent.ConcurrentMap r1 = r1.A02
            java.lang.Object r1 = r1.get(r4)
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            if (r1 == 0) goto L_0x0049
            boolean r6 = r1.isVerified()
        L_0x0049:
            if (r4 == 0) goto L_0x0020
            r3 = 0
            int r2 = X.00l.A08(r0, r4, r3, r3)
            r1 = -1
            if (r2 == r1) goto L_0x0020
            if (r6 == 0) goto L_0x0020
            int r2 = X.00l.A08(r0, r4, r3, r3)
            int r1 = r4.length()
            int r2 = r2 + r1
            X.C244273av.A03(r5, r0, r2)
            return r0
        L_0x0062:
            if (r4 == 0) goto L_0x007f
            android.content.Context r5 = r7.A00
            r0 = 2131954200(0x7f130a18, float:1.9544893E38)
            goto L_0x0079
        L_0x006a:
            if (r4 == 0) goto L_0x007f
            android.content.Context r5 = r7.A00
            r0 = 2131954227(0x7f130a33, float:1.9544947E38)
            goto L_0x0079
        L_0x0072:
            if (r4 == 0) goto L_0x007f
            android.content.Context r5 = r7.A00
            r0 = 2131954199(0x7f130a17, float:1.954489E38)
        L_0x0079:
            java.lang.String r0 = X.DbW.A0h(r5, r4, r0)
            if (r0 != 0) goto L_0x00a6
        L_0x007f:
            android.content.Context r5 = r7.A00
            r0 = 2131954198(0x7f130a16, float:1.9544888E38)
            goto L_0x00a2
        L_0x0085:
            r0 = 36319407391776032(0x81084f000a1d20, double:3.031877708849612E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 == 0) goto L_0x0072
            if (r4 == 0) goto L_0x009d
            android.content.Context r5 = r7.A00
            r0 = 2131954227(0x7f130a33, float:1.9544947E38)
            java.lang.String r0 = X.DbW.A0h(r5, r4, r0)
            if (r0 != 0) goto L_0x00a6
        L_0x009d:
            android.content.Context r5 = r7.A00
            r0 = 2131954228(0x7f130a34, float:1.954495E38)
        L_0x00a2:
            java.lang.String r0 = X.AnonymousClass7TE.A16(r5, r0)
        L_0x00a6:
            android.text.SpannableStringBuilder r0 = X.DbS.A0C(r0)
            goto L_0x0037
        L_0x00ab:
            r4 = 0
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KQO.B7G():java.lang.CharSequence");
    }

    public final String BqX() {
        return this.A09;
    }

    public final void D7K() {
        2Er r6 = this.A02;
        if (r6 != null) {
            02m r2 = ((OTV) this.A06.getValue()).A00;
            r2.markerStart(31786177);
            r2.markerPoint(31786177, "Join_Channel_Clicked");
            User Ash = r6.Ash();
            if (Ash != null) {
                if (!Ash.A29()) {
                    UserSession userSession = this.A01;
                    if (!182.A06(0Tu.A05, userSession, 36319407391776032L)) {
                        String id = Ash.getId();
                        String C6C = r6.C6C();
                        if (C6C != null) {
                            C61436K7l A002 = C63231Ktc.A00(userSession, new C65259LqE(this, Ash), id, C6C);
                            C331127Pr A0W = DbS.A0W(userSession);
                            A0W.A17 = true;
                            A0W.A0U = A002;
                            A0W.A00().A02(this.A01, A002);
                            return;
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                A00(this, Ash.A29());
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public final void D9U() {
        if (!this.A0A && !this.A00) {
            C313756gx A002 = C313746gw.A00(this.A01);
            String A022 = A02();
            String A032 = A03();
            int A012 = A01();
            1Ln A0J = DbT.A0J(A002);
            if (DbT.A1Y(A0J)) {
                DbW.A17(A0J, A002);
                DbV.A1M(A0J, "thread_join_cancel");
                A0J.A0p(Pxd.A00(190));
                A0J.A0i(DbZ.A0b(A0J, "broadcast_chat_preview", A022, A032, A012));
                A0J.Cgf();
            }
        }
    }

    public final void Di5() {
        String Asi;
        C46474Dfc A022;
        2Er r0;
        String str = this.A04;
        if (!(str == null && ((r0 = this.A02) == null || r0.Asi() == null))) {
            UserSession userSession = this.A01;
            if (AnonymousClass7K4.A04(this.A03) && 182.A06(0Tu.A05, userSession, 36327421800233381L)) {
                C313756gx A002 = C313746gw.A00(userSession);
                String A023 = A02();
                String A032 = A03();
                int A012 = A01();
                1Ln A0J = DbT.A0J(A002);
                if (DbT.A1Y(A0J)) {
                    DbW.A17(A0J, A002);
                    DbV.A1M(A0J, "profile_rendered");
                    A0J.A0p(AnonymousClass000.A00(4204));
                    A0J.A0i(DbZ.A0b(A0J, "broadcast_chat_preview", A023, A032, A012));
                    A0J.Cgf();
                }
                if (str != null) {
                    A022 = C46548Dgp.A01(userSession, str, "direct_thread_channel_preview", C273654mx.A00(23));
                } else {
                    2Er r1 = this.A02;
                    if (r1 != null && r1.Asi() != null && (Asi = r1.Asi()) != null) {
                        A022 = C46548Dgp.A02(userSession, Asi, "direct_thread_channel_preview", C273654mx.A00(23));
                    } else {
                        return;
                    }
                }
                UserDetailLaunchConfig A042 = A022.A04();
                C309516Yo A0Q = DbU.A0Q(this.A01, userSession);
                A0Q.A0D(C46447Df9.A02().A02(userSession, A042));
                A0Q.A04();
                return;
            }
        }
        this.A00 = true;
        UserSession userSession2 = this.A01;
        C313756gx A003 = C313746gw.A00(userSession2);
        String A024 = A02();
        String A033 = A03();
        int A013 = A01();
        1Ln A0J2 = DbT.A0J(A003);
        if (DbT.A1Y(A0J2)) {
            DbW.A17(A0J2, A003);
            DbV.A1M(A0J2, "thread_join_cancel");
            A0J2.A0p("decline_button");
            A0J2.A0i(DbZ.A0b(A0J2, "broadcast_chat_preview", A024, A033, A013));
            A0J2.Cgf();
        }
        2Er r02 = this.A02;
        if (r02 != null) {
            r02.EaA(true);
            DirectThreadKey A034 = C66647MaG.A03(r02.BJz());
            if (A034 != null) {
                C66671Mae.A0D(userSession2, A034);
            }
        }
        A05(KQL.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0051, code lost:
        if (X.182.A06(X.0Tu.A05, r6, 36327421800233381L) == false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KQO(android.content.Context r4, androidx.fragment.app.FragmentActivity r5, com.instagram.common.session.UserSession r6, X.2Er r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11, boolean r12) {
        /*
            r3 = this;
            r3.<init>(r4, r6, r7)
            r3.A01 = r5
            r3.A03 = r8
            r3.A07 = r11
            r3.A0A = r12
            r3.A04 = r9
            r3.A02 = r10
            r1 = 19
            X.Ay7 r0 = new X.Ay7
            r0.<init>(r6, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r3.A06 = r0
            r0 = 2131954237(0x7f130a3d, float:1.9544968E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r4, r0)
            r3.A08 = r0
            r0 = 197(0xc5, float:2.76E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.0qQ.A0K(r8, r0)
            if (r0 != 0) goto L_0x0073
            r0 = 63
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = X.0qQ.A0K(r8, r0)
            if (r0 != 0) goto L_0x0073
            boolean r0 = X.AnonymousClass7K4.A04(r8)
            if (r0 == 0) goto L_0x0053
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327421800233381(0x810f99000239a5, double:3.036946053029472E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            r1 = 2131954261(0x7f130a55, float:1.9545016E38)
            if (r0 != 0) goto L_0x0056
        L_0x0053:
            r1 = 2131954241(0x7f130a41, float:1.9544976E38)
        L_0x0056:
            java.lang.String r0 = X.AnonymousClass7TE.A16(r4, r1)
            r3.A09 = r0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320472543470057(0x810947000721e9, double:3.032551315069935E-306)
            boolean r1 = X.182.A06(r2, r6, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0070
            if (r7 == 0) goto L_0x0070
            java.util.List r0 = r7.BxY()
        L_0x0070:
            r3.A05 = r0
            return
        L_0x0073:
            r1 = 2131954221(0x7f130a2d, float:1.9544935E38)
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KQO.<init>(android.content.Context, androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, X.2Er, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }
}
