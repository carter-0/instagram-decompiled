package X;

/* renamed from: X.9KK  reason: invalid class name */
public final class AnonymousClass9KK extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KK(Object obj, Object obj2, Object obj3, AnonymousClass4D7 r5, int i) {
        super(2, r5);
        this.A01 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = obj3;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.4D7, X.9KK] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        return new X.AnonymousClass9KK(r1, r2, r3, r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        r1 = new X.AnonymousClass9KK(r2, r3, r4, r5, r6);
        r1.A00 = r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            int r0 = r7.A01
            r5 = r9
            switch(r0) {
                case 0: goto L_0x001f;
                case 1: goto L_0x0027;
                case 2: goto L_0x002f;
                case 3: goto L_0x0015;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r3 = r7.A02
            java.lang.Object r1 = r7.A04
            java.lang.Object r2 = r7.A03
            java.lang.Object r4 = r7.A00
            r6 = 4
        L_0x000f:
            X.9KK r0 = new X.9KK
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0015:
            java.lang.Object r1 = r7.A04
            java.lang.Object r2 = r7.A03
            java.lang.Object r3 = r7.A02
            java.lang.Object r4 = r7.A00
            r6 = 3
            goto L_0x000f
        L_0x001f:
            java.lang.Object r4 = r7.A04
            java.lang.Object r3 = r7.A02
            java.lang.Object r2 = r7.A03
            r6 = 0
            goto L_0x0036
        L_0x0027:
            java.lang.Object r4 = r7.A04
            java.lang.Object r3 = r7.A02
            java.lang.Object r2 = r7.A03
            r6 = 1
            goto L_0x0036
        L_0x002f:
            java.lang.Object r2 = r7.A03
            java.lang.Object r3 = r7.A02
            java.lang.Object r4 = r7.A04
            r6 = 2
        L_0x0036:
            X.9KK r0 = new X.9KK
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            r0.A00 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9KK.create(java.lang.Object, X.4D7):X.4D7");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass9KK) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v49, resolved type: com.instagram.rtc.signaling.models.RtcConnectionEntity$EndCallConnectionEntity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: com.instagram.rtc.signaling.models.RtcConnectionEntity$EndCallConnectionEntity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v54, resolved type: com.instagram.rtc.signaling.models.RtcConnectionEntity$EndCallConnectionEntity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            r26 = this;
            r0 = r26
            int r1 = r0.A01
            switch(r1) {
                case 0: goto L_0x0196;
                case 1: goto L_0x0242;
                case 2: goto L_0x029e;
                case 3: goto L_0x02de;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.0eS.A00(r27)
            java.lang.Object r3 = r0.A02
            com.instagram.rtc.signaling.models.RtcConnectionEntity r3 = (com.instagram.rtc.signaling.models.RtcConnectionEntity) r3
            boolean r1 = r3 instanceof com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity
            if (r1 == 0) goto L_0x00ee
            java.lang.Object r2 = r0.A04
            X.1XE r2 = (X.1XE) r2
            X.0eM r1 = r2.A08
            java.lang.Object r4 = r1.getValue()
            X.OZL r4 = (X.OZL) r4
            android.content.Context r8 = r2.A01
            java.lang.Object r2 = r0.A03
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            r1 = r3
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity r1 = (com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity) r1
            r5 = 0
            X.0qQ.A0B(r8, r5)
            r5 = 1
            X.0qQ.A0B(r2, r5)
            r5 = 2
            X.0qQ.A0B(r1, r5)
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r5 = "com.instagram.rtc.notifications.service.entity"
            r7.putParcelable(r5, r1)
            java.lang.Integer r14 = r1.A08
            X.1oy r5 = X.AnonymousClass386.A00()
            X.1oz r13 = r5.A00
            X.Nid r15 = r1.A01
            java.lang.String r6 = r1.A00()
            java.lang.String r5 = r1.A0D
            java.lang.String r12 = ""
            r21 = r5
            if (r5 != 0) goto L_0x0055
            r21 = r12
        L_0x0055:
            boolean r11 = r1.A0N
            java.lang.String r10 = r1.A0C
            if (r10 != 0) goto L_0x005c
            r10 = r12
        L_0x005c:
            java.lang.String r9 = r1.A0B
            r16 = r13
            r17 = r8
            r18 = r2
            r19 = r14
            r20 = r6
            r22 = r10
            r23 = r9
            r24 = r11
            com.instagram.model.rtc.RtcCallAudience r16 = r16.A00(r17, r18, r19, r20, r21, r22, r23, r24)
            if (r16 != 0) goto L_0x00b4
            r13 = 0
        L_0x0075:
            java.lang.String r10 = r1.A0G
            java.lang.String r9 = r1.A0F
        L_0x0079:
            java.lang.String r18 = X.C70907OQz.A01(r1)
            r11 = r2
            r12 = r13
            r13 = r4
            r14 = r6
            r15 = r10
            r16 = r5
            r17 = r9
            r9 = r8
            r10 = r7
            X.OZL.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x008b:
            java.lang.Object r1 = r0.A00
            X.PxB r1 = (X.C74562PxB) r1
            java.lang.String r0 = "notif_displayed"
            r1.AIe(r0)
            X.OWb r2 = X.C71004OWb.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "showMissedCallNotification("
            r1.append(r0)
            r1.append(r3)
            r0 = 41
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "RtcCallSignalingProcessor"
            r2.A00(r0, r1)
        L_0x00b1:
            X.0gF r1 = X.C60340gF.A00
        L_0x00b3:
            return r1
        L_0x00b4:
            X.7Rj r11 = X.C331537Rj.MISSED_CALL_NOTIFICATION
            r18 = r6
            if (r6 != 0) goto L_0x00bc
            r18 = r12
        L_0x00bc:
            r14 = 0
            com.instagram.model.rtc.RtcThreadKey r10 = new com.instagram.model.rtc.RtcThreadKey
            r17 = r10
            r19 = r14
            r20 = r14
            r21 = r14
            r22 = r14
            r17.<init>(r18, r19, r20, r21, r22)
            com.instagram.model.rtc.RtcCallSource r9 = new com.instagram.model.rtc.RtcCallSource
            r9.<init>(r14, r11, r10)
            boolean r10 = r1.A0L
            r23 = r10 ^ 1
            java.lang.String r21 = X.C70907OQz.A01(r1)
            com.instagram.model.rtc.RtcIgNotification r10 = r1.A04
            r24 = 0
            r22 = 1910377639(0x71de0ca7, float:2.199071E30)
            com.instagram.model.rtc.RtcCreateCallArgs r13 = new com.instagram.model.rtc.RtcCreateCallArgs
            r17 = r14
            r25 = r24
            r18 = r9
            r19 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0075
        L_0x00ee:
            boolean r1 = r3 instanceof com.instagram.rtc.signaling.models.RtcConnectionEntity.EndCallConnectionEntity
            if (r1 == 0) goto L_0x008b
            java.lang.Object r2 = r0.A04
            X.1XE r2 = (X.1XE) r2
            X.0eM r1 = r2.A08
            java.lang.Object r4 = r1.getValue()
            X.OZL r4 = (X.OZL) r4
            android.content.Context r8 = r2.A01
            java.lang.Object r2 = r0.A03
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            r1 = r3
            com.instagram.rtc.signaling.models.RtcConnectionEntity$EndCallConnectionEntity r1 = (com.instagram.rtc.signaling.models.RtcConnectionEntity.EndCallConnectionEntity) r1
            r5 = 0
            X.0qQ.A0B(r8, r5)
            r5 = 1
            X.0qQ.A0B(r2, r5)
            r5 = 2
            X.0qQ.A0B(r1, r5)
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r5 = "com.instagram.rtc.notifications.service.entity"
            r7.putParcelable(r5, r1)
            java.lang.Integer r14 = r1.A05
            X.1oy r5 = X.AnonymousClass386.A00()
            X.1oz r13 = r5.A00
            X.Nid r15 = r1.A00
            java.lang.String r6 = r1.A0F
            java.lang.String r5 = r1.A0A
            java.lang.String r12 = ""
            r21 = r5
            if (r5 != 0) goto L_0x0133
            r21 = r12
        L_0x0133:
            boolean r11 = r1.A0H
            java.lang.String r10 = r1.A09
            if (r10 != 0) goto L_0x013a
            r10 = r12
        L_0x013a:
            java.lang.String r9 = r1.A08
            if (r9 != 0) goto L_0x013f
            r9 = r12
        L_0x013f:
            r16 = r13
            r17 = r8
            r18 = r2
            r19 = r14
            r20 = r6
            r22 = r10
            r23 = r9
            r24 = r11
            com.instagram.model.rtc.RtcCallAudience r16 = r16.A00(r17, r18, r19, r20, r21, r22, r23, r24)
            if (r16 != 0) goto L_0x015c
            r13 = 0
        L_0x0156:
            java.lang.String r10 = r1.A0C
            java.lang.String r9 = r1.A0B
            goto L_0x0079
        L_0x015c:
            X.7Rj r11 = X.C331537Rj.MISSED_CALL_NOTIFICATION
            r18 = r6
            if (r6 != 0) goto L_0x0164
            r18 = r12
        L_0x0164:
            r14 = 0
            com.instagram.model.rtc.RtcThreadKey r10 = new com.instagram.model.rtc.RtcThreadKey
            r17 = r10
            r19 = r14
            r20 = r14
            r21 = r14
            r22 = r14
            r17.<init>(r18, r19, r20, r21, r22)
            com.instagram.model.rtc.RtcCallSource r9 = new com.instagram.model.rtc.RtcCallSource
            r9.<init>(r14, r11, r10)
            boolean r10 = r1.A0G
            r23 = r10 ^ 1
            java.lang.String r21 = X.C70907OQz.A01(r1)
            com.instagram.model.rtc.RtcIgNotification r10 = r1.A01
            r24 = 0
            r22 = 1910377639(0x71de0ca7, float:2.199071E30)
            com.instagram.model.rtc.RtcCreateCallArgs r13 = new com.instagram.model.rtc.RtcCreateCallArgs
            r17 = r14
            r25 = r24
            r18 = r9
            r19 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0156
        L_0x0196:
            X.0eS.A00(r27)
            java.lang.Object r1 = r0.A00
            X.883 r1 = (X.AnonymousClass883) r1
            int r7 = r1.ordinal()
            r3 = 4
            r4 = 1
            r1 = 3
            r5 = 0
            if (r7 == r1) goto L_0x020b
            r1 = 2
            java.lang.String r6 = "template preview resumed"
            if (r7 == r1) goto L_0x01f7
            if (r7 == r4) goto L_0x01cf
            java.lang.Object r2 = r0.A04
            X.87i r2 = (X.C3510387i) r2
            java.lang.Object r1 = r0.A02
            X.4DH r1 = (X.AnonymousClass4DH) r1
            java.lang.Object r0 = r0.A03
            X.87s r0 = (X.C3511387s) r0
            if (r7 == r3) goto L_0x01c1
            X.C3510387i.A00(r1, r2, r0, r5)
            goto L_0x00b1
        L_0x01c1:
            X.C3510387i.A00(r1, r2, r0, r5)
            boolean r0 = r2.A0B()
            if (r0 == 0) goto L_0x00b1
            r2.A06()
            goto L_0x00b1
        L_0x01cf:
            java.lang.Object r3 = r0.A03
            X.87s r3 = (X.C3511387s) r3
            boolean r1 = r3.A0H()
            java.lang.Object r2 = r0.A04
            X.87i r2 = (X.C3510387i) r2
            if (r1 == 0) goto L_0x01ee
            X.C3510387i.A03(r2)
        L_0x01e0:
            X.87q r1 = r2.A0V
            r1.A01()
            java.lang.Object r0 = r0.A02
            X.4DH r0 = (X.AnonymousClass4DH) r0
            X.C3510387i.A00(r0, r2, r3, r4)
            goto L_0x00b1
        L_0x01ee:
            X.C3510387i.A05(r2, r3)
            X.87n r1 = r2.A0P
            r1.A05(r6)
            goto L_0x01e0
        L_0x01f7:
            java.lang.Object r4 = r0.A04
            X.87i r4 = (X.C3510387i) r4
            X.87n r1 = r4.A0P
            r1.A05(r6)
            X.87q r1 = r4.A0V
            r1.A01()
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r1 = r4.A0U
            r1.setVisibility(r5)
            goto L_0x0235
        L_0x020b:
            java.lang.Object r4 = r0.A04
            X.87i r4 = (X.C3510387i) r4
            X.87n r2 = r4.A0P
            java.lang.String r1 = "template builder paused"
            r2.A04(r1)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r1 = r4.A0U
            r1.setVisibility(r3)
            X.87q r3 = r4.A0V
            X.9qp r1 = r3.A00
            if (r1 == 0) goto L_0x022a
            java.lang.String r2 = "auto"
            X.Tol r1 = r1.A00
            if (r1 == 0) goto L_0x022a
            r1.A0A(r2)
        L_0x022a:
            X.A7X r1 = r3.A01
            if (r1 == 0) goto L_0x0235
            X.STU r1 = r1.A00
            if (r1 == 0) goto L_0x0235
            r1.A05()
        L_0x0235:
            java.lang.Object r1 = r0.A02
            X.4DH r1 = (X.AnonymousClass4DH) r1
            java.lang.Object r0 = r0.A03
            X.87s r0 = (X.C3511387s) r0
            X.C3510387i.A00(r1, r4, r0, r5)
            goto L_0x00b1
        L_0x0242:
            X.0eS.A00(r27)
            java.lang.Object r6 = r0.A00
            X.4Cq r6 = (X.C262224Cq) r6
            r2 = -152462056(0xfffffffff6e99d18, float:-2.3691238E33)
            java.lang.String r1 = "IgRunnableId.PRELOAD_MESSAGES"
            X.0fh.A01(r1, r2)
            java.lang.Object r5 = r0.A04     // Catch:{ all -> 0x0374 }
            X.7Sj r5 = (X.C331787Sj) r5     // Catch:{ all -> 0x0374 }
            X.2Dm r1 = r5.A0A     // Catch:{ all -> 0x0374 }
            java.lang.Object r2 = r0.A02     // Catch:{ all -> 0x0374 }
            com.instagram.model.direct.DirectThreadKey r2 = (com.instagram.model.direct.DirectThreadKey) r2     // Catch:{ all -> 0x0374 }
            X.3U9 r3 = r1.B33(r2)     // Catch:{ all -> 0x0374 }
            X.7Sn r1 = r5.A08     // Catch:{ all -> 0x0374 }
            java.util.List r2 = r1.A00(r3, r2)     // Catch:{ all -> 0x0374 }
            boolean r1 = X.19E.A07(r6)     // Catch:{ all -> 0x0374 }
            if (r1 == 0) goto L_0x0296
            java.lang.Object r0 = r0.A03     // Catch:{ all -> 0x0374 }
            X.7SD r0 = (X.AnonymousClass7SD) r0     // Catch:{ all -> 0x0374 }
            java.util.List r4 = X.C331787Sj.A00(r5, r0, r3, r2)     // Catch:{ all -> 0x0374 }
            boolean r0 = X.19E.A07(r6)     // Catch:{ all -> 0x0374 }
            if (r0 == 0) goto L_0x0296
            X.0eP r0 = new X.0eP     // Catch:{ all -> 0x0374 }
            r0.<init>(r2, r4)     // Catch:{ all -> 0x0374 }
            r5.A02 = r0     // Catch:{ all -> 0x0374 }
            com.instagram.common.session.UserSession r3 = r5.A07     // Catch:{ all -> 0x0374 }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x0374 }
            r0 = 36318058773485379(0x81071500201743, double:3.031024837212153E-306)
            boolean r0 = X.182.A06(r2, r3, r0)     // Catch:{ all -> 0x0374 }
            if (r0 == 0) goto L_0x0296
            X.7SB r0 = r5.A01     // Catch:{ all -> 0x0374 }
            if (r0 == 0) goto L_0x0296
            r0.DRt(r4)     // Catch:{ all -> 0x0374 }
        L_0x0296:
            r0 = 80293609(0x4c92ee9, float:4.7297953E-36)
            X.0fh.A00(r0)
            goto L_0x00b1
        L_0x029e:
            X.0eS.A00(r27)
            java.lang.Object r6 = r0.A00
            X.4Cq r6 = (X.C262224Cq) r6
            java.lang.Object r5 = r0.A03
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r4 = r0.A02
            X.3U9 r4 = (X.AnonymousClass3U9) r4
            r2 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r2)
            if (r0 == 0) goto L_0x02bd
            r1 = -987059310(0xffffffffc52aab92, float:-2730.7231)
            java.lang.String r0 = "DirectInboxImagePrefetcher.prefetchAvatarImagesAsync"
            X.0fS.A01(r0, r1)
        L_0x02bd:
            X.34S r1 = X.AnonymousClass48N.A00(r5, r4)     // Catch:{ all -> 0x037c }
            java.lang.Object r0 = r1.A00     // Catch:{ all -> 0x037c }
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0     // Catch:{ all -> 0x037c }
            X.AnonymousClass43F.A00(r0, r6)     // Catch:{ all -> 0x037c }
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x037c }
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0     // Catch:{ all -> 0x037c }
            X.AnonymousClass43F.A00(r0, r6)     // Catch:{ all -> 0x037c }
            X.0gF r1 = X.C60340gF.A00     // Catch:{ all -> 0x037c }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r2)
            if (r0 == 0) goto L_0x00b3
            r0 = 727405025(0x2b5b51e1, float:7.791806E-13)
            X.0fS.A00(r0)
            return r1
        L_0x02de:
            X.0eS.A00(r27)
            java.lang.Object r1 = r0.A04
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl r1 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl) r1
            java.util.Map r1 = r1.A05
            java.lang.Object r4 = r0.A03
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r4 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r4
            java.lang.Object r7 = r1.get(r4)
            X.B2w r7 = (X.C41841B2w) r7
            if (r7 == 0) goto L_0x038a
            java.lang.Object r2 = r0.A02
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r0.A00
            java.util.List r1 = (java.util.List) r1
            X.02m r0 = X.02m.A0p
            r3 = 893650399(0x354405df, float:7.3024233E-7)
            r0.markerStart(r3)
            java.util.Set r0 = r4.A0B
            java.util.Set r0 = com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl.A00(r0)
            java.util.List r0 = X.00k.A0a(r0)
            r7.FL6(r2, r1, r0)
            int r6 = r2.size()
            int r5 = r1.size()
            java.lang.String r4 = r4.A0A
            X.02m r2 = X.02m.A0p
            if (r6 <= 0) goto L_0x0371
            if (r5 <= 0) goto L_0x036e
            X.9rx r0 = X.C390859rx.ADD_REMOVE
        L_0x0322:
            java.lang.String r1 = X.AnonymousClass92Y.A00(r0)
            X.9s8 r0 = X.C390969s8.OPERATION
            java.lang.String r0 = X.AnonymousClass92Y.A00(r0)
            r2.markerAnnotate(r3, r0, r1)
            X.9s8 r0 = X.C390969s8.MATCH_ALGO
            java.lang.String r1 = X.AnonymousClass92Y.A00(r0)
            X.5om r0 = r7.C1X()
            java.lang.String r0 = X.AnonymousClass92Y.A00(r0)
            r2.markerAnnotate(r3, r1, r0)
            X.9s8 r0 = X.C390969s8.NUM_OF_PATTERNS
            java.lang.String r1 = X.AnonymousClass92Y.A00(r0)
            int r0 = r7.BXV()
            r2.markerAnnotate(r3, r1, r0)
            X.9s8 r0 = X.C390969s8.NUM_OF_PATTERNS_ADDED
            java.lang.String r0 = X.AnonymousClass92Y.A00(r0)
            r2.markerAnnotate(r3, r0, r6)
            X.9s8 r0 = X.C390969s8.NUM_OF_PATTERNS_REMOVED
            java.lang.String r0 = X.AnonymousClass92Y.A00(r0)
            r2.markerAnnotate(r3, r0, r5)
            X.9s8 r0 = X.C390969s8.DICTIONARY_ID
            java.lang.String r0 = X.AnonymousClass92Y.A00(r0)
            r2.markerAnnotate(r3, r0, r4)
            r0 = 2
            r2.markerEnd(r3, r0)
            goto L_0x00b1
        L_0x036e:
            X.9rx r0 = X.C390859rx.ADD
            goto L_0x0322
        L_0x0371:
            X.9rx r0 = X.C390859rx.REMOVE
            goto L_0x0322
        L_0x0374:
            r1 = move-exception
            r0 = -279385194(0xffffffffef58eb96, float:-6.713357E28)
            X.0fh.A00(r0)
            throw r1
        L_0x037c:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r2)
            if (r0 == 0) goto L_0x0389
            r0 = -2065847136(0xffffffff84ddaca0, float:-5.211538E-36)
            X.0fS.A00(r0)
        L_0x0389:
            throw r1
        L_0x038a:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9KK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KK(Object obj, Object obj2, Object obj3, Object obj4, AnonymousClass4D7 r6, int i) {
        super(2, r6);
        this.A01 = i;
        this.A04 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A00 = obj4;
    }
}
