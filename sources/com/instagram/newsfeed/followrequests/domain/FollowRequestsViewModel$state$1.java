package com.instagram.newsfeed.followrequests.domain;

import X.0sI;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C47539E7c;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.newsfeed.followrequests.domain.FollowRequestsViewModel$state$1", f = "FollowRequestsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FollowRequestsViewModel$state$1 extends AnonymousClass1Ek implements 0sI {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ boolean A03;
    public final /* synthetic */ C47539E7c A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowRequestsViewModel$state$1(C47539E7c e7c, AnonymousClass4D7 r3) {
        super(5, r3);
        this.A04 = e7c;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean A1a = AnonymousClass7TE.A1a(obj2);
        FollowRequestsViewModel$state$1 followRequestsViewModel$state$1 = new FollowRequestsViewModel$state$1(this.A04, (AnonymousClass4D7) obj5);
        followRequestsViewModel$state$1.A00 = obj;
        followRequestsViewModel$state$1.A03 = A1a;
        followRequestsViewModel$state$1.A01 = obj3;
        followRequestsViewModel$state$1.A02 = obj4;
        return followRequestsViewModel$state$1.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x026b, code lost:
        if (r5 == com.instagram.user.model.FollowStatus.A05) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        if (r7 < r1) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0122, code lost:
        if (X.182.A06(X.0Tu.A05, r10.A01, 36319527650205138L) == false) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0147, code lost:
        if (X.182.A06(X.0Tu.A05, r10.A01, 36319750988504681L) != false) goto L_0x0149;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r47) {
        /*
            r46 = this;
            X.0eS.A00(r47)
            r1 = r46
            java.lang.Object r0 = r1.A00
            X.Drl r0 = (X.C47170Drl) r0
            boolean r7 = r1.A03
            java.lang.Object r11 = r1.A01
            java.util.Set r11 = (java.util.Set) r11
            java.lang.Object r4 = r1.A02
            X.4UC r4 = (X.AnonymousClass4UC) r4
            X.E7c r3 = r1.A04
            X.E7b r10 = r3.A02
            r6 = 0
            X.0qQ.A0B(r0, r6)
            r10.A00 = r0
            boolean r2 = r3.A0B
            boolean r9 = r3.A0H
            boolean r8 = r3.A0G
            boolean r1 = r3.A0F
            r21 = r1
            boolean r5 = r3.A0E
            X.EuK r12 = r0.A04
            X.ENI r1 = X.ENI.A00
            boolean r1 = X.0qQ.A0K(r12, r1)
            if (r1 == 0) goto L_0x003d
            X.Luj r2 = X.C65520Luj.A00
        L_0x0035:
            X.62M r0 = X.AnonymousClass62M.A01
            X.LMY r1 = new X.LMY
            r1.<init>(r2, r0, r6)
            return r1
        L_0x003d:
            boolean r1 = r12 instanceof X.ENH
            if (r1 == 0) goto L_0x0044
            X.Lui r2 = X.C65519Lui.A00
            goto L_0x0035
        L_0x0044:
            boolean r1 = r12 instanceof X.ENG
            if (r1 == 0) goto L_0x01f8
            X.Luh r20 = X.C65518Luh.A00
            if (r2 == 0) goto L_0x01f0
            if (r7 != 0) goto L_0x01f0
            java.util.List r15 = r0.A05
            int r1 = r15.size()
            int r7 = r0.A00
            if (r7 < 0) goto L_0x01f0
            if (r7 >= r1) goto L_0x01f0
        L_0x005a:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            if (r4 == 0) goto L_0x0068
            X.Dtp r2 = new X.Dtp
            r2.<init>((X.AnonymousClass4UC) r4)
            r1.add(r2)
        L_0x0068:
            if (r5 == 0) goto L_0x006f
            X.Fev r2 = X.C50586Fev.A00
            r1.add(r2)
        L_0x006f:
            boolean r2 = r15.isEmpty()
            r41 = 0
            if (r2 == 0) goto L_0x00be
            r5 = 2131962574(0x7f132ace, float:1.9561877E38)
            r4 = 2131962573(0x7f132acd, float:1.9561875E38)
            if (r9 == 0) goto L_0x0085
            r5 = 2131962571(0x7f132acb, float:1.956187E38)
            r4 = 2131962570(0x7f132aca, float:1.9561869E38)
        L_0x0085:
            X.GqL r2 = new X.GqL
            r2.<init>(r5, r4)
            r1.add(r2)
        L_0x008d:
            if (r8 != 0) goto L_0x009b
            if (r21 == 0) goto L_0x009b
            int r4 = r0.A02
            X.GqM r2 = new X.GqM
            r2.<init>(r4, r6)
            r1.add(r2)
        L_0x009b:
            java.util.List r0 = r0.A06
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r0.iterator()
        L_0x00a5:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x020a
            java.lang.Object r2 = r5.next()
            r0 = r2
            X.3UL r0 = (X.AnonymousClass3UL) r0
            com.instagram.user.model.User r0 = r0.A03
            boolean r0 = X.DbV.A1a(r0, r11)
            if (r0 != 0) goto L_0x00a5
            r4.add(r2)
            goto L_0x00a5
        L_0x00be:
            if (r8 == 0) goto L_0x00da
            boolean r4 = r3.A0D
            X.Dto r2 = new X.Dto
            r2.<init>(r4)
            r1.add(r2)
            X.Fey r2 = X.C50589Fey.A00
            r1.add(r2)
            int r5 = r0.A03
            r4 = 1
            X.GqM r2 = new X.GqM
            r2.<init>(r5, r4)
            r1.add(r2)
        L_0x00da:
            if (r9 == 0) goto L_0x00e1
            X.Fex r2 = X.C50588Fex.A00
            r1.add(r2)
        L_0x00e1:
            java.util.List r2 = X.00k.A0d(r15, r7)
            java.util.ArrayList r14 = X.AnonymousClass7TF.A0p(r2)
            java.util.Iterator r19 = r2.iterator()
            r36 = 0
        L_0x00ef:
            boolean r2 = r19.hasNext()
            if (r2 == 0) goto L_0x01c6
            java.lang.Object r2 = r19.next()
            int r18 = r36 + 1
            if (r36 < 0) goto L_0x0311
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            boolean r4 = r3.A0C
            r17 = r4
            X.0qQ.A0B(r2, r6)
            X.4Cl r4 = r2.A03
            java.lang.Boolean r4 = r4.CZS()
            r9 = 1
            boolean r4 = X.AnonymousClass7TF.A1Y(r4, r9)
            if (r4 == 0) goto L_0x0124
            com.instagram.common.session.UserSession r13 = r10.A01
            X.0Tu r12 = X.0Tu.A05
            r4 = 36319527650205138(0x81086b00001dd2, double:3.03195376076442E-306)
            boolean r4 = X.182.A06(r12, r13, r4)
            r16 = 1
            if (r4 != 0) goto L_0x0126
        L_0x0124:
            r16 = 0
        L_0x0126:
            X.4Cl r4 = r2.A03
            X.4s9 r4 = r4.CZP()
            if (r4 == 0) goto L_0x01c4
            X.4s7 r4 = r4.CZQ()
            if (r4 == 0) goto L_0x01c4
            boolean r4 = r4.Cdm()
            if (r4 != r9) goto L_0x01c4
            com.instagram.common.session.UserSession r13 = r10.A01
            X.0Tu r12 = X.0Tu.A05
            r4 = 36319750988504681(0x81089f00001e69, double:3.0320950008043624E-306)
            boolean r4 = X.182.A06(r12, r13, r4)
            if (r4 == 0) goto L_0x01c4
        L_0x0149:
            java.lang.String r28 = X.DbU.A0p(r2)
            X.0qQ.A07(r28)
            java.lang.String r29 = r2.getUsername()
            java.lang.String r30 = r2.getFullName()
            if (r30 != 0) goto L_0x015c
            java.lang.String r30 = ""
        L_0x015c:
            java.lang.String r31 = X.DbS.A0o(r2)
            java.lang.String r32 = r2.getId()
            X.4Cl r4 = r2.A03
            java.lang.String r33 = r4.BwX()
            X.4Cl r4 = r2.A03
            X.4s3 r4 = r4.AY0()
            r35 = 0
            if (r4 == 0) goto L_0x01c1
            java.lang.String r34 = r4.BAR()
        L_0x0178:
            java.lang.Integer r26 = X.C49012Eno.A00(r2)
            if (r17 != 0) goto L_0x01be
            r4 = 2131956481(0x7f131301, float:1.9549519E38)
            java.lang.Integer r27 = java.lang.Integer.valueOf(r4)
        L_0x0185:
            boolean r37 = r2.CPm()
            boolean r38 = r2.A2D()
            boolean r39 = X.C308436Ug.A02(r2)
            boolean r40 = r2.isVerified()
            X.4Cl r4 = r2.A03
            X.4s3 r4 = r4.AY0()
            if (r4 == 0) goto L_0x01a1
            java.lang.String r35 = r4.Aq2()
        L_0x01a1:
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r16)
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r9)
            X.GmF r4 = new X.GmF
            r22 = r4
            r23 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            X.Dtp r2 = new X.Dtp
            r2.<init>((X.C53329GmF) r4)
            r14.add(r2)
            r36 = r18
            goto L_0x00ef
        L_0x01be:
            r27 = r35
            goto L_0x0185
        L_0x01c1:
            r34 = r35
            goto L_0x0178
        L_0x01c4:
            r9 = 0
            goto L_0x0149
        L_0x01c6:
            X.018.A16(r14, r1)
            int r4 = r0.A01
            if (r7 >= r4) goto L_0x008d
            X.05G r2 = r3.A08
            boolean r2 = X.DbX.A1b(r2)
            if (r2 == 0) goto L_0x01e0
            r2 = r8 ^ 1
            if (r2 == 0) goto L_0x01e0
            X.Few r4 = X.C50587Few.A00
        L_0x01db:
            r1.add(r4)
            goto L_0x008d
        L_0x01e0:
            r2 = r8 ^ 1
            if (r2 == 0) goto L_0x01eb
            r2 = 0
        L_0x01e5:
            X.Dtp r4 = new X.Dtp
            r4.<init>((java.lang.Integer) r2)
            goto L_0x01db
        L_0x01eb:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            goto L_0x01e5
        L_0x01f0:
            java.util.List r15 = r0.A05
            int r7 = r15.size()
            goto L_0x005a
        L_0x01f8:
            boolean r0 = r12 instanceof X.ENF
            if (r0 == 0) goto L_0x0319
            r1 = 8
            X.FyD r0 = new X.FyD
            r0.<init>(r3, r1)
            X.Ff1 r2 = new X.Ff1
            r2.<init>(r0)
            goto L_0x0035
        L_0x020a:
            boolean r0 = X.AnonymousClass7TE.A1b(r4)
            if (r0 == 0) goto L_0x02e5
            X.Fez r0 = X.C50590Fez.A00
            r1.add(r0)
            java.util.HashSet r7 = X.AnonymousClass7TE.A1F()
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r4.iterator()
        L_0x0221:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x023e
            java.lang.Object r2 = r4.next()
            r0 = r2
            X.3UL r0 = (X.AnonymousClass3UL) r0
            com.instagram.user.model.User r0 = r0.A03
            java.lang.String r0 = r0.getId()
            boolean r0 = r7.add(r0)
            if (r0 == 0) goto L_0x0221
            r5.add(r2)
            goto L_0x0221
        L_0x023e:
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r5)
            java.util.Iterator r10 = r5.iterator()
        L_0x0246:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x02dd
            java.lang.Object r2 = r10.next()
            int r9 = r41 + 1
            if (r41 < 0) goto L_0x0311
            X.3UM r2 = (X.AnonymousClass3UM) r2
            X.E7a r7 = r3.A04
            X.0qQ.A0B(r2, r6)
            com.instagram.user.model.User r8 = r2.CCd()
            com.instagram.user.model.FollowStatus r5 = r8.B6o()
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A07
            if (r5 == r0) goto L_0x026d
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
            r42 = 1
            if (r5 != r0) goto L_0x026f
        L_0x026d:
            r42 = 0
        L_0x026f:
            java.lang.String r35 = X.DbU.A0p(r8)
            X.0qQ.A07(r35)
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x02d4
            java.lang.String r36 = r8.B8Q()
            r37 = 0
        L_0x0280:
            java.lang.String r38 = r2.BxN()
            r39 = 0
            if (r0 == 0) goto L_0x029a
            com.google.common.collect.ImmutableList r5 = r2.getSocialContextFacepileUsers()
            if (r5 == 0) goto L_0x029a
            java.lang.Object r5 = X.00k.A0O(r5, r6)
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            if (r5 == 0) goto L_0x029a
            java.lang.String r39 = X.DbU.A0p(r5)
        L_0x029a:
            r7 = 1
            r40 = 0
            if (r0 == 0) goto L_0x02b1
            com.google.common.collect.ImmutableList r5 = r2.getSocialContextFacepileUsers()
            if (r5 == 0) goto L_0x02b1
            java.lang.Object r5 = X.00k.A0O(r5, r7)
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            if (r5 == 0) goto L_0x02b1
            java.lang.String r40 = X.DbU.A0p(r5)
        L_0x02b1:
            java.lang.Integer r34 = X.C49012Eno.A00(r8)
            boolean r44 = X.C308436Ug.A02(r8)
            boolean r45 = r8.isVerified()
            X.GmA r5 = new X.GmA
            r32 = r5
            r33 = r2
            r43 = r0
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            X.Dtp r0 = new X.Dtp
            r0.<init>((X.C53324GmA) r5)
            r4.add(r0)
            r41 = r9
            goto L_0x0246
        L_0x02d4:
            java.lang.String r36 = r8.getUsername()
            java.lang.String r37 = r8.getFullName()
            goto L_0x0280
        L_0x02dd:
            X.018.A16(r4, r1)
            X.Ff0 r0 = X.C50591Ff0.A00
            r1.add(r0)
        L_0x02e5:
            X.62P r2 = X.AnonymousClass62Q.A00(r1)
            boolean r0 = r15 instanceof java.util.Collection
            if (r0 == 0) goto L_0x02fb
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x02fb
        L_0x02f3:
            X.LMY r1 = new X.LMY
            r0 = r20
            r1.<init>(r0, r2, r6)
            return r1
        L_0x02fb:
            java.util.Iterator r1 = r15.iterator()
        L_0x02ff:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02f3
            com.instagram.user.model.User r0 = X.DbT.A0k(r1)
            boolean r0 = r0.A2D()
            if (r0 == 0) goto L_0x02ff
            r6 = 1
            goto L_0x02f3
        L_0x0311:
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0319:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.followrequests.domain.FollowRequestsViewModel$state$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
