package X;

import java.util.UUID;

public final class H4W extends 1P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass3DY A01;
    public final /* synthetic */ C250973mM A02;
    public final /* synthetic */ AnonymousClass6VX A03;
    public final /* synthetic */ C233072uu A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ UUID A07;

    public H4W(AnonymousClass3DY r1, C250973mM r2, AnonymousClass6VX r3, C233072uu r4, String str, String str2, UUID uuid, int i) {
        this.A03 = r3;
        this.A05 = str;
        this.A00 = i;
        this.A06 = str2;
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = r4;
        this.A07 = uuid;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01eb, code lost:
        if (r12.A0X == null) goto L_0x01ed;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r26) {
        /*
            r25 = this;
            r6 = r26
            r0 = -1427802357(0xffffffffaae5770b, float:-4.0761174E-13)
            int r10 = X.AnonymousClass0fD.A03(r0)
            X.CFu r6 = (X.C43854CFu) r6
            r0 = -986545152(0xffffffffc5328400, float:-2856.25)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r4 = 0
            X.0qQ.A0B(r6, r4)
            X.CFV r7 = r6.A01
            if (r7 == 0) goto L_0x010d
            r11 = r25
            X.6VX r3 = r11.A03
            java.lang.String r0 = r11.A05
            r24 = r0
            int r0 = r11.A00
            r23 = r0
            java.lang.String r9 = r11.A06
            X.3DY r8 = r11.A01
            X.3mM r2 = r11.A02
            X.2uu r1 = r11.A04
            java.util.UUID r12 = r11.A07
            java.util.HashMap r0 = r7.A00
            if (r0 == 0) goto L_0x010d
            java.util.HashMap r13 = X.AnonymousClass7TE.A1E()
            java.util.Iterator r15 = X.AnonymousClass7TF.A0s(r0)
        L_0x003c:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0062
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r15)
            java.lang.Object r14 = r0.getKey()
            java.lang.Object r11 = r0.getValue()
            X.3HX r11 = (X.AnonymousClass3HX) r11
            com.instagram.common.session.UserSession r7 = r3.A00
            boolean r0 = X.AnonymousClass3P9.A07(r7, r11)
            if (r0 == 0) goto L_0x005e
            X.3HX r11 = X.AnonymousClass3P9.A00(r7, r11)
            if (r11 == 0) goto L_0x003c
        L_0x005e:
            r13.put(r14, r11)
            goto L_0x003c
        L_0x0062:
            com.instagram.common.session.UserSession r15 = r3.A00
            com.instagram.reels.store.ReelStore r7 = com.instagram.reels.store.ReelStore.A03(r15)
            java.util.Collection r0 = r13.values()
            java.util.ArrayList r7 = r7.A0S(r0)
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r7.iterator()
        L_0x0078:
            boolean r7 = r13.hasNext()
            if (r7 == 0) goto L_0x00ac
            java.lang.Object r7 = r13.next()
            com.instagram.model.reels.Reel r7 = (com.instagram.model.reels.Reel) r7
            com.instagram.api.schemas.IntentAwareAdsInfo r11 = r6.A00
            if (r11 == 0) goto L_0x008a
            r7.A0B = r11
        L_0x008a:
            X.0qQ.A0A(r7)
            r19 = -1
            boolean r22 = r7.CcK()
            long r20 = java.lang.System.currentTimeMillis()
            int r11 = r6.mResponseId
            java.lang.String r17 = java.lang.String.valueOf(r11)
            java.lang.String r18 = r12.toString()
            X.3mM r14 = new X.3mM
            r16 = r7
            r14.<init>(r15, r16, r17, r18, r19, r20, r22)
            r0.add(r14)
            goto L_0x0078
        L_0x00ac:
            boolean r7 = X.DbT.A1b(r0)
            if (r7 == 0) goto L_0x010d
            X.6aH r11 = r3.A02
            com.instagram.api.schemas.IntentAwareAdsInfo r7 = r6.A00
            java.lang.Integer r15 = java.lang.Integer.valueOf(r23)
            r12 = r7
            r13 = r8
            r14 = r11
            r16 = r24
            r17 = r9
            r18 = r0
            X.C310006aH.A01(r12, r13, r14, r15, r16, r17, r18)
            X.6VW r11 = r3.A01
            com.instagram.api.schemas.IntentAwareAdsInfo r7 = r6.A00
            if (r7 == 0) goto L_0x0211
            X.CFV r3 = r6.A01
            if (r3 == 0) goto L_0x0209
            java.util.HashMap r3 = r3.A00
            if (r3 == 0) goto L_0x0209
            java.util.Collection r3 = r3.values()
            if (r3 == 0) goto L_0x0209
            java.lang.Object r12 = X.00k.A0A(r3)
            X.3HX r12 = (X.AnonymousClass3HX) r12
        L_0x00e0:
            X.6VU r3 = r11.A00
            X.6VV r11 = r3.A05
            int r15 = r3.A00
            int r14 = r3.A01
            r13 = 1
            java.lang.String r3 = r7.BHg()
            r6 = r3
            if (r3 != 0) goto L_0x00f2
            java.lang.String r3 = ""
        L_0x00f2:
            java.lang.Integer r16 = X.C55033Hb4.A00(r3)
            if (r16 != 0) goto L_0x011a
            X.0wj r6 = X.0wj.A01
            r4 = 817897784(0x30c02138, float:1.397928E-9)
            java.lang.String r3 = "insertionType is null"
            X.DbT.A1Q(r6, r3, r4)
        L_0x0102:
            com.instagram.model.reels.Reel r2 = r2.A0H
            r2.A1I = r13
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r1.Dm0(r3, r2, r0)
        L_0x010d:
            r0 = 331570635(0x13c35dcb, float:4.9317407E-27)
        L_0x0110:
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 620846239(0x25015c9f, float:1.1220348E-16)
            X.AnonymousClass0fD.A0A(r0, r10)
            return
        L_0x011a:
            int r3 = r0.size()
            if (r3 <= r13) goto L_0x01c2
            java.lang.Integer r0 = X.AnonymousClass05K.A04
        L_0x0122:
            X.6aH r3 = r11.A00
            java.lang.Integer r1 = r7.BUY()
            int r1 = X.DbX.A02(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r11 = X.AnonymousClass4I5.A00(r1)
            java.lang.String r4 = X.C55095Hc4.A00(r0)
            X.0wc r1 = r3.A02
            r0 = 1477(0x5c5, float:2.07E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x01bd
            java.lang.Long r1 = X.DbS.A0j(r23)
            java.lang.String r0 = "hscroll_seed_ad_position"
            r2.A9F(r0, r1)
            X.3kK r3 = r3.A04
            X.C51969G9p.A1B(r2, r3)
            java.lang.String r1 = ""
            java.lang.String r0 = "contextual_ads_category"
            r2.AAJ(r0, r1)
            java.lang.Long r1 = X.C51971G9r.A0m()
            java.lang.String r0 = "chaining_position"
            r2.A9F(r0, r1)
            java.lang.String r0 = r3.getSessionId()
            X.C51965G9l.A1R(r2, r0)
            java.lang.String r0 = "invalidation_reason"
            r2.AAJ(r0, r4)
            r1 = 0
            if (r11 == 0) goto L_0x017f
            int r0 = X.AnonymousClass59V.A00(r11)
            java.lang.Long r1 = X.DbS.A0j(r0)
        L_0x017f:
            java.lang.String r0 = "multi_ads_type_number"
            r2.A9F(r0, r1)
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r24)
            java.lang.String r0 = "hscroll_seed_ad_id"
            r2.A9F(r0, r1)
            java.lang.String r0 = "reel_feed_timeline"
            X.DbS.A1O(r2, r0)
            java.lang.String r1 = r8.A00
            java.lang.String r0 = "trigger_type"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "insertion_mechanism"
            r2.AAJ(r0, r6)
            java.lang.Boolean r1 = r7.CbN()
            java.lang.String r0 = "is_seed_ad_multi_ads_eligible"
            r2.A7p(r0, r1)
            java.lang.String r0 = "hscroll_seed_ad_tracking_token"
            r2.AAJ(r0, r9)
            java.lang.String r1 = r7.BUa()
            java.lang.String r0 = "multi_ads_id"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "multi_ads_unit_id"
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x01bd:
            r0 = -1470518733(0xffffffffa859aa33, float:-1.2082826E-14)
            goto L_0x0110
        L_0x01c2:
            int r3 = r16.intValue()
            if (r3 == r13) goto L_0x01fa
            if (r3 != r4) goto L_0x020c
            r3 = 0
            if (r15 == r14) goto L_0x01d1
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            goto L_0x0122
        L_0x01d1:
            if (r12 == 0) goto L_0x01d5
            X.2vo r3 = r12.A0X
        L_0x01d5:
            boolean r3 = X.AnonymousClass6VV.A00(r3)
            if (r3 != 0) goto L_0x0102
            X.0wj r2 = X.0wj.A01
            r1 = 817897760(0x30c02120, float:1.3979253E-9)
            java.lang.String r0 = "non gap zero gap rules"
            X.0f9 r2 = r2.AEf(r0, r1)
            if (r12 == 0) goto L_0x01ed
            X.2vo r0 = r12.A0X
            r1 = 0
            if (r0 != 0) goto L_0x01ee
        L_0x01ed:
            r1 = 1
        L_0x01ee:
            java.lang.String r0 = "clientGapRulesNull"
            r2.ABR(r0, r1)
            r2.report()
            java.lang.Integer r0 = X.AnonymousClass05K.A02
            goto L_0x0122
        L_0x01fa:
            r3 = 0
            if (r12 == 0) goto L_0x01ff
            X.2vo r3 = r12.A0X
        L_0x01ff:
            boolean r3 = X.AnonymousClass6VV.A00(r3)
            if (r3 == 0) goto L_0x0102
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            goto L_0x0122
        L_0x0209:
            r12 = 0
            goto L_0x00e0
        L_0x020c:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x0211:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 2119169188(0x7e4ff4a4, float:6.910511E37)
            X.AnonymousClass0fD.A0A(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H4W.onSuccess(java.lang.Object):void");
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-1240500814);
        this.A03.A01.A00.A02 = AnonymousClass05K.A00;
        AnonymousClass0fD.A0A(1674106060, A032);
    }
}
