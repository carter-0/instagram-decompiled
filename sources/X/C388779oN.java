package X;

/* renamed from: X.9oN  reason: invalid class name and case insensitive filesystem */
public final class C388779oN extends AnonymousClass9T0 {
    public int A00;
    public final C39780A8z A01;
    public final AnonymousClass9R7 A02;
    public final Runnable A03;
    public final Runnable A04;
    public final /* synthetic */ C388789oO A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C388779oN(C388789oO r7, AnonymousClass9RG r8, AnonymousClass9R7 r9) {
        super(r7, r8);
        this.A05 = r7;
        this.A02 = r9;
        this.A01 = new C39780A8z(r7.A0B, r7.A0E, r7, r9, r7.A0G);
        this.A04 = new C40862AkW(r7);
        this.A03 = new C41065Ann(this, r7);
    }

    public final void A08() {
        C388789oO r2 = this.A05;
        r2.A01 = r2.A07();
        STU stu = r2.A05;
        r2.A05 = null;
        if (stu != null) {
            stu.A06 = null;
            stu.A07 = null;
            stu.A07();
        }
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [X.A4n, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v1, types: [X.Q1d, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0243  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(java.lang.String r26, java.lang.String r27) {
        /*
            r25 = this;
            r4 = r25
            X.9R7 r2 = r4.A02
            X.9R6 r0 = r2.A09
            X.7rU r0 = r0.A07
            r3 = 0
            if (r0 != 0) goto L_0x0207
            android.graphics.SurfaceTexture r5 = r2.A00()
            if (r5 != 0) goto L_0x022c
            X.9oO r0 = r4.A05
            r0.A03 = r3
            r0.A04 = r3
        L_0x0017:
            java.lang.String r5 = "VVPMediaDecoderManager"
            if (r3 != 0) goto L_0x0049
            X.9oO r3 = r4.A05
            X.0wj r1 = X.0wj.A01
            r0 = 817901174(0x30c02e76, float:1.3983044E-9)
            X.0f9 r2 = r1.AEf(r5, r0)
            java.lang.String r0 = "message"
            java.lang.String r1 = "setupVideoPlayer called with null inputSurfaceTexture"
            r2.ABQ(r0, r1)
            r2.report()
            r4.A08()
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A0H
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0048
            X.B2y r2 = r3.A05
            if (r2 == 0) goto L_0x0048
            java.lang.RuntimeException r1 = X.AnonymousClass7TE.A15(r1)
            java.lang.String r0 = ""
            r2.DFv(r0, r0, r1)
        L_0x0048:
            return
        L_0x0049:
            X.A8z r6 = r4.A01
            boolean r0 = r6.A00()
            if (r0 == 0) goto L_0x019d
            X.A3R r8 = new X.A3R
            r8.<init>()
            X.9w2 r1 = X.AGo.A08
            X.ADF r7 = r6.A03
            X.AR3 r0 = X.ADF.A00(r7)
            X.7rv r0 = r0.A01
            android.os.Handler r0 = r0.getHandler()
            java.util.Map r9 = r8.A00
            r9.put(r1, r0)
            X.9w2 r11 = X.AGo.A0B
            com.instagram.common.session.UserSession r10 = r6.A02
            X.0Tu r5 = X.0Tu.A05
            r0 = 36319587779747334(0x81087900001e06, double:3.031991786929027E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r5, r10, r0)
            r9.put(r11, r0)
            X.9w2 r1 = X.AGo.A07
            X.B2V r0 = r7.A03
            r9.put(r1, r0)
            X.9w2 r1 = X.AGo.A05
            r0 = 100
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.put(r1, r0)
            android.content.Context r6 = r6.A01
            X.9w2 r5 = X.AGo.A06
            X.Q0h r1 = X.C9955RkA.A00
            X.SrT r0 = new X.SrT
            r0.<init>(r6, r1)
            r9.put(r5, r0)
            X.AGo r0 = new X.AGo
            r0.<init>((X.A3R) r8)
            X.AVr r1 = new X.AVr
            r1.<init>(r0)
            X.AR3 r0 = X.ADF.A00(r7)
            X.7rv r0 = r0.A01
            X.7s4 r0 = r0.B9O()
            X.7ry r0 = r0.A05
            X.7rz r6 = X.C344507ry.A02
            java.lang.Object r5 = X.C344527s0.A05
            java.util.Map r0 = r0.A00
            java.lang.Object r0 = r0.get(r6)
            if (r0 == 0) goto L_0x00be
            r5 = r0
        L_0x00be:
            r1.A01 = r5
            X.AR3 r0 = X.ADF.A00(r7)
            X.7rv r0 = r0.A01
            X.7s4 r0 = r0.B9O()
            X.7s3 r0 = r0.A04
            if (r0 == 0) goto L_0x019a
            android.opengl.EGLContext r0 = r0.Azj()
        L_0x00d2:
            r0.getClass()
            r1.A00 = r0
        L_0x00d7:
            X.AVc r14 = X.C40188AVc.A00
            X.LQr r8 = X.C64152LQr.A00
            X.9oO r0 = r4.A05
            com.instagram.common.session.UserSession r4 = r0.A0E
            boolean r11 = X.1KU.A08(r4)
            boolean r12 = X.AnonymousClass8IK.A03(r4)
            r7 = 0
            r6 = 1
            r13 = 0
            r9 = r4
            r10 = r6
            X.SJN r5 = r8.A01(r9, r10, r11, r12, r13)
            android.content.Context r10 = r0.A0B
            X.Q1Q r11 = new X.Q1Q
            r11.<init>(r4)
            boolean r4 = r5.A0q
            if (r4 == 0) goto L_0x0197
            X.Rs1 r15 = X.AnonymousClass7TG.A0Z()
        L_0x00ff:
            X.3Q2 r4 = r0.A09
            if (r4 == 0) goto L_0x0107
            java.lang.String r4 = r4.A2g
            if (r4 != 0) goto L_0x010b
        L_0x0107:
            java.lang.String r4 = X.AnonymousClass7TG.A0j()
        L_0x010b:
            r9 = 1080(0x438, float:1.513E-42)
            int r8 = X.AnonymousClass8XF.A01(r10)
            int r8 = java.lang.Math.min(r9, r8)
            X.Sr5 r12 = new X.Sr5
            r12.<init>(r6, r8)
            java.lang.String r6 = r0.A0G
            r8 = r26
            java.util.LinkedHashMap r23 = X.C63220KtR.A00(r6, r8)
            X.8MA r6 = r0.A0D
            X.3Q2 r8 = r0.A09
            if (r8 == 0) goto L_0x012a
            java.lang.String r7 = r8.A2g
        L_0x012a:
            X.Q1d r13 = new X.Q1d
            r13.<init>()
            r24 = 1664(0x680, float:2.332E-42)
            X.STU r9 = new X.STU
            r21 = r27
            r22 = r7
            r20 = r4
            r19 = r3
            r18 = r5
            r17 = r1
            r16 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.3Q2 r1 = r0.A09
            if (r1 == 0) goto L_0x0194
            boolean r1 = r1.A5F
            if (r1 == 0) goto L_0x0194
            r1 = 0
        L_0x014d:
            r9.A08(r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.A0H
            boolean r1 = r1.get()
            if (r1 != 0) goto L_0x015f
            X.B2y r1 = r0.A05
            if (r1 == 0) goto L_0x015f
            r1.Dwn()
        L_0x015f:
            r0.A05 = r9
            r9.A06 = r0
            r9.A07 = r0
            android.graphics.SurfaceTexture r1 = r2.A00()
            if (r1 == 0) goto L_0x016e
            r1.setOnFrameAvailableListener(r0)
        L_0x016e:
            X.3Q2 r1 = r0.A09
            if (r1 == 0) goto L_0x0048
            com.facebook.videolite.transcoder.base.composition.MediaComposition r10 = r1.A0r
            if (r10 == 0) goto L_0x0048
            com.instagram.pendingmedia.model.ClipInfo r2 = r1.A1N
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L_0x024a
            int r11 = r2.A09
            int r12 = r2.A06
            X.A41 r1 = r0.A0F
            X.9Pn r2 = r1.A00
            com.facebook.common.math.matrix.Matrix4 r1 = X.C378369Pn.A0R
            int r13 = r2.A03
            int r14 = r2.A02
            int r15 = r0.A00
            boolean r0 = r0.A0B
            r16 = r0
            r9.A0A(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0194:
            float r1 = r0.A00
            goto L_0x014d
        L_0x0197:
            r15 = r7
            goto L_0x00ff
        L_0x019a:
            r0 = 0
            goto L_0x00d2
        L_0x019d:
            X.9oO r1 = r4.A05
            r0 = 1
            X.ATW r12 = new X.ATW
            r12.<init>(r0, r4, r1)
            android.content.Context r7 = r1.A0B
            X.A3R r6 = new X.A3R
            r6.<init>()
            X.9w2 r5 = X.AGo.A09
            com.instagram.common.session.UserSession r10 = r1.A0E
            X.0Tu r9 = X.0Tu.A05
            r0 = 36315683655781851(0x8104ec00140ddb, double:3.0295228032126104E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r9, r10, r0)
            java.util.Map r8 = r6.A00
            r8.put(r5, r0)
            X.9w2 r11 = X.AGo.A07
            X.A4n r5 = new X.A4n
            r5.<init>()
            r5.A00 = r12
            X.7r4 r0 = new X.7r4
            r0.<init>((com.instagram.common.session.UserSession) r10)
            r5.A01 = r0
            X.AD3 r1 = new X.AD3
            r1.<init>(r5)
            X.AVi r0 = new X.AVi
            r0.<init>(r7, r1)
            r8.put(r11, r0)
            X.9w2 r5 = X.AGo.A0B
            r0 = 36319587779747334(0x81087900001e06, double:3.031991786929027E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r9, r10, r0)
            r8.put(r5, r0)
            X.9w2 r5 = X.AGo.A06
            X.Q0h r1 = X.C9955RkA.A00
            X.SrT r0 = new X.SrT
            r0.<init>(r7, r1)
            r8.put(r5, r0)
            X.AGo r0 = new X.AGo
            r0.<init>((X.A3R) r6)
            X.AVr r1 = new X.AVr
            r1.<init>(r0)
            java.lang.Object r0 = X.C343747qj.A06
            r1.A01 = r0
            goto L_0x00d7
        L_0x0207:
            android.graphics.SurfaceTexture r1 = r2.A00()
            android.graphics.SurfaceTexture r0 = r2.A00
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x0229
            r2.A00 = r1
            android.view.Surface r0 = r2.A01
            if (r0 == 0) goto L_0x021e
            r0.release()
            r2.A01 = r3
        L_0x021e:
            android.graphics.SurfaceTexture r1 = r2.A00
            if (r1 == 0) goto L_0x0229
            android.view.Surface r0 = new android.view.Surface
            r0.<init>(r1)
            r2.A01 = r0
        L_0x0229:
            android.view.Surface r0 = r2.A01
            goto L_0x0241
        L_0x022c:
            X.9oO r1 = r4.A05
            android.graphics.SurfaceTexture r0 = r1.A03
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 != 0) goto L_0x023f
            r1.A03 = r5
            android.view.Surface r0 = new android.view.Surface
            r0.<init>(r5)
            r1.A04 = r0
        L_0x023f:
            android.view.Surface r0 = r1.A04
        L_0x0241:
            if (r0 == 0) goto L_0x0017
            X.9jA r3 = new X.9jA
            r3.<init>(r0)
            goto L_0x0017
        L_0x024a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C388779oN.A09(java.lang.String, java.lang.String):void");
    }
}
