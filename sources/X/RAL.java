package X;

import android.content.res.Resources;

public final class RAL extends 0ng {
    public final /* synthetic */ Resources A00;
    public final /* synthetic */ I09 A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RAL(Resources resources, I09 i09, String str) {
        super(2113291523, 3, false, false);
        this.A01 = i09;
        this.A02 = str;
        this.A00 = resources;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a3, code lost:
        X.0qQ.A0F(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00aa, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0104, code lost:
        if (r16 == false) goto L_0x0106;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r25 = this;
            r0 = r25
            X.I09 r4 = r0.A01
            java.lang.String r6 = r0.A02
            android.content.res.Resources r15 = r0.A00
            java.lang.String r10 = "BoomerangVideoCreator"
            android.media.MediaMetadataRetriever r3 = new android.media.MediaMetadataRetriever     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            r3.setDataSource(r6)     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            r9 = 0
            r7 = 0
            java.lang.String r0 = X.AnonymousClass457.A0C(r9, r7, r7)     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            java.lang.String r17 = X.AnonymousClass457.A0B(r0)     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            X.0qQ.A07(r17)     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            r0 = 18
            java.lang.String r0 = r3.extractMetadata(r0)     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            java.lang.String r2 = "0"
            if (r0 != 0) goto L_0x002a
            r0 = r2
        L_0x002a:
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            r0 = 19
            java.lang.String r0 = r3.extractMetadata(r0)     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            if (r0 != 0) goto L_0x0037
            r0 = r2
        L_0x0037:
            int r19 = java.lang.Integer.parseInt(r0)     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            r0 = 24
            java.lang.String r0 = r3.extractMetadata(r0)     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            if (r0 == 0) goto L_0x0044
            r2 = r0
        L_0x0044:
            int r0 = java.lang.Integer.parseInt(r2)     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            r3.release()     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            r2 = 0
            r3 = 0
            int r0 = r0 % 180
            r20 = r1
            if (r0 != 0) goto L_0x0057
            r20 = r19
            r19 = r1
        L_0x0057:
            X.0sI r1 = r4.A08     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            X.IIm r0 = r4.A03     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            X.SVf r14 = new X.SVf     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            r16 = r0
            r18 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20)     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            r4.A00 = r14     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            java.lang.String r1 = "Unable to config the decoder"
            java.lang.String r5 = "BasicVideoDecoder"
            android.media.MediaExtractor r4 = new android.media.MediaExtractor     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            r4.setDataSource(r6)     // Catch:{ IOException | IllegalArgumentException | NullPointerException -> 0x00c1 }
            r3 = r14
            int r12 = r4.getTrackCount()     // Catch:{ IOException | IllegalArgumentException | NullPointerException -> 0x00c1 }
            r11 = 0
        L_0x0078:
            java.lang.String r13 = "decoder"
            if (r11 >= r12) goto L_0x00a3
            android.media.MediaFormat r15 = r4.getTrackFormat(r11)     // Catch:{ IOException | IllegalArgumentException | NullPointerException -> 0x00c1 }
            java.lang.String r8 = X.Pxf.A0a(r15)     // Catch:{ IOException | IllegalArgumentException | NullPointerException -> 0x00c1 }
            if (r8 == 0) goto L_0x00ab
            java.lang.String r6 = "video/"
            r0 = 1
            boolean r0 = X.C66580MXl.A1a(r6, r0, r8)     // Catch:{ IOException | IllegalArgumentException | NullPointerException -> 0x00c1 }
            if (r0 == 0) goto L_0x00ab
            r4.selectTrack(r11)     // Catch:{ IOException | IllegalArgumentException | NullPointerException -> 0x00c1 }
            r0 = 1132777433(0x4384cfd9, float:265.6238)
            android.media.MediaCodec r2 = X.0fX.A01(r8, r0)     // Catch:{ IOException | IllegalArgumentException | NullPointerException -> 0x00c1 }
            if (r2 == 0) goto L_0x00a3
            android.view.Surface r0 = r14.A03     // Catch:{ IOException | IllegalArgumentException | NullPointerException -> 0x00c1 }
            if (r0 != 0) goto L_0x00ae
            java.lang.String r13 = "surface"
        L_0x00a3:
            X.0qQ.A0F(r13)     // Catch:{ IOException | IllegalArgumentException | NullPointerException -> 0x00c1 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ IOException | IllegalArgumentException | NullPointerException -> 0x00c1 }
            throw r0     // Catch:{ IOException | IllegalArgumentException | NullPointerException -> 0x00c1 }
        L_0x00ab:
            int r11 = r11 + 1
            goto L_0x0078
        L_0x00ae:
            r18 = 130841679(0x7cc7c4f, float:3.076757E-34)
            r13 = r2
            r14 = r9
            r16 = r0
            r17 = r7
            X.0fX.A07(r13, r14, r15, r16, r17, r18)     // Catch:{ IOException | IllegalArgumentException | NullPointerException -> 0x00c1 }
            r0 = -144609487(0xfffffffff7616f31, float:-4.5723517E33)
            X.0fX.A05(r2, r0)     // Catch:{ IOException | IllegalArgumentException | NullPointerException -> 0x00c1 }
            goto L_0x00c5
        L_0x00c1:
            r0 = move-exception
            X.0KC.A0H(r5, r1, r0)     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
        L_0x00c5:
            if (r2 == 0) goto L_0x0208
            java.nio.ByteBuffer[] r17 = r2.getInputBuffers()     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            r2.getOutputBuffers()     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            android.media.MediaCodec$BufferInfo r6 = new android.media.MediaCodec$BufferInfo     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            r6.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            r16 = 0
        L_0x00d5:
            r8 = 1
            r13 = 0
            r0 = 25000(0x61a8, double:1.23516E-319)
            if (r16 != 0) goto L_0x0109
            int r19 = r2.dequeueInputBuffer(r0)     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            if (r19 < 0) goto L_0x0106
            if (r17 != 0) goto L_0x00e6
            goto L_0x01c5
        L_0x00e6:
            r11 = r17[r19]     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            int r21 = r4.readSampleData(r11, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            if (r21 >= 0) goto L_0x00f7
            r22 = 0
            r16 = 1
            r21 = 0
            r24 = 4
            goto L_0x00fd
        L_0x00f7:
            long r22 = r4.getSampleTime()     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            r24 = 0
        L_0x00fd:
            r18 = r2
            r20 = r7
            r18.queueInputBuffer(r19, r20, r21, r22, r24)     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            if (r16 != 0) goto L_0x0109
        L_0x0106:
            r4.advance()     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
        L_0x0109:
            int r12 = r2.dequeueOutputBuffer(r6, r0)     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            r0 = -3
            if (r12 == r0) goto L_0x01a2
            r0 = -2
            if (r12 == r0) goto L_0x019d
            r0 = -1
            if (r12 == r0) goto L_0x00d5
            long r0 = r6.presentationTimeUs     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            int r11 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r11 >= 0) goto L_0x011d
            r8 = 0
        L_0x011d:
            r2.releaseOutputBuffer(r12, r8)     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            int r0 = r6.flags     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            r1 = r0 & 4
            java.lang.String r0 = "outputSurfaceHandler"
            if (r1 == 0) goto L_0x012a
            goto L_0x01a7
        L_0x012a:
            if (r3 == 0) goto L_0x01c7
            java.lang.Object r8 = r3.A0L     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            monitor-enter(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
        L_0x012f:
            boolean r0 = r3.A0G     // Catch:{ all -> 0x01cf }
            if (r0 != 0) goto L_0x0144
            r0 = 5000(0x1388, double:2.4703E-320)
            r8.wait(r0)     // Catch:{ InterruptedException -> 0x01ba }
            boolean r0 = r3.A0G     // Catch:{ InterruptedException -> 0x01ba }
            if (r0 != 0) goto L_0x012f
            java.lang.String r1 = "Surface frame wait timed out"
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException     // Catch:{ InterruptedException -> 0x01ba }
            r0.<init>(r1)     // Catch:{ InterruptedException -> 0x01ba }
            throw r0     // Catch:{ InterruptedException -> 0x01ba }
        L_0x0144:
            r3.A0G = r7     // Catch:{ all -> 0x01cf }
            monitor-exit(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            android.graphics.SurfaceTexture r11 = r3.A02     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            r11.updateTexImage()     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            long r0 = r6.presentationTimeUs     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            r8 = 16
            float[] r15 = new float[r8]     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            r11.getTransformMatrix(r15)     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            int r11 = r3.A0I     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            int r8 = r3.A0H     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            X.8tg r14 = new X.8tg     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            r14.<init>(r11, r8)     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            char r13 = X.Pxj.A01(r14)     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            X.AHA r12 = r3.A0D     // Catch:{ 9bR -> 0x0193 }
            if (r12 != 0) goto L_0x0170
            java.lang.String r0 = "boomerangFramesGLRenderer"
            X.0qQ.A0F(r0)     // Catch:{ 9bR -> 0x0193 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ 9bR -> 0x0193 }
            throw r0     // Catch:{ 9bR -> 0x0193 }
        L_0x0170:
            X.8so r11 = r3.A0K     // Catch:{ 9bR -> 0x0193 }
            X.7v0 r8 = r3.A0A     // Catch:{ 9bR -> 0x0193 }
            r19 = r8
            r20 = r15
            r21 = r9
            r22 = r9
            r23 = r0
            r18 = r11
            r18.A02(r19, r20, r21, r22, r23)     // Catch:{ 9bR -> 0x0193 }
            r12.A04(r11)     // Catch:{ 9bR -> 0x0193 }
            X.Pxi.A0r(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            android.opengl.GLES20.glFlush()     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            java.util.List r0 = r3.A0N     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            r0.add(r14)     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            goto L_0x00d5
        L_0x0193:
            r8 = move-exception
            java.lang.String r1 = "DecoderOutputSurfaceHandler"
            java.lang.String r0 = "OOM, drawImage() GlOutOfMemoryException"
            X.0KC.A0F(r1, r0, r8)     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            goto L_0x00d5
        L_0x019d:
            r2.getOutputFormat()     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            goto L_0x00d5
        L_0x01a2:
            r2.getOutputBuffers()     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            goto L_0x00d5
        L_0x01a7:
            if (r3 == 0) goto L_0x01c7
            float r1 = r3.A01     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            float r0 = r3.A00     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            X.C11443SVf.A02(r3, r1, r0)     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            r0 = -1241119639(0xffffffffb6060469, float:-1.9970123E-6)
            X.0fX.A06(r2, r0)     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            r0 = -303518444(0xffffffffede8ad14, float:-9.00122E27)
            goto L_0x01f6
        L_0x01ba:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x01cf }
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch:{ all -> 0x01cf }
            r0.<init>(r1)     // Catch:{ all -> 0x01cf }
            throw r0     // Catch:{ all -> 0x01cf }
        L_0x01c5:
            java.lang.String r0 = "inputBuffers"
        L_0x01c7:
            X.0qQ.A0F(r0)     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x01d1
        L_0x01cf:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
        L_0x01d1:
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01ed, IllegalStateException -> 0x01e3, CodecException -> 0x01d9, CryptoException -> 0x01d2 }
        L_0x01d2:
            r1 = move-exception
            java.lang.String r0 = "Crypto error occurred while accessing a secure buffer"
            X.0KC.A0F(r5, r0, r1)     // Catch:{ all -> 0x01fd }
            throw r1     // Catch:{ all -> 0x01fd }
        L_0x01d9:
            r1 = move-exception
            java.lang.String r0 = "Decoding failed"
            X.0KC.A0F(r5, r0, r1)     // Catch:{ all -> 0x01fd }
            r0 = -54321255(0xfffffffffcc31f99, float:-8.10511E36)
            goto L_0x01f6
        L_0x01e3:
            r1 = move-exception
            java.lang.String r0 = "Decoder might be in an invalid state"
            X.0KC.A0F(r5, r0, r1)     // Catch:{ all -> 0x01fd }
            r0 = 310034320(0x127abf90, float:7.912221E-28)
            goto L_0x01f6
        L_0x01ed:
            r1 = move-exception
            java.lang.String r0 = "Invalid index access while decoding"
            X.0KC.A0F(r5, r0, r1)     // Catch:{ all -> 0x01fd }
            r0 = 1392897203(0x5305ecb3, float:5.752018E11)
        L_0x01f6:
            X.0fX.A03(r2, r0)     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            r4.release()     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            return
        L_0x01fd:
            r1 = move-exception
            r0 = 1932835946(0x7334bc6a, float:1.431938E31)
            X.0fX.A03(r2, r0)     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            r4.release()     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
            goto L_0x020e
        L_0x0208:
            java.lang.String r0 = "Decoder was not initialized"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
        L_0x020e:
            throw r1     // Catch:{ IllegalArgumentException -> 0x020f, IOException -> 0x0213 }
        L_0x020f:
            r1 = move-exception
            java.lang.String r0 = "Invalid video file path "
            goto L_0x0216
        L_0x0213:
            r1 = move-exception
            java.lang.String r0 = "Temporary video file creation failed"
        L_0x0216:
            X.0KC.A0F(r10, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RAL.run():void");
    }
}
