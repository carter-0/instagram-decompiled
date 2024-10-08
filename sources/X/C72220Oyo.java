package X;

import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;

/* renamed from: X.Oyo  reason: case insensitive filesystem */
public final class C72220Oyo implements 1NU {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ TransportPayload A02;
    public final /* synthetic */ C69405Nkj A03;
    public final /* synthetic */ C72201OyQ A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public C72220Oyo(TransportPayload transportPayload, C69405Nkj nkj, C72201OyQ oyQ, String str, String str2, long j, long j2) {
        this.A04 = oyQ;
        this.A01 = j;
        this.A06 = str;
        this.A00 = j2;
        this.A02 = transportPayload;
        this.A03 = nkj;
        this.A05 = str2;
    }

    /* JADX WARNING: type inference failed for: r5v12, types: [X.3FZ] */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02f8, code lost:
        if (r4.A2P != true) goto L_0x02fa;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x030e A[Catch:{ Nnl -> 0x0381 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x032c A[Catch:{ Nnl -> 0x0381 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x032e A[Catch:{ Nnl -> 0x0381 }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0318 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object then(java.lang.Object r52) {
        /*
            r51 = this;
            r1 = r52
            X.1GK r1 = (X.1GK) r1
            r19 = 0
            r0 = r19
            X.0qQ.A0B(r1, r0)
            boolean r0 = r1.A0B()
            if (r0 != 0) goto L_0x04b2
            boolean r0 = r1.A0D()
            if (r0 != 0) goto L_0x04b2
            java.lang.Object r2 = r1.A07()
            if (r2 == 0) goto L_0x04ad
            java.util.List r2 = (java.util.List) r2
            r3 = r51
            X.OyQ r7 = r3.A04
            long r0 = r3.A01
            java.lang.String r12 = r3.A06
            X.C72201OyQ.A02(r7, r12, r2, r0)
            long r0 = r3.A00
            r49 = r0
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r0 = r3.A02
            r48 = r0
            X.Nkj r0 = r3.A03
            r47 = r0
            java.lang.String r0 = r3.A05
            r46 = r0
            java.util.Iterator r20 = r2.iterator()
        L_0x003e:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x04b2
            java.lang.Object r3 = r20.next()
            X.Nox r3 = (X.C69615Nox) r3
            boolean r0 = r3 instanceof X.C68978Nc9
            if (r0 == 0) goto L_0x010b
            X.OZM r4 = r7.A03
            X.Nc9 r3 = (X.C68978Nc9) r3
            X.2Ep r0 = r3.A01
            r45 = r0
            r2 = r0
            r0 = r49
            java.lang.String r6 = r4.A02(r2, r0)
            java.lang.Long r2 = X.C51971G9r.A0m()
            r15 = 1
            r8 = 2
            r0 = r48
            int r1 = r0.transportPayloadCase_
            r0 = 1
            if (r1 == r15) goto L_0x006b
            r0 = 0
        L_0x006b:
            r5 = 0
            if (r0 == 0) goto L_0x0096
            com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload r0 = r48.A0L()
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r0 = r0.content_
            if (r0 != 0) goto L_0x0078
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r0 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.DEFAULT_INSTANCE
        L_0x0078:
            com.instagram.direct.armadilloexpress.transportpayload.ReceiverFetchXma r1 = r0.A0M()
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x008f
            java.lang.String r0 = r1.contentRef_
            if (r0 == 0) goto L_0x008f
            org.json.JSONObject r0 = X.C66580MXl.A17(r0)     // Catch:{ JSONException -> 0x0136 }
            X.N1Z r5 = new X.N1Z
            r5.<init>(r0)
        L_0x008f:
            X.Ndp r4 = new X.Ndp
            r4.<init>(r5)
            goto L_0x013f
        L_0x0096:
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent r4 = X.C66582MXn.A0R(r48)
            X.0qQ.A07(r4)
            int r0 = r4.supplementMessageContentCase_
            if (r0 != r15) goto L_0x00e0
            java.lang.Object r9 = r4.supplementMessageContent_
            com.instagram.direct.armadilloexpress.transportpayload.Reaction r9 = (com.instagram.direct.armadilloexpress.transportpayload.Reaction) r9
            X.0qQ.A07(r9)
            java.lang.String r1 = r9.reactionType_
            java.lang.String r0 = "like"
            X.0qQ.A0K(r1, r0)
            int r1 = r9.bitField0_
            r0 = r1 & 2
            if (r0 == 0) goto L_0x00de
            java.lang.String r8 = r9.reactionStatus_
        L_0x00b7:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x00dc
            java.lang.String r4 = r9.emoji_
        L_0x00bd:
            r0 = r1 & 8
            if (r0 == 0) goto L_0x00da
            java.lang.String r1 = r9.superReactType_
        L_0x00c3:
            X.46u r0 = new X.46u
            r21 = r0
            r22 = r5
            r23 = r2
            r24 = r6
            r25 = r4
            r26 = r1
            r21.<init>(r22, r23, r24, r25, r26)
            X.Ndo r4 = new X.Ndo
            r4.<init>(r0, r12, r8)
            goto L_0x013f
        L_0x00da:
            r1 = 0
            goto L_0x00c3
        L_0x00dc:
            r4 = 0
            goto L_0x00bd
        L_0x00de:
            r8 = 0
            goto L_0x00b7
        L_0x00e0:
            if (r0 != r8) goto L_0x00fc
            com.instagram.direct.armadilloexpress.transportpayload.ContentView r1 = r4.A0L()
            X.0qQ.A07(r1)
            boolean r0 = r1.screenshotted_
            if (r0 == 0) goto L_0x00f5
            X.4k3 r0 = X.C272074k3.RAVEN_SCREENSHOT
        L_0x00ef:
            X.Ndn r4 = new X.Ndn
            r4.<init>(r0, r2, r6)
            goto L_0x013f
        L_0x00f5:
            boolean r0 = r1.replayed_
            if (r0 == 0) goto L_0x00fc
            X.4k3 r0 = X.C272074k3.RAVEN_REPLAYED
            goto L_0x00ef
        L_0x00fc:
            int r1 = r4.supplementMessageContentCase_
            r0 = 3
            if (r1 != r0) goto L_0x0109
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.Ndm r4 = new X.Ndm
            r4.<init>(r0, r2)
            goto L_0x013f
        L_0x0109:
            r4 = r5
            goto L_0x013f
        L_0x010b:
            boolean r0 = r3 instanceof X.C68979NcA
            if (r0 == 0) goto L_0x003e
            X.OI7 r4 = r7.A06
            X.NcA r3 = (X.C68979NcA) r3
            r0 = r19
            X.0qQ.A0B(r3, r0)
            X.2Ep r0 = r3.A00
            r45 = r0
            com.instagram.model.direct.DirectThreadKey r23 = r45.BJy()
            java.lang.String r2 = r3.A01
            java.lang.String r1 = r3.A03
            X.OZY r0 = r4.A08
            java.lang.Integer r24 = X.AnonymousClass05K.A00
            r21 = r0
            r22 = r47
            r25 = r2
            r26 = r46
            r27 = r1
            r21.A02(r22, r23, r24, r25, r26, r27)
            goto L_0x016b
        L_0x0136:
            r2 = move-exception
            java.lang.String r1 = "ArmadilloExpressNotificationContextFactory"
            java.lang.String r0 = "Failed to parse receiver fetch content ref"
            X.0KC.A0J(r1, r0, r2)
            r4 = r5
        L_0x013f:
            X.OI7 r8 = r7.A06
            X.3su r2 = r3.A00
            if (r4 == 0) goto L_0x0491
            boolean r10 = r4 instanceof X.C69052Ndo
            if (r10 == 0) goto L_0x048e
            r0 = r4
            X.Ndo r0 = (X.C69052Ndo) r0
            X.46u r0 = r0.A00
            java.lang.String r9 = r0.A00()
        L_0x0152:
            java.lang.Integer r5 = r4.A00
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            if (r5 != r3) goto L_0x0193
            com.instagram.common.session.UserSession r0 = r8.A01
            java.lang.String r1 = r0.A06
            java.lang.String r0 = r2.A1u
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0193
            X.OZY r1 = r8.A08
            r0 = r45
            r1.A03(r2, r0, r4)
        L_0x016b:
            X.8zv r0 = X.C372178zu.A0A
            X.8zu r3 = r0.A00()
            if (r3 == 0) goto L_0x017e
            com.instagram.common.session.UserSession r2 = r7.A02
            java.lang.String r1 = r45.C6C()
            r0 = r47
            X.OQ5.A01(r2, r0, r3, r1, r12)
        L_0x017e:
            X.Mfp r0 = X.C66957Mfq.A0A
            X.Mfq r3 = r0.A00()
            if (r3 == 0) goto L_0x003e
            com.instagram.common.session.UserSession r2 = r7.A02
            java.lang.String r1 = r45.C6C()
            r0 = r47
            X.OQ5.A00(r3, r2, r0, r1, r12)
            goto L_0x003e
        L_0x0193:
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            if (r5 != r6) goto L_0x049c
            java.lang.String r0 = r2.A1u
            boolean r0 = X.0qQ.A0K(r9, r0)
            if (r0 != 0) goto L_0x049c
            X.OZY r8 = r8.A08
            com.instagram.model.direct.DirectThreadKey r5 = r45.BJy()
            java.lang.String r9 = r5.A00
            boolean r0 = r2.A1S()
            if (r0 == 0) goto L_0x0232
            java.lang.String r1 = r2.A0f()
        L_0x01b1:
            java.lang.String r0 = "Updated"
            X.OZY.A00(r2, r8, r9, r1, r0)
            if (r10 == 0) goto L_0x0238
            X.Ndo r4 = (X.C69052Ndo) r4
            java.lang.String r1 = r4.A02
            java.lang.String r0 = "created"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0209
            boolean r0 = X.OZY.A01(r2, r8)
            if (r0 == 0) goto L_0x016b
            X.0eM r0 = X.MZr.A00
            java.lang.Object r9 = r0.getValue()
            X.MeP r9 = (X.MeP) r9
            java.lang.String r10 = r4.A01
            com.instagram.common.session.UserSession r8 = r8.A00
            java.lang.String r11 = r8.A06
            boolean r0 = r2.A2P
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r2.A1T()
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = r2.A1u
            java.lang.String r0 = r2.A1h
            X.MeO r2 = new X.MeO
            r21 = r2
            r22 = r5
            r25 = r6
            r26 = r10
            r27 = r11
            r28 = r1
            r29 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)
            X.46u r0 = r4.A00
            X.OBu r1 = new X.OBu
            r1.<init>(r0, r2)
        L_0x0204:
            X.MeP.A03(r8, r1, r9, r3)
            goto L_0x016b
        L_0x0209:
            java.lang.String r0 = "deleted"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x016b
            X.46u r3 = r4.A00
            boolean r0 = X.OZY.A01(r2, r8)
            if (r0 == 0) goto L_0x016b
            X.0eM r0 = X.MZr.A00
            java.lang.Object r9 = r0.getValue()
            X.MeP r9 = (X.MeP) r9
            com.instagram.common.session.UserSession r8 = r8.A00
            java.lang.String r1 = r8.A06
            X.MeO r0 = new X.MeO
            r0.<init>(r2, r5, r6, r1)
            X.OBu r1 = new X.OBu
            r1.<init>(r3, r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            goto L_0x0204
        L_0x0232:
            java.lang.String r1 = r2.A0g()
            goto L_0x01b1
        L_0x0238:
            boolean r1 = r4 instanceof X.C69051Ndn
            boolean r0 = X.OZY.A01(r2, r8)
            if (r1 == 0) goto L_0x0476
            if (r0 == 0) goto L_0x016b
            X.0eM r0 = X.MZr.A00
            java.lang.Object r3 = r0.getValue()
            X.MeP r3 = (X.MeP) r3
            com.instagram.common.session.UserSession r8 = r8.A00
            java.lang.String r1 = r8.A06
            r25 = 0
            X.MeO r0 = new X.MeO
            r0.<init>(r2, r5, r6, r1)
            r1 = r4
            X.Ndn r1 = (X.C69051Ndn) r1
            X.4k3 r11 = r1.A00
            X.0qQ.A0B(r11, r15)
            java.lang.String r1 = r1.A01
            r38 = r1
            java.lang.Long r10 = r4.A01
            long r16 = X.MeP.A00(r8, r0, r3)
            X.0sL r4 = r3.A03
            X.0sa r1 = r3.A01
            X.Me6 r2 = new X.Me6
            r2.<init>(r1, r4)
            java.lang.String r1 = r0.A0A
            r37 = r1
            X.2Eq r1 = r0.A03
            r18 = r1
            com.instagram.model.direct.DirectThreadKey r9 = r0.A04
            java.lang.String r5 = r9.A00
            X.3su r4 = r0.A02
            if (r4 == 0) goto L_0x02c2
            long r33 = r4.C7c()
        L_0x0284:
            java.lang.Boolean r28 = java.lang.Boolean.valueOf(r19)
            java.lang.Integer r1 = r0.A07
            r21 = r1
            X.Me7 r1 = new X.Me7
            r26 = r1
            r27 = r18
            r29 = r21
            r30 = r37
            r31 = r5
            r32 = r38
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            X.0eM r2 = r2.A00
            java.util.List r2 = X.JTO.A15(r2)
            X.MeD r1 = X.C66876MeC.A00(r8, r1, r2)
            X.PuQ r1 = r1.A00
            boolean r2 = X.DbW.A1a(r1)
            r5 = 0
            if (r2 == 0) goto L_0x0407
            X.0sP r2 = r3.A02
            r1 = r37
            java.lang.Object r14 = r2.invoke(r1)
            X.69F r14 = (X.AnonymousClass69F) r14
            java.lang.String r13 = "eligibility_policy_checked"
            r1 = r16
            r14.Clr(r1, r13)
            goto L_0x02c5
        L_0x02c2:
            r33 = 0
            goto L_0x0284
        L_0x02c5:
            java.lang.String r1 = r0.A08     // Catch:{ Nnl -> 0x0381 }
            r14 = r1
            if (r1 == 0) goto L_0x0373
            int r1 = r1.length()     // Catch:{ Nnl -> 0x0381 }
            if (r1 == 0) goto L_0x0373
            java.lang.String r13 = r9.A00     // Catch:{ Nnl -> 0x0381 }
            if (r13 == 0) goto L_0x037a
            int r1 = r13.length()     // Catch:{ Nnl -> 0x0381 }
            if (r1 == 0) goto L_0x037a
            if (r4 == 0) goto L_0x02e1
            java.lang.String r29 = r4.A0f()     // Catch:{ Nnl -> 0x0381 }
            goto L_0x02e3
        L_0x02e1:
            r29 = r5
        L_0x02e3:
            if (r10 == 0) goto L_0x02f0
            long r1 = r10.longValue()     // Catch:{ Nnl -> 0x0381 }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ Nnl -> 0x0381 }
            long r33 = r10.toMillis(r1)     // Catch:{ Nnl -> 0x0381 }
            goto L_0x02f2
        L_0x02f0:
            r33 = 0
        L_0x02f2:
            if (r4 == 0) goto L_0x02fa
            boolean r1 = r4.A2P     // Catch:{ Nnl -> 0x0381 }
            r35 = 1
            if (r1 == r15) goto L_0x0300
        L_0x02fa:
            r35 = 0
            if (r4 != 0) goto L_0x0300
            r10 = r5
            goto L_0x0302
        L_0x0300:
            java.lang.Long r10 = r4.A1L     // Catch:{ Nnl -> 0x0381 }
        L_0x0302:
            java.lang.Integer r26 = X.AnonymousClass05K.A0Y     // Catch:{ Nnl -> 0x0381 }
            if (r4 == 0) goto L_0x032c
            X.4ik r1 = r4.A0e     // Catch:{ Nnl -> 0x0381 }
            if (r1 == 0) goto L_0x032c
            X.4iq r1 = r1.A04     // Catch:{ Nnl -> 0x0381 }
            if (r1 == 0) goto L_0x032c
            X.1iA r2 = r1.A07     // Catch:{ Nnl -> 0x0381 }
        L_0x0310:
            X.1iA r1 = X.1iA.A0Q     // Catch:{ Nnl -> 0x0381 }
            if (r2 == r1) goto L_0x032e
            X.1iA r1 = X.1iA.A0a     // Catch:{ Nnl -> 0x0381 }
            if (r2 == r1) goto L_0x032e
            java.lang.StringBuilder r4 = X.AnonymousClass7TE.A1A()     // Catch:{ Nnl -> 0x0381 }
            java.lang.String r1 = "Raven media type not supported: "
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r2, r1, r4)     // Catch:{ Nnl -> 0x0381 }
            java.lang.UnsupportedOperationException r2 = X.AnonymousClass7TE.A1B(r1)     // Catch:{ Nnl -> 0x0381 }
            X.Nnl r1 = new X.Nnl     // Catch:{ Nnl -> 0x0381 }
            r1.<init>(r2)     // Catch:{ Nnl -> 0x0381 }
            throw r1     // Catch:{ Nnl -> 0x0381 }
        L_0x032c:
            r2 = 0
            goto L_0x0310
        L_0x032e:
            X.N8Z r1 = new X.N8Z     // Catch:{ Nnl -> 0x0381 }
            r1.<init>((X.C272074k3) r11, (X.1iA) r2)     // Catch:{ Nnl -> 0x0381 }
            java.lang.String r2 = r0.A09     // Catch:{ Nnl -> 0x0381 }
            if (r4 == 0) goto L_0x0369
            java.lang.Boolean r4 = r4.A0X()     // Catch:{ Nnl -> 0x0381 }
            if (r4 == 0) goto L_0x0369
            boolean r36 = r4.booleanValue()     // Catch:{ Nnl -> 0x0381 }
        L_0x0341:
            X.N3b r22 = new X.N3b     // Catch:{ Nnl -> 0x0381 }
            r23 = r18
            r24 = r1
            r27 = r10
            r28 = r14
            r30 = r13
            r31 = r38
            r32 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r36)     // Catch:{ Nnl -> 0x0381 }
            X.N2p r1 = new X.N2p     // Catch:{ Nnl -> 0x0381 }
            r26 = r1
            r27 = r22
            r28 = r21
            r29 = r37
            r30 = r16
            r26.<init>(r27, r28, r29, r30)     // Catch:{ Nnl -> 0x0381 }
            X.OTB r4 = new X.OTB     // Catch:{ Nnl -> 0x0381 }
            r4.<init>((X.C68149N2p) r1)     // Catch:{ Nnl -> 0x0381 }
            goto L_0x0387
        L_0x0369:
            if (r18 == 0) goto L_0x0370
            boolean r36 = r18.CWe()     // Catch:{ Nnl -> 0x0381 }
            goto L_0x0341
        L_0x0370:
            r36 = 0
            goto L_0x0341
        L_0x0373:
            java.lang.String r1 = "message id null or empty."
            X.Nnl r1 = X.C69541Nnl.A00(r1)     // Catch:{ Nnl -> 0x0381 }
            goto L_0x0380
        L_0x037a:
            java.lang.String r1 = "thread id null or empty."
            X.Nnl r1 = X.C69541Nnl.A00(r1)     // Catch:{ Nnl -> 0x0381 }
        L_0x0380:
            throw r1     // Catch:{ Nnl -> 0x0381 }
        L_0x0381:
            r1 = move-exception
            X.OTB r4 = new X.OTB
            r4.<init>((X.C69541Nnl) r1)
        L_0x0387:
            X.N2p r1 = r4.A00
            if (r1 == 0) goto L_0x0390
            X.MeP.A01(r8, r1, r3)
            goto L_0x016b
        L_0x0390:
            X.Obj r10 = r3.A00
            java.lang.String r2 = "mapping error: "
            X.Nnl r1 = r4.A01
            if (r1 == 0) goto L_0x03a2
            java.lang.Throwable r1 = r1.getCause()
            if (r1 == 0) goto L_0x03a2
            java.lang.String r5 = r1.getMessage()
        L_0x03a2:
            java.lang.String r2 = X.002.A0R(r2, r5)
            java.lang.Integer r23 = X.AnonymousClass05K.A0C
            r24 = 0
            r1 = 10
            r3 = r37
            java.lang.Long r26 = X.00y.A0n(r1, r3)
            java.lang.String r29 = "direct"
            r3 = r38
            java.lang.Long r27 = X.00y.A0n(r1, r3)
            java.lang.String r4 = r9.A00
            r3 = r21
            boolean r44 = X.AnonymousClass7TF.A1W(r3, r6)
            com.instagram.common.notifications.push.intf.PushChannelType r22 = X.C66878MeE.A00(r21)
            java.util.ArrayList r39 = X.OWE.A00(r0)
            boolean r43 = X.C282435Db.A02(r37)
            java.lang.String r3 = r0.A09
            if (r3 == 0) goto L_0x03d6
            java.lang.Long r24 = X.00y.A0n(r1, r3)
        L_0x03d6:
            java.lang.String r3 = r0.A01
            r40 = -1
            X.6BJ r1 = new X.6BJ
            r21 = r1
            r28 = r25
            r30 = r25
            r31 = r25
            r32 = r25
            r33 = r25
            r34 = r4
            r35 = r3
            r36 = r25
            r37 = r25
            r38 = r25
            r42 = r15
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r42, r43, r44)
            X.MeF r5 = X.C70126Nxg.A00(r0)
            X.MeH r0 = new X.MeH
            r3 = r16
            r0.<init>(r1, r5, r3)
            r10.A04(r8, r0, r2)
            goto L_0x016b
        L_0x0407:
            X.Obj r10 = r3.A00
            java.lang.String r2 = "message eligibility policy failure:"
            if (r1 == 0) goto L_0x0411
            java.lang.String r5 = r1.AUf(r8)
        L_0x0411:
            java.lang.String r2 = X.002.A0R(r2, r5)
            java.lang.Integer r23 = X.AnonymousClass05K.A0C
            r24 = 0
            r1 = 10
            r3 = r37
            java.lang.Long r26 = X.00y.A0n(r1, r3)
            java.lang.String r29 = "direct"
            r3 = r38
            java.lang.Long r27 = X.00y.A0n(r1, r3)
            java.lang.String r4 = r9.A00
            r3 = r21
            boolean r44 = X.AnonymousClass7TF.A1W(r3, r6)
            com.instagram.common.notifications.push.intf.PushChannelType r22 = X.C66878MeE.A00(r21)
            java.util.ArrayList r39 = X.OWE.A00(r0)
            boolean r43 = X.C282435Db.A02(r37)
            java.lang.String r3 = r0.A09
            if (r3 == 0) goto L_0x0445
            java.lang.Long r24 = X.00y.A0n(r1, r3)
        L_0x0445:
            java.lang.String r3 = r0.A01
            r40 = -1
            X.6BJ r1 = new X.6BJ
            r21 = r1
            r28 = r25
            r30 = r25
            r31 = r25
            r32 = r25
            r33 = r25
            r34 = r4
            r35 = r3
            r36 = r25
            r37 = r25
            r38 = r25
            r42 = r15
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r42, r43, r44)
            X.MeF r5 = X.C70126Nxg.A00(r0)
            X.MeH r0 = new X.MeH
            r3 = r16
            r0.<init>(r1, r5, r3)
            r10.A03(r8, r0, r2)
            goto L_0x016b
        L_0x0476:
            if (r0 == 0) goto L_0x016b
            X.0eM r0 = X.MZr.A00
            java.lang.Object r4 = r0.getValue()
            X.MeP r4 = (X.MeP) r4
            com.instagram.common.session.UserSession r3 = r8.A00
            java.lang.String r1 = r3.A06
            X.MeO r0 = new X.MeO
            r0.<init>(r2, r5, r6, r1)
            X.MeP.A02(r3, r0, r4, r6)
            goto L_0x016b
        L_0x048e:
            r9 = 0
            goto L_0x0152
        L_0x0491:
            X.65S r4 = r8.A07
            java.lang.String r3 = r2.A1h
            java.lang.String r2 = r2.A0g()
            java.lang.String r1 = "notificationContext is null"
            goto L_0x04a6
        L_0x049c:
            X.65S r4 = r8.A07
            java.lang.String r3 = r2.A1h
            java.lang.String r2 = r2.A0g()
            java.lang.String r1 = "No matching notification handler actions"
        L_0x04a6:
            r0 = r19
            r4.A07(r3, r2, r1, r0)
            goto L_0x016b
        L_0x04ad:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x04b2:
            X.0gF r0 = X.C60340gF.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72220Oyo.then(java.lang.Object):java.lang.Object");
    }
}
