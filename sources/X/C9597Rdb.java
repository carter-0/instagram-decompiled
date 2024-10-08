package X;

/* renamed from: X.Rdb  reason: case insensitive filesystem */
public abstract class C9597Rdb {
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0166, code lost:
        if (r12 >= 0) goto L_0x00e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C10426Rs2 A00(com.facebook.ffmpeg.FFMpegMediaDemuxer r35, java.util.ArrayList r36, com.facebook.ffmpeg.FFMpegAVStream[] r37, com.facebook.ffmpeg.FFMpegMediaFormat[] r38, int r39) {
        /*
            r33 = 0
            r1 = 10
            com.facebook.ffmpeg.FFMpegAVStream[] r0 = new com.facebook.ffmpeg.FFMpegAVStream[r1]
            r32 = r0
            boolean[] r0 = new boolean[r1]
            r31 = r0
            r6 = 0
            r26 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r0 = 300(0x12c, double:1.48E-321)
            long r28 = java.lang.Math.max(r6, r0)
            r9 = r38
            int r8 = r9.length
            r5 = 0
            r30 = 0
            r15 = 0
        L_0x001d:
            if (r5 >= r8) goto L_0x0089
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r0.isInterrupted()
            if (r0 != 0) goto L_0x0083
            r2 = r38[r5]
            java.lang.String r1 = "track_id"
            java.util.Map r0 = r2.mMap
            int r10 = X.Pxg.A06(r1, r0)
            r0 = r37[r5]
            r32[r10] = r0
            java.lang.String r1 = "mime"
            java.util.Map r0 = r2.mMap
            java.lang.String r3 = X.DbT.A11(r1, r0)
            X.0qQ.A07(r3)
            java.lang.String r1 = "video/"
            r0 = r33
            boolean r0 = X.00l.A0d(r3, r1, r0)
            r31[r10] = r0
            java.lang.String r0 = "csd-0"
            java.nio.ByteBuffer r4 = r2.getByteBuffer(r0)
            X.0qQ.A07(r4)
            com.facebook.ffmpeg.FFMpegBufferInfo r3 = new com.facebook.ffmpeg.FFMpegBufferInfo
            r3.<init>()
            int r2 = r4.capacity()
            r1 = 2
            r0 = r33
            r3.offset = r0
            r3.size = r2
            r3.presentationTimeUs = r6
            r3.flags = r1
            r0 = r32[r10]     // Catch:{ Exception -> 0x0074 }
            if (r0 == 0) goto L_0x0080
            r0.writeFrame(r3, r4)     // Catch:{ Exception -> 0x0074 }
            goto L_0x0080
        L_0x0074:
            boolean r1 = r31[r10]
            int r0 = r30 + 1
            if (r1 != 0) goto L_0x007e
            int r15 = r15 + 1
            r0 = r30
        L_0x007e:
            r30 = r0
        L_0x0080:
            int r5 = r5 + 1
            goto L_0x001d
        L_0x0083:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x0089:
            r34 = r36
            boolean r0 = X.DbT.A1b(r34)
            if (r0 == 0) goto L_0x018e
            int r1 = X.Pxe.A0A(r34)
            r0 = r34
            java.lang.Object r0 = r0.get(r1)
            X.RQS r0 = (X.RQS) r0
            long r0 = r0.A01
            r24 = r0
        L_0x00a1:
            java.nio.ByteBuffer r23 = java.nio.ByteBuffer.allocateDirect(r39)
            r13 = 0
            r21 = -1
            r12 = 0
            r0 = 0
        L_0x00ac:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            boolean r2 = r2.isInterrupted()
            if (r2 != 0) goto L_0x01a0
            r4 = r23
            r3 = r33
            r2 = r35
            int r20 = r2.readSampleData(r4, r3)
            r3 = -1
            r2 = r20
            if (r2 == r3) goto L_0x0180
            int r19 = r35.getSampleTrackIndex()
            r2 = r32[r19]
            if (r2 == 0) goto L_0x017a
            long r10 = r35.getSampleTime()
            long r17 = r35.getSampleDuration()
            int r16 = r35.getSampleFlags()
            boolean r2 = r31[r19]
            if (r2 == 0) goto L_0x0104
            int r2 = r34.size()
            if (r12 < r2) goto L_0x0156
            r12 = 0
        L_0x00e4:
            int r2 = r34.size()
            if (r12 >= r2) goto L_0x016a
            r2 = r34
            java.lang.Object r2 = r2.get(r12)
            X.RQS r2 = (X.RQS) r2
            double r8 = r2.A00
        L_0x00f4:
            r3 = -1
            int r2 = (r21 > r3 ? 1 : (r21 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0101
            double r4 = (double) r0
            long r2 = r10 - r21
            double r2 = (double) r2
            double r2 = r2 / r8
            double r4 = r4 + r2
            long r0 = (long) r4
        L_0x0101:
            r21 = r10
            r10 = r0
        L_0x0104:
            com.facebook.ffmpeg.FFMpegBufferInfo r4 = new com.facebook.ffmpeg.FFMpegBufferInfo
            r4.<init>()
            r2 = r33
            r4.offset = r2
            r2 = r20
            r4.size = r2
            r4.presentationTimeUs = r10
            r2 = r16
            r4.flags = r2
            r3 = r32[r19]     // Catch:{ Exception -> 0x0121 }
            if (r3 == 0) goto L_0x0127
            r2 = r23
            r3.writeFrame(r4, r2)     // Catch:{ Exception -> 0x0121 }
            goto L_0x0127
        L_0x0121:
            boolean r2 = r31[r19]
            if (r2 == 0) goto L_0x0148
            int r30 = r30 + 1
        L_0x0127:
            long r10 = r10 + r17
            int r2 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x012e
            r13 = r10
        L_0x012e:
            float r8 = (float) r13
            r5 = 1065353216(0x3f800000, float:1.0)
            r2 = r24
            float r4 = (float) r2
            float r4 = r4 + r5
            float r8 = r8 / r4
            double r2 = (double) r8
            r18 = 0
            int r4 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r4 < 0) goto L_0x017a
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x017a
            int r4 = (r2 > r26 ? 1 : (r2 == r26 ? 0 : -1))
            if (r4 <= 0) goto L_0x017a
            goto L_0x014b
        L_0x0148:
            int r15 = r15 + 1
            goto L_0x0127
        L_0x014b:
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0196 }
            double r10 = r2 - r8
            int r4 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r4 < 0) goto L_0x0187
            goto L_0x016d
        L_0x0156:
            r2 = r34
            java.lang.Object r2 = r2.get(r12)
            X.RQS r2 = (X.RQS) r2
            long r2 = r2.A01
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0166
            int r12 = r12 + 1
        L_0x0166:
            if (r12 < 0) goto L_0x016a
            goto L_0x00e4
        L_0x016a:
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x00f4
        L_0x016d:
            r8 = 4532020583610935537(0x3ee4f8b588e368f1, double:1.0E-5)
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x0187
        L_0x0176:
            r26 = r2
            r6 = r16
        L_0x017a:
            boolean r2 = r35.advance()
            if (r2 != 0) goto L_0x00ac
        L_0x0180:
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
            if (r0 <= 0) goto L_0x0198
            goto L_0x0192
        L_0x0187:
            long r8 = r16 - r6
            int r4 = (r8 > r28 ? 1 : (r8 == r28 ? 0 : -1))
            if (r4 < 0) goto L_0x017a
            goto L_0x0176
        L_0x018e:
            r24 = 0
            goto L_0x00a1
        L_0x0192:
            java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0196 }
            goto L_0x0198
        L_0x0196:
            r0 = move-exception
            throw r0
        L_0x0198:
            X.Rs2 r1 = new X.Rs2
            r0 = r30
            r1.<init>(r0, r15)
            return r1
        L_0x01a0:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9597Rdb.A00(com.facebook.ffmpeg.FFMpegMediaDemuxer, java.util.ArrayList, com.facebook.ffmpeg.FFMpegAVStream[], com.facebook.ffmpeg.FFMpegMediaFormat[], int):X.Rs2");
    }
}
