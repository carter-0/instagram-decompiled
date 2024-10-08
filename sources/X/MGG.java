package X;

import com.instagram.user.model.User;

public final class MGG extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGG(C60695Jpg jpg, User user, AnonymousClass4D7 r4, boolean z) {
        super(2, r4);
        this.A02 = 1;
        this.A03 = jpg;
        this.A00 = user;
        this.A04 = z;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MGG, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v2, types: [X.MGG, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0054, code lost:
        r5 = new X.MGG(r6, r7, r8, r9, r10);
        r5.A00 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        return new X.MGG(r5, r6, r7, r8, r9, r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r12, X.AnonymousClass4D7 r13) {
        /*
            r11 = this;
            int r1 = r11.A02
            r8 = r13
            switch(r1) {
                case 0: goto L_0x0033;
                case 1: goto L_0x003b;
                case 2: goto L_0x004d;
                case 3: goto L_0x0015;
                case 4: goto L_0x001f;
                case 5: goto L_0x0029;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r7 = r11.A01
            java.lang.Object r6 = r11.A03
            boolean r10 = r11.A04
            java.lang.Object r5 = r11.A00
            r9 = 6
        L_0x000f:
            X.MGG r4 = new X.MGG
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L_0x0015:
            java.lang.Object r5 = r11.A00
            boolean r10 = r11.A04
            java.lang.Object r6 = r11.A03
            java.lang.Object r7 = r11.A01
            r9 = 3
            goto L_0x000f
        L_0x001f:
            java.lang.Object r7 = r11.A01
            java.lang.Object r5 = r11.A00
            java.lang.Object r6 = r11.A03
            boolean r10 = r11.A04
            r9 = 4
            goto L_0x000f
        L_0x0029:
            boolean r10 = r11.A04
            java.lang.Object r6 = r11.A03
            java.lang.Object r7 = r11.A01
            java.lang.Object r5 = r11.A00
            r9 = 5
            goto L_0x000f
        L_0x0033:
            java.lang.Object r6 = r11.A01
            java.lang.Object r7 = r11.A03
            boolean r10 = r11.A04
            r9 = 0
            goto L_0x0054
        L_0x003b:
            java.lang.Object r2 = r11.A03
            X.Jpg r2 = (X.C60695Jpg) r2
            java.lang.Object r1 = r11.A00
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            boolean r0 = r11.A04
            X.MGG r4 = new X.MGG
            r4.<init>(r2, r1, r13, r0)
            r4.A01 = r12
            return r4
        L_0x004d:
            java.lang.Object r6 = r11.A01
            java.lang.Object r7 = r11.A03
            boolean r10 = r11.A04
            r9 = 2
        L_0x0054:
            X.MGG r4 = new X.MGG
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            r4.A00 = r12
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MGG.create(java.lang.Object, X.4D7):X.4D7");
    }

    /* JADX WARNING: type inference failed for: r0v49, types: [X.LNu, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            r32 = this;
            r2 = r32
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L_0x00a7;
                case 1: goto L_0x007f;
                case 2: goto L_0x0258;
                case 3: goto L_0x028d;
                case 4: goto L_0x01e9;
                case 5: goto L_0x0221;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.0eS.A00(r33)
            java.lang.Object r6 = r2.A01
            X.GgP r6 = (X.C52972GgP) r6
            java.lang.Object r7 = r2.A03
            X.HtY r7 = (X.C56146HtY) r7
            com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository r4 = r6.A0E
            java.lang.String r5 = r7.A04
            X.I87 r0 = r4.A04
            android.util.LruCache r3 = r0.A00
            java.lang.Object r1 = r3.get(r5)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L_0x002b
            boolean r0 = r1.isRecycled()
            if (r0 == 0) goto L_0x0078
            r3.remove(r5)
        L_0x002b:
            r9 = 0
        L_0x002c:
            boolean r11 = r2.A04
            java.lang.Object r8 = r2.A00
            X.I1t r8 = (X.C56565I1t) r8
            X.Htc r0 = r6.A0G
            X.7K7 r0 = r0.A04
            if (r0 == 0) goto L_0x0076
            java.lang.String r10 = r0.A00
        L_0x003a:
            X.8Vp r0 = X.C52972GgP.A00(r6, r7, r8, r9, r10, r11)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.HsD r3 = new X.HsD
            r3.<init>(r0)
            boolean r2 = r4.A0G
            if (r2 == 0) goto L_0x005d
            X.0eM r0 = r4.A0B
            java.lang.Object r1 = r0.getValue()
            X.GVF r1 = (X.GVF) r1
            X.05G r0 = r4.A0C
            java.lang.Object r0 = r0.getValue()
            X.HtB r0 = (X.C56123HtB) r0
            r1.A01 = r0
        L_0x005d:
            if (r8 == 0) goto L_0x006b
            if (r2 == 0) goto L_0x006b
            X.0eM r0 = r4.A0B
            java.lang.Object r0 = r0.getValue()
            X.GVF r0 = (X.GVF) r0
            r0.A02 = r8
        L_0x006b:
            X.HIF r0 = new X.HIF
            r0.<init>(r3)
            X.C52972GgP.A03(r6, r0)
        L_0x0073:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0076:
            r10 = 0
            goto L_0x003a
        L_0x0078:
            android.app.Application r0 = r4.A02
            java.lang.String r9 = X.C56366HxJ.A01(r0, r1, r5)
            goto L_0x002c
        L_0x007f:
            X.0eS.A00(r33)
            java.lang.Object r0 = r2.A01
            X.JvS r0 = (X.C61028JvS) r0
            java.lang.String r4 = r0.A01
            java.lang.Object r0 = r2.A03
            X.Jpg r0 = (X.C60695Jpg) r0
            if (r4 == 0) goto L_0x009a
            X.4Ga r3 = r0.A01
            java.lang.Object r1 = r2.A00
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            boolean r0 = r2.A04
            r3.A03(r1, r4, r0)
            goto L_0x0073
        L_0x009a:
            X.4Ga r4 = r0.A01
            java.lang.Object r3 = r2.A00
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            r1 = 0
            boolean r0 = r2.A04
            r4.A03(r3, r1, r0)
            goto L_0x0073
        L_0x00a7:
            X.0eS.A00(r33)
            java.lang.Object r10 = r2.A00
            X.0sP r10 = (X.0sP) r10
            java.lang.Object r3 = r2.A01
            com.facebook.fbavatar.cdsavatareditor.liveediting.ig.IgCdlProviderBuilder r3 = (com.facebook.fbavatar.cdsavatareditor.liveediting.ig.IgCdlProviderBuilder) r3
            java.lang.Object r5 = r2.A03
            X.UKz r5 = (X.C15046UKz) r5
            boolean r13 = r2.A04
            com.instagram.common.session.UserSession r0 = r3.A04
            com.instagram.service.tigon.IGAuthedTigonService r18 = com.instagram.service.tigon.IGAuthedTigonService.getInstance(r0)
            X.0qQ.A07(r18)
            com.instagram.service.tigon.IGTigonService r19 = com.instagram.service.tigon.IGTigonService.getTigonService(r0)
            X.0qQ.A07(r19)
            X.1BJ r1 = X.AnonymousClass1F2.A00()
            r0 = 1881128843(0x701fbf8b, float:1.9775871E29)
            r11 = 0
            java.io.File r17 = r1.CGg(r11, r0)
            r17.mkdirs()
            java.net.URI r0 = X.1Ma.A06()
            java.lang.String r22 = X.DbT.A10(r0)
            X.Lb4 r1 = X.C64387Lb4.A01
            if (r1 != 0) goto L_0x00ea
            X.Lb4 r1 = new X.Lb4
            r1.<init>()
            X.C64387Lb4.A01 = r1
        L_0x00ea:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.LNu r0 = X.LNu.A02
            if (r0 != 0) goto L_0x00fb
            X.LNu r0 = new X.LNu
            r0.<init>()
            X.LNu.A02 = r0
            r0.A01 = r1
        L_0x00fb:
            java.lang.String r8 = X.JTP.A0u(r17)
            java.lang.String r9 = r5.A0B
            java.lang.String r16 = "Required value was null."
            if (r9 == 0) goto L_0x02ca
            X.VLB r1 = r3.A03
            com.instagram.common.session.UserSession r4 = r1.A00
            X.0Tu r3 = X.0Tu.A05
            r6 = 36317672224462265(0x8106bb000215b9, double:3.0307803820534276E-306)
            boolean r15 = X.182.A06(r3, r4, r6)
            r1 = 36599147201629629(0x8206bb00090dbd, double:3.2087862910228277E-306)
            int r14 = X.DbS.A04(r3, r4, r1)
            r1 = 36599147201695166(0x8206bb000a0dbe, double:3.2087862910642735E-306)
            int r12 = X.DbS.A04(r3, r4, r1)
            X.Lb4 r2 = r0.A01
            if (r2 == 0) goto L_0x02c0
            X.L5i r1 = X.C63750L5i.A02
            if (r1 != 0) goto L_0x0137
            X.L5i r1 = new X.L5i
            r1.<init>()
            X.C63750L5i.A02 = r1
            r1.A00 = r2
        L_0x0137:
            r0.A00 = r1
            java.lang.String r2 = "type"
            java.lang.String r1 = "CDL"
            X.0eP r23 = X.AnonymousClass7TE.A1L(r2, r1)
            java.lang.String r2 = "?"
            java.lang.String r1 = "revisionId"
            X.0eP r24 = X.AnonymousClass7TE.A1L(r1, r9)
            java.lang.String r1 = "profileName"
            X.0eP r25 = X.AnonymousClass7TE.A1L(r1, r9)
            java.lang.String r1 = "gqlEndpoint"
            X.0eP r26 = X.AnonymousClass7TE.A1L(r1, r2)
            r1 = 4547(0x11c3, float:6.372E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0eP r27 = X.AnonymousClass7TE.A1L(r1, r8)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            java.lang.String r1 = "RAMCacheMaxSize"
            X.0eP r28 = X.AnonymousClass7TE.A1L(r1, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            java.lang.String r1 = "diskCacheMaxSize"
            X.0eP r29 = X.AnonymousClass7TE.A1L(r1, r2)
            if (r15 == 0) goto L_0x01e6
            java.lang.String r1 = "FROM_ATOMS"
        L_0x0177:
            java.lang.String r2 = "combineType"
            X.0eP r30 = X.AnonymousClass7TE.A1L(r2, r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r13)
            java.lang.String r1 = "shouldRenderParametricsUsingLegacyAsset"
            X.0eP r31 = X.AnonymousClass7TE.A1L(r1, r2)
            X.0eP[] r1 = new X.0eP[]{r23, r24, r25, r26, r27, r28, r29, r30, r31}
            java.util.LinkedHashMap r12 = X.0Yt.A06(r1)
            X.L5i r1 = r0.A00
            java.lang.String r14 = "flipperPluginBridge"
            if (r1 == 0) goto L_0x02c2
            X.Lb4 r8 = r1.A00
            if (r8 == 0) goto L_0x02c0
            java.lang.String r2 = r1.A01
            java.lang.String r1 = "init"
            r8.A00(r2, r1, r11)
            X.L5i r1 = r0.A00
            if (r1 == 0) goto L_0x02c2
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>(r12)
            X.Lb4 r11 = r1.A00
            if (r11 == 0) goto L_0x02c0
            java.lang.String r2 = r1.A01
            java.lang.String r1 = "update_info"
            r11.A00(r2, r1, r8)
            java.lang.String r20 = X.JTP.A0u(r17)
            boolean r26 = X.182.A06(r3, r4, r6)
            java.lang.String r5 = r5.A0A
            if (r5 == 0) goto L_0x02bb
            r1 = 36599147201629629(0x8206bb00090dbd, double:3.2087862910228277E-306)
            int r24 = X.DbS.A04(r3, r4, r1)
            r1 = 36599147201695166(0x8206bb000a0dbe, double:3.2087862910642735E-306)
            int r25 = X.DbS.A04(r3, r4, r1)
            X.L7W r1 = new X.L7W
            r21 = r9
            r23 = r5
            r27 = r13
            r16 = r1
            r17 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r10.invoke(r1)
            goto L_0x0073
        L_0x01e6:
            java.lang.String r1 = "FROM_PROFILE"
            goto L_0x0177
        L_0x01e9:
            X.0eS.A00(r33)
            java.lang.Object r0 = r2.A01
            X.Jgb r0 = (X.C60156Jgb) r0
            X.05G r6 = r0.A02
            java.lang.Object r5 = r2.A00
            X.0r1 r5 = (X.0r1) r5
            java.lang.Object r4 = r2.A03
            com.instagram.user.model.Product r4 = (com.instagram.user.model.Product) r4
            boolean r3 = r2.A04
        L_0x01fc:
            java.lang.Object r2 = r6.getValue()
            r0 = r2
            X.Jw5 r0 = (X.C61067Jw5) r0
            java.lang.Object r1 = r0.A01
            java.util.Collection r1 = (java.util.Collection) r1
            X.LOm r0 = X.LOm.A00
            java.util.ArrayList r1 = X.00k.A0T(r0, r1)
            X.LOl r0 = X.C64119LOl.A00
            java.util.ArrayList r1 = X.00k.A0T(r0, r1)
            boolean r0 = r5.A00
            X.Jw5 r0 = X.C61067Jw5.A00(r4, r1, r0, r3)
            boolean r0 = r6.AIY(r2, r0)
            if (r0 == 0) goto L_0x01fc
            goto L_0x0073
        L_0x0221:
            X.0eS.A00(r33)
            boolean r1 = r2.A04
            java.lang.Object r0 = r2.A00
            X.4gU r0 = (X.C270284gU) r0
            boolean r0 = X.C51971G9r.A1X(r0)
            if (r1 == 0) goto L_0x0244
            if (r0 != 0) goto L_0x0073
            java.lang.Object r0 = r2.A03
            X.I1b r0 = (X.C56547I1b) r0
            r0.A01()
            java.lang.Object r0 = r2.A01
            X.5Uk r0 = (X.C286225Uk) r0
            if (r0 == 0) goto L_0x0073
            r0.show()
            goto L_0x0073
        L_0x0244:
            if (r0 == 0) goto L_0x0073
            java.lang.Object r0 = r2.A03
            X.I1b r0 = (X.C56547I1b) r0
            r0.A00()
            java.lang.Object r0 = r2.A01
            X.5Uk r0 = (X.C286225Uk) r0
            if (r0 == 0) goto L_0x0073
            r0.hide()
            goto L_0x0073
        L_0x0258:
            X.0eS.A00(r33)
            java.lang.Object r3 = r2.A00
            X.4dm r3 = (X.C268654dm) r3
            java.lang.Object r1 = r2.A01
            com.instagram.mediakit.api.MediaKitApi r1 = (com.instagram.mediakit.api.MediaKitApi) r1
            java.lang.Object r0 = r2.A03
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x028a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x028a
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0287
            java.lang.Integer r0 = X.AnonymousClass05K.A0F
        L_0x0275:
            com.instagram.mediakit.api.MediaKitApi.A02(r3, r1, r0)
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "media_kit_api"
            X.0wb.A03(r0, r1)
            X.L4n r0 = new X.L4n
            r0.<init>(r3)
            return r0
        L_0x0287:
            java.lang.Integer r0 = X.AnonymousClass05K.A0E
            goto L_0x0275
        L_0x028a:
            java.lang.Integer r0 = X.AnonymousClass05K.A0A
            goto L_0x0275
        L_0x028d:
            X.0eS.A00(r33)
            java.lang.Object r0 = r2.A00
            X.2D6 r0 = (X.2D6) r0
            boolean r4 = r2.A04
            r0.A0A(r4)
            java.lang.Object r0 = r2.A03
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x02a2
            r0.invoke()
        L_0x02a2:
            java.lang.Object r0 = r2.A01
            X.0lg r0 = (X.0lg) r0
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r1 = 0
            X.FWg r0 = new X.FWg
            r0.<init>(r2, r4, r1)
            boolean r0 = r3.A05(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x02bb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x02c0:
            java.lang.String r14 = "avatarDebuggerFlipperPlugin"
        L_0x02c2:
            X.0qQ.A0F(r14)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MGG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MGG) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGG(Object obj, Object obj2, AnonymousClass4D7 r4, int i, boolean z) {
        super(2, r4);
        this.A02 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A04 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGG(Object obj, Object obj2, Object obj3, AnonymousClass4D7 r5, int i, boolean z) {
        super(2, r5);
        this.A02 = i;
        this.A00 = obj;
        this.A04 = z;
        this.A03 = obj2;
        this.A01 = obj3;
    }
}
