package X;

import com.instagram.common.session.UserSession;

public final class EQ5 extends C252733pa {
    public final UserSession A00;
    public final C72198OyK A01;
    public final C333537Zi A02;
    public final C66912Mew A03;
    public final 0xa A04 = 0xn.A01("direct_share_sheet");

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EQ5(UserSession userSession) {
        super("DirectSharesheetReshareRepository", AnonymousClass43D.A01(1356155, 3));
        C66912Mew E52 = AnonymousClass1pH.A00().E52(userSession);
        C333537Zi A002 = C333527Zh.A00(userSession);
        0qQ.A0B(userSession, 0);
        C72198OyK oyK = (C72198OyK) userSession.A01(C72198OyK.class, new MYO(userSession, 25));
        0qQ.A0B(E52, 2);
        AnonymousClass7TF.A1D(A002, 3, oyK);
        this.A00 = userSession;
        this.A03 = E52;
        this.A02 = A002;
        this.A01 = oyK;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0225, code lost:
        if (r4 != null) goto L_0x0227;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0276, code lost:
        if (r42 == null) goto L_0x015a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.content.Context r36, X.ExY r37, X.C381819cP r38, X.1Xj r39, com.instagram.model.direct.DirectShareTarget r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, boolean r44) {
        /*
            r35 = this;
            r0 = r42
            r3 = r37
            r20 = 0
            r24 = 0
            r7 = r35
            X.Mew r1 = r7.A03
            r13 = r40
            X.7Z7 r12 = r1.A00(r13)
            java.lang.String r9 = java.lang.String.valueOf(r0)
            boolean r1 = r3 instanceof X.EJP
            r14 = r41
            r11 = r44
            if (r1 == 0) goto L_0x0034
            X.EJP r3 = (X.EJP) r3
            com.instagram.user.model.Product r1 = r3.A00
            if (r1 == 0) goto L_0x0033
            boolean r0 = r13 instanceof com.instagram.model.direct.DirectReplyToMerchantShareTarget
            if (r0 == 0) goto L_0x002a
            java.lang.String r9 = "shops_messaging:shops_reply_to_merchant_share"
        L_0x002a:
            r2 = r12
            r3 = r13
            r4 = r1
            r5 = r14
            r6 = r9
            r7 = r11
            r2.EMM(r3, r4, r5, r6, r7)
        L_0x0033:
            return
        L_0x0034:
            boolean r1 = r3 instanceof X.EJL
            if (r1 == 0) goto L_0x0048
            X.EJL r3 = (X.EJL) r3
            com.instagram.model.direct.DirectRoomsXma r0 = r3.A00
            if (r0 == 0) goto L_0x0033
            r1 = r12
            r2 = r0
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r11
            r1.EMc(r2, r3, r4, r5, r6)
            return
        L_0x0048:
            boolean r2 = r3 instanceof X.EJW
            r1 = r36
            if (r2 == 0) goto L_0x0075
            X.EJW r3 = (X.EJW) r3
            X.3uh r0 = r3.A00
            if (r0 == 0) goto L_0x006c
            com.instagram.user.model.User r0 = r0.A0i
            if (r0 == 0) goto L_0x006c
        L_0x0058:
            java.lang.String r4 = r0.B8Q()
            java.lang.String r0 = r3.A01
            java.lang.String r3 = java.lang.String.valueOf(r0)
            r0 = r12
            r2 = r13
            r5 = r14
            r6 = r9
            r7 = r9
            r8 = r11
            r0.ELv(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x006c:
            X.0eE r2 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r7.A00
            com.instagram.user.model.User r0 = r2.A01(r0)
            goto L_0x0058
        L_0x0075:
            boolean r2 = r3 instanceof X.EJ1
            if (r2 == 0) goto L_0x0081
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r12.EN7(r13, r14, r0, r11)
            return
        L_0x0081:
            boolean r2 = r3 instanceof X.EJD
            if (r2 == 0) goto L_0x0095
            X.EJD r3 = (X.EJD) r3
            com.instagram.infocenter.intf.InfoCenterShareInfoIntf r0 = r3.A00
            if (r0 == 0) goto L_0x0033
            r1 = r12
            r2 = r0
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r11
            r1.ELp(r2, r3, r4, r5, r6)
            return
        L_0x0095:
            boolean r2 = r3 instanceof X.EJC
            if (r2 == 0) goto L_0x00a9
            X.EJC r3 = (X.EJC) r3
            com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf r0 = r3.A00
            if (r0 == 0) goto L_0x0033
            r1 = r12
            r2 = r0
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r11
            r1.ELo(r2, r3, r4, r5, r6)
            return
        L_0x00a9:
            boolean r2 = r3 instanceof X.EJH
            if (r2 == 0) goto L_0x00be
            X.EJH r3 = (X.EJH) r3
            java.lang.String r0 = r3.A01
            java.lang.String r3 = java.lang.String.valueOf(r0)
            r0 = r12
            r1 = r13
            r2 = r14
            r4 = r9
            r5 = r11
            r0.EME(r1, r2, r3, r4, r5)
            return
        L_0x00be:
            boolean r2 = r3 instanceof X.C47827EIz
            if (r2 == 0) goto L_0x00d0
            X.EIz r3 = (X.C47827EIz) r3
            java.lang.String r1 = r3.A00
            if (r1 == 0) goto L_0x0033
            if (r42 != 0) goto L_0x00cc
            java.lang.String r0 = "school_invite_share"
        L_0x00cc:
            r12.EMe(r13, r14, r0, r11)
            return
        L_0x00d0:
            boolean r2 = r3 instanceof X.EJ8
            if (r2 == 0) goto L_0x00e8
            X.EJ8 r3 = (X.EJ8) r3
            com.instagram.save.model.SavedCollection r1 = r3.A00
            if (r1 == 0) goto L_0x0033
            if (r42 != 0) goto L_0x00de
            java.lang.String r0 = "collections_share"
        L_0x00de:
            r2 = r12
            r3 = r13
            r4 = r1
            r5 = r14
            r6 = r0
            r7 = r11
            r2.ELW(r3, r4, r5, r6, r7)
            return
        L_0x00e8:
            boolean r2 = r3 instanceof X.EJU
            r27 = r39
            if (r2 == 0) goto L_0x0112
            X.EJU r3 = (X.EJU) r3
            java.lang.String r2 = r3.A01
            if (r2 == 0) goto L_0x0033
            if (r39 == 0) goto L_0x0033
            com.instagram.model.direct.DirectPendingLayeredXma r1 = r3.A00
            if (r42 != 0) goto L_0x00fc
            java.lang.String r0 = "comment_share"
        L_0x00fc:
            r25 = r12
            r26 = r20
            r28 = r1
            r29 = r13
            r30 = r2
            r31 = r14
            r32 = r0
            r33 = r11
            r34 = r24
            r25.ELY(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return
        L_0x0112:
            boolean r2 = r3 instanceof X.EJE
            if (r2 == 0) goto L_0x012e
            X.EJE r3 = (X.EJE) r3
            com.instagram.direct.groupinvites.models.InviteLinkShareInfo r1 = r3.A00
            if (r1 == 0) goto L_0x0033
            java.lang.String r1 = r1.A06
            if (r1 == 0) goto L_0x0033
            if (r42 != 0) goto L_0x0124
            java.lang.String r0 = "channel_invite_link_share"
        L_0x0124:
            r2 = r12
            r3 = r13
            r4 = r1
            r5 = r14
            r6 = r0
            r7 = r11
            r2.ELS(r3, r4, r5, r6, r7)
            return
        L_0x012e:
            boolean r2 = r3 instanceof X.EJK
            if (r2 == 0) goto L_0x014c
            X.EJK r3 = (X.EJK) r3
            com.instagram.save.model.SavedCollection r1 = r3.A00
            if (r1 == 0) goto L_0x0033
            if (r42 != 0) goto L_0x0140
            r0 = 357(0x165, float:5.0E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x0140:
            r2 = r12
            r3 = r13
            r4 = r1
            r5 = r14
            r6 = r0
            r7 = r11
            r8 = r24
            r2.EMQ(r3, r4, r5, r6, r7, r8)
            return
        L_0x014c:
            boolean r2 = r3 instanceof X.EJF
            if (r2 == 0) goto L_0x0168
            X.EJF r3 = (X.EJF) r3
            java.lang.String r2 = r3.A01
            if (r2 == 0) goto L_0x0033
            if (r42 != 0) goto L_0x0359
            java.lang.String r25 = "links_share"
        L_0x015a:
            r21 = r12
            r22 = r13
            r23 = r2
            r24 = r14
            r26 = r11
            r21.ELu(r22, r23, r24, r25, r26)
            return
        L_0x0168:
            boolean r2 = r3 instanceof X.EJR
            if (r2 == 0) goto L_0x0177
            X.EJR r3 = (X.EJR) r3
            java.lang.String r2 = r3.A01
            if (r2 == 0) goto L_0x0033
            if (r42 != 0) goto L_0x0359
            java.lang.String r25 = "thread_share_links_share"
            goto L_0x015a
        L_0x0177:
            boolean r2 = r3 instanceof X.EJ4
            if (r2 == 0) goto L_0x0192
            X.EJ4 r3 = (X.EJ4) r3
            com.instagram.model.direct.gifs.DirectAnimatedMedia r3 = r3.A00
            if (r3 == 0) goto L_0x0033
            if (r42 != 0) goto L_0x0185
            java.lang.String r0 = "animated_medias_share"
        L_0x0185:
            com.instagram.common.session.UserSession r2 = r7.A00
            r4 = r12
            r5 = r1
            r6 = r2
            r7 = r13
            r8 = r3
            r9 = r14
            r10 = r0
            r4.ELM(r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0192:
            boolean r2 = r3 instanceof X.EJV
            if (r2 == 0) goto L_0x01c1
            X.EJV r3 = (X.EJV) r3
            java.lang.String r5 = r3.A01
            if (r5 == 0) goto L_0x0033
            java.lang.String r4 = r3.A03
            if (r4 == 0) goto L_0x0033
            java.lang.String r3 = r3.A02
            if (r3 == 0) goto L_0x0033
            X.0eE r2 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r1 = r7.A00
            X.4Cl r1 = X.DbS.A0h(r1, r2)
            java.lang.String r16 = r1.getFbidV2()
            if (r42 != 0) goto L_0x01b4
            java.lang.String r0 = "FB_pay_referrals_share"
        L_0x01b4:
            r15 = r5
            r17 = r4
            r18 = r3
            r19 = r0
            r20 = r11
            r12.ELh(r13, r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x01c1:
            boolean r4 = r3 instanceof X.EJA
            r2 = 0
            r5 = 1
            if (r4 == 0) goto L_0x01ff
            X.EJA r3 = (X.EJA) r3
            X.FpN r6 = r3.A00
            if (r6 == 0) goto L_0x0033
            X.FpM r5 = r6.A01
            if (r5 != 0) goto L_0x01f1
            r4 = 2131976928(0x7f1362e0, float:1.959099E38)
            X.FpM r2 = r6.A06
            java.lang.String r2 = r2.A00
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
        L_0x01dc:
            java.lang.String r4 = r1.getString(r4, r2)
            X.0qQ.A0A(r4)
            if (r42 != 0) goto L_0x01e7
            java.lang.String r0 = "fundraisers_share"
        L_0x01e7:
            r1 = r12
            r2 = r13
            r3 = r6
            r5 = r14
            r6 = r0
            r7 = r11
            r1.ELl(r2, r3, r4, r5, r6, r7)
            return
        L_0x01f1:
            r4 = 2131976929(0x7f1362e1, float:1.9590992E38)
            X.FpM r2 = r6.A06
            java.lang.String r3 = r2.A00
            java.lang.String r2 = r5.A00
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            goto L_0x01dc
        L_0x01ff:
            boolean r4 = r3 instanceof X.EJ3
            if (r4 == 0) goto L_0x0217
            X.EJ3 r3 = (X.EJ3) r3
            com.instagram.direct.model.DirectAREffectShare r1 = r3.A00
            if (r1 == 0) goto L_0x0033
            if (r42 != 0) goto L_0x020d
            java.lang.String r0 = "AR_effects_share"
        L_0x020d:
            r2 = r12
            r3 = r1
            r4 = r13
            r5 = r14
            r6 = r0
            r7 = r11
            r2.ELK(r3, r4, r5, r6, r7)
            return
        L_0x0217:
            boolean r4 = r3 instanceof X.EJJ
            java.lang.String r25 = "profile_share"
            java.lang.String r6 = "share_sheet_profile"
            java.lang.String r10 = "User profile to share is null"
            if (r4 == 0) goto L_0x0238
            X.EJJ r3 = (X.EJJ) r3
            com.instagram.user.model.User r4 = r3.A00
        L_0x0225:
            if (r4 == 0) goto L_0x0502
        L_0x0227:
            if (r42 != 0) goto L_0x022b
            r0 = r25
        L_0x022b:
            java.lang.String r7 = "share_sheet"
            r1 = r12
            r2 = r20
            r3 = r13
            r5 = r14
            r6 = r0
            r8 = r11
            r1.EMN(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0238:
            boolean r4 = r3 instanceof X.EJT
            if (r4 == 0) goto L_0x027a
            X.EJT r3 = (X.EJT) r3
            com.instagram.user.model.User r4 = r3.A00
            if (r4 == 0) goto L_0x0500
            com.instagram.common.session.UserSession r6 = r7.A00
            X.0Tu r5 = X.0Tu.A05
            r1 = 36327426095987122(0x810f9a000e39b2, double:3.036948769681435E-306)
            boolean r2 = X.182.A06(r5, r6, r1)
            r1 = 3163(0xc5b, float:4.432E-42)
            java.lang.String r25 = X.C273654mx.A00(r1)
            if (r2 == 0) goto L_0x0227
            r22 = r0
            if (r42 != 0) goto L_0x025d
            r22 = r25
        L_0x025d:
            java.lang.String r21 = ""
            java.lang.String r23 = "share_sheet"
            r17 = r12
            r18 = r20
            r19 = r13
            r20 = r4
            r24 = r11
            r17.EMN(r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r2 = r3.A02
            int r1 = r2.length()
            if (r1 <= 0) goto L_0x0033
            if (r42 != 0) goto L_0x0359
            goto L_0x015a
        L_0x027a:
            boolean r4 = r3 instanceof X.EJQ
            if (r4 == 0) goto L_0x029f
            X.EJQ r3 = (X.EJQ) r3
            com.instagram.user.model.User r3 = r3.A00
            if (r3 == 0) goto L_0x056e
            if (r42 != 0) goto L_0x0288
            java.lang.String r0 = "subscription_share_xma_share"
        L_0x0288:
            r2 = 2131962004(0x7f132894, float:1.956072E38)
            java.lang.String r6 = X.AnonymousClass7TE.A16(r1, r2)
            r2 = 2131962003(0x7f132893, float:1.9560719E38)
            java.lang.String r7 = X.AnonymousClass7TE.A16(r1, r2)
            r1 = r12
            r2 = r13
            r4 = r14
            r5 = r0
            r8 = r11
            r1.EMo(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x029f:
            boolean r4 = r3 instanceof X.EJS
            java.lang.String r8 = "Media to share is null"
            r17 = r38
            if (r4 == 0) goto L_0x02c7
            X.EJS r3 = (X.EJS) r3
            X.1Xj r1 = r3.A01
            if (r1 == 0) goto L_0x050c
            if (r38 == 0) goto L_0x0033
            X.1Xj r0 = r3.A00
            if (r0 == 0) goto L_0x02c5
            java.lang.String r10 = r0.getId()
        L_0x02b7:
            r2 = r12
            r3 = r20
            r4 = r3
            r5 = r17
            r6 = r1
            r7 = r13
            r8 = r3
            r9 = r14
            r2.EM1(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x02c5:
            r10 = r2
            goto L_0x02b7
        L_0x02c7:
            boolean r4 = r3 instanceof X.EJ7
            if (r4 == 0) goto L_0x02e8
            X.EJ7 r3 = (X.EJ7) r3
            X.1Xj r0 = r3.A00
            if (r0 == 0) goto L_0x0033
            java.lang.String r22 = "share_sheet"
            r23 = r43
            r15 = r12
            r16 = r2
            r17 = r2
            r18 = r0
            r19 = r13
            r20 = r14
            r21 = r9
            r24 = r11
            r15.ELV(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        L_0x02e8:
            boolean r4 = r3 instanceof X.EJY
            if (r4 == 0) goto L_0x034f
            r4 = r3
            X.EJY r4 = (X.EJY) r4
            X.1Xj r0 = r4.A00
            if (r0 == 0) goto L_0x0506
            X.3t2 r5 = X.DbS.A0c(r13)
            boolean r5 = r5 instanceof X.C254763t0
            if (r5 == 0) goto L_0x035d
            X.3t2 r6 = X.DbS.A0c(r13)
            boolean r5 = r6 instanceof X.C254763t0
            if (r5 == 0) goto L_0x0309
            X.3t0 r6 = (X.C254763t0) r6
            if (r6 == 0) goto L_0x0309
            java.lang.String r2 = r6.A00
        L_0x0309:
            java.lang.String r5 = "creator_ai_sandbox_temp_id"
            boolean r2 = X.0qQ.A0K(r2, r5)
            if (r2 == 0) goto L_0x035d
            boolean r2 = r0.A4j()
            if (r2 == 0) goto L_0x0348
            X.1Xy r2 = r0.A0C
            com.instagram.user.model.User r4 = r2.B9t()
        L_0x031d:
            r2 = 7
            X.0qQ.A0B(r9, r2)
            com.instagram.common.session.UserSession r2 = r7.A00
            X.F1g r5 = new X.F1g
            r5.<init>(r2)
            if (r4 == 0) goto L_0x0033
            java.lang.String r4 = r4.getId()
            X.FZk r2 = new X.FZk
            r15 = r2
            r16 = r1
            r17 = r3
            r18 = r7
            r19 = r0
            r20 = r13
            r21 = r14
            r22 = r9
            r23 = r11
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r5.A00(r2, r4)
            return
        L_0x0348:
            com.instagram.common.session.UserSession r2 = r7.A00
            com.instagram.user.model.User r4 = r0.A2A(r2)
            goto L_0x031d
        L_0x034f:
            boolean r2 = r3 instanceof X.EJ2
            if (r2 == 0) goto L_0x037c
            X.EJ2 r3 = (X.EJ2) r3
            com.instagram.user.model.User r4 = r3.A00
            goto L_0x0225
        L_0x0359:
            r25 = r0
            goto L_0x015a
        L_0x035d:
            java.lang.String r2 = r4.A03
            java.lang.String r1 = r4.A04
            if (r2 == 0) goto L_0x0033
            if (r1 == 0) goto L_0x0033
            if (r38 == 0) goto L_0x0033
            java.lang.String r23 = "share_sheet"
            r15 = r12
            r16 = r20
            r18 = r0
            r19 = r13
            r20 = r2
            r21 = r1
            r22 = r14
            r25 = r24
            r15.EMn(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        L_0x037c:
            boolean r2 = r3 instanceof X.EJ5
            if (r2 == 0) goto L_0x03b1
            X.EJ5 r3 = (X.EJ5) r3
            X.6o8 r4 = r3.A00
            X.7Zi r3 = r7.A02
            com.instagram.common.session.UserSession r2 = r7.A00
            X.3t2 r0 = X.DbS.A0c(r13)
            X.3sy r21 = X.AnonymousClass6W3.A06(r0)
            r17 = r1
            r18 = r2
            r19 = r4
            r22 = r9
            r23 = r20
            r24 = r11
            r16 = r3
            r16.ELQ(r17, r18, r19, r20, r21, r22, r23, r24)
            com.instagram.model.direct.DirectThreadKey r2 = r13.A00()
            java.lang.String r4 = "none"
            r0 = r3
            r1 = r20
            r3 = r14
            r5 = r9
            r6 = r11
            r0.EMr(r1, r2, r3, r4, r5, r6)
            return
        L_0x03b1:
            boolean r2 = r3 instanceof X.EJ0
            if (r2 == 0) goto L_0x03c6
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r24)
            java.lang.String r5 = ""
            r0 = r12
            r1 = r20
            r2 = r13
            r4 = r14
            r6 = r5
            r7 = r11
            r0.EMx(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x03c6:
            boolean r2 = r3 instanceof X.C47825EIx
            if (r2 == 0) goto L_0x03d7
            if (r39 == 0) goto L_0x0509
            r0 = r12
            r1 = r27
            r2 = r13
            r3 = r14
            r4 = r9
            r5 = r11
            r0.ELm(r1, r2, r3, r4, r5)
            return
        L_0x03d7:
            boolean r2 = r3 instanceof X.EJG
            if (r2 == 0) goto L_0x03ec
            X.EJG r3 = (X.EJG) r3
            java.lang.String r0 = r3.A01
            r1 = r12
            r2 = r20
            r3 = r13
            r4 = r0
            r5 = r2
            r6 = r14
            r7 = r9
            r8 = r11
            r1.ELw(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x03ec:
            boolean r2 = r3 instanceof X.C47826EIy
            if (r2 == 0) goto L_0x0400
            X.EIy r3 = (X.C47826EIy) r3
            java.lang.String r0 = r3.A00
            if (r0 == 0) goto L_0x0512
            r1 = r12
            r2 = r13
            r3 = r0
            r4 = r14
            r5 = r9
            r6 = r11
            r1.ELz(r2, r3, r4, r5, r6)
            return
        L_0x0400:
            boolean r2 = r3 instanceof X.EJX
            if (r2 == 0) goto L_0x0427
            X.EJX r3 = (X.EJX) r3
            java.lang.String r2 = r3.A00
            java.lang.String r1 = r3.A02
            java.lang.String r0 = r3.A01
            if (r2 == 0) goto L_0x0033
            if (r1 == 0) goto L_0x0033
            if (r0 == 0) goto L_0x0033
            r15 = r12
            r16 = r20
            r17 = r13
            r18 = r14
            r19 = r1
            r20 = r0
            r21 = r2
            r22 = r9
            r23 = r11
            r15.EMU(r16, r17, r18, r19, r20, r21, r22, r23)
            return
        L_0x0427:
            boolean r2 = r3 instanceof X.EJZ
            if (r2 == 0) goto L_0x0456
            X.EJZ r3 = (X.EJZ) r3
            java.lang.String r7 = r3.A02
            java.lang.String r6 = r3.A04
            java.lang.String r5 = r3.A06
            java.lang.String r4 = r3.A03
            java.lang.String r2 = r3.A05
            java.lang.String r1 = r3.A01
            java.util.List r0 = r3.A07
            r15 = r12
            r16 = r13
            r17 = r7
            r18 = r6
            r19 = r5
            r20 = r4
            r21 = r2
            r22 = r1
            r23 = r14
            r24 = r9
            r25 = r0
            r26 = r11
            r15.ELb(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        L_0x0456:
            boolean r2 = r3 instanceof X.EJO
            if (r2 == 0) goto L_0x0487
            X.EJO r3 = (X.EJO) r3
            com.instagram.shopping.model.share.ShopShareInfo r5 = r3.A00
            java.lang.String r4 = r5.A03
            if (r42 != 0) goto L_0x0480
            java.lang.String r19 = "shops_messaging:storefront_social_share"
        L_0x0464:
            java.lang.String r3 = r5.A01
            if (r3 == 0) goto L_0x0033
            java.lang.String r2 = r5.A04
            r0 = 2131973748(0x7f135674, float:1.958454E38)
            java.lang.String r18 = r1.getString(r0)
            java.util.List r0 = r5.A06
            r15 = r4
            r16 = r3
            r17 = r2
            r20 = r0
            r21 = r11
            r12.EMh(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        L_0x0480:
            java.lang.String r2 = ":shops_messaging:storefront_social_share"
            java.lang.String r19 = X.002.A0R(r0, r2)
            goto L_0x0464
        L_0x0487:
            boolean r1 = r3 instanceof X.EJ6
            if (r1 == 0) goto L_0x04a4
            X.EJ6 r3 = (X.EJ6) r3
            com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo r0 = r3.A00
            java.lang.String r3 = r0.Amd()
            java.lang.String r4 = r0.Cmu()
            com.instagram.api.schemas.MessagingOffPlatformShareType r1 = r0.FH6()
            r0 = r12
            r2 = r13
            r5 = r14
            r6 = r9
            r7 = r11
            r0.EMP(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x04a4:
            boolean r1 = r3 instanceof X.EJ9
            if (r1 == 0) goto L_0x04bb
            X.EJ9 r3 = (X.EJ9) r3
            com.instagram.direct.fragment.prompts.dailyprompt.model.DailyPromptsShareInfo r0 = r3.A00
            java.lang.String r0 = r0.A05
            r1 = r12
            r2 = r20
            r3 = r13
            r4 = r0
            r5 = r2
            r6 = r14
            r7 = r9
            r8 = r11
            r1.EMP(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x04bb:
            boolean r1 = r3 instanceof X.EJN
            if (r1 == 0) goto L_0x0517
            X.EJN r3 = (X.EJN) r3
            com.instagram.shopping.model.collection.ProductCollectionShareInfo r6 = r3.A00
            java.lang.String r5 = r6.A08
            int r1 = r5.length()
            if (r1 == 0) goto L_0x0033
            if (r42 != 0) goto L_0x04f9
            java.lang.String r23 = "shops_messaging:collection_social_share"
        L_0x04cf:
            java.lang.String r4 = r6.A04
            java.lang.String r3 = r6.A06
            java.lang.String r2 = r6.A09
            if (r4 == 0) goto L_0x0033
            if (r3 == 0) goto L_0x0033
            java.lang.String r15 = r6.A07
            com.instagram.common.typedurl.ImageUrl r0 = r6.A01
            if (r0 == 0) goto L_0x04e3
            java.lang.String r20 = r0.getUrl()
        L_0x04e3:
            java.lang.String r1 = r6.A05
            java.lang.String r0 = r6.A03
            r22 = r0
            r24 = r11
            r16 = r4
            r17 = r3
            r18 = r5
            r19 = r2
            r21 = r1
            r12.EMi(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        L_0x04f9:
            java.lang.String r1 = ":shops_messaging:collection_social_share"
            java.lang.String r23 = X.002.A0R(r0, r1)
            goto L_0x04cf
        L_0x0500:
            java.lang.String r6 = "share_sheet_profile_card"
        L_0x0502:
            X.0wb.A04(r6, r10, r5)
            return
        L_0x0506:
            java.lang.String r0 = "share_sheet_story_share"
            goto L_0x050e
        L_0x0509:
            java.lang.String r0 = "share_sheet_felix_share"
            goto L_0x050e
        L_0x050c:
            java.lang.String r0 = "share_sheet_media_share"
        L_0x050e:
            X.0wb.A04(r0, r8, r5)
            return
        L_0x0512:
            java.lang.String r1 = "share_sheet_mediakit_share_xma"
            java.lang.String r0 = "MediaKitId to share is null"
            goto L_0x0572
        L_0x0517:
            boolean r1 = r3 instanceof X.EJB
            if (r1 == 0) goto L_0x054c
            if (r42 != 0) goto L_0x0540
            java.lang.String r21 = "ify:content_share"
        L_0x051f:
            X.EJB r3 = (X.EJB) r3
            com.instagram.model.direct.DirectIfyXma r2 = r3.A00
            if (r2 == 0) goto L_0x0547
            long r0 = r2.A00
            java.lang.Long r4 = r2.A02
            java.lang.String r3 = r2.A03
            X.EVp r2 = r2.A01
            r15 = r12
            r16 = r2
            r17 = r13
            r18 = r4
            r19 = r3
            r20 = r14
            r22 = r0
            r24 = r11
            r15.ELn(r16, r17, r18, r19, r20, r21, r22, r24)
            return
        L_0x0540:
            java.lang.String r1 = ":ify:content_share"
            java.lang.String r21 = X.002.A0R(r0, r1)
            goto L_0x051f
        L_0x0547:
            java.lang.String r1 = "share_sheet_ify_content_share"
            java.lang.String r0 = "Ify content is null"
            goto L_0x0572
        L_0x054c:
            boolean r1 = r3 instanceof X.EJI
            if (r1 == 0) goto L_0x0576
            X.EJI r3 = (X.EJI) r3
            java.lang.String r2 = r3.A00
            if (r42 != 0) goto L_0x0562
            java.lang.String r4 = "potato:content_share"
        L_0x0558:
            if (r2 == 0) goto L_0x0569
            r0 = r12
            r1 = r13
            r3 = r14
            r5 = r11
            r0.EML(r1, r2, r3, r4, r5)
            return
        L_0x0562:
            java.lang.String r1 = ":potato:content_share"
            java.lang.String r4 = X.002.A0R(r0, r1)
            goto L_0x0558
        L_0x0569:
            java.lang.String r1 = "potato_media_container_share"
            java.lang.String r0 = "Potato container id is null"
            goto L_0x0572
        L_0x056e:
            java.lang.String r1 = "share_sheet_subscription_share_xma"
            java.lang.String r0 = "Creator to share is null"
        L_0x0572:
            X.0wb.A04(r1, r0, r5)
            return
        L_0x0576:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Tried to share an unsupported message type: "
            r1.append(r0)
            X.2FW r0 = r3.A01
            java.lang.String r1 = X.AnonymousClass7TF.A0i(r0, r1)
            java.lang.String r0 = "share_sheet_invalid_type"
            X.0wb.A03(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EQ5.A00(android.content.Context, X.ExY, X.9cP, X.1Xj, com.instagram.model.direct.DirectShareTarget, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }
}
