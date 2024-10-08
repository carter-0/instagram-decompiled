package X;

import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.creatormessaging.intf.CategorySelectionScreenArgs;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.DkL  reason: case insensitive filesystem */
public abstract class C46732DkL extends C361478gI {
    public int A00;
    public Boolean A01;
    public Boolean A02;
    public boolean A03;
    public boolean A04;
    public final UserSession A05;
    public final C313756gx A06;
    public final EV0 A07;
    public final Integer A08;
    public final 05G A09;
    public final 05G A0A;
    public final 05G A0B;
    public final 05G A0C;
    public final 05G A0D = 106.A01((Object) null);
    public final 05G A0E;
    public final AnonymousClass0Ud A0F;
    public final AnonymousClass0Ud A0G;
    public final AnonymousClass0Ud A0H;
    public final AnonymousClass0Ud A0I;
    public final boolean A0J;

    public C46732DkL(Application application, UserSession userSession, C313756gx r9, ChannelCreationSource channelCreationSource, EV0 ev0, Integer num) {
        super(application);
        EWM ewm;
        this.A05 = userSession;
        this.A06 = r9;
        this.A07 = ev0;
        this.A08 = num;
        boolean z = false;
        this.A0E = DbS.A10(false);
        FanClubInfoDict B3v = DbX.A0m(userSession).B3v();
        if ((B3v != null && AnonymousClass7TF.A1Y(B3v.BB1(), true)) || (channelCreationSource == ChannelCreationSource.MESSAGING_LED && 182.A06(0Tu.A05, userSession, 36328542786633124L))) {
            z = true;
        }
        this.A0J = z;
        if (ev0 != EV0.Social || num == null || num.intValue() != 2) {
            ewm = EWM.INDEFINITE;
        } else if (182.A06(0Tu.A05, userSession, 36327615073761845L)) {
            ewm = EWM.THREE_MONTHS;
        } else {
            ewm = EWM.ONE_MONTH;
        }
        02z A10 = DbS.A10(1);
        this.A09 = A10;
        02z A102 = DbS.A10(ewm);
        this.A0A = A102;
        this.A0F = 10b.A03(A10);
        this.A0G = 10b.A03(A102);
        02z A012 = 106.A01(C50374FaZ.A00);
        this.A0C = A012;
        this.A0I = 10b.A03(A012);
        02z A013 = 106.A01(KQf.A00);
        this.A0B = A013;
        this.A0H = A013;
    }

    public static int A00(C46732DkL dkL) {
        return ((Number) dkL.A0F.getValue()).intValue();
    }

    public static final void A01(C46732DkL dkL) {
        dkL.A0C.Epw(new C47254Dti(DbS.A0Q(new Object[0], 2131974615), DbS.A0Q(new Object[0], 2131974604)));
    }

    public final int A0E() {
        if (this instanceof C47821EIt) {
            return ((C47821EIt) this).A00;
        }
        return ((C47820EIs) this).A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006c, code lost:
        if (r2.A03 == false) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.1OC A0F() {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.C47821EIt
            if (r0 == 0) goto L_0x0052
            r1 = r10
            X.EIt r1 = (X.C47821EIt) r1
            int r2 = A00(r1)
            r0 = 2
            com.instagram.common.session.UserSession r3 = r1.A05
            if (r2 != r0) goto L_0x0033
            java.lang.String r5 = X.DbV.A0s()
            X.05G r0 = r1.A0D
            java.lang.Object r6 = r0.getValue()
            java.lang.String r6 = (java.lang.String) r6
            X.0sn r7 = X.0sn.A00
            X.0Ud r0 = r1.A0G
            java.lang.Object r0 = r0.getValue()
            X.EWM r0 = (X.EWM) r0
            int r8 = r0.A00
            boolean r9 = r1.A03
            java.lang.Boolean r4 = X.AnonymousClass7TE.A0v()
            X.1OC r0 = com.instagram.direct.request.DirectThreadApi.A02(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0033:
            X.05G r0 = r1.A0D
            java.lang.Object r4 = r0.getValue()
            java.lang.String r4 = (java.lang.String) r4
            com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs r0 = r1.A01
            java.lang.String r5 = r0.A01
            boolean r7 = r1.A03
            boolean r8 = r1.A04
            X.0Ud r0 = r1.A0G
            java.lang.Object r0 = r0.getValue()
            X.EWM r0 = (X.EWM) r0
            int r6 = r0.A00
            X.1OC r0 = com.instagram.direct.request.DirectThreadApi.A09(r3, r4, r5, r6, r7, r8)
            return r0
        L_0x0052:
            r2 = r10
            X.EIs r2 = (X.C47820EIs) r2
            com.instagram.common.session.UserSession r1 = r2.A05
            X.05G r0 = r2.A0D
            java.lang.Object r5 = r0.getValue()
            java.lang.String r5 = (java.lang.String) r5
            X.0Ud r0 = r2.A0F
            java.lang.Object r8 = r0.getValue()
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x006e
            boolean r0 = r2.A03
            r7 = 1
            if (r0 != 0) goto L_0x006f
        L_0x006e:
            r7 = 0
        L_0x006f:
            java.lang.Boolean r4 = r2.A01
            java.lang.Boolean r3 = r2.A02
            X.0Ud r0 = r2.A0G
            java.lang.Object r0 = r0.getValue()
            X.EWM r0 = (X.EWM) r0
            int r6 = r0.A00
            X.1NY r2 = X.AnonymousClass7TG.A0a(r1)
            r0 = 1
            r2.A0R = r0
            r0 = 2279(0x8e7, float:3.194E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.A0A(r0)
            java.lang.Class<X.8wd> r1 = X.C370538wd.class
            java.lang.Class<X.8wc> r0 = X.C370528wc.class
            r2.A0Q(r1, r0)
            java.lang.String r1 = "is_creator_broadcast_chat"
            java.lang.String r0 = "true"
            r2.A9m(r1, r0)
            r0 = 3125(0xc35, float:4.379E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.A0H(r0, r7)
            r0 = 3843(0xf03, float:5.385E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "[]"
            r2.A9m(r1, r0)
            java.lang.String r0 = "duration_s"
            r2.A0C(r0, r6)
            r0 = 1890(0x762, float:2.648E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0G(r0, r5)
            if (r8 == 0) goto L_0x00c8
            java.lang.String r1 = r8.toString()
            java.lang.String r0 = "audience_type"
            r2.A9m(r0, r1)
        L_0x00c8:
            java.lang.String r0 = "is_comments_enabled"
            r2.A0E(r0, r4)
            java.lang.String r0 = "pin_to_inbox"
            r2.A0E(r0, r3)
            X.1OC r0 = r2.A0M()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46732DkL.A0F():X.1OC");
    }

    public final AnonymousClass0Ud A0G() {
        if (this instanceof C47821EIt) {
            return ((C47821EIt) this).A05;
        }
        return ((C47820EIs) this).A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004e, code lost:
        if (r1 != false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H() {
        /*
            r11 = this;
            boolean r0 = r11 instanceof X.C47821EIt
            if (r0 == 0) goto L_0x0038
            r0 = r11
            X.EIt r0 = (X.C47821EIt) r0
            X.F0V r3 = X.C47821EIt.A03(r0)
            com.instagram.common.session.UserSession r0 = r0.A05
            X.FYv r1 = X.C69866NtU.A00(r0)
            X.1Ln r2 = X.C50338FYv.A00(r1)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x0037
            X.C50338FYv.A04(r2, r1)
            java.lang.String r0 = "thread_create_attempt"
            X.DbV.A1M(r2, r0)
            java.lang.String r0 = "create_public_chat_button"
            r2.A0p(r0)
            java.lang.String r0 = "chat_setup"
            X.C50338FYv.A05(r2, r1, r0)
            java.util.HashMap r4 = X.C50338FYv.A03(r3, r1)
        L_0x0031:
            r2.A0w(r4)
            r2.Cgf()
        L_0x0037:
            return
        L_0x0038:
            r2 = r11
            X.EIs r2 = (X.C47820EIs) r2
            X.6gx r5 = r2.A06
            com.instagram.direct.channels.analytics.ChannelCreationSource r10 = r2.A03
            X.05G r0 = r2.A0D
            java.lang.Object r0 = r0.getValue()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0050
            boolean r1 = X.00l.A0W(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0051
        L_0x0050:
            r0 = 1
        L_0x0051:
            r3 = r0 ^ 1
            int r1 = A00(r2)
            r0 = 2
            boolean r9 = X.AnonymousClass7TF.A1S(r1, r0)
            boolean r8 = r2.A03
            java.lang.Boolean r0 = r2.A02
            if (r0 == 0) goto L_0x00e8
            boolean r7 = r0.booleanValue()
        L_0x0066:
            java.lang.Boolean r0 = r2.A01
            if (r0 == 0) goto L_0x00e6
            boolean r6 = r0.booleanValue()
        L_0x006e:
            X.1Ln r2 = X.DbT.A0J(r5)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x0037
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = r10.A00
            java.lang.String r0 = "chat_creation_source"
            r4.put(r0, r1)
            if (r3 == 0) goto L_0x00e3
            java.lang.String r1 = "True"
        L_0x0087:
            java.lang.String r0 = "has_thread_name"
            r4.put(r0, r1)
            java.lang.String r1 = "False"
            r3 = r1
            java.lang.String r0 = "has_thread_photo"
            r4.put(r0, r1)
            if (r9 == 0) goto L_0x0098
            java.lang.String r1 = "True"
        L_0x0098:
            java.lang.String r0 = "limited_to_subscribers"
            r4.put(r0, r1)
            if (r8 == 0) goto L_0x00e1
            java.lang.String r1 = "True"
        L_0x00a1:
            java.lang.String r0 = "is_thread_pinned_to_profile"
            r4.put(r0, r1)
            if (r6 == 0) goto L_0x00df
            java.lang.String r1 = "True"
        L_0x00aa:
            r0 = 625(0x271, float:8.76E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r4.put(r0, r1)
            if (r7 == 0) goto L_0x00b7
            java.lang.String r3 = "True"
        L_0x00b7:
            java.lang.String r0 = "inbox_pinning_enabled"
            r4.put(r0, r3)
            X.DbW.A17(r2, r5)
            java.lang.String r0 = "thread_create_attempt"
            X.DbV.A1M(r2, r0)
            java.lang.String r0 = "create_broadcast_chat_button"
            r2.A0p(r0)
            java.lang.String r0 = "chat_setup"
            r2.A0q(r0)
            if (r9 == 0) goto L_0x00dc
            java.lang.String r0 = "subscriber_broadcast"
        L_0x00d2:
            r2.A0o(r0)
            java.lang.String r0 = r5.A01
            r2.A0v(r0)
            goto L_0x0031
        L_0x00dc:
            java.lang.String r0 = "broadcast"
            goto L_0x00d2
        L_0x00df:
            r1 = r3
            goto L_0x00aa
        L_0x00e1:
            r1 = r3
            goto L_0x00a1
        L_0x00e3:
            java.lang.String r1 = "False"
            goto L_0x0087
        L_0x00e6:
            r6 = 0
            goto L_0x006e
        L_0x00e8:
            r7 = 0
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46732DkL.A0H():void");
    }

    public final void A0I(FragmentActivity fragmentActivity) {
        int i;
        Bundle A002;
        C309516Yo A0M;
        Fragment e7x;
        if (AnonymousClass7TE.A0M(this.A09.getValue()) == 2 && this.A07 == EV0.Broadcast && this.A00 < 1) {
            A01(this);
            return;
        }
        if (this instanceof C47821EIt) {
            C47821EIt eIt = (C47821EIt) this;
            if (A00(eIt) == 2) {
                C50337FYu fYu = eIt.A02;
                String str = eIt.A04.A00;
                if (str == null) {
                    C50337FYu.A02(fYu);
                } else {
                    fYu.A00 = str;
                }
                C50337FYu.A01(C48147EZp.CREATE_SUBSCRIBER_GROUP_CHAT_ITEM, C48146EZo.DM_CREATE, fYu, "chat_creation_sheet_rendered", "tap", (Map) null);
                CategorySelectionScreenArgs categorySelectionScreenArgs = eIt.A01.A00;
                if (categorySelectionScreenArgs != null) {
                    A002 = Q21.A00(AnonymousClass7TE.A1L("channel_title", eIt.A0D.getValue()), AnonymousClass7TE.A1L("should_pin_to_profile", Boolean.valueOf(eIt.A03)), AnonymousClass7TE.A1L("channel_duration", Integer.valueOf(((EWM) eIt.A0G.getValue()).A00)), AnonymousClass7TE.A1L("fan_club_category_type", categorySelectionScreenArgs.A00), AnonymousClass7TE.A1L("fan_club_category_name", categorySelectionScreenArgs.A01), AnonymousClass7TE.A1L("entrypoint", eIt.A03.A00));
                    e7x = new E7W();
                    A0M = DbS.A0M(fragmentActivity, eIt.A05);
                } else if (!eIt.A08) {
                    A002 = Q21.A00(AnonymousClass7TH.A0h("entrypoint", eIt.A03.A00, AnonymousClass7TE.A1L("channel_title", eIt.A0D.getValue()), AnonymousClass7TE.A1L("should_pin_to_profile", Boolean.valueOf(eIt.A03)), AnonymousClass7TE.A1L("channel_duration", Integer.valueOf(((EWM) eIt.A0G.getValue()).A00))));
                    A0M = DbS.A0M(fragmentActivity, eIt.A05);
                    e7x = new E7X();
                }
                A0M.A0B(A002, e7x);
                A0M.A04();
                return;
            }
        }
        UserSession userSession = this.A05;
        OE0 oe0 = (OE0) userSession.A01(OE0.class, new C73911Plm(userSession, 48));
        int ordinal = this.A07.ordinal();
        if (ordinal == 1) {
            i = 29;
        } else if (ordinal == 0) {
            i = 32;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        02m r3 = oe0.A00;
        r3.markerStart(20128591);
        r3.markerPoint(20128591, "Create_Channel_Clicked");
        r3.markerAnnotate(20128591, AnonymousClass000.A00(1892), i);
        r3.markerAnnotate(20128591, AnonymousClass000.A00(1891), AnonymousClass48O.A00(i));
        1Eo.A05(DbX.A0c(AnonymousClass12T.A00), new C73568Pfp(oe0, this, (AnonymousClass4D7) null, 6), C318116oQ.A00(this));
    }

    public final void A0J(C59678JTj jTj) {
        String str;
        String str2;
        if (this instanceof C47821EIt) {
            0qQ.A0B(jTj, 0);
            UserSession userSession = this.A05;
            C50338FYv A002 = C69866NtU.A00(userSession);
            String A012 = F8N.A01(DbT.A05(A0D()), jTj, userSession);
            int A003 = F8N.A00(jTj);
            boolean z = jTj.A01 instanceof C268664dn;
            1Ln A004 = C50338FYv.A00(A002);
            if (DbT.A1Y(A004)) {
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put("error_message", A012);
                A1E.put(TraceFieldType.ErrorCode, String.valueOf(A003));
                if (z) {
                    str2 = "True";
                } else {
                    str2 = "False";
                }
                A1E.put("is_network_error", str2);
                C50338FYv.A04(A004, A002);
                Dba.A1D(A004, "thread_create_error");
                A004.A0p("create_public_chat");
                C50338FYv.A05(A004, A002, "chat_setup");
                A004.A0w(A1E);
                A004.Cgf();
                return;
            }
            return;
        }
        0qQ.A0B(jTj, 0);
        C313756gx r5 = this.A06;
        int A005 = A00(this);
        boolean z2 = jTj.A01 instanceof C268664dn;
        int A006 = F8N.A00(jTj);
        String A013 = F8N.A01(DbT.A05(A0D()), jTj, this.A05);
        1Ln A0J2 = DbT.A0J(r5);
        if (DbT.A1Y(A0J2)) {
            HashMap A1E2 = AnonymousClass7TE.A1E();
            A1E2.put("error_message", A013);
            A1E2.put(TraceFieldType.ErrorCode, String.valueOf(A006));
            if (z2) {
                str = "True";
            } else {
                str = "False";
            }
            A1E2.put("is_network_error", str);
            DbW.A17(A0J2, r5);
            Dba.A1D(A0J2, "thread_create_error");
            A0J2.A0p("create_broadcast_chat");
            Dbc.A0j(A0J2, r5, "chat_setup", A1E2, A005);
        }
    }

    public final void A0K(C370538wd r7) {
        if (this instanceof C47821EIt) {
            C47821EIt eIt = (C47821EIt) this;
            0qQ.A0B(r7, 0);
            F0V A032 = C47821EIt.A03(eIt);
            C50338FYv A002 = C69866NtU.A00(eIt.A05);
            String str = r7.A1D;
            0qQ.A07(str);
            String str2 = r7.A1J;
            0qQ.A07(str2);
            1Ln A003 = C50338FYv.A00(A002);
            if (DbT.A1Y(A003)) {
                C50338FYv.A04(A003, A002);
                Dba.A1D(A003, "thread_create_successful");
                A003.A0p("create_public_chat");
                C50338FYv.A05(A003, A002, "chat_setup");
                A003.A0s(str);
                A003.A0i(AnonymousClass7TE.A10(str2));
                A003.A0w(C50338FYv.A03(A032, A002));
                A003.Cgf();
                return;
            }
            return;
        }
        0qQ.A0B(r7, 0);
        C313756gx r5 = this.A06;
        int A004 = A00(this);
        String str3 = r7.A1D;
        0qQ.A07(str3);
        String str4 = r7.A1J;
        0qQ.A07(str4);
        1Ln A0J2 = DbT.A0J(r5);
        if (DbT.A1Y(A0J2)) {
            DbW.A17(A0J2, r5);
            Dba.A1D(A0J2, "thread_create_successful");
            A0J2.A0p("create_broadcast_chat");
            DbZ.A1L(A0J2, "thread_view", A004);
            A0J2.A0s(str3);
            A0J2.A0i(AnonymousClass7TE.A10(str4));
            Dba.A1C(A0J2, r5);
        }
    }
}
