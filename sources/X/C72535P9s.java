package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;

/* renamed from: X.P9s  reason: case insensitive filesystem */
public final class C72535P9s implements AnonymousClass7XW {
    public AnonymousClass7XP A00;
    public MessagingUser A01;
    public C331157Pu A02;
    public final Activity A03;
    public final AnonymousClass7VW A04;
    public final C332257Ug A05;
    public final AnonymousClass0eK A06;
    public final int A07;
    public final UserSession A08;
    public final C313756gx A09;
    public final OT9 A0A;
    public final AnonymousClass7X4 A0B;
    public final AnonymousClass7XL A0C;
    public final AnonymousClass7SN A0D;
    public final AnonymousClass0eK A0E;
    public final AnonymousClass0eK A0F;

    public C72535P9s(Activity activity, UserSession userSession, OT9 ot9, AnonymousClass7X4 r5, AnonymousClass7VW r6, C332257Ug r7, AnonymousClass7XL r8, AnonymousClass7SN r9, AnonymousClass7XP r10, AnonymousClass0eK r11, AnonymousClass0eK r12, AnonymousClass0eK r13, int i) {
        C51973G9u.A0r(3, r11, r12, ot9);
        C51973G9u.A0t(7, r6, r8, r13);
        DbW.A1P(r5, 11, r10);
        0qQ.A0B(r7, 13);
        this.A08 = userSession;
        this.A03 = activity;
        this.A06 = r11;
        this.A0E = r12;
        this.A0A = ot9;
        this.A0D = r9;
        this.A04 = r6;
        this.A0C = r8;
        this.A0F = r13;
        this.A07 = i;
        this.A0B = r5;
        this.A00 = r10;
        this.A05 = r7;
        this.A09 = C313746gw.A00(userSession);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02f9, code lost:
        if (X.AnonymousClass7TF.A1Z(((X.AnonymousClass9HC) r6.A0F.get()).A12) != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        if (r18.CYS() == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        if (r0 != false) goto L_0x0070;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DBq(com.instagram.model.direct.messageid.MessageIdentifier r34, boolean r35) {
        /*
            r33 = this;
            r9 = r34
            if (r34 == 0) goto L_0x0134
            r6 = r33
            X.0eK r10 = r6.A0E
            java.lang.Object r5 = r10.get()
            X.3sy r5 = (X.C254743sy) r5
            if (r5 == 0) goto L_0x0134
            X.0eK r8 = r6.A06
            java.lang.Object r2 = r8.get()
            X.7Zg r2 = (X.C333517Zg) r2
            if (r2 == 0) goto L_0x0134
            boolean r20 = X.C66647MaG.A0F(r5)
            r4 = 1
            r19 = 0
            if (r20 == 0) goto L_0x0301
            X.OT9 r3 = r6.A0A
            java.lang.String r1 = r9.A01
            java.lang.String r0 = "DirectThreadFragment.onEmojiReactionsClick"
            X.3su r3 = X.OT9.A00(r3, r1, r0, r4)
        L_0x002d:
            r14 = 0
        L_0x002e:
            X.7S7 r18 = r2.C6l()
            int r0 = X.C66580MXl.A05(r18)
            boolean r7 = X.AnonymousClass48O.A03(r0)
            if (r7 == 0) goto L_0x004b
            com.instagram.common.session.UserSession r11 = r6.A08
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342158877552348786(0x2081051700090e72, double:4.0620825818956775E-152)
            boolean r0 = X.182.A06(r2, r11, r0)
            if (r0 == 0) goto L_0x0134
        L_0x004b:
            X.7SN r0 = r6.A0D
            r0.CLU()
            boolean r0 = r18.CdE()
            if (r0 == 0) goto L_0x005d
            boolean r0 = r18.CYS()
            r2 = 1
            if (r0 != 0) goto L_0x005e
        L_0x005d:
            r2 = 0
        L_0x005e:
            if (r14 == 0) goto L_0x02e9
            com.instagram.direct.capabilities.Capabilities r1 = r18.BN2()
            if (r1 == 0) goto L_0x02e6
            X.9Gx r0 = X.C376179Gx.REACTIONS
            boolean r0 = r1.A00(r0)
        L_0x006c:
            if (r2 != 0) goto L_0x02fd
            if (r0 == 0) goto L_0x02fd
        L_0x0070:
            r26 = 1
        L_0x0072:
            r0 = 0
            if (r7 == 0) goto L_0x0181
            com.instagram.common.session.UserSession r2 = r6.A08
            X.9HW r13 = X.AnonymousClass9HV.A00(r2)
            X.3t3 r12 = r18.CBU()
            r11 = 42
            boolean r11 = r13.A00(r12, r11)
            if (r11 == 0) goto L_0x0181
            if (r3 == 0) goto L_0x017d
            com.google.common.collect.ImmutableList r13 = r3.A0J()
            if (r13 == 0) goto L_0x017d
        L_0x0090:
            int r8 = X.C66580MXl.A05(r18)
            int r7 = r18.AdN()
            java.lang.String r9 = r9.A01
            if (r3 == 0) goto L_0x0179
            java.lang.String r12 = r3.A0f()
        L_0x00a0:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MICROSECONDS
            if (r3 == 0) goto L_0x00a8
            long r0 = r3.C7c()
        L_0x00a8:
            long r0 = r10.toMillis(r0)
            if (r3 == 0) goto L_0x00b2
            X.2FW r14 = r3.A10
            if (r14 != 0) goto L_0x00b4
        L_0x00b2:
            X.2FW r14 = X.2FW.A0m
        L_0x00b4:
            X.Nbc r3 = new X.Nbc
            r3.<init>()
            android.os.Bundle r11 = X.AnonymousClass7TE.A0a()
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1D(r13)
            java.lang.String r10 = "direct_count_based_reactions_list"
            r11.putParcelableArrayList(r10, r13)
            java.lang.String r10 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_ID"
            r11.putString(r10, r9)
            X.C66583MXo.A0t(r11, r14, r12, r0)
            java.lang.String r0 = "direct_emoji_unified_thread_key"
            X.C67002Mga.A01(r11, r5, r0)
            java.lang.String r0 = "direct_emoji_thread_subtype"
            r11.putInt(r0, r8)
            java.lang.String r0 = "direct_emoji_thread_audience_type"
            r11.putInt(r0, r7)
            X.AnonymousClass0Dg.A00(r11, r2)
            r3.setArguments(r11)
        L_0x00e3:
            X.O7j r0 = new X.O7j
            r0.<init>(r6)
            r3.A03 = r0
            int r1 = X.C66580MXl.A05(r18)
            r0 = 29
            if (r1 != r0) goto L_0x0135
            if (r20 == 0) goto L_0x012c
            X.6gx r8 = r6.A09
            java.lang.String r7 = X.C66647MaG.A09(r5)
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A03(r5)
            java.lang.String r5 = r0.A01
            X.1Ln r1 = X.DbT.A0J(r8)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x012c
            X.DbW.A17(r1, r8)
            java.lang.String r0 = "retrieve_message_reactions_details"
            X.DbV.A1M(r1, r0)
            java.lang.String r0 = "view_reactions_button"
            X.C66581MXm.A1J(r1, r0)
            java.lang.String r0 = "instagram"
            java.lang.Long r0 = X.C66583MXo.A0e(r1, r0, r7, r5)
            r1.A0i(r0)
            java.lang.String r0 = "mid"
            java.util.Map r0 = X.AnonymousClass7TF.A0w(r0, r9)
            r1.A0w(r0)
            r1.Cgf()
        L_0x012c:
            X.7XL r0 = r6.A0C
            boolean r0 = r0.CnR()
            if (r0 != 0) goto L_0x0135
        L_0x0134:
            return
        L_0x0135:
            android.app.Activity r5 = r6.A03
            boolean r0 = r5 instanceof X.C74317Pst
            if (r0 == 0) goto L_0x0144
            r0 = r5
            X.Pst r0 = (X.C74317Pst) r0
            if (r0 == 0) goto L_0x0144
            X.37D r19 = r0.AhO()
        L_0x0144:
            X.7Pr r2 = X.DbX.A0e(r2, r4)
            r2.A0T = r3
            r0 = 1058642330(0x3f19999a, float:0.6)
            r2.A03 = r0
            int r0 = r6.A07
            if (r0 == 0) goto L_0x0177
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r1.<init>(r5, r0)
            r0 = 2130970208(0x7f040660, float:1.754912E38)
            int r0 = X.2Yu.A0F(r1, r0)
        L_0x015f:
            r2.A06 = r0
            r0 = 14
            X.7Pu r1 = X.C72959PQr.A00(r2, r6, r0)
            r0 = r19
            X.7Pu r0 = X.C331157Pu.A00(r5, r5, r3, r1, r0)
            r6.A02 = r0
            if (r0 == 0) goto L_0x0134
            X.7Ug r0 = r6.A05
            r0.Cyt()
            return
        L_0x0177:
            r0 = 0
            goto L_0x015f
        L_0x0179:
            r12 = r19
            goto L_0x00a0
        L_0x017d:
            X.0sn r13 = X.0sn.A00
            goto L_0x0090
        L_0x0181:
            com.instagram.common.session.UserSession r2 = r6.A08
            com.instagram.direct.capabilities.Capabilities r17 = r18.AlE()
            X.0qQ.A07(r17)
            if (r7 == 0) goto L_0x01fd
            r8 = r19
        L_0x018e:
            int r12 = X.C66580MXl.A05(r18)
            int r11 = r18.AdN()
            java.lang.String r9 = r9.A01
            if (r3 == 0) goto L_0x01fa
            java.lang.String r13 = r3.A0f()
        L_0x019e:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MICROSECONDS
            if (r3 == 0) goto L_0x01a6
            long r0 = r3.C7c()
        L_0x01a6:
            long r0 = r10.toMillis(r0)
            if (r3 == 0) goto L_0x01b0
            X.2FW r15 = r3.A10
            if (r15 != 0) goto L_0x01b2
        L_0x01b0:
            X.2FW r15 = X.2FW.A0m
        L_0x01b2:
            int r14 = r6.A07
            android.os.Bundle r10 = X.AnonymousClass7TE.A0a()
            if (r7 != 0) goto L_0x01c5
            if (r8 == 0) goto L_0x031f
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1D(r8)
            java.lang.String r3 = "direct_emoji_reactions_list"
            r10.putParcelableArrayList(r3, r8)
        L_0x01c5:
            java.lang.String r3 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_ID"
            r10.putString(r3, r9)
            X.C66583MXo.A0t(r10, r15, r13, r0)
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CURRENT_THEME_ID"
            r10.putInt(r0, r14)
            java.lang.String r0 = "direct_emoji_is_count_based_reaction_sheet"
            r10.putBoolean(r0, r7)
            java.lang.String r0 = "direct_emoji_unified_thread_key"
            X.C67002Mga.A01(r10, r5, r0)
            java.lang.String r0 = "direct_emoji_thread_subtype"
            r10.putInt(r0, r12)
            java.lang.String r0 = "direct_emoji_thread_audience_type"
            r10.putInt(r0, r11)
            java.lang.String r1 = "DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES"
            r0 = r17
            r10.putParcelable(r1, r0)
            X.AnonymousClass0Dg.A00(r10, r2)
            X.Nbd r3 = new X.Nbd
            r3.<init>()
            r3.setArguments(r10)
            goto L_0x00e3
        L_0x01fa:
            r13 = r19
            goto L_0x019e
        L_0x01fd:
            X.17i r11 = X.17h.A00(r2)
            X.7ZY r12 = X.C66582MXn.A0W(r8)
            boolean r8 = r12 instanceof X.PAS
            if (r8 == 0) goto L_0x02dd
            X.PAS r12 = (X.PAS) r12
        L_0x020b:
            java.lang.Object r8 = r10.get()
            X.3sy r8 = (X.C254743sy) r8
            boolean r8 = X.C66647MaG.A0F(r8)
            if (r8 != 0) goto L_0x0219
            if (r14 == 0) goto L_0x026d
        L_0x0219:
            if (r3 == 0) goto L_0x026d
            java.util.List r8 = r3.A0v()
            X.0qQ.A07(r8)
        L_0x0222:
            java.lang.String r15 = r2.A06
            r14 = 0
            java.util.ArrayList r10 = X.AnonymousClass7TF.A0q(r11, r4)
            java.util.Iterator r16 = r8.iterator()
        L_0x022d:
            boolean r8 = r16.hasNext()
            if (r8 == 0) goto L_0x02e0
            java.lang.Object r8 = r16.next()
            X.46u r8 = (X.C2607246u) r8
            java.lang.String r12 = r8.A00()
            com.instagram.user.model.User r23 = r11.A02(r12)
            if (r23 == 0) goto L_0x022d
            java.lang.String r12 = r23.getId()
            boolean r25 = X.0qQ.A0K(r12, r15)
            java.lang.String r12 = r8.A02
            r24 = r12
            java.lang.String r13 = r8.A04
            java.lang.String r12 = "default"
            boolean r27 = r12.equals(r13)
            com.instagram.model.mediasize.ExtendedImageUrl r8 = r8.A00
            r21 = r2
            r22 = r8
            com.instagram.direct.messagethread.reactions.model.ReactionViewModel r12 = X.AnonymousClass50m.A00(r21, r22, r23, r24, r25, r26, r27)
            boolean r8 = r12.A08
            if (r8 == 0) goto L_0x0269
            r10.add(r14, r12)
            goto L_0x022d
        L_0x0269:
            r10.add(r12)
            goto L_0x022d
        L_0x026d:
            java.lang.Object r8 = r10.get()
            boolean r8 = r8 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r8 == 0) goto L_0x02d9
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            if (r12 == 0) goto L_0x02d7
            X.2tL r12 = r12.A01(r9)
        L_0x027f:
            boolean r10 = r12 instanceof X.C328627Fn
            if (r10 == 0) goto L_0x02c8
            X.7Fn r12 = (X.C328627Fn) r12
            X.7Fl r10 = r12.ApX()
            X.79G r10 = r10.A0P
        L_0x028b:
            if (r10 == 0) goto L_0x0222
            java.util.Map r14 = r10.A0H
            java.util.Iterator r16 = X.DbV.A16(r14)
        L_0x0293:
            boolean r10 = r16.hasNext()
            if (r10 == 0) goto L_0x0222
            java.lang.String r13 = X.AnonymousClass7TE.A18(r16)
            java.util.List r10 = X.C66580MXl.A13(r13, r14)
            if (r10 == 0) goto L_0x0293
            java.util.Iterator r15 = r10.iterator()
        L_0x02a7:
            boolean r10 = r15.hasNext()
            if (r10 == 0) goto L_0x0293
            java.lang.Object r12 = r15.next()
            java.lang.String r12 = (java.lang.String) r12
            X.46u r10 = new X.46u
            r27 = r10
            r28 = r19
            r29 = r19
            r30 = r12
            r31 = r13
            r32 = r19
            r27.<init>(r28, r29, r30, r31, r32)
            r8.add(r10)
            goto L_0x02a7
        L_0x02c8:
            boolean r10 = r12 instanceof X.AnonymousClass79P
            if (r10 == 0) goto L_0x0222
            X.79P r12 = (X.AnonymousClass79P) r12
            X.7Fm r10 = r12.Ar3()
            X.77t r10 = (X.C3266877t) r10
            X.79G r10 = r10.A0I
            goto L_0x028b
        L_0x02d7:
            r12 = 0
            goto L_0x027f
        L_0x02d9:
            X.0sn r8 = X.0sn.A00
            goto L_0x0222
        L_0x02dd:
            r12 = 0
            goto L_0x020b
        L_0x02e0:
            java.util.List r8 = X.C51966G9m.A1J(r10)
            goto L_0x018e
        L_0x02e6:
            r0 = 0
            goto L_0x006c
        L_0x02e9:
            if (r2 != 0) goto L_0x02fd
            X.0eK r0 = r6.A0F
            java.lang.Object r0 = r0.get()
            X.9HC r0 = (X.AnonymousClass9HC) r0
            X.0eM r0 = r0.A12
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x02fd
            goto L_0x0070
        L_0x02fd:
            r26 = 0
            goto L_0x0072
        L_0x0301:
            boolean r0 = r5 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r0 == 0) goto L_0x031b
            java.lang.String r1 = r9.A01
            boolean r0 = r2.CYZ(r1)
            if (r0 == 0) goto L_0x031b
            r0 = r2
            X.P27 r0 = (X.P27) r0
            X.7LQ r0 = r0.Bjv(r1)
            if (r0 == 0) goto L_0x0324
            X.3su r3 = r0.A0e
            r14 = 1
            goto L_0x002e
        L_0x031b:
            r3 = r19
            goto L_0x002d
        L_0x031f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0324:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72535P9s.DBq(com.instagram.model.direct.messageid.MessageIdentifier, boolean):void");
    }
}
