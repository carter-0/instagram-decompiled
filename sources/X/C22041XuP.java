package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.XuP  reason: case insensitive filesystem */
public final class C22041XuP implements Handler.Callback, C22523Y7u, C22528Y7z, Y80, Y8E {
    public int A00 = 0;
    public long A01;
    public Timeline A02;
    public C21533Xe1 A03;
    public XU0 A04;
    public C22009Xqt A05;
    public C21976XoN A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A = false;
    public final HandlerThread A0B;
    public final Looper A0C;
    public final XcO A0D;
    public final SIQ A0E;
    public final YB5 A0F;
    public final C22520Y7r A0G;
    public final C21370XZd A0H;
    public final C22525Y7w A0I;
    public final C22526Y7x A0J;
    public final YB6 A0K;
    public final C21466Xby A0L;
    public final C21470Xc2 A0M;
    public final C22016XrA A0N;
    public final C21294XTo A0O;
    public final C21405XaD A0P;
    public final Y8G A0Q;
    public final ArrayList A0R;
    public final Set A0S;
    public final YCI[] A0T;
    public final Y82[] A0U;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.XU0, java.lang.Object] */
    public C22041XuP(Looper looper, YB5 yb5, C21533Xe1 xe1, C22525Y7w y7w, C22526Y7x y7x, YB6 yb6, C21976XoN xoN, YCG ycg, C22016XrA xrA, C21294XTo xTo, C21405XaD xaD, Y8G y8g, YCI[] yciArr) {
        this.A0I = y7w;
        YCI[] yciArr2 = yciArr;
        this.A0T = yciArr2;
        C21294XTo xTo2 = xTo;
        this.A0O = xTo2;
        C21405XaD xaD2 = xaD;
        this.A0P = xaD2;
        this.A0K = yb6;
        Y8G y8g2 = y8g;
        this.A0Q = y8g2;
        this.A06 = xoN;
        this.A0J = y7x;
        this.A0F = yb5;
        C22016XrA xrA2 = xrA;
        this.A0N = xrA2;
        this.A03 = xe1;
        this.A02 = Timeline.A00;
        C22009Xqt A002 = C22009Xqt.A00(xaD2);
        this.A05 = A002;
        ? obj = new Object();
        obj.A01 = A002;
        this.A04 = obj;
        int length = yciArr2.length;
        this.A0U = new Y82[length];
        C21151XGs xGs = (C21151XGs) xTo2;
        for (int i = 0; i < length; i++) {
            C22078Xv4 xv4 = yciArr[i];
            xv4.A00 = i;
            xv4.A04 = xrA2;
            xv4.A02 = yb5;
            Y82[] y82Arr = this.A0U;
            y82Arr[i] = xv4;
            if (xGs != null) {
                C22078Xv4 xv42 = (C22078Xv4) y82Arr[i];
                synchronized (xv42.A07) {
                    xv42.A03 = xGs;
                }
            }
        }
        this.A0H = new C21370XZd(yb5, this);
        this.A0R = AnonymousClass7TE.A1C();
        this.A0S = Collections.newSetFromMap(new IdentityHashMap());
        this.A0E = new SIQ();
        this.A0D = new XcO();
        xTo2.A00 = this;
        xTo2.A01 = y8g2;
        this.A07 = true;
        List list = C22061Xun.A01;
        C22061Xun xun = new C22061Xun(new Handler(looper, (Handler.Callback) null));
        YCG ycg2 = ycg;
        this.A0L = new C21466Xby(xun, xe1, new C22076Xv2(this), ycg2);
        this.A0M = new C21470Xc2(xun, this, ycg2, xrA2);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        AnonymousClass0fe.A00(handlerThread);
        this.A0B = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.A0C = looper2;
        this.A0G = new C22061Xun(new Handler(looper2, this));
    }

    public static void A08(C21491Xci xci) {
        synchronized (xci) {
        }
        try {
            xci.A07.CIs(xci.A00, xci.A02);
        } finally {
            xci.A01(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r4.A08 == false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A09(boolean r5, boolean r6) {
        /*
            r4 = this;
            r2 = 0
            r3 = 1
            if (r5 != 0) goto L_0x0009
            boolean r1 = r4.A08
            r0 = 0
            if (r1 != 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            r4.A0A(r0, r3, r2)
            X.XU0 r0 = r4.A04
            r0.A00(r6)
            X.YB6 r2 = r4.A0K
            X.XrA r1 = r4.A0N
            X.Xv1 r2 = (X.C22075Xv1) r2
            java.util.HashMap r0 = r2.A02
            java.lang.Object r0 = r0.remove(r1)
            if (r0 == 0) goto L_0x0023
            X.C22075Xv1.A00(r2)
        L_0x0023:
            r4.A02(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22041XuP.A09(boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r8.equals(r4.A05.A09) == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C22009Xqt A00(X.C21484Xcb r44, long r45) {
        /*
            r43 = this;
            r34 = 0
            r28 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = r43
            boolean r0 = r4.A07
            r8 = r44
            if (r0 != 0) goto L_0x0022
            X.Xqt r0 = r4.A05
            long r1 = r0.A0I
            int r0 = (r34 > r1 ? 1 : (r34 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0022
            X.Xqt r0 = r4.A05
            X.Xcb r0 = r0.A09
            boolean r1 = r8.equals(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0023
        L_0x0022:
            r0 = 1
        L_0x0023:
            r4.A07 = r0
            X.Xqt r1 = r4.A05
            X.XoM r7 = r1.A0A
            X.XaD r6 = r1.A0B
            java.util.List r5 = r1.A0C
            X.Xc2 r0 = r4.A0M
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0050
            X.XoM r7 = X.C21975XoM.A02
            X.XaD r6 = r4.A0P
            X.Y8D[] r3 = r6.A02
            com.google.common.collect.ImmutableList$Builder r0 = new com.google.common.collect.ImmutableList$Builder
            r0.<init>()
            int r2 = r3.length
            r1 = 0
        L_0x0040:
            if (r1 >= r2) goto L_0x005c
            r0 = r3[r1]
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = "formats"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x004d:
            int r1 = r1 + 1
            goto L_0x0040
        L_0x0050:
            X.Xcb r0 = r1.A09
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0060
            X.XoM r7 = X.C21975XoM.A02
            X.XaD r6 = r4.A0P
        L_0x005c:
            com.google.common.collect.ImmutableList r5 = com.google.common.collect.ImmutableList.of()
        L_0x0060:
            X.Xqt r0 = r4.A05
            androidx.media3.common.Timeline r15 = r0.A06
            int r14 = r0.A01
            X.XGY r13 = r0.A07
            boolean r12 = r0.A0D
            X.Xcb r11 = r0.A08
            boolean r10 = r0.A0E
            int r9 = r0.A00
            int r4 = r0.A02
            X.Xoc r3 = r0.A05
            long r1 = r0.A0G
            long r38 = android.os.SystemClock.elapsedRealtime()
            boolean r0 = r0.A0F
            X.Xqt r16 = new X.Xqt
            r30 = r45
            r32 = r1
            r36 = r34
            r40 = r12
            r41 = r10
            r42 = r0
            r27 = r4
            r26 = r9
            r25 = r14
            r24 = r5
            r23 = r6
            r22 = r7
            r21 = r11
            r20 = r8
            r19 = r13
            r18 = r15
            r17 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r32, r34, r36, r38, r40, r41, r42)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22041XuP.A00(X.Xcb, long):X.Xqt");
    }

    private void A01() {
        C22009Xqt xqt = this.A05;
        C21484Xcb xcb = xqt.A09;
        if (!xqt.A08.equals(xcb)) {
            this.A05 = this.A05.A06(xcb);
        }
        C22009Xqt xqt2 = this.A05;
        xqt2.A0G = xqt2.A0I;
        this.A05.A0J = 0;
    }

    private void A02(int i) {
        C22009Xqt xqt = this.A05;
        if (xqt.A01 != i) {
            this.A05 = xqt.A02(i);
        }
    }

    private void A03(C21982Xoc xoc) {
        ((C22061Xun) this.A0G).A00.removeMessages(16);
        C21432Xai xai = this.A0H.A01;
        if (xai.A03) {
            xai.A01 += Util.A03(SystemClock.elapsedRealtime() - xai.A00);
            if (xai.A03) {
                xai.A00 = SystemClock.elapsedRealtime();
            }
        }
        xai.A02 = xoc;
    }

    private void A04(C21982Xoc xoc, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                this.A04.A00(1);
            }
            C22009Xqt xqt = this.A05;
            Timeline timeline = xqt.A06;
            C21484Xcb xcb = xqt.A09;
            long j = xqt.A04;
            long j2 = xqt.A03;
            int i = xqt.A01;
            XGY xgy = xqt.A07;
            boolean z3 = xqt.A0D;
            C21975XoM xoM = xqt.A0A;
            C21405XaD xaD = xqt.A0B;
            List list = xqt.A0C;
            Timeline timeline2 = timeline;
            XGY xgy2 = xgy;
            C21484Xcb xcb2 = xcb;
            long j3 = j;
            this.A05 = new C22009Xqt(xoc, timeline2, xgy2, xcb2, xqt.A08, xoM, xaD, list, i, xqt.A00, xqt.A02, j3, j2, xqt.A0G, xqt.A0J, xqt.A0I, xqt.A0H, z3, xqt.A0E, xqt.A0F);
        }
        for (YCI yci : this.A0T) {
            if (yci != null && (yci instanceof C21145XGm)) {
                C21145XGm xGm = (C21145XGm) yci;
                if (xGm instanceof C21149XGq) {
                    xGm = (C21149XGq) xGm;
                }
                xGm.A01 = 1.0f;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (-9223372036854775807L != r3.A04) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00dc, code lost:
        if (-9223372036854775807L != r3.A04) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002e, code lost:
        if (0 != r11.A05.A0I) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A07(androidx.media3.common.Timeline r12, boolean r13) {
        /*
            r11 = this;
            X.Xqt r1 = r11.A05
            X.Xby r5 = r11.A0L
            boolean r7 = r11.A0A
            X.SIQ r4 = r11.A0E
            X.XcO r6 = r11.A0D
            int r0 = r12.A02()
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            if (r0 == 0) goto L_0x00a2
            X.Xcb r5 = X.C22009Xqt.A0K
            r4 = 0
            r3 = 1
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            X.Xcb r0 = r1.A09
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0030
            X.Xqt r0 = r11.A05
            long r0 = r0.A0I
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r7 = 0
            if (r2 == 0) goto L_0x0031
        L_0x0030:
            r7 = 1
        L_0x0031:
            r1 = 4
            X.Xqt r0 = r11.A05     // Catch:{ all -> 0x00d0 }
            int r0 = r0.A01     // Catch:{ all -> 0x00d0 }
            if (r0 == r3) goto L_0x003b
            r11.A02(r1)     // Catch:{ all -> 0x00d0 }
        L_0x003b:
            r11.A0A(r4, r4, r3)     // Catch:{ all -> 0x00d0 }
            X.YCI[] r4 = r11.A0T     // Catch:{ all -> 0x00d0 }
            int r3 = r4.length     // Catch:{ all -> 0x00d0 }
            r2 = 0
        L_0x0042:
            if (r2 >= r3) goto L_0x0055
            r1 = r4[r2]     // Catch:{ all -> 0x00d0 }
            X.Xv4 r1 = (X.C22078Xv4) r1     // Catch:{ all -> 0x00d0 }
            androidx.media3.common.Timeline r0 = r1.A01     // Catch:{ all -> 0x00d0 }
            boolean r0 = androidx.media3.common.util.Util.A0E(r0, r12)     // Catch:{ all -> 0x00d0 }
            if (r0 != 0) goto L_0x0052
            r1.A01 = r12     // Catch:{ all -> 0x00d0 }
        L_0x0052:
            int r2 = r2 + 1
            goto L_0x0042
        L_0x0055:
            r11.A06(r12, r5)
            if (r7 != 0) goto L_0x0062
            X.Xqt r3 = r11.A05
            long r0 = r3.A04
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0087
        L_0x0062:
            X.Xqt r3 = r11.A05
            X.Xcb r0 = r3.A09
            java.lang.Object r2 = r0.A04
            androidx.media3.common.Timeline r1 = r3.A06
            if (r7 == 0) goto L_0x007c
            if (r13 == 0) goto L_0x007c
            int r0 = r1.A02()
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            if (r0 != 0) goto L_0x007c
            r1.A09(r6, r2)
            goto L_0x00c5
        L_0x007c:
            long r0 = r3.A03
            r12.A05(r2)
            X.Xqt r3 = r11.A00(r5, r0)
            r11.A05 = r3
        L_0x0087:
            androidx.media3.common.Timeline r0 = r3.A06
            r11.A05(r12, r0)
            X.Xqt r0 = r11.A05
            X.Xqt r0 = r0.A04(r12)
            r11.A05 = r0
            r11.A01()
            X.Y7r r0 = r11.A0G
            r1 = 2
            X.Xun r0 = (X.C22061Xun) r0
            android.os.Handler r0 = r0.A00
            r0.sendEmptyMessage(r1)
            return
        L_0x00a2:
            X.Xcb r0 = r1.A09
            java.lang.Object r3 = r0.A04
            androidx.media3.common.Timeline r2 = r1.A06
            int r0 = r2.A02()
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            if (r0 == 0) goto L_0x00f4
            r0 = -1
            int r2 = r12.A06(r7)
            if (r2 == r0) goto L_0x00ca
            int r1 = r12.A02()
            r0 = 0
            if (r2 < r0) goto L_0x00f8
            if (r2 >= r1) goto L_0x00f8
            r12.A0A(r4, r2)
        L_0x00c5:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00ca:
            X.XcO r0 = r5.A02
            r12.A09(r0, r3)
            goto L_0x00c5
        L_0x00d0:
            r4 = move-exception
            r11.A06(r12, r5)
            if (r7 != 0) goto L_0x00de
            X.Xqt r3 = r11.A05
            long r1 = r3.A04
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0109
        L_0x00de:
            X.Xqt r1 = r11.A05
            X.Xcb r0 = r1.A09
            java.lang.Object r3 = r0.A04
            androidx.media3.common.Timeline r2 = r1.A06
            if (r7 == 0) goto L_0x00fe
            if (r13 == 0) goto L_0x00fe
            int r0 = r2.A02()
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            if (r0 != 0) goto L_0x00fe
        L_0x00f4:
            r2.A09(r6, r3)
            goto L_0x00c5
        L_0x00f8:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
        L_0x00fe:
            long r0 = r1.A03
            r12.A05(r3)
            X.Xqt r3 = r11.A00(r5, r0)
            r11.A05 = r3
        L_0x0109:
            androidx.media3.common.Timeline r0 = r3.A06
            r11.A05(r12, r0)
            X.Xqt r0 = r11.A05
            X.Xqt r0 = r0.A04(r12)
            r11.A05 = r0
            r11.A01()
            X.Y7r r0 = r11.A0G
            r1 = 2
            X.Xun r0 = (X.C22061Xun) r0
            android.os.Handler r0 = r0.A00
            r0.sendEmptyMessage(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22041XuP.A07(androidx.media3.common.Timeline, boolean):void");
    }

    private void A0A(boolean z, boolean z2, boolean z3) {
        ((C22061Xun) this.A0G).A00.removeMessages(2);
        XGY xgy = null;
        C21432Xai xai = this.A0H.A01;
        if (xai.A03) {
            xai.A01 += Util.A03(SystemClock.elapsedRealtime() - xai.A00);
            if (xai.A03) {
                xai.A00 = SystemClock.elapsedRealtime();
            }
            xai.A03 = false;
        }
        this.A01 = 1000000000000L;
        for (int i = 0; i < r3; i++) {
        }
        if (z) {
            for (YCI yci : this.A0T) {
                if (this.A0S.remove(yci)) {
                    try {
                        C22078Xv4 xv4 = (C22078Xv4) yci;
                        C11366SPh.A02(AnonymousClass7TF.A1Q(0));
                        xv4.A06.A00();
                        xv4.A01();
                    } catch (RuntimeException e) {
                        STH.A04("ExoPlayerImplInternal", C273654mx.A00(1360), e);
                    }
                }
            }
        }
        C22009Xqt xqt = this.A05;
        C21484Xcb xcb = xqt.A09;
        long j = xqt.A0I;
        C22009Xqt xqt2 = this.A05;
        C21484Xcb xcb2 = xqt2.A09;
        XcO xcO = this.A0D;
        Timeline timeline = xqt2.A06;
        if (!AnonymousClass7TF.A1Q(timeline.A02())) {
            timeline.A09(xcO, xcb2.A04);
            throw AnonymousClass00P.createAndThrow();
        }
        long j2 = xqt2.A04;
        C21466Xby xby = this.A0L;
        Timeline timeline2 = this.A05.A06;
        if (z2 && (timeline2 instanceof C21142XGj)) {
            C21142XGj xGj = (C21142XGj) timeline2;
            Y8A y8a = this.A0M.A01;
            Timeline[] timelineArr = xGj.A05;
            int length = timelineArr.length;
            Timeline[] timelineArr2 = new Timeline[length];
            for (int i2 = 0; i2 < length; i2++) {
                timelineArr2[i2] = new C21150XGr(timelineArr[i2], xGj);
            }
            timeline2 = new C21142XGj(y8a, timelineArr2, xGj.A06);
        }
        C22009Xqt xqt3 = this.A05;
        int i3 = xqt3.A01;
        if (!z3) {
            xgy = xqt3.A07;
        }
        C21975XoM xoM = xqt3.A0A;
        C21405XaD xaD = xqt3.A0B;
        List list = xqt3.A0C;
        boolean z4 = xqt3.A0E;
        this.A05 = new C22009Xqt(xqt3.A05, timeline2, xgy, xcb, xcb, xoM, xaD, list, i3, xqt3.A00, xqt3.A02, j2, j, j, 0, j, 0, false, z4, false);
        if (z2) {
            xby.A00();
            C21470Xc2 xc2 = this.A0M;
            HashMap hashMap = xc2.A06;
            Iterator A0t = AnonymousClass7TF.A0t(hashMap);
            if (A0t.hasNext()) {
                A0t.next();
                try {
                    throw AnonymousClass7TE.A11("mediaSource");
                } catch (RuntimeException e2) {
                    STH.A04(C273654mx.A00(1303), C273654mx.A00(1270), e2);
                    throw AnonymousClass7TE.A11("mediaSource");
                }
            } else {
                hashMap.clear();
                xc2.A0A.clear();
                xc2.A02 = false;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v61, resolved type: X.RCg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v62, resolved type: X.XQT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: X.XvK} */
    /* JADX WARNING: type inference failed for: r0v8, types: [X.XU0, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0175, code lost:
        A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0282, code lost:
        if (r8 > r5.A08.size()) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0363, code lost:
        if (r9 > r6.A08.size()) goto L_0x0365;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x03bc, code lost:
        if (r0 == r5) goto L_0x03be;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0499  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r20) {
        /*
            r19 = this;
            r3 = r19
            r0 = 1336(0x538, float:1.872E-42)
            java.lang.String r18 = X.C273654mx.A00(r0)
            java.lang.String r17 = "ExoPlayerImplInternal"
            r7 = 1000(0x3e8, float:1.401E-42)
            r12 = 4
            r4 = 0
            r2 = 1
            r5 = r20
            int r0 = r5.what     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            switch(r0) {
                case 1: goto L_0x0017;
                case 2: goto L_0x0089;
                case 3: goto L_0x00d8;
                case 4: goto L_0x00e4;
                case 5: goto L_0x00f6;
                case 6: goto L_0x00fe;
                case 7: goto L_0x0103;
                case 8: goto L_0x0486;
                case 9: goto L_0x0486;
                case 10: goto L_0x0486;
                case 11: goto L_0x0171;
                case 12: goto L_0x0168;
                case 13: goto L_0x017a;
                case 14: goto L_0x01cb;
                case 15: goto L_0x0202;
                case 16: goto L_0x023b;
                case 17: goto L_0x0244;
                case 18: goto L_0x0250;
                case 19: goto L_0x01bf;
                case 20: goto L_0x0268;
                case 21: goto L_0x02a2;
                case 22: goto L_0x0336;
                case 23: goto L_0x0486;
                case 24: goto L_0x0016;
                case 25: goto L_0x0341;
                case 26: goto L_0x0341;
                case 27: goto L_0x0348;
                case 28: goto L_0x038c;
                case 29: goto L_0x039b;
                default: goto L_0x0016;
            }     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
        L_0x0016:
            return r4
        L_0x0017:
            int r0 = r5.arg1     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            boolean r6 = X.AnonymousClass7TF.A1P(r0)
            int r0 = r5.arg2     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int r5 = r0 >> r12
            r1 = r0 & 15
            X.XU0 r0 = r3.A04     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0.A00(r2)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xqt r0 = r3.A05     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xqt r1 = r0.A03(r1, r5, r6)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r3.A05 = r1     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            boolean r0 = r1.A0E     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            if (r0 == 0) goto L_0x005c
            int r0 = r1.A02     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            if (r0 != 0) goto L_0x005c
            int r1 = r1.A01     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0 = 3
            r6 = 2
            if (r1 != r0) goto L_0x0059
            X.XZd r0 = r3.A0H     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xai r5 = r0.A01     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            boolean r0 = r5.A03     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            if (r0 != 0) goto L_0x004e
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r5.A00 = r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r5.A03 = r2     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
        L_0x004e:
            X.Y7r r0 = r3.A0G     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xun r0 = (X.C22061Xun) r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            android.os.Handler r0 = r0.A00     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0.sendEmptyMessage(r6)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            goto L_0x0486
        L_0x0059:
            if (r1 != r6) goto L_0x0486
            goto L_0x004e
        L_0x005c:
            X.XZd r0 = r3.A0H     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xai r10 = r0.A01     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            boolean r0 = r10.A03     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            if (r0 == 0) goto L_0x0080
            long r5 = r10.A01     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            long r0 = r10.A00     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            long r8 = r8 - r0
            long r0 = androidx.media3.common.util.Util.A03(r8)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            long r5 = r5 + r0
            r10.A01 = r5     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            boolean r0 = r10.A03     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            if (r0 == 0) goto L_0x007e
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r10.A00 = r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
        L_0x007e:
            r10.A03 = r4     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
        L_0x0080:
            X.YCI[] r0 = r3.A0T     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int r1 = r0.length     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0 = 0
        L_0x0084:
            if (r0 >= r1) goto L_0x0486
            int r0 = r0 + 1
            goto L_0x0084
        L_0x0089:
            long r5 = android.os.SystemClock.uptimeMillis()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Y7r r0 = r3.A0G     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r9 = 2
            X.Xun r0 = (X.C22061Xun) r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            android.os.Handler r8 = r0.A00     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r8.removeMessages(r9)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xqt r11 = r3.A05     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            androidx.media3.common.Timeline r10 = r11.A06     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int r0 = r10.A02()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            if (r0 != 0) goto L_0x00bb
            X.Xc2 r0 = r3.A0M     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            boolean r0 = r0.A02     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            if (r0 == 0) goto L_0x00bb
            X.Xby r5 = r3.A0L     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xcb r0 = r11.A09     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            java.lang.Object r1 = r0.A04     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.XcO r0 = r5.A02     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r10.A09(r0, r1)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            throw r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
        L_0x00bb:
            int r1 = r11.A01     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            if (r1 == r2) goto L_0x0486
            if (r1 == r12) goto L_0x0486
            r0 = 3
            if (r1 != r0) goto L_0x00d0
            boolean r0 = r11.A0E     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            if (r0 == 0) goto L_0x00cd
            int r0 = r11.A02     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            if (r0 != 0) goto L_0x00cd
            goto L_0x00d0
        L_0x00cd:
            r0 = 1000(0x3e8, double:4.94E-321)
            goto L_0x00d2
        L_0x00d0:
            r0 = 10
        L_0x00d2:
            long r5 = r5 + r0
            r8.sendEmptyMessageAtTime(r9, r5)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            goto L_0x0486
        L_0x00d8:
            X.XU0 r0 = r3.A04     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0.A00(r2)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            java.lang.String r0 = "timeline"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            throw r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
        L_0x00e4:
            java.lang.Object r0 = r5.obj     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xoc r0 = (X.C21982Xoc) r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r3.A03(r0)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.XZd r0 = r3.A0H     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xai r0 = r0.A01     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xoc r0 = r0.A02     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r3.A04(r0, r2, r2)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            goto L_0x0486
        L_0x00f6:
            java.lang.Object r0 = r5.obj     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.XoN r0 = (X.C21976XoN) r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r3.A06 = r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            goto L_0x0486
        L_0x00fe:
            r3.A09(r4, r2)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            goto L_0x0486
        L_0x0103:
            r3.A0A(r2, r2, r4)     // Catch:{ all -> 0x0156 }
            r6 = 0
        L_0x0107:
            X.YCI[] r0 = r3.A0T     // Catch:{ all -> 0x0156 }
            int r0 = r0.length     // Catch:{ all -> 0x0156 }
            if (r6 >= r0) goto L_0x0126
            X.Y82[] r0 = r3.A0U     // Catch:{ all -> 0x0156 }
            r5 = r0[r6]     // Catch:{ all -> 0x0156 }
            X.Xv4 r5 = (X.C22078Xv4) r5     // Catch:{ all -> 0x0156 }
            java.lang.Object r1 = r5.A07     // Catch:{ all -> 0x0156 }
            monitor-enter(r1)     // Catch:{ all -> 0x0156 }
            r0 = 0
            r5.A03 = r0     // Catch:{ all -> 0x0123 }
            monitor-exit(r1)     // Catch:{ all -> 0x0123 }
            boolean r0 = X.AnonymousClass7TF.A1Q(r4)
            X.C11366SPh.A02(r0)     // Catch:{ all -> 0x0156 }
            int r6 = r6 + 1
            goto L_0x0107
        L_0x0123:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0123 }
            throw r0     // Catch:{ all -> 0x0156 }
        L_0x0126:
            X.YB6 r5 = r3.A0K     // Catch:{ all -> 0x0156 }
            X.XrA r0 = r3.A0N     // Catch:{ all -> 0x0156 }
            X.Xv1 r5 = (X.C22075Xv1) r5     // Catch:{ all -> 0x0156 }
            java.util.HashMap r1 = r5.A02     // Catch:{ all -> 0x0156 }
            java.lang.Object r0 = r1.remove(r0)     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x0137
            X.C22075Xv1.A00(r5)     // Catch:{ all -> 0x0156 }
        L_0x0137:
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x0141
            r0 = -1
            r5.A00 = r0     // Catch:{ all -> 0x0156 }
        L_0x0141:
            r3.A02(r2)     // Catch:{ all -> 0x0156 }
            android.os.HandlerThread r0 = r3.A0B     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            if (r0 == 0) goto L_0x014b
            r0.quit()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
        L_0x014b:
            monitor-enter(r3)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r3.A09 = r2     // Catch:{ all -> 0x0153 }
            r3.notifyAll()     // Catch:{ all -> 0x0153 }
            monitor-exit(r3)     // Catch:{ all -> 0x0153 }
            return r2
        L_0x0153:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0153 }
            goto L_0x01ca
        L_0x0156:
            r1 = move-exception
            android.os.HandlerThread r0 = r3.A0B     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            if (r0 == 0) goto L_0x015e
            r0.quit()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
        L_0x015e:
            monitor-enter(r3)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r3.A09 = r2     // Catch:{ all -> 0x0166 }
            r3.notifyAll()     // Catch:{ all -> 0x0166 }
        L_0x0164:
            monitor-exit(r3)     // Catch:{ all -> 0x0166 }
            goto L_0x01ca
        L_0x0166:
            r1 = move-exception
            goto L_0x0164
        L_0x0168:
            int r0 = r5.arg1     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            r3.A0A = r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            goto L_0x0175
        L_0x0171:
            int r0 = r5.arg1     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r3.A00 = r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
        L_0x0175:
            r3.A01()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            goto L_0x0486
        L_0x017a:
            int r0 = r5.arg1     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            boolean r1 = X.AnonymousClass7TF.A1P(r0)
            java.lang.Object r9 = r5.obj     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            java.util.concurrent.atomic.AtomicBoolean r9 = (java.util.concurrent.atomic.AtomicBoolean) r9     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            boolean r0 = r3.A08     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            if (r0 == r1) goto L_0x01b0
            r3.A08 = r1     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            if (r1 != 0) goto L_0x01b0
            X.YCI[] r8 = r3.A0T     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int r6 = r8.length     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r5 = 0
        L_0x0190:
            if (r5 >= r6) goto L_0x01b0
            r1 = r8[r5]     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            java.util.Set r0 = r3.A0S     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            boolean r0 = r0.remove(r1)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            if (r0 == 0) goto L_0x01ad
            X.Xv4 r1 = (X.C22078Xv4) r1     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            boolean r0 = X.AnonymousClass7TF.A1Q(r4)
            X.C11366SPh.A02(r0)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.S02 r0 = r1.A06     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0.A00()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r1.A01()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
        L_0x01ad:
            int r5 = r5 + 1
            goto L_0x0190
        L_0x01b0:
            if (r9 == 0) goto L_0x0486
            monitor-enter(r3)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r9.set(r2)     // Catch:{ all -> 0x01bc }
            r3.notifyAll()     // Catch:{ all -> 0x01bc }
            monitor-exit(r3)     // Catch:{ all -> 0x01bc }
            goto L_0x0486
        L_0x01bc:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01bc }
            goto L_0x01ca
        L_0x01bf:
            X.XU0 r0 = r3.A04     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0.A00(r2)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            java.lang.String r0 = "fromIndex"
            java.lang.NullPointerException r1 = X.AnonymousClass7TE.A11(r0)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
        L_0x01ca:
            throw r1     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
        L_0x01cb:
            java.lang.Object r8 = r5.obj     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xci r8 = (X.C21491Xci) r8     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            android.os.Looper r1 = r8.A01     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            android.os.Looper r0 = r3.A0C     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            if (r1 != r0) goto L_0x01ed
            A08(r8)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xqt r0 = r3.A05     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int r5 = r0.A01     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0 = 3
            r1 = 2
            if (r5 == r0) goto L_0x01e2
            if (r5 != r1) goto L_0x0486
        L_0x01e2:
            X.Y7r r0 = r3.A0G     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xun r0 = (X.C22061Xun) r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            android.os.Handler r0 = r0.A00     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0.sendEmptyMessage(r1)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            goto L_0x0486
        L_0x01ed:
            X.Y7r r6 = r3.A0G     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r5 = 15
            X.Xun r6 = (X.C22061Xun) r6     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xq5 r1 = X.C22061Xun.A00()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            android.os.Handler r0 = r6.A00     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            android.os.Message r0 = r0.obtainMessage(r5, r8)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.C21997Xq5.A00(r0, r1, r6)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            goto L_0x0486
        L_0x0202:
            java.lang.Object r8 = r5.obj     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xci r8 = (X.C21491Xci) r8     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            android.os.Looper r6 = r8.A01     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            java.lang.Thread r0 = r6.getThread()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            boolean r0 = r0.isAlive()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            if (r0 != 0) goto L_0x0222
            java.lang.String r1 = "TAG"
            r0 = 515(0x203, float:7.22E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.STH.A03(r1, r0)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r8.A01(r4)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            goto L_0x0486
        L_0x0222:
            r5 = 0
            java.util.List r0 = X.C22061Xun.A01     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            android.os.Handler r1 = new android.os.Handler     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r1.<init>(r6, r5)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xun r0 = new X.Xun     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0.<init>(r1)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Y2L r1 = new X.Y2L     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r1.<init>(r3, r8)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            android.os.Handler r0 = r0.A00     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0.post(r1)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            goto L_0x0486
        L_0x023b:
            java.lang.Object r0 = r5.obj     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xoc r0 = (X.C21982Xoc) r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r3.A04(r0, r2, r4)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            goto L_0x0486
        L_0x0244:
            X.XU0 r0 = r3.A04     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0.A00(r2)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            java.lang.String r0 = "windowIndex"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            throw r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
        L_0x0250:
            int r5 = r5.arg1     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.XU0 r0 = r3.A04     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0.A00(r2)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xc2 r1 = r3.A0M     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0 = -1
            if (r5 != r0) goto L_0x0261
            java.util.List r0 = r1.A08     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0.size()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
        L_0x0261:
            java.lang.String r0 = "mediaSourceHolders"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            throw r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
        L_0x0268:
            int r9 = r5.arg1     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int r8 = r5.arg2     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            java.lang.Object r6 = r5.obj     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Y8A r6 = (X.Y8A) r6     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.XU0 r0 = r3.A04     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0.A00(r2)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xc2 r5 = r3.A0M     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            if (r9 < 0) goto L_0x0284
            if (r9 > r8) goto L_0x0284
            java.util.List r0 = r5.A08     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int r1 = r0.size()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0 = 1
            if (r8 <= r1) goto L_0x0285
        L_0x0284:
            r0 = 0
        L_0x0285:
            X.C11366SPh.A01(r0)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r5.A01 = r6     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int r8 = r8 - r2
            if (r8 < r9) goto L_0x0299
            java.util.List r0 = r5.A08     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0.remove(r8)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            java.lang.String r0 = "uid"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            throw r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
        L_0x0299:
            androidx.media3.common.Timeline r0 = r5.A00()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r3.A07(r0, r4)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            goto L_0x0486
        L_0x02a2:
            java.lang.Object r8 = r5.obj     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Y8A r8 = (X.Y8A) r8     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.XU0 r0 = r3.A04     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0.A00(r2)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xc2 r9 = r3.A0M     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            java.util.List r0 = r9.A08     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int r13 = r0.size()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r1 = r8
            X.XvK r1 = (X.C22094XvK) r1     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int[] r0 = r1.A02     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int r0 = r0.length     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            if (r0 == r13) goto L_0x032b
            java.util.Random r0 = r1.A00     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            long r0 = r0.nextLong()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            java.util.Random r5 = new java.util.Random     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r5.<init>(r0)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int[] r0 = new int[r4]     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.XvK r15 = new X.XvK     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r15.<init>(r5, r0)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int[] r14 = new int[r13]     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int[] r12 = new int[r13]     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r11 = 0
            r6 = 0
        L_0x02d3:
            if (r6 >= r13) goto L_0x02f0
            java.util.Random r1 = r15.A00     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int[] r0 = r15.A02     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int r0 = r0.length     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int r0 = r0 + 1
            int r0 = r1.nextInt(r0)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r14[r6] = r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int r5 = r6 + 1
            int r1 = r1.nextInt(r5)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0 = r12[r1]     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r12[r6] = r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r12[r1] = r6     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r6 = r5
            goto L_0x02d3
        L_0x02f0:
            java.util.Arrays.sort(r14)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int[] r10 = r15.A02     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int r8 = r10.length     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int r8 = r8 + r13
            int[] r6 = new int[r8]     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r5 = 0
            r0 = 0
        L_0x02fb:
            if (r11 >= r8) goto L_0x031b
            if (r5 >= r13) goto L_0x030c
            r1 = r14[r5]     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            if (r0 != r1) goto L_0x030c
            int r16 = r5 + 1
            r1 = r12[r5]     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r6[r11] = r1     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r5 = r16
            goto L_0x0318
        L_0x030c:
            int r1 = r0 + 1
            r0 = r10[r0]     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r6[r11] = r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            if (r0 < r4) goto L_0x0317
            int r0 = r0 + r13
            r6[r11] = r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
        L_0x0317:
            r0 = r1
        L_0x0318:
            int r11 = r11 + 1
            goto L_0x02fb
        L_0x031b:
            java.util.Random r0 = r15.A00     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            long r0 = r0.nextLong()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            java.util.Random r5 = new java.util.Random     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r5.<init>(r0)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.XvK r8 = new X.XvK     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r8.<init>(r5, r6)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
        L_0x032b:
            r9.A01 = r8     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            androidx.media3.common.Timeline r0 = r9.A00()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r3.A07(r0, r4)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            goto L_0x0486
        L_0x0336:
            X.Xc2 r0 = r3.A0M     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            androidx.media3.common.Timeline r0 = r0.A00()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r3.A07(r0, r2)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            goto L_0x0486
        L_0x0341:
            java.lang.String r0 = "info"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            throw r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
        L_0x0348:
            int r10 = r5.arg1     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int r9 = r5.arg2     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            java.lang.Object r8 = r5.obj     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.XU0 r0 = r3.A04     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0.A00(r2)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xc2 r6 = r3.A0M     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r5 = 0
            if (r10 < 0) goto L_0x0365
            if (r10 > r9) goto L_0x0365
            java.util.List r0 = r6.A08     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int r1 = r0.size()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0 = 1
            if (r9 <= r1) goto L_0x0366
        L_0x0365:
            r0 = 0
        L_0x0366:
            X.C11366SPh.A01(r0)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int r1 = r8.size()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int r0 = r9 - r10
            if (r1 != r0) goto L_0x0372
            r5 = 1
        L_0x0372:
            X.C11366SPh.A01(r5)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            if (r10 >= r9) goto L_0x0383
            java.util.List r0 = r6.A08     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0.get(r10)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            java.lang.String r0 = "mediaSource"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            throw r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
        L_0x0383:
            androidx.media3.common.Timeline r0 = r6.A00()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r3.A07(r0, r4)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            goto L_0x0486
        L_0x038c:
            java.lang.Object r1 = r5.obj     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xe1 r1 = (X.C21533Xe1) r1     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r3.A03 = r1     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xby r0 = r3.A0L     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0.A00 = r1     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0.A00()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            goto L_0x0486
        L_0x039b:
            X.XU0 r0 = r3.A04     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0.A00(r2)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r3.A0A(r4, r4, r2)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.YB6 r12 = r3.A0K     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.XrA r9 = r3.A0N     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xv1 r12 = (X.C22075Xv1) r12     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            long r5 = r0.getId()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            long r0 = r12.A00     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r10 = -1
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x03be
            int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r1 = 0
            if (r8 != 0) goto L_0x03bf
        L_0x03be:
            r1 = 1
        L_0x03bf:
            java.lang.String r0 = "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper)."
            if (r1 == 0) goto L_0x0423
            r12.A00 = r5     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            java.util.HashMap r1 = r12.A02     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            boolean r0 = r1.containsKey(r9)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            if (r0 != 0) goto L_0x03d5
            X.XYl r0 = new X.XYl     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0.<init>()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r1.put(r9, r0)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
        L_0x03d5:
            java.lang.Object r1 = r1.get(r9)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r1.getClass()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.XYl r1 = (X.C21358XYl) r1     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0 = 13107200(0xc80000, float:1.8367099E-38)
            r1.A00 = r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xqt r0 = r3.A05     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            androidx.media3.common.Timeline r0 = r0.A06     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int r0 = r0.A02()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            boolean r1 = X.AnonymousClass7TF.A1Q(r0)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0 = 2
            if (r1 == 0) goto L_0x03f2
            r0 = 4
        L_0x03f2:
            r3.A02(r0)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xc2 r5 = r3.A0M     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Y8G r1 = r3.A0Q     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Xuy r1 = (X.C22072Xuy) r1     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            boolean r0 = r5.A02     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0 = r0 ^ 1
            X.C11366SPh.A02(r0)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r5.A00 = r1     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            java.util.List r1 = r5.A08     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            int r0 = r1.size()     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            if (r4 >= r0) goto L_0x0416
            r1.get(r4)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            java.lang.String r0 = "mediaSource"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            throw r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
        L_0x0416:
            r5.A02 = r2     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            X.Y7r r0 = r3.A0G     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r1 = 2
            X.Xun r0 = (X.C22061Xun) r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            android.os.Handler r0 = r0.A00     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            r0.sendEmptyMessage(r1)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            goto L_0x0486
        L_0x0423:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
            throw r0     // Catch:{ XGY -> 0x0461, XQS -> 0x045a, XQX -> 0x0434, RCg -> 0x0430, XQT -> 0x042c, IOException -> 0x0447, RuntimeException -> 0x0463 }
        L_0x042c:
            r1 = move-exception
            r0 = 1002(0x3ea, float:1.404E-42)
            goto L_0x044a
        L_0x0430:
            r1 = move-exception
            int r0 = r1.A00
            goto L_0x044a
        L_0x0434:
            r1 = move-exception
            int r0 = r1.A00
            if (r0 != r2) goto L_0x0441
            boolean r0 = r1.A01
            r7 = 3003(0xbbb, float:4.208E-42)
            if (r0 == 0) goto L_0x0441
            r7 = 3001(0xbb9, float:4.205E-42)
        L_0x0441:
            X.XGY r5 = new X.XGY
            r5.<init>(r1, r4, r7)
            goto L_0x044f
        L_0x0447:
            r1 = move-exception
            r0 = 2000(0x7d0, float:2.803E-42)
        L_0x044a:
            X.XGY r5 = new X.XGY
            r5.<init>(r1, r4, r0)
        L_0x044f:
            r1 = r18
            r0 = r17
            X.STH.A04(r0, r1, r5)
            r3.A09(r4, r4)
            goto L_0x047e
        L_0x045a:
            java.lang.String r0 = "errorCode"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0461:
            r5 = move-exception
            goto L_0x0474
        L_0x0463:
            r1 = move-exception
            boolean r0 = r1 instanceof java.lang.IllegalStateException
            if (r0 != 0) goto L_0x046c
            boolean r0 = r1 instanceof java.lang.IllegalArgumentException
            if (r0 == 0) goto L_0x046e
        L_0x046c:
            r7 = 1004(0x3ec, float:1.407E-42)
        L_0x046e:
            r0 = 2
            X.XGY r5 = new X.XGY
            r5.<init>(r1, r0, r7)
        L_0x0474:
            r1 = r18
            r0 = r17
            X.STH.A04(r0, r1, r5)
            r3.A09(r2, r4)
        L_0x047e:
            X.Xqt r0 = r3.A05
            X.Xqt r0 = r0.A05(r5)
            r3.A05 = r0
        L_0x0486:
            X.XU0 r5 = r3.A04
            X.Xqt r4 = r3.A05
            boolean r1 = r5.A02
            X.Xqt r0 = r5.A01
            boolean r0 = X.C51969G9p.A1a(r0, r4)
            r1 = r1 | r0
            r5.A02 = r1
            r5.A01 = r4
            if (r1 == 0) goto L_0x04b8
            X.Y7w r0 = r3.A0I
            X.Xuz r0 = (X.C22073Xuz) r0
            X.Xui r4 = r0.A00
            X.Y7r r0 = r4.A0S
            X.Y2K r1 = new X.Y2K
            r1.<init>(r4, r5)
            X.Xun r0 = (X.C22061Xun) r0
            android.os.Handler r0 = r0.A00
            r0.post(r1)
            X.Xqt r1 = r3.A05
            X.XU0 r0 = new X.XU0
            r0.<init>()
            r0.A01 = r1
            r3.A04 = r0
        L_0x04b8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22041XuP.handleMessage(android.os.Message):boolean");
    }

    private void A05(Timeline timeline, Timeline timeline2) {
        if (!AnonymousClass7TF.A1Q(timeline.A02()) || !AnonymousClass7TF.A1Q(timeline2.A02())) {
            ArrayList arrayList = this.A0R;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                arrayList.get(size);
                throw AnonymousClass7TE.A11("resolvedPeriodUid");
            } else {
                Collections.sort(arrayList);
            }
        }
    }

    private void A06(Timeline timeline, C21484Xcb xcb) {
        if (AnonymousClass7TF.A1Q(timeline.A02())) {
            C21982Xoc xoc = this.A05.A05;
            if (!this.A0H.A01.A02.equals(xoc)) {
                A03(xoc);
                A04(this.A05.A05, false, false);
                return;
            }
            return;
        }
        timeline.A09(this.A0D, xcb.A04);
        throw AnonymousClass00P.createAndThrow();
    }
}
