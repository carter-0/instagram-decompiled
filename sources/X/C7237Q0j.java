package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: X.Q0j  reason: case insensitive filesystem */
public final class C7237Q0j {
    public static final C13824Thu A0G = new Q1D();
    public long A00;
    public long A01;
    public MediaFormat A02;
    public Q0V A03;
    public Q1F A04;
    public C13824Thu A05;
    public boolean A06;
    public boolean A07;
    public long A08;
    public final Context A09;
    public final C7240Q0m A0A;
    public final List A0B;
    public final PriorityQueue A0C = new PriorityQueue(11, new C13114TLx((0sL) C7244Q0q.A00, 4));
    public final boolean A0D;
    public final UserSession A0E;
    public final File A0F;

    public final void A00() {
        try {
            C7240Q0m q0m = this.A0A;
            C7243Q0p q0p = q0m.A01;
            C13815Thi thi = q0m.A05;
            if (q0p != null) {
                MediaCodec mediaCodec = q0p.A03;
                if (182.A06(0Tu.A05, q0p.A04, 36316671497540182L)) {
                    C11292SKa.A01(mediaCodec);
                    C11292SKa.A00(mediaCodec);
                } else {
                    0fX.A06(mediaCodec, -2084989773);
                    0fX.A03(mediaCodec, 2103565012);
                }
                q0p.A01 = null;
                q0p.A02 = null;
                q0p.A00 = null;
            }
            if (q0m.A00 != null) {
                0KC.A0C("DecoderWrapper", "finish() mReusableBitmap has not be recycled.");
                Bitmap bitmap = q0m.A00;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                q0m.A00 = null;
            }
            thi.release();
        } catch (Throwable th) {
            0KC.A0G("DecoderFrameRetriever", "decoder wrapper release error", th);
            0wb.A07("decoder_wrapper_release_err", th);
        }
        try {
            Q0V q0v = this.A03;
            if (q0v != null) {
                q0v.release();
            }
            this.A03 = null;
        } catch (Throwable th2) {
            0KC.A0G("DecoderFrameRetriever", "extractor release error", th2);
            0wb.A07("extractor_release_err", th2);
        }
        this.A0C.clear();
    }

    public final void A01() {
        IllegalStateException illegalStateException;
        Long AVQ;
        Pxe.A1G();
        try {
            if (this.A03 != null) {
                int i = 0;
                if (this.A0D && (AVQ = this.A05.AVQ(this.A0B)) != null) {
                    this.A01 = AVQ.longValue();
                    i = 2;
                }
                Q0V q0v = this.A03;
                if (q0v != null) {
                    long j = this.A01;
                    if (j == 0) {
                        i = 2;
                    }
                    q0v.EL0(j, i);
                    while (true) {
                        if (this.A06 && this.A07) {
                            break;
                        }
                        A02();
                    }
                    Q1F q1f = this.A04;
                    if (q1f != null) {
                        q1f.A00.A04 = null;
                        q1f.A01.run();
                    }
                    A00();
                    return;
                }
                illegalStateException = AnonymousClass7TE.A0y();
            } else {
                illegalStateException = AnonymousClass7TE.A0y();
            }
            throw illegalStateException;
        } catch (Throwable th) {
            A00();
            throw th;
        }
    }

    public final boolean A02() {
        Q0V q0v = this.A03;
        if (q0v != null) {
            boolean z = false;
            while (!this.A06 && !z) {
                C7240Q0m q0m = this.A0A;
                C7243Q0p q0p = q0m.A01;
                if (q0p != null) {
                    try {
                        int dequeueInputBuffer = q0p.A03.dequeueInputBuffer(10000);
                        if (dequeueInputBuffer >= 0) {
                            ByteBuffer[] byteBufferArr = q0p.A01;
                            byteBufferArr.getClass();
                            C7239Q0l q0l = new C7239Q0l(dequeueInputBuffer, byteBufferArr[dequeueInputBuffer], (MediaCodec.BufferInfo) null);
                            ByteBuffer byteBuffer = (ByteBuffer) q0l.A02.get();
                            if (byteBuffer != null) {
                                int readSampleData = q0v.A00.readSampleData(byteBuffer, 0);
                                long sampleTime = q0v.A00.getSampleTime();
                                this.A08 = sampleTime;
                                long j = sampleTime - this.A01;
                                int sampleFlags = q0v.A00.getSampleFlags();
                                if (q0m.A02.Cqr() && readSampleData > 0) {
                                    long j2 = this.A08;
                                    if (j2 <= this.A00) {
                                        this.A0C.add(Long.valueOf(j2));
                                        MediaCodec.BufferInfo bufferInfo = q0l.A00;
                                        if (bufferInfo == null) {
                                            bufferInfo = new MediaCodec.BufferInfo();
                                            q0l.A00 = bufferInfo;
                                        }
                                        bufferInfo.set(0, readSampleData, j, sampleFlags);
                                        q0m.A01(q0l);
                                        q0v.AAt();
                                    }
                                }
                                MediaCodec.BufferInfo bufferInfo2 = q0l.A00;
                                if (bufferInfo2 == null) {
                                    bufferInfo2 = new MediaCodec.BufferInfo();
                                    q0l.A00 = bufferInfo2;
                                }
                                bufferInfo2.set(0, 0, 0, 4);
                                q0m.A01(q0l);
                                this.A06 = true;
                            }
                        }
                        z = true;
                    } catch (Exception e) {
                        C7243Q0p.A00(e);
                        throw AnonymousClass00P.createAndThrow();
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            if (this.A07) {
                return false;
            }
            C7240Q0m q0m2 = this.A0A;
            long A002 = q0m2.A00();
            this.A0C.remove(Long.valueOf(A002));
            this.A07 = q0m2.A03;
            if (A002 == -1) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.Q0n, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ac, code lost:
        r9.ELD(r4);
        r3.A02 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b5, code lost:
        if (r38 == false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b7, code lost:
        r4 = X.AnonymousClass7TE.A1C();
        r2 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00bd, code lost:
        if (r2 == null) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bf, code lost:
        r6 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cb, code lost:
        if (r2.A00.getSampleTime() == -1) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d5, code lost:
        if (r2.A00.getSampleTime() == r6) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d7, code lost:
        r6 = r2.A00.getSampleTime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e5, code lost:
        if ((r2.A00.getSampleFlags() & 1) <= 0) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e7, code lost:
        r4.add(java.lang.Long.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ee, code lost:
        r2.AAt();
        r2.EL0(r2.A00.getSampleTime(), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fb, code lost:
        r4 = X.0sn.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00fd, code lost:
        r3.A0B = r4;
        r4 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0101, code lost:
        if (r4 == null) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0103, code lost:
        r2 = r13.A06.A00(r4, r13.A05.getSurface(), r5, r13.A07);
        r13.A01 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r1 = r2.A03;
        X.0fX.A05(r1, 1892540199);
        r2.A01 = r1.getInputBuffers();
        r2.A02 = r1.getOutputBuffers();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0127, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r0 = X.AnonymousClass7TE.A0y();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7237Q0j(android.content.Context r23, X.C13815Thi r24, com.instagram.common.session.UserSession r25, X.C67266Ml0 r26, X.C13824Thu r27, java.io.File r28, java.util.List r29, int r30, int r31, long r32, long r34, boolean r36, boolean r37, boolean r38) {
        /*
            r22 = this;
            r0 = 13
            r1 = r26
            X.0qQ.A0B(r1, r0)
            r3 = r22
            r3.<init>()
            r0 = r23
            r3.A09 = r0
            r5 = r25
            r3.A0E = r5
            r0 = r27
            r3.A05 = r0
            r4 = r28
            r3.A0F = r4
            r0 = r32
            r3.A01 = r0
            r0 = r34
            r3.A00 = r0
            r7 = r38
            r3.A0D = r7
            X.Q0q r1 = X.C7244Q0q.A00
            r0 = 4
            X.TLx r2 = new X.TLx
            r2.<init>((X.0sL) r1, (int) r0)
            r1 = 11
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            r0.<init>(r1, r2)
            r3.A0C = r0
            long r8 = r3.A00
            r0 = 500000(0x7a120, double:2.47033E-318)
            long r8 = r8 + r0
            r3.A00 = r8
            boolean r0 = r4.exists()
            if (r0 == 0) goto L_0x0167
            long r8 = r4.length()
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0167
            X.Q0n r15 = new X.Q0n
            r15.<init>()
            X.Thu r0 = r3.A05
            X.Q0m r13 = new X.Q0m
            r21 = r37
            r14 = r24
            r20 = r36
            r17 = r29
            r18 = r30
            r19 = r31
            r16 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r3.A0A = r13
            android.net.Uri r4 = android.net.Uri.fromFile(r4)     // Catch:{ all -> 0x0155 }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = "decoder_frame_retriever"
            X.Q0V r9 = X.Q0V.A00(r0)     // Catch:{ all -> 0x0155 }
            r3.A03 = r9     // Catch:{ all -> 0x0155 }
            android.content.Context r2 = r3.A09     // Catch:{ all -> 0x0155 }
            android.media.MediaExtractor r1 = r9.A00     // Catch:{ all -> 0x0136 }
            r0 = 0
            r1.setDataSource(r2, r4, r0)     // Catch:{ all -> 0x0136 }
            android.media.MediaExtractor r0 = r9.A00     // Catch:{ all -> 0x0155 }
            int r6 = r0.getTrackCount()     // Catch:{ all -> 0x0155 }
            r4 = 0
        L_0x008b:
            if (r4 >= r6) goto L_0x0142
            android.media.MediaExtractor r0 = r9.A00     // Catch:{ all -> 0x0155 }
            android.media.MediaFormat r2 = r0.getTrackFormat(r4)     // Catch:{ all -> 0x0155 }
            X.0qQ.A07(r2)     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = "mime"
            java.lang.String r1 = r2.getString(r0)     // Catch:{ all -> 0x0155 }
            if (r1 == 0) goto L_0x00b2
            java.lang.String r0 = "video/"
            r8 = 1
            X.0qQ.A0B(r0, r8)     // Catch:{ all -> 0x0155 }
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x0155 }
            if (r0 == 0) goto L_0x00b2
            r9.ELD(r4)     // Catch:{ all -> 0x0155 }
            r3.A02 = r2     // Catch:{ all -> 0x0155 }
            goto L_0x00b5
        L_0x00b2:
            int r4 = r4 + 1
            goto L_0x008b
        L_0x00b5:
            if (r38 == 0) goto L_0x00fb
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0155 }
            X.Q0V r2 = r3.A03     // Catch:{ all -> 0x0155 }
            if (r2 == 0) goto L_0x00fd
            r11 = -1
            r6 = -1
        L_0x00c3:
            android.media.MediaExtractor r0 = r2.A00     // Catch:{ all -> 0x0155 }
            long r9 = r0.getSampleTime()     // Catch:{ all -> 0x0155 }
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x00fd
            android.media.MediaExtractor r0 = r2.A00     // Catch:{ all -> 0x0155 }
            long r9 = r0.getSampleTime()     // Catch:{ all -> 0x0155 }
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00fd
            android.media.MediaExtractor r0 = r2.A00     // Catch:{ all -> 0x0155 }
            long r6 = r0.getSampleTime()     // Catch:{ all -> 0x0155 }
            android.media.MediaExtractor r0 = r2.A00     // Catch:{ all -> 0x0155 }
            int r0 = r0.getSampleFlags()     // Catch:{ all -> 0x0155 }
            r0 = r0 & 1
            if (r0 <= 0) goto L_0x00ee
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0155 }
            r4.add(r0)     // Catch:{ all -> 0x0155 }
        L_0x00ee:
            r2.AAt()     // Catch:{ all -> 0x0155 }
            android.media.MediaExtractor r0 = r2.A00     // Catch:{ all -> 0x0155 }
            long r0 = r0.getSampleTime()     // Catch:{ all -> 0x0155 }
            r2.EL0(r0, r8)     // Catch:{ all -> 0x0155 }
            goto L_0x00c3
        L_0x00fb:
            X.0sn r4 = X.0sn.A00     // Catch:{ all -> 0x0155 }
        L_0x00fd:
            r3.A0B = r4     // Catch:{ all -> 0x0155 }
            android.media.MediaFormat r4 = r3.A02     // Catch:{ all -> 0x0155 }
            if (r4 == 0) goto L_0x0131
            X.Q0n r2 = r13.A06     // Catch:{ all -> 0x0155 }
            java.util.List r1 = r13.A07     // Catch:{ all -> 0x0155 }
            X.Thi r0 = r13.A05     // Catch:{ all -> 0x0155 }
            android.view.Surface r0 = r0.getSurface()     // Catch:{ all -> 0x0155 }
            X.Q0p r2 = r2.A00(r4, r0, r5, r1)     // Catch:{ all -> 0x0155 }
            r13.A01 = r2     // Catch:{ all -> 0x0155 }
            android.media.MediaCodec r1 = r2.A03     // Catch:{ Exception -> 0x0128 }
            r0 = 1892540199(0x70cddf27, float:5.097136E29)
            X.0fX.A05(r1, r0)     // Catch:{ Exception -> 0x0128 }
            java.nio.ByteBuffer[] r0 = r1.getInputBuffers()     // Catch:{ Exception -> 0x0128 }
            r2.A01 = r0     // Catch:{ Exception -> 0x0128 }
            java.nio.ByteBuffer[] r0 = r1.getOutputBuffers()     // Catch:{ Exception -> 0x0128 }
            r2.A02 = r0     // Catch:{ Exception -> 0x0128 }
            return
        L_0x0128:
            r0 = move-exception
            X.C7243Q0p.A00(r0)     // Catch:{ all -> 0x0155 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x0154
        L_0x0131:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x0155 }
            goto L_0x0154
        L_0x0136:
            r1 = move-exception
            X.Q0a r0 = X.Q0V.A01     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0155 }
            java.io.IOException r0 = X.Pxe.A0c(r0, r1)     // Catch:{ all -> 0x0155 }
            goto L_0x0154
        L_0x0142:
            org.json.JSONObject r0 = X.Q1M.A04(r9)     // Catch:{ all -> 0x0155 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = "No Video Track to select %s"
            java.lang.String r0 = X.0mp.A06(r0, r1)     // Catch:{ all -> 0x0155 }
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x0155 }
        L_0x0154:
            throw r0     // Catch:{ all -> 0x0155 }
        L_0x0155:
            r2 = move-exception
            java.lang.String r1 = "DecoderFrameRetriever"
            java.lang.String r0 = "decoding err "
            X.0KC.A0F(r1, r0, r2)
            r3.A00()
            java.lang.String r0 = "Failed extract frames from video"
            java.lang.RuntimeException r0 = X.Pxe.A0u(r0, r2)
            throw r0
        L_0x0167:
            java.lang.String r1 = "File is missing: "
            java.lang.String r0 = r4.getAbsolutePath()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7237Q0j.<init>(android.content.Context, X.Thi, com.instagram.common.session.UserSession, X.Ml0, X.Thu, java.io.File, java.util.List, int, int, long, long, boolean, boolean, boolean):void");
    }
}
