package X;

import android.app.Activity;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengePromptShareInfo;
import com.instagram.direct.fragment.prompts.dailyprompt.model.DailyPromptsShareInfo;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.EnumSet;

/* renamed from: X.P8o  reason: case insensitive filesystem */
public final class C72505P8o implements AnonymousClass7XC {
    public final Activity A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final OT9 A03;
    public final C332257Ug A04;
    public final AnonymousClass7SN A05;
    public final AnonymousClass0eK A06;
    public final AnonymousClass0eK A07;
    public final AnonymousClass0eM A08 = AnonymousClass1YB.A00(new C73909Plk(this, 23));
    public final AnonymousClass0eK A09;

    public C72505P8o(Activity activity, AnonymousClass4DH r4, UserSession userSession, OT9 ot9, C332257Ug r7, AnonymousClass7SN r8, AnonymousClass0eK r9, AnonymousClass0eK r10, AnonymousClass0eK r11) {
        C51974G9v.A0d(2, r4, r9, ot9, r10);
        C51973G9u.A0t(7, r11, r7, r8);
        this.A00 = activity;
        this.A01 = r4;
        this.A02 = userSession;
        this.A06 = r9;
        this.A03 = ot9;
        this.A09 = r10;
        this.A07 = r11;
        this.A04 = r7;
        this.A05 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01c4, code lost:
        if (r14 == null) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0260, code lost:
        if (r1 != null) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AWQ(X.2FW r26, com.instagram.model.direct.messageid.DirectMessageIdentifier r27, int r28, boolean r29) {
        /*
            r25 = this;
            r9 = 1
            r5 = r26
            X.0qQ.A0B(r5, r9)
            r0 = r25
            X.0eM r1 = r0.A08
            java.lang.Object r1 = r1.getValue()
            X.30t r1 = (X.C2356730t) r1
            X.2qi r2 = r1.A01
            com.instagram.quickpromotion.intf.Trigger r1 = com.instagram.quickpromotion.intf.Trigger.A0t
            java.util.EnumSet r1 = java.util.EnumSet.of(r1)
            X.0qQ.A07(r1)
            r2.AVg(r1)
            X.OT9 r8 = r0.A03
            com.instagram.common.session.UserSession r3 = r0.A02
            r1 = r27
            java.lang.String r4 = r1.A01
            java.lang.String r7 = "DirectThreadFragment.forwardMessage"
            X.3su r10 = X.OT9.A00(r8, r4, r7, r9)
            if (r10 == 0) goto L_0x006a
            X.Ort r6 = new X.Ort
            r6.<init>()
            com.google.common.collect.ImmutableList r1 = r10.A0H()
            if (r1 == 0) goto L_0x025e
            X.2FW r2 = r10.A0z
            X.2FW r1 = X.2FW.A1A
            if (r2 != r1) goto L_0x021f
            X.1Xj r1 = r10.A0s
            if (r1 == 0) goto L_0x021f
        L_0x0043:
            X.1iA r1 = r1.BR7()
        L_0x0047:
            int r1 = r1.A00
            long r1 = (long) r1
            java.lang.Long r10 = java.lang.Long.valueOf(r1)
            X.0wc r2 = X.AnonymousClass0kN.A01(r6, r3)
            r1 = 43
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r2.isSampled()
            if (r1 == 0) goto L_0x006a
            java.lang.String r1 = "m_t"
            r2.A9F(r1, r10)
            X.DbX.A1L(r2)
        L_0x006a:
            X.0eK r10 = r0.A06
            java.lang.Object r2 = r10.get()
            boolean r1 = r2 instanceof X.C333507Zf
            if (r1 == 0) goto L_0x016f
            X.3su r13 = X.OT9.A00(r8, r4, r7, r9)
            if (r13 == 0) goto L_0x016e
            X.7S7 r14 = X.C66582MXn.A0d(r10)
            X.3t2 r1 = r14.C6c()
            X.0qQ.A07(r1)
            X.3t3 r12 = X.AnonymousClass6W3.A05(r1)
            if (r12 == 0) goto L_0x016e
            X.7SD r2 = X.C66580MXl.A0Z(r14)
            boolean r1 = r13.A2G
            com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams r7 = X.C3263376i.A00(r2, r1)
            android.app.Activity r1 = r0.A00
            X.OKp r2 = new X.OKp
            r2.<init>(r1, r3)
            boolean r10 = r13.A1b()
            X.0rm r6 = X.C51965G9l.A11()
            X.0rm r11 = X.C51965G9l.A11()
            boolean r1 = r13.A1c()
            r1 = r1 ^ 1
            java.lang.String r9 = r12.toString()
            boolean r8 = r13.A1S()
            r4 = 2
            X.0qQ.A0B(r9, r4)
            if (r29 != 0) goto L_0x00fd
            if (r10 == 0) goto L_0x00fd
            com.instagram.common.session.UserSession r5 = r2.A01
            boolean r5 = X.C66797Mcj.A02(r5, r8)
            if (r5 == 0) goto L_0x00fd
            X.4kA r5 = r2.A02
            X.0xa r8 = r5.A00
            java.lang.String r5 = "direct_has_seen_nudity_forward_friction_"
            boolean r5 = X.C66581MXm.A1Y(r8, r5, r9)
            if (r5 == 0) goto L_0x00fd
            r5 = 2131238510(0x7f081e6e, float:1.80933E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.A00 = r5
            android.app.Activity r8 = r2.A00
            r5 = 2131962667(0x7f132b2b, float:1.9562066E38)
            java.lang.String r5 = X.AnonymousClass7TE.A16(r8, r5)
            r11.A00 = r5
            if (r1 == 0) goto L_0x00fd
            X.0Aj r8 = X.C66584MXp.A0C(r3)
            boolean r5 = r8.isSampled()
            if (r5 == 0) goto L_0x00fd
            X.C71137Odf.A01(r8, r3)
            java.lang.String r5 = "fwd_warning_impression"
            X.C66584MXp.A0v(r8, r5)
            X.C66584MXp.A0p(r8, r7)
        L_0x00fd:
            int r8 = X.C66580MXl.A05(r14)
            r5 = 29
            if (r8 != r5) goto L_0x0136
            X.6gx r15 = X.C313746gw.A00(r3)
            java.lang.String r16 = X.C66580MXl.A0x(r12)
            X.0eK r8 = r0.A07
            java.lang.Object r8 = X.C66580MXl.A0s(r8)
            X.3sy r8 = (X.C254743sy) r8
            java.lang.String r17 = X.C66647MaG.A0C(r8)
            java.lang.String r18 = r13.A0g()
            java.lang.String r19 = r13.A0f()
            X.7SD r8 = r14.C6Q()
            int r9 = r8.A01
            java.lang.String r8 = r3.A06
            X.3Te r3 = r14.BiC()
            java.lang.String r20 = X.C329997La.A00(r3, r8, r5)
            r21 = r9
            r15.A0U(r16, r17, r18, r19, r20, r21)
        L_0x0136:
            java.lang.String r5 = r12.toString()
            boolean r8 = r13.A1S()
            X.0qQ.A0B(r5, r4)
            if (r29 != 0) goto L_0x026d
            if (r10 == 0) goto L_0x026d
            com.instagram.common.session.UserSession r3 = r2.A01
            boolean r3 = X.C66797Mcj.A02(r3, r8)
            if (r3 == 0) goto L_0x026d
            X.4kA r3 = r2.A02
            X.0xa r4 = r3.A00
            java.lang.String r3 = "direct_has_seen_nudity_forward_friction_"
            boolean r3 = X.C66581MXm.A1Y(r4, r3, r5)
            if (r3 != 0) goto L_0x026d
            X.7SN r3 = r0.A05
            r3.CLU()
            java.lang.String r3 = r12.toString()
            r10 = 5
            X.IoR r9 = new X.IoR
            r15 = r6
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r2.A00(r7, r3, r9, r1)
        L_0x016e:
            return
        L_0x016f:
            boolean r1 = r2 instanceof X.P27
            if (r1 == 0) goto L_0x0283
            X.7S7 r1 = X.C66582MXn.A0d(r10)
            X.3t2 r12 = r1.C6c()
            if (r12 == 0) goto L_0x016e
            X.7SN r1 = r0.A05
            r1.CLU()
            android.app.Activity r1 = r0.A00
            X.OKp r8 = new X.OKp
            r8.<init>(r1, r3)
            java.lang.String r11 = r12.toString()
            r7 = 2
            X.0qQ.A0B(r11, r7)
            r9 = r28
            if (r29 != 0) goto L_0x01a5
            if (r9 != r7) goto L_0x01a5
            X.4kA r1 = r8.A02
            r6 = 0
            X.0xa r2 = r1.A00
            java.lang.String r1 = "direct_has_seen_nudity_forward_friction_"
            java.lang.String r1 = X.002.A0R(r1, r11)
            r2.getBoolean(r1, r6)
        L_0x01a5:
            r6 = 0
            X.0Tu r11 = X.0Tu.A05
            r1 = 2342156064353879728(0x20810288005706b0, double:4.059697228230846E-152)
            boolean r1 = X.182.A06(r11, r3, r1)
            r2 = 0
            if (r1 == 0) goto L_0x021c
            X.7Zg r1 = X.C66580MXl.A0V(r10)
            X.7LQ r1 = r1.Bjv(r4)
            if (r1 == 0) goto L_0x021c
            X.7SD r1 = r1.A0G
            X.3t3 r14 = r1.A0P
            r24 = 1
            if (r14 != 0) goto L_0x01c9
        L_0x01c6:
            r14 = r12
            X.3t3 r14 = (X.C254793t3) r14
        L_0x01c9:
            X.0qQ.A0B(r14, r7)
            X.1as r1 = X.1as.A04
            X.1ap r10 = r1.A02
            java.lang.String r1 = "direct_forwarding_sheet"
            X.0xG r1 = X.DbS.A0O(r1)
            X.F3w r13 = r10.A07(r1, r3, r5)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
            r17 = r6
            r18 = r6
            r20 = r6
            r21 = r6
            r22 = r6
            r23 = r6
            r19 = r4
            r16 = r6
            r13.A05(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r5 = r13.A00()
            java.lang.String r4 = r12.toString()
            X.0qQ.A0B(r4, r7)
            if (r29 != 0) goto L_0x027f
            if (r9 != r7) goto L_0x027f
            X.4kA r1 = r8.A02
            X.0xa r3 = r1.A00
            java.lang.String r1 = "direct_has_seen_nudity_forward_friction_"
            java.lang.String r1 = X.002.A0R(r1, r4)
            r3.getBoolean(r1, r2)
            java.lang.String r4 = r12.toString()
            r3 = 37
            X.Plr r1 = new X.Plr
            r1.<init>(r3, r5, r0)
            r8.A00(r6, r4, r1, r2)
            return
        L_0x021c:
            r24 = 0
            goto L_0x01c6
        L_0x021f:
            com.google.common.collect.ImmutableList r10 = r10.A0H()
            r2 = 0
            if (r10 == 0) goto L_0x0269
            boolean r1 = r10.isEmpty()
            if (r1 != 0) goto L_0x0269
            java.lang.Object r1 = r10.get(r2)
            X.3tC r1 = (X.C254873tC) r1
            java.lang.String r1 = r1.A0u
            if (r1 == 0) goto L_0x0269
            android.net.Uri r1 = X.DbT.A09(r1)
            java.util.Set r10 = r1.getQueryParameterNames()
            java.util.List r2 = r1.getPathSegments()
            java.lang.String r1 = "reel"
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x024e
            X.1iA r1 = X.1iA.A0a
            goto L_0x0047
        L_0x024e:
            r1 = 70
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r10.contains(r1)
            if (r1 == 0) goto L_0x0264
            X.1iA r1 = X.1iA.A09
            goto L_0x0047
        L_0x025e:
            X.1Xj r1 = r10.A0s
            if (r1 == 0) goto L_0x0269
            goto L_0x0043
        L_0x0264:
            java.lang.String r1 = "p"
            r2.contains(r1)
        L_0x0269:
            X.1iA r1 = X.1iA.A0Q
            goto L_0x0047
        L_0x026d:
            java.lang.Object r2 = r6.A00
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r1 = r11.A00
            java.lang.String r1 = (java.lang.String) r1
            r3 = r0
            r4 = r13
            r5 = r14
            r6 = r12
            r7 = r2
            r8 = r1
            A01(r3, r4, r5, r6, r7, r8)
            return
        L_0x027f:
            A00(r5, r0)
            return
        L_0x0283:
            java.lang.String r0 = "Unsupported client infra"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72505P8o.AWQ(X.2FW, com.instagram.model.direct.messageid.DirectMessageIdentifier, int, boolean):void");
    }

    public final void Erc(MessageIdentifier messageIdentifier) {
        C254873tC r0;
        2FW r8;
        C254873tC r5;
        String str;
        C254743sy r4 = (C254743sy) this.A07.get();
        OT9 ot9 = this.A03;
        UserSession userSession = this.A02;
        C254703su A002 = OT9.A00(ot9, messageIdentifier.A01, "DirectThreadFragment.forwardMessage", true);
        if (A002 != null) {
            ImmutableList A0H = A002.A0H();
            int i = 0;
            if (A0H != null) {
                r0 = (C254873tC) 00k.A0O(A0H, 0);
            } else {
                r0 = null;
            }
            if (r0 != null) {
                String str2 = r0.A0u;
                if (str2 != null) {
                    String queryParameter = 0cp.A03(str2).getQueryParameter("collection_type");
                    if (queryParameter != null) {
                        if (queryParameter.equals("challenges")) {
                            r8 = 2FW.A0R;
                        } else if (queryParameter.equals("daily_prompt")) {
                            r8 = 2FW.A0f;
                        } else {
                            return;
                        }
                        Long l = r0.A0m;
                        ImmutableList A0H2 = A002.A0H();
                        if (A0H2 == null || (r5 = (C254873tC) 00k.A0O(A0H2, 0)) == null || (str = r5.A1N) == null) {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                        String str3 = A002.A1u;
                        0qQ.A07(str3);
                        C49731F3w A072 = 1as.A04.A02.A07(DbS.A0O("direct_thread"), userSession, r8);
                        AnonymousClass7S7 A0d = C66582MXn.A0d(this.A06);
                        C313756gx A003 = C313746gw.A00(userSession);
                        String A092 = C66647MaG.A09(r4);
                        0qQ.A0A(r4);
                        String A0C = C66647MaG.A0C(r4);
                        String A0g = A002.A0g();
                        String A0f = A002.A0f();
                        int i2 = A0d.C6Q().A01;
                        String str4 = userSession.A06;
                        A003.A0U(A092, A0C, A0g, A0f, C329997La.A00(A0d.BiC(), str4, 29), i2);
                        String A093 = C66647MaG.A09(r4);
                        if (A093 != null) {
                            C242243Te BiC = A0d.BiC();
                            if (BiC != null) {
                                i = BiC.A00;
                            }
                            String A004 = C329997La.A00(BiC, str4, 29);
                            if (r8 == 2FW.A0R) {
                                A072.A07.putParcelable("DirectShareSheetConstants.channel_challenge", new ChannelChallengePromptShareInfo(Integer.valueOf(i), A093, C66647MaG.A0C(r4), String.valueOf(l), str, str3, A002.A0g(), A002.A0f(), A004, (String) null, "channel_challenge_share_xma"));
                                C72202OyR A005 = C69869NtX.A00(userSession);
                                String A0C2 = C66647MaG.A0C(r4);
                                Integer valueOf = Integer.valueOf(A0d.AdN());
                                String valueOf2 = String.valueOf(l);
                                0qQ.A0B(valueOf2, 3);
                                C72202OyR.A03((C69493Nmb) null, A005, valueOf, A093, A0C2, "challenge_share_sheet_rendered", "tap", "challenge_pill", "thread_view", C72202OyR.A02(valueOf2, A004, (String) null, "share_challenge"));
                            } else if (r8 == 2FW.A0f) {
                                C69868NtW.A00(userSession).A05(A093, C66647MaG.A0C(r4), A004, String.valueOf(l), A002.A0g(), A002.A0f(), "channel_daily_prompt_xma", i, !r0.A05());
                                A072.A07.putParcelable("DirectShareSheetConstants.daily_prompt", new DailyPromptsShareInfo(DbT.A0l(r0.A05()), Integer.valueOf(i), A093, C66647MaG.A0C(r4), String.valueOf(l), A002.A0g(), A002.A0f(), A004, "channel_daily_prompt_xma"));
                            }
                            AnonymousClass37D A012 = AnonymousClass37D.A00.A01(this.A00);
                            if (A012 != null) {
                                A012.A0J(A072.A00());
                                return;
                            }
                            return;
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public static final void A00(AnonymousClass4DH r3, C72505P8o p8o) {
        AnonymousClass37D A0i;
        C74317Pst pst;
        Activity activity = p8o.A00;
        if (!((!(activity instanceof C74317Pst) || (pst = (C74317Pst) activity) == null || (A0i = pst.AhO()) == null) && (A0i = DbT.A0i(activity)) == null)) {
            C72964PQw.A00(p8o, 4, A0i);
            A0i.A0J(r3);
            p8o.A04.Cyt();
        }
        1Av A002 = 1Au.A00(p8o.A02);
        0qQ.A0B(A002, 0);
        DbW.A1L(AnonymousClass7TE.A0p(A002), "direct_forwarding_has_forwarded");
    }

    public static final void A01(C72505P8o p8o, C254703su r17, AnonymousClass7S7 r18, C254793t3 r19, Integer num, String str) {
        Integer num2;
        0xG A0O;
        Integer num3;
        String str2;
        String str3;
        String str4;
        AnonymousClass0eK r192;
        AnonymousClass0eK r20;
        C72505P8o p8o2 = p8o;
        p8o2.A05.CLU();
        C231002qi r1 = ((C2356730t) p8o2.A08.getValue()).A01;
        EnumSet of = EnumSet.of(Trigger.A0t);
        0qQ.A07(of);
        r1.AVg(of);
        int A052 = C66580MXl.A05(r18);
        C254703su r10 = r17;
        C254793t3 r11 = r19;
        Integer num4 = num;
        String str5 = str;
        Activity activity = p8o2.A00;
        UserSession userSession = p8o2.A02;
        if (A052 == 29) {
            AnonymousClass0eK r4 = p8o2.A06;
            AnonymousClass0eK r3 = p8o2.A09;
            str2 = r10.A0f();
            str3 = C66647MaG.A0C((C254743sy) C66580MXl.A0s(p8o2.A07));
            num2 = Integer.valueOf(C66580MXl.A05(r18));
            num3 = Integer.valueOf(r18.C6Q().A01);
            str4 = C329997La.A00(r18.BiC(), userSession.A06, 29);
            A0O = DbS.A0O("direct_thread");
            r192 = r4;
            r20 = r3;
        } else {
            AnonymousClass0eK r12 = p8o2.A06;
            AnonymousClass0eK r0 = p8o2.A09;
            num2 = null;
            A0O = DbS.A0O("direct_thread");
            num3 = null;
            str2 = null;
            str3 = null;
            str4 = null;
            r192 = r12;
            r20 = r0;
        }
        A00(C70017Nvv.A00(activity, A0O, userSession, r10, r11, num4, num2, num3, str5, str2, str3, str4, r192, r20), p8o2);
    }
}
