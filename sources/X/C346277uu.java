package X;

/* renamed from: X.7uu  reason: invalid class name and case insensitive filesystem */
public final class C346277uu implements C344747sM, C346287uv {
    public int A00;
    public C345897uG A01;
    public C344567s4 A02;
    public C345057sr A03;
    public C361188fo A04;
    public Integer A05;
    public Integer A06;
    public boolean A07;
    public boolean A08;
    public final C344407ro A09;
    public final C345137sz A0A;
    public final C345107sw A0B;
    public final C346297uw A0C;

    public C346277uu(C344407ro r7, C345107sw r8) {
        this(r7, (C345137sz) null, r8, true, false);
    }

    public final void detach() {
        this.A01 = null;
        C345107sw r1 = this.A0B;
        if (r1 instanceof C344747sM) {
            ((C344747sM) r1).detach();
        }
        C361188fo r0 = this.A04;
        if (r0 != null) {
            r0.detach();
            this.A04.A01 = null;
            this.A04 = null;
        }
    }

    public final void release() {
        this.A02 = null;
        C345107sw r1 = this.A0B;
        if (r1 instanceof C344747sM) {
            ((C344747sM) r1).release();
        }
    }

    public final void ACn(C345897uG r3) {
        this.A01 = r3;
        C345107sw r1 = this.A0B;
        if (r1 instanceof C344747sM) {
            ((C344747sM) r1).ACn(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0226, code lost:
        if (r1.A00() != false) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0230, code lost:
        if (r8.A00() != false) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0319, code lost:
        if (r8 == null) goto L_0x031b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0322, code lost:
        if (r7 != false) goto L_0x0324;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x032b, code lost:
        if (r6 != false) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        if (r0.A01 == 3553) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b1, code lost:
        if (r2.A00 != r5.intValue()) goto L_0x00b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object BHO() {
        /*
            r24 = this;
            java.lang.String r0 = "getInputData"
            X.C349257zq.A03(r0)     // Catch:{ all -> 0x0357 }
            r7 = r24
            X.7sz r12 = r7.A0A     // Catch:{ all -> 0x0357 }
            if (r12 != 0) goto L_0x0013
            X.7sw r0 = r7.A0B     // Catch:{ all -> 0x0357 }
            if (r0 == 0) goto L_0x0177
            X.7sz r12 = r0.B82()     // Catch:{ all -> 0x0357 }
        L_0x0013:
            r12.getClass()     // Catch:{ all -> 0x0357 }
            X.7s4 r0 = r7.A02     // Catch:{ all -> 0x0357 }
            if (r0 != 0) goto L_0x0023
            X.7ro r1 = r7.A09     // Catch:{ all -> 0x0357 }
            X.8td r0 = X.C368978td.GL_COPY_RENDERER_NOT_INITIALIZED     // Catch:{ all -> 0x0357 }
        L_0x001e:
            r1.A00(r0)     // Catch:{ all -> 0x0357 }
            goto L_0x0353
        L_0x0023:
            X.7uG r0 = r7.A01     // Catch:{ all -> 0x0357 }
            if (r0 != 0) goto L_0x002c
            X.7ro r1 = r7.A09     // Catch:{ all -> 0x0357 }
            X.8td r0 = X.C368978td.GL_COPY_RENDERER_SKIP_NULL_GL_CONTEXT     // Catch:{ all -> 0x0357 }
            goto L_0x001e
        L_0x002c:
            X.7uN r0 = r0.Blv()     // Catch:{ all -> 0x0357 }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x0357 }
            if (r0 != 0) goto L_0x0353
            X.7s4 r4 = r7.A02     // Catch:{ all -> 0x0357 }
            r4.getClass()     // Catch:{ all -> 0x0357 }
            X.7uG r3 = r7.A01     // Catch:{ all -> 0x0357 }
            r3.getClass()     // Catch:{ all -> 0x0357 }
            X.8fo r0 = r7.A04     // Catch:{ all -> 0x0357 }
            if (r0 != 0) goto L_0x0059
            X.7uw r0 = r7.A0C     // Catch:{ all -> 0x0357 }
            X.7ro r2 = r0.A00     // Catch:{ all -> 0x0357 }
            boolean r1 = r0.A01     // Catch:{ all -> 0x0357 }
            X.8fo r0 = new X.8fo     // Catch:{ all -> 0x0357 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0357 }
            r7.A04 = r0     // Catch:{ all -> 0x0357 }
            r0.CMa(r4)     // Catch:{ all -> 0x0357 }
            X.8fo r0 = r7.A04     // Catch:{ all -> 0x0357 }
            r0.ACn(r3)     // Catch:{ all -> 0x0357 }
        L_0x0059:
            X.8fo r14 = r7.A04     // Catch:{ all -> 0x0357 }
            boolean r1 = r7.A07     // Catch:{ all -> 0x0357 }
            int r6 = r7.A00     // Catch:{ all -> 0x0357 }
            boolean r2 = r7.A08     // Catch:{ all -> 0x0357 }
            java.lang.Integer r15 = r7.A06     // Catch:{ all -> 0x0357 }
            java.lang.Integer r5 = r7.A05     // Catch:{ all -> 0x0357 }
            X.7sr r13 = r7.A03     // Catch:{ all -> 0x0357 }
            boolean r0 = r14.A02()     // Catch:{ all -> 0x0357 }
            if (r0 == 0) goto L_0x0353
            X.7uG r0 = r14.A00     // Catch:{ all -> 0x0357 }
            r0.getClass()     // Catch:{ all -> 0x0357 }
            X.7uN r0 = r0.Blv()     // Catch:{ all -> 0x0357 }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x0357 }
            if (r0 != 0) goto L_0x0353
            if (r1 == 0) goto L_0x008b
            X.7v0 r0 = r12.getTexture()     // Catch:{ all -> 0x0357 }
            r0.getClass()     // Catch:{ all -> 0x0357 }
            int r1 = r0.A01     // Catch:{ all -> 0x0357 }
            r0 = 3553(0xde1, float:4.979E-42)
            if (r1 != r0) goto L_0x00b3
        L_0x008b:
            if (r6 != 0) goto L_0x00b3
            int r1 = r12.Ap3()     // Catch:{ all -> 0x0357 }
            if (r1 == 0) goto L_0x0097
            r0 = 3
            if (r1 == r0) goto L_0x0097
            goto L_0x00b3
        L_0x0097:
            if (r2 == 0) goto L_0x0353
            if (r15 == 0) goto L_0x0353
            if (r5 == 0) goto L_0x0353
            X.7ss r2 = r12.CFP()     // Catch:{ all -> 0x0357 }
            if (r2 == 0) goto L_0x0353
            int r1 = r2.A01     // Catch:{ all -> 0x0357 }
            int r0 = r15.intValue()     // Catch:{ all -> 0x0357 }
            if (r1 != r0) goto L_0x00b3
            int r1 = r2.A00     // Catch:{ all -> 0x0357 }
            int r0 = r5.intValue()     // Catch:{ all -> 0x0357 }
            if (r1 == r0) goto L_0x0353
        L_0x00b3:
            boolean r0 = r14.A03     // Catch:{ all -> 0x0357 }
            r4 = 0
            if (r0 == 0) goto L_0x00ea
            if (r15 == 0) goto L_0x00ea
            if (r5 == 0) goto L_0x00ea
            int r0 = r15.intValue()     // Catch:{ all -> 0x0357 }
            if (r0 == 0) goto L_0x00ea
            int r3 = r5.intValue()     // Catch:{ all -> 0x0357 }
            if (r3 == 0) goto L_0x00ea
            X.7ss r2 = r12.CFP()     // Catch:{ all -> 0x0357 }
            if (r2 == 0) goto L_0x00ea
            boolean r0 = r2.A00()     // Catch:{ all -> 0x0357 }
            if (r0 == 0) goto L_0x00ea
            int r0 = r12.Awt()     // Catch:{ all -> 0x0357 }
            int r0 = r0 % 180
            if (r0 == 0) goto L_0x00e1
            int r1 = r2.A00     // Catch:{ all -> 0x0357 }
            int r0 = r2.A01     // Catch:{ all -> 0x0357 }
            goto L_0x00e5
        L_0x00e1:
            int r1 = r2.A01     // Catch:{ all -> 0x0357 }
            int r0 = r2.A00     // Catch:{ all -> 0x0357 }
        L_0x00e5:
            if (r0 >= r3) goto L_0x00ea
            if (r1 >= r3) goto L_0x00ea
            r4 = 1
        L_0x00ea:
            X.7s4 r11 = r14.A01     // Catch:{ all -> 0x0357 }
            r11.getClass()     // Catch:{ all -> 0x0357 }
            X.7uG r10 = r14.A00     // Catch:{ all -> 0x0357 }
            r10.getClass()     // Catch:{ all -> 0x0357 }
            if (r4 != 0) goto L_0x00f8
            goto L_0x017a
        L_0x00f8:
            X.7ss r2 = r12.CFP()     // Catch:{ all -> 0x0357 }
            if (r2 == 0) goto L_0x013b
            boolean r0 = r2.A00()     // Catch:{ all -> 0x0357 }
            if (r0 == 0) goto L_0x013b
            if (r5 == 0) goto L_0x013b
            if (r15 == 0) goto L_0x013b
            int r9 = r5.intValue()     // Catch:{ all -> 0x0357 }
            if (r9 <= 0) goto L_0x013b
            int r1 = r15.intValue()     // Catch:{ all -> 0x0357 }
            if (r1 <= 0) goto L_0x013b
            int r0 = r12.Awt()     // Catch:{ all -> 0x0357 }
            int r0 = r0 % 180
            if (r0 == 0) goto L_0x0121
            int r8 = r2.A00     // Catch:{ all -> 0x0357 }
            int r7 = r2.A01     // Catch:{ all -> 0x0357 }
            goto L_0x0125
        L_0x0121:
            int r8 = r2.A01     // Catch:{ all -> 0x0357 }
            int r7 = r2.A00     // Catch:{ all -> 0x0357 }
        L_0x0125:
            float r4 = (float) r8     // Catch:{ all -> 0x0357 }
            r0 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 * r0
            float r2 = (float) r7     // Catch:{ all -> 0x0357 }
            float r3 = r3 / r2
            float r1 = (float) r1     // Catch:{ all -> 0x0357 }
            float r1 = r1 * r0
            float r0 = (float) r9     // Catch:{ all -> 0x0357 }
            float r1 = r1 / r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0135
            goto L_0x0144
        L_0x0135:
            float r2 = r2 * r1
            int r8 = java.lang.Math.round(r2)     // Catch:{ all -> 0x0357 }
            goto L_0x0149
        L_0x013b:
            r16 = r5
            r17 = r6
            X.7sz r12 = X.C361188fo.A00(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0357 }
            goto L_0x0161
        L_0x0144:
            float r4 = r4 / r1
            int r7 = java.lang.Math.round(r4)     // Catch:{ all -> 0x0357 }
        L_0x0149:
            java.lang.Integer r21 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0357 }
            java.lang.Integer r22 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0357 }
            r16 = r10
            r17 = r11
            r18 = r12
            r19 = r13
            r20 = r14
            r23 = r6
            X.7sz r12 = X.C361188fo.A00(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0357 }
        L_0x0161:
            X.7s4 r2 = r14.A01     // Catch:{ all -> 0x0357 }
            r2.getClass()     // Catch:{ all -> 0x0357 }
            X.7uG r6 = r14.A00     // Catch:{ all -> 0x0357 }
            r6.getClass()     // Catch:{ all -> 0x0357 }
            X.7ss r0 = r12.CFP()     // Catch:{ all -> 0x0357 }
            if (r0 != 0) goto L_0x0184
            X.7ro r1 = r14.A02     // Catch:{ all -> 0x0357 }
            X.8td r0 = X.C368978td.VIDEO_INPUT_PRODUCER_SKIP_VIEWPORT_NULL     // Catch:{ all -> 0x0357 }
            goto L_0x001e
        L_0x0177:
            r12 = 0
            goto L_0x0013
        L_0x017a:
            r16 = r5
            r17 = r6
            X.7sz r12 = X.C361188fo.A00(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0357 }
            goto L_0x0353
        L_0x0184:
            if (r15 == 0) goto L_0x0353
            if (r5 == 0) goto L_0x0353
            X.7su r4 = r14.A01     // Catch:{ all -> 0x0357 }
            if (r4 != 0) goto L_0x01b7
            X.7ro r3 = r14.A02     // Catch:{ all -> 0x0357 }
            X.7sq r1 = new X.7sq     // Catch:{ all -> 0x0357 }
            r1.<init>()     // Catch:{ all -> 0x0357 }
            if (r13 != 0) goto L_0x019a
            X.7st r13 = new X.7st     // Catch:{ all -> 0x0357 }
            r13.<init>()     // Catch:{ all -> 0x0357 }
        L_0x019a:
            r0 = 0
            X.7su r4 = new X.7su     // Catch:{ all -> 0x0357 }
            r4.<init>(r3, r1, r13, r0)     // Catch:{ all -> 0x0357 }
            r14.A01 = r4     // Catch:{ all -> 0x0357 }
            int r3 = r15.intValue()     // Catch:{ all -> 0x0357 }
            int r1 = r5.intValue()     // Catch:{ all -> 0x0357 }
            int r0 = r12.Awt()     // Catch:{ all -> 0x0357 }
            r4.A03(r3, r1, r0)     // Catch:{ all -> 0x0357 }
            X.7su r0 = r14.A01     // Catch:{ all -> 0x0357 }
            r0.ACn(r6)     // Catch:{ all -> 0x0357 }
            goto L_0x01c6
        L_0x01b7:
            int r3 = r15.intValue()     // Catch:{ all -> 0x0357 }
            int r1 = r5.intValue()     // Catch:{ all -> 0x0357 }
            int r0 = r12.Awt()     // Catch:{ all -> 0x0357 }
            r4.A03(r3, r1, r0)     // Catch:{ all -> 0x0357 }
        L_0x01c6:
            X.7su r1 = r14.A01     // Catch:{ all -> 0x0357 }
            r0 = 1
            r1.A03 = r0     // Catch:{ all -> 0x0357 }
            X.ATd r0 = r14.A02     // Catch:{ all -> 0x0357 }
            if (r0 != 0) goto L_0x01e7
            X.7ro r1 = r14.A04     // Catch:{ all -> 0x0357 }
            X.ATd r0 = new X.ATd     // Catch:{ all -> 0x0357 }
            r0.<init>(r1)     // Catch:{ all -> 0x0357 }
            r14.A02 = r0     // Catch:{ all -> 0x0357 }
            X.7s4 r0 = r14.A01     // Catch:{ all -> 0x0357 }
            r0.getClass()     // Catch:{ all -> 0x0357 }
            X.ATd r1 = r14.A02     // Catch:{ all -> 0x0357 }
            X.7uG r0 = r14.A00     // Catch:{ all -> 0x0357 }
            r0.getClass()     // Catch:{ all -> 0x0357 }
            r1.ACn(r0)     // Catch:{ all -> 0x0357 }
        L_0x01e7:
            X.ATd r3 = r14.A02     // Catch:{ all -> 0x0357 }
            X.7uG r5 = r2.A01()     // Catch:{ all -> 0x0357 }
            X.7su r4 = r14.A01     // Catch:{ all -> 0x0357 }
            java.lang.String r0 = "GlSuperResRenderer.renderFrame()"
            X.C349257zq.A03(r0)     // Catch:{ all -> 0x0357 }
            monitor-enter(r4)     // Catch:{ all -> 0x0357 }
            r2 = 0
            X.7uG r0 = r3.A01     // Catch:{ all -> 0x0350 }
            if (r5 == r0) goto L_0x0201
            X.7ro r1 = r3.A03     // Catch:{ all -> 0x0350 }
            X.8td r0 = X.C368978td.GL_COPY_RENDERER_DIFFERENT_CONTEXT     // Catch:{ all -> 0x0350 }
            r1.A00(r0)     // Catch:{ all -> 0x0350 }
        L_0x0201:
            X.7v0 r0 = r12.getTexture()     // Catch:{ all -> 0x0350 }
            if (r0 == 0) goto L_0x0340
            java.lang.String r0 = "GlSuperResRenderer.makeCurrent()"
            X.C349257zq.A03(r0)     // Catch:{ all -> 0x0338 }
            java.lang.Exception r0 = r4.ClT()     // Catch:{ all -> 0x0338 }
            X.C349257zq.A01()     // Catch:{ all -> 0x0338 }
            if (r0 != 0) goto L_0x0334
            X.7sr r0 = r4.A01     // Catch:{ all -> 0x0338 }
            X.7ss r8 = r4.FL1(r12, r0)     // Catch:{ all -> 0x0338 }
            X.7ss r1 = r12.CFP()     // Catch:{ all -> 0x0338 }
            if (r1 == 0) goto L_0x0228
            boolean r0 = r1.A00()     // Catch:{ all -> 0x0338 }
            r7 = 1
            if (r0 == 0) goto L_0x0229
        L_0x0228:
            r7 = 0
        L_0x0229:
            if (r8 == 0) goto L_0x0232
            boolean r0 = r8.A00()     // Catch:{ all -> 0x0338 }
            r6 = 1
            if (r0 == 0) goto L_0x0233
        L_0x0232:
            r6 = 0
        L_0x0233:
            if (r1 == 0) goto L_0x0312
            if (r8 == 0) goto L_0x031b
            if (r7 != 0) goto L_0x0324
            if (r6 != 0) goto L_0x032d
            java.lang.String r0 = "GlSuperResRenderer.draw()"
            X.C349257zq.A03(r0)     // Catch:{ all -> 0x0338 }
            X.7ti r6 = r5.BhQ()     // Catch:{ all -> 0x0338 }
            boolean r7 = r4.A03     // Catch:{ all -> 0x0338 }
            int r9 = r8.A01     // Catch:{ all -> 0x0338 }
            int r8 = r8.A00     // Catch:{ all -> 0x0338 }
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0338 }
            java.lang.String r0 = "GlSuperResRenderer::renderFrame:err - 00 - Already in error state entering renderAfterBind"
            X.C345907uH.A02(r0, r1)     // Catch:{ all -> 0x0338 }
            r0 = 3042(0xbe2, float:4.263E-42)
            android.opengl.GLES20.glDisable(r0)     // Catch:{ all -> 0x0338 }
            r0 = 2929(0xb71, float:4.104E-42)
            android.opengl.GLES20.glDisable(r0)     // Catch:{ all -> 0x0338 }
            r0 = 2884(0xb44, float:4.041E-42)
            android.opengl.GLES20.glDisable(r0)     // Catch:{ all -> 0x0338 }
            android.opengl.GLES20.glViewport(r2, r2, r9, r8)     // Catch:{ all -> 0x0338 }
            r10 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r7 == 0) goto L_0x026b
            r0 = 0
        L_0x026b:
            android.opengl.GLES20.glClearColor(r1, r1, r1, r0)     // Catch:{ all -> 0x0338 }
            r0 = 16640(0x4100, float:2.3318E-41)
            android.opengl.GLES20.glClear(r0)     // Catch:{ all -> 0x0338 }
            X.8fu r0 = r3.A00     // Catch:{ all -> 0x0338 }
            if (r0 != 0) goto L_0x028a
            r1 = 2131886185(0x7f120069, float:1.9406942E38)
            r0 = 2131886187(0x7f12006b, float:1.9406946E38)
            X.8fu r0 = r6.A01(r0, r1)     // Catch:{ all -> 0x0338 }
            r3.A00 = r0     // Catch:{ all -> 0x0338 }
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0338 }
            java.lang.String r0 = "GlSuperResRenderer::renderFrame:err6 - 01 - Failed to compile shaders"
            X.C345907uH.A02(r0, r1)     // Catch:{ all -> 0x0338 }
        L_0x028a:
            X.7v0 r7 = r12.getTexture()     // Catch:{ all -> 0x0338 }
            int r0 = r12.Awt()     // Catch:{ 7sx -> 0x02fc }
            int r0 = r0 % 180
            r13 = 0
            if (r0 == 0) goto L_0x0298
            r13 = 1
        L_0x0298:
            X.7ss r0 = r12.CFP()     // Catch:{ 7sx -> 0x02fc }
            r0.getClass()     // Catch:{ 7sx -> 0x02fc }
            int r11 = r0.A01     // Catch:{ 7sx -> 0x02fc }
            X.7ss r0 = r12.CFP()     // Catch:{ 7sx -> 0x02fc }
            int r12 = r0.A00     // Catch:{ 7sx -> 0x02fc }
            java.lang.String r9 = "sTexture"
            java.lang.String r8 = "uSrcHeight"
            java.lang.String r6 = "uSrcWidth"
            X.8fu r0 = r3.A00     // Catch:{ 7sx -> 0x02fc }
            X.8fv r2 = r0.A01()     // Catch:{ 7sx -> 0x02fc }
            r1 = r11
            if (r13 == 0) goto L_0x02b7
            r1 = r12
        L_0x02b7:
            int r0 = X.C361258fv.A00(r2, r6)     // Catch:{ 7sx -> 0x02fc }
            android.opengl.GLES20.glUniform1i(r0, r1)     // Catch:{ 7sx -> 0x02fc }
            if (r13 != 0) goto L_0x02c1
            r11 = r12
        L_0x02c1:
            int r0 = X.C361258fv.A00(r2, r8)     // Catch:{ 7sx -> 0x02fc }
            android.opengl.GLES20.glUniform1i(r0, r11)     // Catch:{ 7sx -> 0x02fc }
            r7.getClass()     // Catch:{ 7sx -> 0x02fc }
            r2.A03(r9, r7)     // Catch:{ 7sx -> 0x02fc }
            java.lang.String r0 = "uSharpness"
            r2.A02(r0, r10)     // Catch:{ 7sx -> 0x02fc }
            X.7uQ r0 = r3.A02     // Catch:{ 7sx -> 0x02fc }
            r2.A01(r0)     // Catch:{ 7sx -> 0x02fc }
            int r0 = r7.A01     // Catch:{ all -> 0x0338 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0338 }
            int r0 = r7.A00     // Catch:{ all -> 0x0338 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0338 }
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}     // Catch:{ all -> 0x0338 }
            java.lang.String r0 = "GlSuperResRenderer::renderFrame: textureTarget: %s textureHandle: %s"
            X.C345907uH.A02(r0, r1)     // Catch:{ all -> 0x0338 }
            X.C349257zq.A01()     // Catch:{ all -> 0x0338 }
            java.lang.String r0 = "GlSuperResRenderer.swapBuffers()"
            X.C349257zq.A03(r0)     // Catch:{ all -> 0x0338 }
            r4.swapBuffers()     // Catch:{ all -> 0x0338 }
            X.C349257zq.A01()     // Catch:{ all -> 0x0338 }
            goto L_0x0334
        L_0x02fc:
            r3 = move-exception
            int r2 = r3.A00     // Catch:{ all -> 0x0338 }
            java.lang.String r1 = "GlSuperResRenderer"
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x0338 }
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x0338 }
            X.7sx r0 = new X.7sx     // Catch:{ all -> 0x0338 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0338 }
            r0.initCause(r3)     // Catch:{ all -> 0x0338 }
            throw r0     // Catch:{ all -> 0x0338 }
        L_0x0312:
            X.7ro r1 = r3.A03     // Catch:{ all -> 0x0338 }
            X.8td r0 = X.C368978td.GL_SUPER_RES_RENDERER_SKIP_INPUT_VIEWPORT_NULL     // Catch:{ all -> 0x0338 }
            r1.A00(r0)     // Catch:{ all -> 0x0338 }
            if (r8 != 0) goto L_0x0322
        L_0x031b:
            X.7ro r1 = r3.A03     // Catch:{ all -> 0x0338 }
            X.8td r0 = X.C368978td.GL_SUPER_RES_RENDERER_SKIP_INPUT_VIEWPORT_NOT_VALID     // Catch:{ all -> 0x0338 }
            r1.A00(r0)     // Catch:{ all -> 0x0338 }
        L_0x0322:
            if (r7 == 0) goto L_0x032b
        L_0x0324:
            X.7ro r1 = r3.A03     // Catch:{ all -> 0x0338 }
            X.8td r0 = X.C368978td.GL_SUPER_RES_RENDERER_SKIP_OUTPUT_VIEWPORT_NULL     // Catch:{ all -> 0x0338 }
            r1.A00(r0)     // Catch:{ all -> 0x0338 }
        L_0x032b:
            if (r6 == 0) goto L_0x0334
        L_0x032d:
            X.7ro r1 = r3.A03     // Catch:{ all -> 0x0338 }
            X.8td r0 = X.C368978td.GL_SUPER_RES_RENDERER_SKIP_OUTPUT_VIEWPORT_NOT_VALID     // Catch:{ all -> 0x0338 }
            r1.A00(r0)     // Catch:{ all -> 0x0338 }
        L_0x0334:
            r5.makeCurrent()     // Catch:{ all -> 0x0350 }
            goto L_0x0347
        L_0x0338:
            r0 = move-exception
            r5.makeCurrent()     // Catch:{ all -> 0x0350 }
            X.C349257zq.A01()     // Catch:{ all -> 0x0350 }
            throw r0     // Catch:{ all -> 0x0350 }
        L_0x0340:
            X.7ro r1 = r3.A03     // Catch:{ all -> 0x0350 }
            X.8td r0 = X.C368978td.GL_SUPER_RES_RENDERER_SKIP_NULL_TEXTURE     // Catch:{ all -> 0x0350 }
            r1.A00(r0)     // Catch:{ all -> 0x0350 }
        L_0x0347:
            X.C349257zq.A01()     // Catch:{ all -> 0x0350 }
            monitor-exit(r4)     // Catch:{ all -> 0x0350 }
            X.7su r0 = r14.A01     // Catch:{ all -> 0x0357 }
            X.7sy r12 = r0.A0A     // Catch:{ all -> 0x0357 }
            goto L_0x0353
        L_0x0350:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0350 }
            throw r0     // Catch:{ all -> 0x0357 }
        L_0x0353:
            X.C349257zq.A01()
            return r12
        L_0x0357:
            r0 = move-exception
            X.C349257zq.A01()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C346277uu.BHO():java.lang.Object");
    }

    public final void CMa(C344567s4 r3) {
        this.A02 = r3;
        C345107sw r1 = this.A0B;
        if (r1 instanceof C344747sM) {
            ((C344747sM) r1).CMa(r3);
        }
    }

    public final void A00(C345057sr r2, int i, int i2) {
        this.A06 = Integer.valueOf(i);
        this.A05 = Integer.valueOf(i2);
        this.A03 = r2;
        this.A08 = true;
    }

    public C346277uu(C344407ro r7, C345107sw r8, boolean z) {
        this(r7, (C345137sz) null, r8, z, false);
    }

    public C346277uu(C344407ro r2, C345137sz r3, C345107sw r4, boolean z, boolean z2) {
        this.A09 = r2;
        this.A0C = new C346297uw(r2, z2);
        this.A0B = r4;
        this.A0A = r3;
        this.A07 = z;
        this.A00 = 0;
    }
}
