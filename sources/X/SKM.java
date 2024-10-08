package X;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.io.IOException;

public abstract class SKM {
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r10 = X.0fX.A01(r2, -1098697001);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r3.selectTrack(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r10 == null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        X.0fX.A07(r10, (android.media.MediaCrypto) null, r12, (android.view.Surface) null, 0, -366572983);
        X.0fX.A05(r10, -1594093423);
        r2 = new android.media.MediaCodec.BufferInfo();
        r7 = r10.getInputBuffers();
        X.0qQ.A07(r7);
        r6 = false;
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        r12 = r10.dequeueInputBuffer(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r12 < 0) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        r18 = r3.readSampleData(r7[r12], 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        if (r18 >= 0) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        r10.queueInputBuffer(r12, 0, 0, 0, 4);
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        r1 = r10.dequeueOutputBuffer(r2, com.facebook.proxygen.LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        if (r1 < 0) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
        if ((r2.flags & 4) == 0) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        r10.releaseOutputBuffer(r1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        if (r6 == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        r3.release();
        X.0fX.A06(r10, 1657950010);
        X.0fX.A03(r10, -1633396843);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        return 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0093, code lost:
        if (r1 != -2) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0095, code lost:
        r1 = (double) r10.getOutputFormat().getInteger("sample-rate");
        r3.release();
        X.0fX.A06(r10, -1736924188);
        X.0fX.A03(r10, 1345472773);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b0, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b1, code lost:
        if (r5 != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b4, code lost:
        r10.queueInputBuffer(r12, 0, r18, r3.getSampleTime(), 0);
        r3.advance();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d5, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d6, code lost:
        r0 = "Error creating decoder ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final double A00(java.lang.String r21) {
        /*
            java.lang.String r5 = "Error"
            r14 = 0
            android.media.MediaExtractor r3 = new android.media.MediaExtractor
            r3.<init>()
            r8 = 0
            r0 = r21
            r3.setDataSource(r0)     // Catch:{ IOException -> 0x00d1 }
            int r6 = r3.getTrackCount()
            r4 = 0
        L_0x0014:
            r11 = 0
            if (r4 >= r6) goto L_0x00c6
            android.media.MediaFormat r12 = r3.getTrackFormat(r4)
            java.lang.String r2 = X.Pxf.A0a(r12)
            if (r2 == 0) goto L_0x002e
            java.lang.String r1 = "audio/"
            r0 = 1
            boolean r0 = X.C66580MXl.A1a(r1, r0, r2)
            if (r0 == 0) goto L_0x002e
            r0 = -1098697001(0xffffffffbe8336d7, float:-0.25627777)
            goto L_0x0031
        L_0x002e:
            int r4 = r4 + 1
            goto L_0x0014
        L_0x0031:
            android.media.MediaCodec r10 = X.0fX.A01(r2, r0)     // Catch:{ IOException -> 0x00d5 }
            r3.selectTrack(r4)
            if (r10 == 0) goto L_0x00c6
            r15 = -366572983(0xffffffffea268a49, float:-5.033368E25)
            r13 = r11
            X.0fX.A07(r10, r11, r12, r13, r14, r15)
            r0 = -1594093423(0xffffffffa0fc1091, float:-4.2701423E-19)
            X.0fX.A05(r10, r0)
            android.media.MediaCodec$BufferInfo r2 = new android.media.MediaCodec$BufferInfo
            r2.<init>()
            java.nio.ByteBuffer[] r7 = r10.getInputBuffers()
            X.0qQ.A07(r7)
            r6 = 0
            r5 = 0
        L_0x0055:
            r0 = 0
            int r12 = r10.dequeueInputBuffer(r0)
            if (r12 < 0) goto L_0x006e
            r4 = r7[r12]
            int r18 = r3.readSampleData(r4, r14)
            if (r18 >= 0) goto L_0x00b4
            r17 = 4
            r11 = r10
            r13 = r14
            r15 = r0
            r11.queueInputBuffer(r12, r13, r14, r15, r17)
            r5 = 1
        L_0x006e:
            r0 = 5000(0x1388, double:2.4703E-320)
            int r1 = r10.dequeueOutputBuffer(r2, r0)
            if (r1 < 0) goto L_0x0092
            int r0 = r2.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x007d
            r6 = 1
        L_0x007d:
            r10.releaseOutputBuffer(r1, r14)
            if (r6 == 0) goto L_0x00b1
            r3.release()
            r0 = 1657950010(0x62d24f3a, float:1.9397626E21)
            X.0fX.A06(r10, r0)
            r0 = -1633396843(0xffffffff9ea45795, float:-1.7400398E-20)
            X.0fX.A03(r10, r0)
            return r8
        L_0x0092:
            r0 = -2
            if (r1 != r0) goto L_0x00b1
            android.media.MediaFormat r1 = r10.getOutputFormat()
            java.lang.String r0 = "sample-rate"
            int r0 = r1.getInteger(r0)
            double r1 = (double) r0
            r3.release()
            r0 = -1736924188(0xffffffff9878a3e4, float:-3.2135992E-24)
            X.0fX.A06(r10, r0)
            r0 = 1345472773(0x50324905, float:1.19645194E10)
            X.0fX.A03(r10, r0)
            return r1
        L_0x00b1:
            if (r5 != 0) goto L_0x006e
            goto L_0x0055
        L_0x00b4:
            long r19 = r3.getSampleTime()
            r15 = r10
            r16 = r12
            r17 = r14
            r21 = r14
            r15.queueInputBuffer(r16, r17, r18, r19, r21)
            r3.advance()
            goto L_0x006e
        L_0x00c6:
            java.lang.String r0 = "Null decoder"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ IllegalStateException -> 0x00cd }
            throw r0     // Catch:{ IllegalStateException -> 0x00cd }
        L_0x00cd:
            r1 = move-exception
            java.lang.String r0 = "Error decoder check null  "
            goto L_0x00d8
        L_0x00d1:
            r1 = move-exception
            java.lang.String r0 = "Error creating extractor "
            goto L_0x00d8
        L_0x00d5:
            r1 = move-exception
            java.lang.String r0 = "Error creating decoder "
        L_0x00d8:
            X.0KC.A0F(r5, r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SKM.A00(java.lang.String):double");
    }

    public static final int A01(String str) {
        MediaExtractor mediaExtractor = new MediaExtractor();
        int i = 0;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            for (int i2 = 0; i2 < trackCount; i2++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i2);
                String A0a = Pxf.A0a(trackFormat);
                if (A0a != null && C66580MXl.A1a("audio/", 1, A0a)) {
                    i = trackFormat.getInteger("channel-count");
                }
            }
        } catch (IOException | IllegalArgumentException e) {
            0KC.A0F("Error", "Error extracting channel count", e);
        }
        mediaExtractor.release();
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r9 = X.0fX.A01(r3, 1099392127);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r11.selectTrack(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01bd, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01be, code lost:
        r1 = "Error creating decoder ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.nio.ByteBuffer A02(java.lang.String r32, long r33, long r35) {
        /*
            java.lang.String r27 = "Error"
            r26 = 0
            android.media.MediaExtractor r11 = new android.media.MediaExtractor
            r11.<init>()
            r4 = r32
            r11.setDataSource(r4)     // Catch:{ IOException -> 0x01cd }
            int r6 = r11.getTrackCount()
            r5 = 0
        L_0x0013:
            r13 = 0
            if (r5 >= r6) goto L_0x0038
            android.media.MediaFormat r1 = r11.getTrackFormat(r5)
            java.lang.String r3 = X.Pxf.A0a(r1)
            if (r3 == 0) goto L_0x002d
            java.lang.String r2 = "audio/"
            r0 = 1
            boolean r0 = X.C66580MXl.A1a(r2, r0, r3)
            if (r0 == 0) goto L_0x002d
            r0 = 1099392127(0x4187647f, float:16.92407)
            goto L_0x0030
        L_0x002d:
            int r5 = r5 + 1
            goto L_0x0013
        L_0x0030:
            android.media.MediaCodec r9 = X.0fX.A01(r3, r0)     // Catch:{ IOException -> 0x01bd }
            r11.selectTrack(r5)
            goto L_0x003a
        L_0x0038:
            r9 = r13
            r1 = r13
        L_0x003a:
            r7 = 0
            r2 = r33
            int r0 = (r33 > r7 ? 1 : (r33 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0047
            r0 = r26
            r11.seekTo(r2, r0)
        L_0x0047:
            if (r9 == 0) goto L_0x01b2
            r17 = 634655636(0x25d41394, float:3.6789404E-16)
            r12 = r9
            r14 = r1
            r15 = r13
            r16 = r26
            X.0fX.A07(r12, r13, r14, r15, r16, r17)
            r0 = -1627098666(0xffffffff9f0471d6, float:-2.804625E-20)
            X.0fX.A05(r9, r0)
            android.media.MediaCodec$BufferInfo r6 = new android.media.MediaCodec$BufferInfo
            r6.<init>()
            java.nio.ByteBuffer[] r25 = r9.getInputBuffers()
            X.0qQ.A07(r25)
            java.nio.ByteBuffer[] r24 = r9.getOutputBuffers()
            X.0qQ.A07(r24)
            double r22 = A00(r4)
            int r21 = A01(r4)
            r4 = 0
            int r0 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            if (r0 != 0) goto L_0x01c5
            long r4 = r35 - r33
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0097
            if (r1 == 0) goto L_0x0091
            java.lang.String r0 = "durationUs"
            long r0 = r1.getLong(r0)
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
        L_0x0091:
            if (r13 == 0) goto L_0x0097
            long r4 = r13.longValue()
        L_0x0097:
            double r0 = (double) r4
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r0 = r0 / r19
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r0 + r7
            double r4 = r4 * r22
            double r4 = java.lang.Math.ceil(r4)
            int r7 = (int) r4
            int r10 = r21 * 2
            int r7 = r7 * r10
            java.nio.ByteBuffer r13 = java.nio.ByteBuffer.allocateDirect(r7)
            r18 = 0
            r4 = 0
            r17 = 0
        L_0x00b7:
            r15 = r13
        L_0x00b8:
            if (r17 != 0) goto L_0x0170
            if (r18 != 0) goto L_0x00e9
            r7 = 0
            int r29 = r9.dequeueInputBuffer(r7)
            if (r29 < 0) goto L_0x00e9
            r13 = r25[r29]
            r12 = r26
            int r31 = r11.readSampleData(r13, r12)
            if (r31 < 0) goto L_0x00da
            int r12 = (r35 > r2 ? 1 : (r35 == r2 ? 0 : -1))
            if (r12 <= 0) goto L_0x015a
            long r13 = r11.getSampleTime()
            int r12 = (r35 > r13 ? 1 : (r35 == r13 ? 0 : -1))
            if (r12 >= 0) goto L_0x015a
        L_0x00da:
            r34 = 4
            r28 = r9
            r30 = r26
            r31 = r26
            r32 = r7
            r28.queueInputBuffer(r29, r30, r31, r32, r34)
            r18 = 1
        L_0x00e9:
            r7 = 5000(0x1388, double:2.4703E-320)
            int r12 = r9.dequeueOutputBuffer(r6, r7)
            if (r12 < 0) goto L_0x014e
            int r7 = r6.size
            if (r7 <= 0) goto L_0x013e
            r14 = r24[r12]
            X.Pxg.A1D(r6, r14)
            int r7 = r6.size
            int r8 = r16 + r7
            int r7 = r15.capacity()
            if (r8 < r7) goto L_0x013c
            int r7 = r6.size
            int r8 = r16 + r7
            int r7 = r15.position()
            r15.rewind()
            java.nio.ByteBuffer r13 = java.nio.ByteBuffer.allocateDirect(r8)
            r13.put(r15)
            r13.position(r7)
        L_0x0119:
            long r7 = r6.presentationTimeUs
            int r15 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r15 >= 0) goto L_0x0121
            long r4 = r2 - r7
        L_0x0121:
            int r7 = r6.size
            r29 = r7
            r28 = r16
            r8 = 0
        L_0x0128:
            r7 = r29
            if (r8 >= r7) goto L_0x013f
            int r16 = r16 + 1
            byte r15 = r14.get(r8)     // Catch:{ IllegalStateException -> 0x016c }
            r7 = r28
            r13.put(r7, r15)     // Catch:{ IllegalStateException -> 0x016c }
            int r8 = r8 + 1
            r28 = r16
            goto L_0x0128
        L_0x013c:
            r13 = r15
            goto L_0x0119
        L_0x013e:
            r13 = r15
        L_0x013f:
            int r7 = r6.flags
            r7 = r7 & 4
            if (r7 == 0) goto L_0x0147
            r17 = 1
        L_0x0147:
            r7 = r26
            r9.releaseOutputBuffer(r12, r7)
            goto L_0x00b7
        L_0x014e:
            r7 = -3
            if (r12 != r7) goto L_0x00b8
            java.nio.ByteBuffer[] r24 = r9.getOutputBuffers()
            X.0qQ.A07(r24)
            goto L_0x00b8
        L_0x015a:
            long r32 = r11.getSampleTime()
            r28 = r9
            r30 = r26
            r34 = r26
            r28.queueInputBuffer(r29, r30, r31, r32, r34)
            r11.advance()
            goto L_0x00e9
        L_0x016c:
            r2 = move-exception
            java.lang.String r1 = "Error getting decoded data  "
            goto L_0x01c0
        L_0x0170:
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x01b0
            double r6 = r22 / r19
            double r2 = (double) r4
            double r6 = r6 * r2
            double r2 = java.lang.Math.floor(r6)
            int r4 = (int) r2
            int r4 = r4 * r21
            int r3 = r4 * 2
        L_0x0183:
            double r0 = r0 * r22
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            int r10 = r10 * r0
            int r0 = r15.capacity()
            int r0 = r0 - r3
            if (r10 <= r0) goto L_0x0193
            r10 = r0
        L_0x0193:
            r15.position(r3)
            r15.limit(r10)
            java.nio.ByteBuffer r1 = r15.slice()
            r11.release()
            r0 = 724724565(0x2b326b55, float:6.3387257E-13)
            X.0fX.A06(r9, r0)
            r0 = -814959648(0xffffffffcf6cb3e0, float:-3.97121126E9)
            X.0fX.A03(r9, r0)
            X.0qQ.A0A(r1)
            return r1
        L_0x01b0:
            r3 = 0
            goto L_0x0183
        L_0x01b2:
            java.lang.String r0 = "Null decoder"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ IllegalStateException -> 0x01b9 }
            throw r0     // Catch:{ IllegalStateException -> 0x01b9 }
        L_0x01b9:
            r2 = move-exception
            java.lang.String r1 = "Error decoder check null  "
            goto L_0x01c0
        L_0x01bd:
            r2 = move-exception
            java.lang.String r1 = "Error creating decoder "
        L_0x01c0:
            r0 = r27
            X.0KC.A0F(r0, r1, r2)
        L_0x01c5:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r26)
            X.0qQ.A07(r1)
            return r1
        L_0x01cd:
            r2 = move-exception
            java.lang.String r1 = "Error creating extractor "
            r0 = r27
            X.0KC.A0F(r0, r1, r2)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r26)
            X.0qQ.A07(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SKM.A02(java.lang.String, long, long):java.nio.ByteBuffer");
    }
}
