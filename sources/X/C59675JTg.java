package X;

import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.JTg  reason: case insensitive filesystem */
public final class C59675JTg extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public final int A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59675JTg(Object obj, AnonymousClass4D7 r3, int i) {
        super(1, r3);
        this.A01 = i;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.JTg, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r4) {
        int i;
        int i2 = this.A01;
        Object obj = this.A02;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            case 10:
                i = 10;
                break;
            case 11:
                i = 11;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = 12;
                break;
            case 13:
                i = 13;
                break;
            case 14:
                i = 14;
                break;
            case 15:
                i = 15;
                break;
            case 16:
                i = 16;
                break;
            case 17:
                i = 17;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                i = 18;
                break;
            default:
                i = 19;
                break;
        }
        return new C59675JTg(obj, r4, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((C59675JTg) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.JTg, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03ae, code lost:
        r4 = X.DbT.A0U(r7, r5).A00(710, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0601, code lost:
        if (r1.getCoercedBooleanField(0, X.AnonymousClass000.A00(1528)) != true) goto L_0x0603;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x06d9, code lost:
        if (r4 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x06db, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0724, code lost:
        X.0eS.A00(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0727, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x07aa, code lost:
        if (r3 != null) goto L_0x0796;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0801, code lost:
        X.0eS.A00(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x081c, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0098, code lost:
        if (r0 == r1) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:?, code lost:
        return X.C51967G9n.A0d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b7, code lost:
        if (r3.A0I != false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e4, code lost:
        r0 = X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0161, code lost:
        r0.A00 = r6;
        r0 = r4.collect(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r0 != r1) goto L_0x081a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r4 = r19
            int r1 = r0.A01
            switch(r1) {
                case 0: goto L_0x002d;
                case 1: goto L_0x029e;
                case 2: goto L_0x034e;
                case 3: goto L_0x06dc;
                case 4: goto L_0x03d4;
                case 5: goto L_0x04a8;
                case 6: goto L_0x00e8;
                case 7: goto L_0x055d;
                case 8: goto L_0x0121;
                case 9: goto L_0x05c2;
                case 10: goto L_0x0690;
                case 11: goto L_0x06b8;
                case 12: goto L_0x0728;
                case 13: goto L_0x0169;
                case 14: goto L_0x00a1;
                case 15: goto L_0x0218;
                case 16: goto L_0x081d;
                case 17: goto L_0x07ad;
                case 18: goto L_0x027b;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 != 0) goto L_0x0801
            X.0eS.A00(r4)
            java.lang.Object r4 = r0.A02
            com.instagram.wonderwall.repository.WallFeedRepository r4 = (com.instagram.wonderwall.repository.WallFeedRepository) r4
            r3 = 0
            X.05G r2 = r4.A07
            java.util.Collection r2 = X.JTO.A13(r2)
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ 1
            r0.A00 = r5
            java.lang.Object r0 = com.instagram.wonderwall.repository.WallFeedRepository.A00(r4, r3, r0, r5, r2)
        L_0x002a:
            if (r0 != r1) goto L_0x081a
        L_0x002c:
            return r1
        L_0x002d:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 != 0) goto L_0x0801
            X.0eS.A00(r4)
            java.lang.Object r6 = r0.A02
            X.5KO r6 = (X.AnonymousClass5KO) r6
            r0.A00 = r2
            androidx.datastore.migrations.SharedPreferencesMigration r6 = (androidx.datastore.migrations.SharedPreferencesMigration) r6
            X.0eM r5 = r6.A03
            java.lang.Object r0 = r5.getValue()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r4 = r0.edit()
            java.util.Set r3 = r6.A02
            if (r3 != 0) goto L_0x0081
            r4.clear()
        L_0x0052:
            boolean r0 = r4.commit()
            if (r0 == 0) goto L_0x07f0
            java.lang.Object r0 = r5.getValue()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.util.Map r0 = r0.getAll()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0095
            android.content.Context r0 = r6.A00
            if (r0 == 0) goto L_0x0095
            java.lang.String r2 = r6.A01
            if (r2 == 0) goto L_0x0095
            boolean r0 = r0.deleteSharedPreferences(r2)
            if (r0 != 0) goto L_0x0095
            java.lang.String r0 = "Unable to delete SharedPreferences: "
            java.lang.String r0 = X.0qQ.A03(r0, r2)
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x0081:
            java.util.Iterator r2 = r3.iterator()
        L_0x0085:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            r4.remove(r0)
            goto L_0x0085
        L_0x0095:
            if (r3 != 0) goto L_0x009b
            r0 = 0
        L_0x0098:
            if (r0 != r1) goto L_0x00e4
            goto L_0x002a
        L_0x009b:
            r3.clear()
            X.0gF r0 = X.C60340gF.A00
            goto L_0x0098
        L_0x00a1:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 != 0) goto L_0x0801
            X.0eS.A00(r4)
            java.lang.Object r3 = r0.A02
            X.E7c r3 = (X.C47539E7c) r3
            boolean r2 = r3.A0B
            if (r2 != 0) goto L_0x00b9
            boolean r2 = r3.A0I
            r16 = 1
            if (r2 == 0) goto L_0x00bb
        L_0x00b9:
            r16 = 0
        L_0x00bb:
            com.instagram.newsfeed.followrequests.data.FollowRequestsRepository r4 = r3.A01
            r6 = 0
            r2 = 32
            X.JV6 r12 = new X.JV6
            r12.<init>(r3, r6, r2)
            r0.A00 = r5
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.ENH r5 = new X.ENH
            r5.<init>(r2)
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r4.A05(r5, r6, r7, r8, r9, r10, r11)
            X.4Cq r0 = r4.A01
            r15 = 14
            X.JTf r11 = new X.JTf
            r13 = r4
            r14 = r6
            r11.<init>((java.lang.Object) r12, (java.lang.Object) r13, (X.AnonymousClass4D7) r14, (int) r15, (boolean) r16)
            X.JTO.A1Y(r2, r11, r0)
        L_0x00e4:
            X.0gF r0 = X.C60340gF.A00
            goto L_0x002a
        L_0x00e8:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 != 0) goto L_0x0801
            X.0eS.A00(r4)
            java.lang.Object r5 = r0.A02
            X.Ne0 r5 = (X.C69063Ne0) r5
            X.05G r3 = r5.A03
            X.JUj r2 = X.C59702JUj.A00
            r3.Epw(r2)
            com.instagram.common.session.UserSession r2 = r5.A01
            X.1NY r4 = X.AnonymousClass7TG.A0a(r2)
            r2 = 2582(0xa16, float:3.618E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r4.A0A(r2)
            java.lang.Class<X.UX1> r3 = X.UX1.class
            java.lang.Class<X.VmG> r2 = X.C18140VmG.class
            X.1OC r3 = X.DbU.A0S(r4, r3, r2)
            r2 = 1316016357(0x4e70d0e5, float:1.01005549E9)
            X.032 r4 = r3.A03(r2)
            r2 = 2
            X.MCm r3 = X.MCm.A00(r5, r2)
            goto L_0x0161
        L_0x0121:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 != 0) goto L_0x0801
            X.0eS.A00(r4)
            java.lang.Object r7 = r0.A02
            X.KWk r7 = (X.C62032KWk) r7
            X.05G r2 = r7.A05
            java.lang.Object r5 = r2.getValue()
            boolean r2 = r5 instanceof X.NW6
            if (r2 == 0) goto L_0x081a
            com.instagram.common.session.UserSession r2 = r7.A01
            java.lang.String r3 = r7.A04
            X.1NY r4 = X.AnonymousClass7TG.A0a(r2)
            java.lang.String r2 = "direct_v2/get_customer_details/"
            r4.A0A(r2)
            java.lang.String r2 = "thread_id"
            r4.A9m(r2, r3)
            java.lang.Class<X.NHL> r3 = X.NHL.class
            java.lang.Class<X.OPU> r2 = X.OPU.class
            X.1OC r3 = X.DbU.A0S(r4, r3, r2)
            r2 = 994363717(0x3b44c945, float:0.0030027193)
            X.032 r4 = r3.A03(r2)
            r2 = 11
            X.PeM r3 = new X.PeM
            r3.<init>(r2, r5, r7)
        L_0x0161:
            r0.A00 = r6
            java.lang.Object r0 = r4.collect(r3, r0)
            goto L_0x002a
        L_0x0169:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x01f3
            X.0eS.A00(r4)
        L_0x0173:
            r1 = r4
            X.3Ii r1 = (X.C239803Ii) r1
            java.lang.Object r5 = r0.A02
            com.instagram.newsfeed.data.ActivityFeedRepository r5 = (com.instagram.newsfeed.data.ActivityFeedRepository) r5
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x020f
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r6 = r1.A00
            X.5eW r6 = (X.C289955eW) r6
            com.instagram.repository.common.MemoryCache r4 = r5.A04
            r0 = 0
            X.5mm r1 = new X.5mm
            r1.<init>(r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = X.DbT.A10(r0)
            X.9JK r2 = new X.9JK
            r2.<init>(r1, r0)
            r1 = 34
            X.JwK r0 = new X.JwK
            r0.<init>((int) r1, (java.lang.Object) r6, (boolean) r3)
            r4.A01(r2, r0)
            X.01N r1 = X.0jo.A1H()
            java.util.List r0 = r6.A0I
            if (r0 == 0) goto L_0x01ae
            r1.addAll(r0)
        L_0x01ae:
            java.util.List r0 = r6.A0K
            if (r0 == 0) goto L_0x01b5
            r1.addAll(r0)
        L_0x01b5:
            java.util.List r0 = r6.A0O
            if (r0 == 0) goto L_0x01bc
            r1.addAll(r0)
        L_0x01bc:
            java.util.List r0 = r6.A0L
            if (r0 == 0) goto L_0x01c3
            r1.addAll(r0)
        L_0x01c3:
            java.util.List r0 = r6.A0M
            if (r0 == 0) goto L_0x01ca
            r1.addAll(r0)
        L_0x01ca:
            X.01N r0 = X.0jo.A1I(r1)
            java.util.HashSet r4 = X.AnonymousClass7TE.A1F()
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x01da:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x07f7
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.5Gi r0 = (X.C283155Gi) r0
            java.lang.String r0 = r0.A09
            boolean r0 = r4.add(r0)
            if (r0 == 0) goto L_0x01da
            r3.add(r1)
            goto L_0x01da
        L_0x01f3:
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A02
            com.instagram.newsfeed.data.ActivityFeedRepository r2 = (com.instagram.newsfeed.data.ActivityFeedRepository) r2
            X.4HN r4 = r2.A03
            r5 = 0
            boolean r11 = com.instagram.newsfeed.data.ActivityFeedRepository.A00(r2)
            r0.A00 = r3
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r0
            r10 = r3
            java.lang.Object r4 = r4.A00(r5, r6, r7, r8, r9, r10, r11)
            if (r4 != r1) goto L_0x0173
            return r1
        L_0x020f:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x002c
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0218:
            X.1Hj r6 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            r1 = 0
            if (r2 == 0) goto L_0x024c
            X.0eS.A00(r4)
        L_0x0223:
            X.9IZ r4 = (X.AnonymousClass9IZ) r4
            java.lang.Object r5 = r0.A02
            X.2kn r5 = (X.C228102kn) r5
            com.instagram.common.session.UserSession r0 = r5.A07
            com.instagram.reels.store.ReelStore r3 = X.1OP.A05(r0)
            java.lang.Object r2 = r4.A03
            X.3HX r2 = (X.AnonymousClass3HX) r2
            if (r2 == 0) goto L_0x002c
            r0 = 0
            com.instagram.model.reels.Reel r0 = r3.A0I(r2, r0)
            r3.A0Y(r0)
            X.19S r3 = X.AnonymousClass1HX.A00()
            r2 = 7
            X.MFx r0 = new X.MFx
            r0.<init>(r5, r1, r2)
            X.1Er r1 = X.C51966G9m.A1L(r0, r3)
            return r1
        L_0x024c:
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A02
            X.2kn r2 = (X.C228102kn) r2
            com.instagram.common.session.UserSession r4 = r2.A07
            r2 = 28
            X.G2c r3 = new X.G2c
            r3.<init>(r4, r2)
            java.lang.Class<X.3Np> r2 = X.C241033Np.class
            java.lang.Object r2 = r4.A01(r2, r3)
            X.3Nm r2 = (X.C241003Nm) r2
            X.3Np r2 = (X.C241033Np) r2
            X.0eM r2 = r2.A00
            java.lang.Object r2 = r2.getValue()
            X.3Nr r2 = (X.C241053Nr) r2
            X.2Q9 r2 = r2.AvE()
            r0.A00 = r5
            java.lang.Object r4 = X.JTO.A10(r2, r0)
            if (r4 != r6) goto L_0x0223
            return r6
        L_0x027b:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 != 0) goto L_0x0801
            X.0eS.A00(r4)
            java.lang.Object r4 = r0.A02
            com.instagram.wonderwall.repository.AggregatedWallFeedRepository r4 = (com.instagram.wonderwall.repository.AggregatedWallFeedRepository) r4
            r3 = 0
            X.05G r2 = r4.A04
            java.util.Collection r2 = X.JTO.A13(r2)
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ 1
            r0.A00 = r5
            java.lang.Object r0 = com.instagram.wonderwall.repository.AggregatedWallFeedRepository.A00(r4, r3, r0, r5, r2)
            goto L_0x002a
        L_0x029e:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 != 0) goto L_0x0724
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A02
            com.instagram.arp.api.AvatarTaskHelper r2 = (com.instagram.arp.api.AvatarTaskHelper) r2
            r0.A00 = r5
            com.instagram.common.session.UserSession r9 = r2.A00
            java.lang.String r7 = "Error fetching persist ID for query: "
            r2 = 3395(0xd43, float:4.757E-42)
            java.lang.String r10 = X.C273654mx.A00(r2)
            r6 = 0
            org.json.JSONObject r8 = X.DbS.A11()
            r4 = 0
            org.json.JSONObject r11 = X.C278474ww.A04(r9)     // Catch:{ JSONException -> 0x02f7 }
            r2 = 3393(0xd41, float:4.755E-42)
            java.lang.String r3 = X.C273654mx.A00(r2)     // Catch:{ JSONException -> 0x02f7 }
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ JSONException -> 0x02f7 }
            r12.<init>()     // Catch:{ JSONException -> 0x02f7 }
            r2 = 511(0x1ff, float:7.16E-43)
            java.lang.String r2 = X.C273654mx.A00(r2)     // Catch:{ JSONException -> 0x02f7 }
            org.json.JSONArray r12 = r12.put(r2)     // Catch:{ JSONException -> 0x02f7 }
            java.lang.String r2 = "ZIP"
            org.json.JSONArray r2 = r12.put(r2)     // Catch:{ JSONException -> 0x02f7 }
            X.0qQ.A07(r2)     // Catch:{ JSONException -> 0x02f7 }
            org.json.JSONObject r3 = r8.put(r3, r2)     // Catch:{ JSONException -> 0x02f7 }
            java.lang.String r2 = "device_capabilities"
            r3.put(r2, r11)     // Catch:{ JSONException -> 0x02f7 }
            boolean r2 = r11.has(r10)     // Catch:{ JSONException -> 0x02f7 }
            if (r2 == 0) goto L_0x0307
            java.lang.Object r2 = r11.get(r10)     // Catch:{ JSONException -> 0x02f7 }
            r8.put(r10, r2)     // Catch:{ JSONException -> 0x02f7 }
            goto L_0x0307
        L_0x02f7:
            r10 = move-exception
            java.lang.String r3 = "CameraEffectApiUtil"
            r2 = 934(0x3a6, float:1.309E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.lang.String r2 = X.AnonymousClass7TF.A0m(r2, r10)
            X.0kD.A07(r3, r2, r4)
        L_0x0307:
            X.4LU r2 = X.AnonymousClass4LT.A01     // Catch:{ IOException -> 0x033f, JSONException -> 0x0334 }
            X.4LT r3 = r2.A00()     // Catch:{ IOException -> 0x033f, JSONException -> 0x0334 }
            java.lang.String r2 = "IGAvatarEffects"
            java.lang.String r3 = r3.clientDocIdForQuery(r2)     // Catch:{ IOException -> 0x033f, JSONException -> 0x0334 }
            if (r3 == 0) goto L_0x0349
            X.1NY r7 = X.AnonymousClass7TG.A0a(r9)
            java.lang.String r2 = "creatives/camera_effects_graphql/"
            r7.A0A(r2)
            java.lang.String r2 = "client_doc_id"
            r7.A9m(r2, r3)
            java.lang.String r3 = r8.toString()
            java.lang.String r2 = "query_params"
            r7.A9m(r2, r3)
            java.lang.Class<X.UXs> r3 = X.C15258UXs.class
            java.lang.Class<X.Vmr> r2 = X.C18177Vmr.class
            r7.A0O(r4, r3, r2, r6)
            goto L_0x03ae
        L_0x0334:
            r0 = move-exception
            java.lang.String r1 = "CameraEffectApiUtil"
            java.lang.String r0 = X.AnonymousClass7TF.A0m(r7, r0)
            X.0kD.A07(r1, r0, r4)
            goto L_0x0349
        L_0x033f:
            r0 = move-exception
            java.lang.String r1 = "CameraEffectApiUtil"
            java.lang.String r0 = X.AnonymousClass7TF.A0m(r7, r0)
            X.0kD.A07(r1, r0, r4)
        L_0x0349:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x034e:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 != 0) goto L_0x0724
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A02
            com.instagram.arp.api.AvatarTaskHelper r2 = (com.instagram.arp.api.AvatarTaskHelper) r2
            r0.A00 = r5
            com.instagram.common.session.UserSession r9 = r2.A00
            java.lang.String r7 = "Error fetching persist ID for query: "
            r6 = 0
            org.json.JSONObject r8 = X.DbS.A11()
            r4 = 0
            java.lang.String r3 = "device_capabilities"
            org.json.JSONObject r2 = X.C278474ww.A04(r9)     // Catch:{ JSONException -> 0x0372 }
            r8.put(r3, r2)     // Catch:{ JSONException -> 0x0372 }
            goto L_0x0382
        L_0x0372:
            r10 = move-exception
            java.lang.String r3 = "CameraEffectApiUtil"
            r2 = 934(0x3a6, float:1.309E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.lang.String r2 = X.AnonymousClass7TF.A0m(r2, r10)
            X.0kD.A07(r3, r2, r4)
        L_0x0382:
            X.4LU r2 = X.AnonymousClass4LT.A01     // Catch:{ IOException -> 0x03c5, JSONException -> 0x03ba }
            X.4LT r3 = r2.A00()     // Catch:{ IOException -> 0x03c5, JSONException -> 0x03ba }
            java.lang.String r2 = "IGAvatarStatus"
            java.lang.String r3 = r3.clientDocIdForQuery(r2)     // Catch:{ IOException -> 0x03c5, JSONException -> 0x03ba }
            if (r3 == 0) goto L_0x03cf
            X.1NY r7 = X.AnonymousClass7TG.A0a(r9)
            java.lang.String r2 = "creatives/camera_effects_graphql/"
            r7.A0A(r2)
            java.lang.String r2 = "client_doc_id"
            r7.A9m(r2, r3)
            java.lang.String r3 = r8.toString()
            java.lang.String r2 = "query_params"
            r7.A9m(r2, r3)
            java.lang.Class<X.UXt> r3 = X.C15259UXt.class
            java.lang.Class<X.Vms> r2 = X.C18178Vms.class
            r7.A0O(r4, r3, r2, r6)
        L_0x03ae:
            X.1OC r3 = X.DbT.A0U(r7, r5)
            r2 = 710(0x2c6, float:9.95E-43)
            java.lang.Object r4 = r3.A00(r2, r0)
            goto L_0x06d9
        L_0x03ba:
            r0 = move-exception
            java.lang.String r1 = "CameraEffectApiUtil"
            java.lang.String r0 = X.AnonymousClass7TF.A0m(r7, r0)
            X.0kD.A07(r1, r0, r4)
            goto L_0x03cf
        L_0x03c5:
            r0 = move-exception
            java.lang.String r1 = "CameraEffectApiUtil"
            java.lang.String r0 = X.AnonymousClass7TF.A0m(r7, r0)
            X.0kD.A07(r1, r0, r4)
        L_0x03cf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x03d4:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x044c
            X.0eS.A00(r4)
        L_0x03de:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r1 = r4 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x081a
            X.3lr r5 = X.C41846B3n.A0R(r4)
            if (r5 == 0) goto L_0x081a
            java.lang.Class<X.BdV> r4 = X.C42488BdV.class
            r8 = 0
            r1 = 1361(0x551, float:1.907E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            r1 = 914277064(0x367ec2c8, float:3.7962327E-6)
            X.3lr r4 = r5.getRequiredTreeField(r8, r2, r4, r1)
            if (r4 == 0) goto L_0x081a
            java.lang.Class<X.BdY> r2 = X.C42491BdY.class
            r1 = 972202711(0x39f2a2d7, float:4.6279162E-4)
            X.3lr r7 = r4.reinterpretRequired(r8, r2, r1)
            if (r7 == 0) goto L_0x081a
            java.lang.Object r6 = r0.A02
            X.JUB r6 = (X.JUB) r6
            java.lang.Class<X.BdX> r2 = X.C42490BdX.class
            r0 = 881(0x371, float:1.235E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            r0 = -1845678302(0xffffffff91fd2f22, float:-3.994541E-28)
            com.google.common.collect.ImmutableList r0 = r7.getRequiredCompactedTreeListField(r3, r1, r2, r0)
            java.util.ArrayList r5 = X.DbV.A15(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x0422:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0489
            java.lang.Object r1 = r9.next()
            X.3lr r1 = (X.C250663lr) r1
            X.0qQ.A0A(r1)
            java.lang.String r0 = "pk"
            java.lang.String r4 = r1.getOptionalStringField(r8, r0)
            if (r4 == 0) goto L_0x0422
            java.lang.String r0 = "profile_pic_url"
            java.lang.String r2 = r1.getOptionalStringField(r3, r0)
            if (r2 == 0) goto L_0x0422
            r1 = 19
            X.N49 r0 = new X.N49
            r0.<init>(r4, r2, r1)
            r5.add(r0)
            goto L_0x0422
        L_0x044c:
            X.0eS.A00(r4)
            r11 = 0
            X.2IS r4 = X.C41845B3m.A04()
            X.2IS r2 = X.C41845B3m.A04()
            X.1vR r5 = X.C41845B3m.A05()
            java.util.Map r7 = r4.getParamsCopy()
            java.util.Map r8 = r2.getParamsCopy()
            java.lang.Class<X.BdW> r9 = X.C42489BdW.class
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()
            java.lang.String r6 = "ContentNotesClipsEntry"
            r10 = 0
            r2 = 1361(0x551, float:1.907E-42)
            java.lang.String r14 = X.AnonymousClass000.A00(r2)
            com.facebook.pando.PandoGraphQLRequest r4 = new com.facebook.pando.PandoGraphQLRequest
            r12 = r10
            r13 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r2 = r0.A02
            X.JUB r2 = (X.JUB) r2
            X.1vn r2 = r2.A01
            r0.A00 = r3
            java.lang.Object r4 = r2.A04(r4, r0)
            if (r4 != r1) goto L_0x03de
            return r1
        L_0x0489:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0498
            X.KJZ r0 = X.KJZ.A00
        L_0x0491:
            X.05G r1 = r6.A02
            r1.Epw(r0)
            goto L_0x081a
        L_0x0498:
            r0 = 2440(0x988, float:3.419E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r1 = r7.getCoercedBooleanField(r8, r0)
            X.KJY r0 = new X.KJY
            r0.<init>(r5, r1)
            goto L_0x0491
        L_0x04a8:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x0518
            X.0eS.A00(r4)
        L_0x04b2:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r1 = r4 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x081a
            java.lang.Object r5 = r0.A02
            X.7wr r5 = (X.C347467wr) r5
            com.instagram.common.session.UserSession r0 = r5.A02
            X.7xL r6 = X.C347757xK.A00(r0)
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            if (r0 == 0) goto L_0x0516
            java.lang.Object r4 = r0.A01
            X.3lr r4 = (X.C250663lr) r4
            if (r4 == 0) goto L_0x0516
            java.lang.Class<X.7xM> r2 = X.C347777xM.class
            r7 = 0
            java.lang.String r1 = "me"
            r0 = -932571687(0xffffffffc86a15d9, float:-239703.39)
            X.3lr r2 = r4.getOptionalTreeField(r7, r1, r2, r0)
            if (r2 == 0) goto L_0x0516
            java.lang.Class<X.7xN> r1 = X.C347787xN.class
            r0 = -1402345063(0xffffffffac69e999, float:-3.3240964E-12)
            X.3lr r4 = r2.reinterpretRequired(r3, r1, r0)
            if (r4 == 0) goto L_0x0516
            java.lang.Class<X.7xO> r2 = X.C347797xO.class
            java.lang.String r1 = "cxp_crosspost_settings"
            r0 = 19068864(0x122f7c0, float:2.9932453E-38)
            X.3lr r2 = r4.getOptionalTreeField(r7, r1, r2, r0)
            if (r2 == 0) goto L_0x0516
            X.7xP r1 = X.C347807xP.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "threads_feed_crosspost_user_preference"
            java.lang.Enum r1 = r2.getOptionalEnumField(r7, r0, r1)
        L_0x04fe:
            X.7xP r0 = X.C347807xP.ON
            boolean r2 = X.AnonymousClass7TF.A1W(r1, r0)
            X.0xa r0 = r6.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "PREFERENCE_SHARE_TO_BARCELONA_AUTO_POSTING"
            r1.E5T(r0, r2)
            r1.apply()
            r5.A00 = r3
            goto L_0x081a
        L_0x0516:
            r1 = 0
            goto L_0x04fe
        L_0x0518:
            X.0eS.A00(r4)
            r13 = 0
            X.2IS r4 = X.C41845B3m.A04()
            X.2IS r2 = X.C41845B3m.A04()
            X.1vR r7 = X.C41845B3m.A05()
            java.util.Map r9 = r4.getParamsCopy()
            java.util.Map r10 = r2.getParamsCopy()
            java.lang.Class<X.7x3> r11 = X.C347587x3.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "CrosspostingToBaracelonaSettingsQuery"
            r12 = 0
            java.lang.String r16 = "me"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r4 = 0
            r6.setMaxToleratedCacheAgeMs(r4)
            r6.setFreshCacheAgeMs(r4)
            java.lang.Object r2 = r0.A02
            X.7wr r2 = (X.C347467wr) r2
            com.instagram.common.session.UserSession r2 = r2.A02
            X.1vn r2 = X.1vm.A01(r2)
            r0.A00 = r3
            java.lang.Object r4 = r2.A04(r6, r0)
            if (r4 != r1) goto L_0x04b2
            return r1
        L_0x055d:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r11 = 1
            if (r2 == 0) goto L_0x0574
            X.0eS.A00(r4)
        L_0x0567:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0700
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0704
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0574:
            X.0eS.A00(r4)
            X.0K0 r4 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r11)
            r2 = 1528(0x5f8, float:2.141E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.0Df r6 = X.C41845B3m.A03(r4, r3, r2)
            java.lang.Object r2 = r0.A02
            X.KWk r2 = (X.C62032KWk) r2
            com.instagram.common.session.UserSession r2 = r2.A01
            r0.A00 = r11
            X.1vn r4 = X.1vm.A01(r2)
            X.2IS r5 = X.C41845B3m.A04()
            X.2IS r3 = X.C41845B3m.A04()
            java.lang.String r2 = "data"
            X.1vR r6 = X.C41847B3o.A04(r6, r5, r2)
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r3.getParamsCopy()
            java.lang.Class<X.BiQ> r10 = X.C42790BiQ.class
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            java.lang.String r7 = "IGDirectSetIsServiceProviderTOSSignedMutation"
            r12 = 0
            r13 = 0
            java.lang.String r15 = "set_is_service_provider_tos_signed"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r4 = r4.A04(r5, r0)
            if (r4 != r1) goto L_0x0567
            return r1
        L_0x05c2:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x0640
            X.0eS.A00(r4)
        L_0x05cc:
            X.3Ii r4 = (X.C239803Ii) r4
            java.lang.Object r5 = r0.A02
            X.KWk r5 = (X.C62032KWk) r5
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0637
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            X.05G r7 = r5.A06
            java.lang.Object r6 = r0.A01
            X.3lr r6 = (X.C250663lr) r6
            if (r6 == 0) goto L_0x0603
            java.lang.Class<X.BiN> r4 = X.C42787BiN.class
            r2 = 0
            r0 = 1968(0x7b0, float:2.758E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -1854709179(0xffffffff91736245, float:-1.9199602E-28)
            X.3lr r1 = r6.getOptionalTreeField(r2, r1, r4, r0)
            if (r1 == 0) goto L_0x0603
            r0 = 1528(0x5f8, float:2.141E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r1 = r1.getCoercedBooleanField(r2, r0)
            r0 = 1
            if (r1 == r3) goto L_0x0604
        L_0x0603:
            r0 = 0
        L_0x0604:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.NW5 r0 = new X.NW5
            r0.<init>(r1)
            r7.Epw(r0)
            X.1Av r0 = r5.A02
            r0.A0Y(r3)
            X.3Ih r4 = X.C51967G9n.A0d()
        L_0x0619:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x081a
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x068b
            X.05G r2 = r5.A06
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0u()
            X.NW5 r0 = new X.NW5
            r0.<init>(r1)
            r2.Epw(r0)
            X.1Av r1 = r5.A02
            r0 = 2
            r1.A0Y(r0)
            goto L_0x081a
        L_0x0637:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0619
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0640:
            X.0eS.A00(r4)
            java.lang.Object r4 = r0.A02
            X.KWk r4 = (X.C62032KWk) r4
            X.05G r2 = r4.A06
            java.lang.Object r2 = r2.getValue()
            boolean r2 = r2 instanceof X.KR4
            if (r2 == 0) goto L_0x081a
            com.instagram.common.session.UserSession r2 = r4.A01
            r0.A00 = r3
            X.1vn r4 = X.1vm.A01(r2)
            r12 = 0
            X.2IS r5 = X.C41845B3m.A04()
            X.2IS r2 = X.C41845B3m.A04()
            X.1vR r6 = X.C41845B3m.A05()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r2.getParamsCopy()
            java.lang.Class<X.BiO> r10 = X.C42788BiO.class
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            java.lang.String r7 = "IGDirectIsServiceProviderTOSSignedQuery"
            r11 = 0
            r2 = 1968(0x7b0, float:2.758E-42)
            java.lang.String r15 = X.AnonymousClass000.A00(r2)
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r4 = r4.A04(r5, r0)
            if (r4 != r1) goto L_0x05cc
            return r1
        L_0x068b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0690:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 != 0) goto L_0x0724
            X.0eS.A00(r4)
            java.lang.Object r3 = r0.A02
            X.Jib r3 = (X.C60280Jib) r3
            X.K1d r2 = r3.A07
            com.instagram.igtv.repository.series.IGTVSeriesRepository r6 = r3.A0B
            X.L1c r7 = r3.A06
            java.lang.String r8 = r2.A03
            X.0qQ.A07(r8)
            java.lang.String r9 = r2.A06
            java.lang.String r10 = r2.A04
            java.lang.String r2 = r2.A07
            r0.A00 = r5
            r11 = r2
            r12 = r0
            java.lang.Object r4 = r6.A00(r7, r8, r9, r10, r11, r12)
            goto L_0x06d9
        L_0x06b8:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 != 0) goto L_0x0724
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A02
            X.Jib r2 = (X.C60280Jib) r2
            com.instagram.igtv.repository.series.IGTVSeriesRepository r5 = r2.A0B
            X.L1c r4 = r2.A06
            X.K1d r2 = r2.A07
            java.lang.String r3 = r2.A03
            X.0qQ.A07(r3)
            java.lang.String r2 = r2.A07
            r0.A00 = r6
            java.lang.Object r4 = r5.A01(r4, r3, r2, r0)
        L_0x06d9:
            if (r4 != r1) goto L_0x0704
            return r1
        L_0x06dc:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x070e
            X.0eS.A00(r4)
        L_0x06e6:
            X.3Ii r4 = (X.C239803Ii) r4
            java.lang.Object r1 = r0.A02
            com.instagram.comments.mvvm.data.MediaCommentListRepository r1 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r1
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0705
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r3 = r4.A00
            X.7a5 r2 = r1.A05
            r1 = 18
            X.J6O r0 = new X.J6O
            r0.<init>(r3, r1)
            r2.A01(r0)
        L_0x0700:
            X.3Ih r4 = X.C51967G9n.A0d()
        L_0x0704:
            return r4
        L_0x0705:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0704
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x070e:
            X.0eS.A00(r4)
            java.lang.Object r4 = r0.A02
            com.instagram.comments.mvvm.data.MediaCommentListRepository r4 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r4
            X.GmL r2 = r4.A04
            java.lang.String r3 = r2.A0E
            com.instagram.common.session.UserSession r2 = r4.A0B
            r0.A00 = r5
            java.lang.Object r4 = com.instagram.comments.mvvm.data.network.MediaParentCommentNetworkFetcherKt.A02(r2, r3, r0)
            if (r4 != r1) goto L_0x06e6
            return r1
        L_0x0724:
            X.0eS.A00(r4)
            return r4
        L_0x0728:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x0766
            X.0eS.A00(r4)
        L_0x0732:
            java.lang.Object r2 = r0.A02
            X.LOb r2 = (X.C64113LOb) r2
            X.UwR r1 = r2.A04
            java.util.concurrent.ConcurrentHashMap r0 = X.C18409VrB.A01
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x0754
            X.6Yz r0 = r2.A00
            if (r0 == 0) goto L_0x0754
            instagram.features.stories.fragment.ReelViewerFragment r1 = r0.A00
            X.6fm r0 = r1.mViewPager
            X.6fl r0 = (X.C313046fl) r0
            android.view.ViewGroup r2 = r0.A02
            java.lang.Runnable r0 = r1.A3L
        L_0x074e:
            r2.post(r0)
        L_0x0751:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0754:
            X.6Yz r1 = r2.A00
            if (r1 == 0) goto L_0x0751
            instagram.features.stories.fragment.ReelViewerFragment r0 = r1.A00
            X.6fm r0 = r0.mViewPager
            X.6fl r0 = (X.C313046fl) r0
            android.view.ViewGroup r2 = r0.A02
            X.M5e r0 = new X.M5e
            r0.<init>(r1)
            goto L_0x074e
        L_0x0766:
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A02
            X.LOb r2 = (X.C64113LOb) r2
            X.UwR r6 = r2.A04
            r0.A00 = r3
            java.util.concurrent.ConcurrentHashMap r2 = X.C18409VrB.A01
            X.3Pl r5 = X.JTQ.A0m(r0)
            java.util.Map r2 = X.C18409VrB.A00
            java.lang.Object r4 = r2.get(r6)
            X.9DH r4 = (X.AnonymousClass9DH) r4
            if (r4 != 0) goto L_0x078c
            r3 = 0
        L_0x0782:
            r5.resumeWith(r3)
        L_0x0785:
            java.lang.Object r2 = r5.A00()
            if (r2 != r1) goto L_0x0732
            return r1
        L_0x078c:
            boolean r2 = r4.A02()
            if (r2 == 0) goto L_0x079e
            java.lang.Object r3 = r4.A00()
        L_0x0796:
            if (r3 == 0) goto L_0x0782
            java.util.concurrent.ConcurrentHashMap r2 = X.C18409VrB.A01
            r2.put(r6, r3)
            goto L_0x0782
        L_0x079e:
            r3 = 2
            X.Lb0 r2 = new X.Lb0
            r2.<init>(r3, r5, r6)
            r4.A00 = r2
            java.lang.Object r3 = r4.A00()
            if (r3 == 0) goto L_0x0785
            goto L_0x0796
        L_0x07ad:
            r6 = r4
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x07b9
            X.0eS.A00(r4)
            return r6
        L_0x07b9:
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A02
            X.F3K r2 = (X.F3K) r2
            com.instagram.common.session.UserSession r2 = r2.A01
            r0.A00 = r3
            X.1NY r4 = X.AnonymousClass7TG.A0a(r2)
            java.lang.String r2 = "mental_well_being/update_last_seen_timezone/"
            r4.A0A(r2)
            java.util.TimeZone r2 = java.util.TimeZone.getDefault()
            java.lang.String r3 = r2.getID()
            X.0qQ.A07(r3)
            r2 = 687(0x2af, float:9.63E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.DbX.A1M(r4, r2, r3)
            X.1OC r3 = r4.A0M()
            r2 = 1440554863(0x55dd1f6f, float:3.03908845E13)
            java.lang.Object r6 = r3.A00(r2, r0)
            if (r6 != r1) goto L_0x07ef
            return r1
        L_0x07ef:
            return r6
        L_0x07f0:
            java.lang.String r0 = "Unable to delete migrated keys from SharedPreferences."
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x07f7:
            com.instagram.common.session.UserSession r0 = r5.A01
            X.C294685mr.A00(r0, r3)
            X.3Ih r1 = X.C51967G9n.A0d()
            return r1
        L_0x0801:
            X.0eS.A00(r4)
            goto L_0x081a
        L_0x0805:
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0833
            long r3 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            r0 = 12
            long r0 = r2.toMillis(r0)
            long r3 = r3 + r0
            r5.A00 = r3
        L_0x081a:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x081d:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x084a
            X.0eS.A00(r4)
        L_0x0827:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r1 = r4 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x081a
            java.lang.Object r5 = r0.A02
            X.JZv r5 = (X.C59821JZv) r5
            X.05G r2 = r5.A04
        L_0x0833:
            java.lang.Object r1 = r2.getValue()
            r0 = r4
            X.3Ih r0 = (X.C239793Ih) r0
            java.lang.Object r0 = r0.A00
            X.CES r0 = (X.CES) r0
            X.X9y r0 = r0.A00
            if (r0 != 0) goto L_0x0805
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x084a:
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A02
            X.JZv r2 = (X.C59821JZv) r2
            com.instagram.common.session.UserSession r2 = r2.A03
            r0.A00 = r3
            r6 = 0
            X.0qQ.A0B(r2, r6)
            r5 = 0
            X.1NY r4 = X.DbU.A0M(r2)
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            r4.A08(r2)
            java.lang.String r2 = "fbsearch/nullstate_meta_ai_suggestions/"
            r4.A0A(r2)
            java.lang.Class<X.CES> r3 = X.CES.class
            java.lang.Class<X.CzF> r2 = X.C45603CzF.class
            X.1OC r4 = X.DbT.A0R(r5, r4, r3, r2, r6)
            r3 = 1957986924(0x74b4826c, float:1.1441146E32)
            r2 = 3
            java.lang.Object r4 = r4.A02(r0, r3, r2, r6)
            if (r4 != r1) goto L_0x0827
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59675JTg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
