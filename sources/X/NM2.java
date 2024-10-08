package X;

import android.util.LruCache;

public final class NM2 extends 1P0 {
    public final int A00;
    public final Object A01;
    public final String A02;

    public NM2(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void onFail(C268654dm r6) {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(1313057315);
                C70959OTg oTg = (C70959OTg) this.A01;
                String str = this.A02;
                11Z.A02(new C73289Pa7(oTg.A04.A01(AnonymousClass05K.A01, str), oTg, str));
                i2 = -793231926;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-1753489623);
                C70959OTg oTg2 = (C70959OTg) this.A01;
                String str2 = this.A02;
                11Z.A02(new C73289Pa7(oTg2.A04.A01(AnonymousClass05K.A0C, str2), oTg2, str2));
                i2 = 1516510196;
                break;
            case 3:
                i = AnonymousClass0fD.A03(719130524);
                C39887ADj aDj = (C39887ADj) this.A01;
                Integer num = AnonymousClass05K.A0C;
                LruCache lruCache = C39887ADj.A04;
                C357938a6 r0 = aDj.A00;
                if (r0 != null) {
                    r0.DPT(num);
                    aDj.A00 = null;
                }
                0wb.A03("MusicEditLyricsHelper", 002.A0R("lyrics fetching failed for musicAssetId = ", this.A02));
                i2 = 1213747224;
                break;
            case 4:
                i = AnonymousClass0fD.A03(1967123791);
                ((OLG) this.A01).A01.A05(this.A02, 0);
                i2 = -1097922194;
                break;
            default:
                NM2.super.onFail(r6);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r13v3 */
    /* JADX WARNING: type inference failed for: r13v4, types: [X.Pry] */
    /* JADX WARNING: type inference failed for: r13v8 */
    /* JADX WARNING: type inference failed for: r13v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        if (r1.A0S != false) goto L_0x0076;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r33) {
        /*
            r32 = this;
            r0 = r32
            r2 = r33
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x033d;
                case 1: goto L_0x02f3;
                case 2: goto L_0x016e;
                case 3: goto L_0x0119;
                default: goto L_0x0009;
            }
        L_0x0009:
            r1 = -541293835(0xffffffffdfbc82f5, float:-2.7167378E19)
            int r4 = X.AnonymousClass0fD.A03(r1)
            X.5u7 r2 = (X.C298835u7) r2
            r1 = 1221513182(0x48cecfde, float:423550.94)
            int r8 = X.AnonymousClass0fD.A03(r1)
            r7 = 0
            X.0qQ.A0B(r2, r7)
            java.util.List r1 = r2.Ao4()
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r1.iterator()
        L_0x0029:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x003d
            java.lang.Object r1 = r2.next()
            X.4bN r1 = (X.C267324bN) r1
            X.1Xj r1 = r1.A02
            if (r1 == 0) goto L_0x0029
            r6.add(r1)
            goto L_0x0029
        L_0x003d:
            java.lang.Object r5 = r0.A01
            X.OLG r5 = (X.OLG) r5
            X.O9q r1 = r5.A00
            if (r1 == 0) goto L_0x0103
            X.Neo r3 = r1.A00
            X.Ocu r9 = r3.A0Q
            r2 = 1
            X.PNL r1 = new X.PNL
            r1.<init>(r2)
            r9.A05(r1)
            X.N93 r9 = r3.A00
            if (r9 == 0) goto L_0x0103
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.List r1 = r3.A02
            if (r1 == 0) goto L_0x00c7
            r2.addAll(r1)
        L_0x0061:
            boolean r1 = r3.A06
            if (r1 != 0) goto L_0x0076
            boolean r1 = X.DbT.A1b(r6)
            if (r1 == 0) goto L_0x0076
            X.Pry r1 = r3.A01
            X.N9i r1 = (X.C68295N9i) r1
            if (r1 == 0) goto L_0x0076
            boolean r1 = r1.A0S
            r15 = 1
            if (r1 == 0) goto L_0x0077
        L_0x0076:
            r15 = 0
        L_0x0077:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.List r10 = r3.A03
            if (r10 == 0) goto L_0x00b2
            r1.addAll(r10)
        L_0x0082:
            X.N36 r11 = r9.A00
            java.util.Iterator r12 = r6.iterator()
        L_0x0088:
            boolean r9 = r12.hasNext()
            r13 = 0
            if (r9 == 0) goto L_0x00d1
            java.lang.Object r10 = r12.next()
            X.1Xj r10 = (X.1Xj) r10
            X.OMP r9 = r3.A0M
            X.N54 r10 = r9.A00(r10)
            r2.add(r10)
            X.OVG r9 = r3.A0V
            if (r11 == 0) goto L_0x00a4
            java.lang.Integer r13 = r11.A02
        L_0x00a4:
            X.N9i r10 = r9.A01(r10, r13)
            r9 = -33
            X.N9i r9 = X.C68295N9i.A00((X.C74438Put) null, (com.instagram.common.typedurl.ImageUrl) null, r10, (X.AnonymousClass3TO) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.util.List) null, 0.0f, 0, r9, 2047, false, false, false, false, false, false, false, false)
            r1.add(r9)
            goto L_0x0088
        L_0x00b2:
            X.Pry r10 = r3.A01
            X.N9i r10 = (X.C68295N9i) r10
            if (r10 == 0) goto L_0x0082
            r11 = 1064514355(0x3f733333, float:0.95)
            r12 = -1
            r13 = 1663(0x67f, float:2.33E-42)
            r14 = r7
            X.N9i r10 = X.C68295N9i.A00((X.C74438Put) null, (com.instagram.common.typedurl.ImageUrl) null, r10, (X.AnonymousClass3TO) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.util.List) null, r11, 0, r12, r13, false, false, false, false, r14, false, r15, false)
            r1.add(r10)
            goto L_0x0082
        L_0x00c7:
            X.N36 r1 = r9.A00
            if (r1 == 0) goto L_0x0061
            X.Put r1 = r1.A00
            r2.add(r1)
            goto L_0x0061
        L_0x00d1:
            X.Pry r15 = r3.A01
            X.N9i r15 = (X.C68295N9i) r15
            if (r15 == 0) goto L_0x00fc
            r20 = 0
            r22 = -1
            r23 = 1535(0x5ff, float:2.151E-42)
            r14 = r13
            r16 = r13
            r17 = r13
            r18 = r13
            r19 = r1
            r21 = r7
            r24 = r7
            r25 = r7
            r26 = r7
            r27 = r7
            r28 = r7
            r29 = r7
            r30 = r7
            r31 = r7
            X.N9i r13 = X.C68295N9i.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x00fc:
            r3.A0J(r13)
            r3.A02 = r2
            r3.A03 = r1
        L_0x0103:
            X.OZx r2 = r5.A01
            java.lang.String r1 = r0.A02
            int r0 = r6.size()
            r2.A05(r1, r0)
            r0 = 2009695196(0x77c983dc, float:8.1744226E33)
            X.AnonymousClass0fD.A0A(r0, r8)
            r0 = -1572019738(0xffffffffa24ce1e6, float:-2.7766745E-18)
            goto L_0x0385
        L_0x0119:
            r1 = 823367371(0x311396cb, float:2.1477031E-9)
            int r4 = X.AnonymousClass0fD.A03(r1)
            X.9hX r2 = (X.C384569hX) r2
            r1 = 469039234(0x1bf4f882, float:4.0527008E-22)
            int r3 = X.AnonymousClass7TG.A0D(r2, r1)
            X.9SE r5 = r2.A00
            if (r5 != 0) goto L_0x014a
            java.lang.Object r2 = r0.A01
            X.ADj r2 = (X.C39887ADj) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            android.util.LruCache r0 = X.C39887ADj.A04
            X.8a6 r0 = r2.A00
            if (r0 == 0) goto L_0x013f
            r0.DPT(r1)
            r0 = 0
            r2.A00 = r0
        L_0x013f:
            r0 = 1459566356(0x56ff3714, float:1.40306012E14)
        L_0x0142:
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 648529943(0x26a7c817, float:1.1642187E-15)
            goto L_0x0385
        L_0x014a:
            android.util.LruCache r1 = X.C39887ADj.A04
            java.lang.String r2 = r0.A02
            r1.put(r2, r5)
            java.lang.Object r1 = r0.A01
            X.ADj r1 = (X.C39887ADj) r1
            java.lang.String r0 = r1.A01
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0167
            X.8a6 r0 = r1.A00
            if (r0 == 0) goto L_0x0167
            r0.DPU(r5)
            r0 = 0
            r1.A00 = r0
        L_0x0167:
            r0 = 0
            r1.A01 = r0
            r0 = -567978280(0xffffffffde2556d8, float:-2.97848684E18)
            goto L_0x0142
        L_0x016e:
            r1 = 115818648(0x6e74098, float:8.6987454E-35)
            int r4 = X.AnonymousClass0fD.A03(r1)
            X.3JC r2 = (X.AnonymousClass3JC) r2
            r1 = 1378139890(0x5224bef2, float:1.76894542E11)
            int r8 = X.AnonymousClass7TG.A0D(r2, r1)
            java.lang.Object r1 = r0.A01
            X.OTg r1 = (X.C70959OTg) r1
            java.lang.String r14 = r0.A02
            X.OMP r5 = r1.A04
            java.lang.Object r3 = r2.A01
            X.3FZ r3 = (X.AnonymousClass3FZ) r3
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.N51 r11 = r5.A01(r0, r14)
            if (r3 == 0) goto L_0x02e0
            java.lang.Class<X.N1q> r2 = X.C68127N1q.class
            java.lang.String r0 = "fb_media_sync_content"
            X.3FZ r2 = r3.A00(r2, r0)
            if (r2 == 0) goto L_0x02e0
            java.lang.Class<X.N1p> r3 = X.C68126N1p.class
            java.lang.String r0 = "fb_video"
            X.3FZ r0 = r2.A00(r3, r0)
            r25 = 0
            if (r0 == 0) goto L_0x02e0
            org.json.JSONObject r3 = r0.A00
            X.N25 r0 = new X.N25
            r0.<init>(r3)
            r3 = 347(0x15b, float:4.86E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            java.lang.String r7 = r0.A05(r3)
            if (r7 == 0) goto L_0x028e
            java.lang.String r3 = "height"
            org.json.JSONObject r6 = r0.A00
            int r5 = r6.optInt(r3)
            java.lang.String r3 = "width"
            int r3 = r6.optInt(r3)
            X.MbR r9 = new X.MbR
            r9.<init>(r7, r5, r3)
        L_0x01ce:
            java.lang.Class<X.N21> r5 = X.N21.class
            java.lang.String r3 = "image"
            X.3FZ r5 = r0.A00(r5, r3)
            if (r5 == 0) goto L_0x028a
            java.lang.String r3 = "uri"
            java.lang.String r7 = r5.A05(r3)
            if (r7 == 0) goto L_0x0286
            java.lang.String r3 = "height"
            org.json.JSONObject r6 = r5.A00
            int r5 = r6.optInt(r3)
            java.lang.String r3 = "width"
            int r3 = r6.optInt(r3)
            X.MbR r12 = new X.MbR
            r12.<init>(r7, r5, r3)
        L_0x01f3:
            X.N53 r11 = new X.N53
            java.lang.String r3 = "dash_manifest"
            java.lang.String r17 = r0.A05(r3)
            java.lang.String r3 = "playable_duration_in_ms"
            org.json.JSONObject r10 = r0.A00
            int r3 = r10.optInt(r3)
            long r5 = (long) r3
            java.lang.String r3 = "width"
            int r3 = r10.optInt(r3)
            float r7 = (float) r3
            java.lang.String r3 = "height"
            int r3 = r10.optInt(r3)
            float r3 = (float) r3
            float r7 = r7 / r3
            X.N2c r13 = new X.N2c
            r15 = r13
            r16 = r9
            r18 = r7
            r19 = r5
            r15.<init>(r16, r17, r18, r19)
            java.lang.Class<X.N23> r5 = X.N23.class
            java.lang.String r3 = "title"
            X.3FZ r5 = r0.A00(r5, r3)
            if (r5 == 0) goto L_0x0283
            java.lang.String r3 = "text"
            java.lang.String r15 = r5.A05(r3)
        L_0x022f:
            java.lang.Class<X.N22> r5 = X.N22.class
            java.lang.String r3 = "message"
            X.3FZ r5 = r0.A00(r5, r3)
            if (r5 == 0) goto L_0x0280
            java.lang.String r3 = "text"
            java.lang.String r16 = r5.A05(r3)
        L_0x023f:
            r3 = 1516(0x5ec, float:2.124E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            boolean r18 = r0.A06(r3)
            java.lang.String r3 = "can_viewer_report"
            boolean r19 = r0.A06(r3)
            java.lang.Class<X.N24> r5 = X.N24.class
            java.lang.String r3 = "video_available_captions_locales"
            com.google.common.collect.ImmutableList r3 = r0.A02(r3, r5)
            java.util.ArrayList r7 = X.DbV.A15(r3)
            java.util.Iterator r9 = r3.iterator()
        L_0x025f:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x0292
            java.lang.Object r6 = r9.next()
            r5 = r6
            X.3FZ r5 = (X.AnonymousClass3FZ) r5
            java.lang.String r3 = "locale"
            java.lang.String r3 = r5.A05(r3)
            if (r3 == 0) goto L_0x025f
            java.lang.String r3 = "localized_language"
            java.lang.String r3 = r5.A05(r3)
            if (r3 == 0) goto L_0x025f
            r7.add(r6)
            goto L_0x025f
        L_0x0280:
            r16 = r25
            goto L_0x023f
        L_0x0283:
            r15 = r25
            goto L_0x022f
        L_0x0286:
            r12 = r25
            goto L_0x01f3
        L_0x028a:
            r12 = r25
            goto L_0x01f3
        L_0x028e:
            r9 = r25
            goto L_0x01ce
        L_0x0292:
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r7)
            java.util.Iterator r7 = r7.iterator()
        L_0x029a:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x02d1
            java.lang.Object r3 = r7.next()
            X.3FZ r3 = (X.AnonymousClass3FZ) r3
            java.lang.String r5 = "locale"
            java.lang.String r21 = r3.A05(r5)
            X.0qQ.A0A(r21)
            java.lang.String r5 = "localized_language"
            java.lang.String r22 = r3.A05(r5)
            X.0qQ.A0A(r22)
            java.lang.String r5 = "localized_country"
            java.lang.String r23 = r3.A05(r5)
            java.lang.String r5 = "localized_creation_method"
            java.lang.String r24 = r3.A05(r5)
            r26 = 1
            X.QOp r3 = new X.QOp
            r20 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r6.add(r3)
            goto L_0x029a
        L_0x02d1:
            java.lang.String r3 = "is_non_interactable"
            r2.A06(r3)
            java.lang.String r2 = "cowatch_content_rating_text"
            r0.A05(r2)
            r17 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x02e0:
            X.Pa7 r0 = new X.Pa7
            r0.<init>(r11, r1, r14)
            X.11Z.A02(r0)
            r0 = 1316465409(0x4e77ab01, float:1.03879482E9)
            X.AnonymousClass0fD.A0A(r0, r8)
            r0 = -646632779(0xffffffffd9752ab5, float:-4.31302039E15)
            goto L_0x0385
        L_0x02f3:
            r1 = -813897001(0xffffffffcf7cead7, float:-4.2432489E9)
            int r4 = X.AnonymousClass0fD.A03(r1)
            X.1XO r2 = (X.1XO) r2
            r1 = -573944461(0xffffffffddca4d73, float:-1.82217925E18)
            int r8 = X.AnonymousClass7TG.A0D(r2, r1)
            java.lang.Object r7 = r0.A01
            X.OTg r7 = (X.C70959OTg) r7
            X.OMP r6 = r7.A04
            java.lang.String r5 = r0.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.N51 r3 = r6.A01(r0, r5)
            java.util.List r0 = r2.A06
            X.0qQ.A07(r0)
            java.lang.Object r1 = X.00k.A0J(r0)
            X.1Xj r1 = (X.1Xj) r1
            if (r1 == 0) goto L_0x032b
            com.instagram.common.session.UserSession r0 = r7.A03
            X.1E8 r0 = X.1E7.A00(r0)
            r0.A03(r1)
            X.N54 r3 = r6.A00(r1)
        L_0x032b:
            X.Pa7 r0 = new X.Pa7
            r0.<init>(r3, r7, r5)
            X.11Z.A02(r0)
            r0 = -931144398(0xffffffffc87fdd32, float:-262004.78)
            X.AnonymousClass0fD.A0A(r0, r8)
            r0 = -922508458(0xffffffffc903a356, float:-539189.4)
            goto L_0x0385
        L_0x033d:
            r1 = -131474481(0xfffffffff829dbcf, float:-1.3780569E34)
            int r4 = X.AnonymousClass0fD.A03(r1)
            X.Mo4 r2 = (X.C67449Mo4) r2
            r1 = -1611578521(0xffffffff9ff14367, float:-1.0217898E-19)
            int r5 = X.AnonymousClass7TG.A0D(r2, r1)
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            java.util.List r14 = r2.A01
            java.lang.String r11 = r2.A02
            java.lang.String r12 = r2.A03
            r9 = 0
            boolean r6 = r2.A04
            boolean r3 = r2.A05
            boolean r1 = r2.A06
            X.9P5 r7 = new X.9P5
            r10 = r9
            r13 = r9
            r15 = r9
            r16 = r6
            r17 = r3
            r18 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r3 = r0.A01
            X.WfD r3 = (X.C19772WfD) r3
            X.9PD r1 = r3.A01
            java.lang.String r0 = r0.A02
            r1.A9y(r7, r0)
            boolean r0 = r2.A06
            r3.A00 = r0
            X.C19772WfD.A00(r3)
            r0 = 757606127(0x2d2826ef, float:9.558339E-12)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1078368172(0xffffffffbfb96854, float:-1.4484963)
        L_0x0385:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NM2.onSuccess(java.lang.Object):void");
    }
}
