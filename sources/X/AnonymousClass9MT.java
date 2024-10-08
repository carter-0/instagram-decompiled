package X;

/* renamed from: X.9MT  reason: invalid class name */
public final class AnonymousClass9MT extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MT(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        super(2);
        this.A00 = i;
        this.A04 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
        this.A03 = obj4;
    }

    /* JADX WARNING: type inference failed for: r5v22, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v31 */
    /* JADX WARNING: type inference failed for: r23v5, types: [com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallGenericConnectionEntity] */
    /* JADX WARNING: type inference failed for: r23v6, types: [com.instagram.rtc.signaling.models.RtcConnectionEntity$EndCallConnectionEntity] */
    /* JADX WARNING: type inference failed for: r23v7, types: [com.instagram.rtc.signaling.models.RtcConnectionEntity$LiveInviteConnectionEntity] */
    /* JADX WARNING: type inference failed for: r23v8, types: [com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x06a8: MOVE  (r1v27 androidx.fragment.app.FragmentActivity) = (r1v26 androidx.fragment.app.FragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r49, java.lang.Object r50) {
        /*
            r48 = this;
            r0 = r48
            r2 = r50
            r1 = r49
            int r3 = r0.A00
            switch(r3) {
                case 0: goto L_0x0914;
                case 1: goto L_0x08e8;
                case 2: goto L_0x08c6;
                case 3: goto L_0x089e;
                case 4: goto L_0x0870;
                case 5: goto L_0x0690;
                case 6: goto L_0x0848;
                case 7: goto L_0x080a;
                case 8: goto L_0x07d7;
                case 9: goto L_0x0611;
                case 10: goto L_0x05ec;
                case 11: goto L_0x05ca;
                case 12: goto L_0x05a4;
                case 13: goto L_0x079d;
                case 14: goto L_0x074e;
                case 15: goto L_0x0707;
                case 16: goto L_0x0571;
                default: goto L_0x000b;
            }
        L_0x000b:
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.0Jv r2 = (X.0Jv) r2
            r8 = 0
            X.0qQ.A0B(r1, r8)
            java.lang.Object r7 = r0.A04
            X.1XE r7 = (X.1XE) r7
            java.lang.Object r6 = r0.A01
            X.5HJ r6 = (X.AnonymousClass5HJ) r6
            java.lang.String r4 = r6.A0X
            r10 = 1
            if (r4 == 0) goto L_0x04d8
            java.lang.String r3 = "rtc_"
            boolean r3 = X.00p.A0k(r4, r3, r10)
            if (r3 != r10) goto L_0x04d8
        L_0x0028:
            java.lang.Object r11 = r0.A02
            X.0rm r11 = (X.0rm) r11
            java.lang.Object r9 = r11.A00
            boolean r3 = r9 instanceof com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity
            java.lang.String r4 = "Required value was null."
            if (r3 == 0) goto L_0x014e
            java.lang.Object r5 = r0.A03
            X.PxB r5 = (X.C74562PxB) r5
            if (r5 == 0) goto L_0x0047
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity r9 = (com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity) r9
            boolean r3 = r9.A0L
            r0 = 4905(0x1329, float:6.873E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.CmG(r0, r3)
        L_0x0047:
            java.lang.Object r9 = r11.A00
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity r9 = (com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity) r9
            if (r5 == 0) goto L_0x06ef
            X.OWb r4 = X.C71004OWb.A00
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "handleIncomingCallNotification("
            r3.append(r0)
            r3.append(r9)
            r0 = 41
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "RtcCallSignalingProcessor"
            r14 = 0
            r11 = 0
            r4.A00(r0, r3)
            com.instagram.realtimeclient.RealtimeClientManager r0 = com.instagram.realtimeclient.RealtimeClientManager.getInstance(r1)
            boolean r0 = r0.isMqttConnected()
            if (r0 != 0) goto L_0x00a2
            X.0Tu r0 = X.0Tu.A05
            r3 = 36323667999337844(0x810c2f000a2d74, double:3.034572134227791E-306)
            boolean r0 = X.182.A06(r0, r1, r3)
            if (r0 == 0) goto L_0x00a2
            com.instagram.realtimeclient.RealtimeClientManager r3 = com.instagram.realtimeclient.RealtimeClientManager.getInstance(r1)
            r0 = 100
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r3.addKeepAliveCondition(r0)
            android.os.Handler r12 = r7.A02
            X.Al2 r0 = new X.Al2
            r0.<init>(r3)
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            r3 = 60
            long r3 = r13.toMillis(r3)
            r12.postDelayed(r0, r3)
        L_0x00a2:
            X.0Tu r0 = X.0Tu.A05
            r3 = 2342166677212638575(0x20810c2f00042d6f, double:4.068696032194803E-152)
            boolean r3 = X.182.A06(r0, r1, r3)
            r12 = 1
            if (r3 == 0) goto L_0x00dd
            boolean r3 = r7.A00
            if (r3 != 0) goto L_0x00cf
            android.content.Context r4 = r7.A01
            android.content.Context r3 = r4.getApplicationContext()
            com.facebook.msys.mci.ProxyProvider r15 = X.C249543jx.A00(r3, r14)
            android.content.Context r13 = r4.getApplicationContext()
            r16 = r14
            r17 = r14
            r18 = r14
            r19 = r8
            X.C300415x9.A00(r13, r14, r15, r16, r17, r18, r19)
            r7.A00 = r10
        L_0x00cf:
            X.OWf r13 = X.C70320O1y.A00(r1)
            java.lang.String r10 = r9.A0H
            r4 = 3
            X.0sm r3 = X.0Yt.A0E()
            r13.A05(r10, r4, r3)
        L_0x00dd:
            X.Nid r4 = r9.A01
            X.Nid r3 = X.C69277Nid.NO_E2EE
            r10 = 0
            if (r4 == r3) goto L_0x00e5
            r10 = 1
        L_0x00e5:
            if (r10 != 0) goto L_0x00ee
            X.Nie r4 = r9.A02
            X.Nie r3 = X.C69278Nie.TEST
            if (r4 == r3) goto L_0x00ee
            r12 = 0
        L_0x00ee:
            r3 = 2342153680641327341(0x2081005d000000ed, double:4.057676042191083E-152)
            boolean r3 = X.182.A06(r0, r1, r3)
            if (r3 != 0) goto L_0x013c
            r3 = 0
            if (r10 != 0) goto L_0x0139
            java.lang.String r14 = r9.A0J
        L_0x00fe:
            X.1XB r15 = r7.A04
            com.instagram.model.rtc.RtcIgNotification r16 = X.O1E.A00(r6)
            java.lang.String r18 = r9.A00()
            java.lang.String r4 = r9.A0H
            java.lang.Integer r17 = X.AnonymousClass05K.A01
            r19 = r14
            r20 = r3
            r21 = r4
            r15.A03(r16, r17, r18, r19, r20, r21)
            java.lang.String r3 = "calling not supported"
            r5.AUZ(r3)
        L_0x011a:
            X.OyC r5 = X.C66953Mfm.A01(r1)
            if (r5 == 0) goto L_0x04d0
            com.instagram.common.session.UserSession r1 = r5.A02
            r3 = 36323667999141234(0x810c2f00072d72, double:3.0345721341034544E-306)
            boolean r0 = X.182.A06(r0, r1, r3)
            if (r0 == 0) goto L_0x0136
            X.0Jv r0 = r5.A00
            if (r0 == 0) goto L_0x0134
            r0.AId(r11)
        L_0x0134:
            r5.A00 = r2
        L_0x0136:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0139:
            java.lang.String r3 = r9.A0E
            goto L_0x00fe
        L_0x013c:
            X.1XE.A00(r5, r1, r9, r7)
            java.lang.String r3 = r6.A17
            if (r3 == 0) goto L_0x011a
            byte[] r4 = android.util.Base64.decode(r3, r8)
            if (r4 == 0) goto L_0x011a
            r3 = 2
            r7.A0G(r1, r4, r3, r12)
            goto L_0x011a
        L_0x014e:
            boolean r3 = r9 instanceof com.instagram.rtc.signaling.models.RtcConnectionEntity.LiveInviteConnectionEntity
            if (r3 == 0) goto L_0x0187
            java.lang.Object r6 = r0.A03
            X.PxB r6 = (X.C74562PxB) r6
            if (r6 == 0) goto L_0x015b
            r6.AQy()
        L_0x015b:
            java.lang.Object r5 = r11.A00
            com.instagram.rtc.signaling.models.RtcConnectionEntity$LiveInviteConnectionEntity r5 = (com.instagram.rtc.signaling.models.RtcConnectionEntity.LiveInviteConnectionEntity) r5
            if (r6 == 0) goto L_0x06f5
            boolean r0 = X.14i.A08()
            if (r0 == 0) goto L_0x04d0
            java.lang.String r8 = r5.A08
            com.instagram.model.rtc.RtcIgNotification r0 = r5.A01
            if (r0 == 0) goto L_0x0170
            java.lang.String r4 = r0.A05
            goto L_0x0171
        L_0x0170:
            r4 = 0
        L_0x0171:
            android.content.Context r3 = r7.A01     // Catch:{ IllegalStateException -> 0x0494 }
            android.content.Context r0 = r3.getApplicationContext()     // Catch:{ IllegalStateException -> 0x0494 }
            X.0qQ.A07(r0)     // Catch:{ IllegalStateException -> 0x0494 }
            X.A1B.A00(r1, r8)     // Catch:{ IllegalStateException -> 0x0494 }
            if (r4 == 0) goto L_0x04b5
            X.C2601144i.A00()     // Catch:{ IllegalStateException -> 0x0494 }
            X.C239403Gi.A01(r3, r1)     // Catch:{ IllegalStateException -> 0x0494 }
            goto L_0x04b5
        L_0x0187:
            boolean r3 = r9 instanceof com.instagram.rtc.signaling.models.RtcConnectionEntity.EndCallConnectionEntity
            if (r3 == 0) goto L_0x0474
            com.instagram.rtc.signaling.models.RtcConnectionEntity$EndCallConnectionEntity r9 = (com.instagram.rtc.signaling.models.RtcConnectionEntity.EndCallConnectionEntity) r9
            java.lang.Object r5 = r0.A03
            X.PxB r5 = (X.C74562PxB) r5
            if (r5 == 0) goto L_0x0701
            X.OWb r22 = X.C71004OWb.A00
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "handleEndedCallNotification("
            r3.append(r0)
            r3.append(r9)
            r0 = 41
            r3.append(r0)
            java.lang.String r4 = r3.toString()
            java.lang.String r21 = "RtcCallSignalingProcessor"
            r20 = 0
            r3 = r22
            r0 = r21
            r3.A00(r0, r4)
            X.0eM r0 = r7.A08
            java.lang.Object r3 = r0.getValue()
            X.OZL r3 = (X.OZL) r3
            java.lang.String r0 = X.C70907OQz.A01(r9)
            r3.A02(r0)
            X.0Tu r0 = X.0Tu.A05
            r3 = 2342153680641327341(0x2081005d000000ed, double:4.057676042191083E-152)
            boolean r0 = X.182.A06(r0, r1, r3)
            if (r0 != 0) goto L_0x01ec
            X.1XB r7 = r7.A04
            com.instagram.model.rtc.RtcIgNotification r8 = X.O1E.A00(r6)
            java.lang.String r10 = r9.A0F
            java.lang.String r0 = r9.A0D
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            r11 = r20
            r12 = r11
            r13 = r0
            r7.A03(r8, r9, r10, r11, r12, r13)
            java.lang.String r0 = "calling not supported"
        L_0x01e7:
            r5.AUZ(r0)
            goto L_0x04d0
        L_0x01ec:
            java.lang.String r0 = r9.A0B
            r19 = r0
            if (r0 == 0) goto L_0x01f9
            int r3 = r19.length()
            r0 = 0
            if (r3 != 0) goto L_0x01fa
        L_0x01f9:
            r0 = 1
        L_0x01fa:
            r18 = r0 ^ 1
            java.lang.Integer r0 = r9.A04
            if (r0 == 0) goto L_0x0420
            int r0 = r0.intValue()
        L_0x0204:
            java.lang.Integer r3 = X.A0M.A00(r0)
            if (r18 == 0) goto L_0x0414
            X.NjG r17 = X.C69315NjG.Missed
        L_0x020c:
            X.I4H r16 = X.I4H.A00
            java.lang.String r0 = X.C70907OQz.A00(r9)
            com.instagram.rtc.signaling.models.RtcConnectionEntity r14 = X.I4H.A00(r0)
            boolean r3 = r14 instanceof com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity
            if (r3 == 0) goto L_0x0401
            r0 = r14
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity r0 = (com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity) r0
            java.lang.String r0 = r0.A00()
        L_0x0221:
            if (r14 == 0) goto L_0x02c6
            if (r3 == 0) goto L_0x0300
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity r14 = (com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity) r14
            java.lang.String r3 = r14.A0G
            r33 = r3
            java.lang.Integer r3 = r14.A08
            r30 = r3
            java.lang.Integer r3 = r14.A07
            r31 = r3
            com.instagram.model.rtc.RtcIgNotification r3 = r14.A04
            r47 = r3
            java.lang.Long r3 = r14.A09
            r32 = r3
            java.lang.String r3 = r14.A0H
            r35 = r3
            java.lang.String r13 = r14.A0I
            java.lang.String r3 = r14.A0K
            r38 = r3
            java.lang.String r12 = r14.A0B
            java.lang.String r3 = r14.A0C
            r40 = r3
            java.lang.String r3 = r14.A0A
            r41 = r3
            java.lang.String r3 = r14.A0D
            r28 = r3
            java.lang.String r3 = r14.A0E
            r27 = r3
            X.Nid r11 = r14.A01
            boolean r3 = r14.A0M
            r26 = r3
            X.Nie r4 = r14.A02
            boolean r3 = r14.A0L
            r25 = r3
            boolean r3 = r14.A0N
            r24 = r3
            com.instagram.video.common.events.IgRtcEventHeader r3 = r14.A06
            r23 = r3
            com.instagram.model.rtc.RtcCallKey r15 = r14.A03
            r3 = r33
            X.0qQ.A0B(r3, r10)
            r14 = 2
            r3 = r30
            X.0qQ.A0B(r3, r14)
            r14 = 3
            r3 = r31
            X.0qQ.A0B(r3, r14)
            r14 = 7
            r3 = r35
            X.0qQ.A0B(r3, r14)
            r3 = 8
            X.0qQ.A0B(r13, r3)
            r3 = 11
            X.0qQ.A0B(r12, r3)
            r3 = 16
            X.0qQ.A0B(r11, r3)
            r3 = 18
            X.0qQ.A0B(r4, r3)
            r3 = 22
            X.0qQ.A0B(r15, r3)
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity r14 = new com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity
            r29 = r23
            r34 = r19
            r36 = r13
            r37 = r0
            r39 = r12
            r42 = r28
            r43 = r27
            r44 = r26
            r45 = r25
            r46 = r24
            r23 = r14
            r24 = r11
            r25 = r4
            r26 = r15
            r27 = r47
            r28 = r17
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
        L_0x02c2:
            com.instagram.rtc.signaling.models.RtcConnectionEntity r14 = (com.instagram.rtc.signaling.models.RtcConnectionEntity) r14
            if (r14 != 0) goto L_0x02ce
        L_0x02c6:
            r3 = r19
            r0 = r17
            com.instagram.rtc.signaling.models.RtcConnectionEntity r14 = X.ABG.A00(r0, r9, r3)
        L_0x02ce:
            boolean r0 = r14 instanceof com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity
            if (r0 != 0) goto L_0x02d7
            boolean r0 = r14 instanceof com.instagram.rtc.signaling.models.RtcConnectionEntity.EndCallConnectionEntity
            r3 = 0
            if (r0 == 0) goto L_0x02d8
        L_0x02d7:
            r3 = 1
        L_0x02d8:
            r0 = r16
            boolean r0 = r0.A01(r5, r14)
            if (r0 == 0) goto L_0x044e
            if (r18 == 0) goto L_0x044e
            if (r3 == 0) goto L_0x044e
            java.lang.String r3 = r14.BkA()
            android.content.Context r0 = r7.A01
            android.content.Context r0 = r0.getApplicationContext()
            X.0qQ.A07(r0)
            X.0qQ.A0B(r3, r8)
            java.lang.String r0 = r1.A06
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 != 0) goto L_0x0423
            java.lang.String r0 = "no user session"
            goto L_0x01e7
        L_0x0300:
            boolean r3 = r14 instanceof com.instagram.rtc.signaling.models.RtcConnectionEntity.LiveInviteConnectionEntity
            if (r3 == 0) goto L_0x0352
            com.instagram.rtc.signaling.models.RtcConnectionEntity$LiveInviteConnectionEntity r14 = (com.instagram.rtc.signaling.models.RtcConnectionEntity.LiveInviteConnectionEntity) r14
            java.lang.String r15 = r14.A08
            java.lang.Integer r13 = r14.A04
            java.lang.Integer r12 = r14.A03
            com.instagram.model.rtc.RtcIgNotification r3 = r14.A01
            r25 = r3
            java.lang.Long r3 = r14.A05
            r29 = r3
            java.lang.String r11 = r14.A09
            java.lang.String r4 = r14.A0A
            java.lang.String r3 = r14.A06
            com.instagram.common.typedurl.ImageUrl r14 = r14.A00
            r24 = r14
            X.0qQ.A0B(r15, r10)
            r14 = 2
            X.0qQ.A0B(r13, r14)
            r14 = 3
            X.0qQ.A0B(r12, r14)
            r14 = 7
            X.0qQ.A0B(r11, r14)
            r14 = 8
            X.0qQ.A0B(r4, r14)
            r14 = 10
            X.0qQ.A0B(r3, r14)
            com.instagram.rtc.signaling.models.RtcConnectionEntity$LiveInviteConnectionEntity r14 = new com.instagram.rtc.signaling.models.RtcConnectionEntity$LiveInviteConnectionEntity
            r23 = r14
            r26 = r17
            r27 = r13
            r28 = r12
            r30 = r15
            r31 = r19
            r32 = r11
            r33 = r4
            r34 = r0
            r35 = r3
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x02c2
        L_0x0352:
            boolean r3 = r14 instanceof com.instagram.rtc.signaling.models.RtcConnectionEntity.EndCallConnectionEntity
            if (r3 == 0) goto L_0x03bc
            com.instagram.rtc.signaling.models.RtcConnectionEntity$EndCallConnectionEntity r14 = (com.instagram.rtc.signaling.models.RtcConnectionEntity.EndCallConnectionEntity) r14
            java.lang.String r15 = r14.A0C
            java.lang.Integer r13 = r14.A05
            java.lang.Integer r12 = r14.A03
            com.instagram.model.rtc.RtcIgNotification r3 = r14.A01
            r25 = r3
            java.lang.Long r3 = r14.A06
            r30 = r3
            java.lang.String r11 = r14.A0D
            java.lang.String r4 = r14.A0E
            java.lang.String r3 = r14.A08
            r36 = r3
            java.lang.String r3 = r14.A09
            r37 = r3
            java.lang.String r3 = r14.A07
            r38 = r3
            java.lang.String r3 = r14.A0A
            r39 = r3
            boolean r3 = r14.A0H
            r40 = r3
            java.lang.Integer r3 = r14.A04
            r29 = r3
            X.Nid r3 = r14.A00
            boolean r14 = r14.A0G
            r41 = r14
            X.0qQ.A0B(r15, r10)
            r14 = 2
            X.0qQ.A0B(r13, r14)
            r14 = 3
            X.0qQ.A0B(r12, r14)
            r14 = 7
            X.0qQ.A0B(r11, r14)
            r14 = 8
            X.0qQ.A0B(r4, r14)
            r14 = 16
            X.0qQ.A0B(r3, r14)
            com.instagram.rtc.signaling.models.RtcConnectionEntity$EndCallConnectionEntity r14 = new com.instagram.rtc.signaling.models.RtcConnectionEntity$EndCallConnectionEntity
            r23 = r14
            r24 = r3
            r26 = r17
            r27 = r13
            r28 = r12
            r31 = r15
            r32 = r19
            r33 = r11
            r34 = r4
            r35 = r0
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            goto L_0x02c2
        L_0x03bc:
            boolean r3 = r14 instanceof com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallGenericConnectionEntity
            if (r3 == 0) goto L_0x06fb
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallGenericConnectionEntity r14 = (com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallGenericConnectionEntity) r14
            java.lang.String r12 = r14.A06
            java.lang.Integer r11 = r14.A03
            java.lang.Integer r4 = r14.A02
            com.instagram.model.rtc.RtcIgNotification r3 = r14.A00
            r24 = r3
            java.lang.Long r13 = r14.A04
            java.lang.String r3 = r14.A07
            java.lang.String r15 = r14.A08
            X.0qQ.A0B(r12, r10)
            r14 = 2
            X.0qQ.A0B(r11, r14)
            r14 = 3
            X.0qQ.A0B(r4, r14)
            r14 = 7
            X.0qQ.A0B(r3, r14)
            r14 = 8
            X.0qQ.A0B(r15, r14)
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallGenericConnectionEntity r14 = new com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallGenericConnectionEntity
            r23 = r14
            r25 = r17
            r26 = r11
            r27 = r4
            r28 = r13
            r29 = r12
            r30 = r19
            r31 = r3
            r32 = r15
            r33 = r0
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x02c2
        L_0x0401:
            boolean r0 = r14 instanceof com.instagram.rtc.signaling.models.RtcConnectionEntity.EndCallConnectionEntity
            if (r0 == 0) goto L_0x0410
            r0 = r14
            com.instagram.rtc.signaling.models.RtcConnectionEntity$EndCallConnectionEntity r0 = (com.instagram.rtc.signaling.models.RtcConnectionEntity.EndCallConnectionEntity) r0
            java.lang.String r0 = r0.A0F
            if (r0 != 0) goto L_0x0221
            java.lang.String r0 = r9.A0F
            goto L_0x0221
        L_0x0410:
            r0 = r20
            goto L_0x0221
        L_0x0414:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r3 != r0) goto L_0x041c
            X.NjG r17 = X.C69315NjG.Left
            goto L_0x020c
        L_0x041c:
            X.NjG r17 = X.C69315NjG.Ended
            goto L_0x020c
        L_0x0420:
            r0 = 0
            goto L_0x0204
        L_0x0423:
            X.12V r3 = r7.A03
            r0 = 1894003928(0x70e434d8, float:5.6501173E29)
            X.0nV r4 = r3.AOJ(r0, r10)
            X.1HY r3 = new X.1HY
            r0 = r20
            r3.<init>(r0)
            X.4Cc r0 = r4.plus(r3)
            X.19S r4 = X.19E.A02(r0)
            r17 = 4
            X.9KK r3 = new X.9KK
            r11 = r3
            r12 = r7
            r13 = r1
            r15 = r5
            r16 = r20
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r3, r4)
            goto L_0x045c
        L_0x044e:
            java.lang.String r4 = "invalid transition didn't show missed call notification"
            r3 = r22
            r0 = r21
            r3.A00(r0, r4)
            java.lang.String r0 = "invalid transition"
            r5.AUZ(r0)
        L_0x045c:
            java.lang.String r0 = r6.A17
            if (r0 == 0) goto L_0x046a
            byte[] r3 = android.util.Base64.decode(r0, r8)
            if (r3 == 0) goto L_0x046a
            r0 = 2
            r7.A0G(r1, r3, r0, r8)
        L_0x046a:
            X.1XD r1 = r7.A05
            java.lang.String r0 = X.C70907OQz.A00(r14)
            r1.A05(r0, r10, r8)
            goto L_0x04d0
        L_0x0474:
            java.lang.Object r3 = r0.A03
            X.Pvp r3 = (X.C74495Pvp) r3
            java.lang.String r1 = "Unsupported event "
            if (r3 == 0) goto L_0x0485
            java.lang.String r0 = r6.A0g
            java.lang.String r0 = X.002.A0R(r1, r0)
            r3.AUZ(r0)
        L_0x0485:
            X.OWb r4 = X.C71004OWb.A00
            java.lang.String r0 = r6.A0g
            java.lang.String r3 = X.002.A0R(r1, r0)
            r1 = 0
            java.lang.String r0 = "RtcCallSignalingProcessor"
            r4.A03(r0, r3, r1)
            goto L_0x04d0
        L_0x0494:
            r9 = move-exception
            X.0wj r3 = X.0wj.A01
            X.ON9 r0 = new X.ON9
            r0.<init>(r3)
            java.lang.String r8 = "Can't set incoming live rtc message"
            X.0fA r4 = r0.A00
            r0 = 659041254(0x27482be6, float:2.7779373E-15)
            X.0qQ.A0B(r4, r10)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            X.0f9 r0 = r4.AEf(r8, r0)
            r0.ERJ(r9)
            X.OW1.A00(r0, r8, r9, r3)
        L_0x04b5:
            X.OWb r4 = X.C71004OWb.A00
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "handleIgLiveInviteNotification "
            r3.append(r0)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "RtcCallSignalingProcessor"
            r4.A01(r0, r3)
            X.1XE.A00(r6, r1, r5, r7)
        L_0x04d0:
            if (r2 == 0) goto L_0x0136
            r0 = 0
            r2.AId(r0)
            goto L_0x0136
        L_0x04d8:
            X.0wj r3 = X.0wj.A01
            X.ON9 r9 = new X.ON9
            r9.<init>(r3)
            java.lang.String r5 = "Received unexpected non-room rtc notification("
            java.lang.String r4 = r6.A0X
            r3 = 41
            java.lang.String r3 = X.002.A0S(r5, r4, r3)
            r9.A01(r3)
            java.lang.String r3 = r6.A0g
            if (r3 == 0) goto L_0x0028
            android.net.Uri r11 = X.0cp.A03(r3)
            X.0qQ.A07(r11)
            java.lang.String r3 = "vc_id"
            java.lang.String r9 = r11.getQueryParameter(r3)
            if (r9 != 0) goto L_0x0519
            X.OWb r5 = X.C71004OWb.A00
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = "ackPushNotification: invalid videoCallId. uri: "
            r4.append(r3)
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            java.lang.String r3 = "RtcCallSignalingProcessor"
            r5.A00(r3, r4)
            goto L_0x0028
        L_0x0519:
            java.lang.String r12 = r6.A0f
            r3 = 789(0x315, float:1.106E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            java.lang.String r4 = r11.getQueryParameter(r3)
            java.lang.String r3 = r6.A0X
            java.lang.Integer r3 = X.A1C.A00(r3)
            java.lang.String r11 = X.O2D.A00(r3)
            r3 = -2
            X.1NY r5 = new X.1NY
            r5.<init>(r1, r3)
            r5.A04()
            java.lang.String r3 = "video_call/ack_notification/"
            r5.A0A(r3)
            r3 = 1622(0x656, float:2.273E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r5.A9m(r3, r12)
            r3 = 1624(0x658, float:2.276E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r5.A9m(r3, r11)
            r3 = 821(0x335, float:1.15E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r5.A9m(r3, r9)
            r3 = 4037(0xfc5, float:5.657E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r5.A9m(r3, r4)
            java.lang.Class<X.1XP> r4 = X.1XP.class
            java.lang.Class<X.1XY> r3 = X.1XY.class
            r5.A0Q(r4, r3)
            X.1OC r3 = r5.A0M()
            X.1ES.A03(r3)
            goto L_0x0028
        L_0x0571:
            X.32p r1 = (X.C2361432p) r1
            X.4Gh r2 = (X.C262864Gh) r2
            r6 = 0
            X.0qQ.A0B(r1, r6)
            r3 = 1
            X.0qQ.A0B(r2, r3)
            java.lang.Object r5 = r0.A02
            X.1Xj r5 = (X.1Xj) r5
            java.lang.Object r4 = r0.A03
            X.3W1 r4 = (X.AnonymousClass3W1) r4
            r1.CjM(r5, r4)
            java.lang.Object r1 = r0.A04
            X.3el r1 = (X.C246533el) r1
            com.instagram.common.session.UserSession r3 = r1.A00
            java.lang.Object r1 = r0.A01
            X.4DU r1 = (X.AnonymousClass4DU) r1
            java.lang.String r0 = r1.getModuleName()
            r7 = 0
            X.4Jz r11 = X.C263264Jy.A00(r3, r5, r0, r6)
            r6 = r2
            r8 = r5
            r9 = r1
            r10 = r4
            r6.Dx7(r7, r8, r9, r10, r11)
            goto L_0x0136
        L_0x05a4:
            java.lang.String r1 = (java.lang.String) r1
            android.view.View r2 = (android.view.View) r2
            r3 = 0
            X.0qQ.A0B(r1, r3)
            r3 = 1
            X.0qQ.A0B(r2, r3)
            java.lang.Object r5 = r0.A01
            X.3fJ r5 = (X.C246833fJ) r5
            java.lang.Object r4 = r0.A03
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r3 = r0.A04
            X.3W1 r3 = (X.AnonymousClass3W1) r3
            java.lang.Object r0 = r0.A02
            X.0iw r0 = (X.AnonymousClass0iw) r0
            r6 = r2
            r7 = r0
            r8 = r4
            r9 = r3
            r10 = r1
            r5.DN3(r6, r7, r8, r9, r10)
            goto L_0x0136
        L_0x05ca:
            android.view.View r1 = (android.view.View) r1
            X.4h4 r2 = (X.C270644h4) r2
            r3 = 0
            X.0qQ.A0B(r1, r3)
            java.lang.Object r5 = r0.A01
            X.3fJ r5 = (X.C246833fJ) r5
            java.lang.Object r4 = r0.A03
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r3 = r0.A04
            X.3W1 r3 = (X.AnonymousClass3W1) r3
            java.lang.Object r0 = r0.A02
            X.0iw r0 = (X.AnonymousClass0iw) r0
            r6 = r1
            r7 = r2
            r8 = r0
            r9 = r4
            r10 = r3
            r5.DN9(r6, r7, r8, r9, r10)
            goto L_0x0136
        L_0x05ec:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r9 = r1.booleanValue()
            android.view.View r2 = (android.view.View) r2
            r1 = 1
            X.0qQ.A0B(r2, r1)
            java.lang.Object r4 = r0.A01
            X.3fJ r4 = (X.C246833fJ) r4
            java.lang.Object r3 = r0.A03
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r1 = r0.A04
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            java.lang.Object r0 = r0.A02
            X.0iw r0 = (X.AnonymousClass0iw) r0
            r5 = r2
            r6 = r0
            r7 = r3
            r8 = r1
            r4.DN8(r5, r6, r7, r8, r9)
            goto L_0x0136
        L_0x0611:
            X.5Wy r1 = (X.C286575Wy) r1
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r2 = 2
            if (r3 != r2) goto L_0x0629
            boolean r2 = r1.Bwn()
            if (r2 == 0) goto L_0x0629
            r1.Evl()
            goto L_0x0136
        L_0x0629:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0637
            r3 = 300418417(0x11e80571, float:3.66065E-28)
            java.lang.String r2 = "com.instagram.feed.tifu.TifuNetegoComposeBinder.bindTifuNetego.<anonymous>.<anonymous> (TifuNetegoComposeBinder.kt:159)"
            X.0fL.A01(r3, r2)
        L_0x0637:
            java.lang.Object r9 = r0.A04
            X.33r r9 = (X.C2364233r) r9
            java.lang.Object r2 = r0.A02
            X.9Ii r2 = (X.C376529Ii) r2
            java.lang.Object r8 = r2.A05
            com.instagram.feed.tifu.TifuViewModel r8 = (com.instagram.feed.tifu.TifuViewModel) r8
            java.lang.Object r7 = r2.A04
            X.5va r7 = (X.C299635va) r7
            java.lang.Object r6 = r2.A02
            X.5vd r6 = (X.C299665vd) r6
            java.lang.Object r5 = r2.A01
            X.5vY r5 = (X.AnonymousClass5vY) r5
            java.lang.Object r4 = r2.A03
            X.0sP r4 = (X.0sP) r4
            java.lang.Object r3 = r0.A03
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            boolean r2 = r9.A04
            if (r2 == 0) goto L_0x0671
            java.lang.Object r0 = r0.A01
            X.4oe r0 = (X.C274594oe) r0
            X.4ob r0 = r0.A02
            if (r0 == 0) goto L_0x0671
            X.4oa r0 = (X.C274564oa) r0
            java.lang.Boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0671
            boolean r0 = r0.booleanValue()
            r19 = 1
            if (r0 != 0) goto L_0x0673
        L_0x0671:
            r19 = 0
        L_0x0673:
            r18 = 0
            r10 = r1
            r11 = r6
            r12 = r7
            r13 = r5
            r14 = r9
            r15 = r8
            r16 = r3
            r17 = r4
            X.C2364233r.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0136
            r0 = 2081046477(0x7c0a3fcd, float:2.871324E36)
            X.0fL.A00(r0)
            goto L_0x0136
        L_0x0690:
            android.app.Activity r1 = (android.app.Activity) r1
            r4 = 1
            X.0qQ.A0B(r2, r4)
            java.lang.Object r7 = r0.A04
            X.3Yc r7 = (X.C243273Yc) r7
            java.lang.Object r6 = r0.A01
            X.1Xj r6 = (X.1Xj) r6
            java.lang.Object r3 = r0.A02
            java.lang.Object r5 = r0.A03
            X.0iw r5 = (X.AnonymousClass0iw) r5
            boolean r0 = r1 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L_0x0136
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            if (r1 == 0) goto L_0x0136
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.0qQ.A0B(r3, r4)
            X.IQ2 r11 = new X.IQ2
            r12 = r0
            r13 = r2
            r14 = r6
            r15 = r3
            r16 = r7
            r11.<init>(r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r3 = r7.A00
            X.3gF r0 = X.C247323g9.A00(r3)
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x06cf
            r11.DZJ()
            goto L_0x0136
        L_0x06cf:
            X.F1J r7 = X.E68.A08
            java.lang.String r12 = r6.getId()
            if (r12 != 0) goto L_0x06d9
            java.lang.String r12 = ""
        L_0x06d9:
            java.lang.String r13 = r5.getModuleName()
            X.GPK r9 = X.GPK.NEW_TOOLTIP
            X.3fc r0 = X.C247003fc.COMMENT_BUTTON
            r15 = 0
            if (r2 != r0) goto L_0x06e5
            r15 = 1
        L_0x06e5:
            r14 = 0
            r8 = r1
            r10 = r3
            r16 = r4
            r7.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0136
        L_0x06ef:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x06f5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x06fb:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0701:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0707:
            r1 = 1
            X.0qQ.A0B(r2, r1)
            X.0rm r5 = new X.0rm
            r5.<init>()
            java.lang.Object r3 = r0.A04
            X.3fb r3 = (X.C246993fb) r3
            if (r3 == 0) goto L_0x0737
            java.lang.Object r1 = r0.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r1 = r1.invoke(r2)
            X.3ey r1 = (X.C246663ey) r1
            X.3Ux r2 = r1.A05
            if (r2 == 0) goto L_0x0746
            r2.A00 = r3
            r1 = 2
            X.IUb r4 = new X.IUb
            r4.<init>(r2, r1)
            r5.A00 = r4
            java.lang.Object r3 = r0.A02
            X.3W1 r3 = (X.AnonymousClass3W1) r3
            r2 = 0
            r1 = 0
            r3.A0L(r4, r2, r1)
        L_0x0737:
            java.lang.Object r2 = r0.A02
            r1 = 45
            X.Inq r0 = new X.Inq
            r0.<init>(r1, r2, r5)
            X.3eI r5 = new X.3eI
            r5.<init>(r0)
            return r5
        L_0x0746:
            java.lang.String r1 = "watch and browse media holder should not be null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x074e:
            r1 = 1
            X.0qQ.A0B(r2, r1)
            java.lang.Object r1 = r0.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r7 = r1.invoke(r2)
            X.3ey r7 = (X.C246663ey) r7
            X.3V4 r6 = r7.A03
            if (r6 == 0) goto L_0x0791
            android.content.Context r5 = r7.A00
            if (r5 == 0) goto L_0x0785
            java.lang.Object r4 = r0.A04
            X.9IP r4 = (X.AnonymousClass9IP) r4
            java.lang.Object r3 = r0.A03
            X.4Js r3 = (X.AnonymousClass4Js) r3
            java.lang.Object r2 = r0.A02
            r1 = 44
            X.Inq r0 = new X.Inq
            r0.<init>(r1, r7, r2)
            X.AnonymousClass4Jq.A00(r5, r4, r6, r3, r0)
            r1 = 10
            X.Inj r0 = new X.Inj
            r0.<init>(r7, r1)
            X.3eI r5 = new X.3eI
            r5.<init>(r0)
            return r5
        L_0x0785:
            r0 = 1226(0x4ca, float:1.718E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0791:
            r0 = 4187(0x105b, float:5.867E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x079d:
            X.3V9 r1 = (X.AnonymousClass3V9) r1
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r12 = r2.booleanValue()
            r4 = 0
            X.0qQ.A0B(r1, r4)
            java.lang.Object r6 = r0.A02
            X.1Xj r6 = (X.1Xj) r6
            java.lang.Object r9 = r0.A03
            X.3W1 r9 = (X.AnonymousClass3W1) r9
            java.lang.Object r3 = r0.A04
            X.3dW r3 = (X.C245813dW) r3
            X.3Xd r2 = r3.A01
            X.4Gh r10 = r2.BR1()
            java.lang.Object r8 = r0.A01
            X.4DU r8 = (X.AnonymousClass4DU) r8
            com.instagram.common.session.UserSession r5 = r3.A00
            X.0qQ.A0B(r6, r4)
            r0 = 1
            X.0qQ.A0B(r9, r0)
            r0 = 2
            X.0qQ.A0B(r10, r0)
            r0 = 4
            X.0qQ.A0B(r8, r0)
            r7 = r6
            r11 = r1
            X.3aW r5 = X.C262914Gm.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            return r5
        L_0x07d7:
            r3 = 0
            X.0qQ.A0B(r1, r3)
            r7 = 1
            X.0qQ.A0B(r2, r7)
            java.lang.Object r3 = r0.A04
            X.4Fu r3 = (X.C262734Fu) r3
            com.instagram.common.session.UserSession r6 = r3.A00
            java.lang.Object r4 = r0.A01
            java.lang.Object r3 = r0.A03
            java.lang.Object r0 = r0.A02
            X.1Xj r0 = (X.1Xj) r0
            X.1Xy r0 = r0.A0C
            com.instagram.user.model.User r14 = r0.CCd()
            r9 = 18
            X.Ixb r8 = new X.Ixb
            r10 = r2
            r11 = r4
            r12 = r3
            r13 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r10 = 0
            X.3aW r5 = new X.3aW
            r11 = r10
            r12 = r8
            r8 = r5
            r9 = r6
            r13 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            return r5
        L_0x080a:
            X.3V2 r1 = (X.AnonymousClass3V2) r1
            X.2xS r2 = (X.AnonymousClass2xS) r2
            r7 = 0
            X.0qQ.A0B(r1, r7)
            r3 = 1
            X.0qQ.A0B(r2, r3)
            java.lang.Object r3 = r0.A03
            X.33Z r3 = (X.AnonymousClass33Z) r3
            X.0eM r3 = r3.A0G
            java.lang.Object r8 = r3.getValue()
            X.Hqq r8 = (X.C55985Hqq) r8
            java.lang.Object r6 = r0.A01
            X.1Xj r6 = (X.1Xj) r6
            java.lang.Object r5 = r0.A02
            X.3W1 r5 = (X.AnonymousClass3W1) r5
            java.lang.Object r4 = r0.A04
            X.33W r4 = (X.AnonymousClass33W) r4
            X.4DU r3 = r4.A08
            X.310 r0 = r4.A03
            X.JQG r10 = r0.Aoj()
            int r16 = r5.getPosition()
            android.content.Context r9 = r4.A00
            r11 = r1
            r12 = r6
            r13 = r3
            r14 = r5
            r15 = r2
            r17 = r7
            X.GmH r5 = r8.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r5
        L_0x0848:
            X.2xS r1 = (X.AnonymousClass2xS) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r2 = r0.A03
            X.33Z r2 = (X.AnonymousClass33Z) r2
            X.0eM r2 = r2.A0a
            java.lang.Object r2 = r2.getValue()
            X.3dW r2 = (X.C245813dW) r2
            java.lang.Object r4 = r0.A01
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r6 = r0.A02
            X.3W1 r6 = (X.AnonymousClass3W1) r6
            java.lang.Object r0 = r0.A04
            X.33W r0 = (X.AnonymousClass33W) r0
            android.content.Context r3 = r0.A00
            X.4DU r5 = r0.A08
            r7 = r1
            X.3et r5 = r2.A00(r3, r4, r5, r6, r7)
            return r5
        L_0x0870:
            X.416 r1 = (X.AnonymousClass416) r1
            X.3WV r2 = (X.AnonymousClass3WV) r2
            r3 = 0
            X.0qQ.A0B(r1, r3)
            r3 = 1
            X.0qQ.A0B(r2, r3)
            java.lang.Object r7 = r0.A02
            X.1Xj r7 = (X.1Xj) r7
            java.lang.Object r6 = r0.A03
            X.3W1 r6 = (X.AnonymousClass3W1) r6
            java.lang.Object r5 = r0.A04
            X.3fU r5 = (X.C246943fU) r5
            com.instagram.common.session.UserSession r4 = r5.A00
            java.lang.Object r3 = r0.A01
            X.4DU r3 = (X.AnonymousClass4DU) r3
            X.3kK r0 = r5.A01
            X.3fK r5 = new X.3fK
            r8 = r5
            r9 = r4
            r10 = r2
            r11 = r1
            r12 = r7
            r13 = r3
            r14 = r6
            r15 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r5
        L_0x089e:
            android.content.Context r1 = (android.content.Context) r1
            X.4DU r2 = (X.AnonymousClass4DU) r2
            r3 = 0
            X.0qQ.A0B(r1, r3)
            r3 = 1
            X.0qQ.A0B(r2, r3)
            java.lang.Object r5 = r0.A01
            X.3YT r5 = (X.AnonymousClass3YT) r5
            java.lang.Object r3 = r0.A04
            X.5Es r3 = (X.C282785Es) r3
            com.instagram.common.session.UserSession r4 = r3.A00
            java.lang.Object r3 = r0.A02
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r0 = r0.A03
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            r6 = r1
            r7 = r4
            r8 = r3
            r9 = r2
            r10 = r0
            java.lang.CharSequence r5 = r5.Bqi(r6, r7, r8, r9, r10)
            return r5
        L_0x08c6:
            android.content.Context r1 = (android.content.Context) r1
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            r3 = 0
            X.0qQ.A0B(r1, r3)
            r3 = 1
            X.0qQ.A0B(r2, r3)
            X.3eW r6 = X.C246393eW.A00
            java.lang.Object r3 = r0.A04
            X.4nl r3 = (X.C274134nl) r3
            com.instagram.common.session.UserSession r5 = r3.A00
            java.lang.Object r4 = r0.A02
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r3 = r0.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r0 = r0.A03
            X.4DU r0 = (X.AnonymousClass4DU) r0
            r13 = 0
            goto L_0x0936
        L_0x08e8:
            X.3V9 r1 = (X.AnonymousClass3V9) r1
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            r5 = 0
            X.0qQ.A0B(r1, r5)
            r3 = 1
            X.0qQ.A0B(r2, r3)
            java.lang.Object r7 = r0.A01
            X.1Xj r7 = (X.1Xj) r7
            java.lang.Object r8 = r0.A02
            X.1Xj r8 = (X.1Xj) r8
            java.lang.Object r4 = r0.A04
            X.4nl r4 = (X.C274134nl) r4
            X.4nj r3 = r4.A01
            X.4Gh r11 = r3.BR1()
            java.lang.Object r9 = r0.A03
            X.4DU r9 = (X.AnonymousClass4DU) r9
            com.instagram.common.session.UserSession r6 = r4.A00
            r10 = r2
            r12 = r1
            r13 = r5
            X.3aW r5 = X.C262914Gm.A00(r6, r7, r8, r9, r10, r11, r12, r13)
            return r5
        L_0x0914:
            android.content.Context r1 = (android.content.Context) r1
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            r3 = 0
            X.0qQ.A0B(r1, r3)
            r3 = 1
            X.0qQ.A0B(r2, r3)
            X.3eW r6 = X.C246393eW.A00
            java.lang.Object r3 = r0.A04
            X.4nl r3 = (X.C274134nl) r3
            com.instagram.common.session.UserSession r5 = r3.A00
            java.lang.Object r4 = r0.A02
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r3 = r0.A01
            X.1Xj r3 = (X.1Xj) r3
            X.3VA r13 = X.AnonymousClass3VA.ADD_CONTENT_NOTE
            java.lang.Object r0 = r0.A03
            X.4DU r0 = (X.AnonymousClass4DU) r0
        L_0x0936:
            r7 = r1
            r8 = r5
            r9 = r4
            r10 = r3
            r11 = r0
            r12 = r2
            X.4Fv r5 = r6.A00(r7, r8, r9, r10, r11, r12, r13)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9MT.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
