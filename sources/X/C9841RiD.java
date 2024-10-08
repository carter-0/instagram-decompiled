package X;

/* renamed from: X.RiD  reason: case insensitive filesystem */
public abstract class C9841RiD {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: X.TdG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v7, resolved type: X.TdG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v8, resolved type: X.TdG} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (X.C343127pi.A00(r7) == false) goto L_0x001a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(android.content.Context r27, X.N4L r28, com.instagram.common.session.UserSession r29, X.AnonymousClass3Q2 r30, java.lang.Integer r31) {
        /*
            r4 = 0
            r7 = r27
            r6 = r29
            r5 = r30
            boolean r3 = X.C51973G9u.A1b(r7, r6, r5)
            boolean r2 = r5.A5x
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r8 = r31
            if (r8 != r0) goto L_0x001a
            boolean r1 = X.C343127pi.A00(r7)
            r0 = 1
            if (r1 != 0) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            X.SSv r22 = X.SSv.A02(r7, r6, r5, r2, r0)
            java.lang.String r2 = "VideoRenderUtil"
            java.lang.String r15 = X.AnonymousClass457.A08(r7, r6, r5, r8)     // Catch:{ Exception -> 0x01eb }
            X.0qQ.A07(r15)     // Catch:{ Exception -> 0x01eb }
            X.Src r8 = new X.Src     // Catch:{ Exception -> 0x01eb }
            r17 = r28
            r0 = r17
            r8.<init>(r0, r6, r5, r15)     // Catch:{ Exception -> 0x01eb }
            boolean r9 = r5.A60     // Catch:{ Exception -> 0x01eb }
            boolean r1 = r5.A61     // Catch:{ Exception -> 0x01eb }
            X.4aT r0 = r5.A1K     // Catch:{ Exception -> 0x01eb }
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            if (r9 == 0) goto L_0x016f
            if (r0 != 0) goto L_0x0043
            if (r1 != 0) goto L_0x0043
            goto L_0x0169
        L_0x0043:
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = r5.A0r     // Catch:{ Exception -> 0x01eb }
            if (r0 == 0) goto L_0x011c
            if (r1 != 0) goto L_0x0092
            com.instagram.pendingmedia.model.ClipInfo r0 = X.SUW.A0B(r7, r6, r5)     // Catch:{ 4ZS -> 0x0053 }
            X.0qQ.A0B(r0, r4)     // Catch:{ 4ZS -> 0x0053 }
            r5.A1N = r0     // Catch:{ 4ZS -> 0x0053 }
            goto L_0x005c
        L_0x0053:
            r1 = move-exception
            X.SJL r0 = new X.SJL     // Catch:{ Exception -> 0x01eb }
            r0.<init>()     // Catch:{ Exception -> 0x01eb }
            r8.DDE(r0, r1)     // Catch:{ Exception -> 0x01eb }
        L_0x005c:
            com.instagram.pendingmedia.model.ClipInfo r9 = r5.A1N     // Catch:{ Exception -> 0x01eb }
            java.lang.String r0 = r9.A0F     // Catch:{ Exception -> 0x01eb }
            if (r0 == 0) goto L_0x008c
            X.Rp9 r19 = X.SUW.A09(r7, r6, r5, r0)     // Catch:{ Exception -> 0x01eb }
            java.io.File r1 = r7.getCacheDir()     // Catch:{ Exception -> 0x01eb }
            X.0qQ.A07(r1)     // Catch:{ Exception -> 0x01eb }
            boolean r0 = X.C59911Jba.A01(r5)     // Catch:{ Exception -> 0x01eb }
            X.Qdm r1 = X.SUW.A02(r7, r6, r1, r0, r4)     // Catch:{ Exception -> 0x01eb }
            boolean r0 = r5.A5F     // Catch:{ Exception -> 0x01eb }
            r16 = r7
            r18 = r8
            r20 = r6
            r21 = r9
            r23 = r15
            r24 = r0
            X.RzN r0 = X.SUW.A07(r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x01eb }
            X.Tgt r0 = X.SUW.A00(r7, r1, r0, r6)     // Catch:{ Exception -> 0x01eb }
            goto L_0x00d1
        L_0x008c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x01eb }
            goto L_0x01ea
        L_0x0092:
            boolean r0 = r5.A5D     // Catch:{ Exception -> 0x01eb }
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x0117
            com.instagram.pendingmedia.model.ClipInfo r0 = r5.A1N     // Catch:{ Exception -> 0x01eb }
            java.lang.String r0 = r0.A0F     // Catch:{ Exception -> 0x01eb }
            if (r0 == 0) goto L_0x01e6
            X.Rp9 r13 = X.SUW.A09(r7, r6, r5, r0)     // Catch:{ Exception -> 0x01eb }
        L_0x00a2:
            com.facebook.videolite.transcoder.base.composition.MediaComposition r14 = r13.A00     // Catch:{ Exception -> 0x01eb }
            boolean r0 = r5.A5D     // Catch:{ Exception -> 0x01eb }
            java.io.File r12 = r7.getCacheDir()     // Catch:{ Exception -> 0x01eb }
            if (r0 == 0) goto L_0x00d6
            X.0qQ.A07(r12)     // Catch:{ Exception -> 0x01eb }
            boolean r0 = X.C59911Jba.A01(r5)     // Catch:{ Exception -> 0x01eb }
            X.Qdm r1 = X.SUW.A02(r7, r6, r12, r0, r4)     // Catch:{ Exception -> 0x01eb }
        L_0x00b7:
            com.instagram.pendingmedia.model.ClipInfo r9 = r5.A1N     // Catch:{ Exception -> 0x01eb }
            boolean r0 = r5.A5F     // Catch:{ Exception -> 0x01eb }
            r16 = r7
            r18 = r8
            r19 = r13
            r20 = r6
            r21 = r9
            r23 = r15
            r24 = r0
            X.RzN r0 = X.SUW.A07(r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x01eb }
            X.Tgt r0 = X.SUW.A00(r7, r1, r0, r6)     // Catch:{ Exception -> 0x01eb }
        L_0x00d1:
            r0.FNH()     // Catch:{ Exception -> 0x01eb }
            goto L_0x01f1
        L_0x00d6:
            X.0qQ.A07(r12)     // Catch:{ Exception -> 0x01eb }
            java.util.List r11 = X.SUW.A0D(r7, r5)     // Catch:{ Exception -> 0x01eb }
            java.lang.String r10 = r5.A3t     // Catch:{ Exception -> 0x01eb }
            boolean r0 = X.C59911Jba.A01(r5)     // Catch:{ Exception -> 0x01eb }
            X.AVr r9 = X.AAK.A01(r7, r6, r0, r3, r4)     // Catch:{ Exception -> 0x01eb }
            X.Q1f r1 = new X.Q1f     // Catch:{ Exception -> 0x01eb }
            r1.<init>()     // Catch:{ Exception -> 0x01eb }
            X.SsN r0 = new X.SsN     // Catch:{ Exception -> 0x01eb }
            r0.<init>(r1, r9)     // Catch:{ Exception -> 0x01eb }
            if (r11 == 0) goto L_0x00fe
            boolean r1 = r11.isEmpty()     // Catch:{ Exception -> 0x01eb }
            if (r1 != 0) goto L_0x00fe
            X.TdG r24 = X.SUW.A03(r7, r14, r6, r10, r11)     // Catch:{ Exception -> 0x01eb }
            goto L_0x0103
        L_0x00fe:
            X.SrE r24 = new X.SrE     // Catch:{ Exception -> 0x01eb }
            r24.<init>()     // Catch:{ Exception -> 0x01eb }
        L_0x0103:
            X.Qdm r1 = new X.Qdm     // Catch:{ Exception -> 0x01eb }
            r23 = r1
            r25 = r9
            r26 = r0
            r27 = r6
            r28 = r12
            r29 = r3
            r30 = r4
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)     // Catch:{ Exception -> 0x01eb }
            goto L_0x00b7
        L_0x0117:
            X.Rp9 r13 = X.SUW.A08(r7, r6, r5)     // Catch:{ Exception -> 0x01eb }
            goto L_0x00a2
        L_0x011c:
            com.instagram.pendingmedia.model.ClipInfo r0 = X.SUW.A0B(r7, r6, r5)     // Catch:{ 4ZS -> 0x0126 }
            X.0qQ.A0B(r0, r4)     // Catch:{ 4ZS -> 0x0126 }
            r5.A1N = r0     // Catch:{ 4ZS -> 0x0126 }
            goto L_0x012f
        L_0x0126:
            r1 = move-exception
            X.SJL r0 = new X.SJL     // Catch:{ Exception -> 0x01eb }
            r0.<init>()     // Catch:{ Exception -> 0x01eb }
            r8.DDE(r0, r1)     // Catch:{ Exception -> 0x01eb }
        L_0x012f:
            com.instagram.pendingmedia.model.ClipInfo r9 = r5.A1N     // Catch:{ Exception -> 0x01eb }
            java.lang.String r0 = r9.A0F     // Catch:{ Exception -> 0x01eb }
            if (r0 == 0) goto L_0x0163
            X.Rp9 r19 = X.SUW.A09(r7, r6, r5, r0)     // Catch:{ Exception -> 0x01eb }
            java.io.File r1 = r7.getCacheDir()     // Catch:{ Exception -> 0x01eb }
            X.0qQ.A07(r1)     // Catch:{ Exception -> 0x01eb }
            boolean r0 = X.C59911Jba.A01(r5)     // Catch:{ Exception -> 0x01eb }
            X.Qdm r1 = X.SUW.A02(r7, r6, r1, r0, r4)     // Catch:{ Exception -> 0x01eb }
            boolean r0 = r5.A5F     // Catch:{ Exception -> 0x01eb }
            r16 = r7
            r18 = r8
            r20 = r6
            r21 = r9
            r23 = r15
            r24 = r0
            X.RzN r0 = X.SUW.A07(r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x01eb }
            X.Tgt r0 = X.SUW.A00(r7, r1, r0, r6)     // Catch:{ Exception -> 0x01eb }
            r0.FNH()     // Catch:{ Exception -> 0x01eb }
            goto L_0x01f1
        L_0x0163:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x01eb }
            goto L_0x01ea
        L_0x0169:
            java.lang.String r1 = "Attempting to use OC transcode without an OC filter model."
            r0 = 0
            X.0kD.A0C(r2, r1, r0)     // Catch:{ Exception -> 0x01eb }
        L_0x016f:
            X.RtC r16 = X.Ky1.A00(r7, r6, r5)     // Catch:{ Exception -> 0x01eb }
            X.TtC r9 = X.C14279TtC.A01     // Catch:{ Exception -> 0x01eb }
            r0 = 6
            X.0qQ.A0B(r9, r0)     // Catch:{ Exception -> 0x01eb }
            com.instagram.pendingmedia.model.ClipInfo r0 = X.SUW.A0B(r7, r6, r5)     // Catch:{ 4ZS -> 0x0183 }
            X.0qQ.A0B(r0, r4)     // Catch:{ 4ZS -> 0x0183 }
            r5.A1N = r0     // Catch:{ 4ZS -> 0x0183 }
            goto L_0x018c
        L_0x0183:
            r1 = move-exception
            X.SJL r0 = new X.SJL     // Catch:{ Exception -> 0x01eb }
            r0.<init>()     // Catch:{ Exception -> 0x01eb }
            r8.DDE(r0, r1)     // Catch:{ Exception -> 0x01eb }
        L_0x018c:
            com.instagram.pendingmedia.model.ClipInfo r1 = r5.A1N     // Catch:{ Exception -> 0x01eb }
            java.lang.String r10 = r1.A0F     // Catch:{ Exception -> 0x01eb }
            java.lang.String r11 = "Required value was null."
            if (r10 == 0) goto L_0x01e1
            X.3QS r0 = r5.A1V     // Catch:{ Exception -> 0x01eb }
            X.Rp9 r26 = X.SUW.A0A(r7, r1, r0, r10)     // Catch:{ Exception -> 0x01eb }
            boolean r19 = X.AnonymousClass7TF.A1V(r26)
            boolean r0 = r5.A5F     // Catch:{ Exception -> 0x01eb }
            r23 = r7
            r24 = r17
            r25 = r8
            r27 = r6
            r28 = r1
            r30 = r15
            r31 = r0
            r29 = r22
            X.RzN r10 = X.SUW.A07(r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x01eb }
            X.SOn r0 = r10.A06     // Catch:{ Exception -> 0x01eb }
            if (r0 == 0) goto L_0x01dc
            int r8 = r0.A0C     // Catch:{ Exception -> 0x01eb }
            int r0 = r0.A0A     // Catch:{ Exception -> 0x01eb }
            android.graphics.Point r1 = new android.graphics.Point     // Catch:{ Exception -> 0x01eb }
            r1.<init>(r8, r0)     // Catch:{ Exception -> 0x01eb }
            java.util.List r18 = X.SUW.A0D(r7, r5)     // Catch:{ Exception -> 0x01eb }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = r5.A0r     // Catch:{ Exception -> 0x01eb }
            r20 = r4
            r13 = r0
            r14 = r6
            r15 = r5
            r17 = r9
            r11 = r7
            r12 = r1
            X.Qdm r0 = X.SUW.A01(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x01eb }
            X.Tgt r0 = X.SUW.A00(r7, r0, r10, r6)     // Catch:{ Exception -> 0x01eb }
            r0.FNH()     // Catch:{ Exception -> 0x01eb }
            goto L_0x01f1
        L_0x01dc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r11)     // Catch:{ Exception -> 0x01eb }
            goto L_0x01ea
        L_0x01e1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r11)     // Catch:{ Exception -> 0x01eb }
            goto L_0x01ea
        L_0x01e6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)     // Catch:{ Exception -> 0x01eb }
        L_0x01ea:
            throw r0     // Catch:{ Exception -> 0x01eb }
        L_0x01eb:
            r1 = move-exception
            java.lang.String r0 = "Video has failed with exception"
            X.0kD.A0C(r2, r0, r1)
        L_0x01f1:
            java.lang.String r10 = r5.A3V
            r11 = 0
            if (r10 != 0) goto L_0x01fc
            java.lang.String r0 = "No video output found."
        L_0x01f8:
            X.0kD.A0C(r2, r0, r11)
            return r4
        L_0x01fc:
            java.io.File r1 = X.AnonymousClass7TE.A0t(r10)
            long r8 = r1.length()
            r5 = 1
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x022b
            java.lang.String r1 = r1.getAbsolutePath()
            X.0qQ.A07(r1)
            java.lang.String r0 = "mp4"
            X.0qQ.A0B(r0, r3)
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x0224
            java.lang.String r0 = "video/mp4"
        L_0x0220:
            X.C63395KwG.A00(r7, r10, r0)
            return r3
        L_0x0224:
            r0 = 180(0xb4, float:2.52E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            goto L_0x0220
        L_0x022b:
            java.lang.String r0 = "Video output has invalid size. path: "
            java.lang.String r0 = X.002.A0R(r0, r10)
            goto L_0x01f8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9841RiD.A00(android.content.Context, X.N4L, com.instagram.common.session.UserSession, X.3Q2, java.lang.Integer):boolean");
    }
}
