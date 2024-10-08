package X;

import android.graphics.SurfaceTexture;

/* renamed from: X.AvL  reason: case insensitive filesystem */
public final class C41517AvL extends Thread {
    public SurfaceTexture A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final AGs A04;
    public final /* synthetic */ ALv A05;

    public C41517AvL(ALv aLv) {
        this.A05 = aLv;
        this.A04 = new AGs(aLv.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x020d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x020e, code lost:
        X.1zE.A00(r5, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
        L_0x0000:
            r1 = r18
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x027c
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0000
            X.ALv r7 = r1.A05
            monitor-enter(r1)
            android.graphics.SurfaceTexture r0 = r1.A00     // Catch:{ all -> 0x0278 }
            if (r0 != 0) goto L_0x0027
            java.lang.String r4 = "RenderThread, surface texture null"
            r3 = 817892933(0x30c00e45, float:1.3973894E-9)
            java.lang.String r2 = "GradientBackgroundRenderer"
            r0 = 1
            X.0f9 r2 = X.0wj.A00(r2, r3, r0)     // Catch:{ all -> 0x0278 }
            java.lang.String r0 = "error: "
            r2.ABQ(r0, r4)     // Catch:{ all -> 0x0278 }
            r2.report()     // Catch:{ all -> 0x0278 }
            goto L_0x027b
        L_0x0027:
            X.7qj r3 = r7.A02     // Catch:{ all -> 0x0278 }
            android.opengl.EGLSurface r2 = r3.A02     // Catch:{ all -> 0x0278 }
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ all -> 0x0278 }
            boolean r0 = X.0qQ.A0K(r2, r0)     // Catch:{ all -> 0x0278 }
            if (r0 == 0) goto L_0x0043
            r3.A04()     // Catch:{ all -> 0x0278 }
            android.graphics.SurfaceTexture r0 = r1.A00     // Catch:{ all -> 0x0278 }
            if (r0 == 0) goto L_0x0273
            android.opengl.EGLSurface r0 = r3.A00(r0)     // Catch:{ all -> 0x0278 }
            r3.A02 = r0     // Catch:{ all -> 0x0278 }
            r3.A02()     // Catch:{ all -> 0x0278 }
        L_0x0043:
            X.AGs r4 = r1.A04     // Catch:{ Exception -> 0x0212 }
            android.content.Context r6 = r7.A00     // Catch:{ Exception -> 0x0212 }
            java.lang.String r5 = r1.A01     // Catch:{ Exception -> 0x0212 }
            if (r5 == 0) goto L_0x0208
            r10 = 0
            X.0qQ.A0B(r6, r10)     // Catch:{ Exception -> 0x0212 }
            r8 = 1
            int[] r9 = new int[r8]     // Catch:{ Exception -> 0x0212 }
            android.opengl.GLES20.glGenTextures(r8, r9, r10)     // Catch:{ Exception -> 0x0212 }
            r0 = r9[r10]     // Catch:{ Exception -> 0x0212 }
            if (r0 == 0) goto L_0x009d
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0212 }
            r2.<init>()     // Catch:{ Exception -> 0x0212 }
            r2.inScaled = r10     // Catch:{ Exception -> 0x0212 }
            android.content.res.AssetManager r0 = r6.getAssets()     // Catch:{ Exception -> 0x0212 }
            java.io.InputStream r5 = r0.open(r5)     // Catch:{ Exception -> 0x0212 }
            r0 = 0
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r5, r0, r2)     // Catch:{ all -> 0x0098 }
            if (r5 == 0) goto L_0x0072
            r5.close()     // Catch:{ Exception -> 0x0212 }
        L_0x0072:
            r0 = r9[r10]     // Catch:{ Exception -> 0x0212 }
            r5 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r5, r0)     // Catch:{ Exception -> 0x0212 }
            r0 = 10241(0x2801, float:1.435E-41)
            r2 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r5, r0, r2)     // Catch:{ Exception -> 0x0212 }
            r0 = 10240(0x2800, float:1.4349E-41)
            android.opengl.GLES20.glTexParameteri(r5, r0, r2)     // Catch:{ Exception -> 0x0212 }
            r0 = 10242(0x2802, float:1.4352E-41)
            r2 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r5, r0, r2)     // Catch:{ Exception -> 0x0212 }
            r0 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r5, r0, r2)     // Catch:{ Exception -> 0x0212 }
            android.opengl.GLUtils.texImage2D(r5, r10, r6, r10)     // Catch:{ Exception -> 0x0212 }
            if (r6 == 0) goto L_0x009d
            goto L_0x009a
        L_0x0098:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x020d }
        L_0x009a:
            r6.recycle()     // Catch:{ Exception -> 0x0212 }
        L_0x009d:
            r0 = r9[r10]     // Catch:{ Exception -> 0x0212 }
            if (r0 == 0) goto L_0x0201
            r4.A03 = r0     // Catch:{ Exception -> 0x0212 }
            int[] r0 = new int[r8]     // Catch:{ Exception -> 0x0212 }
            android.opengl.GLES20.glGenBuffers(r8, r0, r10)     // Catch:{ Exception -> 0x0212 }
            r0 = r0[r10]     // Catch:{ Exception -> 0x0212 }
            r4.A06 = r0     // Catch:{ Exception -> 0x0212 }
            r6 = 34962(0x8892, float:4.8992E-41)
            android.opengl.GLES20.glBindBuffer(r6, r0)     // Catch:{ Exception -> 0x0212 }
            float[] r5 = r4.A09     // Catch:{ Exception -> 0x0212 }
            r0 = 32
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r0)     // Catch:{ Exception -> 0x0212 }
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()     // Catch:{ Exception -> 0x0212 }
            java.nio.ByteBuffer r0 = r2.order(r0)     // Catch:{ Exception -> 0x0212 }
            java.nio.FloatBuffer r0 = r0.asFloatBuffer()     // Catch:{ Exception -> 0x0212 }
            r0.put(r5)     // Catch:{ Exception -> 0x0212 }
            java.nio.Buffer r5 = r0.position(r10)     // Catch:{ Exception -> 0x0212 }
            int r0 = r5.capacity()     // Catch:{ Exception -> 0x0212 }
            int r2 = r0 * 4
            r0 = 35044(0x88e4, float:4.9107E-41)
            android.opengl.GLES20.glBufferData(r6, r2, r5, r0)     // Catch:{ Exception -> 0x0212 }
            android.opengl.GLES20.glBindBuffer(r6, r10)     // Catch:{ Exception -> 0x0212 }
            java.lang.String r6 = r7.A04     // Catch:{ Exception -> 0x0212 }
            java.lang.String r5 = r7.A03     // Catch:{ Exception -> 0x0212 }
            r2 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            android.opengl.GLES20.glClearColor(r2, r2, r2, r0)     // Catch:{ Exception -> 0x0212 }
            r0 = 16640(0x4100, float:2.3318E-41)
            android.opengl.GLES20.glClear(r0)     // Catch:{ Exception -> 0x0212 }
            r0 = 35633(0x8b31, float:4.9932E-41)
            int r0 = X.AGs.A00(r0, r6)     // Catch:{ Exception -> 0x0212 }
            r4.A07 = r0     // Catch:{ Exception -> 0x0212 }
            r6 = 0
            if (r0 == 0) goto L_0x0148
            r0 = 35632(0x8b30, float:4.9931E-41)
            int r0 = X.AGs.A00(r0, r5)     // Catch:{ Exception -> 0x0212 }
            r4.A02 = r0     // Catch:{ Exception -> 0x0212 }
            if (r0 == 0) goto L_0x0148
            int r7 = android.opengl.GLES20.glCreateProgram()     // Catch:{ Exception -> 0x0212 }
            if (r7 == 0) goto L_0x01ea
            int r0 = r4.A07     // Catch:{ Exception -> 0x0212 }
            android.opengl.GLES20.glAttachShader(r7, r0)     // Catch:{ Exception -> 0x0212 }
            int r0 = r4.A02     // Catch:{ Exception -> 0x0212 }
            android.opengl.GLES20.glAttachShader(r7, r0)     // Catch:{ Exception -> 0x0212 }
            android.opengl.GLES20.glLinkProgram(r7)     // Catch:{ Exception -> 0x0212 }
            int[] r2 = new int[r8]     // Catch:{ Exception -> 0x0212 }
            r0 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r7, r0, r2, r10)     // Catch:{ Exception -> 0x0212 }
            r0 = r2[r10]     // Catch:{ Exception -> 0x0212 }
            if (r0 == r8) goto L_0x01ea
            r0 = 466(0x1d2, float:6.53E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ Exception -> 0x0212 }
            java.lang.String r2 = android.opengl.GLES20.glGetProgramInfoLog(r7)     // Catch:{ Exception -> 0x0212 }
            java.lang.String r5 = X.002.A0R(r0, r2)     // Catch:{ Exception -> 0x0212 }
            r2 = 817892933(0x30c00e45, float:1.3973894E-9)
            java.lang.String r0 = "GradientBackgGLUtil"
            X.0f9 r2 = X.0wj.A00(r0, r2, r8)     // Catch:{ Exception -> 0x0212 }
            java.lang.String r0 = "error: "
            r2.ABQ(r0, r5)     // Catch:{ Exception -> 0x0212 }
            r2.report()     // Catch:{ Exception -> 0x0212 }
            android.opengl.GLES20.glDeleteProgram(r7)     // Catch:{ Exception -> 0x0212 }
        L_0x0143:
            java.lang.String r0 = "createProgram"
            X.AGs.A01(r0)     // Catch:{ Exception -> 0x0212 }
        L_0x0148:
            r4.A04 = r6     // Catch:{ Exception -> 0x0212 }
            android.opengl.GLES20.glUseProgram(r6)     // Catch:{ Exception -> 0x0212 }
            int r2 = r4.A04     // Catch:{ Exception -> 0x0212 }
            java.lang.String r0 = "aPosition"
            int r0 = android.opengl.GLES20.glGetAttribLocation(r2, r0)     // Catch:{ Exception -> 0x0212 }
            r4.A00 = r0     // Catch:{ Exception -> 0x0212 }
            int r2 = r4.A04     // Catch:{ Exception -> 0x0212 }
            java.lang.String r0 = "aTexCoord"
            int r0 = android.opengl.GLES20.glGetAttribLocation(r2, r0)     // Catch:{ Exception -> 0x0212 }
            r4.A01 = r0     // Catch:{ Exception -> 0x0212 }
            r0 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r0)     // Catch:{ Exception -> 0x0212 }
            int r2 = r4.A03     // Catch:{ Exception -> 0x0212 }
            r0 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r0, r2)     // Catch:{ Exception -> 0x0212 }
            int r2 = r4.A04     // Catch:{ Exception -> 0x0212 }
            java.lang.String r0 = "s_texture"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r2, r0)     // Catch:{ Exception -> 0x0212 }
            r4.A05 = r0     // Catch:{ Exception -> 0x0212 }
            r0 = 36160(0x8d40, float:5.0671E-41)
            android.opengl.GLES20.glBindFramebuffer(r0, r10)     // Catch:{ Exception -> 0x0212 }
            int r0 = r4.A05     // Catch:{ Exception -> 0x0212 }
            android.opengl.GLES20.glUniform1i(r0, r10)     // Catch:{ Exception -> 0x0212 }
            float[] r6 = r4.A0A     // Catch:{ Exception -> 0x0212 }
            r2 = 4
            r0 = 80
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)     // Catch:{ Exception -> 0x0212 }
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()     // Catch:{ Exception -> 0x0212 }
            java.nio.ByteBuffer r0 = r5.order(r0)     // Catch:{ Exception -> 0x0212 }
            java.nio.FloatBuffer r0 = r0.asFloatBuffer()     // Catch:{ Exception -> 0x0212 }
            r4.A08 = r0     // Catch:{ Exception -> 0x0212 }
            java.lang.String r5 = "Required value was null."
            if (r0 == 0) goto L_0x01fc
            r0.put(r6)     // Catch:{ Exception -> 0x0212 }
            r0.position(r10)     // Catch:{ Exception -> 0x0212 }
            int r0 = r4.A00     // Catch:{ Exception -> 0x0212 }
            android.opengl.GLES20.glEnableVertexAttribArray(r0)     // Catch:{ Exception -> 0x0212 }
            int r0 = r4.A01     // Catch:{ Exception -> 0x0212 }
            android.opengl.GLES20.glEnableVertexAttribArray(r0)     // Catch:{ Exception -> 0x0212 }
            int r7 = r4.A00     // Catch:{ Exception -> 0x0212 }
            r8 = 3
            r9 = 5126(0x1406, float:7.183E-42)
            r11 = 20
            java.nio.FloatBuffer r0 = r4.A08     // Catch:{ Exception -> 0x0212 }
            if (r0 == 0) goto L_0x01f7
            java.nio.Buffer r12 = r0.position(r10)     // Catch:{ Exception -> 0x0212 }
            android.opengl.GLES20.glVertexAttribPointer(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0212 }
            int r12 = r4.A01     // Catch:{ Exception -> 0x0212 }
            r13 = 2
            java.nio.FloatBuffer r0 = r4.A08     // Catch:{ Exception -> 0x0212 }
            if (r0 == 0) goto L_0x01f2
            java.nio.Buffer r17 = r0.position(r8)     // Catch:{ Exception -> 0x0212 }
            r14 = r9
            r15 = r10
            r16 = r11
            android.opengl.GLES20.glVertexAttribPointer(r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0212 }
            java.nio.FloatBuffer r0 = r4.A08     // Catch:{ Exception -> 0x0212 }
            if (r0 == 0) goto L_0x01ed
            r0.position(r10)     // Catch:{ Exception -> 0x0212 }
            r0 = 5
            android.opengl.GLES20.glDrawArrays(r0, r10, r2)     // Catch:{ Exception -> 0x0212 }
            java.lang.String r0 = "draw"
            X.AGs.A01(r0)     // Catch:{ Exception -> 0x0212 }
            android.opengl.EGLDisplay r2 = r3.A01     // Catch:{ Exception -> 0x0212 }
            android.opengl.EGLSurface r0 = r3.A02     // Catch:{ Exception -> 0x0212 }
            android.opengl.EGL14.eglSwapBuffers(r2, r0)     // Catch:{ Exception -> 0x0212 }
            goto L_0x022f
        L_0x01ea:
            r6 = r7
            goto L_0x0143
        L_0x01ed:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)     // Catch:{ Exception -> 0x0212 }
            goto L_0x0211
        L_0x01f2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)     // Catch:{ Exception -> 0x0212 }
            goto L_0x0211
        L_0x01f7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)     // Catch:{ Exception -> 0x0212 }
            goto L_0x0211
        L_0x01fc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)     // Catch:{ Exception -> 0x0212 }
            goto L_0x0211
        L_0x0201:
            java.lang.String r0 = "Error loading texture."
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)     // Catch:{ Exception -> 0x0212 }
            goto L_0x0211
        L_0x0208:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x0212 }
            goto L_0x0211
        L_0x020d:
            r0 = move-exception
            X.1zE.A00(r5, r2)     // Catch:{ Exception -> 0x0212 }
        L_0x0211:
            throw r0     // Catch:{ Exception -> 0x0212 }
        L_0x0212:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0278 }
            java.lang.String r0 = "RenderThread exception: "
            java.lang.String r4 = X.AnonymousClass7TG.A0m(r3, r0, r2)     // Catch:{ all -> 0x0278 }
            r3 = 817892933(0x30c00e45, float:1.3973894E-9)
            java.lang.String r2 = "GradientBackgroundRenderer"
            r0 = 1
            X.0f9 r2 = X.0wj.A00(r2, r3, r0)     // Catch:{ all -> 0x0278 }
            java.lang.String r0 = "error: "
            r2.ABQ(r0, r4)     // Catch:{ all -> 0x0278 }
            r2.report()     // Catch:{ all -> 0x0278 }
        L_0x022f:
            X.AGs r4 = r1.A04     // Catch:{ all -> 0x0278 }
            int r0 = r4.A04     // Catch:{ all -> 0x0278 }
            android.opengl.GLES20.glDeleteProgram(r0)     // Catch:{ all -> 0x0278 }
            int r0 = r4.A07     // Catch:{ all -> 0x0278 }
            android.opengl.GLES20.glDeleteShader(r0)     // Catch:{ all -> 0x0278 }
            int r0 = r4.A02     // Catch:{ all -> 0x0278 }
            android.opengl.GLES20.glDeleteShader(r0)     // Catch:{ all -> 0x0278 }
            r3 = 0
            r4.A04 = r3     // Catch:{ all -> 0x0278 }
            r4.A07 = r3     // Catch:{ all -> 0x0278 }
            r4.A02 = r3     // Catch:{ all -> 0x0278 }
            r2 = 1
            int r0 = r4.A03     // Catch:{ all -> 0x0278 }
            int[] r0 = new int[]{r0}     // Catch:{ all -> 0x0278 }
            android.opengl.GLES20.glDeleteTextures(r2, r0, r3)     // Catch:{ all -> 0x0278 }
            r4.A03 = r3     // Catch:{ all -> 0x0278 }
            int r0 = r4.A06     // Catch:{ all -> 0x0278 }
            int[] r0 = new int[]{r0}     // Catch:{ all -> 0x0278 }
            android.opengl.GLES20.glDeleteBuffers(r2, r0, r3)     // Catch:{ all -> 0x0278 }
            r4.A06 = r3     // Catch:{ all -> 0x0278 }
            java.nio.FloatBuffer r0 = r4.A08     // Catch:{ all -> 0x0278 }
            if (r0 == 0) goto L_0x0265
            r0.clear()     // Catch:{ all -> 0x0278 }
        L_0x0265:
            r0 = 0
            r4.A08 = r0     // Catch:{ all -> 0x0278 }
            r4.A00 = r3     // Catch:{ all -> 0x0278 }
            r4.A01 = r3     // Catch:{ all -> 0x0278 }
            r4.A05 = r3     // Catch:{ all -> 0x0278 }
            r1.A02 = r3     // Catch:{ all -> 0x0278 }
            monitor-exit(r1)
            goto L_0x0000
        L_0x0273:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x0278 }
            throw r0     // Catch:{ all -> 0x0278 }
        L_0x0278:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x027b:
            monitor-exit(r1)
        L_0x027c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41517AvL.run():void");
    }
}
