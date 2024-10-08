package X;

import android.graphics.SurfaceTexture;

public final class L4L {
    public final SurfaceTexture A00;
    public final /* synthetic */ LWf A01;

    /* JADX WARNING: type inference failed for: r14v1, types: [X.Q1d, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00cd, code lost:
        if (X.182.A06(X.0Tu.A05, r2, 36321636479215215L) == false) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public L4L(android.graphics.SurfaceTexture r27, X.LWf r28) {
        /*
            r26 = this;
            r3 = r26
            r1 = r28
            r3.A01 = r1
            r3.<init>()
            r0 = r27
            r3.A00 = r0
            X.LQr r9 = X.C64152LQr.A00
            com.instagram.common.session.UserSession r2 = r1.A06
            boolean r12 = X.1KU.A08(r2)
            boolean r13 = X.AnonymousClass8IK.A03(r2)
            r0 = 0
            r7 = 1
            r8 = 0
            r10 = r2
            r11 = r7
            r14 = r8
            X.SJN r6 = r9.A01(r10, r11, r12, r13, r14)
            android.content.Context r11 = r1.A05
            android.graphics.SurfaceTexture r3 = r3.A00
            X.KAx r5 = new X.KAx
            r5.<init>(r3)
            boolean r4 = r1.A09
            if (r4 == 0) goto L_0x00ec
            X.3Q2 r3 = r1.A07
            boolean r3 = X.C59911Jba.A01(r3)
            X.AVr r18 = X.AAK.A01(r11, r2, r3, r8, r8)
        L_0x003a:
            X.Q1Q r12 = new X.Q1Q
            r12.<init>(r2)
            boolean r3 = r6.A0q
            if (r3 == 0) goto L_0x00e8
            X.Rs1 r16 = X.AnonymousClass7TG.A0Z()
        L_0x0047:
            X.3Q2 r3 = r1.A07
            java.lang.String r8 = r3.A3t
            int r10 = X.AnonymousClass8XF.A01(r11)
            r9 = 1080(0x438, float:1.513E-42)
            int r9 = java.lang.Math.min(r9, r10)
            X.Sr5 r13 = new X.Sr5
            r13.<init>(r7, r9)
            java.lang.String r9 = "people_tagging"
            java.util.LinkedHashMap r24 = X.C63220KtR.A00(r9, r0)
            X.Lby r15 = X.C64443Lby.A00
            X.Q1d r14 = new X.Q1d
            r14.<init>()
            r25 = 59008(0xe680, float:8.2688E-41)
            X.STU r10 = new X.STU
            r21 = r8
            r22 = r0
            r23 = r0
            r17 = r0
            r19 = r6
            r20 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1.A00 = r10
            com.facebook.videolite.transcoder.base.composition.MediaComposition r5 = X.C64191LSy.A03(r11, r2, r3, r4)
            r8 = 817892914(0x30c00e32, float:1.3973873E-9)
            if (r5 != 0) goto L_0x0095
            X.0wj r2 = X.0wj.A01
            java.lang.String r0 = "CLIPS_PUBLISH_SCREEN_PREVIEW_VVP_PLAYER_MANAGER: generated draft preview mediaComposition is null"
            X.DbT.A1Q(r2, r0, r8)
        L_0x008d:
            X.0sa r0 = r1.A08
            if (r0 == 0) goto L_0x0094
            r0.invoke()
        L_0x0094:
            return
        L_0x0095:
            X.0Tu r0 = X.0Tu.A05     // Catch:{ TQC -> 0x00a4 }
            r3 = 36330389622571622(0x81124c00014266, double:3.038822915826637E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r0, r2, r3)     // Catch:{ TQC -> 0x00a4 }
            r5.A0A(r0)     // Catch:{ TQC -> 0x00a4 }
            goto L_0x00cf
        L_0x00a4:
            r6 = move-exception
            X.0wj r4 = X.0wj.A01
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "CLIPS_PUBLISH_SCREEN_PREVIEW_VVP_PLAYER_MANAGER: draft preview VVP failed, error: "
            r3.append(r0)
            java.lang.StackTraceElement[] r0 = r6.getStackTrace()
            java.lang.String r0 = X.AnonymousClass7TF.A0i(r0, r3)
            X.DbT.A1Q(r4, r0, r8)
            X.0sa r0 = r1.A08
            if (r0 == 0) goto L_0x00c2
            r0.invoke()
        L_0x00c2:
            X.0Tu r0 = X.0Tu.A05
            r3 = 36321636479215215(0x810a560001266f, double:3.033287392721966E-306)
            boolean r0 = X.182.A06(r0, r2, r3)
            if (r0 == 0) goto L_0x008d
        L_0x00cf:
            int r2 = r1.A04
            int r0 = r1.A03
            r14 = -1
            r11 = r5
            r12 = r2
            r13 = r0
            r15 = r14
            r16 = r14
            r17 = r7
            r10.A0A(r11, r12, r13, r14, r15, r16, r17)
            float r0 = r1.A02
            r10.A08(r0)
            r10.A06()
            return
        L_0x00e8:
            r16 = r0
            goto L_0x0047
        L_0x00ec:
            X.AVr r18 = X.C392569v1.A00(r11, r0, r0, r8)
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L4L.<init>(android.graphics.SurfaceTexture, X.LWf):void");
    }
}
