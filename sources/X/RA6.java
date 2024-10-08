package X;

public final class RA6 extends 0ng {
    public final /* synthetic */ C8826RBc A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(10:111|112|113|114|115|116|55|56|142|139) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01bb, code lost:
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01be, code lost:
        if (r6 != -1) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01c0, code lost:
        if (r8 != -1) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c2, code lost:
        r14 = X.Pxe.A0C(r24);
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01c9, code lost:
        if (r10 <= 5) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01cf, code lost:
        if (r14 <= 300) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01d1, code lost:
        X.0KC.A0P("ScrubberRenderControllerBase", "Resetting decoder after %d ms", new java.lang.Object[]{java.lang.Long.valueOf(r14)});
        r7.A08();
        r7.A07.Eub();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r4 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        java.lang.Thread.sleep(50);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        r7.A0O = r7.A0B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        java.lang.Thread.sleep(200);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        r7.A00 = -1;
        r7.A01 = -1;
        r7.A02 = -1;
        r7.A0A = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0202, code lost:
        r24 = android.os.SystemClock.elapsedRealtime();
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0207, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0208, code lost:
        if (r19 != false) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r4 == -1) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x020c, code lost:
        android.os.SystemClock.elapsedRealtime();
        r20 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        r7.A0P = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x021c, code lost:
        r7.A07.CLS();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0221, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r0 < r8) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0008, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r0 >= r4) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r7.A02 < r0) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        r6 = r7.A0J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        if (r7.A0O != false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003b, code lost:
        if (r7.A0A == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003d, code lost:
        r4 = r7.A0L;
        r4.getClass();
        r4.flush();
        r7.A0A = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0047, code lost:
        r7.A02 = -1;
        r8 = java.lang.Math.min(r7.A05 - 200000, r0);
        r4 = r7.A0M;
        r4.getClass();
        r4.EL0(r8, 1);
        r4 = r7.A0M.A00.getSampleTime();
        r7.A00 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r4 >= r0) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006a, code lost:
        r7.A00 = 1 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006f, code lost:
        r10 = r7.A0M;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0076, code lost:
        if (r8 > 0) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0078, code lost:
        r4 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
        r10.EL0(r8, r4);
        r4 = r7.A0M.A00.getSampleTime();
        r7.A01 = r4;
        r8 = r8 - 200000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        if (r4 >= 0) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        if (r8 >= 0) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009b, code lost:
        if (java.lang.Math.abs(r0 - r20) <= 0) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009f, code lost:
        if (r0 >= 0) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a1, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a3, code lost:
        r11 = new android.media.MediaCodec.BufferInfo();
        r24 = android.os.SystemClock.elapsedRealtime();
        r23 = false;
        r22 = false;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b5, code lost:
        if (r0 != r7.A0K) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b7, code lost:
        if (r23 == false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b9, code lost:
        if (r22 != false) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bb, code lost:
        r9 = r7.A0J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bd, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c0, code lost:
        if (r7.A0O != false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c2, code lost:
        X.0KC.A0D("ScrubberRenderControllerBase", "displayThumbnailInSurfaceTexture not prepared");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c9, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ce, code lost:
        if (r23 != false) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d0, code lost:
        r6 = r7.A0L;
        r6.getClass();
        r6 = r6.dequeueInputBuffer(10000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d9, code lost:
        if (r6 < 0) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00db, code lost:
        r7.A0A = true;
        r14 = r7.A0L.getInputBuffers();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e3, code lost:
        if (r14 != null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e5, code lost:
        X.0KC.A0D("ScrubberRenderControllerBase", "No input buffers");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ed, code lost:
        r8 = r7.A0M;
        r8.getClass();
        r31 = r8.A00.readSampleData(r14[r6], 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00fa, code lost:
        if (r31 >= 0) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00fc, code lost:
        r7.A0L.queueInputBuffer(r6, 0, 0, r7.A0M.A00.getSampleTime(), 4);
        r23 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0116, code lost:
        r6 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0118, code lost:
        r7.A0L.queueInputBuffer(r6, 0, r31, r7.A0M.A00.getSampleTime(), 0);
        r7.A0M.AAt();
        r7.A0M.BpD();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0137, code lost:
        r8 = r7.A0L;
        r8.getClass();
        r8 = r8.dequeueOutputBuffer(r11, 10000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0141, code lost:
        if (r8 == -1) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0144, code lost:
        if (r8 == -3) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0147, code lost:
        if (r8 == -2) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0149, code lost:
        if (r8 >= 0) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014b, code lost:
        X.0KC.A0P("ScrubberRenderControllerBase", "dequeueOutputBuffer returned %d", new java.lang.Object[]{java.lang.Integer.valueOf(r8)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x015b, code lost:
        r7.A0A = true;
        r22 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0163, code lost:
        if ((r11.flags & 4) == 0) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0165, code lost:
        r22 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x016b, code lost:
        if (r11.presentationTimeUs <= 0) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x016d, code lost:
        r7.A02 = r11.presentationTimeUs;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0175, code lost:
        if (r7.A02 >= r0) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0177, code lost:
        if (r22 != false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0179, code lost:
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017b, code lost:
        if (r23 != false) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x017e, code lost:
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0180, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r8 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0182, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x018f, code lost:
        if ((android.os.SystemClock.elapsedRealtime() - r7.A03) <= 150) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0193, code lost:
        if (r7.A0N == false) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01a2, code lost:
        r14 = X.C51970G9q.A1T((java.lang.Math.abs(r7.A02 - r0) > java.lang.Math.abs(r7.A04 - r0) ? 1 : (java.lang.Math.abs(r7.A02 - r0) == java.lang.Math.abs(r7.A04 - r0) ? 0 : -1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r7.A0L.releaseOutputBuffer(r8, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ae, code lost:
        if (r14 == false) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01b0, code lost:
        r7.A04 = r7.A02;
        r7.A03 = android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r8 == -1) goto L_0x0030;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x01ed */
    /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x01f8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r35 = this;
            r0 = r35
            X.RBc r7 = r0.A00
            r2 = -1
            r20 = -1
        L_0x0008:
            monitor-enter(r7)
            long r0 = r7.A0K     // Catch:{ all -> 0x0222 }
            r12 = 0
            int r4 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x0219
            boolean r4 = r7.A0O     // Catch:{ all -> 0x0222 }
            if (r4 == 0) goto L_0x0219
            monitor-exit(r7)     // Catch:{ all -> 0x0222 }
            r13 = 1
            long r8 = r7.A01
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0030
            long r4 = r7.A00
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0030
            int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0030
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0030
            long r4 = r7.A02
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 < 0) goto L_0x0091
        L_0x0030:
            java.lang.Object r6 = r7.A0J
            monitor-enter(r6)
            boolean r4 = r7.A0O     // Catch:{ all -> 0x0213 }
            if (r4 != 0) goto L_0x0039
            monitor-exit(r6)     // Catch:{ all -> 0x0213 }
            goto L_0x0008
        L_0x0039:
            boolean r4 = r7.A0A     // Catch:{ all -> 0x0213 }
            if (r4 == 0) goto L_0x0047
            android.media.MediaCodec r4 = r7.A0L     // Catch:{ all -> 0x0213 }
            r4.getClass()     // Catch:{ all -> 0x0213 }
            r4.flush()     // Catch:{ all -> 0x0213 }
            r7.A0A = r12     // Catch:{ all -> 0x0213 }
        L_0x0047:
            r7.A02 = r2     // Catch:{ all -> 0x0213 }
            long r4 = r7.A05     // Catch:{ all -> 0x0213 }
            r16 = 200000(0x30d40, double:9.8813E-319)
            long r4 = r4 - r16
            long r8 = java.lang.Math.min(r4, r0)     // Catch:{ all -> 0x0213 }
            X.Q0V r4 = r7.A0M     // Catch:{ all -> 0x0213 }
            r4.getClass()     // Catch:{ all -> 0x0213 }
            r4.EL0(r8, r13)     // Catch:{ all -> 0x0213 }
            X.Q0V r4 = r7.A0M     // Catch:{ all -> 0x0213 }
            android.media.MediaExtractor r4 = r4.A00     // Catch:{ all -> 0x0213 }
            long r4 = r4.getSampleTime()     // Catch:{ all -> 0x0213 }
            r7.A00 = r4     // Catch:{ all -> 0x0213 }
            int r10 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r10 >= 0) goto L_0x006f
            r4 = 1
            long r4 = r4 + r0
            r7.A00 = r4     // Catch:{ all -> 0x0213 }
        L_0x006f:
            X.Q0V r10 = r7.A0M     // Catch:{ all -> 0x0213 }
            r14 = 0
            int r5 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            r4 = 0
            if (r5 > 0) goto L_0x0079
            r4 = 2
        L_0x0079:
            r10.EL0(r8, r4)     // Catch:{ all -> 0x0213 }
            X.Q0V r4 = r7.A0M     // Catch:{ all -> 0x0213 }
            android.media.MediaExtractor r4 = r4.A00     // Catch:{ all -> 0x0213 }
            long r4 = r4.getSampleTime()     // Catch:{ all -> 0x0213 }
            r7.A01 = r4     // Catch:{ all -> 0x0213 }
            long r8 = r8 - r16
            int r10 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r10 >= 0) goto L_0x0090
            int r4 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r4 >= 0) goto L_0x006f
        L_0x0090:
            monitor-exit(r6)     // Catch:{ all -> 0x0213 }
        L_0x0091:
            long r4 = r0 - r20
            long r5 = java.lang.Math.abs(r4)
            r26 = 0
            int r4 = (r5 > r26 ? 1 : (r5 == r26 ? 0 : -1))
            if (r4 <= 0) goto L_0x0008
            int r4 = (r0 > r26 ? 1 : (r0 == r26 ? 0 : -1))
            if (r4 >= 0) goto L_0x00a3
            r0 = 0
        L_0x00a3:
            android.media.MediaCodec$BufferInfo r11 = new android.media.MediaCodec$BufferInfo
            r11.<init>()
            long r24 = android.os.SystemClock.elapsedRealtime()
            r23 = 0
            r22 = 0
            r10 = 0
        L_0x00b1:
            long r4 = r7.A0K
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x020c
            if (r23 == 0) goto L_0x00bb
            if (r22 != 0) goto L_0x020c
        L_0x00bb:
            java.lang.Object r9 = r7.A0J
            monitor-enter(r9)
            boolean r4 = r7.A0O     // Catch:{ all -> 0x0216 }
            if (r4 != 0) goto L_0x00cc
            java.lang.String r1 = "ScrubberRenderControllerBase"
            java.lang.String r0 = "displayThumbnailInSurfaceTexture not prepared"
            X.0KC.A0D(r1, r0)     // Catch:{ all -> 0x0216 }
        L_0x00c9:
            monitor-exit(r9)     // Catch:{ all -> 0x0216 }
            goto L_0x0008
        L_0x00cc:
            r4 = 10000(0x2710, double:4.9407E-320)
            if (r23 != 0) goto L_0x0116
            android.media.MediaCodec r6 = r7.A0L     // Catch:{ all -> 0x0216 }
            r6.getClass()     // Catch:{ all -> 0x0216 }
            int r6 = r6.dequeueInputBuffer(r4)     // Catch:{ all -> 0x0216 }
            if (r6 < 0) goto L_0x0137
            r7.A0A = r13     // Catch:{ all -> 0x0216 }
            android.media.MediaCodec r8 = r7.A0L     // Catch:{ all -> 0x0216 }
            java.nio.ByteBuffer[] r14 = r8.getInputBuffers()     // Catch:{ all -> 0x0216 }
            if (r14 != 0) goto L_0x00ed
            java.lang.String r1 = "ScrubberRenderControllerBase"
            java.lang.String r0 = "No input buffers"
            X.0KC.A0D(r1, r0)     // Catch:{ all -> 0x0216 }
            goto L_0x00c9
        L_0x00ed:
            X.Q0V r8 = r7.A0M     // Catch:{ all -> 0x0216 }
            r8.getClass()     // Catch:{ all -> 0x0216 }
            r14 = r14[r6]     // Catch:{ all -> 0x0216 }
            android.media.MediaExtractor r8 = r8.A00     // Catch:{ all -> 0x0216 }
            int r31 = r8.readSampleData(r14, r12)     // Catch:{ all -> 0x0216 }
            if (r31 >= 0) goto L_0x0118
            android.media.MediaCodec r8 = r7.A0L     // Catch:{ all -> 0x0216 }
            X.Q0V r14 = r7.A0M     // Catch:{ all -> 0x0216 }
            android.media.MediaExtractor r14 = r14.A00     // Catch:{ all -> 0x0216 }
            long r32 = r14.getSampleTime()     // Catch:{ all -> 0x0216 }
            r34 = 4
            r28 = r8
            r29 = r6
            r30 = r12
            r31 = r12
            r28.queueInputBuffer(r29, r30, r31, r32, r34)     // Catch:{ all -> 0x0216 }
            r23 = 1
            goto L_0x0137
        L_0x0116:
            r6 = -1
            goto L_0x0137
        L_0x0118:
            X.Q0V r8 = r7.A0M     // Catch:{ all -> 0x0216 }
            android.media.MediaExtractor r8 = r8.A00     // Catch:{ all -> 0x0216 }
            long r32 = r8.getSampleTime()     // Catch:{ all -> 0x0216 }
            android.media.MediaCodec r8 = r7.A0L     // Catch:{ all -> 0x0216 }
            r28 = r8
            r29 = r6
            r30 = r12
            r34 = r12
            r28.queueInputBuffer(r29, r30, r31, r32, r34)     // Catch:{ all -> 0x0216 }
            X.Q0V r8 = r7.A0M     // Catch:{ all -> 0x0216 }
            r8.AAt()     // Catch:{ all -> 0x0216 }
            X.Q0V r8 = r7.A0M     // Catch:{ all -> 0x0216 }
            r8.BpD()     // Catch:{ all -> 0x0216 }
        L_0x0137:
            android.media.MediaCodec r8 = r7.A0L     // Catch:{ all -> 0x0216 }
            r8.getClass()     // Catch:{ all -> 0x0216 }
            int r8 = r8.dequeueOutputBuffer(r11, r4)     // Catch:{ all -> 0x0216 }
            r4 = -1
            if (r8 == r4) goto L_0x01bb
            r4 = -3
            if (r8 == r4) goto L_0x01bb
            r4 = -2
            if (r8 == r4) goto L_0x01bb
            if (r8 >= 0) goto L_0x015b
            java.lang.String r14 = "ScrubberRenderControllerBase"
            java.lang.String r5 = "dequeueOutputBuffer returned %d"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0216 }
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch:{ all -> 0x0216 }
            X.0KC.A0P(r14, r5, r4)     // Catch:{ all -> 0x0216 }
            goto L_0x01bb
        L_0x015b:
            r7.A0A = r13     // Catch:{ all -> 0x0216 }
            int r4 = r11.flags     // Catch:{ all -> 0x0216 }
            r4 = r4 & 4
            r22 = 0
            if (r4 == 0) goto L_0x016d
            r22 = 1
            long r4 = r11.presentationTimeUs     // Catch:{ all -> 0x0216 }
            int r14 = (r4 > r26 ? 1 : (r4 == r26 ? 0 : -1))
            if (r14 <= 0) goto L_0x0171
        L_0x016d:
            long r4 = r11.presentationTimeUs     // Catch:{ all -> 0x0216 }
            r7.A02 = r4     // Catch:{ all -> 0x0216 }
        L_0x0171:
            long r4 = r7.A02     // Catch:{ all -> 0x0216 }
            int r14 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r14 >= 0) goto L_0x017e
            if (r22 != 0) goto L_0x017e
            r19 = 0
            if (r23 != 0) goto L_0x0180
            goto L_0x0182
        L_0x017e:
            r19 = 1
        L_0x0180:
            r14 = 1
            goto L_0x01a9
        L_0x0182:
            long r17 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0216 }
            r14 = 0
            long r4 = r7.A03     // Catch:{ all -> 0x0216 }
            long r17 = r17 - r4
            r15 = 150(0x96, double:7.4E-322)
            int r4 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r4 <= 0) goto L_0x01a9
            boolean r4 = r7.A0N     // Catch:{ all -> 0x0216 }
            if (r4 == 0) goto L_0x01a9
            long r4 = r7.A02     // Catch:{ all -> 0x0216 }
            long r4 = r4 - r0
            long r16 = java.lang.Math.abs(r4)     // Catch:{ all -> 0x0216 }
            long r4 = r7.A04     // Catch:{ all -> 0x0216 }
            long r4 = r4 - r0
            long r14 = java.lang.Math.abs(r4)     // Catch:{ all -> 0x0216 }
            int r4 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            boolean r14 = X.C51970G9q.A1T(r4)
        L_0x01a9:
            android.media.MediaCodec r4 = r7.A0L     // Catch:{ all -> 0x0216 }
            r4.releaseOutputBuffer(r8, r14)     // Catch:{ all -> 0x0216 }
            if (r14 == 0) goto L_0x01bd
            long r4 = r7.A02     // Catch:{ all -> 0x0216 }
            r7.A04 = r4     // Catch:{ all -> 0x0216 }
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0216 }
            r7.A03 = r4     // Catch:{ all -> 0x0216 }
            goto L_0x01bd
        L_0x01bb:
            r19 = 0
        L_0x01bd:
            r4 = -1
            if (r6 != r4) goto L_0x0202
            if (r8 != r4) goto L_0x0202
            long r14 = X.Pxe.A0C(r24)     // Catch:{ all -> 0x0216 }
            int r10 = r10 + 1
            r4 = 5
            if (r10 <= r4) goto L_0x0207
            r5 = 300(0x12c, double:1.48E-321)
            int r4 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0207
            java.lang.String r4 = "ScrubberRenderControllerBase"
            java.lang.String r1 = "Resetting decoder after %d ms"
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0216 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0216 }
            X.0KC.A0P(r4, r1, r0)     // Catch:{ all -> 0x0216 }
            r7.A08()     // Catch:{ all -> 0x0216 }
            X.Thv r0 = r7.A07     // Catch:{ all -> 0x0216 }
            r0.Eub()     // Catch:{ all -> 0x0216 }
            r0 = 50
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x01ed }
        L_0x01ed:
            boolean r0 = r7.A0B()     // Catch:{ all -> 0x0216 }
            r7.A0O = r0     // Catch:{ all -> 0x0216 }
            r0 = 200(0xc8, double:9.9E-322)
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x01f8 }
        L_0x01f8:
            r7.A00 = r2     // Catch:{ all -> 0x0216 }
            r7.A01 = r2     // Catch:{ all -> 0x0216 }
            r7.A02 = r2     // Catch:{ all -> 0x0216 }
            r7.A0A = r12     // Catch:{ all -> 0x0216 }
            goto L_0x00c9
        L_0x0202:
            long r24 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0216 }
            r10 = 0
        L_0x0207:
            monitor-exit(r9)     // Catch:{ all -> 0x0216 }
            if (r19 != 0) goto L_0x020c
            goto L_0x00b1
        L_0x020c:
            android.os.SystemClock.elapsedRealtime()
            r20 = r0
            goto L_0x0008
        L_0x0213:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0213 }
            throw r0
        L_0x0216:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0216 }
            throw r0
        L_0x0219:
            r7.A0P = r12     // Catch:{ all -> 0x0222 }
            monitor-exit(r7)     // Catch:{ all -> 0x0222 }
            X.Thv r0 = r7.A07
            r0.CLS()
            return
        L_0x0222:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0222 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RA6.run():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RA6(C8826RBc rBc) {
        super(674356664);
        this.A00 = rBc;
    }
}
