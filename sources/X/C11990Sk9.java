package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.Sk9  reason: case insensitive filesystem */
public final class C11990Sk9 implements C13837TiC {
    public static final boolean A0R = Log.isLoggable("GlideRequest", 2);
    public int A00;
    public int A01;
    public long A02;
    public Drawable A03;
    public Drawable A04;
    public C10527Rtg A05;
    public C13796ThF A06;
    public Integer A07;
    public boolean A08;
    public Drawable A09;
    public RuntimeException A0A;
    public final Q6I A0B;
    public final TA3 A0C;
    public final C13832Ti5 A0D;
    public final C13918TlK A0E;
    public final C13541TcD A0F;
    public final S0B A0G;
    public final Object A0H;
    public final Object A0I;
    public final List A0J;
    public final int A0K;
    public final int A0L;
    public final Context A0M;
    public final RE3 A0N;
    public final Class A0O;
    public final Executor A0P;
    public volatile SOI A0Q;

    private Drawable A00() {
        int i;
        Drawable drawable = this.A09;
        if (drawable != null) {
            return drawable;
        }
        TA3 ta3 = this.A0C;
        Drawable drawable2 = ta3.A0A;
        this.A09 = drawable2;
        if (drawable2 != null || (i = ta3.A06) <= 0) {
            return drawable2;
        }
        Drawable A012 = A01(i);
        this.A09 = A012;
        return A012;
    }

    private Drawable A01(int i) {
        Resources.Theme theme = this.A0C.A07;
        if (theme == null) {
            theme = this.A0M.getTheme();
        }
        Q6I q6i = this.A0B;
        return C9910RjP.A00(q6i, q6i, theme, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ab, code lost:
        if (r1 == null) goto L_0x00ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C8995RKo r5, X.C11990Sk9 r6, int r7) {
        /*
            X.S0B r0 = r6.A0G
            r0.A00()
            java.lang.Object r2 = r6.A0I
            monitor-enter(r2)
            java.lang.RuntimeException r0 = r6.A0A     // Catch:{ all -> 0x00d6 }
            r5.A02 = r0     // Catch:{ all -> 0x00d6 }
            X.Q6I r0 = r6.A0B     // Catch:{ all -> 0x00d6 }
            int r0 = r0.A01     // Catch:{ all -> 0x00d6 }
            if (r0 > r7) goto L_0x0055
            java.lang.String r3 = "Glide"
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "Load failed for ["
            r1.append(r0)     // Catch:{ all -> 0x00d6 }
            java.lang.Object r0 = r6.A0H     // Catch:{ all -> 0x00d6 }
            r1.append(r0)     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "] with dimensions ["
            r1.append(r0)     // Catch:{ all -> 0x00d6 }
            int r0 = r6.A01     // Catch:{ all -> 0x00d6 }
            r1.append(r0)     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "x"
            r1.append(r0)     // Catch:{ all -> 0x00d6 }
            int r0 = r6.A00     // Catch:{ all -> 0x00d6 }
            r1.append(r0)     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "]"
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)     // Catch:{ all -> 0x00d6 }
            android.util.Log.w(r3, r0, r5)     // Catch:{ all -> 0x00d6 }
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x00d6 }
            X.C8995RKo.A00(r5, r5, r4)     // Catch:{ all -> 0x00d6 }
            int r3 = r4.size()     // Catch:{ all -> 0x00d6 }
            r1 = 0
        L_0x004c:
            if (r1 >= r3) goto L_0x0055
            int r0 = r1 + 1
            r4.get(r1)     // Catch:{ all -> 0x00d6 }
            r1 = r0
            goto L_0x004c
        L_0x0055:
            r0 = 0
            r6.A05 = r0     // Catch:{ all -> 0x00d6 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x00d6 }
            r6.A07 = r0     // Catch:{ all -> 0x00d6 }
            X.Ti5 r4 = r6.A0D     // Catch:{ all -> 0x00d6 }
            if (r4 == 0) goto L_0x0063
            r4.DeN(r6)     // Catch:{ all -> 0x00d6 }
        L_0x0063:
            r0 = 1
            r6.A08 = r0     // Catch:{ all -> 0x00d6 }
            r3 = 0
            java.util.List r0 = r6.A0J     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x0089
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00d2 }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x0089
            r1.next()     // Catch:{ all -> 0x00d2 }
            if (r4 == 0) goto L_0x0081
            X.Ti5 r0 = r4.Boa()     // Catch:{ all -> 0x00d2 }
            r0.COm()     // Catch:{ all -> 0x00d2 }
        L_0x0081:
            java.lang.String r0 = "onLoadFailed"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)     // Catch:{ all -> 0x00d2 }
            throw r0     // Catch:{ all -> 0x00d2 }
        L_0x0089:
            if (r4 == 0) goto L_0x0091
            boolean r0 = r4.AFf(r6)     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x00ce
        L_0x0091:
            java.lang.Object r0 = r6.A0H     // Catch:{ all -> 0x00d2 }
            if (r0 != 0) goto L_0x00ad
            android.graphics.drawable.Drawable r1 = r6.A04     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x00ab
            X.TA3 r0 = r6.A0C     // Catch:{ all -> 0x00d2 }
            android.graphics.drawable.Drawable r1 = r0.A09     // Catch:{ all -> 0x00d2 }
            r6.A04 = r1     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x00ab
            int r0 = r0.A02     // Catch:{ all -> 0x00d2 }
            if (r0 <= 0) goto L_0x00ab
            android.graphics.drawable.Drawable r1 = r6.A01(r0)     // Catch:{ all -> 0x00d2 }
            r6.A04 = r1     // Catch:{ all -> 0x00d2 }
        L_0x00ab:
            if (r1 != 0) goto L_0x00c9
        L_0x00ad:
            android.graphics.drawable.Drawable r1 = r6.A03     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x00c3
            X.TA3 r0 = r6.A0C     // Catch:{ all -> 0x00d2 }
            android.graphics.drawable.Drawable r1 = r0.A08     // Catch:{ all -> 0x00d2 }
            r6.A03 = r1     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x00c3
            int r0 = r0.A01     // Catch:{ all -> 0x00d2 }
            if (r0 <= 0) goto L_0x00c3
            android.graphics.drawable.Drawable r1 = r6.A01(r0)     // Catch:{ all -> 0x00d2 }
            r6.A03 = r1     // Catch:{ all -> 0x00d2 }
        L_0x00c3:
            if (r1 != 0) goto L_0x00c9
            android.graphics.drawable.Drawable r1 = r6.A00()     // Catch:{ all -> 0x00d2 }
        L_0x00c9:
            X.TlK r0 = r6.A0E     // Catch:{ all -> 0x00d2 }
            r0.DOF(r1)     // Catch:{ all -> 0x00d2 }
        L_0x00ce:
            r6.A08 = r3     // Catch:{ all -> 0x00d6 }
            monitor-exit(r2)     // Catch:{ all -> 0x00d6 }
            return
        L_0x00d2:
            r0 = move-exception
            r6.A08 = r3     // Catch:{ all -> 0x00d6 }
            throw r0     // Catch:{ all -> 0x00d6 }
        L_0x00d6:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00d6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11990Sk9.A02(X.RKo, X.Sk9, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.SkO} */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00dd, code lost:
        if (r2 != null) goto L_0x00df;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f0 A[Catch:{ all -> 0x00fc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(int r38, int r39) {
        /*
            r37 = this;
            r8 = r37
            r4 = r39
            r5 = r38
            X.S0B r0 = r8.A0G
            r0.A00()
            java.lang.Object r7 = r8.A0I
            monitor-enter(r7)
            boolean r20 = A0R     // Catch:{ all -> 0x01ff }
            if (r20 == 0) goto L_0x0015
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x01ff }
        L_0x0015:
            java.lang.Integer r1 = r8.A07     // Catch:{ all -> 0x01ff }
            java.lang.Integer r19 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x01ff }
            r0 = r19
            if (r1 != r0) goto L_0x01fd
            java.lang.Integer r6 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x01ff }
            r8.A07 = r6     // Catch:{ all -> 0x01ff }
            X.TA3 r1 = r8.A0C     // Catch:{ all -> 0x01ff }
            float r3 = r1.A00     // Catch:{ all -> 0x01ff }
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r2) goto L_0x002e
            float r0 = (float) r5     // Catch:{ all -> 0x01ff }
            int r5 = X.AnonymousClass7TE.A05(r3, r0)     // Catch:{ all -> 0x01ff }
        L_0x002e:
            r8.A01 = r5     // Catch:{ all -> 0x01ff }
            if (r4 == r2) goto L_0x0037
            float r0 = (float) r4     // Catch:{ all -> 0x01ff }
            int r4 = X.AnonymousClass7TE.A05(r3, r0)     // Catch:{ all -> 0x01ff }
        L_0x0037:
            r8.A00 = r4     // Catch:{ all -> 0x01ff }
            if (r20 == 0) goto L_0x003e
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x01ff }
        L_0x003e:
            X.SOI r5 = r8.A0Q     // Catch:{ all -> 0x01ff }
            X.Q6I r0 = r8.A0B     // Catch:{ all -> 0x01ff }
            r36 = r0
            java.lang.Object r0 = r8.A0H     // Catch:{ all -> 0x01ff }
            r26 = r0
            X.TjF r0 = r1.A0C     // Catch:{ all -> 0x01ff }
            r22 = r0
            int r0 = r8.A01     // Catch:{ all -> 0x01ff }
            r28 = r0
            int r0 = r8.A00     // Catch:{ all -> 0x01ff }
            r29 = r0
            java.lang.Class r0 = r1.A0F     // Catch:{ all -> 0x01ff }
            r24 = r0
            java.lang.Class r0 = r8.A0O     // Catch:{ all -> 0x01ff }
            r25 = r0
            X.RE3 r0 = r8.A0N     // Catch:{ all -> 0x01ff }
            r35 = r0
            X.Rmo r0 = r1.A0E     // Catch:{ all -> 0x01ff }
            r34 = r0
            java.util.Map r0 = r1.A0G     // Catch:{ all -> 0x01ff }
            r27 = r0
            boolean r0 = r1.A0M     // Catch:{ all -> 0x01ff }
            r33 = r0
            boolean r0 = r1.A0K     // Catch:{ all -> 0x01ff }
            r32 = r0
            X.Shi r11 = r1.A0D     // Catch:{ all -> 0x01ff }
            boolean r13 = r1.A0I     // Catch:{ all -> 0x01ff }
            boolean r0 = r1.A0P     // Catch:{ all -> 0x01ff }
            r31 = r0
            boolean r0 = r1.A0O     // Catch:{ all -> 0x01ff }
            r30 = r0
            boolean r10 = r1.A0N     // Catch:{ all -> 0x01ff }
            java.util.concurrent.Executor r9 = r8.A0P     // Catch:{ all -> 0x01ff }
            boolean r18 = X.SOI.A07     // Catch:{ all -> 0x01ff }
            if (r18 == 0) goto L_0x0087
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x01ff }
        L_0x0087:
            X.Shh r4 = new X.Shh     // Catch:{ all -> 0x01ff }
            r21 = r4
            r23 = r11
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x01ff }
            monitor-enter(r5)     // Catch:{ all -> 0x01ff }
            if (r13 == 0) goto L_0x0100
            X.S2H r15 = r5.A00     // Catch:{ all -> 0x01f7 }
            monitor-enter(r15)     // Catch:{ all -> 0x01f7 }
            java.util.Map r1 = r15.A02     // Catch:{ all -> 0x01f4 }
            java.lang.Object r0 = r1.get(r4)     // Catch:{ all -> 0x01f4 }
            X.TRV r0 = (X.TRV) r0     // Catch:{ all -> 0x01f4 }
            if (r0 != 0) goto L_0x00a1
            goto L_0x00b8
        L_0x00a1:
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x01f4 }
            X.Sii r2 = (X.C11909Sii) r2     // Catch:{ all -> 0x01f4 }
            if (r2 != 0) goto L_0x00b1
            X.TjF r0 = r0.A00     // Catch:{ all -> 0x00af }
            r1.remove(r0)     // Catch:{ all -> 0x00af }
            goto L_0x00b1
        L_0x00af:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01f4 }
        L_0x00b1:
            monitor-exit(r15)     // Catch:{ all -> 0x01f7 }
            if (r2 == 0) goto L_0x00b9
            r2.A01()     // Catch:{ all -> 0x01f7 }
            goto L_0x00ee
        L_0x00b8:
            monitor-exit(r15)     // Catch:{ all -> 0x01f7 }
        L_0x00b9:
            X.QHU r14 = r5.A06     // Catch:{ all -> 0x01f7 }
            monitor-enter(r14)     // Catch:{ all -> 0x01f7 }
            java.util.Map r0 = r14.A02     // Catch:{ all -> 0x00fc }
            java.lang.Object r12 = r0.remove(r4)     // Catch:{ all -> 0x00fc }
            X.Rr9 r12 = (X.C10372Rr9) r12     // Catch:{ all -> 0x00fc }
            if (r12 != 0) goto L_0x00c8
            r2 = 0
            goto L_0x00d2
        L_0x00c8:
            long r2 = r14.A00     // Catch:{ all -> 0x00fc }
            int r0 = r12.A00     // Catch:{ all -> 0x00fc }
            long r0 = (long) r0     // Catch:{ all -> 0x00fc }
            long r2 = r2 - r0
            r14.A00 = r2     // Catch:{ all -> 0x00fc }
            java.lang.Object r2 = r12.A01     // Catch:{ all -> 0x00fc }
        L_0x00d2:
            monitor-exit(r14)     // Catch:{ all -> 0x01f7 }
            X.ThF r2 = (X.C13796ThF) r2     // Catch:{ all -> 0x01f7 }
            if (r2 == 0) goto L_0x0100
            boolean r0 = r2 instanceof X.C11909Sii     // Catch:{ all -> 0x01f7 }
            if (r0 == 0) goto L_0x00e6
            X.Sii r2 = (X.C11909Sii) r2     // Catch:{ all -> 0x01f7 }
            if (r2 == 0) goto L_0x0100
        L_0x00df:
            r2.A01()     // Catch:{ all -> 0x01f7 }
            r15.A00(r4, r2)     // Catch:{ all -> 0x01f7 }
            goto L_0x00ee
        L_0x00e6:
            r1 = 1
            X.Sii r0 = new X.Sii     // Catch:{ all -> 0x01f7 }
            r0.<init>(r4, r5, r2, r1)     // Catch:{ all -> 0x01f7 }
            r2 = r0
            goto L_0x00df
        L_0x00ee:
            if (r18 == 0) goto L_0x00f3
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x01f7 }
        L_0x00f3:
            monitor-exit(r5)     // Catch:{ all -> 0x01f7 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x01ff }
            r8.A04(r2, r0)     // Catch:{ all -> 0x01ff }
            r0 = 0
            goto L_0x01e8
        L_0x00fc:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x01f7 }
            goto L_0x01f6
        L_0x0100:
            X.Rr0 r3 = r5.A04     // Catch:{ all -> 0x01f7 }
            if (r10 == 0) goto L_0x0113
            java.util.Map r0 = r3.A01     // Catch:{ all -> 0x01f7 }
        L_0x0106:
            java.lang.Object r2 = r0.get(r4)     // Catch:{ all -> 0x01f7 }
            X.SkO r2 = (X.C12005SkO) r2     // Catch:{ all -> 0x01f7 }
            if (r2 == 0) goto L_0x0116
            r2.A04(r8, r9)     // Catch:{ all -> 0x01f7 }
            goto L_0x01dd
        L_0x0113:
            java.util.Map r0 = r3.A00     // Catch:{ all -> 0x01f7 }
            goto L_0x0106
        L_0x0116:
            X.RyB r0 = r5.A02     // Catch:{ all -> 0x01f7 }
            X.02U r0 = r0.A00     // Catch:{ all -> 0x01f7 }
            java.lang.Object r15 = r0.A7A()     // Catch:{ all -> 0x01f7 }
            X.C9217RTu.A00(r15)     // Catch:{ all -> 0x01f7 }
            r2 = r15
            X.SkO r2 = (X.C12005SkO) r2     // Catch:{ all -> 0x01f7 }
            monitor-enter(r15)     // Catch:{ all -> 0x01f7 }
            r2.A00 = r4     // Catch:{ all -> 0x01f4 }
            r2.A08 = r13     // Catch:{ all -> 0x01f4 }
            r0 = r31
            r2.A0C = r0     // Catch:{ all -> 0x01f4 }
            r0 = r30
            r2.A0B = r0     // Catch:{ all -> 0x01f4 }
            r2.A0A = r10     // Catch:{ all -> 0x01f4 }
            monitor-exit(r15)     // Catch:{ all -> 0x01f7 }
            X.Rtf r13 = r5.A01     // Catch:{ all -> 0x01f7 }
            X.02U r0 = r13.A01     // Catch:{ all -> 0x01f7 }
            java.lang.Object r1 = r0.A7A()     // Catch:{ all -> 0x01f7 }
            X.C9217RTu.A00(r1)     // Catch:{ all -> 0x01f7 }
            X.TLE r1 = (X.TLE) r1     // Catch:{ all -> 0x01f7 }
            int r12 = r13.A00     // Catch:{ all -> 0x01f7 }
            int r0 = r12 + 1
            r13.A00 = r0     // Catch:{ all -> 0x01f7 }
            X.S77 r13 = r1.A0M     // Catch:{ all -> 0x01f7 }
            X.S10 r14 = r1.A0P     // Catch:{ all -> 0x01f7 }
            r0 = r36
            r13.A02 = r0     // Catch:{ all -> 0x01f7 }
            r0 = r26
            r13.A0A = r0     // Catch:{ all -> 0x01f7 }
            r0 = r22
            r13.A04 = r0     // Catch:{ all -> 0x01f7 }
            r0 = r28
            r13.A01 = r0     // Catch:{ all -> 0x01f7 }
            r0 = r29
            r13.A00 = r0     // Catch:{ all -> 0x01f7 }
            r0 = r34
            r13.A06 = r0     // Catch:{ all -> 0x01f7 }
            r0 = r24
            r13.A08 = r0     // Catch:{ all -> 0x01f7 }
            r13.A07 = r14     // Catch:{ all -> 0x01f7 }
            r0 = r25
            r13.A09 = r0     // Catch:{ all -> 0x01f7 }
            r0 = r35
            r13.A03 = r0     // Catch:{ all -> 0x01f7 }
            r13.A05 = r11     // Catch:{ all -> 0x01f7 }
            r0 = r27
            r13.A0B = r0     // Catch:{ all -> 0x01f7 }
            r0 = r33
            r13.A0F = r0     // Catch:{ all -> 0x01f7 }
            r0 = r32
            r13.A0E = r0     // Catch:{ all -> 0x01f7 }
            r0 = r36
            r1.A03 = r0     // Catch:{ all -> 0x01f7 }
            r0 = r22
            r1.A06 = r0     // Catch:{ all -> 0x01f7 }
            r0 = r35
            r1.A04 = r0     // Catch:{ all -> 0x01f7 }
            r1.A0A = r4     // Catch:{ all -> 0x01f7 }
            r0 = r28
            r1.A02 = r0     // Catch:{ all -> 0x01f7 }
            r0 = r29
            r1.A00 = r0     // Catch:{ all -> 0x01f7 }
            r0 = r34
            r1.A08 = r0     // Catch:{ all -> 0x01f7 }
            r1.A0E = r10     // Catch:{ all -> 0x01f7 }
            r1.A07 = r11     // Catch:{ all -> 0x01f7 }
            r1.A09 = r2     // Catch:{ all -> 0x01f7 }
            r1.A01 = r12     // Catch:{ all -> 0x01f7 }
            java.lang.Integer r10 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x01f7 }
            r1.A0B = r10     // Catch:{ all -> 0x01f7 }
            r0 = r26
            r1.A0D = r0     // Catch:{ all -> 0x01f7 }
            boolean r0 = r2.A0A     // Catch:{ all -> 0x01f7 }
            if (r0 == 0) goto L_0x01b7
            java.util.Map r0 = r3.A01     // Catch:{ all -> 0x01f7 }
        L_0x01af:
            r0.put(r4, r2)     // Catch:{ all -> 0x01f7 }
            r2.A04(r8, r9)     // Catch:{ all -> 0x01f7 }
            monitor-enter(r15)     // Catch:{ all -> 0x01f7 }
            goto L_0x01ba
        L_0x01b7:
            java.util.Map r0 = r3.A00     // Catch:{ all -> 0x01f7 }
            goto L_0x01af
        L_0x01ba:
            r2.A01 = r1     // Catch:{ all -> 0x01f4 }
            java.lang.Integer r3 = X.TLE.A01(r1, r10)     // Catch:{ all -> 0x01f4 }
            if (r3 == r6) goto L_0x01d7
            r0 = r19
            if (r3 == r0) goto L_0x01d7
            boolean r0 = r2.A0C     // Catch:{ all -> 0x01f4 }
            if (r0 == 0) goto L_0x01cd
            X.TO7 r0 = r2.A0L     // Catch:{ all -> 0x01f4 }
            goto L_0x01d9
        L_0x01cd:
            boolean r0 = r2.A0B     // Catch:{ all -> 0x01f4 }
            if (r0 == 0) goto L_0x01d4
            X.TO7 r0 = r2.A0I     // Catch:{ all -> 0x01f4 }
            goto L_0x01d9
        L_0x01d4:
            X.TO7 r0 = r2.A0K     // Catch:{ all -> 0x01f4 }
            goto L_0x01d9
        L_0x01d7:
            X.TO7 r0 = r2.A0J     // Catch:{ all -> 0x01f4 }
        L_0x01d9:
            r0.execute(r1)     // Catch:{ all -> 0x01f4 }
            monitor-exit(r15)     // Catch:{ all -> 0x01f7 }
        L_0x01dd:
            if (r18 == 0) goto L_0x01e2
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x01f7 }
        L_0x01e2:
            X.Rtg r0 = new X.Rtg     // Catch:{ all -> 0x01f7 }
            r0.<init>(r5, r2, r8)     // Catch:{ all -> 0x01f7 }
            monitor-exit(r5)     // Catch:{ all -> 0x01f7 }
        L_0x01e8:
            r8.A05 = r0     // Catch:{ all -> 0x01ff }
            java.lang.Integer r0 = r8.A07     // Catch:{ all -> 0x01ff }
            if (r0 == r6) goto L_0x01f1
            r0 = 0
            r8.A05 = r0     // Catch:{ all -> 0x01ff }
        L_0x01f1:
            if (r20 == 0) goto L_0x01fd
            goto L_0x01fa
        L_0x01f4:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x01f7 }
        L_0x01f6:
            throw r0     // Catch:{ all -> 0x01f7 }
        L_0x01f7:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01f7 }
            throw r0     // Catch:{ all -> 0x01ff }
        L_0x01fa:
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x01ff }
        L_0x01fd:
            monitor-exit(r7)     // Catch:{ all -> 0x01ff }
            return
        L_0x01ff:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x01ff }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11990Sk9.A03(int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (r5.Boa().COm() == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f2, code lost:
        X.SOI.A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.C13796ThF r8, java.lang.Integer r9) {
        /*
            r7 = this;
            X.S0B r0 = r7.A0G
            r0.A00()
            r4 = 0
            java.lang.Object r3 = r7.A0I     // Catch:{ all -> 0x00fc }
            monitor-enter(r3)     // Catch:{ all -> 0x00fc }
            r7.A05 = r4     // Catch:{ all -> 0x00f9 }
            if (r8 != 0) goto L_0x0030
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = "Expected to receive a Resource<R> with an object of "
            r1.append(r0)     // Catch:{ all -> 0x00f9 }
            java.lang.Class r0 = r7.A0O     // Catch:{ all -> 0x00f9 }
            r1.append(r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = " inside, but instead got null."
            java.lang.String r2 = X.AnonymousClass7TF.A0l(r0, r1)     // Catch:{ all -> 0x00f9 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00f9 }
            X.RKo r1 = new X.RKo     // Catch:{ all -> 0x00f9 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x00f9 }
            r0 = 5
            A02(r1, r7, r0)     // Catch:{ all -> 0x00f9 }
            monitor-exit(r3)     // Catch:{ all -> 0x00f9 }
            return
        L_0x0030:
            java.lang.Object r2 = r8.get()     // Catch:{ all -> 0x00f9 }
            if (r2 == 0) goto L_0x0099
            java.lang.Class r0 = r7.A0O     // Catch:{ all -> 0x00f9 }
            boolean r0 = X.Pxh.A1W(r0, r2)     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x0099
            X.Ti5 r5 = r7.A0D     // Catch:{ all -> 0x00f9 }
            if (r5 == 0) goto L_0x0053
            boolean r0 = r5.AFo(r7)     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x00eb
            X.Ti5 r0 = r5.Boa()     // Catch:{ all -> 0x00f9 }
            boolean r0 = r0.COm()     // Catch:{ all -> 0x00f9 }
            r6 = 0
            if (r0 != 0) goto L_0x0054
        L_0x0053:
            r6 = 1
        L_0x0054:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x00f9 }
            r7.A07 = r0     // Catch:{ all -> 0x00f9 }
            r7.A06 = r8     // Catch:{ all -> 0x00f9 }
            X.Q6I r0 = r7.A0B     // Catch:{ all -> 0x00f9 }
            int r1 = r0.A01     // Catch:{ all -> 0x00f9 }
            r0 = 3
            if (r1 > r0) goto L_0x0064
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00f9 }
        L_0x0064:
            if (r5 == 0) goto L_0x0069
            r5.Deq(r7)     // Catch:{ all -> 0x00f9 }
        L_0x0069:
            r0 = 1
            r7.A08 = r0     // Catch:{ all -> 0x00f9 }
            r5 = 0
            java.util.List r0 = r7.A0J     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x0086
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0095 }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x0086
            r1.next()     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = "onResourceReady"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)     // Catch:{ all -> 0x0095 }
            throw r0     // Catch:{ all -> 0x0095 }
        L_0x0086:
            X.TcD r0 = r7.A0F     // Catch:{ all -> 0x0095 }
            X.TcC r1 = r0.AEN(r9, r6)     // Catch:{ all -> 0x0095 }
            X.TlK r0 = r7.A0E     // Catch:{ all -> 0x0095 }
            r0.Df5(r1, r2)     // Catch:{ all -> 0x0095 }
            r7.A08 = r5     // Catch:{ all -> 0x00f9 }
            monitor-exit(r3)     // Catch:{ all -> 0x00f9 }
            return
        L_0x0095:
            r0 = move-exception
            r7.A08 = r5     // Catch:{ all -> 0x00f9 }
            throw r0     // Catch:{ all -> 0x00f9 }
        L_0x0099:
            r7.A06 = r4     // Catch:{ all -> 0x00f6 }
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "Expected to receive an object of "
            r1.append(r0)     // Catch:{ all -> 0x00f6 }
            java.lang.Class r0 = r7.A0O     // Catch:{ all -> 0x00f6 }
            r1.append(r0)     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = " but instead got "
            r1.append(r0)     // Catch:{ all -> 0x00f6 }
            if (r2 == 0) goto L_0x00b5
            java.lang.Class r0 = r2.getClass()     // Catch:{ all -> 0x00f6 }
            goto L_0x00b7
        L_0x00b5:
            java.lang.String r0 = ""
        L_0x00b7:
            r1.append(r0)     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "{"
            r1.append(r0)     // Catch:{ all -> 0x00f6 }
            r1.append(r2)     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "} inside Resource{"
            r1.append(r0)     // Catch:{ all -> 0x00f6 }
            r1.append(r8)     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "}."
            r1.append(r0)     // Catch:{ all -> 0x00f6 }
            if (r2 == 0) goto L_0x00d7
            java.lang.String r0 = ""
            goto L_0x00d9
        L_0x00d7:
            java.lang.String r0 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        L_0x00d9:
            java.lang.String r2 = X.AnonymousClass7TF.A0l(r0, r1)     // Catch:{ all -> 0x00f6 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00f6 }
            X.RKo r1 = new X.RKo     // Catch:{ all -> 0x00f6 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x00f6 }
            r0 = 5
            A02(r1, r7, r0)     // Catch:{ all -> 0x00f6 }
            goto L_0x00f1
        L_0x00eb:
            r7.A06 = r4     // Catch:{ all -> 0x00f6 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x00f6 }
            r7.A07 = r0     // Catch:{ all -> 0x00f6 }
        L_0x00f1:
            monitor-exit(r3)     // Catch:{ all -> 0x00f6 }
            X.SOI.A00(r8)
            return
        L_0x00f6:
            r0 = move-exception
            r4 = r8
            goto L_0x00fa
        L_0x00f9:
            r0 = move-exception
        L_0x00fa:
            monitor-exit(r3)     // Catch:{ all -> 0x00f9 }
            throw r0     // Catch:{ all -> 0x00fc }
        L_0x00fc:
            r0 = move-exception
            if (r4 == 0) goto L_0x0102
            X.SOI.A00(r4)
        L_0x0102:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11990Sk9.A04(X.ThF, java.lang.Integer):void");
    }

    public final void ADE() {
        Throwable th;
        C13832Ti5 ti5;
        int i;
        synchronized (this.A0I) {
            if (!this.A08) {
                this.A0G.A00();
                this.A02 = SystemClock.elapsedRealtimeNanos();
                if (this.A0H == null) {
                    int i2 = this.A0L;
                    int i3 = this.A0K;
                    if (C11424STg.A05(i2, i3)) {
                        this.A01 = i2;
                        this.A00 = i3;
                    }
                    Drawable drawable = this.A04;
                    if (drawable == null) {
                        TA3 ta3 = this.A0C;
                        drawable = ta3.A09;
                        this.A04 = drawable;
                        if (drawable == null && (i = ta3.A02) > 0) {
                            drawable = A01(i);
                            this.A04 = drawable;
                        }
                    }
                    int i4 = 3;
                    if (drawable == null) {
                        i4 = 5;
                    }
                    A02(new C8995RKo("Received null model", Collections.emptyList()), this, i4);
                } else {
                    Integer num = this.A07;
                    Integer num2 = AnonymousClass05K.A01;
                    if (num == num2) {
                        th = AnonymousClass7TE.A0w("Cannot restart a running request");
                    } else if (num == AnonymousClass05K.A0N) {
                        A04(this.A06, AnonymousClass05K.A0Y);
                    } else {
                        List list = this.A0J;
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                it.next();
                            }
                        }
                        Integer num3 = AnonymousClass05K.A0C;
                        this.A07 = num3;
                        int i5 = this.A0L;
                        int i6 = this.A0K;
                        if (C11424STg.A05(i5, i6)) {
                            A03(i5, i6);
                        } else {
                            this.A0E.Bwf(this);
                        }
                        Integer num4 = this.A07;
                        if ((num4 == num2 || num4 == num3) && ((ti5 = this.A0D) == null || ti5.AFf(this))) {
                            this.A0E.DOR(A00());
                        }
                        if (A0R) {
                            SystemClock.elapsedRealtimeNanos();
                        }
                    }
                }
            } else {
                th = AnonymousClass7TE.A0z("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            }
            throw th;
        }
    }

    public final boolean COm() {
        boolean A1W;
        synchronized (this.A0I) {
            A1W = AnonymousClass7TF.A1W(this.A07, AnonymousClass05K.A0N);
        }
        return A1W;
    }

    public final boolean CQ9() {
        boolean A1W;
        synchronized (this.A0I) {
            A1W = AnonymousClass7TF.A1W(this.A07, AnonymousClass05K.A0j);
        }
        return A1W;
    }

    public final boolean CSm(C13837TiC tiC) {
        int i;
        int i2;
        Object obj;
        Class cls;
        TA3 ta3;
        RE3 re3;
        int i3;
        int i4;
        int i5;
        Object obj2;
        Class cls2;
        TA3 ta32;
        RE3 re32;
        int i6;
        C13837TiC tiC2 = tiC;
        if (tiC2 instanceof C11990Sk9) {
            synchronized (this.A0I) {
                i = this.A0L;
                i2 = this.A0K;
                obj = this.A0H;
                cls = this.A0O;
                ta3 = this.A0C;
                re3 = this.A0N;
                List list = this.A0J;
                if (list != null) {
                    i3 = list.size();
                } else {
                    i3 = 0;
                }
            }
            C11990Sk9 sk9 = (C11990Sk9) tiC2;
            synchronized (sk9.A0I) {
                i4 = sk9.A0L;
                i5 = sk9.A0K;
                obj2 = sk9.A0H;
                cls2 = sk9.A0O;
                ta32 = sk9.A0C;
                re32 = sk9.A0N;
                List list2 = sk9.A0J;
                if (list2 != null) {
                    i6 = list2.size();
                } else {
                    i6 = 0;
                }
            }
            if (i == i4 && i2 == i5 && (obj != null ? obj.equals(obj2) : obj2 == null) && cls.equals(cls2) && ta3.equals(ta32) && re3 == re32 && i3 == i6) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0054, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0056, code lost:
        X.SOI.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void clear() {
        /*
            r6 = this;
            java.lang.Object r3 = r6.A0I
            monitor-enter(r3)
            boolean r0 = r6.A08     // Catch:{ all -> 0x0068 }
            if (r0 != 0) goto L_0x0061
            X.S0B r1 = r6.A0G     // Catch:{ all -> 0x0068 }
            r1.A00()     // Catch:{ all -> 0x0068 }
            java.lang.Integer r0 = r6.A07     // Catch:{ all -> 0x0068 }
            java.lang.Integer r5 = X.AnonymousClass05K.A0j     // Catch:{ all -> 0x0068 }
            if (r0 != r5) goto L_0x0014
            monitor-exit(r3)     // Catch:{ all -> 0x0068 }
            return
        L_0x0014:
            boolean r0 = r6.A08     // Catch:{ all -> 0x0068 }
            if (r0 != 0) goto L_0x005a
            r1.A00()     // Catch:{ all -> 0x0068 }
            X.TlK r4 = r6.A0E     // Catch:{ all -> 0x0068 }
            r4.EDP(r6)     // Catch:{ all -> 0x0068 }
            X.Rtg r0 = r6.A05     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0036
            X.SOI r2 = r0.A02     // Catch:{ all -> 0x0068 }
            monitor-enter(r2)     // Catch:{ all -> 0x0068 }
            X.SkO r1 = r0.A00     // Catch:{ all -> 0x0030 }
            X.Sk9 r0 = r0.A01     // Catch:{ all -> 0x0030 }
            r1.A03(r0)     // Catch:{ all -> 0x0030 }
            monitor-exit(r2)     // Catch:{ all -> 0x0030 }
            goto L_0x0033
        L_0x0030:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0030 }
            goto L_0x0067
        L_0x0033:
            r0 = 0
            r6.A05 = r0     // Catch:{ all -> 0x0068 }
        L_0x0036:
            X.ThF r1 = r6.A06     // Catch:{ all -> 0x0068 }
            r0 = 0
            if (r1 == 0) goto L_0x0052
            r6.A06 = r0     // Catch:{ all -> 0x0068 }
        L_0x003d:
            X.Ti5 r0 = r6.A0D     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0047
            boolean r0 = r0.AFe(r6)     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x004e
        L_0x0047:
            android.graphics.drawable.Drawable r0 = r6.A00()     // Catch:{ all -> 0x0068 }
            r4.DO8(r0)     // Catch:{ all -> 0x0068 }
        L_0x004e:
            r6.A07 = r5     // Catch:{ all -> 0x0068 }
            monitor-exit(r3)     // Catch:{ all -> 0x0068 }
            goto L_0x0054
        L_0x0052:
            r1 = r0
            goto L_0x003d
        L_0x0054:
            if (r1 == 0) goto L_0x0059
            X.SOI.A00(r1)
        L_0x0059:
            return
        L_0x005a:
            java.lang.String r0 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x0067
        L_0x0061:
            java.lang.String r0 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x0068 }
        L_0x0067:
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0068 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11990Sk9.clear():void");
    }

    public final boolean isComplete() {
        boolean A1W;
        synchronized (this.A0I) {
            A1W = AnonymousClass7TF.A1W(this.A07, AnonymousClass05K.A0N);
        }
        return A1W;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (r2 == X.AnonymousClass05K.A0C) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isRunning() {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A0I
            monitor-enter(r3)
            java.lang.Integer r2 = r4.A07     // Catch:{ all -> 0x0011 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0011 }
            if (r2 == r0) goto L_0x000e
            java.lang.Integer r1 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0011 }
            r0 = 0
            if (r2 != r1) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            monitor-exit(r3)     // Catch:{ all -> 0x0011 }
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0011 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11990Sk9.isRunning():boolean");
    }

    public final void pause() {
        synchronized (this.A0I) {
            if (isRunning()) {
                clear();
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.A0I) {
            obj = this.A0H;
            cls = this.A0O;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(super.toString());
        A1A.append("[model=");
        A1A.append(obj);
        A1A.append(", transcodeClass=");
        return Pxg.A0r(cls, A1A);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.S0B, java.lang.Object] */
    public C11990Sk9(Context context, Q6I q6i, RE3 re3, SOI soi, TA3 ta3, C13832Ti5 ti5, C13918TlK tlK, C13541TcD tcD, Class cls, Object obj, Object obj2, List list, Executor executor, int i, int i2) {
        if (A0R) {
            super.hashCode();
        }
        this.A0G = new Object();
        this.A0I = obj;
        this.A0M = context;
        this.A0B = q6i;
        this.A0H = obj2;
        this.A0O = cls;
        this.A0C = ta3;
        this.A0L = i;
        this.A0K = i2;
        this.A0N = re3;
        this.A0E = tlK;
        this.A0J = list;
        this.A0D = ti5;
        this.A0Q = soi;
        this.A0F = tcD;
        this.A0P = executor;
        this.A07 = AnonymousClass05K.A00;
        if (this.A0A == null) {
            if (q6i.A02.A00.containsKey(C9200RTd.class)) {
                this.A0A = AnonymousClass7TE.A15("Glide request origin trace");
            }
        }
    }
}
