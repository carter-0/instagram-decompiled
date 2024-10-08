package X;

/* renamed from: X.LLi  reason: case insensitive filesystem */
public abstract class C64064LLi {
    public static final C63382Kw3 A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0112, code lost:
        if (X.DbT.A1b(r3.A0K(new X.C64449Lc5(r0), X.1us.class)) != false) goto L_0x0114;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.LP8 r22) {
        /*
            X.0nx r1 = X.C61610nw.A00()
            java.lang.String r0 = "VIDEO_CALCULATION"
            X.0vF r6 = X.JTP.A0W(r1, r0)
            r0 = r22
            android.content.Context r12 = r0.A0B
            X.37k r15 = r0.A0E
            X.3Q2 r14 = r0.A0D
            com.instagram.common.session.UserSession r13 = r0.A0C
            X.Kw3 r16 = A00
            java.util.concurrent.ConcurrentHashMap r1 = X.C63535Kyk.A00
            java.lang.String r0 = r14.A3t
            X.0gF r7 = X.C60340gF.A00
            java.lang.Object r0 = r1.putIfAbsent(r0, r7)
            if (r0 != 0) goto L_0x00b7
            r2 = 0
            java.lang.String r5 = "BandwidthQplLogger"
            X.1QP r4 = X.AnonymousClass1QO.A00(r13)
            r1 = 639763568(0x26220470, float:5.6211055E-16)
            java.lang.String r0 = r14.A3t     // Catch:{ Exception -> 0x0081 }
            long r0 = r4.flowStartForMarker(r1, r0, r2)     // Catch:{ Exception -> 0x0081 }
            X.1Bh r2 = X.1Bh.A00()     // Catch:{ Exception -> 0x0081 }
            double r2 = r2.A01()     // Catch:{ Exception -> 0x0081 }
            long r10 = (long) r2     // Catch:{ Exception -> 0x0081 }
            X.1Bq r2 = X.C64011Bq.A00()     // Catch:{ Exception -> 0x0081 }
            double r2 = r2.A01()     // Catch:{ Exception -> 0x0081 }
            long r8 = (long) r2     // Catch:{ Exception -> 0x0081 }
            java.lang.String r3 = "media_type"
            X.1iA r2 = r14.A1G     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0081 }
            r4.flowAnnotate(r0, r3, r2)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r3 = "share_type"
            com.instagram.pendingmedia.model.constants.ShareType r2 = r14.A0E()     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0081 }
            r4.flowAnnotate(r0, r3, r2)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r20 = "download_bw_reading"
            r21 = r10
            r18 = r0
            r17 = r4
            r17.flowAnnotate(r18, r20, r21)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r20 = "upload_bw_reading"
            r21 = r8
            r17.flowAnnotate(r18, r20, r21)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r20 = "process_age_sec"
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x0081 }
            long r2 = android.os.Process.getElapsedCpuTime()     // Catch:{ Exception -> 0x0081 }
            long r21 = r8.toSeconds(r2)     // Catch:{ Exception -> 0x0081 }
            r17.flowAnnotate(r18, r20, r21)     // Catch:{ Exception -> 0x0081 }
            r4.flowEndSuccess(r0)     // Catch:{ Exception -> 0x0081 }
            goto L_0x008a
        L_0x0081:
            r1 = move-exception
            java.lang.String r0 = "bandwidth qpl logging err"
            X.0KC.A0G(r5, r0, r1)
            X.0wb.A07(r5, r1)
        L_0x008a:
            r1 = 30
            int r0 = X.C63114Kri.A00()
            if (r0 < r1) goto L_0x00b7
            X.3QP r0 = r14.A1j
            java.util.List r1 = r0.A06
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00b7
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0184
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0184
        L_0x00a6:
            X.3QP r0 = r14.A1j
            boolean r0 = r0.A07
            if (r0 != 0) goto L_0x00b7
            X.0qQ.A0A(r16)
            X.KJL r11 = new X.KJL
            r11.<init>(r12, r13, r14, r15, r16)
            r6.ATE(r11)
        L_0x00b7:
            X.LMr r2 = new X.LMr
            r2.<init>(r13, r6, r14)
            X.3Q2 r3 = r2.A03
            boolean r1 = r3.A0y()
            if (r1 != 0) goto L_0x00cb
            boolean r0 = r3.A12()
            if (r0 != 0) goto L_0x00cb
        L_0x00ca:
            return
        L_0x00cb:
            java.lang.String r0 = r3.A3D
            if (r0 != 0) goto L_0x00ca
            X.0wc r8 = r2.A00
            java.lang.String r11 = r3.A3t
            com.instagram.common.session.UserSession r0 = r2.A01
            java.lang.String r12 = r0.A06
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            if (r1 == 0) goto L_0x0180
            r10 = r9
        L_0x00dc:
            r13 = 0
            X.C63376Kvx.A00(r8, r9, r10, r11, r12, r13)
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.CLIPS
            com.instagram.pendingmedia.model.constants.ShareType r1 = r3.A0E()
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            if (r1 == r0) goto L_0x00f2
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_STORY_SHARE
            if (r1 == r0) goto L_0x00f2
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE
            if (r1 != r0) goto L_0x0114
        L_0x00f2:
            com.instagram.pendingmedia.model.constants.ShareType r1 = r3.A0E()
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE
            if (r1 != r0) goto L_0x017b
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE
            java.util.EnumSet r0 = java.util.EnumSet.of(r0)
            X.0qQ.A07(r0)
            X.Lc5 r1 = new X.Lc5
            r1.<init>(r0)
            java.lang.Class<X.1us> r0 = X.1us.class
            java.util.ArrayList r0 = r3.A0K(r1, r0)
            boolean r0 = X.DbT.A1b(r0)
            if (r0 == 0) goto L_0x017b
        L_0x0114:
            java.lang.String r1 = r3.A3t
            java.lang.Integer r15 = X.AnonymousClass05K.A01
            boolean r0 = r3.A0y()
            r16 = r15
            if (r0 == 0) goto L_0x0122
            r16 = r9
        L_0x0122:
            r14 = r8
            r18 = r12
            r19 = r13
            r17 = r1
            X.C63376Kvx.A00(r14, r15, r16, r17, r18, r19)
            java.util.concurrent.ConcurrentHashMap r1 = X.C63534Kyj.A00
            java.lang.String r0 = r3.A3t
            java.lang.Object r0 = r1.putIfAbsent(r0, r7)
            if (r0 == 0) goto L_0x014b
            java.lang.String r1 = r3.A3t
            java.lang.Integer r5 = X.AnonymousClass05K.A0j
            boolean r0 = r3.A0y()
            if (r0 == 0) goto L_0x0141
            r15 = r9
        L_0x0141:
            java.lang.String r9 = "already_scheduled"
        L_0x0143:
            r4 = r8
            r6 = r15
            r7 = r1
            r8 = r12
            X.C63376Kvx.A00(r4, r5, r6, r7, r8, r9)
            return
        L_0x014b:
            boolean r0 = r3.A12()
            if (r0 == 0) goto L_0x0163
            r1 = 55
            int r0 = X.C63114Kri.A00()
            if (r0 < r1) goto L_0x0174
            X.0nO r1 = r2.A02
            X.KIZ r0 = new X.KIZ
            r0.<init>(r2)
            r1.ATE(r0)
        L_0x0163:
            boolean r0 = r3.A0y()
            if (r0 == 0) goto L_0x00ca
            X.0nO r1 = r2.A02
            X.KIY r0 = new X.KIY
            r0.<init>(r2)
            r1.ATE(r0)
            return
        L_0x0174:
            java.lang.String r1 = r3.A3t
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            java.lang.String r9 = "no resources to calc, memory threshold = 55"
            goto L_0x0143
        L_0x017b:
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x0114
            return
        L_0x0180:
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            goto L_0x00dc
        L_0x0184:
            java.util.Iterator r2 = r1.iterator()
        L_0x0188:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r0 = r2.next()
            X.JtF r0 = (X.C60895JtF) r0
            float r1 = r0.A00
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0188
            goto L_0x00b7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64064LLi.A00(X.LP8):void");
    }
}
