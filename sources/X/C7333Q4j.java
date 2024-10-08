package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* renamed from: X.Q4j  reason: case insensitive filesystem */
public final class C7333Q4j implements C13850TiT {
    public int A00;
    public long A01;
    public long A02;
    public MediaFormat A03;
    public MediaFormat A04;
    public Map A05;
    public boolean A06;
    public int A07;
    public long A08;
    public RC3 A09;
    public SJL A0A;
    public C266714aE A0B;
    public C13850TiT A0C;
    public C13804ThT A0D;
    public C10247Rp7 A0E = new C10247Rp7();
    public C7334Q4k A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final long A0J;
    public final long A0K;
    public final long A0L;
    public final C13589TdH A0M;
    public final C10687RwR A0N;
    public final String A0O;
    public final String A0P;

    public final void AJ0(String str) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void stop() {
        try {
            A02(this, false);
            long j = this.A0L;
            long j2 = j;
            long j3 = this.A02;
            if (j3 != -1) {
                j = j3;
            }
            long j4 = this.A08;
            if (j4 != -1) {
                j = Math.min(j, j4);
            }
            A01(this.A0C, j2 - j, true);
        } finally {
            this.A06 = false;
        }
    }

    private void A00(long j) {
        String path;
        long j2;
        boolean z;
        if (this.A0G || (path = this.A0O) == null) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append(this.A0P);
            A1A.append("segmentingMuxer_");
            A1A.append(this.A07);
            A1A.append("_");
            A1A.append(System.currentTimeMillis());
            A1A.append("_");
            A1A.append(this.A0B.name());
            File createTempFile = this.A0M.createTempFile(A1A.toString(), ".mp4");
            createTempFile.getClass();
            path = createTempFile.getPath();
        }
        boolean z2 = this.A0I;
        RC3 rc3 = new RC3(path, z2);
        this.A09 = rc3;
        boolean z3 = this.A0H;
        C7334Q4k q4k = this.A0F;
        Map map = this.A05;
        String str = null;
        boolean z4 = false;
        int i = -1;
        Map map2 = null;
        if (q4k != null && ((q4k instanceof C7967QeF) || (!(q4k instanceof C7964QeC) ? (q4k instanceof C7965QeD) || (q4k instanceof C7966QeE) : 2 - ((C7964QeC) q4k).A00 == 0))) {
            i = 90000;
        }
        if (z3) {
            if (q4k == null) {
                str = "1000000";
            } else if (!(q4k instanceof C7967QeF)) {
                str = "1000000";
            }
            z4 = true;
        }
        if (map != null) {
            map2 = map;
        }
        C13850TiT AMP = this.A0D.AMP(new C10686RwQ(i, str, map2, z4));
        this.A0C = AMP;
        if (z2) {
            if (q4k instanceof C7967QeF) {
                z = true;
            } else {
                z = false;
            }
            C12345Srr srr = new C12345Srr(rc3, AMP, z);
            this.A0C = srr;
            AMP = srr;
        }
        AMP.AJ0(rc3.getPath());
        MediaFormat mediaFormat = this.A03;
        if (mediaFormat != null) {
            this.A0C.EPD(mediaFormat);
            this.A08 = j;
        }
        MediaFormat mediaFormat2 = this.A04;
        if (mediaFormat2 != null) {
            this.A0C.EqH(mediaFormat2);
            this.A0C.Eev(this.A00);
            this.A02 = j;
        }
        this.A0C.start();
        this.A07++;
        this.A01 = 0;
        C10687RwR rwR = this.A0N;
        RC3 rc32 = this.A09;
        C266714aE r5 = this.A0B;
        C7329Q4f q4f = rwR.A03;
        C13834Ti9 ti9 = q4f.A0G.A07;
        if (ti9 != null) {
            if (r5 == C266714aE.VIDEO) {
                j2 = rwR.A01 / ((long) q4f.A04);
            } else {
                C266714aE r0 = C266714aE.AUDIO;
                j2 = rwR.A00;
                if (r5 != r0) {
                    j2 += rwR.A01;
                }
            }
            ti9.DiY(rc32, j2);
        }
    }

    private void A01(C13850TiT tiT, long j, boolean z) {
        if (tiT != null) {
            C10687RwR rwR = this.A0N;
            RC3 rc3 = this.A09;
            rc3.getClass();
            C266714aE r11 = this.A0B;
            MediaFormat mediaFormat = this.A04;
            C7329Q4f q4f = rwR.A03;
            boolean z2 = z;
            q4f.A03 = z2;
            C10862RzN rzN = q4f.A0G;
            C13834Ti9 ti9 = rzN.A07;
            if (ti9 != null) {
                C7232Q0d q0d = rwR.A02;
                long j2 = q0d.A08;
                long length = rc3.length();
                int i = q0d.A05;
                int i2 = q0d.A03;
                long j3 = q0d.A06;
                C11354SOn sOn = rzN.A06;
                SJL sjl = q4f.A0C;
                S6U s6u = null;
                if (r11 == C266714aE.AUDIO) {
                    C13860Tig tig = q4f.A0E;
                    if (tig != null) {
                        s6u = tig.BPw();
                    }
                } else {
                    C13855Tia tia = q4f.A0I;
                    if (tia != null) {
                        s6u = tia.BPw();
                    }
                }
                SRW srw = new SRW(mediaFormat, s6u, sjl, sOn, r11, rc3, i, i2, j2, length, j3, j, z2);
                q4f.A0J.add(srw);
                ti9.Dia(srw);
            }
        }
    }

    public static void A02(C7333Q4j q4j, boolean z) {
        C13850TiT tiT = q4j.A0C;
        RC3 rc3 = q4j.A09;
        if (tiT != null && tiT.isStarted()) {
            try {
                tiT.stop();
                if (z && rc3 != null) {
                    rc3.delete();
                }
            } catch (RuntimeException e) {
                if (rc3 != null && rc3.exists()) {
                    rc3.A01 = true;
                    synchronized (rc3) {
                        synchronized (rc3) {
                        }
                    }
                }
                throw Pxe.A0u("Cannot stop the muxer", e);
            }
        }
    }

    public final String BVE() {
        C13850TiT tiT = this.A0C;
        if (tiT != null) {
            return tiT.BVE();
        }
        return null;
    }

    public final void EPD(MediaFormat mediaFormat) {
        this.A03 = mediaFormat;
    }

    public final void Eev(int i) {
        this.A00 = i;
    }

    public final void EqH(MediaFormat mediaFormat) {
        this.A04 = mediaFormat;
    }

    public final boolean isStarted() {
        return this.A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r3.A04 != null) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void start() {
        /*
            r3 = this;
            android.media.MediaFormat r0 = r3.A03
            r2 = 1
            if (r0 != 0) goto L_0x000a
            android.media.MediaFormat r0 = r3.A04
            r1 = 0
            if (r0 == 0) goto L_0x000b
        L_0x000a:
            r1 = 1
        L_0x000b:
            r0 = 0
            X.C266784aL.A06(r1, r0)
            r0 = -1
            r3.A00(r0)
            r3.A06 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7333Q4j.start():void");
    }

    public final void FNk(C13779Tgu tgu) {
        MediaCodec.BufferInfo AiO = tgu.AiO();
        if (this.A08 == -1) {
            this.A08 = AiO.presentationTimeUs;
        }
        C13850TiT tiT = this.A0C;
        tiT.getClass();
        tiT.FNk(tgu);
        long j = this.A01 + ((long) tgu.AiO().size);
        this.A01 = j;
        this.A0A.A02 = j;
    }

    /* JADX WARNING: type inference failed for: r4v11, types: [java.lang.Object, X.Srh] */
    public final void FOI(C13779Tgu tgu) {
        MediaCodec.BufferInfo AiO = tgu.AiO();
        if (this.A02 == -1) {
            this.A02 = AiO.presentationTimeUs;
        }
        if ((AiO.flags & 2) != 0) {
            List list = this.A0E.A00;
            ? obj = new Object();
            ByteBuffer AjB = tgu.AjB();
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(AjB.limit());
            allocateDirect.put(AjB.asReadOnlyBuffer());
            obj.A01 = allocateDirect;
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            obj.A00 = bufferInfo;
            MediaCodec.BufferInfo AiO2 = tgu.AiO();
            bufferInfo.set(AiO2.offset, AiO2.size, AiO2.presentationTimeUs, AiO2.flags);
            list.add(obj);
        }
        boolean z = true;
        if ((AiO.flags & 1) != 0) {
            long j = AiO.presentationTimeUs;
            if (j - this.A02 < this.A0K) {
                z = false;
            }
            if (this.A0L - j >= this.A0J && z) {
                A02(this, false);
                A01(this.A0C, AiO.presentationTimeUs - this.A02, false);
                A00(AiO.presentationTimeUs);
                C10247Rp7 rp7 = this.A0E;
                C13850TiT tiT = this.A0C;
                tiT.getClass();
                for (C13779Tgu FOI : rp7.A00) {
                    tiT.FOI(FOI);
                }
            }
        }
        AiO.presentationTimeUs -= this.A02;
        C13850TiT tiT2 = this.A0C;
        tiT2.getClass();
        tiT2.FOI(tgu);
        long j2 = this.A01 + ((long) AiO.size);
        this.A01 = j2;
        this.A0A.A02 = j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7333Q4j(X.C7232Q0d r9, X.SJL r10, X.C13589TdH r11, X.C266714aE r12, X.C13804ThT r13, X.C10687RwR r14, X.C7334Q4k r15, java.lang.String r16, java.lang.String r17, java.util.Map r18, long r19, long r21, long r23, boolean r25, boolean r26) {
        /*
            r8 = this;
            r6 = r18
            r8.<init>()
            r8.A0N = r14
            r8.A0M = r11
            r8.A0D = r13
            r2 = r19
            r8.A0L = r2
            r0 = r21
            r8.A0K = r0
            r4 = r23
            r8.A0J = r4
            r8.A0B = r12
            r7 = r25
            r8.A0I = r7
            r5 = r26
            r8.A0H = r5
            r8.A0A = r10
            r4 = r17
            r8.A0P = r4
            X.Rp7 r4 = new X.Rp7
            r4.<init>()
            r8.A0E = r4
            r8.A0F = r15
            if (r25 == 0) goto L_0x003b
            if (r26 != 0) goto L_0x003b
            java.lang.String r0 = "Streaming mode can be used only with fragmented files"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x003b:
            int r4 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1R(r4)
            r8.A0G = r0
            if (r18 != 0) goto L_0x0049
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()
        L_0x0049:
            r8.A05 = r6
            r0 = r16
            r8.A0O = r0
            java.lang.String r4 = "copyright"
            boolean r0 = r6.containsKey(r4)
            if (r0 != 0) goto L_0x00a0
            java.lang.String r5 = r9.A0E
            if (r5 != 0) goto L_0x0091
            java.util.HashMap r0 = r9.A0J
            if (r0 == 0) goto L_0x00a0
            java.util.Iterator r3 = X.AnonymousClass7TF.A0t(r0)
        L_0x0063:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r0 = r3.next()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.util.Iterator r2 = X.AnonymousClass7TF.A0t(r0)
        L_0x0073:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0063
            java.lang.Object r0 = r2.next()
            java.util.Iterator r1 = X.C51966G9m.A1H(r0)
        L_0x0081:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0073
            java.lang.Object r0 = r1.next()
            X.Q0d r0 = (X.C7232Q0d) r0
            java.lang.String r5 = r0.A0E
            if (r5 == 0) goto L_0x0081
        L_0x0091:
            java.lang.Integer r1 = X.C62997Kpn.A00(r5)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00a0
            r6.put(r4, r5)
        L_0x00a0:
            java.util.Map r5 = r8.A05
            java.lang.String r4 = "composer"
            boolean r0 = r5.containsKey(r4)
            if (r0 != 0) goto L_0x00f3
            java.lang.String r6 = r9.A0D
            if (r6 != 0) goto L_0x00e4
            java.util.HashMap r0 = r9.A0J
            if (r0 == 0) goto L_0x00f3
            java.util.Iterator r3 = X.AnonymousClass7TF.A0t(r0)
        L_0x00b6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r0 = r3.next()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.util.Iterator r2 = X.AnonymousClass7TF.A0t(r0)
        L_0x00c6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r0 = r2.next()
            java.util.Iterator r1 = X.C51966G9m.A1H(r0)
        L_0x00d4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c6
            java.lang.Object r0 = r1.next()
            X.Q0d r0 = (X.C7232Q0d) r0
            java.lang.String r6 = r0.A0D
            if (r6 == 0) goto L_0x00d4
        L_0x00e4:
            java.lang.Integer r1 = X.C62997Kpn.A00(r6)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00f3
            r5.put(r4, r6)
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7333Q4j.<init>(X.Q0d, X.SJL, X.TdH, X.4aE, X.ThT, X.RwR, X.Q4k, java.lang.String, java.lang.String, java.util.Map, long, long, long, boolean, boolean):void");
    }
}
