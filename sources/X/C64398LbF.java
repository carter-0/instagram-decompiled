package X;

/* renamed from: X.LbF  reason: case insensitive filesystem */
public final class C64398LbF implements AnonymousClass2Kv {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C64398LbF(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v5, types: [X.L7G, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v9, types: [java.lang.Object, X.L2l] */
    /* JADX WARNING: type inference failed for: r1v23, types: [X.L8X, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02b3, code lost:
        if (X.1AW.A06(r6, 18314135687675293L) != false) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01bb, code lost:
        if (r13 != null) goto L_0x01bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(X.AnonymousClass3JD r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            r7 = r13
            switch(r0) {
                case 0: goto L_0x015a;
                case 1: goto L_0x0148;
                case 2: goto L_0x00af;
                case 3: goto L_0x0031;
                default: goto L_0x0006;
            }
        L_0x0006:
            if (r13 == 0) goto L_0x0030
            X.3lr r3 = X.C41845B3m.A0U(r13)
            if (r3 == 0) goto L_0x0030
            java.lang.Class<X.Br4> r2 = X.Br4.class
            r0 = 4241(0x1091, float:5.943E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -669058909(0xffffffffd81ef8a3, float:-6.991629E14)
            X.3lr r4 = r3.A05(r2, r1, r0)
            if (r4 == 0) goto L_0x0030
            java.lang.Object r3 = r12.A01
            X.4Cq r3 = (X.C262224Cq) r3
            java.lang.Object r2 = r12.A02
            r1 = 0
            r0 = 21
            X.MGD r6 = new X.MGD
            r6.<init>(r4, r2, r1, r0)
        L_0x002d:
            X.AnonymousClass7TE.A1Z(r6, r3)
        L_0x0030:
            return
        L_0x0031:
            if (r13 == 0) goto L_0x0030
            X.3lr r3 = X.C41845B3m.A0U(r13)
            if (r3 == 0) goto L_0x0030
            java.lang.Class<X.Bqs> r2 = X.C43028Bqs.class
            r0 = 4239(0x108f, float:5.94E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 673804224(0x28296fc0, float:9.4056165E-15)
            X.3lr r7 = r3.A05(r2, r1, r0)
            if (r7 == 0) goto L_0x0030
            java.lang.Object r4 = r12.A02
            com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository r4 = (com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository) r4
            java.lang.Object r3 = r12.A01
            X.4Cq r3 = (X.C262224Cq) r3
            com.instagram.common.session.UserSession r0 = r4.A01
            X.17i r1 = X.17h.A00(r0)
            r0 = 3606(0xe16, float:5.053E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r7.A0A(r0)
            com.instagram.user.model.User r2 = r1.A02(r0)
            if (r2 == 0) goto L_0x0030
            r6 = 2
            java.lang.String r5 = "status"
            java.lang.String r1 = r7.getRequiredStringField(r6, r5)
            java.lang.String r0 = "active"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x008c
            X.05G r0 = r4.A05
            X.JTR.A1W(r0)
            com.instagram.api.schemas.IGLiveModeratorStatus r1 = com.instagram.api.schemas.IGLiveModeratorStatus.ACTIVE
        L_0x007e:
            X.4Cl r0 = r2.A03
            r0.EcR(r1)
        L_0x0083:
            r1 = 0
            r0 = 20
            X.MGD r6 = new X.MGD
            r6.<init>(r2, r4, r1, r0)
            goto L_0x002d
        L_0x008c:
            java.lang.String r1 = r7.getRequiredStringField(r6, r5)
            java.lang.String r0 = "resigned"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x009b
            com.instagram.api.schemas.IGLiveModeratorStatus r1 = com.instagram.api.schemas.IGLiveModeratorStatus.RESIGNED
            goto L_0x007e
        L_0x009b:
            java.lang.String r1 = r7.getRequiredStringField(r6, r5)
            java.lang.String r0 = "ineligible"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0083
            com.instagram.api.schemas.IGLiveModeratorEligibilityType r1 = com.instagram.api.schemas.IGLiveModeratorEligibilityType.INELIGIBLE
            X.4Cl r0 = r2.A03
            r0.EcQ(r1)
            goto L_0x0083
        L_0x00af:
            if (r13 == 0) goto L_0x0030
            X.3lr r3 = X.C41845B3m.A0U(r13)
            if (r3 == 0) goto L_0x0030
            java.lang.Class<X.Br1> r2 = X.Br1.class
            r5 = 0
            r0 = 4240(0x1090, float:5.942E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1408600641(0x53f58a41, float:2.10917301E12)
            X.3lr r7 = r3.getRequiredTreeField(r5, r1, r2, r0)
            if (r7 == 0) goto L_0x0030
            X.L7G r4 = new X.L7G
            r4.<init>()
            r0 = 546(0x222, float:7.65E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.getOptionalStringField(r5, r0)
            r1 = 1
            java.lang.String r0 = "broadcast_id"
            r7.getRequiredStringField(r1, r0)
            X.L2l r3 = new X.L2l
            r3.<init>()
            java.lang.Class<X.Br0> r2 = X.Br0.class
            r6 = 2
            java.lang.String r1 = "reactor"
            r0 = 1518949679(0x5a89552f, float:1.93278661E16)
            X.3lr r1 = r7.getRequiredTreeField(r6, r1, r2, r0)
            java.lang.String r0 = "id"
            java.lang.String r0 = r1.getRequiredStringField(r5, r0)
            r3.A00 = r0
            r4.A01 = r3
            r5 = 3
            java.lang.String r0 = "reaction_unicode"
            java.lang.String r0 = r7.getRequiredStringField(r5, r0)
            r4.A02 = r0
            java.lang.Class<X.Bqz> r3 = X.C43035Bqz.class
            r2 = 4
            java.lang.String r1 = "avatar_reaction"
            r0 = 61102575(0x3a459ef, float:9.659701E-37)
            X.3lr r3 = r7.getOptionalTreeField(r2, r1, r3, r0)
            r2 = 0
            if (r3 == 0) goto L_0x0146
            X.L8X r1 = new X.L8X
            r1.<init>()
            java.lang.String r0 = "artifact_id"
            java.lang.String r0 = r3.A07(r0)
            r1.A00 = r0
            java.lang.String r0 = "template_id"
            java.lang.String r0 = r3.A08(r0)
            r1.A02 = r0
            java.lang.String r0 = "media_type"
            java.lang.String r0 = r3.getOptionalStringField(r6, r0)
            r1.A01 = r0
            java.lang.String r0 = "cdn_url"
            java.lang.String r0 = r3.getOptionalStringField(r5, r0)
            r1.A03 = r0
        L_0x0135:
            r4.A00 = r1
            java.lang.Object r3 = r12.A01
            X.4Cq r3 = (X.C262224Cq) r3
            java.lang.Object r1 = r12.A02
            r0 = 19
            X.MGD r6 = new X.MGD
            r6.<init>(r4, r1, r2, r0)
            goto L_0x002d
        L_0x0146:
            r1 = r2
            goto L_0x0135
        L_0x0148:
            java.lang.Object r9 = r12.A02
            X.Liy r9 = (X.C64836Liy) r9
            X.4Cq r3 = r9.A02
            java.lang.Object r8 = r12.A01
            r10 = 0
            r11 = 14
            X.JaL r6 = new X.JaL
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x002d
        L_0x015a:
            r4 = 0
            if (r13 == 0) goto L_0x01ba
            java.lang.Object r2 = r13.Bny()
            X.3FZ r2 = (X.AnonymousClass3FZ) r2
            if (r2 == 0) goto L_0x01ba
            java.lang.Class<X.Jsb> r1 = X.C60868Jsb.class
            java.lang.String r0 = "fx_growth"
            X.3FZ r2 = r2.A00(r1, r0)
            if (r2 == 0) goto L_0x01ba
            java.lang.Class<X.Jsa> r1 = X.C60867Jsa.class
            java.lang.String r0 = "eligible_ig_ig_crossposting_accounts"
            X.3FZ r2 = r2.A00(r1, r0)
            if (r2 == 0) goto L_0x01ba
            java.lang.Class<X.JsY> r1 = X.C60865JsY.class
            r0 = 2982(0xba6, float:4.179E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            com.google.common.collect.ImmutableList r0 = r2.A02(r0, r1)
            if (r0 == 0) goto L_0x01ba
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r0.iterator()
        L_0x018f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01bd
            java.lang.Object r1 = r6.next()
            X.3FZ r1 = (X.AnonymousClass3FZ) r1
            X.0qQ.A0A(r1)
            java.lang.String r0 = "id"
            java.lang.String r5 = r1.A05(r0)
            java.lang.String r0 = X.Dbq.A03()
            java.lang.String r3 = r1.A05(r0)
            if (r5 == 0) goto L_0x018f
            if (r3 == 0) goto L_0x018f
            r1 = 1
            X.L6Z r0 = new X.L6Z
            r0.<init>(r5, r3, r1)
            r2.add(r0)
            goto L_0x018f
        L_0x01ba:
            r2 = r4
            if (r13 == 0) goto L_0x0216
        L_0x01bd:
            java.lang.Object r3 = r13.Bny()
            X.3FZ r3 = (X.AnonymousClass3FZ) r3
            if (r3 == 0) goto L_0x0216
            java.lang.Class<X.Jsb> r1 = X.C60868Jsb.class
            java.lang.String r0 = "fx_growth"
            X.3FZ r3 = r3.A00(r1, r0)
            if (r3 == 0) goto L_0x0216
            java.lang.Class<X.Jsa> r1 = X.C60867Jsa.class
            java.lang.String r0 = "eligible_ig_ig_crossposting_accounts"
            X.3FZ r3 = r3.A00(r1, r0)
            if (r3 == 0) goto L_0x0216
            java.lang.Class<X.JsZ> r1 = X.C60866JsZ.class
            java.lang.String r0 = "logged_in_eligible_accounts"
            com.google.common.collect.ImmutableList r0 = r3.A02(r0, r1)
            if (r0 == 0) goto L_0x0216
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r0.iterator()
        L_0x01eb:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0216
            java.lang.Object r1 = r6.next()
            X.3FZ r1 = (X.AnonymousClass3FZ) r1
            X.0qQ.A0A(r1)
            java.lang.String r0 = "opaque_id"
            java.lang.String r5 = r1.A05(r0)
            java.lang.String r0 = X.Dbq.A03()
            java.lang.String r3 = r1.A05(r0)
            if (r5 == 0) goto L_0x01eb
            if (r3 == 0) goto L_0x01eb
            r1 = 0
            X.L6Z r0 = new X.L6Z
            r0.<init>(r5, r3, r1)
            r4.add(r0)
            goto L_0x01eb
        L_0x0216:
            java.lang.Object r5 = r12.A02
            X.Liv r5 = (X.C64833Liv) r5
            X.05G r3 = r5.A01
            java.lang.Object r7 = r12.A01
            android.content.Context r7 = (android.content.Context) r7
            if (r2 != 0) goto L_0x0224
            X.0sn r2 = X.0sn.A00
        L_0x0224:
            if (r4 != 0) goto L_0x0228
            X.0sn r4 = X.0sn.A00
        L_0x0228:
            boolean r0 = X.AnonymousClass7TE.A1b(r4)
            if (r0 == 0) goto L_0x023b
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0260
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0260
        L_0x023b:
            java.util.ArrayList r2 = X.00k.A0S(r4, r2)
        L_0x023f:
            r3.Epw(r2)
            java.lang.Object r0 = r3.getValue()
            if (r0 == 0) goto L_0x02c5
            java.util.Iterator r2 = X.C51966G9m.A1H(r0)
        L_0x024c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02b6
            java.lang.Object r0 = r2.next()
            X.L6Z r0 = (X.L6Z) r0
            java.lang.String r1 = r0.A02
            java.util.Vector r0 = r5.A00
            X.JTR.A1S(r1, r0)
            goto L_0x024c
        L_0x0260:
            java.util.Iterator r1 = r4.iterator()
        L_0x0264:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x023b
            java.lang.Object r0 = r1.next()
            X.L6Z r0 = (X.L6Z) r0
            boolean r0 = r0.A01
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0264
            X.0Tu r6 = X.0Tu.A05
            r0 = 18877085641016211(0x43109c00070393, double:2.1210383466460733E-307)
            java.lang.String r9 = X.1AW.A04(r6, r0)
            int r0 = r9.length()
            if (r0 != 0) goto L_0x0289
            java.lang.String r9 = "fx_ig4a_sac_signup_deviceid_universe"
        L_0x0289:
            r0 = 18877085641147284(0x43109c00090394, double:2.1210383466978803E-307)
            java.lang.String r8 = X.1AW.A04(r6, r0)
            int r0 = r8.length()
            if (r0 != 0) goto L_0x029a
            java.lang.String r8 = "value_prop"
        L_0x029a:
            r0 = 18314135687806366(0x41109c000a3d9e, double:1.898530960878936E-307)
            boolean r0 = X.1AW.A06(r6, r0)
            if (r0 == 0) goto L_0x02aa
            com.instagram.common.session.UserSession r0 = r5.A03
            X.AnonymousClass9EJ.A00(r7, r0, r9, r8)
        L_0x02aa:
            r0 = 18314135687675293(0x41109c00083d9d, double:1.898530960827129E-307)
            boolean r0 = X.1AW.A06(r6, r0)
            if (r0 == 0) goto L_0x023b
            goto L_0x023f
        L_0x02b6:
            com.instagram.common.session.UserSession r0 = r5.A03
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            X.LfQ r0 = new X.LfQ
            r0.<init>()
            r1.A00(r0)
            return
        L_0x02c5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64398LbF.invoke(X.3JD):void");
    }
}
