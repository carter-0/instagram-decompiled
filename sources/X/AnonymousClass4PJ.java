package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4PJ  reason: invalid class name */
public abstract class AnonymousClass4PJ extends AnonymousClass4PK {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public MediaFormat A07;
    public C256683wB A08;
    public C266094Xn A09;
    public C290325f8 A0A;
    public C251403n3 A0B;
    public 2Km A0C;
    public AnonymousClass4UG A0D;
    public AnonymousClass4PW A0E;
    public ByteBuffer A0F;
    public ArrayDeque A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K = false;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O = false;
    public boolean A0P;
    public boolean A0Q;
    public long A0R;
    public C290325f8 A0S;
    public String A0T;
    public boolean A0U;
    public final MediaCodec.BufferInfo A0V;
    public final AnonymousClass4PH A0W;
    public final AnonymousClass2SB A0X;
    public final AnonymousClass4PO A0Y;
    public final AnonymousClass4PQ A0Z;
    public final C256823wP A0a;
    public final List A0b;
    public final boolean A0c;
    public final AnonymousClass4PQ A0d;
    public final C265114Sp A0e;
    public final ArrayDeque A0f;
    public final boolean A0g;
    public final boolean A0h;

    private void A0A() {
        this.A02 = -1;
        this.A0Z.A02 = null;
    }

    public void A0I() {
        throw AnonymousClass00P.createAndThrow();
    }

    public void A0K() {
        this.A08 = null;
        this.A0E = AnonymousClass4PW.A01;
        this.A0f.clear();
        this.A0G = null;
        try {
            A0R();
            try {
                C290325f8 r0 = this.A0A;
                if (r0 != null) {
                    r0.ECN((C265184Sw) null);
                }
                try {
                    C290325f8 r1 = this.A0S;
                    if (!(r1 == null || r1 == this.A0A)) {
                        r1.ECN((C265184Sw) null);
                    }
                } finally {
                    this.A0A = null;
                    this.A0S = null;
                }
            } catch (Throwable th) {
                C290325f8 r12 = this.A0S;
                if (!(r12 == null || r12 == this.A0A)) {
                    r12.ECN((C265184Sw) null);
                }
                throw th;
            } finally {
                this.A0A = null;
                this.A0S = null;
            }
        } catch (Throwable th2) {
            try {
                C290325f8 r13 = this.A0S;
                if (!(r13 == null || r13 == this.A0A)) {
                    r13.ECN((C265184Sw) null);
                }
                throw th2;
            } finally {
                this.A0A = null;
                this.A0S = null;
            }
        } finally {
        }
    }

    public void A0L(long j, boolean z) {
        this.A0I = false;
        this.A0L = false;
        if (this.A0B != null) {
            A0Q();
        }
        synchronized (this.A0E.A00) {
        }
        this.A0E.A00.A00();
        this.A0f.clear();
    }

    public void A0N(C256683wB[] r1, long j, long j2) {
    }

    public void A0T(long j) {
    }

    public void A0U(C256683wB r10) {
        DrmInitData drmInitData;
        int i;
        int A002;
        boolean z = this instanceof AnonymousClass4PI;
        if (z) {
            AnonymousClass4PI r2 = (AnonymousClass4PI) this;
            if (r2.A0W(r10) || ((A002 = 2BY.A00(2Bb.A07)) > 0 && r10 != null && r10.A0L > A002)) {
                r2.A0f.A02 = false;
            }
        }
        C256683wB r5 = this.A08;
        this.A08 = r10;
        DrmInitData drmInitData2 = r10.A0O;
        if (r5 == null) {
            drmInitData = null;
        } else {
            drmInitData = r5.A0O;
        }
        if (!Util.A0I(drmInitData2, drmInitData)) {
            C256683wB r4 = this.A08;
            if (r4.A0O != null) {
                C265114Sp r0 = this.A0e;
                if (r0 != null) {
                    C290325f8 A7H = r0.A7H(r4, (C265184Sw) null);
                    this.A0S = A7H;
                    if (A7H == this.A0A) {
                        A7H.ECN((C265184Sw) null);
                    }
                } else {
                    throw A0F(r4, new IllegalStateException("Media requires a DrmSessionManager"), 4005, false);
                }
            } else {
                this.A0S = null;
            }
        }
        if (this.A0S == this.A0A && this.A0B != null) {
            2Km r6 = this.A0C;
            C256683wB r42 = this.A08;
            if (z) {
                AnonymousClass4PI r7 = (AnonymousClass4PI) this;
                if (r7.A0W(r7.A08) && r5.A0W.equals(r42.A0W) && r5.A0F == r42.A0F) {
                    return;
                }
                if (AnonymousClass4PI.A06(r5, r42, r6.A04)) {
                    int i2 = r42.A0L;
                    AnonymousClass4YT r62 = r7.A0P;
                    if (i2 <= r62.A02 && r42.A0A <= r62.A00 && AnonymousClass4PI.A00(r42) <= r7.A0P.A01) {
                        if (!r5.A00(r42)) {
                            this.A0U = true;
                            this.A00 = 1;
                            return;
                        }
                        return;
                    }
                }
            } else {
                C264364Pp r72 = (C264364Pp) this;
                if (r72.A0X.A0B && r42.A0B <= r72.A00 && (((i = r6.A05(r5, r42).A01) == 2 || i == 3) && r5.A08 == 0 && r5.A09 == 0 && r42.A08 == 0 && r42.A09 == 0)) {
                    return;
                }
            }
        }
        this.A0G = null;
        if (this.A0H) {
            this.A01 = 1;
            return;
        }
        A0R();
        A0S();
    }

    public abstract void A0V(AnonymousClass4PQ r1);

    public final boolean A0W(C256683wB r4) {
        return r4 != null && this.A0O && "video/av01".equalsIgnoreCase(r4.A0W);
    }

    private void A09() {
        if (this.A01 == 2) {
            A0R();
            A0S();
            return;
        }
        this.A0L = true;
        A0P();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ae, code lost:
        if (r3.A0A == -1) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x021c, code lost:
        if ("audio/raw".equals(r11.A0W) != false) goto L_0x021e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02a1 A[Catch:{ Exception -> 0x0301 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0B(android.media.MediaCrypto r32, X.2Km r33) {
        /*
            r31 = this;
            r6 = r33
            java.lang.String r5 = r6.A03
            r23 = 0
            r7 = r31
            boolean r3 = r7.A0h     // Catch:{ Exception -> 0x0301 }
            if (r3 == 0) goto L_0x0024
            X.3wB r2 = r7.A08     // Catch:{ Exception -> 0x0301 }
            r1 = r7
            boolean r4 = r7 instanceof X.AnonymousClass4PI     // Catch:{ Exception -> 0x0301 }
            if (r4 == 0) goto L_0x001f
            X.4PI r1 = (X.AnonymousClass4PI) r1     // Catch:{ Exception -> 0x0301 }
            X.4Pl r0 = r1.A0i     // Catch:{ Exception -> 0x0301 }
            r0.A02(r5)     // Catch:{ Exception -> 0x0301 }
            X.4Pm r0 = r1.A0f     // Catch:{ Exception -> 0x0301 }
            r0.A00(r2)     // Catch:{ Exception -> 0x0301 }
        L_0x001f:
            long r16 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0301 }
            goto L_0x0033
        L_0x0024:
            X.3wB r1 = r7.A08     // Catch:{ Exception -> 0x0301 }
            r0 = r7
            boolean r4 = r7 instanceof X.AnonymousClass4PI     // Catch:{ Exception -> 0x0301 }
            if (r4 == 0) goto L_0x001f
            X.4PI r0 = (X.AnonymousClass4PI) r0     // Catch:{ Exception -> 0x0301 }
            X.4Pm r0 = r0.A0f     // Catch:{ Exception -> 0x0301 }
            r0.A00(r1)     // Catch:{ Exception -> 0x0301 }
            goto L_0x001f
        L_0x0033:
            if (r3 != 0) goto L_0x004f
            r0 = r7
            if (r4 == 0) goto L_0x0039
            goto L_0x0048
        L_0x0039:
            X.4Pp r0 = (X.C264364Pp) r0     // Catch:{ Exception -> 0x0301 }
            X.4QF r2 = r0.A09     // Catch:{ Exception -> 0x0301 }
            android.os.Handler r1 = r2.A00     // Catch:{ Exception -> 0x0301 }
            X.5q4 r0 = new X.5q4     // Catch:{ Exception -> 0x0301 }
            r0.<init>(r2, r5)     // Catch:{ Exception -> 0x0301 }
            r1.post(r0)     // Catch:{ Exception -> 0x0301 }
            goto L_0x004f
        L_0x0048:
            X.4PI r0 = (X.AnonymousClass4PI) r0     // Catch:{ Exception -> 0x0301 }
            X.4Pl r0 = r0.A0i     // Catch:{ Exception -> 0x0301 }
            r0.A02(r5)     // Catch:{ Exception -> 0x0301 }
        L_0x004f:
            java.lang.String r0 = "createCodec:"
            java.lang.String r0 = X.002.A0R(r0, r5)     // Catch:{ Exception -> 0x0301 }
            X.27d.A01(r0)     // Catch:{ Exception -> 0x0301 }
            X.2SC r8 = X.2SC.A05     // Catch:{ Exception -> 0x0301 }
            if (r4 == 0) goto L_0x005e
            r13 = 1
            goto L_0x005f
        L_0x005e:
            r13 = 0
        L_0x005f:
            X.2SB r1 = r7.A0X     // Catch:{ Exception -> 0x0301 }
            X.4PH r0 = r7.A0W     // Catch:{ Exception -> 0x0301 }
            X.27F r0 = r0.A00     // Catch:{ Exception -> 0x0301 }
            java.lang.Integer r11 = X.AnonymousClass05K.A01     // Catch:{ Exception -> 0x0301 }
            r9 = r0
            r10 = r1
            r12 = r5
            X.3n3 r23 = r8.A01(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0301 }
            r7.A0T = r5     // Catch:{ Exception -> 0x0301 }
            X.27d.A00()     // Catch:{ Exception -> 0x0301 }
            java.lang.String r0 = "configureCodec"
            X.27d.A01(r0)     // Catch:{ Exception -> 0x0301 }
            X.3wB r11 = r7.A08     // Catch:{ Exception -> 0x0301 }
            r26 = r32
            if (r4 == 0) goto L_0x01ff
            r12 = r7
            X.4PI r12 = (X.AnonymousClass4PI) r12     // Catch:{ Exception -> 0x0301 }
            X.3wB[] r15 = r12.A08     // Catch:{ Exception -> 0x0301 }
            r15.getClass()     // Catch:{ Exception -> 0x0301 }
            int r10 = r11.A0L     // Catch:{ Exception -> 0x0301 }
            r30 = r10
            int r9 = r11.A0A     // Catch:{ Exception -> 0x0301 }
            r29 = r9
            int r8 = X.AnonymousClass4PI.A00(r11)     // Catch:{ Exception -> 0x0301 }
            int r14 = r15.length     // Catch:{ Exception -> 0x0301 }
            r0 = 1
            if (r14 == r0) goto L_0x0130
            r13 = 0
            r19 = 0
        L_0x0099:
            if (r13 >= r14) goto L_0x00c9
            r3 = r15[r13]     // Catch:{ Exception -> 0x0301 }
            boolean r0 = r6.A04     // Catch:{ Exception -> 0x0301 }
            boolean r0 = X.AnonymousClass4PI.A06(r11, r3, r0)     // Catch:{ Exception -> 0x0301 }
            if (r0 == 0) goto L_0x00c6
            int r2 = r3.A0L     // Catch:{ Exception -> 0x0301 }
            r1 = -1
            if (r2 == r1) goto L_0x00b0
            int r0 = r3.A0A     // Catch:{ Exception -> 0x0301 }
            r18 = 0
            if (r0 != r1) goto L_0x00b2
        L_0x00b0:
            r18 = 1
        L_0x00b2:
            r19 = r19 | r18
            int r10 = java.lang.Math.max(r10, r2)     // Catch:{ Exception -> 0x0301 }
            int r0 = r3.A0A     // Catch:{ Exception -> 0x0301 }
            int r9 = java.lang.Math.max(r9, r0)     // Catch:{ Exception -> 0x0301 }
            int r0 = X.AnonymousClass4PI.A00(r3)     // Catch:{ Exception -> 0x0301 }
            int r8 = java.lang.Math.max(r8, r0)     // Catch:{ Exception -> 0x0301 }
        L_0x00c6:
            int r13 = r13 + 1
            goto L_0x0099
        L_0x00c9:
            if (r19 == 0) goto L_0x0130
            r0 = 1361(0x551, float:1.907E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)     // Catch:{ Exception -> 0x0301 }
            java.lang.String r22 = "x"
            r0 = r22
            java.lang.String r1 = X.002.A02(r10, r9, r1, r0)     // Catch:{ Exception -> 0x0301 }
            java.lang.String r21 = "MediaCodecVideoRenderer"
            r0 = r21
            X.2AG.A04(r0, r1)     // Catch:{ Exception -> 0x0301 }
            r28 = r30
            r3 = 0
            r20 = 0
            r27 = r29
            r1 = r29
            r0 = r30
            if (r1 <= r0) goto L_0x01c7
            r20 = 1
            r28 = r1
            r27 = r0
            goto L_0x01c7
        L_0x00f5:
            android.graphics.Point r2 = r6.A04(r0, r2)     // Catch:{ Exception -> 0x0301 }
            float r0 = r11.A01     // Catch:{ Exception -> 0x0301 }
            r1 = r0
            int r0 = r2.x     // Catch:{ Exception -> 0x0301 }
            r14 = r0
            int r0 = r2.y     // Catch:{ Exception -> 0x0301 }
            r13 = r0
            double r0 = (double) r1     // Catch:{ Exception -> 0x0301 }
            boolean r0 = r6.A08(r14, r13, r0)     // Catch:{ Exception -> 0x0301 }
            if (r0 == 0) goto L_0x01c0
            int r0 = r2.x     // Catch:{ Exception -> 0x0301 }
            int r10 = java.lang.Math.max(r10, r0)     // Catch:{ Exception -> 0x0301 }
            int r0 = r2.y     // Catch:{ Exception -> 0x0301 }
            int r9 = java.lang.Math.max(r9, r0)     // Catch:{ Exception -> 0x0301 }
            java.lang.String r0 = r11.A0W     // Catch:{ Exception -> 0x0301 }
            int r0 = X.AnonymousClass4PI.A02(r0, r10, r9)     // Catch:{ Exception -> 0x0301 }
            int r8 = java.lang.Math.max(r8, r0)     // Catch:{ Exception -> 0x0301 }
            r0 = 1219(0x4c3, float:1.708E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)     // Catch:{ Exception -> 0x0301 }
            r0 = r22
            java.lang.String r1 = X.002.A02(r10, r9, r1, r0)     // Catch:{ Exception -> 0x0301 }
            r0 = r21
            X.2AG.A04(r0, r1)     // Catch:{ Exception -> 0x0301 }
        L_0x0130:
            X.4YT r1 = new X.4YT     // Catch:{ Exception -> 0x0301 }
            r1.<init>(r10, r9, r8)     // Catch:{ Exception -> 0x0301 }
            r12.A0P = r1     // Catch:{ Exception -> 0x0301 }
            android.media.MediaFormat r2 = new android.media.MediaFormat     // Catch:{ Exception -> 0x0301 }
            r2.<init>()     // Catch:{ Exception -> 0x0301 }
            java.lang.String r3 = r11.A0W     // Catch:{ Exception -> 0x0301 }
            java.lang.String r0 = "mime"
            r2.setString(r0, r3)     // Catch:{ Exception -> 0x0301 }
            java.lang.String r3 = "width"
            r0 = r30
            r2.setInteger(r3, r0)     // Catch:{ Exception -> 0x0301 }
            java.lang.String r3 = "height"
            r0 = r29
            r2.setInteger(r3, r0)     // Catch:{ Exception -> 0x0301 }
            java.util.List r0 = r11.A0X     // Catch:{ Exception -> 0x0301 }
            X.AnonymousClass4YU.A02(r2, r0)     // Catch:{ Exception -> 0x0301 }
            float r8 = r11.A01     // Catch:{ Exception -> 0x0301 }
            java.lang.String r3 = "frame-rate"
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0163
            r2.setFloat(r3, r8)     // Catch:{ Exception -> 0x0301 }
        L_0x0163:
            int r3 = r11.A0F     // Catch:{ Exception -> 0x0301 }
            java.lang.String r0 = "rotation-degrees"
            r8 = -1
            if (r3 == r8) goto L_0x016d
            r2.setInteger(r0, r3)     // Catch:{ Exception -> 0x0301 }
        L_0x016d:
            com.google.android.exoplayer2.video.ColorInfo r0 = r11.A0Q     // Catch:{ Exception -> 0x0301 }
            X.AnonymousClass4YU.A01(r2, r0)     // Catch:{ Exception -> 0x0301 }
            int r3 = r1.A02     // Catch:{ Exception -> 0x0301 }
            java.lang.String r0 = "max-width"
            r2.setInteger(r0, r3)     // Catch:{ Exception -> 0x0301 }
            int r3 = r1.A00     // Catch:{ Exception -> 0x0301 }
            java.lang.String r0 = "max-height"
            r2.setInteger(r0, r3)     // Catch:{ Exception -> 0x0301 }
            int r1 = r1.A01     // Catch:{ Exception -> 0x0301 }
            java.lang.String r0 = "max-input-size"
            if (r1 == r8) goto L_0x0189
            r2.setInteger(r0, r1)     // Catch:{ Exception -> 0x0301 }
        L_0x0189:
            int r9 = com.google.android.exoplayer2.util.Util.A00     // Catch:{ Exception -> 0x0301 }
            r3 = 0
            java.lang.String r0 = "priority"
            r2.setInteger(r0, r3)     // Catch:{ Exception -> 0x0301 }
            android.view.Surface r0 = r12.A0O     // Catch:{ Exception -> 0x0301 }
            if (r0 != 0) goto L_0x01aa
            boolean r0 = X.AnonymousClass4PI.A07(r6, r12)     // Catch:{ Exception -> 0x0301 }
            X.C256703wD.A04(r0)     // Catch:{ Exception -> 0x0301 }
            android.view.Surface r0 = r12.A0N     // Catch:{ Exception -> 0x0301 }
            if (r0 != 0) goto L_0x01a8
            boolean r0 = r6.A06     // Catch:{ Exception -> 0x0301 }
            com.google.android.exoplayer2.video.DummySurface r0 = com.google.android.exoplayer2.video.DummySurface.A00(r0)     // Catch:{ Exception -> 0x0301 }
            r12.A0N = r0     // Catch:{ Exception -> 0x0301 }
        L_0x01a8:
            r12.A0O = r0     // Catch:{ Exception -> 0x0301 }
        L_0x01aa:
            X.2SB r10 = r12.A0X     // Catch:{ Exception -> 0x0301 }
            boolean r0 = r10.A08     // Catch:{ Exception -> 0x0301 }
            r13 = 0
            java.lang.String r8 = "low-latency"
            r1 = 1
            if (r0 == 0) goto L_0x01e7
            android.media.MediaCodecInfo$CodecCapabilities r0 = r6.A00     // Catch:{ Exception -> 0x0301 }
            if (r0 == 0) goto L_0x01e7
            boolean r0 = r0.isFeatureSupported(r8)     // Catch:{ Exception -> 0x0301 }
            r11 = 1
            if (r0 != 0) goto L_0x01e8
            goto L_0x01e7
        L_0x01c0:
            int r3 = r3 + 1
            r0 = r18
            if (r3 >= r0) goto L_0x0130
            goto L_0x01d2
        L_0x01c7:
            r0 = r27
            float r15 = (float) r0     // Catch:{ Exception -> 0x0301 }
            r0 = r28
            float r0 = (float) r0     // Catch:{ Exception -> 0x0301 }
            float r15 = r15 / r0
            int[] r19 = X.AnonymousClass4PI.A0o     // Catch:{ Exception -> 0x0301 }
            r18 = 9
        L_0x01d2:
            r2 = r19[r3]     // Catch:{ Exception -> 0x0301 }
            float r0 = (float) r2     // Catch:{ Exception -> 0x0301 }
            float r0 = r0 * r15
            int r0 = (int) r0     // Catch:{ Exception -> 0x0301 }
            r13 = r0
            r0 = r28
            if (r2 <= r0) goto L_0x0130
            r1 = r27
            r0 = r13
            if (r13 <= r1) goto L_0x0130
            if (r20 != 0) goto L_0x00f5
            r0 = r2
            r2 = r13
            goto L_0x00f5
        L_0x01e7:
            r11 = 0
        L_0x01e8:
            java.lang.String r0 = "c2.android.av1-dav1d.decoder"
            boolean r0 = r5.equals(r0)     // Catch:{ Exception -> 0x0301 }
            if (r0 == 0) goto L_0x01f5
            boolean r0 = r10.A04     // Catch:{ Exception -> 0x0301 }
            if (r0 == 0) goto L_0x01f5
            r13 = 1
        L_0x01f5:
            r0 = 30
            if (r9 < r0) goto L_0x028e
            if (r11 == 0) goto L_0x028e
            if (r13 != 0) goto L_0x028e
            goto L_0x0288
        L_0x01ff:
            r8 = r7
            X.4Pp r8 = (X.C264364Pp) r8     // Catch:{ Exception -> 0x0301 }
            X.3wB[] r0 = r8.A08     // Catch:{ Exception -> 0x0301 }
            r0.getClass()     // Catch:{ Exception -> 0x0301 }
            int r9 = r11.A0B     // Catch:{ Exception -> 0x0301 }
            r8.A00 = r9     // Catch:{ Exception -> 0x0301 }
            java.lang.String r0 = r6.A02     // Catch:{ Exception -> 0x0301 }
            java.lang.String r1 = "audio/raw"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0301 }
            if (r0 == 0) goto L_0x021e
            java.lang.String r0 = r11.A0W     // Catch:{ Exception -> 0x0301 }
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x0301 }
            r0 = 1
            if (r1 == 0) goto L_0x021f
        L_0x021e:
            r0 = 0
        L_0x021f:
            r8.A05 = r0     // Catch:{ Exception -> 0x0301 }
            java.lang.String r0 = r6.A01     // Catch:{ Exception -> 0x0301 }
            android.media.MediaFormat r3 = new android.media.MediaFormat     // Catch:{ Exception -> 0x0301 }
            r3.<init>()     // Catch:{ Exception -> 0x0301 }
            java.lang.String r2 = "mime"
            r3.setString(r2, r0)     // Catch:{ Exception -> 0x0301 }
            int r1 = r11.A06     // Catch:{ Exception -> 0x0301 }
            java.lang.String r0 = "channel-count"
            r3.setInteger(r0, r1)     // Catch:{ Exception -> 0x0301 }
            int r1 = r11.A0G     // Catch:{ Exception -> 0x0301 }
            java.lang.String r0 = "sample-rate"
            r3.setInteger(r0, r1)     // Catch:{ Exception -> 0x0301 }
            java.util.List r0 = r11.A0X     // Catch:{ Exception -> 0x0301 }
            X.AnonymousClass4YU.A02(r3, r0)     // Catch:{ Exception -> 0x0301 }
            java.lang.String r1 = "max-input-size"
            r0 = -1
            if (r9 == r0) goto L_0x0248
            r3.setInteger(r1, r9)     // Catch:{ Exception -> 0x0301 }
        L_0x0248:
            r1 = 0
            java.lang.String r0 = "priority"
            r3.setInteger(r0, r1)     // Catch:{ Exception -> 0x0301 }
            java.lang.String r1 = r11.A0R     // Catch:{ Exception -> 0x0301 }
            if (r1 == 0) goto L_0x026d
            java.lang.String r0 = "mp4a.40.42"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0301 }
            if (r0 == 0) goto L_0x026d
            X.2SB r9 = r8.A0X     // Catch:{ Exception -> 0x0301 }
            boolean r0 = r9.A07     // Catch:{ Exception -> 0x0301 }
            if (r0 == 0) goto L_0x026d
            r1 = 3
            java.lang.String r0 = "aac-drc-effect-type"
            r3.setInteger(r0, r1)     // Catch:{ Exception -> 0x0301 }
            int r1 = r9.A03     // Catch:{ Exception -> 0x0301 }
            java.lang.String r0 = "aac-target-ref-level"
            r3.setInteger(r0, r1)     // Catch:{ Exception -> 0x0301 }
        L_0x026d:
            r1 = 0
            r27 = 0
            r24 = r3
            r25 = r1
            r28 = r1
            r23.configure(r24, r25, r26, r27, r28)     // Catch:{ Exception -> 0x0301 }
            boolean r0 = r8.A05     // Catch:{ Exception -> 0x0301 }
            if (r0 == 0) goto L_0x0285
            r8.A01 = r3     // Catch:{ Exception -> 0x0301 }
            java.lang.String r0 = r11.A0W     // Catch:{ Exception -> 0x0301 }
            r3.setString(r2, r0)     // Catch:{ Exception -> 0x0301 }
            goto L_0x02aa
        L_0x0285:
            r8.A01 = r1     // Catch:{ Exception -> 0x0301 }
            goto L_0x02aa
        L_0x0288:
            r2.setFeatureEnabled(r8, r1)     // Catch:{ Exception -> 0x0301 }
            r2.setInteger(r8, r1)     // Catch:{ Exception -> 0x0301 }
        L_0x028e:
            android.view.Surface r1 = r12.A0O     // Catch:{ Exception -> 0x0301 }
            java.lang.Object r0 = r12.A0S     // Catch:{ Exception -> 0x0301 }
            r24 = r2
            r25 = r1
            r27 = r3
            r28 = r0
            r23.configure(r24, r25, r26, r27, r28)     // Catch:{ Exception -> 0x0301 }
            boolean r0 = r12.A0a     // Catch:{ Exception -> 0x0301 }
            if (r0 == 0) goto L_0x02aa
            X.5py r1 = new X.5py     // Catch:{ Exception -> 0x0301 }
            r0 = r23
            r1.<init>(r0, r12)     // Catch:{ Exception -> 0x0301 }
            r12.A0Q = r1     // Catch:{ Exception -> 0x0301 }
        L_0x02aa:
            X.27d.A00()     // Catch:{ Exception -> 0x0301 }
            java.lang.String r0 = "startCodec"
            X.27d.A01(r0)     // Catch:{ Exception -> 0x0301 }
            r23.start()     // Catch:{ Exception -> 0x0301 }
            X.27d.A00()     // Catch:{ Exception -> 0x0301 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0301 }
            r2 = r23
            r7.A0B = r2
            r7.A0C = r6
            long r0 = r0 - r16
            if (r4 == 0) goto L_0x02f2
            X.4PI r7 = (X.AnonymousClass4PI) r7
            X.4Pl r4 = r7.A0i
            android.os.Handler r3 = r4.A00
            X.4Ya r2 = new X.4Ya
            r2.<init>(r4, r5, r0)
            r3.post(r2)
            boolean r0 = X.AnonymousClass4PI.A08(r5)
            r7.A0V = r0
            boolean r0 = r7.A0j
            if (r0 == 0) goto L_0x02f1
            X.4Pm r0 = r7.A0f
            X.4PI r0 = r0.A05
            android.content.Context r2 = r0.A0e
            int r1 = com.google.android.exoplayer2.util.Util.A00
            r0 = 29
            if (r1 < r0) goto L_0x02f1
            android.content.Context r0 = r2.getApplicationContext()
            r0.getApplicationInfo()
        L_0x02f1:
            return
        L_0x02f2:
            X.4Pp r7 = (X.C264364Pp) r7
            X.4QF r4 = r7.A09
            android.os.Handler r3 = r4.A00
            X.5q5 r2 = new X.5q5
            r2.<init>(r4, r5, r0)
            r3.post(r2)
            return
        L_0x0301:
            r0 = move-exception
            if (r23 == 0) goto L_0x0307
            r23.release()
        L_0x0307:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4PJ.A0B(android.media.MediaCrypto, X.2Km):void");
    }

    private boolean A0C(int i) {
        AnonymousClass4PO r4 = this.A0C;
        r4.A01 = null;
        r4.A00 = null;
        AnonymousClass4PQ r3 = this.A0d;
        r3.clear();
        int A0E2 = A0E(r4, r3, i | 4);
        if (A0E2 == -5) {
            A0U(r4.A00);
            return true;
        } else if (A0E2 != -4 || (r3.A00 & 4) != 4) {
            return false;
        } else {
            this.A0I = true;
            A09();
            return false;
        }
    }

    public void A0J() {
        if (this.A0g) {
            A0R();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4Xn, java.lang.Object] */
    public void A0M(boolean z, boolean z2) {
        this.A09 = new Object();
        this.A06 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r2 == null) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A0O(X.C256683wB r5, X.C256823wP r6, boolean r7) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C264364Pp
            if (r0 == 0) goto L_0x0028
            r3 = r4
            X.4Pp r3 = (X.C264364Pp) r3
            java.lang.String r2 = r5.A0W
            if (r2 == 0) goto L_0x002c
            java.lang.String r1 = "audio/raw"
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L_0x0031
            X.4Q2 r0 = r3.A0A
            com.google.android.exoplayer2.audio.DefaultAudioSink r0 = (com.google.android.exoplayer2.audio.DefaultAudioSink) r0
            int r0 = r0.B7U(r5)
            if (r0 == 0) goto L_0x0031
            X.2Km r0 = X.2BR.A01(r1)
            if (r0 == 0) goto L_0x0031
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
        L_0x0028:
            java.lang.String r2 = r5.A0W
            if (r2 != 0) goto L_0x0031
        L_0x002c:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L_0x0031:
            r0 = 0
            java.util.List r0 = r6.Ave(r2, r7, r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4PJ.A0O(X.3wB, X.3wP, boolean):java.util.List");
    }

    public final void A0P() {
        if (this instanceof C264364Pp) {
            C264364Pp r4 = (C264364Pp) this;
            try {
                DefaultAudioSink defaultAudioSink = (DefaultAudioSink) r4.A0A;
                if (!defaultAudioSink.A0O && defaultAudioSink.A0B != null && DefaultAudioSink.A09(defaultAudioSink)) {
                    DefaultAudioSink.A07(defaultAudioSink);
                    defaultAudioSink.A0O = true;
                }
            } catch (AnonymousClass4UF e) {
                throw r4.A0F(e.A00, e, 5002, e.A01);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035 A[SYNTHETIC, Splitter:B:17:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cd A[Catch:{ 275 -> 0x00bd, 4UG -> 0x01ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ee A[Catch:{ 275 -> 0x00bd, 4UG -> 0x01ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e3 A[SYNTHETIC, Splitter:B:92:0x01e3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0S() {
        /*
            r21 = this;
            r4 = r21
            X.3n3 r0 = r4.A0B
            if (r0 != 0) goto L_0x01f9
            X.3wB r1 = r4.A08
            if (r1 == 0) goto L_0x01f9
            X.5f8 r0 = r4.A0S
            r4.A0A = r0
            java.lang.String r1 = r1.A0W
            r3 = 0
            r12 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0025
            X.X10 r0 = r0.At4()
            X.WM4 r0 = (X.WM4) r0
            if (r0 != 0) goto L_0x0027
            X.5f8 r0 = r4.A0A
            X.5OP r0 = r0.B27()
            if (r0 == 0) goto L_0x01f9
        L_0x0025:
            r5 = r12
            goto L_0x0030
        L_0x0027:
            android.media.MediaCrypto r5 = r0.A00
            boolean r0 = r5.requiresSecureDecoderComponent(r1)
            if (r0 == 0) goto L_0x0030
            r3 = 1
        L_0x0030:
            java.util.ArrayDeque r7 = r4.A0G     // Catch:{ 4UG -> 0x01ee }
            r6 = 0
            if (r7 != 0) goto L_0x00c9
            X.3wP r7 = r4.A0a     // Catch:{ 275 -> 0x00bd }
            X.3wB r0 = r4.A08     // Catch:{ 275 -> 0x00bd }
            java.util.List r8 = r4.A0O(r0, r7, r3)     // Catch:{ 275 -> 0x00bd }
            boolean r0 = r8.isEmpty()     // Catch:{ 275 -> 0x00bd }
            if (r0 == 0) goto L_0x0078
            if (r3 == 0) goto L_0x0078
            X.3wB r0 = r4.A08     // Catch:{ 275 -> 0x00bd }
            java.util.List r8 = r4.A0O(r0, r7, r6)     // Catch:{ 275 -> 0x00bd }
            boolean r0 = r8.isEmpty()     // Catch:{ 275 -> 0x00bd }
            if (r0 != 0) goto L_0x0078
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 275 -> 0x00bd }
            r1.<init>()     // Catch:{ 275 -> 0x00bd }
            java.lang.String r0 = "Drm session requires secure decoder for "
            r1.append(r0)     // Catch:{ 275 -> 0x00bd }
            X.3wB r0 = r4.A08     // Catch:{ 275 -> 0x00bd }
            java.lang.String r0 = r0.A0W     // Catch:{ 275 -> 0x00bd }
            r1.append(r0)     // Catch:{ 275 -> 0x00bd }
            java.lang.String r0 = ", but no secure decoder available. Trying to proceed with "
            r1.append(r0)     // Catch:{ 275 -> 0x00bd }
            r1.append(r8)     // Catch:{ 275 -> 0x00bd }
            java.lang.String r0 = "."
            r1.append(r0)     // Catch:{ 275 -> 0x00bd }
            java.lang.String r1 = r1.toString()     // Catch:{ 275 -> 0x00bd }
            java.lang.String r0 = "MediaCodecRenderer"
            X.2AG.A04(r0, r1)     // Catch:{ 275 -> 0x00bd }
        L_0x0078:
            boolean r0 = r8.isEmpty()     // Catch:{ 275 -> 0x00bd }
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r4.A0N     // Catch:{ 275 -> 0x00bd }
            if (r0 == 0) goto L_0x00a1
            X.3wB r0 = r4.A08     // Catch:{ 275 -> 0x00bd }
            java.lang.String r0 = X.2BR.A03(r0)     // Catch:{ 275 -> 0x00bd }
            if (r0 == 0) goto L_0x00a1
            java.util.List r7 = r7.Ave(r0, r6, r6)     // Catch:{ 275 -> 0x00bd }
            X.3wB r0 = r4.A08     // Catch:{ 275 -> 0x00bd }
            java.lang.String r1 = r0.A0W     // Catch:{ 275 -> 0x00bd }
            java.lang.String r0 = "video/dolby-vision"
            boolean r0 = r0.equals(r1)     // Catch:{ 275 -> 0x00bd }
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r7.isEmpty()     // Catch:{ 275 -> 0x00bd }
            if (r0 != 0) goto L_0x00a1
            r8 = r7
        L_0x00a1:
            boolean r0 = r4.A0c     // Catch:{ 275 -> 0x00bd }
            if (r0 == 0) goto L_0x00af
            java.util.ArrayDeque r7 = new java.util.ArrayDeque     // Catch:{ 275 -> 0x00bd }
            r7.<init>(r8)     // Catch:{ 275 -> 0x00bd }
        L_0x00aa:
            r4.A0G = r7     // Catch:{ 275 -> 0x00bd }
            r4.A0D = r12     // Catch:{ 275 -> 0x00bd }
            goto L_0x00c9
        L_0x00af:
            java.lang.Object r0 = r8.get(r6)     // Catch:{ 275 -> 0x00bd }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ 275 -> 0x00bd }
            java.util.ArrayDeque r7 = new java.util.ArrayDeque     // Catch:{ 275 -> 0x00bd }
            r7.<init>(r0)     // Catch:{ 275 -> 0x00bd }
            goto L_0x00aa
        L_0x00bd:
            r5 = move-exception
            X.3wB r2 = r4.A08     // Catch:{ 4UG -> 0x01ee }
            r1 = -49998(0xffffffffffff3cb2, float:NaN)
            X.4UG r0 = new X.4UG     // Catch:{ 4UG -> 0x01ee }
            r0.<init>(r2, r5, r1, r3)     // Catch:{ 4UG -> 0x01ee }
            throw r0     // Catch:{ 4UG -> 0x01ee }
        L_0x00c9:
            boolean r0 = r4.A0K     // Catch:{ 4UG -> 0x01ee }
            if (r0 != 0) goto L_0x00e6
            X.3wB r1 = r4.A08     // Catch:{ 4UG -> 0x01ee }
            boolean r0 = r4.A0W(r1)     // Catch:{ 4UG -> 0x01ee }
            if (r0 == 0) goto L_0x00e6
            java.lang.String r0 = r1.A0W     // Catch:{ 4UG -> 0x01ee }
            java.lang.String r13 = "meta.dav1d.av1.decoder"
            r14 = r0
            r15 = r0
            r16 = r6
            r17 = r2
            X.2Km r0 = X.2Km.A00(r12, r13, r14, r15, r16, r17)     // Catch:{ 4UG -> 0x01ee }
            r7.addFirst(r0)     // Catch:{ 4UG -> 0x01ee }
        L_0x00e6:
            java.util.ArrayDeque r0 = r4.A0G     // Catch:{ 4UG -> 0x01ee }
            boolean r0 = r0.isEmpty()     // Catch:{ 4UG -> 0x01ee }
            if (r0 != 0) goto L_0x01e3
            java.util.ArrayDeque r0 = r4.A0G     // Catch:{ 4UG -> 0x01ee }
            java.lang.Object r6 = r0.peekFirst()     // Catch:{ 4UG -> 0x01ee }
        L_0x00f4:
            java.util.ArrayDeque r0 = r4.A0G     // Catch:{ 4UG -> 0x01ee }
            java.lang.Object r11 = r0.peekFirst()     // Catch:{ 4UG -> 0x01ee }
            X.2Km r11 = (X.2Km) r11     // Catch:{ 4UG -> 0x01ee }
            r7 = r4
            boolean r0 = r4 instanceof X.AnonymousClass4PI     // Catch:{ 4UG -> 0x01ee }
            if (r0 == 0) goto L_0x0117
            X.4PI r7 = (X.AnonymousClass4PI) r7     // Catch:{ 4UG -> 0x01ee }
            android.view.Surface r1 = r7.A0O     // Catch:{ 4UG -> 0x01ee }
            if (r1 == 0) goto L_0x0111
            boolean r0 = r7.A0T     // Catch:{ 4UG -> 0x01ee }
            if (r0 != 0) goto L_0x0117
            boolean r0 = r1.isValid()     // Catch:{ 4UG -> 0x01ee }
            if (r0 != 0) goto L_0x0117
        L_0x0111:
            boolean r0 = X.AnonymousClass4PI.A07(r11, r7)     // Catch:{ 4UG -> 0x01ee }
            if (r0 == 0) goto L_0x01f9
        L_0x0117:
            X.2Bb r0 = X.2Bb.A04     // Catch:{ Exception -> 0x0139 }
            int r7 = X.2BY.A00(r0)     // Catch:{ Exception -> 0x0139 }
            if (r7 < 0) goto L_0x0134
            r4.A0B(r5, r11)     // Catch:{ Exception -> 0x0124 }
            goto L_0x01bc
        L_0x0124:
            r0 = move-exception
            if (r11 != r6) goto L_0x0128
            goto L_0x0129
        L_0x0128:
            throw r0     // Catch:{ Exception -> 0x0139 }
        L_0x0129:
            java.lang.String r1 = "MediaCodecRenderer"
            java.lang.String r0 = "Preferred decoder instantiation failed. Sleeping then retrying."
            X.2AG.A04(r1, r0)     // Catch:{ Exception -> 0x0139 }
            long r0 = (long) r7     // Catch:{ Exception -> 0x0139 }
            java.lang.Thread.sleep(r0)     // Catch:{ Exception -> 0x0139 }
        L_0x0134:
            r4.A0B(r5, r11)     // Catch:{ Exception -> 0x0139 }
            goto L_0x01bc
        L_0x0139:
            r1 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ 4UG -> 0x01ee }
            r7.<init>()     // Catch:{ 4UG -> 0x01ee }
            java.lang.String r0 = "Failed to initialize decoder: "
            r7.append(r0)     // Catch:{ 4UG -> 0x01ee }
            r7.append(r11)     // Catch:{ 4UG -> 0x01ee }
            java.lang.String r7 = r7.toString()     // Catch:{ 4UG -> 0x01ee }
            java.lang.String r0 = "MediaCodecRenderer"
            X.2AG.A06(r0, r7, r1)     // Catch:{ 4UG -> 0x01ee }
            java.util.ArrayDeque r0 = r4.A0G     // Catch:{ 4UG -> 0x01ee }
            r0.removeFirst()     // Catch:{ 4UG -> 0x01ee }
            X.3wB r8 = r4.A08     // Catch:{ 4UG -> 0x01ee }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ 4UG -> 0x01ee }
            r7.<init>()     // Catch:{ 4UG -> 0x01ee }
            java.lang.String r0 = "Decoder init failed: "
            r7.append(r0)     // Catch:{ 4UG -> 0x01ee }
            java.lang.String r0 = r11.A03     // Catch:{ 4UG -> 0x01ee }
            r7.append(r0)     // Catch:{ 4UG -> 0x01ee }
            java.lang.String r0 = ", "
            r7.append(r0)     // Catch:{ 4UG -> 0x01ee }
            r7.append(r8)     // Catch:{ 4UG -> 0x01ee }
            java.lang.String r13 = r7.toString()     // Catch:{ 4UG -> 0x01ee }
            java.lang.String r14 = r8.A0W     // Catch:{ 4UG -> 0x01ee }
            boolean r0 = r1 instanceof android.media.MediaCodec.CodecException     // Catch:{ 4UG -> 0x01ee }
            if (r0 == 0) goto L_0x01ba
            r0 = r1
            android.media.MediaCodec$CodecException r0 = (android.media.MediaCodec.CodecException) r0     // Catch:{ 4UG -> 0x01ee }
            java.lang.String r15 = r0.getDiagnosticInfo()     // Catch:{ 4UG -> 0x01ee }
        L_0x017f:
            X.4UG r10 = new X.4UG     // Catch:{ 4UG -> 0x01ee }
            r17 = r3
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ 4UG -> 0x01ee }
            X.4UG r0 = r4.A0D     // Catch:{ 4UG -> 0x01ee }
            if (r0 != 0) goto L_0x0199
            r4.A0D = r10     // Catch:{ 4UG -> 0x01ee }
        L_0x018e:
            java.util.ArrayDeque r0 = r4.A0G     // Catch:{ 4UG -> 0x01ee }
            boolean r0 = r0.isEmpty()     // Catch:{ 4UG -> 0x01ee }
            if (r0 == 0) goto L_0x00f4
            X.4UG r2 = r4.A0D     // Catch:{ 4UG -> 0x01ee }
            goto L_0x01ed
        L_0x0199:
            java.lang.String r16 = r0.getMessage()     // Catch:{ 4UG -> 0x01ee }
            java.lang.Throwable r19 = r0.getCause()     // Catch:{ 4UG -> 0x01ee }
            java.lang.String r9 = r0.A03     // Catch:{ 4UG -> 0x01ee }
            boolean r8 = r0.A04     // Catch:{ 4UG -> 0x01ee }
            X.2Km r7 = r0.A00     // Catch:{ 4UG -> 0x01ee }
            java.lang.String r1 = r0.A02     // Catch:{ 4UG -> 0x01ee }
            X.4UG r0 = new X.4UG     // Catch:{ 4UG -> 0x01ee }
            r15 = r10
            r17 = r9
            r18 = r1
            r20 = r8
            r14 = r7
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ 4UG -> 0x01ee }
            r4.A0D = r0     // Catch:{ 4UG -> 0x01ee }
            goto L_0x018e
        L_0x01ba:
            r15 = 0
            goto L_0x017f
        L_0x01bc:
            int r1 = r4.A01
            r0 = 2
            if (r1 != r0) goto L_0x01dd
            long r5 = android.os.SystemClock.elapsedRealtime()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 + r0
        L_0x01c8:
            r4.A0R = r5
            r4.A0A()
            r0 = -1
            r4.A03 = r0
            r4.A0F = r12
            r4.A0P = r2
            X.4Xn r1 = r4.A09
            int r0 = r1.A02
            int r0 = r0 + 1
            r1.A02 = r0
            return
        L_0x01dd:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01c8
        L_0x01e3:
            X.3wB r1 = r4.A08     // Catch:{ 4UG -> 0x01ee }
            r0 = -49999(0xffffffffffff3cb1, float:NaN)
            X.4UG r2 = new X.4UG     // Catch:{ 4UG -> 0x01ee }
            r2.<init>(r1, r12, r0, r3)     // Catch:{ 4UG -> 0x01ee }
        L_0x01ed:
            throw r2     // Catch:{ 4UG -> 0x01ee }
        L_0x01ee:
            r3 = move-exception
            X.3wB r2 = r4.A08
            r1 = 4001(0xfa1, float:5.607E-42)
            r0 = 0
            X.48u r0 = r4.A0F(r2, r3, r1, r0)
            throw r0
        L_0x01f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4PJ.A0S():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean CaO() {
        /*
            r5 = this;
            X.3wB r0 = r5.A08
            if (r0 != 0) goto L_0x002f
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x0006:
            r5.A06 = r0
        L_0x0008:
            X.3wB r0 = r5.A08
            if (r0 == 0) goto L_0x0043
            boolean r0 = r5.A0Q
            if (r0 != 0) goto L_0x0043
            boolean r0 = r5.A0G()
            if (r0 != 0) goto L_0x002d
            int r0 = r5.A03
            if (r0 >= 0) goto L_0x002d
            long r3 = r5.A0R
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0043
            long r1 = android.os.SystemClock.elapsedRealtime()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0043
        L_0x002d:
            r0 = 1
            return r0
        L_0x002f:
            boolean r0 = r5.A0Q
            if (r0 == 0) goto L_0x0036
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0006
        L_0x0036:
            boolean r0 = r5.A0G()
            if (r0 != 0) goto L_0x0008
            int r0 = r5.A03
            if (r0 >= 0) goto L_0x0008
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x0006
        L_0x0043:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4PJ.CaO():boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.4UF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: X.4UI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: X.4UF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: X.4UF} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02a9, code lost:
        if (r1 != false) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02ab, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02bf, code lost:
        r1 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        A09();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x04d8 A[Catch:{ all -> 0x05ee, IllegalStateException -> 0x05f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x04da A[Catch:{ all -> 0x05ee, IllegalStateException -> 0x05f3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void EEq(long r29, long r31) {
        /*
            r28 = this;
            r0 = r28
            boolean r1 = r0.A0L
            if (r1 == 0) goto L_0x000a
            r0.A0P()
            return
        L_0x000a:
            X.3wB r1 = r0.A08
            if (r1 != 0) goto L_0x0016
            r1 = 2
            boolean r1 = r0.A0C(r1)
            if (r1 != 0) goto L_0x0016
            return
        L_0x0016:
            r0.A0S()
            X.3n3 r1 = r0.A0B
            r3 = r29
            if (r1 == 0) goto L_0x0619
            java.lang.String r1 = "drainAndFeed"
            X.27d.A01(r1)     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x0024:
            int r1 = r0.A03     // Catch:{ IllegalStateException -> 0x0609 }
            if (r1 >= 0) goto L_0x02f7
            X.3n3 r1 = r0.A0B     // Catch:{ IllegalStateException -> 0x0609 }
            android.media.MediaCodec$BufferInfo r9 = r0.A0V     // Catch:{ IllegalStateException -> 0x0609 }
            int r2 = r1.dequeueOutputBufferIndex(r9)     // Catch:{ IllegalStateException -> 0x0609 }
            if (r2 < 0) goto L_0x01c3
            int r1 = r9.size     // Catch:{ IllegalStateException -> 0x0609 }
            if (r1 != 0) goto L_0x0177
            int r1 = r9.flags     // Catch:{ IllegalStateException -> 0x0609 }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0177
        L_0x003c:
            r0.A09()     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x003f:
            X.3n3 r3 = r0.A0B     // Catch:{ IllegalStateException -> 0x0609 }
            r7 = 0
            if (r3 == 0) goto L_0x05e0
            int r1 = r0.A01     // Catch:{ IllegalStateException -> 0x0609 }
            r2 = 2
            if (r1 == r2) goto L_0x05e0
            boolean r1 = r0.A0I     // Catch:{ IllegalStateException -> 0x0609 }
            if (r1 != 0) goto L_0x05e0
            int r1 = r0.A02     // Catch:{ IllegalStateException -> 0x0609 }
            if (r1 >= 0) goto L_0x0066
            int r4 = r3.dequeueInputBufferIndex()     // Catch:{ IllegalStateException -> 0x0609 }
            r0.A02 = r4     // Catch:{ IllegalStateException -> 0x0609 }
            if (r4 < 0) goto L_0x05e0
            X.4PQ r3 = r0.A0Z     // Catch:{ IllegalStateException -> 0x0609 }
            X.3n3 r1 = r0.A0B     // Catch:{ IllegalStateException -> 0x0609 }
            java.nio.ByteBuffer r1 = r1.getInputBuffer(r4)     // Catch:{ IllegalStateException -> 0x0609 }
            r3.A02 = r1     // Catch:{ IllegalStateException -> 0x0609 }
            r3.clear()     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x0066:
            int r1 = r0.A01     // Catch:{ IllegalStateException -> 0x0609 }
            r3 = 1
            if (r1 != r3) goto L_0x007d
            X.3n3 r5 = r0.A0B     // Catch:{ IllegalStateException -> 0x0609 }
            int r6 = r0.A02     // Catch:{ IllegalStateException -> 0x0609 }
            r9 = 0
            r11 = 4
            r8 = r7
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ IllegalStateException -> 0x0609 }
            r0.A0A()     // Catch:{ IllegalStateException -> 0x0609 }
            r0.A01 = r2     // Catch:{ IllegalStateException -> 0x0609 }
            goto L_0x05e0
        L_0x007d:
            boolean r1 = r0.A0Q     // Catch:{ IllegalStateException -> 0x0609 }
            if (r1 == 0) goto L_0x0083
            r6 = -4
            goto L_0x00b0
        L_0x0083:
            int r1 = r0.A00     // Catch:{ IllegalStateException -> 0x0609 }
            if (r1 != r3) goto L_0x00a8
            r5 = 0
        L_0x0088:
            X.3wB r1 = r0.A08     // Catch:{ IllegalStateException -> 0x0609 }
            java.util.List r1 = r1.A0X     // Catch:{ IllegalStateException -> 0x0609 }
            int r1 = r1.size()     // Catch:{ IllegalStateException -> 0x0609 }
            if (r5 >= r1) goto L_0x00a6
            X.3wB r1 = r0.A08     // Catch:{ IllegalStateException -> 0x0609 }
            java.util.List r1 = r1.A0X     // Catch:{ IllegalStateException -> 0x0609 }
            java.lang.Object r4 = r1.get(r5)     // Catch:{ IllegalStateException -> 0x0609 }
            byte[] r4 = (byte[]) r4     // Catch:{ IllegalStateException -> 0x0609 }
            X.4PQ r1 = r0.A0Z     // Catch:{ IllegalStateException -> 0x0609 }
            java.nio.ByteBuffer r1 = r1.A02     // Catch:{ IllegalStateException -> 0x0609 }
            r1.put(r4)     // Catch:{ IllegalStateException -> 0x0609 }
            int r5 = r5 + 1
            goto L_0x0088
        L_0x00a6:
            r0.A00 = r2     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x00a8:
            X.4PQ r4 = r0.A0Z     // Catch:{ IllegalStateException -> 0x0609 }
            X.4PO r1 = r0.A0Y     // Catch:{ IllegalStateException -> 0x0609 }
            int r6 = r0.A0E(r1, r4, r7)     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x00b0:
            boolean r1 = r0.CKV()     // Catch:{ IllegalStateException -> 0x0609 }
            if (r1 != 0) goto L_0x00bf
            X.4PQ r1 = r0.A0Z     // Catch:{ IllegalStateException -> 0x0609 }
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            int r1 = r1.A00     // Catch:{ IllegalStateException -> 0x0609 }
            r1 = r1 & r4
            if (r1 != r4) goto L_0x00c3
        L_0x00bf:
            long r4 = r0.A04     // Catch:{ IllegalStateException -> 0x0609 }
            r0.A05 = r4     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x00c3:
            r1 = -3
            if (r6 == r1) goto L_0x05e0
            r1 = -5
            if (r6 != r1) goto L_0x00dd
            int r1 = r0.A00     // Catch:{ IllegalStateException -> 0x0609 }
            if (r1 != r2) goto L_0x00d4
            X.4PQ r1 = r0.A0Z     // Catch:{ IllegalStateException -> 0x0609 }
            r1.clear()     // Catch:{ IllegalStateException -> 0x0609 }
            r0.A00 = r3     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x00d4:
            X.4PO r1 = r0.A0Y     // Catch:{ IllegalStateException -> 0x0609 }
            X.3wB r1 = r1.A00     // Catch:{ IllegalStateException -> 0x0609 }
            r0.A0U(r1)     // Catch:{ IllegalStateException -> 0x0609 }
            goto L_0x003f
        L_0x00dd:
            X.4PQ r4 = r0.A0Z     // Catch:{ IllegalStateException -> 0x0609 }
            r11 = 4
            int r6 = r4.A00     // Catch:{ IllegalStateException -> 0x0609 }
            r1 = r6 & 4
            if (r1 != r11) goto L_0x00fa
            int r1 = r0.A00     // Catch:{ IllegalStateException -> 0x0609 }
            if (r1 != r2) goto L_0x00ef
            r4.clear()     // Catch:{ IllegalStateException -> 0x0609 }
            r0.A00 = r3     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x00ef:
            r0.A0I = r3     // Catch:{ IllegalStateException -> 0x0609 }
            boolean r1 = r0.A0H     // Catch:{ IllegalStateException -> 0x0609 }
            if (r1 != 0) goto L_0x05aa
            r0.A09()     // Catch:{ IllegalStateException -> 0x0609 }
            goto L_0x05e0
        L_0x00fa:
            boolean r1 = r0.A0P     // Catch:{ IllegalStateException -> 0x0609 }
            if (r1 == 0) goto L_0x010d
            r1 = r6 & 1
            if (r1 == r3) goto L_0x010d
            r4.clear()     // Catch:{ IllegalStateException -> 0x0609 }
            int r1 = r0.A00     // Catch:{ IllegalStateException -> 0x0609 }
            if (r1 != r2) goto L_0x003f
            r0.A00 = r3     // Catch:{ IllegalStateException -> 0x0609 }
            goto L_0x003f
        L_0x010d:
            r0.A0P = r7     // Catch:{ IllegalStateException -> 0x0609 }
            r1 = 1073741824(0x40000000, float:2.0)
            r6 = r6 & r1
            r5 = 0
            if (r6 != r1) goto L_0x0116
            r5 = 1
        L_0x0116:
            X.5f8 r1 = r0.A0A     // Catch:{ IllegalStateException -> 0x0609 }
            r2 = 0
            if (r1 == 0) goto L_0x0126
            if (r5 == 0) goto L_0x0126
            int r1 = r1.Bz1()     // Catch:{ IllegalStateException -> 0x0609 }
            if (r1 == r3) goto L_0x05b8
            if (r1 == r11) goto L_0x0126
            r2 = 1
        L_0x0126:
            r0.A0Q = r2     // Catch:{ IllegalStateException -> 0x0609 }
            if (r2 != 0) goto L_0x05e0
            long r9 = r4.A01     // Catch:{ CryptoException -> 0x05d0 }
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r4.A00     // Catch:{ CryptoException -> 0x05d0 }
            r1 = r1 & r2
            if (r1 != r2) goto L_0x013c
            java.util.List r2 = r0.A0b     // Catch:{ CryptoException -> 0x05d0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r9)     // Catch:{ CryptoException -> 0x05d0 }
            r2.add(r1)     // Catch:{ CryptoException -> 0x05d0 }
        L_0x013c:
            long r1 = r0.A04     // Catch:{ CryptoException -> 0x05d0 }
            long r1 = java.lang.Math.max(r1, r9)     // Catch:{ CryptoException -> 0x05d0 }
            r0.A04 = r1     // Catch:{ CryptoException -> 0x05d0 }
            r4.A00()     // Catch:{ CryptoException -> 0x05d0 }
            r0.A0V(r4)     // Catch:{ CryptoException -> 0x05d0 }
            if (r5 == 0) goto L_0x014d
            goto L_0x015c
        L_0x014d:
            X.3n3 r5 = r0.A0B     // Catch:{ CryptoException -> 0x05d0 }
            int r6 = r0.A02     // Catch:{ CryptoException -> 0x05d0 }
            java.nio.ByteBuffer r1 = r4.A02     // Catch:{ CryptoException -> 0x05d0 }
            int r8 = r1.limit()     // Catch:{ CryptoException -> 0x05d0 }
            r11 = r7
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ CryptoException -> 0x05d0 }
            goto L_0x0166
        L_0x015c:
            X.3n3 r5 = r0.A0B     // Catch:{ CryptoException -> 0x05d0 }
            int r6 = r0.A02     // Catch:{ CryptoException -> 0x05d0 }
            X.4PT r8 = r4.A06     // Catch:{ CryptoException -> 0x05d0 }
            r11 = r7
            r5.queueSecureInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ CryptoException -> 0x05d0 }
        L_0x0166:
            r0.A0A()     // Catch:{ CryptoException -> 0x05d0 }
            r0.A0H = r3     // Catch:{ CryptoException -> 0x05d0 }
            r0.A00 = r7     // Catch:{ CryptoException -> 0x05d0 }
            X.4Xn r2 = r0.A09     // Catch:{ CryptoException -> 0x05d0 }
            int r1 = r2.A08     // Catch:{ CryptoException -> 0x05d0 }
            int r1 = r1 + 1
            r2.A08 = r1     // Catch:{ CryptoException -> 0x05d0 }
            goto L_0x003f
        L_0x0177:
            r0.A03 = r2     // Catch:{ IllegalStateException -> 0x0609 }
            X.3n3 r1 = r0.A0B     // Catch:{ IllegalStateException -> 0x0609 }
            java.nio.ByteBuffer r2 = r1.getOutputBuffer(r2)     // Catch:{ IllegalStateException -> 0x0609 }
            r0.A0F = r2     // Catch:{ IllegalStateException -> 0x0609 }
            if (r2 == 0) goto L_0x0192
            int r1 = r9.offset     // Catch:{ IllegalStateException -> 0x0609 }
            r2.position(r1)     // Catch:{ IllegalStateException -> 0x0609 }
            java.nio.ByteBuffer r5 = r0.A0F     // Catch:{ IllegalStateException -> 0x0609 }
            int r2 = r9.offset     // Catch:{ IllegalStateException -> 0x0609 }
            int r1 = r9.size     // Catch:{ IllegalStateException -> 0x0609 }
            int r2 = r2 + r1
            r5.limit(r2)     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x0192:
            long r7 = r9.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0609 }
            java.util.List r11 = r0.A0b     // Catch:{ IllegalStateException -> 0x0609 }
            int r10 = r11.size()     // Catch:{ IllegalStateException -> 0x0609 }
            r2 = 0
        L_0x019b:
            if (r2 >= r10) goto L_0x01b4
            java.lang.Object r1 = r11.get(r2)     // Catch:{ IllegalStateException -> 0x0609 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ IllegalStateException -> 0x0609 }
            long r5 = r1.longValue()     // Catch:{ IllegalStateException -> 0x0609 }
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x01af
            r11.remove(r2)     // Catch:{ IllegalStateException -> 0x0609 }
            goto L_0x01b2
        L_0x01af:
            int r2 = r2 + 1
            goto L_0x019b
        L_0x01b2:
            r1 = 1
            goto L_0x01b5
        L_0x01b4:
            r1 = 0
        L_0x01b5:
            r0.A0M = r1     // Catch:{ IllegalStateException -> 0x0609 }
            long r7 = r0.A05     // Catch:{ IllegalStateException -> 0x0609 }
            long r5 = r9.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0609 }
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r1 = 0
            if (r2 != 0) goto L_0x02f5
            r1 = 1
            goto L_0x02f5
        L_0x01c3:
            r1 = -2
            if (r2 != r1) goto L_0x02f0
            X.3n3 r1 = r0.A0B     // Catch:{ IllegalStateException -> 0x0609 }
            android.media.MediaFormat r10 = r1.getOutputFormat()     // Catch:{ IllegalStateException -> 0x0609 }
            r0.A07 = r10     // Catch:{ IllegalStateException -> 0x0609 }
            X.3n3 r8 = r0.A0B     // Catch:{ IllegalStateException -> 0x0609 }
            r7 = r0
            boolean r1 = r0 instanceof X.AnonymousClass4PI     // Catch:{ IllegalStateException -> 0x0609 }
            if (r1 == 0) goto L_0x024f
            X.4PI r7 = (X.AnonymousClass4PI) r7     // Catch:{ IllegalStateException -> 0x0609 }
            r7.A0M = r10     // Catch:{ IllegalStateException -> 0x0609 }
            java.lang.String r2 = "crop-right"
            boolean r1 = r10.containsKey(r2)     // Catch:{ IllegalStateException -> 0x0609 }
            java.lang.String r6 = "crop-top"
            java.lang.String r9 = "crop-bottom"
            java.lang.String r11 = "crop-left"
            if (r1 == 0) goto L_0x0208
            boolean r1 = r10.containsKey(r11)     // Catch:{ IllegalStateException -> 0x0609 }
            if (r1 == 0) goto L_0x0208
            boolean r1 = r10.containsKey(r9)     // Catch:{ IllegalStateException -> 0x0609 }
            if (r1 == 0) goto L_0x0208
            boolean r1 = r10.containsKey(r6)     // Catch:{ IllegalStateException -> 0x0609 }
            if (r1 == 0) goto L_0x0208
            r5 = 1
            int r2 = r10.getInteger(r2)     // Catch:{ IllegalStateException -> 0x0609 }
            int r1 = r10.getInteger(r11)     // Catch:{ IllegalStateException -> 0x0609 }
            int r2 = r2 - r1
            int r1 = r2 + 1
        L_0x0205:
            r7.A06 = r1     // Catch:{ IllegalStateException -> 0x0609 }
            goto L_0x0210
        L_0x0208:
            r5 = 0
            java.lang.String r1 = "width"
            int r1 = r10.getInteger(r1)     // Catch:{ IllegalStateException -> 0x0609 }
            goto L_0x0205
        L_0x0210:
            if (r5 == 0) goto L_0x021e
            int r2 = r10.getInteger(r9)     // Catch:{ IllegalStateException -> 0x0609 }
            int r1 = r10.getInteger(r6)     // Catch:{ IllegalStateException -> 0x0609 }
            int r2 = r2 - r1
            int r6 = r2 + 1
            goto L_0x0224
        L_0x021e:
            java.lang.String r1 = "height"
            int r6 = r10.getInteger(r1)     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x0224:
            r7.A05 = r6     // Catch:{ IllegalStateException -> 0x0609 }
            float r5 = r7.A01     // Catch:{ IllegalStateException -> 0x0609 }
            r7.A00 = r5     // Catch:{ IllegalStateException -> 0x0609 }
            int r2 = r7.A0A     // Catch:{ IllegalStateException -> 0x0609 }
            r1 = 90
            if (r2 == r1) goto L_0x0234
            r1 = 270(0x10e, float:3.78E-43)
            if (r2 != r1) goto L_0x023f
        L_0x0234:
            int r1 = r7.A06     // Catch:{ IllegalStateException -> 0x0609 }
            r7.A06 = r6     // Catch:{ IllegalStateException -> 0x0609 }
            r7.A05 = r1     // Catch:{ IllegalStateException -> 0x0609 }
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 / r5
            r7.A00 = r1     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x023f:
            int r1 = r7.A0E     // Catch:{ IllegalStateException -> 0x0609 }
            r8.setVideoScalingMode(r1)     // Catch:{ IllegalStateException -> 0x0609 }
            X.4Pf r2 = r7.A0g     // Catch:{ IllegalStateException -> 0x0609 }
            X.3wB r1 = r7.A08     // Catch:{ IllegalStateException -> 0x0609 }
            float r1 = r1.A01     // Catch:{ IllegalStateException -> 0x0609 }
            r2.A05(r1)     // Catch:{ IllegalStateException -> 0x0609 }
            goto L_0x0024
        L_0x024f:
            X.4Pp r7 = (X.C264364Pp) r7     // Catch:{ IllegalStateException -> 0x0609 }
            android.media.MediaFormat r2 = r7.A01     // Catch:{ IllegalStateException -> 0x0609 }
            if (r2 == 0) goto L_0x02ad
            java.lang.String r1 = "mime"
            java.lang.String r2 = r2.getString(r1)     // Catch:{ IllegalStateException -> 0x0609 }
            int r1 = r2.hashCode()     // Catch:{ IllegalStateException -> 0x0609 }
            r11 = 6
            switch(r1) {
                case -2123537834: goto L_0x029e;
                case -1095064472: goto L_0x0294;
                case 187078296: goto L_0x028c;
                case 187078297: goto L_0x0281;
                case 1504578661: goto L_0x027a;
                case 1505942594: goto L_0x026f;
                case 1556697186: goto L_0x0264;
                default: goto L_0x0263;
            }     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x0263:
            goto L_0x02ab
        L_0x0264:
            java.lang.String r1 = "audio/true-hd"
            boolean r1 = r2.equals(r1)     // Catch:{ IllegalStateException -> 0x0609 }
            if (r1 == 0) goto L_0x02ab
            r11 = 14
            goto L_0x02bf
        L_0x026f:
            java.lang.String r1 = "audio/vnd.dts.hd"
            boolean r1 = r2.equals(r1)     // Catch:{ IllegalStateException -> 0x0609 }
            if (r1 == 0) goto L_0x02ab
            r11 = 8
            goto L_0x02bf
        L_0x027a:
            java.lang.String r1 = "audio/eac3"
            boolean r1 = r2.equals(r1)     // Catch:{ IllegalStateException -> 0x0609 }
            goto L_0x02a9
        L_0x0281:
            java.lang.String r1 = "audio/ac4"
            boolean r1 = r2.equals(r1)     // Catch:{ IllegalStateException -> 0x0609 }
            if (r1 == 0) goto L_0x02ab
            r11 = 17
            goto L_0x02bf
        L_0x028c:
            java.lang.String r1 = "audio/ac3"
            boolean r1 = r2.equals(r1)     // Catch:{ IllegalStateException -> 0x0609 }
            r11 = 5
            goto L_0x02a9
        L_0x0294:
            java.lang.String r1 = "audio/vnd.dts"
            boolean r1 = r2.equals(r1)     // Catch:{ IllegalStateException -> 0x0609 }
            if (r1 == 0) goto L_0x02ab
            r11 = 7
            goto L_0x02bf
        L_0x029e:
            java.lang.String r1 = "audio/eac3-joc"
            boolean r1 = r2.equals(r1)     // Catch:{ IllegalStateException -> 0x0609 }
            if (r1 == 0) goto L_0x02ab
            r11 = 18
            goto L_0x02bf
        L_0x02a9:
            if (r1 != 0) goto L_0x02bf
        L_0x02ab:
            r11 = 0
            goto L_0x02bf
        L_0x02ad:
            X.3wB r5 = r7.A02     // Catch:{ IllegalStateException -> 0x0609 }
            java.lang.String r2 = r5.A0W     // Catch:{ IllegalStateException -> 0x0609 }
            java.lang.String r1 = "audio/raw"
            boolean r1 = r1.equals(r2)     // Catch:{ IllegalStateException -> 0x0609 }
            if (r1 == 0) goto L_0x02bc
            int r11 = r5.A0C     // Catch:{ IllegalStateException -> 0x0609 }
            goto L_0x02bd
        L_0x02bc:
            r11 = 2
        L_0x02bd:
            r1 = r10
            goto L_0x02c1
        L_0x02bf:
            android.media.MediaFormat r1 = r7.A01     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x02c1:
            java.lang.String r9 = "channel-count"
            r1.getInteger(r9)     // Catch:{ IllegalStateException -> 0x0609 }
            java.lang.String r2 = "sample-rate"
            r1.getInteger(r2)     // Catch:{ IllegalStateException -> 0x0609 }
            r6 = 0
            r8 = 0
            X.3w8 r5 = new X.3w8     // Catch:{ IllegalStateException -> 0x0609 }
            r5.<init>()     // Catch:{ IllegalStateException -> 0x0609 }
            java.lang.String r1 = "audio/raw"
            r5.A0U = r1     // Catch:{ IllegalStateException -> 0x0609 }
            r5.A0A = r11     // Catch:{ IllegalStateException -> 0x0609 }
            int r1 = r10.getInteger(r9)     // Catch:{ IllegalStateException -> 0x0609 }
            r5.A04 = r1     // Catch:{ IllegalStateException -> 0x0609 }
            int r1 = r10.getInteger(r2)     // Catch:{ IllegalStateException -> 0x0609 }
            r5.A0E = r1     // Catch:{ IllegalStateException -> 0x0609 }
            X.3wB r2 = new X.3wB     // Catch:{ IllegalStateException -> 0x0609 }
            r2.<init>(r5)     // Catch:{ IllegalStateException -> 0x0609 }
            X.4Q2 r1 = r7.A0A     // Catch:{ 4UH -> 0x05e4 }
            r1.AJ2(r2, r8, r6)     // Catch:{ 4UH -> 0x05e4 }
            goto L_0x0024
        L_0x02f0:
            r1 = -3
            if (r2 != r1) goto L_0x003f
            goto L_0x0024
        L_0x02f5:
            r0.A0J = r1     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x02f7:
            X.3n3 r7 = r0.A0B     // Catch:{ IllegalStateException -> 0x0609 }
            java.nio.ByteBuffer r12 = r0.A0F     // Catch:{ IllegalStateException -> 0x0609 }
            int r6 = r0.A03     // Catch:{ IllegalStateException -> 0x0609 }
            android.media.MediaCodec$BufferInfo r1 = r0.A0V     // Catch:{ IllegalStateException -> 0x0609 }
            r27 = r1
            int r8 = r1.flags     // Catch:{ IllegalStateException -> 0x0609 }
            long r1 = r1.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0609 }
            boolean r13 = r0.A0M     // Catch:{ IllegalStateException -> 0x0609 }
            r5 = r0
            boolean r9 = r0 instanceof X.AnonymousClass4PI     // Catch:{ IllegalStateException -> 0x0609 }
            if (r9 == 0) goto L_0x0507
            X.4PI r5 = (X.AnonymousClass4PI) r5     // Catch:{ IllegalStateException -> 0x0609 }
            X.3n3 r9 = r5.A0B     // Catch:{ IllegalStateException -> 0x0609 }
            if (r9 == 0) goto L_0x034e
            boolean r8 = r5.A0W     // Catch:{ IllegalStateException -> 0x0609 }
            if (r8 != 0) goto L_0x034e
            int r9 = r9.getTotalSampleCount()     // Catch:{ IllegalStateException -> 0x0609 }
            r8 = 30
            if (r9 <= r8) goto L_0x034e
            X.3wB r12 = r5.A08     // Catch:{ IllegalStateException -> 0x0609 }
            X.3n3 r8 = r5.A0B     // Catch:{ IllegalStateException -> 0x0609 }
            if (r8 == 0) goto L_0x034b
            if (r12 == 0) goto L_0x034b
            android.util.Pair r9 = r8.getPerFrameTotalDecodeTimeAndCount()     // Catch:{ IllegalStateException -> 0x0609 }
            java.lang.Object r8 = r9.first     // Catch:{ IllegalStateException -> 0x0609 }
            java.lang.Number r8 = (java.lang.Number) r8     // Catch:{ IllegalStateException -> 0x0609 }
            long r14 = r8.longValue()     // Catch:{ IllegalStateException -> 0x0609 }
            r10 = 0
            int r8 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x034b
            X.4Xn r8 = r5.A09     // Catch:{ IllegalStateException -> 0x0609 }
            r8.A00(r9)     // Catch:{ IllegalStateException -> 0x0609 }
            X.4Pl r11 = r5.A0i     // Catch:{ IllegalStateException -> 0x0609 }
            int r10 = r8.A00     // Catch:{ IllegalStateException -> 0x0609 }
            android.os.Handler r9 = r11.A00     // Catch:{ IllegalStateException -> 0x0609 }
            X.5jB r8 = new X.5jB     // Catch:{ IllegalStateException -> 0x0609 }
            r8.<init>(r12, r11, r10)     // Catch:{ IllegalStateException -> 0x0609 }
            r9.post(r8)     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x034b:
            r8 = 1
            r5.A0W = r8     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x034e:
            long r8 = r5.A0G     // Catch:{ IllegalStateException -> 0x0609 }
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x035b
            r5.A0G = r3     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x035b:
            long r8 = r5.A0I     // Catch:{ IllegalStateException -> 0x0609 }
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0368
            X.4Pf r8 = r5.A0g     // Catch:{ IllegalStateException -> 0x0609 }
            r8.A06(r1)     // Catch:{ IllegalStateException -> 0x0609 }
            r5.A0I = r1     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x0368:
            long r8 = r5.A0L     // Catch:{ IllegalStateException -> 0x0609 }
            long r23 = r1 - r8
            r12 = 1
            if (r13 != 0) goto L_0x04f1
            long r21 = r1 - r29
            android.view.Surface r9 = r5.A0O     // Catch:{ IllegalStateException -> 0x0609 }
            android.view.Surface r8 = r5.A0N     // Catch:{ IllegalStateException -> 0x0609 }
            r10 = 0
            if (r9 != r8) goto L_0x0380
            r8 = -30000(0xffffffffffff8ad0, double:NaN)
            int r1 = (r21 > r8 ? 1 : (r21 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x003f
            goto L_0x04f1
        L_0x0380:
            long r19 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0609 }
            r17 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r17
            int r9 = r5.A01     // Catch:{ IllegalStateException -> 0x0609 }
            r8 = 2
            r11 = 0
            if (r9 != r8) goto L_0x038f
            r11 = 1
        L_0x038f:
            boolean r8 = r5.A0Z     // Catch:{ IllegalStateException -> 0x0609 }
            if (r8 == 0) goto L_0x0460
            if (r11 == 0) goto L_0x003f
            long r8 = r5.A0J     // Catch:{ IllegalStateException -> 0x0609 }
            long r15 = r19 - r8
            r13 = -30000(0xffffffffffff8ad0, double:NaN)
            int r8 = (r21 > r13 ? 1 : (r21 == r13 ? 0 : -1))
            if (r8 >= 0) goto L_0x03a8
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r8 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x03a8
            goto L_0x0460
        L_0x03a8:
            long r8 = r5.A0G     // Catch:{ IllegalStateException -> 0x0609 }
            int r11 = (r29 > r8 ? 1 : (r29 == r8 ? 0 : -1))
            if (r11 == 0) goto L_0x003f
            long r19 = r19 - r31
            long r15 = r21 - r19
            long r13 = java.lang.System.nanoTime()     // Catch:{ IllegalStateException -> 0x0609 }
            long r15 = r15 * r17
            long r8 = r13 + r15
            X.4PZ r11 = r5.A0h     // Catch:{ IllegalStateException -> 0x0609 }
            long r1 = r11.A01(r1, r8)     // Catch:{ IllegalStateException -> 0x0609 }
            long r15 = r1 - r13
            long r15 = r15 / r17
            r13 = -500000(0xfffffffffff85ee0, double:NaN)
            int r8 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r8 >= 0) goto L_0x03e4
            int r8 = r5.A0D(r3)     // Catch:{ IllegalStateException -> 0x0609 }
            if (r8 == 0) goto L_0x03e4
            X.4Xn r2 = r5.A09     // Catch:{ IllegalStateException -> 0x0609 }
            int r1 = r2.A06     // Catch:{ IllegalStateException -> 0x0609 }
            int r1 = r1 + 1
            r2.A06 = r1     // Catch:{ IllegalStateException -> 0x0609 }
            int r1 = r5.A03     // Catch:{ IllegalStateException -> 0x0609 }
            int r1 = r1 + r8
            r5.A0Y(r1)     // Catch:{ IllegalStateException -> 0x0609 }
            r5.A0Q()     // Catch:{ IllegalStateException -> 0x0609 }
            goto L_0x003f
        L_0x03e4:
            r13 = -30000(0xffffffffffff8ad0, double:NaN)
            int r8 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r8 >= 0) goto L_0x03ec
            goto L_0x0581
        L_0x03ec:
            r11 = 50000(0xc350, double:2.47033E-319)
            int r8 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r8 >= 0) goto L_0x040f
            boolean r8 = r5.A0j     // Catch:{ IllegalStateException -> 0x05f3 }
            if (r8 != 0) goto L_0x04e4
            X.AnonymousClass4PI.A05(r5)     // Catch:{ IllegalStateException -> 0x05f3 }
            X.3wB r11 = r5.A08     // Catch:{ IllegalStateException -> 0x05f3 }
            android.media.MediaFormat r9 = r5.A0M     // Catch:{ IllegalStateException -> 0x05f3 }
            X.4SC r8 = r5.A0R     // Catch:{ IllegalStateException -> 0x05f3 }
            if (r8 == 0) goto L_0x04a5
            r20 = r8
            r21 = r9
            r22 = r11
            r25 = r1
            r20.DxT(r21, r22, r23, r25)     // Catch:{ IllegalStateException -> 0x05f3 }
            goto L_0x04a5
        L_0x040f:
            X.3wB r1 = r5.A08     // Catch:{ IllegalStateException -> 0x0609 }
            float r2 = r1.A01     // Catch:{ IllegalStateException -> 0x0609 }
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            r12 = 1106247680(0x41f00000, float:30.0)
            if (r1 == 0) goto L_0x041c
            r12 = r2
        L_0x041c:
            java.util.UUID r1 = X.AnonymousClass4T7.A04     // Catch:{ IllegalStateException -> 0x0609 }
            long r1 = com.google.android.exoplayer2.util.Util.A08(r3)     // Catch:{ IllegalStateException -> 0x0609 }
            int r10 = (int) r1     // Catch:{ IllegalStateException -> 0x0609 }
            long r1 = com.google.android.exoplayer2.util.Util.A08(r21)     // Catch:{ IllegalStateException -> 0x0609 }
            int r9 = (int) r1     // Catch:{ IllegalStateException -> 0x0609 }
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r9 <= r4) goto L_0x003f
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r9 >= r1) goto L_0x003f
            int r11 = r10 + r9
            int r3 = r5.A08     // Catch:{ IllegalStateException -> 0x0609 }
            int r1 = r5.A09     // Catch:{ IllegalStateException -> 0x0609 }
            int r2 = r3 + r1
            int r1 = r2 + r4
            if (r11 <= r1) goto L_0x003f
            r7 = 4652007308841189376(0x408f400000000000, double:1000.0)
            if (r10 <= r3) goto L_0x044c
            if (r10 >= r2) goto L_0x044c
            X.4Xn r6 = r5.A09     // Catch:{ IllegalStateException -> 0x0609 }
            int r4 = r6.A0E     // Catch:{ IllegalStateException -> 0x0609 }
            int r11 = r11 - r2
            float r1 = (float) r11     // Catch:{ IllegalStateException -> 0x0609 }
            goto L_0x0453
        L_0x044c:
            if (r10 <= r2) goto L_0x045a
            X.4Xn r6 = r5.A09     // Catch:{ IllegalStateException -> 0x0609 }
            int r4 = r6.A0E     // Catch:{ IllegalStateException -> 0x0609 }
            float r1 = (float) r9     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x0453:
            float r1 = r1 * r12
            double r2 = (double) r1     // Catch:{ IllegalStateException -> 0x0609 }
            double r2 = r2 / r7
            int r1 = (int) r2     // Catch:{ IllegalStateException -> 0x0609 }
            int r4 = r4 + r1
            r6.A0E = r4     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x045a:
            r5.A08 = r10     // Catch:{ IllegalStateException -> 0x0609 }
            r5.A09 = r9     // Catch:{ IllegalStateException -> 0x0609 }
            goto L_0x003f
        L_0x0460:
            long r1 = java.lang.System.nanoTime()     // Catch:{ IllegalStateException -> 0x05f3 }
            boolean r8 = r5.A0j     // Catch:{ IllegalStateException -> 0x05f3 }
            if (r8 != 0) goto L_0x04e4
            X.AnonymousClass4PI.A05(r5)     // Catch:{ IllegalStateException -> 0x05f3 }
            X.3wB r11 = r5.A08     // Catch:{ IllegalStateException -> 0x05f3 }
            android.media.MediaFormat r9 = r5.A0M     // Catch:{ IllegalStateException -> 0x05f3 }
            X.4SC r8 = r5.A0R     // Catch:{ IllegalStateException -> 0x05f3 }
            if (r8 == 0) goto L_0x047e
            r20 = r8
            r21 = r9
            r22 = r11
            r25 = r1
            r20.DxT(r21, r22, r23, r25)     // Catch:{ IllegalStateException -> 0x05f3 }
        L_0x047e:
            java.lang.String r8 = "releaseOutputBuffer"
            X.27d.A01(r8)     // Catch:{ all -> 0x05ee }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x05ee }
            r7.releaseOutputBuffer((int) r6, (long) r1)     // Catch:{ all -> 0x05ee }
            long r1 = r5.A06     // Catch:{ all -> 0x05ee }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x05ee }
            long r6 = r6 - r8
            long r1 = r1 + r6
            r5.A06 = r1     // Catch:{ all -> 0x05ee }
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x05ee }
            long r1 = r1 * r17
            r5.A0J = r1     // Catch:{ all -> 0x05ee }
            X.4Xn r2 = r5.A09     // Catch:{ all -> 0x05ee }
            int r1 = r2.A09     // Catch:{ all -> 0x05ee }
            int r1 = r1 + 1
            r2.A09 = r1     // Catch:{ all -> 0x05ee }
            goto L_0x04cb
        L_0x04a5:
            java.lang.String r8 = "releaseOutputBuffer"
            X.27d.A01(r8)     // Catch:{ all -> 0x05ee }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x05ee }
            r7.releaseOutputBuffer((int) r6, (long) r1)     // Catch:{ all -> 0x05ee }
            long r1 = r5.A06     // Catch:{ all -> 0x05ee }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x05ee }
            long r6 = r6 - r8
            long r1 = r1 + r6
            r5.A06 = r1     // Catch:{ all -> 0x05ee }
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x05ee }
            long r1 = r1 * r17
            r5.A0J = r1     // Catch:{ all -> 0x05ee }
            X.4Xn r2 = r5.A09     // Catch:{ all -> 0x05ee }
            int r1 = r2.A09     // Catch:{ all -> 0x05ee }
            int r1 = r1 + 1
            r2.A09 = r1     // Catch:{ all -> 0x05ee }
        L_0x04cb:
            r5.A04 = r10     // Catch:{ all -> 0x05ee }
            r5.A0X()     // Catch:{ all -> 0x05ee }
            X.4Xn r7 = r5.A09     // Catch:{ all -> 0x05ee }
            long r5 = r5.A06     // Catch:{ all -> 0x05ee }
            int r1 = r7.A09     // Catch:{ all -> 0x05ee }
            if (r1 != 0) goto L_0x04da
            r1 = -1
            goto L_0x04dd
        L_0x04da:
            long r1 = (long) r1     // Catch:{ all -> 0x05ee }
            long r5 = r5 / r1
            int r1 = (int) r5     // Catch:{ all -> 0x05ee }
        L_0x04dd:
            r7.A01 = r1     // Catch:{ all -> 0x05ee }
            X.27d.A00()     // Catch:{ IllegalStateException -> 0x05f3 }
            goto L_0x058f
        L_0x04e4:
            r20 = r5
            r21 = r7
            r22 = r6
            r25 = r1
            r20.A0Z(r21, r22, r23, r25)     // Catch:{ IllegalStateException -> 0x05f3 }
            goto L_0x058f
        L_0x04f1:
            java.lang.String r1 = "skipVideoBuffer"
            X.27d.A01(r1)     // Catch:{ IllegalStateException -> 0x0609 }
            r1 = 0
            r7.releaseOutputBuffer((int) r6, (boolean) r1)     // Catch:{ IllegalStateException -> 0x0609 }
            X.27d.A00()     // Catch:{ IllegalStateException -> 0x0609 }
            X.4Xn r2 = r5.A09     // Catch:{ IllegalStateException -> 0x0609 }
            int r1 = r2.A0B     // Catch:{ IllegalStateException -> 0x0609 }
            int r1 = r1 + 1
            r2.A0B = r1     // Catch:{ IllegalStateException -> 0x0609 }
            goto L_0x058f
        L_0x0507:
            X.4Pp r5 = (X.C264364Pp) r5     // Catch:{ IllegalStateException -> 0x0609 }
            boolean r9 = r5.A05     // Catch:{ IllegalStateException -> 0x0609 }
            r11 = 0
            r10 = 1
            if (r9 == 0) goto L_0x0517
            r8 = r8 & 2
            if (r8 == 0) goto L_0x0517
            r7.releaseOutputBuffer((int) r6, (boolean) r11)     // Catch:{ IllegalStateException -> 0x0609 }
            goto L_0x058f
        L_0x0517:
            if (r13 == 0) goto L_0x052b
            r7.releaseOutputBuffer((int) r6, (boolean) r11)     // Catch:{ IllegalStateException -> 0x0609 }
            X.4Xn r2 = r5.A09     // Catch:{ IllegalStateException -> 0x0609 }
            int r1 = r2.A0B     // Catch:{ IllegalStateException -> 0x0609 }
            int r1 = r1 + 1
            r2.A0B = r1     // Catch:{ IllegalStateException -> 0x0609 }
            X.4Q2 r1 = r5.A0A     // Catch:{ IllegalStateException -> 0x0609 }
            com.google.android.exoplayer2.audio.DefaultAudioSink r1 = (com.google.android.exoplayer2.audio.DefaultAudioSink) r1     // Catch:{ IllegalStateException -> 0x0609 }
            r1.A0S = r10     // Catch:{ IllegalStateException -> 0x0609 }
            goto L_0x058f
        L_0x052b:
            boolean r8 = r5.A0B     // Catch:{ IllegalStateException -> 0x0609 }
            if (r8 == 0) goto L_0x056d
            int r9 = r12.limit()     // Catch:{ IllegalStateException -> 0x0609 }
            int r8 = r12.position()     // Catch:{ IllegalStateException -> 0x0609 }
            if (r9 <= r8) goto L_0x056d
            int r13 = r12.position()     // Catch:{ IllegalStateException -> 0x0609 }
            int r9 = r12.limit()     // Catch:{ IllegalStateException -> 0x0609 }
            int r8 = r9 - r13
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)     // Catch:{ IllegalStateException -> 0x0609 }
            r8.put(r12)     // Catch:{ IllegalStateException -> 0x0609 }
            r8.flip()     // Catch:{ IllegalStateException -> 0x0609 }
            r12.position(r13)     // Catch:{ IllegalStateException -> 0x0609 }
            r12.limit(r9)     // Catch:{ IllegalStateException -> 0x0609 }
            X.4QF r9 = r5.A09     // Catch:{ IllegalStateException -> 0x0609 }
            byte[] r16 = r8.array()     // Catch:{ IllegalStateException -> 0x0609 }
            r13 = 1000(0x3e8, double:4.94E-321)
            long r14 = r1 / r13
            android.os.Handler r8 = r9.A00     // Catch:{ IllegalStateException -> 0x0609 }
            r17 = r8
            X.WoZ r13 = new X.WoZ     // Catch:{ IllegalStateException -> 0x0609 }
            r8 = r16
            r13.<init>(r9, r8, r14)     // Catch:{ IllegalStateException -> 0x0609 }
            r8 = r17
            r8.post(r13)     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x056d:
            X.4Q2 r8 = r5.A0A     // Catch:{ 4UI -> 0x05f5, 4UF -> 0x05fd }
            boolean r1 = r8.CIL(r12, r10, r1)     // Catch:{ 4UI -> 0x05f5, 4UF -> 0x05fd }
            if (r1 == 0) goto L_0x003f
            r7.releaseOutputBuffer((int) r6, (boolean) r11)     // Catch:{ 4UI -> 0x05f5, 4UF -> 0x05fd }
            X.4Xn r2 = r5.A09     // Catch:{ 4UI -> 0x05f5, 4UF -> 0x05fd }
            int r1 = r2.A09     // Catch:{ 4UI -> 0x05f5, 4UF -> 0x05fd }
            int r1 = r1 + 1
            r2.A09 = r1     // Catch:{ 4UI -> 0x05f5, 4UF -> 0x05fd }
            goto L_0x058f
        L_0x0581:
            java.lang.String r1 = "dropVideoBuffer"
            X.27d.A01(r1)     // Catch:{ IllegalStateException -> 0x0609 }
            r7.releaseOutputBuffer((int) r6, (boolean) r10)     // Catch:{ IllegalStateException -> 0x0609 }
            X.27d.A00()     // Catch:{ IllegalStateException -> 0x0609 }
            r5.A0Y(r12)     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x058f:
            r1 = r27
            long r1 = r1.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0609 }
            r0.A0T(r1)     // Catch:{ IllegalStateException -> 0x0609 }
            r1 = r27
            int r1 = r1.flags     // Catch:{ IllegalStateException -> 0x0609 }
            r1 = r1 & 4
            r2 = 0
            if (r1 == 0) goto L_0x05a0
            r2 = 1
        L_0x05a0:
            r1 = -1
            r0.A03 = r1     // Catch:{ IllegalStateException -> 0x0609 }
            r1 = 0
            r0.A0F = r1     // Catch:{ IllegalStateException -> 0x0609 }
            if (r2 != 0) goto L_0x003c
            goto L_0x0024
        L_0x05aa:
            X.3n3 r5 = r0.A0B     // Catch:{ CryptoException -> 0x05d0 }
            int r6 = r0.A02     // Catch:{ CryptoException -> 0x05d0 }
            r9 = 0
            r8 = r7
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ CryptoException -> 0x05d0 }
            r0.A0A()     // Catch:{ CryptoException -> 0x05d0 }
            goto L_0x05e0
        L_0x05b8:
            X.5f8 r1 = r0.A0A     // Catch:{ IllegalStateException -> 0x0609 }
            X.5OP r4 = r1.B27()     // Catch:{ IllegalStateException -> 0x0609 }
            r4.getClass()     // Catch:{ IllegalStateException -> 0x0609 }
            X.5f8 r1 = r0.A0A     // Catch:{ IllegalStateException -> 0x0609 }
            X.5OP r3 = r1.B27()     // Catch:{ IllegalStateException -> 0x0609 }
            X.3wB r2 = r0.A08     // Catch:{ IllegalStateException -> 0x0609 }
            int r1 = r4.A00     // Catch:{ IllegalStateException -> 0x0609 }
            X.48u r1 = r0.A0F(r2, r3, r1, r7)     // Catch:{ IllegalStateException -> 0x0609 }
            throw r1     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x05d0:
            r3 = move-exception
            X.3wB r2 = r0.A08     // Catch:{ IllegalStateException -> 0x0609 }
            int r1 = r3.getErrorCode()     // Catch:{ IllegalStateException -> 0x0609 }
            int r1 = com.google.android.exoplayer2.util.Util.A01(r1)     // Catch:{ IllegalStateException -> 0x0609 }
            X.48u r1 = r0.A0F(r2, r3, r1, r7)     // Catch:{ IllegalStateException -> 0x0609 }
            throw r1     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x05e0:
            X.27d.A00()
            goto L_0x0628
        L_0x05e4:
            r3 = move-exception
            X.3wB r2 = r3.A00     // Catch:{ IllegalStateException -> 0x0609 }
            r1 = 5001(0x1389, float:7.008E-42)
            X.48u r1 = r7.A0F(r2, r3, r1, r6)     // Catch:{ IllegalStateException -> 0x0609 }
            throw r1     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x05ee:
            r1 = move-exception
            X.27d.A00()     // Catch:{ IllegalStateException -> 0x05f3 }
            throw r1     // Catch:{ IllegalStateException -> 0x05f3 }
        L_0x05f3:
            r1 = move-exception
            throw r1     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x05f5:
            r4 = move-exception
            X.3wB r3 = r5.A02     // Catch:{ IllegalStateException -> 0x0609 }
            boolean r2 = r4.A01     // Catch:{ IllegalStateException -> 0x0609 }
            r1 = 5001(0x1389, float:7.008E-42)
            goto L_0x0604
        L_0x05fd:
            r4 = move-exception
            X.3wB r3 = r5.A08     // Catch:{ IllegalStateException -> 0x0609 }
            boolean r2 = r4.A01     // Catch:{ IllegalStateException -> 0x0609 }
            r1 = 5002(0x138a, float:7.009E-42)
        L_0x0604:
            X.48u r1 = r5.A0F(r3, r4, r1, r2)     // Catch:{ IllegalStateException -> 0x0609 }
            throw r1     // Catch:{ IllegalStateException -> 0x0609 }
        L_0x0609:
            r4 = move-exception
            X.3wB r3 = r0.A08     // Catch:{ all -> 0x0614 }
            r2 = 4003(0xfa3, float:5.61E-42)
            r1 = 0
            X.48u r0 = r0.A0F(r3, r4, r2, r1)     // Catch:{ all -> 0x0614 }
            throw r0     // Catch:{ all -> 0x0614 }
        L_0x0614:
            r0 = move-exception
            X.27d.A00()
            throw r0
        L_0x0619:
            X.4Xn r5 = r0.A09
            int r2 = r5.A0A
            int r1 = r0.A0D(r3)
            int r2 = r2 + r1
            r5.A0A = r2
            r1 = 1
            r0.A0C(r1)
        L_0x0628:
            X.4Xn r0 = r0.A09
            monitor-enter(r0)
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4PJ.EEq(long, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r3 == 2) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int Ez5(X.C256683wB r12) {
        /*
            r11 = this;
            X.3wP r1 = r11.A0a     // Catch:{ 275 -> 0x00b0 }
            r5 = r11
            boolean r0 = r11 instanceof X.C264364Pp     // Catch:{ 275 -> 0x00b0 }
            if (r0 == 0) goto L_0x00a0
            X.4Pp r5 = (X.C264364Pp) r5     // Catch:{ 275 -> 0x00b0 }
            java.lang.String r6 = r12.A0W     // Catch:{ 275 -> 0x00b0 }
            boolean r0 = X.2Kn.A04(r6)     // Catch:{ 275 -> 0x00b0 }
            r2 = 0
            if (r0 != 0) goto L_0x0013
            goto L_0x0063
        L_0x0013:
            int r3 = r12.A07     // Catch:{ 275 -> 0x00b0 }
            if (r3 == 0) goto L_0x001b
            r0 = 2
            r10 = 0
            if (r3 != r0) goto L_0x001c
        L_0x001b:
            r10 = 1
        L_0x001c:
            r9 = 4
            r3 = 8
            if (r10 == 0) goto L_0x003c
            java.lang.String r4 = "audio/raw"
            boolean r0 = r4.equals(r6)     // Catch:{ 275 -> 0x00b0 }
            if (r0 != 0) goto L_0x003c
            X.4Q2 r0 = r5.A0A     // Catch:{ 275 -> 0x00b0 }
            com.google.android.exoplayer2.audio.DefaultAudioSink r0 = (com.google.android.exoplayer2.audio.DefaultAudioSink) r0     // Catch:{ 275 -> 0x00b0 }
            int r0 = r0.B7U(r12)     // Catch:{ 275 -> 0x00b0 }
            if (r0 == 0) goto L_0x003c
            X.2Km r0 = X.2BR.A01(r4)     // Catch:{ 275 -> 0x00b0 }
            if (r0 == 0) goto L_0x003c
            r8 = 44
            return r8
        L_0x003c:
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r6)     // Catch:{ 275 -> 0x00b0 }
            r8 = 1
            if (r0 == 0) goto L_0x0065
            X.4Q2 r7 = r5.A0A     // Catch:{ 275 -> 0x00b0 }
            int r6 = r12.A06     // Catch:{ 275 -> 0x00b0 }
            int r4 = r12.A0C     // Catch:{ 275 -> 0x00b0 }
            com.google.android.exoplayer2.audio.DefaultAudioSink r7 = (com.google.android.exoplayer2.audio.DefaultAudioSink) r7     // Catch:{ 275 -> 0x00b0 }
            boolean r0 = com.google.android.exoplayer2.util.Util.A0G(r4)     // Catch:{ 275 -> 0x00b0 }
            if (r0 != 0) goto L_0x0065
            X.4Pr r0 = r7.A0a     // Catch:{ 275 -> 0x00b0 }
            int[] r0 = r0.A00     // Catch:{ 275 -> 0x00b0 }
            int r0 = java.util.Arrays.binarySearch(r0, r4)     // Catch:{ 275 -> 0x00b0 }
            if (r0 < 0) goto L_0x0064
            r0 = -1
            if (r6 == r0) goto L_0x0065
            if (r6 > r3) goto L_0x0064
            goto L_0x0065
        L_0x0063:
            r8 = 0
        L_0x0064:
            return r8
        L_0x0065:
            int r4 = r12.A06     // Catch:{ 275 -> 0x00b0 }
            java.util.List r1 = r5.A0O(r12, r1, r2)     // Catch:{ 275 -> 0x00b0 }
            boolean r0 = r1.isEmpty()     // Catch:{ 275 -> 0x00b0 }
            if (r0 == 0) goto L_0x0074
            r8 = 129(0x81, float:1.81E-43)
            return r8
        L_0x0074:
            if (r10 != 0) goto L_0x0079
            r8 = 130(0x82, float:1.82E-43)
            return r8
        L_0x0079:
            java.lang.Object r2 = r1.get(r2)     // Catch:{ 275 -> 0x00b0 }
            X.2Km r2 = (X.2Km) r2     // Catch:{ 275 -> 0x00b0 }
            int r0 = r12.A0G     // Catch:{ 275 -> 0x00b0 }
            r1 = -1
            if (r0 == r1) goto L_0x008a
            boolean r0 = r2.A07(r0)     // Catch:{ 275 -> 0x00b0 }
            if (r0 == 0) goto L_0x009b
        L_0x008a:
            if (r4 == r1) goto L_0x0092
            boolean r0 = r2.A06(r4)     // Catch:{ 275 -> 0x00b0 }
            if (r0 == 0) goto L_0x009b
        L_0x0092:
            boolean r0 = r2.A0A(r12)     // Catch:{ 275 -> 0x00b0 }
            if (r0 == 0) goto L_0x009c
            r3 = 16
            goto L_0x009c
        L_0x009b:
            r9 = 3
        L_0x009c:
            r8 = r3 | 32
            r8 = r8 | r9
            return r8
        L_0x00a0:
            boolean r0 = r11.A0W(r12)     // Catch:{ 275 -> 0x00b0 }
            if (r0 == 0) goto L_0x00a9
            r8 = 20
            return r8
        L_0x00a9:
            boolean r0 = r11.A0N     // Catch:{ 275 -> 0x00b0 }
            int r8 = X.AnonymousClass4PI.A01(r12, r1, r0)     // Catch:{ 275 -> 0x00b0 }
            return r8
        L_0x00b0:
            r2 = move-exception
            r1 = 4002(0xfa2, float:5.608E-42)
            r0 = 0
            X.48u r0 = r11.A0F(r12, r2, r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4PJ.Ez5(X.3wB):int");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.4PO, java.lang.Object] */
    public AnonymousClass4PJ(AnonymousClass4PH r5, AnonymousClass2SB r6, C265114Sp r7, C256823wP r8, int i, boolean z) {
        super(i);
        r6.getClass();
        this.A0X = r6;
        this.A0W = r5;
        this.A0a = r8;
        this.A0e = r7;
        this.A0c = z;
        this.A0Z = new AnonymousClass4PQ(0);
        this.A0d = new AnonymousClass4PQ(0);
        this.A0Y = new Object();
        this.A0b = new ArrayList();
        this.A0V = new MediaCodec.BufferInfo();
        this.A0f = new ArrayDeque();
        this.A0E = AnonymousClass4PW.A01;
        this.A00 = 0;
        this.A01 = 0;
        this.A04 = -9223372036854775807L;
        this.A05 = -9223372036854775807L;
        this.A0g = 2BY.A02(2BQ.A1K);
        this.A0h = 2BY.A02(2BQ.A17);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0037, code lost:
        if ((android.os.SystemClock.elapsedRealtime() - r1.A0K) < 500) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Q() {
        /*
            r7 = this;
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.A0R = r1
            r7.A0A()
            r0 = -1
            r7.A03 = r0
            r0 = 0
            r7.A0F = r0
            r5 = 1
            r7.A0P = r5
            r6 = 0
            r7.A0Q = r6
            r7.A0M = r6
            java.util.List r0 = r7.A0b
            r0.clear()
            r7.A0J = r6
            r7.A05 = r1
            r1 = r7
            boolean r0 = r7 instanceof X.AnonymousClass4PI
            if (r0 == 0) goto L_0x0039
            X.4PI r1 = (X.AnonymousClass4PI) r1
            boolean r0 = r1.A0U
            if (r0 == 0) goto L_0x0039
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r1.A0K
            long r3 = r3 - r0
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x004f
        L_0x0039:
            int r0 = r7.A01
            if (r0 != 0) goto L_0x004f
            X.3n3 r0 = r7.A0B
            r0.flush()
            r7.A0H = r6
        L_0x0044:
            boolean r0 = r7.A0U
            if (r0 == 0) goto L_0x004e
            X.3wB r0 = r7.A08
            if (r0 == 0) goto L_0x004e
            r7.A00 = r5
        L_0x004e:
            return
        L_0x004f:
            r7.A0R()
            r7.A0S()
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4PJ.A0Q():void");
    }

    public void A0R() {
        boolean z;
        this.A0R = -9223372036854775807L;
        A0A();
        this.A03 = -1;
        this.A0F = null;
        this.A07 = null;
        this.A0Q = false;
        this.A0M = false;
        this.A0b.clear();
        this.A0C = null;
        this.A0U = false;
        this.A0H = false;
        this.A00 = 0;
        this.A01 = 0;
        C251403n3 r7 = this.A0B;
        if (r7 != null) {
            this.A09.A03++;
            try {
                2SC r4 = 2SC.A05;
                if (this instanceof AnonymousClass4PI) {
                    z = true;
                } else {
                    z = false;
                }
                r4.A02(this.A0W.A00, this.A0X, r7, AnonymousClass05K.A01, this.A0T, z);
                this.A0B = null;
                C290325f8 r1 = this.A0A;
                if (r1 != null && this.A0S != r1) {
                    try {
                        r1.ECN((C265184Sw) null);
                    } finally {
                    }
                }
            } catch (Throwable th) {
                this.A0B = null;
                C290325f8 r12 = this.A0A;
                if (!(r12 == null || this.A0S == r12)) {
                    r12.ECN((C265184Sw) null);
                }
                throw th;
            } finally {
                this.A0A = null;
                this.A0T = null;
            }
        }
    }
}
