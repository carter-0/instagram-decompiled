package X;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.webrtc.AndroidVideoDecoder;

@Deprecated
/* renamed from: X.5O2  reason: invalid class name */
public class AnonymousClass5O2 extends AnonymousClass4TZ {
    public static boolean A0l;
    public static boolean A0m;
    public static final int[] A0n = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public Surface A0B;
    public W6C A0C;
    public PlaceholderSurface A0D;
    public AnonymousClass4SC A0E;
    public C264344Pn A0F;
    public boolean A0G = true;
    public boolean A0H;
    public boolean A0I = false;
    public boolean A0J = false;
    public boolean A0K;
    public boolean A0L = false;
    public boolean A0M = false;
    public boolean A0N = true;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public long A0U;
    public long A0V;
    public C256873wU A0W;
    public C290375fD A0X;
    public C264344Pn A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public final long A0c;
    public final Context A0d;
    public final C264264Pf A0e;
    public final C264324Pl A0f;
    public final boolean A0g = 2BY.A02(2BQ.A1M);
    public final AnonymousClass5O3 A0h;
    public final AnonymousClass4PZ A0i;
    public final boolean A0j;
    public final boolean A0k = 2BY.A02(2BQ.A1K);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0080, code lost:
        if (com.google.android.exoplayer2.util.Util.A04.startsWith("Pixel ") == false) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5O2(android.content.Context r18, android.os.Handler r19, X.C256873wU r20, X.AnonymousClass4PH r21, X.AnonymousClass2SB r22, X.C284785Nx r23, X.C256823wP r24, X.AnonymousClass4PC r25, java.lang.Object r26, long r27, boolean r29) {
        /*
            r17 = this;
            r15 = 1
            r13 = 1106247680(0x41f00000, float:30.0)
            r4 = 0
            r14 = 2
            r7 = r17
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r26
            r16 = r29
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r7.A0N = r15
            r7.A0G = r15
            r7.A0M = r4
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.A0I = r4
            r7.A0J = r4
            r7.A0L = r4
            X.2BQ r0 = X.2BQ.A1K
            boolean r0 = X.2BY.A02(r0)
            r7.A0k = r0
            X.2BQ r0 = X.2BQ.A1M
            boolean r0 = X.2BY.A02(r0)
            r7.A0g = r0
            r0 = r27
            r7.A0c = r0
            r1 = r18
            android.content.Context r5 = r1.getApplicationContext()
            r7.A0d = r5
            r0 = r20
            r7.A0W = r0
            X.4PZ r0 = new X.4PZ
            r0.<init>(r1)
            r7.A0i = r0
            X.4Pf r1 = new X.4Pf
            r1.<init>(r5)
            r7.A0e = r1
            X.4Pl r0 = new X.4Pl
            r6 = r19
            r5 = r25
            r0.<init>(r6, r5)
            r7.A0f = r0
            X.5O3 r0 = new X.5O3
            r0.<init>(r7, r1)
            r7.A0h = r0
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.A03
            java.lang.String r0 = "NVIDIA"
            boolean r0 = r0.equals(r1)
            r7.A0j = r0
            int r1 = com.google.android.exoplayer2.util.Util.A00
            r0 = 29
            if (r1 != r0) goto L_0x0082
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.A04
            java.lang.String r0 = "Pixel "
            boolean r1 = r1.startsWith(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0083
        L_0x0082:
            r0 = 0
        L_0x0083:
            r7.A0a = r0
            r7.A07 = r2
            r7.A0S = r15
            X.4Pn r0 = X.C264344Pn.A04
            r7.A0Y = r0
            r7.A0T = r4
            X.2BQ r0 = X.2BQ.A0s
            boolean r0 = X.2BY.A02(r0)
            r7.A0J = r0
            X.2BQ r0 = X.2BQ.A0u
            boolean r0 = X.2BY.A02(r0)
            r7.A0L = r0
            r0 = 0
            r7.A0F = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5O2.<init>(android.content.Context, android.os.Handler, X.3wU, X.4PH, X.2SB, X.5Nx, X.3wP, X.4PC, java.lang.Object, long, boolean):void");
    }

    private void A04() {
        C251403n3 r1;
        this.A0Q = false;
        if (this.A0b && (r1 = this.A0H) != null) {
            this.A0C = new W6C(r1, this);
        }
    }

    public final void A0H() {
        this.A01 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A05 = SystemClock.elapsedRealtime();
        this.A08 = SystemClock.elapsedRealtime() * 1000;
        this.A0A = 0;
        this.A04 = 0;
        if (!this.A0g || this.A0k) {
            this.A0e.A03();
        }
    }

    public final void A0K() {
        this.A0F = null;
        A04();
        if (this.A0g) {
            AnonymousClass4PZ r2 = this.A0i;
            if (r2.A09 != null) {
                C264214Pa r1 = r2.A0A;
                if (r1 != null) {
                    r1.A00.unregisterDisplayListener(r1);
                }
                r2.A0B.A02.sendEmptyMessage(2);
            }
        }
        this.A0K = false;
        this.A0C = null;
        this.A02 = 0;
        this.A03 = 0;
        try {
            super.A0K();
            C264324Pl r3 = this.A0f;
            C266094Xn r22 = this.A0E;
            synchronized (r22) {
            }
            r3.A00.post(new C292295ii(r22, r3));
            if (!2BY.A02(2BQ.A16)) {
                r3.A00(C264344Pn.A04);
            }
        } catch (Throwable th) {
            C264324Pl r32 = this.A0f;
            C266094Xn r23 = this.A0E;
            synchronized (r23) {
                r32.A00.post(new C292295ii(r23, r32));
                if (!2BY.A02(2BQ.A16)) {
                    r32.A00(C264344Pn.A04);
                }
                throw th;
            }
        }
    }

    public final float A0O(C256683wB r7, C256683wB[] r8, float f) {
        float f2 = -1.0f;
        for (C256683wB r0 : r8) {
            float f3 = r0.A01;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 != -1.0f) {
            return f2 * f;
        }
        return -1.0f;
    }

    public final int A0P(C256683wB r7, C256823wP r8) {
        C256683wB r2 = r7;
        if (A0q(r7)) {
            return 20;
        }
        return A00(this.A0d, this.A0W, r2, r8, this.A0b, this.A0Y);
    }

    public final boolean A0n() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007e, code lost:
        if (r9 == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00bd, code lost:
        if (CaO() == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00f1, code lost:
        if (r4 == 2) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00f9, code lost:
        if (r9 == null) goto L_0x017c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CIs(int r8, java.lang.Object r9) {
        /*
            r7 = this;
            r5 = 1
            if (r8 == r5) goto L_0x0078
            r0 = 7
            if (r8 == r0) goto L_0x0177
            r0 = 10
            if (r8 == r0) goto L_0x0064
            r0 = 4
            if (r8 == r0) goto L_0x0054
            r0 = 5
            if (r8 == r0) goto L_0x0042
            r0 = 13
            if (r8 == r0) goto L_0x015b
            r0 = 14
            if (r8 != r0) goto L_0x0041
            r9.getClass()
            X.4S7 r9 = (X.AnonymousClass4S7) r9
            int r0 = r9.A01
            if (r0 == 0) goto L_0x0041
            int r0 = r9.A00
            if (r0 == 0) goto L_0x0041
            android.view.Surface r2 = r7.A0B
            if (r2 == 0) goto L_0x0041
            X.5O3 r1 = r7.A0h
            android.util.Pair r0 = r1.A00
            if (r0 == 0) goto L_0x0154
            java.lang.Object r0 = r0.first
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0154
            android.util.Pair r0 = r1.A00
            java.lang.Object r0 = r0.second
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0154
        L_0x0041:
            return
        L_0x0042:
            X.4Pf r2 = r7.A0e
            java.lang.Number r9 = (java.lang.Number) r9
            int r1 = r9.intValue()
            int r0 = r2.A01
            if (r0 == r1) goto L_0x0041
            r2.A01 = r1
            X.C264264Pf.A02(r2, r5)
            return
        L_0x0054:
            java.lang.Number r9 = (java.lang.Number) r9
            int r1 = r9.intValue()
            r7.A0S = r1
            X.3n3 r0 = r7.A0H
            if (r0 == 0) goto L_0x0041
            r0.setVideoScalingMode(r1)
            return
        L_0x0064:
            java.lang.Number r9 = (java.lang.Number) r9
            int r1 = r9.intValue()
            int r0 = r7.A0T
            if (r0 == r1) goto L_0x0041
            r7.A0T = r1
            boolean r0 = r7.A0b
            if (r0 == 0) goto L_0x0041
            r7.A0Z()
            return
        L_0x0078:
            boolean r0 = r9 instanceof android.view.Surface
            if (r0 == 0) goto L_0x00e1
            android.view.Surface r9 = (android.view.Surface) r9
            if (r9 != 0) goto L_0x0085
        L_0x0080:
            com.google.android.exoplayer2.video.PlaceholderSurface r0 = r7.A0D
            if (r0 == 0) goto L_0x00ce
            r9 = r0
        L_0x0085:
            X.2BQ r0 = X.2BQ.A0R
            boolean r6 = X.2BY.A02(r0)
            android.view.Surface r0 = r7.A0B
            if (r0 == r9) goto L_0x0139
            r7.A0B = r9
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.A09 = r0
            boolean r0 = r7.A0g
            if (r0 != 0) goto L_0x00af
            X.4Pf r2 = r7.A0e
            r1 = r9
            boolean r0 = r9 instanceof com.google.android.exoplayer2.video.PlaceholderSurface
            if (r0 == 0) goto L_0x00a3
            r1 = 0
        L_0x00a3:
            android.view.Surface r0 = r2.A09
            if (r0 == r1) goto L_0x00af
            X.C264264Pf.A01(r2)
            r2.A09 = r1
            X.C264264Pf.A02(r2, r5)
        L_0x00af:
            r0 = 0
            r7.A0K = r0
            int r4 = r7.A01
            boolean r0 = r7.A0M
            if (r0 == 0) goto L_0x00bf
            boolean r0 = r7.CaO()
            r3 = 1
            if (r0 != 0) goto L_0x00c0
        L_0x00bf:
            r3 = 0
        L_0x00c0:
            X.3n3 r1 = r7.A0H
            r2 = 2
            if (r1 == 0) goto L_0x00eb
            if (r9 == 0) goto L_0x00f3
            boolean r0 = r7.A0H
            if (r0 != 0) goto L_0x00f3
            if (r6 == 0) goto L_0x00e7
            goto L_0x00e3
        L_0x00ce:
            X.2Km r1 = r7.A0I
            if (r1 == 0) goto L_0x0085
            boolean r0 = r7.A07(r1)
            if (r0 == 0) goto L_0x0085
            boolean r0 = r1.A06
            com.google.android.exoplayer2.video.PlaceholderSurface r9 = com.google.android.exoplayer2.video.PlaceholderSurface.A00(r0)
            r7.A0D = r9
            goto L_0x0085
        L_0x00e1:
            r9 = 0
            goto L_0x0080
        L_0x00e3:
            r1.setOutputSurface(r9)     // Catch:{ IllegalStateException -> 0x00fc }
            goto L_0x0102
        L_0x00e7:
            r1.setOutputSurface(r9)
            goto L_0x0102
        L_0x00eb:
            boolean r0 = r7.A0J
            if (r0 == 0) goto L_0x00f9
            if (r4 == r5) goto L_0x00f3
            if (r4 != r2) goto L_0x00f9
        L_0x00f3:
            r7.A0Z()
            r7.A0Y()
        L_0x00f9:
            if (r9 == 0) goto L_0x017c
            goto L_0x0102
        L_0x00fc:
            r7.A0Z()
            r7.A0Y()
        L_0x0102:
            com.google.android.exoplayer2.video.PlaceholderSurface r0 = r7.A0D
            if (r9 == r0) goto L_0x017c
            X.4Pn r1 = r7.A0F
            if (r1 == 0) goto L_0x010f
            X.4Pl r0 = r7.A0f
            r0.A00(r1)
        L_0x010f:
            r7.A04()
            if (r4 == r2) goto L_0x0116
            if (r3 == 0) goto L_0x0041
        L_0x0116:
            boolean r0 = r7.A0L
            if (r0 == 0) goto L_0x0123
            if (r3 == 0) goto L_0x0123
            X.3n3 r0 = r7.A0H
            if (r0 != 0) goto L_0x0123
            r7.A0Y()
        L_0x0123:
            long r3 = r7.A0c
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0133
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 + r3
        L_0x0130:
            r7.A07 = r0
            return
        L_0x0133:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0130
        L_0x0139:
            if (r9 == 0) goto L_0x0041
            com.google.android.exoplayer2.video.PlaceholderSurface r0 = r7.A0D
            if (r9 == r0) goto L_0x0041
            X.4Pn r1 = r7.A0F
            if (r1 == 0) goto L_0x0148
            X.4Pl r0 = r7.A0f
            r0.A00(r1)
        L_0x0148:
            boolean r0 = r7.A0K
            if (r0 == 0) goto L_0x0041
            X.4Pl r1 = r7.A0f
            android.view.Surface r0 = r7.A0B
            r1.A01(r0)
            return
        L_0x0154:
            android.util.Pair r0 = android.util.Pair.create(r2, r9)
            r1.A00 = r0
            return
        L_0x015b:
            r9.getClass()
            java.util.Collection r9 = (java.util.Collection) r9
            X.5O3 r1 = r7.A0h
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.A01
            if (r0 != 0) goto L_0x016e
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>(r9)
            r1.A01 = r0
            return
        L_0x016e:
            r0.clear()
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.A01
            r0.addAll(r9)
            return
        L_0x0177:
            X.4SC r9 = (X.AnonymousClass4SC) r9
            r7.A0E = r9
            return
        L_0x017c:
            r0 = 0
            r7.A0F = r0
            r7.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5O2.CIs(int, java.lang.Object):void");
    }

    public final String getName() {
        return "MediaCodecVideoRenderer2";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x012d, code lost:
        if (r13 != false) goto L_0x00b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(android.content.Context r17, X.C256873wU r18, X.C256683wB r19, X.C256823wP r20, boolean r21, boolean r22) {
        /*
            X.2BQ r0 = X.2BQ.A0e
            boolean r15 = X.2BY.A02(r0)
            r4 = r19
            java.lang.String r10 = r4.A0W
            boolean r0 = X.2Kn.A06(r10)
            r5 = 0
            r16 = r18
            r3 = r20
            if (r0 != 0) goto L_0x002b
            if (r15 == 0) goto L_0x0027
            r20 = 128(0x80, float:1.794E-43)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x001e:
            r19 = r2
            r18 = r3
            r17 = r4
            A05(r16, r17, r18, r19, r20, r21)
        L_0x0027:
            r14 = 128(0x80, float:1.794E-43)
        L_0x0029:
            r5 = r5 | r14
            return r5
        L_0x002b:
            com.google.android.exoplayer2.drm.DrmInitData r0 = r4.A0O
            r6 = 1
            r1 = 0
            if (r0 == 0) goto L_0x0032
            r1 = 1
        L_0x0032:
            r7 = r17
            java.util.List r2 = A03(r7, r4, r3, r1, r5)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x005e
            if (r21 == 0) goto L_0x005e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r0 = X.2BR.A03(r4)
            if (r0 == 0) goto L_0x005e
            java.util.List r8 = r3.Ave(r0, r5, r5)
            java.lang.String r0 = "video/dolby-vision"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x005e
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x005e
            r2 = r8
        L_0x005e:
            if (r1 == 0) goto L_0x006a
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x006a
            java.util.List r2 = A03(r7, r4, r3, r5, r5)
        L_0x006a:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0080
            if (r15 == 0) goto L_0x007d
            r20 = 129(0x81, float:1.81E-43)
            r19 = r2
            r18 = r3
            r17 = r4
            A05(r16, r17, r18, r19, r20, r21)
        L_0x007d:
            r5 = 129(0x81, float:1.81E-43)
            return r5
        L_0x0080:
            int r8 = r4.A07
            if (r8 == 0) goto L_0x008d
            r0 = 2
            if (r8 == r0) goto L_0x008d
            r5 = 2
            if (r15 == 0) goto L_0x0027
            r20 = 130(0x82, float:1.82E-43)
            goto L_0x001e
        L_0x008d:
            java.lang.Object r8 = r2.get(r5)
            X.2Km r8 = (X.2Km) r8
            boolean r13 = r8.A09(r4)
            if (r13 != 0) goto L_0x012b
            if (r22 != 0) goto L_0x012b
            r11 = 1
        L_0x009c:
            int r0 = r2.size()
            if (r11 >= r0) goto L_0x012b
            java.lang.Object r9 = r2.get(r11)
            X.2Km r9 = (X.2Km) r9
            boolean r0 = r9.A09(r4)
            if (r0 == 0) goto L_0x0127
            r8 = r9
            r13 = 1
            r12 = 0
        L_0x00b1:
            r11 = 4
        L_0x00b2:
            boolean r0 = r8.A0A(r4)
            r9 = 8
            if (r0 == 0) goto L_0x00bc
            r9 = 16
        L_0x00bc:
            boolean r0 = r8.A05
            r8 = 0
            if (r0 == 0) goto L_0x00c3
            r8 = 64
        L_0x00c3:
            X.2BQ r0 = X.2BQ.A12
            boolean r0 = X.2BY.A02(r0)
            if (r0 == 0) goto L_0x00cc
            r8 = 0
        L_0x00cc:
            r14 = 0
            if (r12 == 0) goto L_0x00d1
            r14 = 128(0x80, float:1.794E-43)
        L_0x00d1:
            java.lang.String r0 = "video/dolby-vision"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x00e1
            boolean r0 = X.C9693RfB.A00(r7)
            if (r0 != 0) goto L_0x00e1
            r14 = 256(0x100, float:3.59E-43)
        L_0x00e1:
            X.2BQ r0 = X.2BQ.A14
            boolean r0 = X.2BY.A02(r0)
            if (r0 == 0) goto L_0x00ea
            r14 = 0
        L_0x00ea:
            if (r13 == 0) goto L_0x010e
            java.util.List r1 = A03(r7, r4, r3, r1, r6)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x010e
            java.util.ArrayList r0 = X.2BR.A04(r4, r1)
            java.lang.Object r1 = r0.get(r5)
            X.2Km r1 = (X.2Km) r1
            boolean r0 = r1.A09(r4)
            if (r0 == 0) goto L_0x010e
            boolean r0 = r1.A0A(r4)
            if (r0 == 0) goto L_0x010e
            r5 = 32
        L_0x010e:
            if (r15 == 0) goto L_0x0121
            r20 = r11 | r9
            r20 = r20 | r5
            r20 = r20 | r8
            r20 = r20 | r14
            r19 = r2
            r18 = r3
            r17 = r4
            A05(r16, r17, r18, r19, r20, r21)
        L_0x0121:
            r11 = r11 | r9
            r11 = r11 | r5
            r5 = r11 | r8
            goto L_0x0029
        L_0x0127:
            int r11 = r11 + 1
            goto L_0x009c
        L_0x012b:
            r12 = 1
            r11 = 3
            if (r13 == 0) goto L_0x00b2
            goto L_0x00b1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5O2.A00(android.content.Context, X.3wU, X.3wB, X.3wP, boolean, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008c, code lost:
        r0 = X.AnonymousClass000.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a9, code lost:
        if (r4.equals(r0) != false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ab, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ba, code lost:
        if (X.2BY.A02(X.2BQ.A0M) != false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bc, code lost:
        r1 = r1 * r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bd, code lost:
        r2 = r1 * 3;
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c1, code lost:
        return r2 / r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(X.C256683wB r9, X.2Km r10) {
        /*
            int r1 = r9.A0L
            int r3 = r9.A0A
            r2 = -1
            if (r1 == r2) goto L_0x0037
            if (r3 == r2) goto L_0x0037
            java.lang.String r4 = r9.A0W
            java.lang.String r0 = "video/dolby-vision"
            boolean r0 = r0.equals(r4)
            java.lang.String r8 = "video/avc"
            java.lang.String r7 = "video/hevc"
            r6 = 1
            r5 = 2
            if (r0 == 0) goto L_0x0030
            android.util.Pair r0 = X.2BR.A00(r9)
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r0 = r0.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = 512(0x200, float:7.175E-43)
            if (r4 == r0) goto L_0x002f
            if (r4 == r6) goto L_0x002f
            if (r4 != r5) goto L_0x00c2
        L_0x002f:
            r4 = r8
        L_0x0030:
            int r0 = r4.hashCode()
            switch(r0) {
                case -1664118616: goto L_0x00a3;
                case -1662735862: goto L_0x00ac;
                case -1662541442: goto L_0x0091;
                case 1187890754: goto L_0x008a;
                case 1331836730: goto L_0x0049;
                case 1599127256: goto L_0x0046;
                case 1599127257: goto L_0x0038;
                default: goto L_0x0037;
            }
        L_0x0037:
            return r2
        L_0x0038:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0037
            int r1 = r1 * r3
            int r2 = r1 * 3
            r0 = 8
            goto L_0x00c0
        L_0x0046:
            r0 = 1922(0x782, float:2.693E-42)
            goto L_0x008c
        L_0x0049:
            boolean r0 = r4.equals(r8)
            if (r0 == 0) goto L_0x0037
            java.lang.String r5 = com.google.android.exoplayer2.util.Util.A04
            java.lang.String r0 = "BRAVIA 4K 2015"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0037
            java.lang.String r4 = com.google.android.exoplayer2.util.Util.A03
            java.lang.String r0 = "Amazon"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = "KFSOWI"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "AFTS"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0078
            boolean r0 = r10.A06
            if (r0 == 0) goto L_0x0078
            return r2
        L_0x0078:
            r2 = 16
            int r0 = r1 + 16
            int r1 = r0 + -1
            int r1 = r1 / r2
            int r0 = r3 + 16
            int r0 = r0 + -1
            int r0 = r0 / r2
            int r1 = r1 * r0
            int r0 = r1 * 16
            int r1 = r0 * 16
            goto L_0x00bd
        L_0x008a:
            r0 = 1921(0x781, float:2.692E-42)
        L_0x008c:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x00a5
        L_0x0091:
            boolean r0 = r4.equals(r7)
            if (r0 == 0) goto L_0x0037
            r2 = 2097152(0x200000, float:2.938736E-39)
            int r1 = r1 * r3
            int r1 = r1 * 3
            r0 = 4
            int r1 = r1 / r0
            int r2 = java.lang.Math.max(r2, r1)
            return r2
        L_0x00a3:
            java.lang.String r0 = "video/3gpp"
        L_0x00a5:
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00bc
            return r2
        L_0x00ac:
            java.lang.String r0 = "video/av01"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0037
            X.2BQ r0 = X.2BQ.A0M
            boolean r0 = X.2BY.A02(r0)
            if (r0 == 0) goto L_0x0037
        L_0x00bc:
            int r1 = r1 * r3
        L_0x00bd:
            int r2 = r1 * 3
            r0 = 4
        L_0x00c0:
            int r2 = r2 / r0
            return r2
        L_0x00c2:
            r4 = r7
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5O2.A01(X.3wB, X.2Km):int");
    }

    public static int A02(C256683wB r6, 2Km r7) {
        int i = r6.A0B;
        if (i == -1) {
            return A01(r6, r7);
        }
        List list = r6.A0X;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((byte[]) list.get(i3)).length;
        }
        return i + i2;
    }

    public static List A03(Context context, C256683wB r3, C256823wP r4, boolean z, boolean z2) {
        List Ave;
        String str = r3.A0W;
        if (str == null) {
            return ImmutableList.of();
        }
        if ("video/dolby-vision".equals(str) && !C9693RfB.A00(context)) {
            String A032 = 2BR.A03(r3);
            if (A032 == null) {
                Ave = ImmutableList.of();
            } else {
                Ave = r4.Ave(A032, z, z2);
            }
            if (!Ave.isEmpty()) {
                return Ave;
            }
        }
        return 2BR.A02(r3, r4, z, z2);
    }

    public static void A05(C256873wU r11, C256683wB r12, C256823wP r13, List list, int i, boolean z) {
        try {
            int A012 = AnonymousClass4PI.A01(r12, r13, z);
            if (A012 != (i & 63)) {
                String str = r12.A0W;
                boolean z2 = false;
                if (r12.A0O != null) {
                    z2 = true;
                }
                List<2Km> Ave = r13.Ave(str, z2, false);
                StringBuilder sb = new StringBuilder();
                sb.append("MCR1 returned 0b");
                sb.append(Integer.toBinaryString(A012));
                sb.append(" and MCR2 returned 0b");
                sb.append(Integer.toBinaryString(i));
                sb.append(" for ");
                sb.append(r12);
                sb.append("\nMCR2 Codecs: \n");
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    sb.append("\t");
                    sb.append(((2Km) it.next()).A03);
                    sb.append("\n");
                }
                sb.append("MCR1 Codecs: \n");
                for (2Km r0 : Ave) {
                    sb.append("\t");
                    sb.append(r0.A03);
                    sb.append("\n");
                }
                String obj = sb.toString();
                2AG.A04("MediaCodecVideoRenderer2", obj);
                if (r11 != null) {
                    r11.ClG(obj);
                }
            }
        } catch (AnonymousClass275 e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MCR1 threw an exception");
            sb2.append(e);
            sb2.append(" and MCR2 returned 0b");
            sb2.append(Integer.toBinaryString(i));
            sb2.append(" for ");
            sb2.append(r12);
            sb2.append("\nMCR2 Codecs: \n");
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                sb2.append("\t");
                sb2.append(((2Km) it2.next()).A03);
                sb2.append("\n");
            }
            String obj2 = sb2.toString();
            2AG.A04("MediaCodecVideoRenderer2", obj2);
            if (r11 != null) {
                r11.ClG(obj2);
            }
        }
    }

    private boolean A07(2Km r2) {
        if (!this.A0N || this.A0b || A08(r2.A03)) {
            return false;
        }
        if (!r2.A06 || PlaceholderSurface.A01()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0066, code lost:
        if (r1.equals(r0) != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0068, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A08(java.lang.String r2) {
        /*
            java.lang.String r0 = "OMX.google"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            java.lang.Class<X.4PI> r2 = X.AnonymousClass4PI.class
            monitor-enter(r2)
            boolean r0 = A0m     // Catch:{ all -> 0x0074 }
            if (r0 != 0) goto L_0x0070
            int r1 = com.google.android.exoplayer2.util.Util.A00     // Catch:{ all -> 0x0074 }
            r0 = 28
            if (r1 > r0) goto L_0x0020
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.A01     // Catch:{ all -> 0x0074 }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x0074 }
            switch(r0) {
                case -1339091551: goto L_0x002a;
                case -1220081023: goto L_0x002d;
                case -1220066608: goto L_0x0030;
                case -1012436106: goto L_0x0033;
                case -760312546: goto L_0x0036;
                case -64886864: goto L_0x0039;
                case 3415681: goto L_0x003c;
                case 825323514: goto L_0x003f;
                default: goto L_0x0020;
            }     // Catch:{ all -> 0x0074 }
        L_0x0020:
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.A04     // Catch:{ all -> 0x0074 }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x0074 }
            switch(r0) {
                case -349662828: goto L_0x0048;
                case -321033677: goto L_0x004b;
                case 2006354: goto L_0x004e;
                case 2006367: goto L_0x0051;
                case 2006371: goto L_0x0054;
                case 1785421873: goto L_0x0057;
                case 1785421876: goto L_0x005a;
                case 1798172390: goto L_0x005d;
                case 2119412532: goto L_0x0060;
                default: goto L_0x0029;
            }     // Catch:{ all -> 0x0074 }
        L_0x0029:
            goto L_0x0068
        L_0x002a:
            java.lang.String r0 = "dangal"
            goto L_0x0041
        L_0x002d:
            java.lang.String r0 = "dangalFHD"
            goto L_0x0041
        L_0x0030:
            java.lang.String r0 = "dangalUHD"
            goto L_0x0041
        L_0x0033:
            java.lang.String r0 = "oneday"
            goto L_0x0041
        L_0x0036:
            java.lang.String r0 = "aquaman"
            goto L_0x0041
        L_0x0039:
            java.lang.String r0 = "magnolia"
            goto L_0x0041
        L_0x003c:
            java.lang.String r0 = "once"
            goto L_0x0041
        L_0x003f:
            java.lang.String r0 = "machuca"
        L_0x0041:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0074 }
            if (r0 != 0) goto L_0x006a
            goto L_0x0020
        L_0x0048:
            java.lang.String r0 = "AFTJMST12"
            goto L_0x0062
        L_0x004b:
            java.lang.String r0 = "AFTKMST12"
            goto L_0x0062
        L_0x004e:
            java.lang.String r0 = "AFTA"
            goto L_0x0062
        L_0x0051:
            java.lang.String r0 = "AFTN"
            goto L_0x0062
        L_0x0054:
            java.lang.String r0 = "AFTR"
            goto L_0x0062
        L_0x0057:
            java.lang.String r0 = "AFTEU011"
            goto L_0x0062
        L_0x005a:
            java.lang.String r0 = "AFTEU014"
            goto L_0x0062
        L_0x005d:
            java.lang.String r0 = "AFTSO001"
            goto L_0x0062
        L_0x0060:
            java.lang.String r0 = "AFTEUFF014"
        L_0x0062:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0074 }
            if (r0 != 0) goto L_0x006a
        L_0x0068:
            r0 = 0
            goto L_0x006b
        L_0x006a:
            r0 = 1
        L_0x006b:
            A0l = r0     // Catch:{ all -> 0x0074 }
            r0 = 1
            A0m = r0     // Catch:{ all -> 0x0074 }
        L_0x0070:
            monitor-exit(r2)     // Catch:{ all -> 0x0074 }
            boolean r0 = A0l
            return r0
        L_0x0074:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0074 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5O2.A08(java.lang.String):boolean");
    }

    public final C290365fC A0Q(C256683wB r10, C256683wB r11, 2Km r12) {
        int i;
        String str;
        int i2;
        C256683wB r4 = r10;
        C256683wB r5 = r11;
        if (!A0q(this.A0C) || !r10.A0W.equals(r11.A0W) || r10.A0F != r11.A0F) {
            C290365fC A052 = r12.A05(r10, r11);
            i = A052.A00;
            int i3 = r11.A0L;
            C290375fD r2 = this.A0X;
            if (i3 > r2.A02 || r11.A0A > r2.A00) {
                i |= 256;
            }
            if (A02(r11, r12) > this.A0X.A01) {
                i |= 64;
            }
            str = r12.A03;
            if (i != 0) {
                i2 = 0;
            } else {
                i2 = A052.A01;
            }
        } else {
            str = r12.A03;
            i2 = 3;
            i = 0;
        }
        return new C290365fC(r4, r5, str, i2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011e, code lost:
        if (r0.isFeatureSupported("low-latency") == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0177, code lost:
        if (r13.A0A == -1) goto L_0x0179;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C290385fE A0S(android.media.MediaCrypto r24, X.C256683wB r25, X.2Km r26, float r27) {
        /*
            r23 = this;
            r9 = r23
            com.google.android.exoplayer2.video.PlaceholderSurface r2 = r9.A0D
            r7 = r26
            if (r2 == 0) goto L_0x001a
            boolean r1 = r2.A01
            boolean r0 = r7.A06
            if (r1 == r0) goto L_0x001a
            android.view.Surface r1 = r9.A0B
            r0 = 0
            if (r1 != r2) goto L_0x0015
            r9.A0B = r0
        L_0x0015:
            r2.release()
            r9.A0D = r0
        L_0x001a:
            java.lang.String r0 = r7.A01
            r22 = r0
            X.3wB[] r12 = r9.A08
            r12.getClass()
            r8 = r25
            int r10 = r8.A0L
            r21 = r10
            int r6 = r8.A0A
            r20 = r6
            int r5 = A02(r8, r7)
            int r11 = r12.length
            r0 = 1
            r4 = -1
            if (r11 != r0) goto L_0x014e
            if (r5 == r4) goto L_0x0047
            int r2 = A01(r8, r7)
            if (r2 == r4) goto L_0x0047
            float r1 = (float) r5
            r0 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 * r0
            int r0 = (int) r1
            int r5 = java.lang.Math.min(r0, r2)
        L_0x0047:
            X.5fD r11 = new X.5fD
            r11.<init>(r10, r6, r5)
            r9.A0X = r11
            boolean r5 = r9.A0j
            boolean r0 = r9.A0b
            r4 = 0
            if (r0 == 0) goto L_0x014b
            int r2 = r9.A0T
        L_0x0057:
            android.media.MediaFormat r3 = new android.media.MediaFormat
            r3.<init>()
            java.lang.String r1 = "mime"
            r0 = r22
            r3.setString(r1, r0)
            java.lang.String r1 = "width"
            r0 = r21
            r3.setInteger(r1, r0)
            java.lang.String r1 = "height"
            r0 = r20
            r3.setInteger(r1, r0)
            java.util.List r0 = r8.A0X
            X.AnonymousClass4YU.A02(r3, r0)
            float r6 = r8.A01
            java.lang.String r1 = "frame-rate"
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0083
            r3.setFloat(r1, r6)
        L_0x0083:
            int r1 = r8.A0F
            java.lang.String r0 = "rotation-degrees"
            r6 = -1
            if (r1 == r6) goto L_0x008d
            r3.setInteger(r0, r1)
        L_0x008d:
            com.google.android.exoplayer2.video.ColorInfo r0 = r8.A0Q
            X.AnonymousClass4YU.A01(r3, r0)
            java.lang.String r1 = r8.A0W
            java.lang.String r0 = "video/dolby-vision"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b1
            android.util.Pair r0 = X.2BR.A00(r8)
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r0 = r0.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.String r0 = "profile"
            if (r1 == r6) goto L_0x00b1
            r3.setInteger(r0, r1)
        L_0x00b1:
            int r1 = r11.A02
            java.lang.String r0 = "max-width"
            r3.setInteger(r0, r1)
            int r1 = r11.A00
            java.lang.String r0 = "max-height"
            r3.setInteger(r0, r1)
            int r1 = r11.A01
            java.lang.String r0 = "max-input-size"
            if (r1 == r6) goto L_0x00c8
            r3.setInteger(r0, r1)
        L_0x00c8:
            int r10 = com.google.android.exoplayer2.util.Util.A00
            java.lang.String r0 = "priority"
            r3.setInteger(r0, r4)
            r1 = r27
            int r0 = (r27 > r12 ? 1 : (r27 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x00da
            java.lang.String r0 = "operating-rate"
            r3.setFloat(r0, r1)
        L_0x00da:
            if (r5 == 0) goto L_0x00e7
            r1 = 1
            java.lang.String r0 = "no-post-process"
            r3.setInteger(r0, r1)
            java.lang.String r0 = "auto-frc"
            r3.setInteger(r0, r4)
        L_0x00e7:
            if (r2 == 0) goto L_0x00f4
            java.lang.String r1 = "tunneled-playback"
            r0 = 1
            r3.setFeatureEnabled(r1, r0)
            java.lang.String r0 = "audio-session-id"
            r3.setInteger(r0, r2)
        L_0x00f4:
            android.view.Surface r0 = r9.A0B
            if (r0 != 0) goto L_0x010c
            boolean r0 = r9.A07(r7)
            if (r0 == 0) goto L_0x0212
            com.google.android.exoplayer2.video.PlaceholderSurface r0 = r9.A0D
            if (r0 != 0) goto L_0x010a
            boolean r0 = r7.A06
            com.google.android.exoplayer2.video.PlaceholderSurface r0 = com.google.android.exoplayer2.video.PlaceholderSurface.A00(r0)
            r9.A0D = r0
        L_0x010a:
            r9.A0B = r0
        L_0x010c:
            X.2SB r11 = r9.A0t
            boolean r0 = r11.A08
            java.lang.String r6 = "low-latency"
            r5 = 1
            if (r0 == 0) goto L_0x0120
            android.media.MediaCodecInfo$CodecCapabilities r0 = r7.A00
            if (r0 == 0) goto L_0x0120
            boolean r0 = r0.isFeatureSupported(r6)
            r2 = 1
            if (r0 != 0) goto L_0x0121
        L_0x0120:
            r2 = 0
        L_0x0121:
            java.lang.String r1 = r7.A03
            java.lang.String r0 = "c2.android.av1-dav1d.decoder"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0130
            boolean r0 = r11.A04
            if (r0 == 0) goto L_0x0130
            r4 = 1
        L_0x0130:
            r0 = 30
            if (r10 < r0) goto L_0x013e
            if (r2 == 0) goto L_0x013e
            if (r4 != 0) goto L_0x013e
            r3.setFeatureEnabled(r6, r5)
            r3.setInteger(r6, r5)
        L_0x013e:
            android.view.Surface r0 = r9.A0B
            X.5fE r1 = new X.5fE
            r2 = r24
            r4 = r0
            r5 = r8
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L_0x014b:
            r2 = 0
            goto L_0x0057
        L_0x014e:
            r3 = 0
            r14 = 0
        L_0x0150:
            if (r3 >= r11) goto L_0x0190
            r13 = r12[r3]
            com.google.android.exoplayer2.video.ColorInfo r1 = r8.A0Q
            if (r1 == 0) goto L_0x0168
            com.google.android.exoplayer2.video.ColorInfo r0 = r13.A0Q
            if (r0 != 0) goto L_0x0168
            X.3w8 r0 = new X.3w8
            r0.<init>(r13)
            r0.A0O = r1
            X.3wB r13 = new X.3wB
            r13.<init>(r0)
        L_0x0168:
            X.5fC r0 = r7.A05(r8, r13)
            int r0 = r0.A01
            if (r0 == 0) goto L_0x018d
            int r2 = r13.A0L
            if (r2 == r4) goto L_0x0179
            int r1 = r13.A0A
            r0 = 0
            if (r1 != r4) goto L_0x017a
        L_0x0179:
            r0 = 1
        L_0x017a:
            r14 = r14 | r0
            int r10 = java.lang.Math.max(r10, r2)
            int r0 = r13.A0A
            int r6 = java.lang.Math.max(r6, r0)
            int r0 = A02(r13, r7)
            int r5 = java.lang.Math.max(r5, r0)
        L_0x018d:
            int r3 = r3 + 1
            goto L_0x0150
        L_0x0190:
            if (r14 == 0) goto L_0x0047
            java.lang.String r0 = "Resolutions unknown. Codec max resolution: "
            java.lang.String r4 = "x"
            java.lang.String r0 = X.002.A02(r10, r6, r0, r4)
            java.lang.String r3 = "MediaCodecVideoRenderer2"
            X.2AG.A04(r3, r0)
            r19 = r21
            r2 = 0
            r17 = 0
            r18 = r20
            r1 = r21
            r0 = r20
            if (r0 <= r1) goto L_0x01b2
            r17 = 1
            r19 = r0
            r18 = r1
        L_0x01b2:
            r0 = r18
            float r11 = (float) r0
            r0 = r19
            float r0 = (float) r0
            float r11 = r11 / r0
            int[] r16 = A0n
            r12 = 9
        L_0x01bd:
            r13 = r16[r2]
            float r0 = (float) r13
            float r0 = r0 * r11
            int r1 = (int) r0
            r0 = r19
            if (r13 <= r0) goto L_0x0047
            r0 = r18
            if (r1 <= r0) goto L_0x0047
            r0 = r1
            if (r17 != 0) goto L_0x01cf
            r0 = r13
            r13 = r1
        L_0x01cf:
            android.graphics.Point r13 = r7.A04(r0, r13)
            float r0 = r8.A01
            int r15 = r13.x
            int r14 = r13.y
            double r0 = (double) r0
            boolean r0 = r7.A08(r15, r14, r0)
            if (r0 == 0) goto L_0x020d
            int r0 = r13.x
            int r10 = java.lang.Math.max(r10, r0)
            int r0 = r13.y
            int r6 = java.lang.Math.max(r6, r0)
            X.3w8 r1 = new X.3w8
            r1.<init>(r8)
            r1.A0J = r10
            r1.A08 = r6
            X.3wB r0 = new X.3wB
            r0.<init>(r1)
            int r0 = A01(r0, r7)
            int r5 = java.lang.Math.max(r5, r0)
            java.lang.String r0 = "Codec max resolution adjusted to: "
            java.lang.String r0 = X.002.A02(r10, r6, r0, r4)
            X.2AG.A04(r3, r0)
            goto L_0x0047
        L_0x020d:
            int r2 = r2 + 1
            if (r2 >= r12) goto L_0x0047
            goto L_0x01bd
        L_0x0212:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5O2.A0S(android.media.MediaCrypto, X.3wB, X.2Km, float):X.5fE");
    }

    public final C8318Qny A0T(2Km r3, Throwable th) {
        return new C8317Qnx(this.A0B, r3, th);
    }

    public final ArrayList A0U(C256683wB r6, C256823wP r7, boolean z) {
        List unmodifiableList;
        ArrayList A042 = 2BR.A04(r6, A03(this.A0d, r6, r7, z, this.A0b));
        if (2BY.A02(2BQ.A0e)) {
            String str = r6.A0W;
            if (str == null) {
                unmodifiableList = Collections.emptyList();
            } else {
                unmodifiableList = Collections.unmodifiableList(r7.Ave(str, z, false));
            }
            if (unmodifiableList.size() == A042.size()) {
                int i = 0;
                while (true) {
                    if (i < unmodifiableList.size()) {
                        if (!((2Km) unmodifiableList.get(i)).A03.equals(((2Km) A042.get(i)).A03)) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("MCR1 supported decoders differs from MCR2 supported decoders for ");
            sb.append(r6);
            sb.append("\nMCR1 Decoders:\n");
            A06(sb, unmodifiableList);
            sb.append("MCR2 Decoders:\n");
            A06(sb, A042);
            String obj = sb.toString();
            2AG.A04("MediaCodecVideoRenderer2", obj);
            C256873wU r0 = this.A0W;
            if (r0 != null) {
                r0.ClG(obj);
            }
        }
        return A042;
    }

    public final void A0d(MediaFormat mediaFormat, C256683wB r8) {
        int integer;
        int integer2;
        C251403n3 r1 = this.A0H;
        if (r1 != null) {
            r1.setVideoScalingMode(this.A0S);
        }
        if (this.A0b) {
            integer = r8.A0L;
            integer2 = r8.A0A;
        } else {
            mediaFormat.getClass();
            if (!mediaFormat.containsKey(AndroidVideoDecoder.MEDIA_FORMAT_KEY_CROP_RIGHT) || !mediaFormat.containsKey(AndroidVideoDecoder.MEDIA_FORMAT_KEY_CROP_LEFT) || !mediaFormat.containsKey(AndroidVideoDecoder.MEDIA_FORMAT_KEY_CROP_BOTTOM) || !mediaFormat.containsKey(AndroidVideoDecoder.MEDIA_FORMAT_KEY_CROP_TOP)) {
                integer = mediaFormat.getInteger(IgReactMediaPickerNativeModule.WIDTH);
                integer2 = mediaFormat.getInteger(IgReactMediaPickerNativeModule.HEIGHT);
            } else {
                integer = (mediaFormat.getInteger(AndroidVideoDecoder.MEDIA_FORMAT_KEY_CROP_RIGHT) - mediaFormat.getInteger(AndroidVideoDecoder.MEDIA_FORMAT_KEY_CROP_LEFT)) + 1;
                integer2 = (mediaFormat.getInteger(AndroidVideoDecoder.MEDIA_FORMAT_KEY_CROP_BOTTOM) - mediaFormat.getInteger(AndroidVideoDecoder.MEDIA_FORMAT_KEY_CROP_TOP)) + 1;
            }
        }
        float f = r8.A02;
        int i = r8.A0F;
        if (i == 90 || i == 270) {
            f = 1.0f / f;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.A0Y = new C264344Pn(f, integer, integer2, 0);
        this.A0e.A05(r8.A01);
    }

    public final void A0f(C256683wB r2) {
        if (this.A0k) {
            this.A0h.A00(r2);
        }
    }

    public final void A0g(C256683wB r2, String str) {
        this.A0f.A02(str);
        this.A0h.A00(r2);
    }

    public final void A0h(AnonymousClass4PQ r9) {
        if (this.A0Z) {
            ByteBuffer byteBuffer = r9.A03;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b != -75 || s != 60 || s2 != 1 || b2 != 4) {
                    return;
                }
                if (b3 == 0 || b3 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    C251403n3 r2 = this.A0H;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    r2.setParameters(bundle);
                }
            }
        }
    }

    public void A0i(AnonymousClass4PQ r2) {
        if (!this.A0b) {
            this.A00++;
        }
    }

    public final void A0j(C290385fE r9, String str, long j, long j2) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C264324Pl r2 = this.A0f;
        r2.A00.post(new C266224Ya(r2, str, j2));
        this.A0H = A08(str);
        2Km r22 = this.A0I;
        r22.getClass();
        int i = Util.A00;
        boolean z = false;
        if (i >= 29 && "video/x-vnd.on2.vp9".equals(r22.A02)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = r22.A00;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (codecProfileLevelArr[i2].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.A0Z = z;
        if (this.A0b) {
            C251403n3 r1 = this.A0H;
            r1.getClass();
            this.A0C = new W6C(r1, this);
        }
        if (this.A0k) {
            Context context = this.A0h.A05.A0d;
            if (i >= 29) {
                context.getApplicationContext().getApplicationInfo();
            }
        }
    }

    public final void A0k(Exception exc) {
        2AG.A05("MediaCodecVideoRenderer2", "Video codec error", exc);
        C264324Pl r2 = this.A0f;
        r2.A00.post(new C22400Y2i(r2, exc));
    }

    public final void A0l(String str) {
        this.A0f.A02(str);
    }

    public final void A0m(String str) {
        C264324Pl r2 = this.A0f;
        r2.A00.post(new XDY(r2));
    }

    public final boolean A0o() {
        if (!this.A0a || SystemClock.elapsedRealtime() - this.A09 >= 500) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:142:0x0270  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0r(X.C256683wB r34, X.C251403n3 r35, java.nio.ByteBuffer r36, int r37, int r38, int r39, long r40, long r42, long r44, boolean r46, boolean r47) {
        /*
            r33 = this;
            r32 = r35
            r32.getClass()
            r6 = r33
            X.3n3 r1 = r6.A0H
            if (r1 == 0) goto L_0x0047
            boolean r0 = r6.A0I
            if (r0 != 0) goto L_0x0047
            int r1 = r1.getTotalSampleCount()
            r0 = 30
            if (r1 <= r0) goto L_0x0047
            X.3wB r5 = r6.A0C
            X.3n3 r0 = r6.A0H
            if (r0 == 0) goto L_0x0044
            if (r5 == 0) goto L_0x0044
            android.util.Pair r7 = r0.getPerFrameTotalDecodeTimeAndCount()
            java.lang.Object r0 = r7.first
            java.lang.Number r0 = (java.lang.Number) r0
            long r3 = r0.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0044
            X.4Xn r0 = r6.A0E
            r0.A00(r7)
            X.4Pl r3 = r6.A0f
            int r2 = r0.A00
            android.os.Handler r1 = r3.A00
            X.5jB r0 = new X.5jB
            r0.<init>(r5, r3, r2)
            r1.post(r0)
        L_0x0044:
            r0 = 1
            r6.A0I = r0
        L_0x0047:
            long r0 = r6.A06
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r24 ? 1 : (r0 == r24 ? 0 : -1))
            r14 = r40
            if (r2 != 0) goto L_0x0056
            r6.A06 = r14
        L_0x0056:
            long r2 = r6.A0U
            r0 = r44
            int r4 = (r44 > r2 ? 1 : (r44 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0065
            X.4Pf r2 = r6.A0e
            r2.A06(r0)
            r6.A0U = r0
        L_0x0065:
            X.5Nz r2 = r6.A0K
            long r9 = r2.A01
            long r27 = r44 - r9
            r23 = 1
            r31 = r37
            if (r46 == 0) goto L_0x007b
            if (r47 != 0) goto L_0x007b
            r1 = r32
            r0 = r31
            r6.A0w(r1, r0)
            return r23
        L_0x007b:
            int r11 = r6.A01
            r2 = 2
            r22 = 0
            r16 = 0
            if (r11 != r2) goto L_0x0086
            r16 = 1
        L_0x0086:
            long r12 = android.os.SystemClock.elapsedRealtime()
            r20 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r20
            float r2 = r6.A00
            double r7 = (double) r2
            long r18 = r44 - r40
            r2 = r18
            double r4 = (double) r2
            double r4 = r4 / r7
            long r2 = (long) r4
            if (r16 == 0) goto L_0x009d
            long r12 = r12 - r42
            long r2 = r2 - r12
        L_0x009d:
            android.view.Surface r5 = r6.A0B
            com.google.android.exoplayer2.video.PlaceholderSurface r4 = r6.A0D
            if (r5 != r4) goto L_0x00b4
            r4 = -30000(0xffffffffffff8ad0, double:NaN)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x015e
            r1 = r32
            r0 = r31
            r6.A0w(r1, r0)
            r6.A0v(r2)
            return r23
        L_0x00b4:
            r4 = 2
            r13 = 0
            if (r11 != r4) goto L_0x00b9
            r13 = 1
        L_0x00b9:
            boolean r4 = r6.A0P
            if (r4 != 0) goto L_0x00eb
            if (r13 != 0) goto L_0x00c3
            boolean r4 = r6.A0O
            if (r4 == 0) goto L_0x00f0
        L_0x00c3:
            r8 = 1
        L_0x00c4:
            long r11 = android.os.SystemClock.elapsedRealtime()
            long r11 = r11 * r20
            long r4 = r6.A08
            long r11 = r11 - r4
            long r4 = r6.A07
            int r7 = (r4 > r24 ? 1 : (r4 == r24 ? 0 : -1))
            r26 = r34
            if (r7 != 0) goto L_0x0110
            int r4 = (r40 > r9 ? 1 : (r40 == r9 ? 0 : -1))
            if (r4 < 0) goto L_0x0110
            if (r8 != 0) goto L_0x00f2
            if (r13 == 0) goto L_0x0110
            r7 = -30000(0xffffffffffff8ad0, double:NaN)
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0110
            r7 = 100000(0x186a0, double:4.94066E-319)
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x0110
            goto L_0x00f2
        L_0x00eb:
            boolean r4 = r6.A0Q
            if (r4 != 0) goto L_0x00f0
            goto L_0x00c3
        L_0x00f0:
            r8 = 0
            goto L_0x00c4
        L_0x00f2:
            long r4 = java.lang.System.nanoTime()     // Catch:{ IllegalStateException -> 0x028f }
            X.4SC r1 = r6.A0E     // Catch:{ IllegalStateException -> 0x028f }
            if (r1 == 0) goto L_0x0105
            android.media.MediaFormat r0 = r6.A09     // Catch:{ IllegalStateException -> 0x028f }
            r24 = r1
            r25 = r0
            r29 = r4
            r24.DxT(r25, r26, r27, r29)     // Catch:{ IllegalStateException -> 0x028f }
        L_0x0105:
            r1 = r32
            r0 = r31
            r6.A0x(r1, r0, r4)     // Catch:{ IllegalStateException -> 0x028f }
            r6.A0v(r2)     // Catch:{ IllegalStateException -> 0x028f }
            return r23
        L_0x0110:
            if (r16 == 0) goto L_0x015e
            long r4 = r6.A06
            int r7 = (r40 > r4 ? 1 : (r40 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x015e
            long r16 = java.lang.System.nanoTime()
            long r2 = r2 * r20
            long r12 = r16 + r2
            boolean r2 = r6.A0g
            if (r2 == 0) goto L_0x0219
            X.4PZ r2 = r6.A0i
            long r2 = r2.A01(r0, r12)
        L_0x012a:
            long r0 = r2 - r16
            long r0 = r0 / r20
            long r4 = r6.A07
            int r7 = (r4 > r24 ? 1 : (r4 == r24 ? 0 : -1))
            r5 = 0
            if (r7 == 0) goto L_0x0136
            r5 = 1
        L_0x0136:
            r7 = -500000(0xfffffffffff85ee0, double:NaN)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x016b
            if (r47 != 0) goto L_0x016b
            int r4 = r6.A0D(r14)
            if (r4 == 0) goto L_0x016b
            X.4Xn r2 = r6.A0E
            if (r5 == 0) goto L_0x015f
            int r0 = r2.A0A
            int r0 = r0 + r4
            r2.A0A = r0
            int r1 = r2.A0B
            int r0 = r6.A00
            int r1 = r1 + r0
            r2.A0B = r1
        L_0x0155:
            boolean r0 = r6.A0p()
            if (r0 == 0) goto L_0x015e
            r6.A0Y()
        L_0x015e:
            return r22
        L_0x015f:
            int r0 = r2.A06
            int r0 = r0 + 1
            r2.A06 = r0
            int r0 = r6.A00
            r6.A0t(r4, r0)
            goto L_0x0155
        L_0x016b:
            r7 = -30000(0xffffffffffff8ad0, double:NaN)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0198
            if (r47 != 0) goto L_0x0198
            if (r5 == 0) goto L_0x0180
            r3 = r32
            r2 = r31
            r6.A0w(r3, r2)
        L_0x017c:
            r6.A0v(r0)
            return r23
        L_0x0180:
            java.lang.String r2 = "dropVideoBuffer"
            X.27d.A01(r2)
            r4 = r32
            r3 = r31
            r2 = r22
            r4.releaseOutputBuffer((int) r3, (boolean) r2)
            X.27d.A00()
            r3 = r2
            r2 = r23
            r6.A0t(r3, r2)
            goto L_0x017c
        L_0x0198:
            r7 = 50000(0xc350, double:2.47033E-319)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x01c9
            long r7 = r6.A0V
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x01b2
            r5 = r32
            r4 = r31
            r6.A0w(r5, r4)
        L_0x01ac:
            r6.A0v(r0)
            r6.A0V = r2
            return r23
        L_0x01b2:
            X.4SC r5 = r6.A0E
            if (r5 == 0) goto L_0x01c1
            android.media.MediaFormat r4 = r6.A09
            r24 = r5
            r25 = r4
            r29 = r2
            r24.DxT(r25, r26, r27, r29)
        L_0x01c1:
            r5 = r32
            r4 = r31
            r6.A0x(r5, r4, r2)     // Catch:{ IllegalStateException -> 0x028f }
            goto L_0x01ac
        L_0x01c9:
            r0 = r26
            float r1 = r0.A01
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r11 = 1106247680(0x41f00000, float:30.0)
            if (r0 == 0) goto L_0x01d6
            r11 = r1
        L_0x01d6:
            java.util.UUID r0 = X.AnonymousClass4T7.A03
            long r0 = com.google.android.exoplayer2.util.Util.A08(r14)
            int r10 = (int) r0
            long r0 = com.google.android.exoplayer2.util.Util.A08(r18)
            int r9 = (int) r0
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r9 <= r3) goto L_0x015e
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r9 >= r0) goto L_0x015e
            int r5 = r10 + r9
            int r2 = r6.A02
            int r0 = r6.A03
            int r1 = r2 + r0
            int r0 = r1 + r3
            if (r5 <= r0) goto L_0x015e
            r7 = 4652007308841189376(0x408f400000000000, double:1000.0)
            if (r10 <= r2) goto L_0x0211
            if (r10 >= r1) goto L_0x0211
            X.4Xn r4 = r6.A0E
            int r3 = r4.A0E
            int r5 = r5 - r1
            float r0 = (float) r5
        L_0x0205:
            float r0 = r0 * r11
            double r1 = (double) r0
            double r1 = r1 / r7
            int r0 = (int) r1
            int r3 = r3 + r0
            r4.A0E = r3
        L_0x020c:
            r6.A02 = r10
            r6.A03 = r9
            return r22
        L_0x0211:
            if (r10 <= r1) goto L_0x020c
            X.4Xn r4 = r6.A0E
            int r3 = r4.A0E
            float r0 = (float) r9
            goto L_0x0205
        L_0x0219:
            X.4Pf r7 = r6.A0e
            long r10 = r7.A03
            r8 = -1
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0259
            X.4Pg r0 = r7.A0E
            X.4Ph r2 = r0.A03
            boolean r0 = r2.A02()
            if (r0 == 0) goto L_0x0259
            long r0 = r2.A01
            r4 = 0
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0238
            long r4 = r2.A02
            long r4 = r4 / r0
        L_0x0238:
            long r2 = r7.A04
            long r0 = r7.A02
            long r0 = r0 - r10
            long r4 = r4 * r0
            float r0 = (float) r4
            float r1 = r7.A00
            float r0 = r0 / r1
            long r0 = (long) r0
            long r2 = r2 + r0
            long r0 = r12 - r2
            long r10 = java.lang.Math.abs(r0)
            r4 = 20000000(0x1312d00, double:9.881313E-317)
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x025a
            r0 = 0
            r7.A02 = r0
            r7.A03 = r8
            r7.A05 = r8
        L_0x0259:
            r2 = r12
        L_0x025a:
            long r0 = r7.A02
            r7.A05 = r0
            r7.A06 = r2
            X.4Pk r5 = r7.A0F
            if (r5 == 0) goto L_0x012a
            long r0 = r7.A07
            int r4 = (r0 > r24 ? 1 : (r0 == r24 ? 0 : -1))
            if (r4 == 0) goto L_0x012a
            long r4 = r5.A04
            int r0 = (r4 > r24 ? 1 : (r4 == r24 ? 0 : -1))
            if (r0 == 0) goto L_0x012a
            long r0 = r7.A07
            long r8 = r2 - r4
            long r8 = r8 / r0
            long r8 = r8 * r0
            long r4 = r4 + r8
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 > 0) goto L_0x028b
            long r8 = r4 - r0
        L_0x027d:
            long r10 = r4 - r2
            long r2 = r2 - r8
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0285
            r4 = r8
        L_0x0285:
            long r0 = r7.A08
            long r4 = r4 - r0
            r2 = r4
            goto L_0x012a
        L_0x028b:
            long r0 = r0 + r4
            r8 = r4
            r4 = r0
            goto L_0x027d
        L_0x028f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5O2.A0r(X.3wB, X.3n3, java.nio.ByteBuffer, int, int, int, long, long, long, boolean, boolean):boolean");
    }

    public final boolean A0s(2Km r3) {
        Surface surface = this.A0B;
        if ((surface == null || (!this.A0G && !surface.isValid())) && !A07(r3)) {
            return false;
        }
        return true;
    }

    public final void A0t(int i, int i2) {
        C266094Xn r2 = this.A0E;
        r2.A05 += i;
        int i3 = i + i2;
        r2.A04 += i3;
        this.A01 += i3;
        int i4 = this.A0R + i3;
        this.A0R = i4;
        r2.A07 = Math.max(i4, r2.A07);
    }

    public final void A0v(long j) {
        C266094Xn r2 = this.A0E;
        r2.A0F += j;
        r2.A0D++;
        this.A0A += j;
        this.A04++;
    }

    public final void A0w(C251403n3 r3, int i) {
        27d.A01("skipVideoBuffer");
        r3.releaseOutputBuffer(i, false);
        27d.A00();
        this.A0E.A0B++;
    }

    public final void A0x(C251403n3 r7, int i, long j) {
        int i2;
        27d.A01("releaseOutputBuffer");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        r7.releaseOutputBuffer(i, j);
        this.A08 += SystemClock.elapsedRealtime() - elapsedRealtime;
        27d.A00();
        this.A0E.A09++;
        this.A0R = 0;
        this.A08 = SystemClock.elapsedRealtime() * 1000;
        C264344Pn r1 = this.A0Y;
        if (!r1.equals(C264344Pn.A04) && !r1.equals(this.A0F)) {
            this.A0F = r1;
            this.A0f.A00(r1);
        }
        this.A0P = true;
        if (!this.A0Q) {
            this.A0Q = true;
            this.A0f.A01(this.A0B);
            this.A0K = true;
        }
        C266094Xn r4 = this.A0E;
        long j2 = this.A08;
        int i3 = r4.A09;
        if (i3 == 0) {
            i2 = -1;
        } else {
            i2 = (int) (j2 / ((long) i3));
        }
        r4.A01 = i2;
    }

    public final boolean CSi() {
        return this.A0Z;
    }

    public static void A06(StringBuilder sb, List list) {
        String str;
        String str2;
        String str3;
        String str4;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            2Km r2 = (2Km) it.next();
            sb.append("\t");
            sb.append(r2.A03);
            sb.append(":");
            if (r2.A07) {
                str = "sw";
            } else {
                str = "hw";
            }
            sb.append(str);
            sb.append(":");
            if (r2.A05) {
                str2 = "hwAcc";
            } else {
                str2 = "noHwAcc";
            }
            sb.append(str2);
            sb.append(":");
            if (r2.A04) {
                str3 = "seamless";
            } else {
                str3 = "noSeamless";
            }
            sb.append(str3);
            sb.append(":");
            if (r2.A06) {
                str4 = "secure";
            } else {
                str4 = "noSecure";
            }
            sb.append(str4);
            sb.append("\n");
        }
    }

    public final void A0J() {
        try {
            super.A0J();
        } finally {
            PlaceholderSurface placeholderSurface = this.A0D;
            if (placeholderSurface != null) {
                PlaceholderSurface placeholderSurface2 = null;
                if (this.A0B == placeholderSurface) {
                    this.A0B = placeholderSurface2;
                }
                placeholderSurface.release();
                this.A0D = placeholderSurface2;
            }
        }
    }

    public final void A0L(long j, boolean z) {
        super.A0L(j, z);
        A04();
        if (!this.A0g) {
            C264264Pf r2 = this.A0e;
            r2.A02 = 0;
            r2.A03 = -1;
            r2.A05 = -1;
        }
        this.A02 = 0;
        this.A03 = 0;
        long j2 = -9223372036854775807L;
        this.A0U = -9223372036854775807L;
        this.A06 = -9223372036854775807L;
        this.A0R = 0;
        if (z) {
            long j3 = this.A0c;
            if (j3 > 0) {
                j2 = SystemClock.elapsedRealtime() + j3;
            } else {
                j2 = -9223372036854775807L;
            }
        }
        this.A07 = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r5.A0T != 0) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M(boolean r6, boolean r7) {
        /*
            r5 = this;
            super.A0M(r6, r7)
            X.4RW r0 = r5.A03
            r0.getClass()
            boolean r2 = r0.A00
            r4 = 0
            if (r2 == 0) goto L_0x0012
            int r1 = r5.A0T
            r0 = 0
            if (r1 == 0) goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            X.C256703wD.A04(r0)
            boolean r0 = r5.A0b
            if (r0 == r2) goto L_0x001f
            r5.A0b = r2
            r5.A0Z()
        L_0x001f:
            X.4Pl r3 = r5.A0f
            X.4Xn r2 = r5.A0E
            android.os.Handler r1 = r3.A00
            X.4Xo r0 = new X.4Xo
            r0.<init>(r2, r3)
            r1.post(r0)
            boolean r0 = r5.A0g
            if (r0 == 0) goto L_0x0036
            X.4PZ r0 = r5.A0i
            r0.A02()
        L_0x0036:
            r5.A0O = r7
            r5.A0P = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5O2.A0M(boolean, boolean):void");
    }

    public final C290365fC A0R(AnonymousClass4PO r6) {
        C290365fC A0R2 = super.A0R(r6);
        C264324Pl r3 = this.A0f;
        r3.A00.post(new C266234Yb(r6.A00, A0R2, r3));
        return A0R2;
    }

    public final void A0V() {
        A04();
    }

    public final void A0X() {
        super.A0X();
        this.A00 = 0;
    }

    public void A0b(long j) {
        super.A0b(j);
        if (!this.A0b) {
            this.A00--;
        }
    }

    public final void A0e(C256683wB r3) {
        int A002;
        if (A0q(r3) || ((A002 = 2BY.A00(2Bb.A07)) > 0 && r3.A0L > A002)) {
            this.A0h.A02 = false;
        }
    }

    public final void A0u(long j) {
        A0c(j);
        C264344Pn r1 = this.A0Y;
        if (!r1.equals(C264344Pn.A04) && !r1.equals(this.A0F)) {
            this.A0F = r1;
            this.A0f.A00(r1);
        }
        this.A0E.A09++;
        this.A0P = true;
        if (!this.A0Q) {
            this.A0Q = true;
            this.A0f.A01(this.A0B);
            this.A0K = true;
        }
        A0b(j);
    }

    public final boolean CaO() {
        PlaceholderSurface placeholderSurface;
        PlaceholderSurface placeholderSurface2;
        if (super.CaO() && !this.A0Q && (((placeholderSurface2 = this.A0D) == null || this.A0B != placeholderSurface2) && this.A0H != null && !this.A0b)) {
            this.A06 = AnonymousClass05K.A0Y;
        }
        if (!super.CaO() || (!this.A0Q && (((placeholderSurface = this.A0D) == null || this.A0B != placeholderSurface) && this.A0H != null && !this.A0b))) {
            long j = this.A07;
            if (j != -9223372036854775807L) {
                if (SystemClock.elapsedRealtime() >= j) {
                    this.A07 = -9223372036854775807L;
                }
            }
            return false;
        }
        this.A07 = -9223372036854775807L;
        return true;
    }

    public final void Eg2(float f, float f2) {
        super.Eg2(f, f2);
        if (!this.A0g) {
            C264264Pf r2 = this.A0e;
            r2.A00 = f;
            r2.A02 = 0;
            r2.A03 = -1;
            r2.A05 = -1;
            C264264Pf.A02(r2, false);
        }
    }

    public final void A0I() {
        this.A07 = -9223372036854775807L;
        if (this.A01 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C264324Pl r2 = this.A0f;
            r2.A00.post(new C290235ez(r2));
            this.A01 = 0;
            this.A05 = elapsedRealtime;
        }
        if (this.A04 != 0) {
            C264324Pl r22 = this.A0f;
            r22.A00.post(new XFA(r22));
            this.A0A = 0;
            this.A04 = 0;
        }
        if (!this.A0g || this.A0k) {
            this.A0e.A04();
        }
    }

    public final void EEq(long j, long j2) {
        super.EEq(j, j2);
    }
}
