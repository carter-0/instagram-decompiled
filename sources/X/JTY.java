package X;

import com.instagram.mainfeed.network.FeedCacheCoordinator;

public final class JTY extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JTY(1UO r2, FeedCacheCoordinator feedCacheCoordinator, AnonymousClass4D7 r4, boolean z) {
        super(2, r4);
        this.A04 = 2;
        this.A05 = feedCacheCoordinator;
        this.A01 = r2;
        this.A06 = z;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.JTY, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.JTY, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.JTY, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r13) {
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z;
        Object obj5;
        int i;
        AnonymousClass4D7 r8 = r13;
        switch (this.A04) {
            case 0:
                obj3 = this.A03;
                obj4 = this.A02;
                obj2 = this.A05;
                z = this.A06;
                obj5 = this.A01;
                i = 0;
                break;
            case 1:
                z = this.A06;
                obj2 = this.A05;
                obj5 = this.A01;
                obj3 = this.A03;
                obj4 = this.A02;
                i = 1;
                break;
            case 2:
                return new JTY((1UO) this.A01, (FeedCacheCoordinator) this.A05, r13, this.A06);
            case 3:
                obj3 = this.A03;
                obj5 = this.A01;
                obj2 = this.A05;
                z = this.A06;
                obj4 = this.A02;
                i = 3;
                break;
            case 4:
                ? jty = new JTY((C60292Jip) this.A05, r13, this.A06);
                jty.A01 = obj;
                return jty;
            case 5:
                obj2 = this.A05;
                obj3 = this.A03;
                obj4 = this.A02;
                z = this.A06;
                obj5 = this.A01;
                i = 5;
                break;
            default:
                obj2 = this.A05;
                z = this.A06;
                obj4 = this.A02;
                obj5 = this.A01;
                obj3 = this.A03;
                i = 6;
                break;
        }
        return new JTY(obj3, obj4, obj2, obj5, r8, i, z);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.JTY, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0134, code lost:
        r4 = new X.C59674JTf(r5, r6, r7, r8, r9);
        r11.A00 = r3;
        r1 = X.AnonymousClass3DM.A00(r1, r2, r11, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x021a, code lost:
        if (r1 == r0) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0226, code lost:
        X.0eS.A00(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0242, code lost:
        if (r1 != r0) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0244, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x022b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r11 = r24
            r13 = r25
            int r0 = r11.A04
            switch(r0) {
                case 0: goto L_0x0057;
                case 1: goto L_0x007c;
                case 2: goto L_0x02a6;
                case 3: goto L_0x0110;
                case 4: goto L_0x0141;
                case 5: goto L_0x0245;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r11.A00
            r3 = 1
            if (r1 == 0) goto L_0x0021
            if (r1 != r3) goto L_0x02a1
            X.0eS.A00(r13)
        L_0x0015:
            java.lang.Object r1 = r11.A05
            X.E3D r1 = (X.E3D) r1
            boolean r0 = r11.A06
            X.E3D.A0E(r1, r0)
        L_0x001e:
            X.0gF r0 = X.C60340gF.A00
        L_0x0020:
            return r0
        L_0x0021:
            X.0eS.A00(r13)
            java.lang.Object r4 = r11.A05
            X.E3D r4 = (X.E3D) r4
            com.instagram.common.session.UserSession r1 = r4.A0H()
            X.F3K r6 = X.Ky3.A00(r1)
            boolean r2 = r11.A06
            java.lang.Object r1 = r11.A02
            X.0rl r1 = (X.0rl) r1
            long r12 = r1.A00
            java.lang.Object r1 = r11.A01
            X.0rl r1 = (X.0rl) r1
            long r14 = r1.A00
            X.Fo5 r7 = r4.A0T
            java.lang.Object r1 = r11.A03
            X.3FW r1 = (X.AnonymousClass3FW) r1
            java.util.List r10 = r1.A04()
            r8 = 0
            r11.A00 = r3
            r17 = 0
            r9 = r8
            r16 = r2
            java.lang.Object r1 = r6.A00(r7, r8, r9, r10, r11, r12, r14, r16, r17)
            if (r1 != r0) goto L_0x0015
            return r0
        L_0x0057:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r11.A00
            r3 = 1
            if (r1 == 0) goto L_0x0065
            if (r1 == r3) goto L_0x0226
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0065:
            X.0eS.A00(r13)
            java.lang.Object r1 = r11.A03
            X.07V r2 = X.JTO.A0J(r1)
            java.lang.Object r1 = r11.A02
            X.07U r1 = (X.07U) r1
            r7 = 0
            java.lang.Object r6 = r11.A05
            boolean r9 = r11.A06
            java.lang.Object r5 = r11.A01
            r8 = 7
            goto L_0x0134
        L_0x007c:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r11.A00
            r3 = 1
            if (r1 == 0) goto L_0x00d2
            if (r1 != r3) goto L_0x030d
            X.0eS.A00(r13)
        L_0x0088:
            java.lang.Object r0 = r11.A05
            X.33A r0 = (X.AnonymousClass33A) r0
            com.instagram.common.session.UserSession r3 = r0.A02
            androidx.fragment.app.FragmentActivity r9 = r0.A00
            java.lang.Object r10 = r11.A01
            X.0iw r10 = (X.AnonymousClass0iw) r10
            java.lang.Object r1 = r11.A03
            com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState r1 = (com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState) r1
            java.lang.String r6 = r1.A0D
            X.GPK r2 = X.GPK.NOTE_LONG_PRESS
            java.lang.Object r0 = r11.A02
            X.4GS r0 = (X.AnonymousClass4GS) r0
            r4 = 0
            if (r0 == 0) goto L_0x00d0
            java.lang.String r8 = r0.All()
        L_0x00a7:
            if (r0 == 0) goto L_0x00ad
            java.lang.Integer r4 = r0.Als()
        L_0x00ad:
            java.lang.String r0 = r1.A0H
            r1 = 0
            java.lang.Long r0 = X.C51971G9r.A0n(r1, r0)
            long r12 = X.JTS.A06(r0)
            r0 = 2
            X.0qQ.A0B(r10, r0)
            r11 = r3
            r14 = r1
            X.C71147Oe5.A03(r9, r10, r11, r12, r14)
            X.GPJ r1 = X.GPJ.A00
            java.lang.String r5 = r10.getModuleName()
            java.lang.String r7 = java.lang.String.valueOf(r12)
            r1.A03(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x001e
        L_0x00d0:
            r8 = r4
            goto L_0x00a7
        L_0x00d2:
            X.0eS.A00(r13)
            boolean r1 = r11.A06
            if (r1 == 0) goto L_0x0088
            X.37E r2 = X.AnonymousClass37D.A00
            java.lang.Object r1 = r11.A05
            X.33A r1 = (X.AnonymousClass33A) r1
            androidx.fragment.app.FragmentActivity r1 = r1.A00
            X.37D r4 = r2.A01(r1)
            if (r4 == 0) goto L_0x0088
            r11.A00 = r3
            X.1IW r3 = X.JTS.A0s(r11)
            r1 = 3
            X.Lz1 r2 = new X.Lz1
            r2.<init>(r3, r1)
            r1 = r4
            X.37F r1 = (X.AnonymousClass37F) r1
            r1.A0H = r2
            r2 = 46
            X.J6H r1 = new X.J6H
            r1.<init>(r4, r2)
            r3.CO0(r1)
            r4.A0B()
            java.lang.Object r1 = r3.A0E()
            if (r1 == r0) goto L_0x010d
            X.0gF r1 = X.C60340gF.A00
        L_0x010d:
            if (r1 != r0) goto L_0x0088
            return r0
        L_0x0110:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r11.A00
            r3 = 1
            if (r1 == 0) goto L_0x011e
            if (r1 == r3) goto L_0x0226
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x011e:
            X.0eS.A00(r13)
            java.lang.Object r1 = r11.A03
            X.07V r2 = X.JTO.A0J(r1)
            java.lang.Object r1 = r11.A01
            X.07U r1 = (X.07U) r1
            r7 = 0
            java.lang.Object r6 = r11.A05
            boolean r9 = r11.A06
            java.lang.Object r5 = r11.A02
            r8 = 19
        L_0x0134:
            X.JTf r4 = new X.JTf
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (X.AnonymousClass4D7) r7, (int) r8, (boolean) r9)
            r11.A00 = r3
            java.lang.Object r1 = X.AnonymousClass3DM.A00(r1, r2, r11, r4)
            goto L_0x0242
        L_0x0141:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r11.A00
            r5 = 3
            r7 = 2
            r3 = 1
            if (r1 == 0) goto L_0x019c
            if (r1 == r3) goto L_0x01cb
            if (r1 != r7) goto L_0x0226
            java.lang.Object r1 = r11.A03
            java.lang.Object r2 = r11.A02
            X.Jip r2 = (X.C60292Jip) r2
            X.0eS.A00(r13)
        L_0x0157:
            X.M0X r5 = r2.A03
            com.instagram.api.schemas.IGLiveBadgeSettings r0 = com.instagram.api.schemas.IGLiveBadgeSettings.ON
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            X.0Ae r1 = r5.A0N
            if (r0 == 0) goto L_0x0199
            java.lang.String r0 = "ig_live_turn_on_badges"
        L_0x0165:
            X.0Aj r4 = X.M0X.A01(r5, r1, r0)
            java.lang.String r0 = r5.A08
            if (r0 == 0) goto L_0x0196
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x0196
            long r0 = r0.longValue()
        L_0x0177:
            X.JTQ.A10(r4, r0)
            X.0iw r0 = r5.A0O
            X.C51969G9p.A1A(r4, r0)
            java.lang.String r0 = r5.A0A
            if (r0 != 0) goto L_0x0185
            java.lang.String r0 = "0"
        L_0x0185:
            X.C51965G9l.A1I(r4, r0)
            java.lang.String r1 = "host"
            java.lang.String r0 = "view_mode"
            X.M0X.A06(r4, r5, r0, r1)
            r4.Cgf()
            r2.A00 = r3
            goto L_0x001e
        L_0x0196:
            r0 = 0
            goto L_0x0177
        L_0x0199:
            java.lang.String r0 = "ig_live_turn_off_badges"
            goto L_0x0165
        L_0x019c:
            X.0eS.A00(r13)
            java.lang.Object r6 = r11.A01
            java.lang.Object r2 = r11.A05
            X.Jip r2 = (X.C60292Jip) r2
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r1 = r2.A0A
            X.JvD r1 = X.JTQ.A0Q(r1)
            if (r1 == 0) goto L_0x001e
            java.lang.String r9 = r1.A08
            if (r9 == 0) goto L_0x001e
            boolean r1 = r11.A06
            com.instagram.video.live.mvvm.model.repository.IgLiveBroadcastSettingsRepository r4 = r2.A04
            if (r1 == 0) goto L_0x01c8
            com.instagram.api.schemas.IGLiveBadgeSettings r1 = com.instagram.api.schemas.IGLiveBadgeSettings.OFF
        L_0x01b9:
            r11.A01 = r6
            r11.A02 = r2
            r11.A03 = r9
            r11.A00 = r3
            java.lang.Object r13 = r4.A00(r1, r9, r11)
            if (r13 != r0) goto L_0x01d8
            return r0
        L_0x01c8:
            com.instagram.api.schemas.IGLiveBadgeSettings r1 = com.instagram.api.schemas.IGLiveBadgeSettings.ON
            goto L_0x01b9
        L_0x01cb:
            java.lang.Object r9 = r11.A03
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r11.A02
            X.Jip r2 = (X.C60292Jip) r2
            java.lang.Object r6 = r11.A01
            X.0eS.A00(r13)
        L_0x01d8:
            com.instagram.api.schemas.IGLiveBadgeSettings r13 = (com.instagram.api.schemas.IGLiveBadgeSettings) r13
            if (r13 == 0) goto L_0x022b
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r8 = r2.A0A
            r11.A01 = r6
            r11.A02 = r2
            r11.A03 = r13
            r11.A00 = r7
            com.instagram.reels.store.ReelStore r7 = r8.A01
            com.instagram.model.reels.Reel r1 = r7.A0M(r9)
            if (r1 == 0) goto L_0x0223
            X.4gL r6 = r1.A0H
            if (r6 == 0) goto L_0x0223
            X.4wG r10 = r6.A03
            if (r10 == 0) goto L_0x0223
            com.instagram.api.schemas.IGLiveBadgeSettings r1 = com.instagram.api.schemas.IGLiveBadgeSettings.UNSET
            if (r13 == r1) goto L_0x0223
            java.lang.Integer r5 = r10.A04
            java.lang.Boolean r4 = r10.A03
            X.58x r1 = r10.A02
            com.instagram.api.schemas.LiveUserPaySupportTier r14 = r10.A01
            if (r1 == 0) goto L_0x0221
            X.58x r15 = r1.F5b()
        L_0x0208:
            X.4wG r12 = new X.4wG
            r16 = r4
            r17 = r5
            r12.<init>(r13, r14, r15, r16, r17)
            r6.A03 = r12
            r7.A0G(r6)
            java.lang.Object r1 = r8.A02(r9, r11)
            if (r1 != r0) goto L_0x0223
        L_0x021c:
            if (r1 == r0) goto L_0x0020
            r1 = r13
            goto L_0x0157
        L_0x0221:
            r15 = 0
            goto L_0x0208
        L_0x0223:
            X.0gF r1 = X.C60340gF.A00
            goto L_0x021c
        L_0x0226:
            X.0eS.A00(r13)
            goto L_0x001e
        L_0x022b:
            X.3ju r3 = r2.A0E
            r1 = 2131961740(0x7f13278c, float:1.9560185E38)
            X.Kds r2 = new X.Kds
            r2.<init>(r1)
            r1 = 0
            r11.A01 = r1
            r11.A02 = r1
            r11.A03 = r1
            r11.A00 = r5
            java.lang.Object r1 = r3.ELH(r2, r11)
        L_0x0242:
            if (r1 != r0) goto L_0x001e
            return r0
        L_0x0245:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r11.A00
            r3 = 1
            if (r1 == 0) goto L_0x025a
            if (r1 != r3) goto L_0x0312
            X.0eS.A00(r13)
        L_0x0251:
            java.lang.Object r0 = r11.A01
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            r0.onBackPressed()
            goto L_0x001e
        L_0x025a:
            X.0eS.A00(r13)
            java.lang.Object r1 = r11.A05
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.F3K r12 = X.Ky3.A00(r1)
            r22 = 0
            java.lang.Object r2 = r11.A03
            X.3FW r2 = (X.AnonymousClass3FW) r2
            long r18 = r2.A01()
            long r20 = r2.A00()
            java.lang.Object r13 = r11.A02
            X.Fo7 r13 = (X.C51077Fo7) r13
            java.util.List r16 = r2.A04()
            boolean r4 = r11.A06
            r15 = 0
            if (r4 == 0) goto L_0x029f
            long r5 = X.C46359DdX.A01(r1)
            java.lang.Long r14 = X.JTO.A0y(r5)
        L_0x0288:
            if (r4 == 0) goto L_0x0292
            long r1 = X.C46359DdX.A00(r1)
            java.lang.Long r15 = X.JTO.A0y(r1)
        L_0x0292:
            r11.A00 = r3
            r23 = r4
            r17 = r11
            java.lang.Object r1 = r12.A00(r13, r14, r15, r16, r17, r18, r20, r22, r23)
            if (r1 != r0) goto L_0x0251
            return r0
        L_0x029f:
            r14 = r15
            goto L_0x0288
        L_0x02a1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02a6:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r11.A00
            r6 = 0
            r7 = 2
            r5 = 1
            if (r1 == 0) goto L_0x02c4
            if (r1 == r5) goto L_0x02ea
            if (r1 != r7) goto L_0x02bf
            java.lang.Object r2 = r11.A03
            com.instagram.mainfeed.network.FeedCacheCoordinator r2 = (com.instagram.mainfeed.network.FeedCacheCoordinator) r2
            java.lang.Object r3 = r11.A02
            X.136 r3 = (X.136) r3
            X.0eS.A00(r13)
            goto L_0x0300
        L_0x02bf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02c4:
            X.0eS.A00(r13)
            java.lang.Object r4 = r11.A05
            com.instagram.mainfeed.network.FeedCacheCoordinator r4 = (com.instagram.mainfeed.network.FeedCacheCoordinator) r4
            java.lang.Object r3 = r11.A01
            X.1UO r3 = (X.1UO) r3
            r4.A01 = r3
            boolean r1 = r11.A06
            if (r1 == 0) goto L_0x02ed
            r11.A00 = r5
            r1 = 751(0x2ef, float:1.052E-42)
            X.0nL r2 = new X.0nL
            r2.<init>(r1)
            com.instagram.mainfeed.network.FeedCacheCoordinator$loadInitialFeedCache$2 r1 = new com.instagram.mainfeed.network.FeedCacheCoordinator$loadInitialFeedCache$2
            r1.<init>(r3, r4, r6)
            java.lang.Object r1 = X.JTR.A0y(r0, r11, r2, r1)
            if (r1 != r0) goto L_0x02ed
            return r0
        L_0x02ea:
            X.0eS.A00(r13)
        L_0x02ed:
            java.lang.Object r2 = r11.A05
            com.instagram.mainfeed.network.FeedCacheCoordinator r2 = (com.instagram.mainfeed.network.FeedCacheCoordinator) r2
            X.136 r3 = r2.A0C
            r11.A02 = r3
            r11.A03 = r2
            r11.A00 = r7
            java.lang.Object r1 = X.136.A00(r11, r3)
            if (r1 != r0) goto L_0x0300
            return r0
        L_0x0300:
            r2.A02 = r5     // Catch:{ all -> 0x0308 }
            X.0gF r0 = X.C60340gF.A00     // Catch:{ all -> 0x0308 }
            r3.A05(r6)
            return r0
        L_0x0308:
            r0 = move-exception
            r3.A05(r6)
            throw r0
        L_0x030d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0312:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JTY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((JTY) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JTY(C60292Jip jip, AnonymousClass4D7 r3, boolean z) {
        super(2, r3);
        this.A04 = 4;
        this.A05 = jip;
        this.A06 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JTY(Object obj, Object obj2, Object obj3, Object obj4, AnonymousClass4D7 r6, int i, boolean z) {
        super(2, r6);
        this.A04 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A05 = obj3;
        this.A06 = z;
        this.A01 = obj4;
    }
}
