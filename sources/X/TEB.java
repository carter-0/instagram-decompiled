package X;

public final class TEB implements Runnable {
    public final /* synthetic */ S3Z A00;

    public TEB(S3Z s3z) {
        this.A00 = s3z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0105, code lost:
        X.0qQ.A0F(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010c, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0162, code lost:
        r0 = r9.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0164, code lost:
        if (r0 == null) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0166, code lost:
        r1 = r0.getOutputBuffer(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x016a, code lost:
        if (r1 == null) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x016c, code lost:
        X.Pxg.A1D(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x016f, code lost:
        r2.presentationTimeUs = r4;
        r0 = r9.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0173, code lost:
        if (r1 == null) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0175, code lost:
        r0.A01(r2, r1);
        r1 = r9.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x017a, code lost:
        if (r1 == null) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x017c, code lost:
        r1.releaseOutputBuffer(r3, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0192, code lost:
        if (java.lang.Math.ceil(((double) r4) / 1000.0d) < ((double) r9.A0A.A06)) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0194, code lost:
        r9.A04 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0197, code lost:
        if (r17 != false) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0199, code lost:
        r0 = r9.A00;
        r6 = r9.A06;
        r9.A00 = r0 + r6;
        r11 = r13.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01a8, code lost:
        if (r11.hasNext() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01aa, code lost:
        r10 = (X.C10821Ryh) r11.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01c1, code lost:
        if (((double) ((r10.A00 + r10.A03) - r10.A01)) >= (((double) r9.A00) + (((double) r6) * 0.1d))) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01c3, code lost:
        r10.A07.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d3, code lost:
        r9.A04 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r4 = r9.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d7, code lost:
        if (r4 != null) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d9, code lost:
        X.0qQ.A0F("audioMerger");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01df, code lost:
        r4 = r9.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e1, code lost:
        if (r4 != null) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e3, code lost:
        X.0qQ.A0F("audioMerger");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ec, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ed, code lost:
        r4.Cp8(0, r9.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01f5, code lost:
        r4.Cp8(0, r9.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0201, code lost:
        throw X.AnonymousClass7TE.A0y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x020a, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x020b, code lost:
        X.AnonymousClass7TF.A19(X.0wj.A01.AEf(X.S3Z.class.getSimpleName(), 817892340), com.facebook.react.modules.dialog.DialogModule.KEY_MESSAGE, "muxAudio failure", r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r24 = this;
            r0 = r24
            X.S3Z r9 = r0.A00
            java.util.concurrent.CountDownLatch r0 = r9.A0F
            long r3 = r0.getCount()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0226
            java.util.List r13 = r9.A0E
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r13.iterator()
        L_0x001a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.Ryh r0 = (X.C10821Ryh) r0
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x001a
            r3.add(r1)
            goto L_0x001a
        L_0x002f:
            boolean r0 = r3.isEmpty()
            r8 = 1
            r17 = r0 ^ 1
        L_0x0036:
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r13.iterator()
        L_0x003e:
            boolean r0 = r16.hasNext()
            r14 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            if (r0 == 0) goto L_0x0073
            java.lang.Object r11 = r16.next()
            r10 = r11
            X.Ryh r10 = (X.C10821Ryh) r10
            long r0 = r10.A00
            r3 = -1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x006b
            long r2 = r10.A03
            long r0 = r0 + r2
            long r2 = r10.A01
            long r0 = r0 - r2
            double r6 = (double) r0
            long r0 = r9.A00
            double r4 = (double) r0
            long r2 = r9.A06
            double r0 = (double) r2
            double r0 = r0 * r14
            double r4 = r4 + r0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x006f
        L_0x006b:
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x003e
        L_0x006f:
            r12.add(r11)
            goto L_0x003e
        L_0x0073:
            int r1 = r12.size()
            int r0 = r13.size()
            if (r1 != r0) goto L_0x0226
            java.util.Iterator r6 = r13.iterator()
        L_0x0081:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0123
            java.lang.Object r0 = r6.next()
            X.Ryh r0 = (X.C10821Ryh) r0
            X.RzB r4 = r0.A06
            android.graphics.SurfaceTexture r0 = r4.A05
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x01ce
            r0.updateTexImage()
            android.graphics.SurfaceTexture r0 = r4.A05
            if (r0 == 0) goto L_0x01c9
            float[] r3 = r4.A0C
            r0.getTransformMatrix(r3)
            android.graphics.Rect r0 = r4.A08
            int r5 = r0.left
            int r2 = r0.top
            int r1 = r0.right
            int r0 = r0.bottom
            android.opengl.GLES20.glViewport(r5, r2, r1, r0)
            int r0 = r4.A02
            android.opengl.GLES20.glUseProgram(r0)
            int[] r0 = r4.A07
            java.lang.String r5 = "vertexBuffers"
            if (r0 == 0) goto L_0x0105
            r2 = 0
            r0 = r0[r2]
            r1 = 34962(0x8892, float:4.8992E-41)
            android.opengl.GLES20.glBindBuffer(r1, r0)
            int r0 = r4.A01
            android.opengl.GLES20.glEnableVertexAttribArray(r0)
            int r0 = r4.A01
            r19 = 3
            r20 = 5126(0x1406, float:7.183E-42)
            r22 = 12
            r18 = r0
            r21 = r2
            r23 = r2
            android.opengl.GLES20.glVertexAttribPointer(r18, r19, r20, r21, r22, r23)
            int[] r0 = r4.A07
            if (r0 == 0) goto L_0x0105
            r0 = r0[r8]
            android.opengl.GLES20.glBindBuffer(r1, r0)
            int r0 = r4.A03
            android.opengl.GLES20.glEnableVertexAttribArray(r0)
            int r0 = r4.A03
            r19 = 2
            r22 = 8
            r18 = r0
            android.opengl.GLES20.glVertexAttribPointer(r18, r19, r20, r21, r22, r23)
            android.opengl.GLES20.glBindBuffer(r1, r2)
            r0 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r0)
            r1 = 36197(0x8d65, float:5.0723E-41)
            int[] r0 = r4.A06
            if (r0 != 0) goto L_0x010d
            java.lang.String r5 = "textures"
        L_0x0105:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x010d:
            r0 = r0[r2]
            android.opengl.GLES20.glBindTexture(r1, r0)
            int r0 = r4.A04
            android.opengl.GLES20.glUniform1i(r0, r2)
            int r0 = r4.A00
            android.opengl.GLES20.glUniformMatrix4fv(r0, r8, r2, r3, r2)
            r1 = 5
            r0 = 4
            android.opengl.GLES20.glDrawArrays(r1, r2, r0)
            goto L_0x0081
        L_0x0123:
            X.S4f r0 = r9.A0B
            android.opengl.EGLDisplay r1 = r0.A00
            android.opengl.EGLSurface r0 = r0.A01
            android.opengl.EGL14.eglSwapBuffers(r1, r0)
            long r4 = r9.A00
            android.media.MediaCodec$BufferInfo r2 = new android.media.MediaCodec$BufferInfo
            r2.<init>()
        L_0x0133:
            android.media.MediaCodec r3 = r9.A01
            java.lang.String r6 = "videoEncoder"
            if (r3 == 0) goto L_0x0202
            r0 = 50000(0xc350, double:2.47033E-319)
            int r3 = r3.dequeueOutputBuffer(r2, r0)
            r0 = -2
            if (r3 != r0) goto L_0x0160
            android.media.MediaCodec r0 = r9.A01
            if (r0 == 0) goto L_0x0202
            android.media.MediaFormat r0 = r0.getOutputFormat()
            X.0qQ.A07(r0)
            X.S70 r1 = r9.A0C
            r1.A03(r0)
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x0133
            com.facebook.ffmpeg.FFMpegMediaMuxer r0 = r1.A02
            r0.A00()
            r1.A03 = r8
            goto L_0x0133
        L_0x0160:
            if (r3 < 0) goto L_0x0133
            android.media.MediaCodec r0 = r9.A01
            if (r0 == 0) goto L_0x0202
            java.nio.ByteBuffer r1 = r0.getOutputBuffer(r3)
            if (r1 == 0) goto L_0x016f
            X.Pxg.A1D(r2, r1)
        L_0x016f:
            r2.presentationTimeUs = r4
            X.S70 r0 = r9.A0C
            if (r1 == 0) goto L_0x01fd
            r0.A01(r2, r1)
            android.media.MediaCodec r1 = r9.A01
            if (r1 == 0) goto L_0x0202
            r0 = 0
            r1.releaseOutputBuffer(r3, r0)
            double r2 = (double) r4
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r0
            double r5 = java.lang.Math.ceil(r2)
            X.RyY r0 = r9.A0A
            long r3 = r0.A06
            double r1 = (double) r3
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0197
            r9.A04 = r8
            goto L_0x01df
        L_0x0197:
            if (r17 != 0) goto L_0x01d3
            long r0 = r9.A00
            long r6 = r9.A06
            long r0 = r0 + r6
            r9.A00 = r0
            java.util.Iterator r11 = r13.iterator()
        L_0x01a4:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r10 = r11.next()
            X.Ryh r10 = (X.C10821Ryh) r10
            long r0 = r10.A00
            long r2 = r10.A03
            long r0 = r0 + r2
            long r2 = r10.A01
            long r0 = r0 - r2
            double r4 = (double) r0
            long r0 = r9.A00
            double r2 = (double) r0
            double r0 = (double) r6
            double r0 = r0 * r14
            double r2 = r2 + r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x01a4
            java.util.concurrent.Semaphore r0 = r10.A07
            r0.release()
            goto L_0x01a4
        L_0x01c9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x01ce:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x01d3:
            r9.A04 = r8
            X.ThX r4 = r9.A03     // Catch:{ RuntimeException -> 0x020a }
            if (r4 != 0) goto L_0x01f5
            java.lang.String r0 = "audioMerger"
            X.0qQ.A0F(r0)     // Catch:{ RuntimeException -> 0x020a }
            goto L_0x01e8
        L_0x01df:
            X.ThX r4 = r9.A03     // Catch:{ RuntimeException -> 0x020a }
            if (r4 != 0) goto L_0x01ed
            java.lang.String r0 = "audioMerger"
            X.0qQ.A0F(r0)     // Catch:{ RuntimeException -> 0x020a }
        L_0x01e8:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ RuntimeException -> 0x020a }
            throw r0     // Catch:{ RuntimeException -> 0x020a }
        L_0x01ed:
            r2 = 0
            long r0 = r9.A00     // Catch:{ RuntimeException -> 0x020a }
            r4.Cp8(r2, r0)     // Catch:{ RuntimeException -> 0x020a }
            goto L_0x0223
        L_0x01f5:
            r2 = 0
            long r0 = r9.A00     // Catch:{ RuntimeException -> 0x020a }
            r4.Cp8(r2, r0)     // Catch:{ RuntimeException -> 0x020a }
            goto L_0x0223
        L_0x01fd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0202:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x020a:
            r3 = move-exception
            X.0wj r2 = X.0wj.A01
            r1 = 817892340(0x30c00bf4, float:1.3973236E-9)
            java.lang.Class<X.S3Z> r0 = X.S3Z.class
            java.lang.String r0 = r0.getSimpleName()
            X.0f9 r2 = r2.AEf(r0, r1)
            java.lang.String r1 = "message"
            java.lang.String r0 = "muxAudio failure"
            X.AnonymousClass7TF.A19(r2, r1, r0, r3)
        L_0x0223:
            r9.A00()
        L_0x0226:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TEB.run():void");
    }
}
