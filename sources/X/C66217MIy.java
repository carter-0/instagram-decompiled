package X;

/* renamed from: X.MIy  reason: case insensitive filesystem */
public final class C66217MIy extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66217MIy(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01dd, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0246, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0253, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x007f;
                case 1: goto L_0x0086;
                case 2: goto L_0x0164;
                case 3: goto L_0x008d;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x009d;
                case 8: goto L_0x0005;
                case 9: goto L_0x00cb;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x0005;
                case 14: goto L_0x007c;
                case 15: goto L_0x007f;
                case 16: goto L_0x0086;
                case 17: goto L_0x00db;
                case 18: goto L_0x00e6;
                case 19: goto L_0x00fa;
                case 20: goto L_0x010a;
                case 21: goto L_0x0118;
                case 22: goto L_0x0126;
                case 23: goto L_0x0138;
                case 24: goto L_0x0146;
                case 25: goto L_0x000c;
                case 26: goto L_0x0156;
                case 27: goto L_0x006d;
                case 28: goto L_0x0182;
                case 29: goto L_0x0195;
                case 30: goto L_0x01a6;
                case 31: goto L_0x01ad;
                case 32: goto L_0x01a6;
                case 33: goto L_0x01a6;
                case 34: goto L_0x01b4;
                case 35: goto L_0x01b4;
                case 36: goto L_0x01bb;
                case 37: goto L_0x01bb;
                case 38: goto L_0x01c2;
                case 39: goto L_0x01c9;
                case 40: goto L_0x01d0;
                case 41: goto L_0x01d7;
                case 42: goto L_0x01e1;
                case 43: goto L_0x01e9;
                case 44: goto L_0x01f1;
                case 45: goto L_0x0219;
                case 46: goto L_0x0223;
                case 47: goto L_0x0231;
                case 48: goto L_0x0247;
                case 49: goto L_0x0254;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r9.A01
            X.07f r6 = X.C51971G9r.A0U(r0)
        L_0x000b:
            return r6
        L_0x000c:
            java.lang.Object r1 = r9.A01
            X.KVM r1 = (X.KVM) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.common.session.UserSession r3 = r1.A0B
            com.instagram.api.schemas.MusicProduct r1 = r1.A0A
            X.AnonymousClass7TG.A1N(r3, r1)
            com.instagram.api.schemas.MusicProduct r0 = com.instagram.api.schemas.MusicProduct.CLIPS_CAMERA_FORMAT_V2
            if (r1 != r0) goto L_0x003b
            X.0Tu r2 = X.0Tu.A05
            r0 = 36604112183890961(0x820b3f000a1411, double:3.211926165797273E-306)
        L_0x0024:
            long r7 = X.182.A01(r2, r3, r0)
            X.Khr[] r5 = X.C62561Khr.values()
            int r4 = r5.length
            r3 = 0
        L_0x002e:
            if (r3 >= r4) goto L_0x0260
            r6 = r5[r3]
            long r1 = r6.A00
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x000b
            int r3 = r3 + 1
            goto L_0x002e
        L_0x003b:
            com.instagram.api.schemas.MusicProduct r0 = com.instagram.api.schemas.MusicProduct.MUSIC_IN_FEED
            if (r1 != r0) goto L_0x0047
            X.0Tu r2 = X.0Tu.A05
            r0 = 36604112183759887(0x820b3f0008140f, double:3.211926165714381E-306)
            goto L_0x0024
        L_0x0047:
            boolean r0 = X.C14245TsS.A02(r1)
            if (r0 == 0) goto L_0x0055
            X.0Tu r2 = X.0Tu.A05
            r0 = 36604112183956498(0x820b3f000b1412, double:3.211926165838719E-306)
            goto L_0x0024
        L_0x0055:
            com.instagram.api.schemas.MusicProduct r0 = com.instagram.api.schemas.MusicProduct.MUSIC_NOTES
            if (r1 != r0) goto L_0x0061
            X.0Tu r2 = X.0Tu.A05
            r0 = 36604112183825424(0x820b3f00091410, double:3.211926165755827E-306)
            goto L_0x0024
        L_0x0061:
            com.instagram.api.schemas.MusicProduct r0 = com.instagram.api.schemas.MusicProduct.CLIPS_EDIT_METADATA
            if (r1 != r0) goto L_0x0260
            X.0Tu r2 = X.0Tu.A05
            r0 = 36604112184087571(0x820b3f000d1413, double:3.21192616592161E-306)
            goto L_0x0024
        L_0x006d:
            java.lang.Object r0 = r9.A01
            android.app.Activity r0 = (android.app.Activity) r0
            android.os.Bundle r6 = X.DbU.A06(r0)
            if (r6 != 0) goto L_0x000b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x007c:
            java.lang.Object r6 = r9.A01
            return r6
        L_0x007f:
            java.lang.Object r0 = r9.A01
            java.lang.Object r6 = X.DbT.A0r(r0)
            return r6
        L_0x0086:
            java.lang.Object r0 = r9.A01
            X.07f r6 = X.DbY.A0I(r0)
            return r6
        L_0x008d:
            java.lang.Object r0 = r9.A01
            X.K6w r0 = (X.C61423K6w) r0
            X.0eM r0 = r0.A0R
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBw r6 = new X.KBw
            r6.<init>(r0)
            return r6
        L_0x009d:
            java.lang.Object r2 = r9.A01
            X.K6w r2 = (X.C61423K6w) r2
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            android.app.Application r3 = r0.getApplication()
            X.0eM r0 = r2.A0R
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r7 = "browserTrendingAudio"
            r4 = 0
            X.AnonymousClass7TG.A1O(r3, r5)
            X.H6k r2 = new X.H6k
            r6 = r4
            r8 = r4
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.2YN r1 = X.JTO.A0L(r2, r1)
            java.lang.Class<X.GgG> r0 = X.C52963GgG.class
            X.2YL r6 = r1.A00(r0)
            return r6
        L_0x00cb:
            java.lang.Object r0 = r9.A01
            X.KUp r0 = (X.C61992KUp) r0
            X.0eM r0 = r0.A0F
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBw r6 = new X.KBw
            r6.<init>(r0)
            return r6
        L_0x00db:
            java.lang.Object r1 = r9.A01
            X.KUo r1 = (X.C61991KUo) r1
            X.0eM r0 = r1.A0A
            X.85w r6 = X.JTS.A0M(r1, r0)
            return r6
        L_0x00e6:
            java.lang.Object r2 = r9.A01
            X.KUo r2 = (X.C61991KUo) r2
            X.0eM r0 = r2.A0A
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            X.82v r6 = new X.82v
            r6.<init>(r1, r0)
            return r6
        L_0x00fa:
            java.lang.Object r0 = r9.A01
            X.KUo r0 = (X.C61991KUo) r0
            X.0eM r0 = r0.A0A
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBw r6 = new X.KBw
            r6.<init>(r0)
            return r6
        L_0x010a:
            java.lang.Object r0 = r9.A01
            X.L9t r0 = (X.C63864L9t) r0
            android.view.View r1 = r0.A01
            r0 = 2131436684(0x7f0b248c, float:1.8495245E38)
            X.3oV r6 = X.DbU.A0Z(r1, r0)
            return r6
        L_0x0118:
            java.lang.Object r0 = r9.A01
            X.L9t r0 = (X.C63864L9t) r0
            android.view.View r1 = r0.A01
            r0 = 2131436682(0x7f0b248a, float:1.8495241E38)
            X.3oV r6 = X.DbU.A0Z(r1, r0)
            return r6
        L_0x0126:
            java.lang.Object r0 = r9.A01
            X.JZH r0 = (X.JZH) r0
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36606989811324421(0x820ddd00001605, double:3.2137459889734686E-306)
            java.lang.Long r6 = X.AnonymousClass7TF.A0Y(r2, r3, r0)
            return r6
        L_0x0138:
            java.lang.Object r1 = r9.A01
            X.KVM r1 = (X.KVM) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.common.session.UserSession r0 = r1.A0B
            boolean r0 = X.AnonymousClass8IK.A02(r0)
            goto L_0x0242
        L_0x0146:
            java.lang.Object r2 = r9.A01
            X.KVM r2 = (X.KVM) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.common.session.UserSession r1 = r2.A0B
            com.instagram.api.schemas.MusicProduct r0 = r2.A0A
            boolean r0 = X.AnonymousClass30D.A00(r0, r1)
            goto L_0x0242
        L_0x0156:
            java.lang.Object r0 = r9.A01
            X.Ji3 r0 = (X.C60246Ji3) r0
            com.instagram.common.session.UserSession r1 = r0.A07
            com.instagram.api.schemas.MusicProduct r0 = r0.A06
            boolean r0 = X.AnonymousClass30D.A00(r0, r1)
            goto L_0x0242
        L_0x0164:
            java.lang.Object r2 = r9.A01
            X.K6w r2 = (X.C61423K6w) r2
            X.0eM r0 = r2.A0R
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.api.schemas.MusicProduct r0 = r2.A01
            if (r0 != 0) goto L_0x017c
            java.lang.String r0 = "musicProduct"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x017c:
            X.KCw r6 = new X.KCw
            r6.<init>(r0, r1)
            return r6
        L_0x0182:
            X.08y r1 = X.09i.A0A
            java.lang.Object r0 = r9.A01
            com.instagram.neko.playables.activity.PlayableAdActivity r0 = (com.instagram.neko.playables.activity.PlayableAdActivity) r0
            X.0eM r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            android.os.Bundle r0 = (android.os.Bundle) r0
            com.instagram.common.session.UserSession r6 = r1.A06(r0)
            return r6
        L_0x0195:
            java.lang.Object r3 = r9.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319935672295208(0x8108ca00031f28, double:3.0322117955771536E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            goto L_0x0242
        L_0x01a6:
            java.lang.Object r1 = r9.A01
            X.0sP r1 = (X.0sP) r1
            X.EVf r0 = X.C48087EVf.PRIMARY_BUTTON
            goto L_0x01dd
        L_0x01ad:
            java.lang.Object r1 = r9.A01
            X.0sP r1 = (X.0sP) r1
            X.EVf r0 = X.C48087EVf.END_IMAGE
            goto L_0x01dd
        L_0x01b4:
            java.lang.Object r1 = r9.A01
            X.0sP r1 = (X.0sP) r1
            X.EVf r0 = X.C48087EVf.END_ICON
            goto L_0x01dd
        L_0x01bb:
            java.lang.Object r1 = r9.A01
            X.0sP r1 = (X.0sP) r1
            X.EVf r0 = X.C48087EVf.CONTAINER
            goto L_0x01dd
        L_0x01c2:
            java.lang.Object r1 = r9.A01
            X.0sP r1 = (X.0sP) r1
            X.EVf r0 = X.C48087EVf.LIKE_BUTTON
            goto L_0x01dd
        L_0x01c9:
            java.lang.Object r1 = r9.A01
            X.0sP r1 = (X.0sP) r1
            X.EVf r0 = X.C48087EVf.REPLY_BUTTON
            goto L_0x01dd
        L_0x01d0:
            java.lang.Object r1 = r9.A01
            X.0sP r1 = (X.0sP) r1
            X.EVf r0 = X.C48087EVf.REPLY_WITH_REEL_BUTTON
            goto L_0x01dd
        L_0x01d7:
            java.lang.Object r1 = r9.A01
            X.0sP r1 = (X.0sP) r1
            X.EVf r0 = X.C48087EVf.MESSAGE_BUTTON
        L_0x01dd:
            r1.invoke(r0)
            goto L_0x0251
        L_0x01e1:
            java.lang.Object r0 = r9.A01
            X.MVE r0 = (X.MVE) r0
            r0.DVo()
            goto L_0x0251
        L_0x01e9:
            java.lang.Object r0 = r9.A01
            X.MVE r0 = (X.MVE) r0
            r0.D9N()
            goto L_0x0251
        L_0x01f1:
            java.lang.Object r4 = r9.A01
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            X.4HN r0 = new X.4HN
            r0.<init>(r4)
            com.instagram.newsfeed.data.ActivityFeedRepository r3 = X.AnonymousClass4HO.A00(r4, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324982258676261(0x810d6100003225, double:3.035403277125504E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0214
            com.instagram.repository.common.MemoryCache r0 = r3.A04
            X.3lq r0 = (X.C250653lq) r0
            android.util.LruCache r0 = r0.A00
            r0.evictAll()
        L_0x0214:
            r0 = 1
            r3.A03(r0)
            goto L_0x0251
        L_0x0219:
            java.lang.Object r0 = r9.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.DgG r6 = new X.DgG
            r6.<init>(r0)
            return r6
        L_0x0223:
            java.lang.Object r1 = r9.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.1E5 r0 = X.1E4.A00(r1)
            X.JZn r6 = new X.JZn
            r6.<init>(r0, r1)
            return r6
        L_0x0231:
            java.lang.Object r0 = r9.A01
            X.JZn r0 = (X.C59816JZn) r0
            com.instagram.common.session.UserSession r3 = r0.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330552831263412(0x811272000042b4, double:3.0389261296605135E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
        L_0x0242:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L_0x0247:
            java.lang.Object r0 = r9.A01
            X.E7b r0 = (X.C47538E7b) r0
            com.instagram.newsfeed.followrequests.data.FollowRequestsRepository r1 = r0.A03
            r0 = 0
            r1.A04(r0)
        L_0x0251:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x0254:
            java.lang.Object r1 = r9.A01
            X.E7b r1 = (X.C47538E7b) r1
            X.EwV r0 = r1.A02
            X.F3p r6 = new X.F3p
            r6.<init>(r0, r1)
            return r6
        L_0x0260:
            X.Khr r6 = X.C62561Khr.SAVE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66217MIy.invoke():java.lang.Object");
    }
}
