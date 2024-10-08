package com.instagram.newsfeed.viewmodel;

import X.0rm;
import X.0sH;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C294645mn;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.newsfeed.viewmodel.ActivityFeedViewModel$getUiState$2", f = "ActivityFeedViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ActivityFeedViewModel$getUiState$2 extends AnonymousClass1Ek implements 0sH {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ C294645mn A05;
    public final /* synthetic */ ActivityFeedViewModel A06;
    public final /* synthetic */ 0rm A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityFeedViewModel$getUiState$2(C294645mn r2, ActivityFeedViewModel activityFeedViewModel, AnonymousClass4D7 r4, 0rm r5) {
        super(6, r4);
        this.A07 = r5;
        this.A06 = activityFeedViewModel;
        this.A05 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        0rm r3 = this.A07;
        ActivityFeedViewModel activityFeedViewModel = this.A06;
        ActivityFeedViewModel$getUiState$2 activityFeedViewModel$getUiState$2 = new ActivityFeedViewModel$getUiState$2(this.A05, activityFeedViewModel, (AnonymousClass4D7) obj6, r3);
        activityFeedViewModel$getUiState$2.A00 = obj;
        activityFeedViewModel$getUiState$2.A01 = obj2;
        activityFeedViewModel$getUiState$2.A02 = obj3;
        activityFeedViewModel$getUiState$2.A03 = obj4;
        activityFeedViewModel$getUiState$2.A04 = obj5;
        return activityFeedViewModel$getUiState$2.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00de, code lost:
        if (r10 == null) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e0, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e1, code lost:
        r3 = (X.AnonymousClass9IM) r1.A03;
        r1 = (X.AnonymousClass9IM) r1.A00;
        X.AnonymousClass7TF.A1H(r3, r1);
        r1 = new X.AnonymousClass5GQ(X.DdY.A00((X.C376619Ir) null, new X.JV5(r3, r1, r6), (X.C53380GnA) null, (X.C61008Jv7) null, r9, (java.lang.Integer) null, r7, (java.util.List) null, (java.util.List) null, 114685));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0202, code lost:
        if (java.lang.Boolean.TRUE.equals(r9.A04.A03) != false) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
        if ((r3 instanceof X.AnonymousClass5GR) != false) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x00e0 A[EDGE_INSN: B:249:0x00e0->B:42:0x00e0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r50) {
        /*
            r49 = this;
            X.0eS.A00(r50)
            r2 = r49
            java.lang.Object r1 = r2.A00
            X.5GP r1 = (X.AnonymousClass5GP) r1
            java.lang.Object r3 = r2.A01
            X.5GP r3 = (X.AnonymousClass5GP) r3
            java.lang.Object r0 = r2.A02
            r23 = r0
            r0 = r23
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            r23 = r0
            java.lang.Object r0 = r2.A03
            r27 = r0
            r0 = r27
            X.MfE r0 = (X.C66920MfE) r0
            r27 = r0
            java.lang.Object r5 = r2.A04
            X.MQ0 r5 = (X.MQ0) r5
            boolean r7 = r1 instanceof X.AnonymousClass5GQ
            r8 = 0
            if (r7 != 0) goto L_0x002e
            boolean r0 = r1 instanceof X.KWO
            if (r0 == 0) goto L_0x0032
        L_0x002e:
            X.0rm r0 = r2.A07
            r0.A00 = r8
        L_0x0032:
            com.instagram.newsfeed.viewmodel.ActivityFeedViewModel r4 = r2.A06
            boolean r0 = r1 instanceof X.AnonymousClass5GR
            r25 = 0
            if (r0 != 0) goto L_0x003f
            boolean r6 = r3 instanceof X.AnonymousClass5GR
            r0 = 0
            if (r6 == 0) goto L_0x0040
        L_0x003f:
            r0 = 1
        L_0x0040:
            r4.A02 = r0
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x0106
            if (r7 == 0) goto L_0x0106
            boolean r0 = r3 instanceof X.AnonymousClass5GQ
            if (r0 == 0) goto L_0x0106
            X.5GQ r1 = (X.AnonymousClass5GQ) r1
            java.lang.Object r9 = r1.A00
            X.DdY r9 = (X.DdY) r9
            X.5GQ r3 = (X.AnonymousClass5GQ) r3
            java.lang.Object r6 = r3.A00
            java.util.List r6 = (java.util.List) r6
            java.util.List r7 = r9.A0F
            int r0 = r7.size()
            java.util.ListIterator r3 = r7.listIterator(r0)
        L_0x0062:
            boolean r0 = r3.hasPrevious()
            r13 = 0
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r1 = r3.previous()
            r0 = r1
            X.5Gi r0 = (X.C283155Gi) r0
            long r10 = r0.A00()
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x0062
        L_0x0079:
            X.5Gi r1 = (X.C283155Gi) r1
            if (r1 == 0) goto L_0x0081
            long r13 = r1.A00()
        L_0x0081:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r6.iterator()
        L_0x0089:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r3 = r12.next()
            r0 = r3
            X.5Gi r0 = (X.C283155Gi) r0
            long r10 = r0.A00()
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x0089
            r1.add(r3)
            goto L_0x0089
        L_0x00a2:
            r1 = 0
            goto L_0x0079
        L_0x00a4:
            X.5mn r0 = r4.A00
            boolean r0 = r0 instanceof X.ENE
            if (r0 != 0) goto L_0x00b8
            java.util.ArrayList r3 = X.00k.A0S(r7, r1)
            r1 = 6
            X.Fw8 r0 = new X.Fw8
            r0.<init>(r1)
            java.util.List r7 = X.00k.A0g(r3, r0)
        L_0x00b8:
            X.JV5 r1 = r9.A02
            java.util.Iterator r11 = r6.iterator()
        L_0x00be:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00e0
            java.lang.Object r10 = r11.next()
            r6 = r10
            X.5Gi r6 = (X.C283155Gi) r6
            java.lang.String r3 = r6.A0D
            java.lang.String r0 = "new_stories"
            boolean r0 = r0.equals(r3)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00dd
            X.5Gl r0 = r6.A03
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x00be
        L_0x00dd:
            r6 = 1
            if (r10 != 0) goto L_0x00e1
        L_0x00e0:
            r6 = 0
        L_0x00e1:
            java.lang.Object r3 = r1.A03
            X.9IM r3 = (X.AnonymousClass9IM) r3
            java.lang.Object r1 = r1.A00
            X.9IM r1 = (X.AnonymousClass9IM) r1
            X.AnonymousClass7TF.A1H(r3, r1)
            X.JV5 r0 = new X.JV5
            r0.<init>((X.AnonymousClass9IM) r3, (X.AnonymousClass9IM) r1, (boolean) r6)
            r17 = 114685(0x1bffd, float:1.60708E-40)
            r10 = r8
            r11 = r8
            r12 = r9
            r13 = r8
            r14 = r7
            r15 = r8
            r16 = r8
            r9 = r0
            X.DdY r0 = X.DdY.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.5GQ r1 = new X.5GQ
            r1.<init>(r0)
        L_0x0106:
            X.0rm r0 = r2.A07
            java.lang.Object r0 = r0.A00
            X.DdY r0 = (X.DdY) r0
            if (r0 != 0) goto L_0x017d
            java.lang.Object r0 = r1.A00()
            X.DdY r0 = (X.DdY) r0
            if (r0 != 0) goto L_0x017d
            X.62M r6 = X.AnonymousClass62M.A01
            r7 = 2147483647(0x7fffffff, float:NaN)
            X.DdH r3 = new X.DdH
            r5 = r3
            r8 = r25
            r9 = r8
            r10 = r8
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x0125:
            com.instagram.newsfeed.data.ActivityFeedRepository r6 = r4.A08
            boolean r2 = r3.A02
            r5 = r2 ^ 1
            X.4HS r2 = r6.A02
            r6 = r5 ^ 1
            X.1Av r2 = r2.A02
            X.0xY r5 = X.AnonymousClass7TE.A0p(r2)
            java.lang.String r2 = "notification_feed_is_304_disabled"
            r5.E5T(r2, r6)
            r5.apply()
            com.instagram.common.session.UserSession r6 = r4.A04
            X.0Tu r2 = X.0Tu.A05
            r4 = 36321980076533628(0x810aa60000277c, double:3.0335046850496855E-306)
            boolean r2 = X.182.A06(r2, r6, r4)
            r12 = 0
            if (r2 == 0) goto L_0x0157
            if (r0 == 0) goto L_0x0157
            java.util.List r2 = r0.A0H
            if (r2 == 0) goto L_0x0157
            X.62P r12 = X.AnonymousClass62Q.A00(r2)
        L_0x0157:
            X.62P r7 = r3.A01
            r2 = r27
            int r6 = r2.A01
            if (r0 == 0) goto L_0x0165
            X.9Ir r0 = r0.A01
            if (r0 == 0) goto L_0x0165
            r25 = 1
        L_0x0165:
            boolean r5 = r3.A03
            int r4 = r3.A00
            r3 = 1
            X.JV2 r2 = new X.JV2
            r0 = r25
            r2.<init>(r4, r3, r0, r5)
            X.JV1 r8 = new X.JV1
            r9 = r2
            r10 = r1
            r11 = r23
            r13 = r7
            r14 = r6
            r8.<init>((X.JV2) r9, (X.AnonymousClass5GP) r10, (java.util.Set) r11, (X.AnonymousClass62P) r12, (X.AnonymousClass62P) r13, (int) r14)
            return r8
        L_0x017d:
            X.5mn r3 = r2.A05
            com.instagram.common.session.UserSession r2 = r4.A04
            r36 = r2
            android.app.Application r35 = r4.A0D()
            com.instagram.repository.common.FeedPagedData r2 = r4.A01
            java.lang.Object r2 = r2.A00
            boolean r34 = X.AnonymousClass7TF.A1V(r2)
            boolean r2 = r1 instanceof X.KWO
            r48 = r2
            boolean r2 = r3 instanceof X.ENE
            r33 = r2 ^ 1
            r2 = r27
            boolean r2 = r2.A02
            r32 = r2
            boolean r2 = r4.A0H
            r38 = r2
            boolean r2 = r4.A0G
            r31 = r2
            X.9I4 r2 = r0.A00
            boolean r2 = r2.A00
            r30 = r2
            X.9Ir r10 = r0.A01
            if (r10 == 0) goto L_0x020b
            int r2 = r10.A01
            r29 = r2
        L_0x01b3:
            r28 = 1
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            long r6 = X.DbZ.A08(r2)
            double r2 = (double) r6
            r6 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r6
            r6 = r28
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0q(r5, r6)
            java.util.List r8 = r0.A0I
            java.util.List r7 = r0.A0E
            java.util.ArrayList r8 = X.00k.A0S(r7, r8)
            java.util.List r7 = r0.A0G
            r47 = r7
            java.util.ArrayList r26 = X.00k.A0S(r7, r8)
            java.util.Iterator r11 = r26.iterator()
            r40 = 0
            r24 = 0
        L_0x01e2:
            boolean r7 = r11.hasNext()
            if (r7 == 0) goto L_0x020f
            java.lang.Object r9 = r11.next()
            X.5Gi r9 = (X.C283155Gi) r9
            boolean r7 = r9.A0H()
            if (r7 == 0) goto L_0x01e2
            if (r40 != 0) goto L_0x0204
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            X.5Gj r7 = r9.A04
            java.lang.Boolean r7 = r7.A03
            boolean r7 = r8.equals(r7)
            r40 = 0
            if (r7 == 0) goto L_0x0206
        L_0x0204:
            r40 = 1
        L_0x0206:
            if (r31 == 0) goto L_0x01e2
            r24 = r9
            goto L_0x01e2
        L_0x020b:
            r29 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x01b3
        L_0x020f:
            java.util.List r7 = r0.A0B
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r7.iterator()
        L_0x0219:
            boolean r7 = r8.hasNext()
            if (r7 == 0) goto L_0x0233
            java.lang.Object r7 = r8.next()
            X.5Gi r7 = (X.C283155Gi) r7
            r37 = r7
            r39 = r31
            X.GQo r7 = X.DdI.A00(r35, r36, r37, r38, r39, r40)
            if (r7 == 0) goto L_0x0219
            r14.add(r7)
            goto L_0x0219
        L_0x0233:
            java.util.List r7 = r0.A0D
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r7.iterator()
        L_0x023d:
            boolean r7 = r8.hasNext()
            if (r7 == 0) goto L_0x0257
            java.lang.Object r7 = r8.next()
            X.5Gi r7 = (X.C283155Gi) r7
            r37 = r7
            r39 = r31
            X.GQo r7 = X.DdI.A00(r35, r36, r37, r38, r39, r40)
            if (r7 == 0) goto L_0x023d
            r13.add(r7)
            goto L_0x023d
        L_0x0257:
            java.lang.String r9 = r0.A0A
            if (r9 == 0) goto L_0x026d
            int r7 = r9.length()
            if (r7 <= 0) goto L_0x026d
            int r8 = r6.size()
            X.HCH r7 = new X.HCH
            r7.<init>(r9, r8)
            r6.add(r7)
        L_0x026d:
            X.BBV r9 = r0.A03
            if (r9 == 0) goto L_0x027d
            int r8 = r6.size()
            X.HCI r7 = new X.HCI
            r7.<init>(r9, r8)
            r6.add(r7)
        L_0x027d:
            int r12 = r14.size()
            r11 = 0
        L_0x0282:
            if (r11 >= r12) goto L_0x0299
            java.lang.Object r9 = r14.get(r11)
            X.GQo r9 = (X.C52389GQo) r9
            int r8 = r6.size()
            X.GQn r7 = new X.GQn
            r7.<init>(r9, r8)
            r6.add(r7)
            int r11 = r11 + 1
            goto L_0x0282
        L_0x0299:
            X.GRr r9 = r0.A07
            boolean r7 = X.DdM.A00(r36)
            if (r7 != 0) goto L_0x02e3
            if (r9 == 0) goto L_0x02b7
            boolean r8 = r9.BB2()
            r7 = r28
            if (r8 != r7) goto L_0x02b7
        L_0x02ab:
            int r8 = r6.size()
            X.GST r7 = new X.GST
            r7.<init>(r9, r8)
            r6.add(r7)
        L_0x02b7:
            X.GSP r9 = r0.A08
            if (r9 == 0) goto L_0x02c7
            int r8 = r6.size()
            X.GSO r7 = new X.GSO
            r7.<init>(r9, r8)
            r6.add(r7)
        L_0x02c7:
            int r12 = r13.size()
            r11 = 0
        L_0x02cc:
            if (r11 >= r12) goto L_0x02e6
            java.lang.Object r9 = r13.get(r11)
            X.GQo r9 = (X.C52389GQo) r9
            int r8 = r6.size()
            X.GQn r7 = new X.GQn
            r7.<init>(r9, r8)
            r6.add(r7)
            int r11 = r11 + 1
            goto L_0x02cc
        L_0x02e3:
            if (r9 == 0) goto L_0x02b7
            goto L_0x02ab
        L_0x02e6:
            X.GSY r11 = r0.A05
            if (r11 == 0) goto L_0x030f
            java.lang.Object r7 = r11.A01
            java.util.List r7 = (java.util.List) r7
            boolean r7 = X.AnonymousClass7TE.A1b(r7)
            if (r7 == 0) goto L_0x030f
            r9 = 2131974452(0x7f135934, float:1.9585968E38)
            int r8 = r6.size()
            X.GR0 r7 = new X.GR0
            r7.<init>(r9, r8)
            r6.add(r7)
            int r8 = r6.size()
            X.GSV r7 = new X.GSV
            r7.<init>(r11, r8)
            r6.add(r7)
        L_0x030f:
            java.util.LinkedHashSet r21 = X.DbS.A0y()
            java.util.Iterator r20 = r26.iterator()
            java.lang.String r19 = ""
            r13 = r19
            r9 = 0
            r37 = -1
            r22 = 0
            r39 = 0
        L_0x0322:
            boolean r7 = r20.hasNext()
            if (r7 == 0) goto L_0x0502
            int r9 = r9 + 1
            java.lang.Object r8 = r20.next()
            X.5Gi r8 = (X.C283155Gi) r8
            r7 = r25
            X.0qQ.A0B(r8, r7)
            java.lang.Double r7 = r8.A05()
            if (r7 == 0) goto L_0x0347
            double r16 = r7.doubleValue()
            int r7 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x04d1
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
        L_0x0345:
            r8.A06 = r7
        L_0x0347:
            r41 = r35
            r42 = r36
            r43 = r8
            r44 = r38
            r45 = r31
            r46 = r40
            X.GQo r18 = X.DdI.A00(r41, r42, r43, r44, r45, r46)
            if (r18 == 0) goto L_0x0322
            java.lang.String r11 = r8.A0D
            java.lang.String r7 = "priority_stories"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x047b
            X.DfA r11 = X.C46517DgK.A04
        L_0x0365:
            java.lang.String r12 = r8.A0D
            java.lang.String r7 = "new_stories"
            boolean r7 = r7.equals(r12)
            if (r7 != 0) goto L_0x0375
            boolean r7 = r8.A0H()
            if (r7 == 0) goto L_0x0377
        L_0x0375:
            r39 = 1
        L_0x0377:
            if (r22 != 0) goto L_0x03fa
            java.lang.String r7 = "old_stories"
            boolean r7 = r7.equals(r12)
            if (r7 == 0) goto L_0x03fa
            boolean r7 = r8.A0H()
            if (r7 != 0) goto L_0x03fa
            if (r24 == 0) goto L_0x0393
            r7 = r24
            java.lang.String r7 = r7.A09
            boolean r7 = X.0qQ.A0K(r13, r7)
            if (r7 == 0) goto L_0x03fa
        L_0x0393:
            X.0BQ r13 = X.AnonymousClass0BO.A00(r36)
            X.0eE r12 = X.AnonymousClass0t1.A01
            r7 = r36
            com.instagram.user.model.User r7 = r12.A01(r7)
            java.util.List r7 = r13.BO1(r7)
            java.util.Iterator r17 = r7.iterator()
            r14 = 0
            r16 = 0
        L_0x03aa:
            boolean r7 = r17.hasNext()
            if (r7 == 0) goto L_0x03de
            java.lang.Object r13 = r17.next()
            com.instagram.user.model.User r13 = (com.instagram.user.model.User) r13
            int r12 = r13.A02()
            if (r12 == 0) goto L_0x03aa
            java.util.Map r7 = r13.A05
            com.google.common.collect.ImmutableMap r15 = com.google.common.collect.ImmutableMap.copyOf(r7)
            X.0qQ.A07(r15)
            X.2aD r7 = X.2aD.A0I
            java.lang.Object r7 = r15.get(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            if (r7 == 0) goto L_0x03dc
            int r7 = r7.intValue()
        L_0x03d3:
            int r12 = r12 - r7
            r7 = r16
            if (r12 <= r7) goto L_0x03aa
            r14 = r13
            r16 = r12
            goto L_0x03aa
        L_0x03dc:
            r7 = 0
            goto L_0x03d3
        L_0x03de:
            if (r14 == 0) goto L_0x03f8
            boolean r7 = r47.isEmpty()
            r7 = r7 ^ 1
            if (r7 == 0) goto L_0x03f8
            boolean r7 = r0.A0L
            if (r7 != 0) goto L_0x03f8
            int r12 = r6.size()
            X.GRd r7 = new X.GRd
            r7.<init>(r14, r12)
            r6.add(r7)
        L_0x03f8:
            r22 = 1
        L_0x03fa:
            if (r11 == 0) goto L_0x042a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            int r7 = r11.A05
            r12.append(r7)
            java.lang.String r7 = "::"
            r12.append(r7)
            java.lang.CharSequence r7 = r11.A0E
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            r7 = r21
            boolean r7 = r7.add(r12)
            if (r7 == 0) goto L_0x042a
            int r12 = r11.A05
            int r11 = r6.size()
            X.GR0 r7 = new X.GR0
            r7.<init>(r12, r11)
            r6.add(r7)
        L_0x042a:
            int r12 = r6.size()
            X.GQn r11 = new X.GQn
            r7 = r18
            r11.<init>(r7, r12)
            r6.add(r11)
            r7 = r29
            if (r9 != r7) goto L_0x0477
            int r37 = r6.size()
            if (r32 != 0) goto L_0x0477
            int r3 = r26.size()
            if (r3 > r7) goto L_0x044a
            if (r34 == 0) goto L_0x0473
        L_0x044a:
            if (r10 == 0) goto L_0x0450
            java.lang.String r10 = r10.A02
            if (r10 != 0) goto L_0x0459
        L_0x0450:
            r3 = 2131975546(0x7f135d7a, float:1.9588187E38)
            r2 = r35
            java.lang.String r10 = X.AnonymousClass7TE.A16(r2, r3)
        L_0x0459:
            java.lang.String r11 = r8.A0D
            if (r11 != 0) goto L_0x045f
            r11 = r19
        L_0x045f:
            java.lang.Integer r2 = r8.A06
            int r12 = r26.size()
            int r12 = r12 - r9
            int r13 = r6.size()
            X.GS2 r9 = new X.GS2
            r14 = r2
            r9.<init>(r10, r11, r12, r13, r14)
            r6.add(r9)
        L_0x0473:
            r38 = 1
            goto L_0x0504
        L_0x0477:
            java.lang.String r13 = r8.A09
            goto L_0x0322
        L_0x047b:
            java.lang.String r7 = "new_stories"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x0489
            if (r30 == 0) goto L_0x0489
            X.DfA r11 = X.C46517DgK.A02
            goto L_0x0365
        L_0x0489:
            if (r33 == 0) goto L_0x04ce
            java.lang.Double r7 = r8.A05()
            if (r7 == 0) goto L_0x04ce
            double r16 = r7.doubleValue()
            int r7 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x049d
            X.DfA r11 = X.C46517DgK.A05
            goto L_0x0365
        L_0x049d:
            r14 = 4680673776000565248(0x40f5180000000000, double:86400.0)
            double r11 = r2 - r14
            int r7 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x04ac
            X.DfA r11 = X.C46517DgK.A06
            goto L_0x0365
        L_0x04ac:
            r14 = 4692649656650301440(0x411fa40000000000, double:518400.0)
            double r11 = r2 - r14
            int r7 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x04bb
            X.DfA r11 = X.C46517DgK.A00
            goto L_0x0365
        L_0x04bb:
            r14 = 4702635146375856128(0x41431dc000000000, double:2505600.0)
            double r11 = r2 - r14
            int r7 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x04ca
            X.DfA r11 = X.C46517DgK.A01
            goto L_0x0365
        L_0x04ca:
            X.DfA r11 = X.C46517DgK.A03
            goto L_0x0365
        L_0x04ce:
            r11 = 0
            goto L_0x0365
        L_0x04d1:
            r14 = 4680673776000565248(0x40f5180000000000, double:86400.0)
            double r11 = r2 - r14
            int r7 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x04e0
            java.lang.Integer r7 = X.AnonymousClass05K.A0N
            goto L_0x0345
        L_0x04e0:
            r14 = 4692649656650301440(0x411fa40000000000, double:518400.0)
            double r11 = r2 - r14
            int r7 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x04ef
            java.lang.Integer r7 = X.AnonymousClass05K.A0Y
            goto L_0x0345
        L_0x04ef:
            r14 = 4702635146375856128(0x41431dc000000000, double:2505600.0)
            double r11 = r2 - r14
            int r7 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x04fe
            java.lang.Integer r7 = X.AnonymousClass05K.A0j
            goto L_0x0345
        L_0x04fe:
            java.lang.Integer r7 = X.AnonymousClass05K.A0u
            goto L_0x0345
        L_0x0502:
            r38 = 0
        L_0x0504:
            if (r34 == 0) goto L_0x0523
            if (r38 != 0) goto L_0x0523
            int r5 = r6.size()
            X.GRB r3 = new X.GRB
            r2 = r48
            r3.<init>(r2, r5)
        L_0x0513:
            r6.add(r3)
        L_0x0516:
            X.62P r36 = X.AnonymousClass62Q.A00(r6)
            X.DdH r3 = new X.DdH
            r35 = r3
            r35.<init>(r36, r37, r38, r39, r40)
            goto L_0x0125
        L_0x0523:
            java.util.List r8 = r0.A0J
            boolean r2 = X.AnonymousClass7TE.A1b(r8)
            if (r2 == 0) goto L_0x055c
            r5 = 2131974681(0x7f135a19, float:1.9586433E38)
            int r3 = r6.size()
            X.GR0 r2 = new X.GR0
            r2.<init>(r5, r3)
            r6.add(r2)
            int r9 = r8.size()
            r7 = 0
        L_0x053f:
            if (r7 >= r9) goto L_0x05c8
            java.lang.Object r3 = r8.get(r7)
            X.3UL r3 = (X.AnonymousClass3UL) r3
            r2 = r36
            X.GRz r5 = X.DdP.A00(r2, r3)
            int r3 = r6.size()
            X.GS0 r2 = new X.GS0
            r2.<init>(r5, r3)
            r6.add(r2)
            int r7 = r7 + 1
            goto L_0x053f
        L_0x055c:
            r2 = r25
            boolean r2 = X.C59678JTj.A01(r2, r5)
            if (r2 != 0) goto L_0x0516
            X.JUj r2 = X.C59702JUj.A00
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0576
            int r2 = r6.size()
            X.HCG r3 = new X.HCG
            r3.<init>(r2)
            goto L_0x0513
        L_0x0576:
            r2 = r28
            boolean r2 = X.C59678JTj.A01(r2, r5)
            if (r2 == 0) goto L_0x05d3
            X.JTj r5 = (X.C59678JTj) r5
            java.lang.Object r8 = r5.A01
            java.util.List r8 = (java.util.List) r8
            boolean r2 = X.AnonymousClass7TE.A1b(r8)
            if (r2 == 0) goto L_0x0516
            r5 = 2131974681(0x7f135a19, float:1.9586433E38)
            int r3 = r6.size()
            X.GR0 r2 = new X.GR0
            r2.<init>(r5, r3)
            r6.add(r2)
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r8)
            java.util.Iterator r8 = r8.iterator()
        L_0x05a1:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x05c8
            java.lang.Object r3 = r8.next()
            X.FnT r3 = (X.C51037FnT) r3
            r2 = r36
            X.GRz r5 = X.DdP.A00(r2, r3)
            int r3 = r6.size()
            X.GS0 r2 = new X.GS0
            r2.<init>(r5, r3)
            boolean r2 = r6.add(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r7.add(r2)
            goto L_0x05a1
        L_0x05c8:
            int r2 = r6.size()
            X.GSF r3 = new X.GSF
            r3.<init>(r2)
            goto L_0x0513
        L_0x05d3:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.viewmodel.ActivityFeedViewModel$getUiState$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
