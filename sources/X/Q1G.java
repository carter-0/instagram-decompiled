package X;

import android.media.MediaFormat;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;

public final class Q1G implements C13859Tie {
    public C13858Tid A00;
    public C11354SOn A01;
    public Q17 A02;
    public final /* synthetic */ C12370SsJ A03;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r10.A0A() == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.content.Context r12, android.view.Surface r13, X.C11354SOn r14, X.C10796RyI r15, X.C7334Q4k r16) {
        /*
            r11 = this;
            r3 = 0
            X.SsJ r0 = r11.A03
            X.Rs5 r7 = r0.A00
            X.Tgw r6 = r0.A03
            com.facebook.videolite.transcoder.base.composition.MediaComposition r5 = r0.A01
            boolean r0 = r6.CK7()
            r10 = r16
            if (r0 == 0) goto L_0x0018
            boolean r1 = r10.A0A()
            r0 = 1
            if (r1 != 0) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            r7.A01 = r0
            r1 = r12
            r2 = r13
            r4 = r14
            r8 = r15
            if (r0 == 0) goto L_0x002c
            X.Ss1 r0 = new X.Ss1
            r9 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x0027:
            r11.A00 = r0
            r11.A01 = r14
            return
        L_0x002c:
            X.Q4h r0 = new X.Q4h
            r9 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q1G.A00(android.content.Context, android.view.Surface, X.SOn, X.RyI, X.Q4k):void");
    }

    public Q1G(C12370SsJ ssJ) {
        this.A03 = ssJ;
    }

    public final void A8G(MediaEffect mediaEffect, int i) {
        C13858Tid tid = this.A00;
        tid.getClass();
        tid.A8G(mediaEffect, i);
    }

    public final void AAZ(int i) {
        C13858Tid tid = this.A00;
        tid.getClass();
        tid.AAZ(i);
    }

    public final void APk(long j) {
        C13858Tid tid = this.A00;
        tid.getClass();
        tid.APk(j * 1000);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Q1b, java.lang.Object] */
    public final void AVT() {
        ? obj = new Object();
        new C7948Qdp((C7254Q1b) obj, this.A02).A00();
        C13858Tid tid = this.A00;
        if (tid != null) {
            tid.release();
        }
        obj.A01();
    }

    public final String B1O() {
        Q17 q17 = this.A02;
        q17.getClass();
        try {
            return q17.A05.getName();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int BZa() {
        C11354SOn sOn = this.A01;
        sOn.getClass();
        return (sOn.A0B + sOn.A05) % 360;
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [X.Tid] */
    /* JADX WARNING: type inference failed for: r10v3, types: [X.RQc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r20v4, types: [X.Q4h] */
    /* JADX WARNING: type inference failed for: r20v5, types: [X.Ss1] */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0145, code lost:
        if (r10.A0A() == false) goto L_0x0147;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E42(android.content.Context r34, X.C7232Q0d r35, X.C11354SOn r36, X.C9608Rdm r37, X.C7334Q4k r38, int r39) {
        /*
            r33 = this;
            X.RFa r7 = X.C8907RFa.CODEC_VIDEO_H264
            r8 = r36
            X.SJA r3 = r8.A0G
            if (r3 == 0) goto L_0x000a
            X.RFa r7 = r3.A04
        L_0x000a:
            int r15 = r8.A0C
            r2 = 2
            if (r15 <= 0) goto L_0x0184
            int r14 = r8.A0A
            if (r14 <= 0) goto L_0x0184
            r0 = 0
            r1 = 0
            r32 = 0
            r12 = 1
            r11 = 256(0x100, float:3.59E-43)
            r13 = -1
            r19 = 0
            r10 = r19
            int r28 = r8.A01()
            int r4 = r8.A03
            r21 = r4
            int r4 = r8.A02
            r20 = r4
            r6 = 6
            r5 = 7
            if (r3 == 0) goto L_0x007c
            int r12 = r3.A03
            int r11 = r3.A02
            r32 = 1
            boolean r3 = r3.A01
            if (r3 == 0) goto L_0x007c
            X.RQc r10 = new X.RQc
            r10.<init>()
            r10.A02 = r5
            r10.A01 = r6
            r10.A00 = r2
            r18 = 1
        L_0x0046:
            r9 = r33
            X.SsJ r4 = r9.A03
            com.facebook.videolite.transcoder.base.composition.MediaComposition r3 = r4.A01
            if (r3 == 0) goto L_0x007f
            X.4aE r2 = X.C266714aE.VIDEO
            java.util.HashMap r2 = r3.A07(r2)
            if (r2 == 0) goto L_0x007f
            java.util.Iterator r17 = X.AnonymousClass7TF.A0t(r2)
        L_0x005a:
            boolean r2 = r17.hasNext()
            if (r2 == 0) goto L_0x007f
            java.lang.Object r2 = r17.next()
            X.4aM r2 = (X.C266794aM) r2
            java.util.List r2 = r2.A04
            java.util.Iterator r16 = X.Pxg.A16(r2)
        L_0x006c:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x005a
            java.lang.Object r2 = r16.next()
            X.4aI r2 = (X.C266754aI) r2
            r2.A01(r0)
            goto L_0x006c
        L_0x007c:
            r18 = 0
            goto L_0x0046
        L_0x007f:
            int r2 = r8.A0D
            if (r2 == r13) goto L_0x0084
            r13 = r2
        L_0x0084:
            X.SJA r2 = r8.A0G
            if (r2 == 0) goto L_0x008c
            boolean r1 = r2.A05
            int r0 = r2.A00
        L_0x008c:
            r24 = r14
            r25 = r21
            r26 = r11
            r27 = r12
            r29 = r20
            r30 = r15
            r31 = r1
            r20 = r7
            r21 = r10
            r22 = r0
            r23 = r13
            android.media.MediaFormat r11 = X.C9604Rdi.A00(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            java.util.Map r0 = r8.A0K
            if (r0 == 0) goto L_0x00c4
            java.util.Iterator r2 = X.AnonymousClass7TF.A0u(r0)
        L_0x00ae:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c4
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r2)
            java.lang.String r1 = X.DbT.A13(r0)
            int r0 = X.C66582MXn.A08(r0)
            r11.setInteger(r1, r0)
            goto L_0x00ae
        L_0x00c4:
            java.lang.Integer r1 = X.C51967G9n.A0j()
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r1, r1)
            r2 = 1
            r10 = r38
            X.SNg r0 = r10.A0J()
            X.C11328SNg.A00(r11, r0)
            double r14 = r10.A0I()
            r12 = 0
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x00eb
            java.lang.String r13 = "i-frame-interval"
            double r0 = r10.A0I()
            float r12 = (float) r0
            r11.setFloat(r13, r12)
        L_0x00eb:
            r12 = r35
            if (r18 != 0) goto L_0x0117
            boolean r0 = r10 instanceof X.C7967QeF
            if (r0 == 0) goto L_0x0117
            r0 = r10
            X.QeF r0 = (X.C7967QeF) r0
            com.instagram.common.session.UserSession r14 = r0.A00
            X.0Tu r13 = X.0Tu.A05
            r0 = 36326970828535909(0x810f3000003865, double:3.036660856712073E-306)
            boolean r0 = X.182.A06(r13, r14, r0)
            if (r0 == 0) goto L_0x0117
            int r1 = r12.A02
            if (r1 == r6) goto L_0x0117
            if (r1 == r5) goto L_0x0117
            java.lang.String r0 = "color-transfer"
            r11.setInteger(r0, r1)
            int r1 = r12.A01
            java.lang.String r0 = "color-standard"
            r11.setInteger(r0, r1)
        L_0x0117:
            java.lang.String r5 = r7.A00
            X.RDj r1 = X.RDj.SURFACE
            java.lang.String r0 = r8.A0I
            X.Q17 r0 = X.C7257Q1f.A02(r11, r1, r10, r5, r0)
            r9.A02 = r0
            r0.A02()
            X.Rs5 r6 = r4.A00
            X.Q17 r5 = r9.A02
            java.lang.Integer r1 = r5.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x0131
            r2 = 0
        L_0x0131:
            r0 = r19
            X.C266784aL.A06(r2, r0)
            android.view.Surface r5 = r5.A06
            X.Tgw r2 = r4.A03
            boolean r0 = r2.CK7()
            if (r0 == 0) goto L_0x0147
            boolean r1 = r10.A0A()
            r0 = 1
            if (r1 != 0) goto L_0x0148
        L_0x0147:
            r0 = 0
        L_0x0148:
            r6.A01 = r0
            r21 = r34
            r29 = r37
            if (r0 == 0) goto L_0x016c
            X.Ss1 r0 = new X.Ss1
            r20 = r0
            r22 = r5
            r23 = r12
            r24 = r8
            r25 = r3
            r26 = r2
            r27 = r6
            r28 = r19
            r30 = r10
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x0167:
            r9.A00 = r0
            r9.A01 = r8
            return
        L_0x016c:
            X.Q4h r0 = new X.Q4h
            r20 = r0
            r22 = r5
            r23 = r12
            r24 = r8
            r25 = r3
            r26 = r2
            r27 = r6
            r28 = r19
            r30 = r10
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            goto L_0x0167
        L_0x0184:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            int r0 = r8.A0A
            java.lang.Object[] r1 = X.C51968G9o.A1Z(r1, r0)
            java.lang.String r0 = "Invalid dimensions: width=%d, height=%d"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            X.Qe2 r0 = new X.Qe2
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q1G.E42(android.content.Context, X.Q0d, X.SOn, X.Rdm, X.Q4k, int):void");
    }

    public final void ECi(Q1A q1a) {
        Q17 q17 = this.A02;
        q17.getClass();
        q17.A08.append("releaseOutputBuffer,");
        q17.A04(q1a, q17.A0A);
    }

    public final void EDZ(MediaEffect mediaEffect, int i) {
        C13858Tid tid = this.A00;
        tid.getClass();
        tid.EDZ(mediaEffect, i);
    }

    public final void EEo(int i) {
        this.A00.getClass();
    }

    public final void EF4(long j) {
        C13858Tid tid = this.A00;
        tid.getClass();
        tid.AQY(j * 1000);
    }

    public final void Evc() {
        Q17 q17 = this.A02;
        q17.getClass();
        C266784aL.A06(AnonymousClass7TF.A1W(q17.A07, AnonymousClass05K.A01), (String) null);
        q17.A05.signalEndOfInputStream();
    }

    public final void flush() {
        C13858Tid tid = this.A00;
        tid.getClass();
        tid.flush();
    }

    public final MediaFormat getOutputFormat() {
        Q17 q17 = this.A02;
        q17.getClass();
        return q17.A00;
    }

    public final Q1A AOj(long j) {
        try {
            Q17 q17 = this.A02;
            q17.getClass();
            return q17.A01(250000);
        } catch (Throwable th) {
            C11354SOn sOn = this.A01;
            sOn.getClass();
            throw new IllegalStateException(002.A0R("mMediaTranscodeParams.mDebugStats: ", sOn.A0I), th);
        }
    }
}
