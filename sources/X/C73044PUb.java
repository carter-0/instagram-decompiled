package X;

/* renamed from: X.PUb  reason: case insensitive filesystem */
public final class C73044PUb implements Runnable {
    public final /* synthetic */ NDz A00;

    public C73044PUb(NDz nDz) {
        this.A00 = nDz;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002a, code lost:
        if (X.OZz.A01(r1) != false) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00eb A[Catch:{ RuntimeException -> 0x0124 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            X.NDz r4 = r14.A00     // Catch:{ RuntimeException -> 0x0124 }
            boolean r2 = r4.A06     // Catch:{ RuntimeException -> 0x0124 }
            boolean r10 = r4.A0B()     // Catch:{ RuntimeException -> 0x0124 }
            X.ONv r0 = r4.A06     // Catch:{ RuntimeException -> 0x0124 }
            boolean r0 = r0.A03()     // Catch:{ RuntimeException -> 0x0124 }
            r4.A0D = r0     // Catch:{ RuntimeException -> 0x0124 }
            android.media.AudioManager r0 = r4.A02     // Catch:{ RuntimeException -> 0x0124 }
            boolean r0 = r0.isWiredHeadsetOn()     // Catch:{ RuntimeException -> 0x0124 }
            r4.aomIsHeadsetAttached = r0     // Catch:{ RuntimeException -> 0x0124 }
            r4.A0C()     // Catch:{ RuntimeException -> 0x0124 }
            X.OYs r0 = r4.A09     // Catch:{ RuntimeException -> 0x0124 }
            X.OZz r1 = r0.A05     // Catch:{ RuntimeException -> 0x0124 }
            boolean r0 = r1.A05()     // Catch:{ RuntimeException -> 0x0124 }
            if (r0 != 0) goto L_0x002c
            boolean r0 = X.OZz.A01(r1)     // Catch:{ RuntimeException -> 0x0124 }
            r9 = 0
            if (r0 == 0) goto L_0x002d
        L_0x002c:
            r9 = 1
        L_0x002d:
            java.lang.String r6 = "RtcAudioOutputManager"
            r7 = 4
            r8 = 0
            r13 = 1
            if (r2 != 0) goto L_0x0041
            if (r10 != 0) goto L_0x0041
            boolean r0 = r4.A0D     // Catch:{ RuntimeException -> 0x0124 }
            if (r0 == 0) goto L_0x00e7
            boolean r0 = r4.aomIsHeadsetAttached     // Catch:{ RuntimeException -> 0x0124 }
            if (r0 != 0) goto L_0x006f
            if (r9 != 0) goto L_0x00e7
            goto L_0x006f
        L_0x0041:
            boolean r0 = r4.A0D     // Catch:{ RuntimeException -> 0x0124 }
            if (r0 != 0) goto L_0x00e7
            boolean r0 = r4.aomIsHeadsetAttached     // Catch:{ RuntimeException -> 0x0124 }
            if (r0 != 0) goto L_0x00e7
            if (r9 != 0) goto L_0x00e7
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch:{ RuntimeException -> 0x0124 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r10)     // Catch:{ RuntimeException -> 0x0124 }
            boolean r0 = r4.aomIsHeadsetAttached     // Catch:{ RuntimeException -> 0x0124 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ RuntimeException -> 0x0124 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)     // Catch:{ RuntimeException -> 0x0124 }
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r3, r1, r0}     // Catch:{ RuntimeException -> 0x0124 }
            java.lang.String r1 = "audio route heal enabling speakerphone: isVideoCall=%b expectedSP=%b headset=%b bt=%b"
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)     // Catch:{ RuntimeException -> 0x0124 }
            X.0KC.A0P(r6, r1, r0)     // Catch:{ RuntimeException -> 0x0124 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)     // Catch:{ RuntimeException -> 0x0124 }
            goto L_0x0092
        L_0x006f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch:{ RuntimeException -> 0x0124 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r10)     // Catch:{ RuntimeException -> 0x0124 }
            boolean r0 = r4.aomIsHeadsetAttached     // Catch:{ RuntimeException -> 0x0124 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ RuntimeException -> 0x0124 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)     // Catch:{ RuntimeException -> 0x0124 }
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r3, r1, r0}     // Catch:{ RuntimeException -> 0x0124 }
            java.lang.String r1 = "audio route heal disabling speakerphone: isVideoCall=%b expectedSP=%b headset=%b bt=%b"
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)     // Catch:{ RuntimeException -> 0x0124 }
            X.0KC.A0P(r6, r1, r0)     // Catch:{ RuntimeException -> 0x0124 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ RuntimeException -> 0x0124 }
        L_0x0092:
            boolean r3 = r0.booleanValue()     // Catch:{ RuntimeException -> 0x0124 }
            java.lang.String r0 = "audio_routing"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ RuntimeException -> 0x0124 }
            java.util.ArrayList r11 = X.0sr.A1L(r0)     // Catch:{ RuntimeException -> 0x0124 }
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x0124 }
            java.lang.String r0 = "speakerphone_enable"
            X.0eP r7 = X.AnonymousClass7TE.A1L(r0, r1)     // Catch:{ RuntimeException -> 0x0124 }
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ RuntimeException -> 0x0124 }
            java.lang.String r0 = "is_video"
            X.0eP r6 = X.AnonymousClass7TE.A1L(r0, r1)     // Catch:{ RuntimeException -> 0x0124 }
            java.lang.String r1 = java.lang.String.valueOf(r10)     // Catch:{ RuntimeException -> 0x0124 }
            java.lang.String r0 = "speakerphone_expected"
            X.0eP r5 = X.AnonymousClass7TE.A1L(r0, r1)     // Catch:{ RuntimeException -> 0x0124 }
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch:{ RuntimeException -> 0x0124 }
            java.lang.String r0 = "bluetooth_available"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)     // Catch:{ RuntimeException -> 0x0124 }
            boolean r0 = r4.aomIsHeadsetAttached     // Catch:{ RuntimeException -> 0x0124 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ RuntimeException -> 0x0124 }
            java.lang.String r0 = "headset_available"
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r1)     // Catch:{ RuntimeException -> 0x0124 }
            X.0eP[] r0 = new X.0eP[]{r7, r6, r5, r2, r0}     // Catch:{ RuntimeException -> 0x0124 }
            java.util.LinkedHashMap r12 = X.0Yt.A06(r0)     // Catch:{ RuntimeException -> 0x0124 }
            r7 = 0
            java.lang.String r8 = "audio_route_healer_route_change"
            r9 = r7
            r10 = r7
            X.OX3.A02(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ RuntimeException -> 0x0124 }
            r4.A09(r3)     // Catch:{ RuntimeException -> 0x0124 }
        L_0x00e7:
            java.lang.Runnable r5 = r4.A02     // Catch:{ RuntimeException -> 0x0124 }
            if (r5 == 0) goto L_0x0133
            X.NrE r1 = r4.A0A     // Catch:{ RuntimeException -> 0x0124 }
            boolean r0 = r1 instanceof X.NE0     // Catch:{ RuntimeException -> 0x0124 }
            if (r0 == 0) goto L_0x011f
            X.NE0 r1 = (X.NE0) r1     // Catch:{ RuntimeException -> 0x0124 }
            com.instagram.common.session.UserSession r3 = r1.A00     // Catch:{ RuntimeException -> 0x0124 }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ RuntimeException -> 0x0124 }
            r0 = 36316173281005577(0x81055e00041009, double:3.029832444175657E-306)
            boolean r0 = X.182.A06(r2, r3, r0)     // Catch:{ RuntimeException -> 0x0124 }
            if (r0 == 0) goto L_0x0117
            X.4Cc r0 = r4.A0C     // Catch:{ RuntimeException -> 0x0124 }
            X.19S r3 = X.19E.A02(r0)     // Catch:{ RuntimeException -> 0x0124 }
            r2 = 0
            r1 = 32
            X.JTh r0 = new X.JTh     // Catch:{ RuntimeException -> 0x0124 }
            r0.<init>((java.lang.Object) r5, (X.AnonymousClass4D7) r2, (int) r1)     // Catch:{ RuntimeException -> 0x0124 }
            X.1Er r0 = X.C51966G9m.A1L(r0, r3)     // Catch:{ RuntimeException -> 0x0124 }
            r4.A03 = r0     // Catch:{ RuntimeException -> 0x0124 }
            return
        L_0x0117:
            android.os.Handler r2 = r4.A07     // Catch:{ RuntimeException -> 0x0124 }
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.postDelayed(r5, r0)     // Catch:{ RuntimeException -> 0x0124 }
            return
        L_0x011f:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ RuntimeException -> 0x0124 }
            throw r0     // Catch:{ RuntimeException -> 0x0124 }
        L_0x0124:
            r4 = move-exception
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "RtcAudioOutputManager"
            java.lang.String r1 = "Audio route check failed, stopping it now."
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            X.0KC.A0L(r2, r1, r4, r0)
        L_0x0133:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73044PUb.run():void");
    }
}
