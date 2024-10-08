package X;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* renamed from: X.5Mu  reason: invalid class name and case insensitive filesystem */
public final class C284515Mu extends AnonymousClass4R3 implements AnonymousClass4R5 {
    public static final C284515Mu $redex_init_class = null;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04 = 0;
    public int A05;
    public long A06;
    public long A07;
    public Surface A08;
    public AnonymousClass5NP A09;
    public AnonymousClass4RP A0A;
    public AnonymousClass4RP A0B;
    public AnonymousClass5NA A0C;
    public AnonymousClass5N7 A0D;
    public Object A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public AnonymousClass4RP A0M;
    public C264784Rg A0N;
    public AnonymousClass4P6 A0O;
    public AnonymousClass4QB A0P;
    public C264804Ri A0Q;
    public AnonymousClass4S7 A0R;
    public C264344Pn A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public final Looper A0Y;
    public final AnonymousClass5NJ A0Z;
    public final C284525Mv A0a;
    public final AnonymousClass5NB A0b;
    public final C264784Rg A0c;
    public final AnonymousClass5NL A0d;
    public final C264744Rc A0e;
    public final C264734Rb A0f;
    public final AnonymousClass4S6 A0g;
    public final AnonymousClass5N4 A0h;
    public final List A0i;
    public final CopyOnWriteArraySet A0j;
    public final boolean A0k;
    public final long A0l;
    public final Context A0m;
    public final AnonymousClass5NH A0n;
    public final AnonymousClass5N0 A0o;
    public final AnonymousClass5N9 A0p;
    public final AnonymousClass4R4 A0q;
    public final AnonymousClass4T6 A0r;
    public final AnonymousClass4UM A0s;
    public final AnonymousClass4RR A0t;
    public final C265064Sk A0u;
    public final C264634Qq A0v;
    public final AnonymousClass28n A0w;
    public final C697227w A0x;
    public final AnonymousClass4Q3 A0y;
    public final boolean A0z;
    public final boolean A10;
    public final boolean A11;
    public final boolean A12;
    public final boolean A13;
    public final boolean A14;
    public final boolean A15;
    public final boolean A16;
    public final AnonymousClass4PL[] A17;

    private Pair A03(Timeline timeline, int i, long j) {
        long j2;
        Timeline timeline2 = timeline;
        int i2 = i;
        if (timeline.A02() == 0) {
            this.A01 = i;
            if (j == -9223372036854775807L) {
                j2 = 0;
            } else {
                j2 = j;
            }
            this.A07 = j2;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.A06 = j;
            return null;
        }
        if (i == -1 || i >= timeline.A02()) {
            i2 = timeline.A07(false);
            j = Util.A08(timeline.A0E(this.A00, i2, 0).A02);
        }
        return timeline2.A09(this.A0e, this.A00, i2, Util.A07(j));
    }

    private void A0B(int i) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            this.A0i.remove(i2);
        }
        AnonymousClass5N6 r7 = (AnonymousClass5N6) this.A0D;
        int[] iArr = r7.A02;
        int length = iArr.length;
        int[] iArr2 = new int[(length - i)];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i5 < 0 || i5 >= i) {
                int i6 = i4 - i3;
                if (i5 >= 0) {
                    i5 -= i;
                }
                iArr2[i6] = i5;
            } else {
                i3++;
            }
        }
        this.A0D = new AnonymousClass5N6(new Random(r7.A00.nextLong()), iArr2);
    }

    private void A0C(C2612348u r20, boolean z) {
        AnonymousClass5NA A062;
        boolean z2;
        if (z) {
            List list = this.A0i;
            int size = list.size();
            int AuC = AuC();
            A0A();
            Timeline timeline = this.A0C.A06;
            int size2 = list.size();
            this.A03++;
            A0B(size);
            AnonymousClass4TA r3 = new AnonymousClass4TA(this.A0D, list);
            AnonymousClass5NA A063 = A06(A04(timeline, r3), this.A0C, r3, false);
            int i = A063.A00;
            if (i != 1 && i != 4 && 0 < size && size == size2 && AuC >= A063.A06.A02()) {
                A063 = A063.A01(4);
            }
            AnonymousClass5NB r0 = this.A0b;
            AnonymousClass5N7 r5 = this.A0D;
            AnonymousClass4S5 r4 = (AnonymousClass4S5) r0.A0k;
            AnonymousClass4SD A002 = AnonymousClass4S5.A00();
            A002.A00 = r4.A00.obtainMessage(20, 0, size, r5);
            A002.A01 = r4;
            A002.A01();
            A062 = A063.A03((C2612348u) null);
        } else {
            AnonymousClass5NA r1 = this.A0C;
            A062 = r1.A06(r1.A08);
            A062.A0H = A062.A0I;
            A062.A0J = 0;
        }
        AnonymousClass5NA A012 = A062.A01(1);
        C2612348u r02 = r20;
        if (r20 != null) {
            A012 = A012.A03(r02);
        }
        this.A03++;
        AnonymousClass4S5 r42 = (AnonymousClass4S5) this.A0b.A0k;
        AnonymousClass4SD A003 = AnonymousClass4S5.A00();
        A003.A00 = r42.A00.obtainMessage(6);
        A003.A01 = r42;
        A003.A01();
        if (A012.A06.A02() != 0 || this.A0C.A06.A02() == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        A0G(this, A012, 3, 1, 7, -1, A01(A012), false, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r13 == 1) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0F(X.C284515Mu r12, int r13, int r14, boolean r15) {
        /*
            r9 = r14
            r4 = 1
            if (r15 == 0) goto L_0x0018
            r0 = -1
            if (r13 == r0) goto L_0x0018
            r2 = 1
            r3 = 1
            if (r13 != r4) goto L_0x000c
        L_0x000b:
            r3 = 0
        L_0x000c:
            r6 = r12
            X.5NA r5 = r12.A0C
            boolean r0 = r5.A0F
            if (r0 != r2) goto L_0x001a
            int r0 = r5.A01
            if (r0 != r3) goto L_0x001a
            return
        L_0x0018:
            r2 = 0
            goto L_0x000b
        L_0x001a:
            int r0 = r12.A03
            int r0 = r0 + 1
            r12.A03 = r0
            boolean r1 = r12.A0k
            if (r1 == 0) goto L_0x002a
            int r0 = r12.A04
            int r0 = r0 + 1
            r12.A04 = r0
        L_0x002a:
            X.5NA r7 = r5.A02(r3, r2)
            X.5NB r0 = r12.A0b
            if (r1 == 0) goto L_0x0050
            X.4S6 r1 = r0.A0k
            r0 = 28
            X.4SD r0 = r1.CsT(r0, r2, r3)
            r0.A01()
            if (r2 != 0) goto L_0x005a
            r12.A0G = r2
            r9 = 6
        L_0x0042:
            r8 = 3
            r14 = 0
            r10 = 4
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11 = -1
            r15 = r14
            A0G(r6, r7, r8, r9, r10, r11, r12, r14, r15)
            return
        L_0x0050:
            X.4S6 r0 = r0.A0k
            X.4SD r0 = r0.CsT(r4, r2, r3)
            r0.A01()
            goto L_0x0042
        L_0x005a:
            r12.A0C = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C284515Mu.A0F(X.5Mu, int, int, boolean):void");
    }

    public final void E3P(long j) {
    }

    public final void E3m() {
        A0A();
        A0A();
        boolean z = this.A0C.A0F;
        int i = 2;
        int FJe = this.A0Z.FJe(z, 2);
        int i2 = 1;
        if (z && FJe != 1) {
            i2 = 2;
        }
        A0F(this, FJe, i2, z);
        AnonymousClass5NA r1 = this.A0C;
        if (r1.A00 == 1) {
            AnonymousClass5NA A032 = r1.A03((C2612348u) null);
            if (A032.A06.A02() == 0) {
                i = 4;
            }
            AnonymousClass5NA A012 = A032.A01(i);
            this.A03++;
            AnonymousClass4S5 r2 = (AnonymousClass4S5) this.A0b.A0k;
            AnonymousClass4SD A002 = AnonymousClass4S5.A00();
            A002.A00 = r2.A00.obtainMessage(0);
            A002.A01 = r2;
            A002.A01();
            A0G(this, A012, 4, 1, 4, -1, -9223372036854775807L, false, false);
        }
    }

    public final void Efz(AnonymousClass4P7 r13) {
        A0A();
        AnonymousClass5NA r1 = this.A0C;
        if (r1.A05.equals(r13)) {
            return;
        }
        if (this.A10) {
            this.A0b.A0k.CsU(r13, 4).A01();
            return;
        }
        AnonymousClass5NA A042 = r1.A04(r13);
        this.A03++;
        this.A0b.A0k.CsU(r13, 4).A01();
        A0G(this, A042, 3, 1, 4, -1, -9223372036854775807L, false, false);
    }

    public final void stop(boolean z) {
        A0A();
        AnonymousClass5NJ r1 = this.A0Z;
        A0A();
        r1.FJe(this.A0C.A0F, 1);
        A0C((C2612348u) null, true);
        C264804Ri r0 = C264804Ri.A01;
        this.A0Q = new C264804Ri(ImmutableList.of());
    }

    static {
        27e.A00("goog.exo.exoplayer");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.5N0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C284515Mu(android.content.Context r49, android.os.Looper r50, X.AnonymousClass4R1 r51, X.C284495Ms r52, X.AnonymousClass4P6 r53, X.AnonymousClass4QB r54, X.C697227w r55, X.AnonymousClass2hV r56, X.C635813i r57, X.C635813i r58, X.C635813i r59, X.C635813i r60, X.C635813i r61, java.lang.String r62, int r63, boolean r64) {
        /*
            r48 = this;
            r1 = 2000(0x7d0, double:9.88E-321)
            r25 = 0
            r10 = 1
            r0 = r48
            r0.<init>()
            r9 = 0
            r0.A04 = r9
            X.4Q3 r24 = new X.4Q3
            r24.<init>()
            r3 = r24
            r0.A0y = r3
            java.lang.String r11 = "Init "
            int r3 = java.lang.System.identityHashCode(r0)     // Catch:{ all -> 0x037a }
            java.lang.String r12 = java.lang.Integer.toHexString(r3)     // Catch:{ all -> 0x037a }
            java.lang.String r13 = " ["
            java.lang.String r14 = "ExoPlayerLib/2.8.1"
            java.lang.String r15 = "] ["
            java.lang.String r16 = com.google.android.exoplayer2.util.Util.A02     // Catch:{ all -> 0x037a }
            java.lang.String r17 = "]"
            X.002.A15(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x037a }
            X.2AG.A02()     // Catch:{ all -> 0x037a }
            r8 = r49
            android.content.Context r23 = r8.getApplicationContext()     // Catch:{ all -> 0x037a }
            r3 = r23
            r0.A0m = r3     // Catch:{ all -> 0x037a }
            r47 = r55
            r4 = r56
            r3 = r47
            java.lang.Object r3 = r4.apply(r3)     // Catch:{ all -> 0x037a }
            X.4RR r3 = (X.AnonymousClass4RR) r3     // Catch:{ all -> 0x037a }
            r0.A0t = r3     // Catch:{ all -> 0x037a }
            r4 = r54
            r0.A0P = r4     // Catch:{ all -> 0x037a }
            r0.A0L = r10     // Catch:{ all -> 0x037a }
            r4 = r63
            r0.A0K = r4     // Catch:{ all -> 0x037a }
            r0.A0l = r1     // Catch:{ all -> 0x037a }
            X.5Mv r2 = new X.5Mv     // Catch:{ all -> 0x037a }
            r2.<init>(r0)     // Catch:{ all -> 0x037a }
            r0.A0a = r2     // Catch:{ all -> 0x037a }
            X.5N0 r22 = new X.5N0     // Catch:{ all -> 0x037a }
            r22.<init>()     // Catch:{ all -> 0x037a }
            r1 = r22
            r0.A0o = r1     // Catch:{ all -> 0x037a }
            android.os.Handler r6 = new android.os.Handler     // Catch:{ all -> 0x037a }
            r7 = r50
            r6.<init>(r7)     // Catch:{ all -> 0x037a }
            java.lang.Object r1 = r60.get()     // Catch:{ all -> 0x037a }
            X.4Qx r1 = (X.C264694Qx) r1     // Catch:{ all -> 0x037a }
            r11 = r1
            r12 = r6
            r13 = r2
            r14 = r25
            r15 = r2
            r16 = r2
            r17 = r2
            X.4PL[] r21 = r11.AMr(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x037a }
            r1 = r21
            r0.A17 = r1     // Catch:{ all -> 0x037a }
            int r12 = r1.length     // Catch:{ all -> 0x037a }
            r1 = 0
            if (r12 <= 0) goto L_0x0088
            r1 = 1
        L_0x0088:
            X.C256703wD.A04(r1)     // Catch:{ all -> 0x037a }
            java.lang.Object r1 = r61.get()     // Catch:{ all -> 0x037a }
            X.4Qq r1 = (X.C264634Qq) r1     // Catch:{ all -> 0x037a }
            r0.A0v = r1     // Catch:{ all -> 0x037a }
            java.lang.Object r4 = r59.get()     // Catch:{ all -> 0x037a }
            X.4Sk r4 = (X.C265064Sk) r4     // Catch:{ all -> 0x037a }
            r0.A0u = r4     // Catch:{ all -> 0x037a }
            java.lang.Object r5 = r57.get()     // Catch:{ all -> 0x037a }
            X.28n r5 = (X.AnonymousClass28n) r5     // Catch:{ all -> 0x037a }
            r0.A0w = r5     // Catch:{ all -> 0x037a }
            r4 = r64
            r0.A16 = r4     // Catch:{ all -> 0x037a }
            r4 = r53
            r0.A0O = r4     // Catch:{ all -> 0x037a }
            r0.A0Y = r7     // Catch:{ all -> 0x037a }
            r4 = r47
            r0.A0x = r4     // Catch:{ all -> 0x037a }
            r0.A0q = r0     // Catch:{ all -> 0x037a }
            X.5N2 r13 = new X.5N2     // Catch:{ all -> 0x037a }
            r13.<init>(r0)     // Catch:{ all -> 0x037a }
            X.5N4 r11 = new X.5N4     // Catch:{ all -> 0x037a }
            r11.<init>(r7, r4, r13)     // Catch:{ all -> 0x037a }
            r0.A0h = r11     // Catch:{ all -> 0x037a }
            java.util.concurrent.CopyOnWriteArraySet r4 = new java.util.concurrent.CopyOnWriteArraySet     // Catch:{ all -> 0x037a }
            r4.<init>()     // Catch:{ all -> 0x037a }
            r0.A0j = r4     // Catch:{ all -> 0x037a }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x037a }
            r4.<init>()     // Catch:{ all -> 0x037a }
            r0.A0i = r4     // Catch:{ all -> 0x037a }
            java.util.Random r13 = new java.util.Random     // Catch:{ all -> 0x037a }
            r13.<init>()     // Catch:{ all -> 0x037a }
            int[] r11 = new int[r9]     // Catch:{ all -> 0x037a }
            X.5N6 r4 = new X.5N6     // Catch:{ all -> 0x037a }
            r4.<init>(r13, r11)     // Catch:{ all -> 0x037a }
            r0.A0D = r4     // Catch:{ all -> 0x037a }
            X.4RW[] r14 = new X.AnonymousClass4RW[r12]     // Catch:{ all -> 0x037a }
            X.4RX[] r13 = new X.AnonymousClass4RX[r12]     // Catch:{ all -> 0x037a }
            X.4RZ r12 = X.AnonymousClass4RZ.A01     // Catch:{ all -> 0x037a }
            X.4Rb r20 = new X.4Rb     // Catch:{ all -> 0x037a }
            r11 = r20
            r4 = r25
            r11.<init>(r12, r4, r14, r13)     // Catch:{ all -> 0x037a }
            r0.A0f = r11     // Catch:{ all -> 0x037a }
            X.4Rc r4 = new X.4Rc     // Catch:{ all -> 0x037a }
            r4.<init>()     // Catch:{ all -> 0x037a }
            r0.A0e = r4     // Catch:{ all -> 0x037a }
            X.4Rf r11 = new X.4Rf     // Catch:{ all -> 0x037a }
            r11.<init>()     // Catch:{ all -> 0x037a }
            r12 = 21
            r4 = 2
            r19 = 3
            r18 = 13
            r30 = 14
            r31 = 15
            r32 = 16
            r33 = 17
            r34 = 18
            r35 = 19
            r17 = 31
            r16 = 10
            r37 = 20
            r38 = 30
            r40 = 22
            r41 = 23
            r42 = 24
            r43 = 25
            r44 = 26
            r45 = 27
            r46 = 28
            r36 = r17
            r39 = r12
            r26 = r10
            r27 = r4
            r28 = r19
            r29 = r18
            int[] r15 = new int[]{r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46}     // Catch:{ all -> 0x037a }
            r14 = 0
        L_0x0132:
            r13 = r15[r14]     // Catch:{ all -> 0x037a }
            r11.A01(r13)     // Catch:{ all -> 0x037a }
            int r14 = r14 + 1
            if (r14 < r12) goto L_0x0132
            r12 = 29
            r11.A01(r12)     // Catch:{ all -> 0x037a }
            X.4Rg r12 = X.C264784Rg.A01     // Catch:{ all -> 0x037a }
            X.4Rh r12 = r11.A00()     // Catch:{ all -> 0x037a }
            X.4Rg r11 = new X.4Rg     // Catch:{ all -> 0x037a }
            r11.<init>(r12)     // Catch:{ all -> 0x037a }
            r0.A0c = r11     // Catch:{ all -> 0x037a }
            X.4Rf r13 = new X.4Rf     // Catch:{ all -> 0x037a }
            r13.<init>()     // Catch:{ all -> 0x037a }
            X.4Rh r11 = r11.A00     // Catch:{ all -> 0x037a }
            r13.A02(r11)     // Catch:{ all -> 0x037a }
            r11 = 4
            r13.A01(r11)     // Catch:{ all -> 0x037a }
            r12 = r16
            r13.A01(r12)     // Catch:{ all -> 0x037a }
            X.4Rh r13 = r13.A00()     // Catch:{ all -> 0x037a }
            X.4Rg r12 = new X.4Rg     // Catch:{ all -> 0x037a }
            r12.<init>(r13)     // Catch:{ all -> 0x037a }
            r0.A0N = r12     // Catch:{ all -> 0x037a }
            java.util.List r12 = X.AnonymousClass4S5.A01     // Catch:{ all -> 0x037a }
            android.os.Handler r13 = new android.os.Handler     // Catch:{ all -> 0x037a }
            r12 = r25
            r13.<init>(r7, r12)     // Catch:{ all -> 0x037a }
            X.4S5 r12 = new X.4S5     // Catch:{ all -> 0x037a }
            r12.<init>(r13)     // Catch:{ all -> 0x037a }
            r0.A0g = r12     // Catch:{ all -> 0x037a }
            X.5N8 r13 = new X.5N8     // Catch:{ all -> 0x037a }
            r13.<init>(r0)     // Catch:{ all -> 0x037a }
            r0.A0p = r13     // Catch:{ all -> 0x037a }
            X.5NA r12 = X.AnonymousClass5NA.A00(r20)     // Catch:{ all -> 0x037a }
            r0.A0C = r12     // Catch:{ all -> 0x037a }
            X.2BQ r12 = X.2BQ.A0H     // Catch:{ all -> 0x037a }
            boolean r12 = X.2BY.A02(r12)     // Catch:{ all -> 0x037a }
            r14 = r62
            if (r12 == 0) goto L_0x01fe
            int r15 = com.google.android.exoplayer2.util.Util.A00     // Catch:{ all -> 0x037a }
            r12 = r17
            if (r15 >= r12) goto L_0x01f4
            X.4Rs r15 = new X.4Rs     // Catch:{ all -> 0x037a }
            r15.<init>(r14)     // Catch:{ all -> 0x037a }
        L_0x019d:
            java.lang.Object r14 = r58.get()     // Catch:{ all -> 0x037a }
            X.4QZ r14 = (X.AnonymousClass4QZ) r14     // Catch:{ all -> 0x037a }
            int r12 = r0.A0J     // Catch:{ all -> 0x037a }
            r39 = r12
            X.4P6 r12 = r0.A0O     // Catch:{ all -> 0x037a }
            r17 = r12
            X.5NB r12 = new X.5NB     // Catch:{ all -> 0x037a }
            r27 = r51
            r29 = r52
            r25 = r12
            r26 = r7
            r28 = r13
            r30 = r14
            r31 = r17
            r32 = r3
            r33 = r15
            r34 = r1
            r35 = r20
            r36 = r5
            r37 = r47
            r38 = r21
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x037a }
            r0.A0b = r12     // Catch:{ all -> 0x037a }
            r12 = 1065353216(0x3f800000, float:1.0)
            r0.A00 = r12     // Catch:{ all -> 0x037a }
            r0.A0J = r9     // Catch:{ all -> 0x037a }
            X.4RP r12 = X.AnonymousClass4RP.A0V     // Catch:{ all -> 0x037a }
            r0.A0A = r12     // Catch:{ all -> 0x037a }
            r0.A0M = r12     // Catch:{ all -> 0x037a }
            r0.A0B = r12     // Catch:{ all -> 0x037a }
            r12 = -1
            r0.A01 = r12     // Catch:{ all -> 0x037a }
            X.2BQ r12 = X.2BQ.A0B     // Catch:{ all -> 0x037a }
            boolean r14 = X.2BY.A02(r12)     // Catch:{ all -> 0x037a }
            if (r14 != 0) goto L_0x0219
            java.lang.String r13 = "audio"
            r12 = r23
            java.lang.Object r12 = r12.getSystemService(r13)     // Catch:{ all -> 0x037a }
            android.media.AudioManager r12 = (android.media.AudioManager) r12     // Catch:{ all -> 0x037a }
            if (r12 != 0) goto L_0x0213
            goto L_0x0211
        L_0x01f4:
            X.4Rs r12 = X.C264894Rs.A03     // Catch:{ all -> 0x037a }
            android.media.metrics.LogSessionId r12 = android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE     // Catch:{ all -> 0x037a }
            X.4Rs r15 = new X.4Rs     // Catch:{ all -> 0x037a }
            r15.<init>((android.media.metrics.LogSessionId) r12, (java.lang.String) r14)     // Catch:{ all -> 0x037a }
            goto L_0x019d
        L_0x01fe:
            int r15 = com.google.android.exoplayer2.util.Util.A00     // Catch:{ all -> 0x037a }
            r12 = r17
            if (r15 >= r12) goto L_0x020a
            X.4Rs r15 = new X.4Rs     // Catch:{ all -> 0x037a }
            r15.<init>(r14)     // Catch:{ all -> 0x037a }
            goto L_0x019d
        L_0x020a:
            r12 = r23
            X.4Rs r15 = X.C21315XVf.A00(r12, r14)     // Catch:{ all -> 0x037a }
            goto L_0x019d
        L_0x0211:
            r12 = -1
            goto L_0x0217
        L_0x0213:
            int r12 = r12.generateAudioSessionId()     // Catch:{ all -> 0x037a }
        L_0x0217:
            r0.A0I = r12     // Catch:{ all -> 0x037a }
        L_0x0219:
            X.4Ri r12 = X.C264804Ri.A01     // Catch:{ all -> 0x037a }
            r0.A0Q = r12     // Catch:{ all -> 0x037a }
            r0.A0H = r10     // Catch:{ all -> 0x037a }
            r0.A8z(r3)     // Catch:{ all -> 0x037a }
            android.os.Handler r12 = new android.os.Handler     // Catch:{ all -> 0x037a }
            r12.<init>(r7)     // Catch:{ all -> 0x037a }
            r5.A8Q(r12, r3)     // Catch:{ all -> 0x037a }
            java.util.concurrent.CopyOnWriteArraySet r3 = r0.A0j     // Catch:{ all -> 0x037a }
            r3.add(r2)     // Catch:{ all -> 0x037a }
            X.5NH r3 = new X.5NH     // Catch:{ all -> 0x037a }
            r3.<init>(r8, r6, r2)     // Catch:{ all -> 0x037a }
            r0.A0n = r3     // Catch:{ all -> 0x037a }
            X.2BQ r3 = X.2BQ.A0K     // Catch:{ all -> 0x037a }
            boolean r3 = X.2BY.A02(r3)     // Catch:{ all -> 0x037a }
            if (r3 == 0) goto L_0x0259
            X.5NJ r3 = X.AnonymousClass5NJ.A00     // Catch:{ all -> 0x037a }
        L_0x0240:
            r0.A0Z = r3     // Catch:{ all -> 0x037a }
            X.2BQ r3 = X.2BQ.A0m     // Catch:{ all -> 0x037a }
            boolean r3 = X.2BY.A02(r3)     // Catch:{ all -> 0x037a }
            if (r3 == 0) goto L_0x0253
            X.5NL r5 = X.AnonymousClass5NL.A00     // Catch:{ all -> 0x037a }
        L_0x024c:
            r0.A0d = r5     // Catch:{ all -> 0x037a }
            X.4QB r2 = r0.A0P     // Catch:{ all -> 0x037a }
            int r3 = r2.A01     // Catch:{ all -> 0x037a }
            goto L_0x025f
        L_0x0253:
            X.SwG r5 = new X.SwG     // Catch:{ all -> 0x037a }
            r5.<init>(r8, r6, r2)     // Catch:{ all -> 0x037a }
            goto L_0x024c
        L_0x0259:
            X.SwE r3 = new X.SwE     // Catch:{ all -> 0x037a }
            r3.<init>(r8, r6, r2)     // Catch:{ all -> 0x037a }
            goto L_0x0240
        L_0x025f:
            r2 = r18
            if (r3 == r2) goto L_0x0273
            switch(r3) {
                case 2: goto L_0x0268;
                case 3: goto L_0x026a;
                case 4: goto L_0x026d;
                case 5: goto L_0x026f;
                case 6: goto L_0x0271;
                case 7: goto L_0x026f;
                case 8: goto L_0x026f;
                case 9: goto L_0x026f;
                case 10: goto L_0x026f;
                default: goto L_0x0266;
            }     // Catch:{ all -> 0x037a }
        L_0x0266:
            r2 = 3
            goto L_0x0274
        L_0x0268:
            r2 = 0
            goto L_0x0274
        L_0x026a:
            r2 = 8
            goto L_0x0274
        L_0x026d:
            r2 = 4
            goto L_0x0274
        L_0x026f:
            r2 = 5
            goto L_0x0274
        L_0x0271:
            r2 = 2
            goto L_0x0274
        L_0x0273:
            r2 = 1
        L_0x0274:
            r5.EnI(r2)     // Catch:{ all -> 0x037a }
            X.2BQ r2 = X.2BQ.A0p     // Catch:{ all -> 0x037a }
            boolean r2 = X.2BY.A02(r2)     // Catch:{ all -> 0x037a }
            if (r2 == 0) goto L_0x02bd
            X.4T6 r2 = X.AnonymousClass4T6.A00     // Catch:{ all -> 0x037a }
        L_0x0281:
            r0.A0r = r2     // Catch:{ all -> 0x037a }
            r2.setEnabled(r9)     // Catch:{ all -> 0x037a }
            X.2BQ r2 = X.2BQ.A0q     // Catch:{ all -> 0x037a }
            boolean r2 = X.2BY.A02(r2)     // Catch:{ all -> 0x037a }
            if (r2 == 0) goto L_0x02b7
            X.4UM r2 = X.AnonymousClass4UM.A00     // Catch:{ all -> 0x037a }
        L_0x0290:
            r0.A0s = r2     // Catch:{ all -> 0x037a }
            r2.setEnabled(r9)     // Catch:{ all -> 0x037a }
            X.5NL r2 = r0.A0d     // Catch:{ all -> 0x037a }
            int r5 = r2.BTH()     // Catch:{ all -> 0x037a }
            int r3 = r2.BPS()     // Catch:{ all -> 0x037a }
            r6 = 0
            X.5NP r2 = new X.5NP     // Catch:{ all -> 0x037a }
            r2.<init>(r5, r3)     // Catch:{ all -> 0x037a }
            r0.A09 = r2     // Catch:{ all -> 0x037a }
            X.4Pn r2 = X.C264344Pn.A04     // Catch:{ all -> 0x037a }
            r0.A0S = r2     // Catch:{ all -> 0x037a }
            X.4S7 r2 = X.AnonymousClass4S7.A02     // Catch:{ all -> 0x037a }
            r0.A0R = r2     // Catch:{ all -> 0x037a }
            X.4QB r5 = r0.A0P     // Catch:{ all -> 0x037a }
            X.4Qo r1 = (X.C264614Qo) r1     // Catch:{ all -> 0x037a }
            java.lang.Object r3 = r1.A03     // Catch:{ all -> 0x037a }
            monitor-enter(r3)     // Catch:{ all -> 0x037a }
            goto L_0x02c3
        L_0x02b7:
            X.4UL r2 = new X.4UL     // Catch:{ all -> 0x037a }
            r2.<init>(r8)     // Catch:{ all -> 0x037a }
            goto L_0x0290
        L_0x02bd:
            X.4T5 r2 = new X.4T5     // Catch:{ all -> 0x037a }
            r2.<init>(r8)     // Catch:{ all -> 0x037a }
            goto L_0x0281
        L_0x02c3:
            X.4QB r2 = r1.A00     // Catch:{ all -> 0x0377 }
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x0377 }
            if (r2 != 0) goto L_0x02cc
            r6 = 1
        L_0x02cc:
            r1.A00 = r5     // Catch:{ all -> 0x0377 }
            monitor-exit(r3)     // Catch:{ all -> 0x0377 }
            if (r6 == 0) goto L_0x02d4
            X.C264614Qo.A01(r1)     // Catch:{ all -> 0x037a }
        L_0x02d4:
            X.2BQ r1 = X.2BQ.A0o     // Catch:{ all -> 0x037a }
            boolean r1 = X.2BY.A02(r1)     // Catch:{ all -> 0x037a }
            r0.A12 = r1     // Catch:{ all -> 0x037a }
            X.2BQ r1 = X.2BQ.A0k     // Catch:{ all -> 0x037a }
            boolean r1 = X.2BY.A02(r1)     // Catch:{ all -> 0x037a }
            r0.A14 = r1     // Catch:{ all -> 0x037a }
            X.2BQ r1 = X.2BQ.A0j     // Catch:{ all -> 0x037a }
            boolean r1 = X.2BY.A02(r1)     // Catch:{ all -> 0x037a }
            r0.A13 = r1     // Catch:{ all -> 0x037a }
            X.2BQ r1 = X.2BQ.A0I     // Catch:{ all -> 0x037a }
            boolean r1 = X.2BY.A02(r1)     // Catch:{ all -> 0x037a }
            r0.A11 = r1     // Catch:{ all -> 0x037a }
            X.2BQ r1 = X.2BQ.A1B     // Catch:{ all -> 0x037a }
            boolean r1 = X.2BY.A02(r1)     // Catch:{ all -> 0x037a }
            r0.A0T = r1     // Catch:{ all -> 0x037a }
            X.2BQ r1 = X.2BQ.A0w     // Catch:{ all -> 0x037a }
            boolean r1 = X.2BY.A02(r1)     // Catch:{ all -> 0x037a }
            r0.A0V = r1     // Catch:{ all -> 0x037a }
            X.2BQ r1 = X.2BQ.A1F     // Catch:{ all -> 0x037a }
            boolean r1 = X.2BY.A02(r1)     // Catch:{ all -> 0x037a }
            r0.A0X = r1     // Catch:{ all -> 0x037a }
            X.2BQ r1 = X.2BQ.A08     // Catch:{ all -> 0x037a }
            boolean r1 = X.2BY.A02(r1)     // Catch:{ all -> 0x037a }
            r0.A0k = r1     // Catch:{ all -> 0x037a }
            X.2BQ r1 = X.2BQ.A0G     // Catch:{ all -> 0x037a }
            boolean r1 = X.2BY.A02(r1)     // Catch:{ all -> 0x037a }
            r0.A10 = r1     // Catch:{ all -> 0x037a }
            X.2BQ r1 = X.2BQ.A0C     // Catch:{ all -> 0x037a }
            boolean r1 = X.2BY.A02(r1)     // Catch:{ all -> 0x037a }
            r0.A0z = r1     // Catch:{ all -> 0x037a }
            X.2BQ r1 = X.2BQ.A19     // Catch:{ all -> 0x037a }
            boolean r1 = X.2BY.A02(r1)     // Catch:{ all -> 0x037a }
            r0.A15 = r1     // Catch:{ all -> 0x037a }
            if (r14 != 0) goto L_0x0344
            int r1 = r0.A0I     // Catch:{ all -> 0x037a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x037a }
            r1 = r16
            A0I(r0, r2, r10, r1)     // Catch:{ all -> 0x037a }
            int r1 = r0.A0I     // Catch:{ all -> 0x037a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x037a }
            r1 = r16
            A0I(r0, r2, r4, r1)     // Catch:{ all -> 0x037a }
        L_0x0344:
            X.4QB r2 = r0.A0P     // Catch:{ all -> 0x037a }
            r1 = r19
            A0I(r0, r2, r10, r1)     // Catch:{ all -> 0x037a }
            int r1 = r0.A0L     // Catch:{ all -> 0x037a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x037a }
            A0I(r0, r1, r4, r11)     // Catch:{ all -> 0x037a }
            int r1 = r0.A0K     // Catch:{ all -> 0x037a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x037a }
            r1 = 5
            A0I(r0, r2, r4, r1)     // Catch:{ all -> 0x037a }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x037a }
            r1 = 9
            A0I(r0, r2, r10, r1)     // Catch:{ all -> 0x037a }
            r2 = 7
            r1 = r22
            A0I(r0, r1, r4, r2)     // Catch:{ all -> 0x037a }
            r3 = 8
            r2 = 6
            A0I(r0, r1, r2, r3)     // Catch:{ all -> 0x037a }
            r24.A02()
            return
        L_0x0377:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0377 }
            throw r1     // Catch:{ all -> 0x037a }
        L_0x037a:
            r1 = move-exception
            X.4Q3 r0 = r0.A0y
            r0.A02()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C284515Mu.<init>(android.content.Context, android.os.Looper, X.4R1, X.5Ms, X.4P6, X.4QB, X.27w, X.2hV, X.13i, X.13i, X.13i, X.13i, X.13i, java.lang.String, int, boolean):void");
    }

    private int A00() {
        AnonymousClass5NA r1 = this.A0C;
        Timeline timeline = r1.A06;
        if (timeline.A02() == 0) {
            return this.A01;
        }
        return timeline.A0B(this.A0e, r1.A08.A04).A00;
    }

    private long A01(AnonymousClass5NA r7) {
        Timeline timeline = r7.A06;
        if (timeline.A02() == 0) {
            return Util.A07(this.A07);
        }
        C264874Rq r4 = r7.A08;
        int i = r4.A00;
        long j = r7.A0I;
        if (i != -1) {
            return j;
        }
        Object obj = r4.A04;
        C264744Rc r0 = this.A0e;
        timeline.A0B(r0, obj);
        return j + r0.A02;
    }

    public static long A02(AnonymousClass5NA r8) {
        AnonymousClass4RE r7 = new AnonymousClass4RE();
        C264744Rc r6 = new C264744Rc();
        Timeline timeline = r8.A06;
        timeline.A0B(r6, r8.A08.A04);
        long j = r8.A03;
        if (j == -9223372036854775807L) {
            return timeline.A0E(r7, r6.A00, 0).A02;
        }
        return r6.A02 + j;
    }

    private Pair A04(Timeline timeline, Timeline timeline2) {
        int i;
        long A0L2 = A0L();
        Timeline timeline3 = timeline;
        Timeline timeline4 = timeline2;
        if (timeline3.A02() == 0) {
            i = A00();
        } else {
            i = -1;
            if (timeline4.A02() == 0) {
                A0L2 = -9223372036854775807L;
            } else {
                int AuC = AuC();
                AnonymousClass4RE r7 = this.A00;
                C264744Rc r6 = this.A0e;
                Pair A092 = timeline3.A09(r6, r7, AuC, Util.A07(A0L2));
                Object obj = A092.first;
                if (timeline4.A06(obj) != -1) {
                    return A092;
                }
                Object A072 = AnonymousClass5NB.A07(r6, r7, timeline3, timeline4, obj, this.A0J, false);
                if (A072 == null) {
                    return A03(timeline4, -1, -9223372036854775807L);
                }
                timeline4.A0B(r6, A072);
                int i2 = r6.A00;
                return A03(timeline4, i2, Util.A08(timeline4.A0E(r7, i2, 0).A02));
            }
        }
        return A03(timeline4, i, A0L2);
    }

    /* JADX WARNING: type inference failed for: r11v2, types: [X.4Rr] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r24 != null) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ad, code lost:
        if (r3.A0D(r4, r1, false).A00 != r3.A0B(r4, r11.A04).A00) goto L_0x00af;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.AnonymousClass5NA A06(android.util.Pair r24, X.AnonymousClass5NA r25, com.google.android.exoplayer2.Timeline r26, boolean r27) {
        /*
            r23 = this;
            r3 = r26
            int r0 = r3.A02()
            r1 = 0
            r6 = r24
            if (r0 != 0) goto L_0x0044
            r1 = 1
        L_0x000c:
            r0 = 1
        L_0x000d:
            X.C256703wD.A03(r0)
            r0 = r25
            com.google.android.exoplayer2.Timeline r5 = r0.A06
            X.5NA r10 = r0.A05(r3)
            r2 = r23
            if (r1 == 0) goto L_0x0048
            X.4Rq r11 = X.AnonymousClass5NA.A0K
            if (r27 == 0) goto L_0x0041
            long r0 = r2.A06
        L_0x0022:
            long r15 = com.google.android.exoplayer2.util.Util.A07(r0)
            r21 = 0
            X.4Rn r12 = X.C264844Rn.A03
            X.4Rb r13 = r2.A0f
            com.google.common.collect.ImmutableList r14 = com.google.common.collect.ImmutableList.of()
            r17 = r15
            r19 = r15
            X.5NA r0 = r10.A07(r11, r12, r13, r14, r15, r17, r19, r21)
            X.5NA r2 = r0.A06(r11)
            long r0 = r2.A0I
            r2.A0H = r0
            return r2
        L_0x0041:
            long r0 = r2.A07
            goto L_0x0022
        L_0x0044:
            r0 = 0
            if (r24 == 0) goto L_0x000d
            goto L_0x000c
        L_0x0048:
            X.4Rq r4 = r10.A08
            java.lang.Object r1 = r4.A04
            java.lang.Object r0 = r6.first
            boolean r0 = r1.equals(r0)
            r9 = r0 ^ 1
            if (r9 == 0) goto L_0x012b
            java.lang.Object r12 = r6.first
            r16 = -1
            r13 = -1
            X.4Rq r11 = new X.4Rq
            r14 = r13
            r15 = r13
            r11.<init>(r12, r13, r14, r15, r16)
        L_0x0062:
            java.lang.Object r0 = r6.second
            java.lang.Number r0 = (java.lang.Number) r0
            long r15 = r0.longValue()
            if (r27 == 0) goto L_0x0125
            boolean r0 = r2.A0V
            if (r0 == 0) goto L_0x0125
            long r6 = r2.Atl()
        L_0x0074:
            long r7 = com.google.android.exoplayer2.util.Util.A07(r6)
            int r0 = r5.A02()
            if (r0 == 0) goto L_0x0087
            X.4Rc r0 = r2.A0e
            X.4Rc r0 = r5.A0B(r0, r1)
            long r0 = r0.A02
            long r7 = r7 - r0
        L_0x0087:
            if (r9 != 0) goto L_0x012e
            int r0 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x012e
            int r0 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x00ec
            X.4Rq r0 = r10.A07
            java.lang.Object r0 = r0.A04
            int r1 = r3.A06(r0)
            r0 = -1
            if (r1 == r0) goto L_0x00af
            X.4Rc r4 = r2.A0e
            r0 = 0
            X.4Rc r0 = r3.A0D(r4, r1, r0)
            int r1 = r0.A00
            java.lang.Object r0 = r11.A04
            X.4Rc r0 = r3.A0B(r4, r0)
            int r0 = r0.A00
            if (r1 == r0) goto L_0x00e5
        L_0x00af:
            java.lang.Object r0 = r11.A04
            X.4Rc r4 = r2.A0e
            r3.A0B(r4, r0)
            int r1 = r11.A00
            r0 = -1
            if (r1 == r0) goto L_0x00e9
            int r0 = r11.A01
            long r0 = r4.A01(r1, r0)
        L_0x00c1:
            long r15 = r10.A0I
            long r8 = r10.A0I
            long r6 = r10.A02
            boolean r2 = r2.A0X
            if (r2 != 0) goto L_0x00e6
            long r4 = r10.A0I
            long r2 = r0 - r4
        L_0x00cf:
            X.4Rn r12 = r10.A09
            X.4Rb r13 = r10.A0A
            java.util.List r14 = r10.A0C
            r17 = r8
            r19 = r6
            r21 = r2
            X.5NA r2 = r10.A07(r11, r12, r13, r14, r15, r17, r19, r21)
            X.5NA r10 = r2.A06(r11)
        L_0x00e3:
            r10.A0H = r0
        L_0x00e5:
            return r10
        L_0x00e6:
            long r2 = r10.A0J
            goto L_0x00cf
        L_0x00e9:
            long r0 = r4.A01
            goto L_0x00c1
        L_0x00ec:
            int r3 = r11.A00
            r1 = -1
            r0 = 0
            if (r3 == r1) goto L_0x00f3
            r0 = 1
        L_0x00f3:
            r0 = r0 ^ 1
            X.C256703wD.A04(r0)
            boolean r0 = r2.A0X
            r2 = 0
            if (r0 != 0) goto L_0x0122
            long r0 = r10.A0J
            long r5 = r15 - r7
            long r0 = r0 - r5
        L_0x0103:
            long r21 = java.lang.Math.max(r2, r0)
            long r0 = r10.A0H
            X.4Rq r2 = r10.A07
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0113
            long r0 = r15 + r21
        L_0x0113:
            X.4Rn r12 = r10.A09
            X.4Rb r13 = r10.A0A
            java.util.List r14 = r10.A0C
            r17 = r15
            r19 = r15
            X.5NA r10 = r10.A07(r11, r12, r13, r14, r15, r17, r19, r21)
            goto L_0x00e3
        L_0x0122:
            long r0 = r10.A0J
            goto L_0x0103
        L_0x0125:
            long r6 = r2.A0L()
            goto L_0x0074
        L_0x012b:
            r11 = r4
            goto L_0x0062
        L_0x012e:
            int r3 = r11.A00
            r1 = -1
            r0 = 0
            if (r3 == r1) goto L_0x0135
            r0 = 1
        L_0x0135:
            r0 = r0 ^ 1
            X.C256703wD.A04(r0)
            r21 = 0
            if (r9 == 0) goto L_0x0155
            X.4Rn r12 = X.C264844Rn.A03
            X.4Rb r13 = r2.A0f
            com.google.common.collect.ImmutableList r14 = com.google.common.collect.ImmutableList.of()
        L_0x0146:
            r17 = r15
            r19 = r15
            X.5NA r0 = r10.A07(r11, r12, r13, r14, r15, r17, r19, r21)
            X.5NA r10 = r0.A06(r11)
            r10.A0H = r15
            return r10
        L_0x0155:
            X.4Rn r12 = r10.A09
            X.4Rb r13 = r10.A0A
            java.util.List r14 = r10.A0C
            goto L_0x0146
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C284515Mu.A06(android.util.Pair, X.5NA, com.google.android.exoplayer2.Timeline, boolean):X.5NA");
    }

    private ArrayList A08(List list, int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            AnonymousClass5NQ r0 = new AnonymousClass5NQ((C265164Su) list.get(i2), this.A16);
            arrayList.add(r0);
            this.A0i.add(i2 + i, new AnonymousClass5NT(r0.A02.A01, r0.A03));
        }
        this.A0D = this.A0D.AHz(i, arrayList.size());
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        if (r3.A03(r2, r1) == -1) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        if (r3.A04(r2, r1, r4.BwE()) == -1) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0089, code lost:
        if (r8.A0E(r4.A00, r4.AuC(), 0).A01() == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a5, code lost:
        if (r0 == false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (r8.A0E(r4.A00, r4.AuC(), 0).A0G == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A09() {
        /*
            r14 = this;
            X.4Rg r7 = r14.A0N
            X.4R4 r6 = r14.A0q
            X.4Rg r5 = r14.A0c
            boolean r13 = r6.CZN()
            r4 = r6
            X.4R3 r4 = (X.AnonymousClass4R3) r4
            com.google.android.exoplayer2.Timeline r8 = r4.AuY()
            int r0 = r8.A02()
            if (r0 == 0) goto L_0x0028
            int r3 = r4.AuC()
            X.4RE r2 = r4.A00
            r0 = 0
            X.4RE r0 = r8.A0E(r2, r3, r0)
            boolean r0 = r0.A0G
            r12 = 1
            if (r0 != 0) goto L_0x0029
        L_0x0028:
            r12 = 0
        L_0x0029:
            com.google.android.exoplayer2.Timeline r3 = r4.AuY()
            int r0 = r3.A02()
            if (r0 == 0) goto L_0x004a
            int r2 = r4.AuC()
            int r1 = r4.Bm2()
            r0 = 1
            if (r1 != r0) goto L_0x003f
            r1 = 0
        L_0x003f:
            r4.BwE()
            int r1 = r3.A03(r2, r1)
            r0 = -1
            r11 = 1
            if (r1 != r0) goto L_0x004b
        L_0x004a:
            r11 = 0
        L_0x004b:
            com.google.android.exoplayer2.Timeline r3 = r4.AuY()
            int r0 = r3.A02()
            if (r0 == 0) goto L_0x006d
            int r2 = r4.AuC()
            int r1 = r4.Bm2()
            r0 = 1
            if (r1 != r0) goto L_0x0061
            r1 = 0
        L_0x0061:
            boolean r0 = r4.BwE()
            int r1 = r3.A04(r2, r1, r0)
            r0 = -1
            r10 = 1
            if (r1 != r0) goto L_0x006e
        L_0x006d:
            r10 = 0
        L_0x006e:
            com.google.android.exoplayer2.Timeline r8 = r4.AuY()
            int r0 = r8.A02()
            if (r0 == 0) goto L_0x008b
            int r3 = r4.AuC()
            X.4RE r2 = r4.A00
            r0 = 0
            X.4RE r0 = r8.A0E(r2, r3, r0)
            boolean r0 = r0.A01()
            r9 = 1
            if (r0 != 0) goto L_0x008c
        L_0x008b:
            r9 = 0
        L_0x008c:
            com.google.android.exoplayer2.Timeline r8 = r4.AuY()
            int r0 = r8.A02()
            if (r0 == 0) goto L_0x00a7
            int r3 = r4.AuC()
            X.4RE r2 = r4.A00
            r0 = 0
            X.4RE r0 = r8.A0E(r2, r3, r0)
            boolean r0 = r0.A0D
            r4 = 1
            if (r0 != 0) goto L_0x00a8
        L_0x00a7:
            r4 = 0
        L_0x00a8:
            com.google.android.exoplayer2.Timeline r0 = r6.AuY()
            int r0 = r0.A02()
            r3 = 0
            if (r0 != 0) goto L_0x00b4
            r3 = 1
        L_0x00b4:
            X.4Rf r2 = new X.4Rf
            r2.<init>()
            X.4Rg r0 = X.C264784Rg.A01
            X.4Rh r0 = r5.A00
            r2.A02(r0)
            r1 = r13 ^ 1
            r0 = 4
            if (r1 == 0) goto L_0x00c8
            r2.A01(r0)
        L_0x00c8:
            if (r12 == 0) goto L_0x00d0
            if (r13 != 0) goto L_0x00d0
            r0 = 5
            r2.A01(r0)
        L_0x00d0:
            if (r11 == 0) goto L_0x00d8
            if (r13 != 0) goto L_0x00d8
            r0 = 6
            r2.A01(r0)
        L_0x00d8:
            if (r3 != 0) goto L_0x00e6
            if (r11 != 0) goto L_0x00e0
            if (r9 == 0) goto L_0x00e0
            if (r12 == 0) goto L_0x00e6
        L_0x00e0:
            if (r13 != 0) goto L_0x00e6
            r0 = 7
            r2.A01(r0)
        L_0x00e6:
            if (r10 == 0) goto L_0x00ef
            if (r13 != 0) goto L_0x00ef
            r0 = 8
            r2.A01(r0)
        L_0x00ef:
            if (r3 != 0) goto L_0x00fe
            if (r10 != 0) goto L_0x00f7
            if (r9 == 0) goto L_0x00fe
            if (r4 == 0) goto L_0x00fe
        L_0x00f7:
            if (r13 != 0) goto L_0x00fe
            r0 = 9
            r2.A01(r0)
        L_0x00fe:
            r0 = 10
            if (r1 == 0) goto L_0x0105
            r2.A01(r0)
        L_0x0105:
            if (r12 == 0) goto L_0x0113
            if (r13 != 0) goto L_0x0113
            r0 = 11
            r2.A01(r0)
            r0 = 12
            r2.A01(r0)
        L_0x0113:
            X.4Rh r1 = r2.A00()
            X.4Rg r0 = new X.4Rg
            r0.<init>(r1)
            r14.A0N = r0
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0130
            X.5N4 r2 = r14.A0h
            r1 = 13
            X.5NY r0 = new X.5NY
            r0.<init>(r14)
            r2.A02(r0, r1)
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C284515Mu.A09():void");
    }

    private void A0A() {
        IllegalStateException illegalStateException;
        this.A0y.A00();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.A0Y;
        if (currentThread != looper.getThread()) {
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", new Object[]{currentThread.getName(), looper.getThread().getName()});
            boolean z = this.A12;
            if (z) {
                StackTraceElement[] stackTrace = currentThread.getStackTrace();
                ArrayList arrayList = new ArrayList();
                for (int i = 2; i < Math.min(stackTrace.length, 7); i++) {
                    arrayList.add(stackTrace[i].getMethodName());
                }
                format = 002.A0g(format, "\nCalling Method Stack Trace: ", C2612548w.A00("<-", arrayList));
            }
            if (!this.A0H) {
                if (this.A0U) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                2AG.A06("ExoPlayerImpl", format, illegalStateException);
                if (!z) {
                    this.A0U = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException(format);
        }
    }

    public static void A0E(C284515Mu r2, int i, int i2) {
        AnonymousClass4S7 r1 = r2.A0R;
        if (i != r1.A01 || i2 != r1.A00) {
            r2.A0R = new AnonymousClass4S7(i, i2);
            AnonymousClass5N4 r22 = r2.A0h;
            r22.A02(new C22300XzA(), 24);
            r22.A01();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02b1, code lost:
        if (r7 != 0) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02b9, code lost:
        if (r6 != 0) goto L_0x02bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0098, code lost:
        if (r0.A0C.equals(r1.A0C) == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013f, code lost:
        if (r18 != false) goto L_0x0141;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0272  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0G(X.C284515Mu r34, X.AnonymousClass5NA r35, int r36, int r37, int r38, int r39, long r40, boolean r42, boolean r43) {
        /*
            r2 = r34
            r27 = r39
            X.5NA r0 = r2.A0C
            r1 = r35
            r2.A0C = r1
            com.google.android.exoplayer2.Timeline r5 = r0.A06
            com.google.android.exoplayer2.Timeline r9 = r1.A06
            boolean r3 = r5.equals(r9)
            r24 = r3 ^ 1
            int r3 = r9.A02()
            r11 = 0
            if (r3 != 0) goto L_0x001c
            r11 = 1
        L_0x001c:
            r10 = -1
            java.lang.Integer r19 = java.lang.Integer.valueOf(r10)
            r23 = 0
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r23)
            r35 = r38
            if (r11 == 0) goto L_0x009b
            int r3 = r5.A02()
            if (r3 != 0) goto L_0x009b
            r8 = 1
        L_0x0032:
            android.util.Pair r6 = new android.util.Pair
            r4 = r19
            r3 = r18
            r6.<init>(r3, r4)
        L_0x003b:
            java.lang.Object r3 = r6.first
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r22 = r3.booleanValue()
            X.4RP r4 = r2.A0A
            r21 = 0
            if (r22 == 0) goto L_0x0090
            if (r11 != 0) goto L_0x0063
            X.4Rq r3 = r1.A08
            java.lang.Object r4 = r3.A04
            X.4Rc r3 = r2.A0e
            X.4Rc r3 = r9.A0B(r3, r4)
            int r7 = r3.A00
            X.4RE r6 = r2.A00
            r3 = 0
            X.4RE r3 = r9.A0E(r6, r7, r3)
            X.4RL r3 = r3.A09
            r21 = r3
        L_0x0063:
            X.4RP r3 = X.AnonymousClass4RP.A0V
            r2.A0B = r3
        L_0x0067:
            X.4RP r3 = r2.A0B
            X.4RQ r9 = new X.4RQ
            r9.<init>(r3)
            java.util.List r11 = r1.A0C
            r7 = 0
        L_0x0071:
            int r3 = r11.size()
            if (r7 >= r3) goto L_0x0114
            java.lang.Object r6 = r11.get(r7)
            com.google.android.exoplayer2.metadata.Metadata r6 = (com.google.android.exoplayer2.metadata.Metadata) r6
            r4 = 0
        L_0x007e:
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r3 = r6.A01
            int r3 = r3.length
            if (r4 >= r3) goto L_0x008d
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r3 = r6.A01
            r3 = r3[r4]
            r3.E37(r9)
            int r4 = r4 + 1
            goto L_0x007e
        L_0x008d:
            int r7 = r7 + 1
            goto L_0x0071
        L_0x0090:
            java.util.List r6 = r0.A0C
            java.util.List r3 = r1.A0C
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x011f
            goto L_0x0067
        L_0x009b:
            int r3 = r5.A02()
            r8 = 0
            if (r3 != 0) goto L_0x00a3
            r8 = 1
        L_0x00a3:
            r17 = 3
            r16 = 1
            if (r11 != r8) goto L_0x00de
            X.4Rq r13 = r0.A08
            java.lang.Object r3 = r13.A04
            X.4Rc r7 = r2.A0e
            X.4Rc r3 = r5.A0B(r7, r3)
            int r12 = r3.A00
            X.4RE r6 = r2.A00
            r3 = 0
            X.4RE r12 = r5.A0E(r6, r12, r3)
            java.lang.Object r15 = r12.A0C
            X.4Rq r12 = r1.A08
            java.lang.Object r14 = r12.A04
            X.4Rc r7 = r9.A0B(r7, r14)
            int r7 = r7.A00
            X.4RE r3 = r9.A0E(r6, r7, r3)
            java.lang.Object r3 = r3.A0C
            boolean r3 = r15.equals(r3)
            r4 = 5
            if (r3 != 0) goto L_0x00fd
            if (r43 == 0) goto L_0x00f5
            r3 = r35
            if (r3 != r4) goto L_0x00ed
            r17 = 1
        L_0x00de:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r16)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
        L_0x00e6:
            android.util.Pair r6 = new android.util.Pair
            r6.<init>(r4, r3)
            goto L_0x003b
        L_0x00ed:
            r4 = r3
            r3 = r16
            if (r4 != r3) goto L_0x00f5
            r17 = 2
            goto L_0x00de
        L_0x00f5:
            if (r24 != 0) goto L_0x00de
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00fd:
            if (r43 == 0) goto L_0x0032
            r3 = r35
            if (r3 != r4) goto L_0x0032
            long r6 = r13.A03
            long r3 = r12.A03
            int r12 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r12 >= 0) goto L_0x0032
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r16)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r23)
            goto L_0x00e6
        L_0x0114:
            X.4RP r3 = new X.4RP
            r3.<init>(r9)
            r2.A0B = r3
            X.4RP r4 = A05(r2)
        L_0x011f:
            X.4RP r3 = r2.A0A
            boolean r3 = r4.equals(r3)
            r20 = r3 ^ 1
            r2.A0A = r4
            boolean r3 = r0.A0F
            r19 = r3
            boolean r15 = r1.A0F
            r18 = 0
            if (r3 == r15) goto L_0x0135
            r18 = 1
        L_0x0135:
            int r13 = r0.A00
            int r12 = r1.A00
            r17 = 1
            if (r13 != r12) goto L_0x0141
            r17 = 0
            if (r18 == 0) goto L_0x0144
        L_0x0141:
            A0D(r2)
        L_0x0144:
            boolean r4 = r0.A0E
            boolean r3 = r1.A0E
            r16 = 0
            if (r4 == r3) goto L_0x014e
            r16 = 1
        L_0x014e:
            if (r24 == 0) goto L_0x015e
            X.5N4 r6 = r2.A0h
            X.5NV r4 = new X.5NV
            r3 = r36
            r4.<init>(r1, r3)
            r3 = r23
            r6.A02(r4, r3)
        L_0x015e:
            if (r43 == 0) goto L_0x0209
            X.4Rc r11 = new X.4Rc
            r11.<init>()
            r14 = 0
            if (r8 != 0) goto L_0x0374
            X.4Rq r3 = r0.A08
            java.lang.Object r9 = r3.A04
            r5.A0B(r11, r9)
            int r3 = r11.A00
            r27 = r3
            int r28 = r5.A06(r9)
            X.4RE r6 = r2.A00
            r3 = 0
            r7 = r27
            X.4RE r3 = r5.A0E(r6, r7, r3)
            java.lang.Object r14 = r3.A0C
            X.4RL r3 = r6.A09
            r24 = r3
        L_0x0187:
            r4 = 5
            X.4Rq r7 = r0.A08
            int r8 = r7.A00
            r5 = 0
            if (r8 == r10) goto L_0x0190
            r5 = 1
        L_0x0190:
            r3 = r35
            if (r3 != r4) goto L_0x0353
            if (r5 == 0) goto L_0x035f
            int r3 = r7.A01
            long r3 = r11.A01(r8, r3)
        L_0x019c:
            long r5 = A02(r0)
        L_0x01a0:
            long r31 = com.google.android.exoplayer2.util.Util.A08(r3)
            long r33 = com.google.android.exoplayer2.util.Util.A08(r5)
            int r3 = r7.A01
            X.5ni r11 = new X.5ni
            r23 = r11
            r25 = r14
            r26 = r9
            r29 = r8
            r30 = r3
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r33)
            int r6 = r2.AuC()
            X.5NA r5 = r2.A0C
            com.google.android.exoplayer2.Timeline r4 = r5.A06
            int r3 = r4.A02()
            if (r3 != 0) goto L_0x0330
            r3 = 0
            r9 = r3
            r5 = r3
            r28 = -1
        L_0x01cc:
            long r31 = com.google.android.exoplayer2.util.Util.A08(r40)
            X.5NA r7 = r2.A0C
            X.4Rq r4 = r7.A08
            int r4 = r4.A00
            if (r4 == r10) goto L_0x032c
            long r7 = A02(r7)
            long r33 = com.google.android.exoplayer2.util.Util.A08(r7)
        L_0x01e0:
            X.5NA r4 = r2.A0C
            X.4Rq r4 = r4.A08
            int r8 = r4.A00
            int r7 = r4.A01
            X.5ni r4 = new X.5ni
            r23 = r4
            r24 = r9
            r25 = r3
            r26 = r5
            r27 = r6
            r29 = r8
            r30 = r7
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r33)
            X.5N4 r7 = r2.A0h
            r6 = 11
            X.5nj r5 = new X.5nj
            r3 = r35
            r5.<init>(r11, r4, r3)
            r7.A02(r5, r6)
        L_0x0209:
            if (r22 == 0) goto L_0x0218
            X.5N4 r5 = r2.A0h
            X.5NX r4 = new X.5NX
            r3 = r21
            r4.<init>(r3)
            r3 = 1
            r5.A02(r4, r3)
        L_0x0218:
            X.48u r3 = r0.A04
            X.48u r6 = r1.A04
            if (r3 == r6) goto L_0x0234
            X.5N4 r5 = r2.A0h
            X.XzC r3 = new X.XzC
            r3.<init>(r1)
            r4 = 10
            r5.A02(r3, r4)
            if (r6 == 0) goto L_0x0234
            X.XzD r3 = new X.XzD
            r3.<init>(r1)
            r5.A02(r3, r4)
        L_0x0234:
            X.4Rb r4 = r0.A0A
            X.4Rb r3 = r1.A0A
            if (r4 == r3) goto L_0x024f
            X.4Qq r4 = r2.A0v
            java.lang.Object r3 = r3.A02
            X.4Qp r4 = (X.C264624Qp) r4
            X.4Tb r3 = (X.C265234Tb) r3
            r4.A00 = r3
            X.5N4 r5 = r2.A0h
            r4 = 2
            X.5Nl r3 = new X.5Nl
            r3.<init>(r1)
            r5.A02(r3, r4)
        L_0x024f:
            if (r20 == 0) goto L_0x025f
            X.4RP r6 = r2.A0A
            X.5N4 r5 = r2.A0h
            r4 = 14
            X.XzE r3 = new X.XzE
            r3.<init>(r6)
            r5.A02(r3, r4)
        L_0x025f:
            if (r16 == 0) goto L_0x026c
            X.5N4 r5 = r2.A0h
            r4 = 3
            X.5Nm r3 = new X.5Nm
            r3.<init>(r1)
            r5.A02(r3, r4)
        L_0x026c:
            boolean r3 = r2.A0k
            r5 = 7
            r8 = 6
            if (r3 != 0) goto L_0x0312
            r4 = r15
            r3 = r18
        L_0x0275:
            if (r17 != 0) goto L_0x0279
            if (r3 == 0) goto L_0x028e
        L_0x0279:
            X.5N4 r6 = r2.A0h
            X.5NZ r3 = new X.5NZ
            r3.<init>(r1, r4)
            r6.A02(r3, r10)
            if (r17 == 0) goto L_0x028e
            r4 = 4
            X.5Na r3 = new X.5Na
            r3.<init>(r1)
            r6.A02(r3, r4)
        L_0x028e:
            if (r18 == 0) goto L_0x029b
            X.5N4 r6 = r2.A0h
            r4 = 5
            X.XDV r3 = new X.XDV
            r3.<init>(r1)
            r6.A02(r3, r4)
        L_0x029b:
            int r7 = r0.A01
            int r6 = r1.A01
            if (r7 == r6) goto L_0x02ab
            X.5N4 r4 = r2.A0h
            X.XzF r3 = new X.XzF
            r3.<init>(r1)
            r4.A02(r3, r8)
        L_0x02ab:
            r3 = 3
            if (r13 != r3) goto L_0x02b3
            if (r19 == 0) goto L_0x02b3
            r4 = 1
            if (r7 == 0) goto L_0x02b4
        L_0x02b3:
            r4 = 0
        L_0x02b4:
            if (r12 != r3) goto L_0x02bb
            if (r15 == 0) goto L_0x02bb
            r3 = 1
            if (r6 == 0) goto L_0x02bc
        L_0x02bb:
            r3 = 0
        L_0x02bc:
            if (r4 == r3) goto L_0x02c8
            X.5N4 r4 = r2.A0h
            X.5Nn r3 = new X.5Nn
            r3.<init>(r1)
            r4.A02(r3, r5)
        L_0x02c8:
            X.4P7 r4 = r0.A05
            X.4P7 r3 = r1.A05
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x02de
            X.5N4 r5 = r2.A0h
            r4 = 12
            X.XzG r3 = new X.XzG
            r3.<init>(r1)
            r5.A02(r3, r4)
        L_0x02de:
            if (r42 == 0) goto L_0x02ea
            X.5N4 r4 = r2.A0h
            X.5j5 r3 = new X.5j5
            r3.<init>()
            r4.A02(r3, r10)
        L_0x02ea:
            r2.A09()
            X.5N4 r3 = r2.A0h
            r3.A01()
            boolean r3 = r0.A0G
            boolean r0 = r1.A0G
            if (r3 == r0) goto L_0x037b
            java.util.concurrent.CopyOnWriteArraySet r0 = r2.A0j
            java.util.Iterator r1 = r0.iterator()
        L_0x02fe:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x037b
            java.lang.Object r0 = r1.next()
            X.5My r0 = (X.C284535My) r0
            X.5Mv r0 = (X.C284525Mv) r0
            X.5Mu r0 = r0.A00
            A0D(r0)
            goto L_0x02fe
        L_0x0312:
            boolean r3 = r2.A15
            r4 = r37
            if (r3 == 0) goto L_0x0325
            if (r4 == r8) goto L_0x0320
            if (r4 != r5) goto L_0x032a
            boolean r3 = r2.A0G
            if (r3 == 0) goto L_0x032a
        L_0x0320:
            r3 = 1
        L_0x0321:
            boolean r4 = r2.A0G
            goto L_0x0275
        L_0x0325:
            if (r4 == r8) goto L_0x0320
            if (r4 != r5) goto L_0x032a
            goto L_0x0320
        L_0x032a:
            r3 = 0
            goto L_0x0321
        L_0x032c:
            r33 = r31
            goto L_0x01e0
        L_0x0330:
            X.4Rq r3 = r5.A08
            java.lang.Object r5 = r3.A04
            X.4Rc r3 = r2.A0e
            r4.A0B(r3, r5)
            X.5NA r3 = r2.A0C
            com.google.android.exoplayer2.Timeline r3 = r3.A06
            int r28 = r3.A06(r5)
            X.5NA r3 = r2.A0C
            com.google.android.exoplayer2.Timeline r8 = r3.A06
            X.4RE r7 = r2.A00
            r3 = 0
            X.4RE r3 = r8.A0E(r7, r6, r3)
            java.lang.Object r3 = r3.A0C
            X.4RL r9 = r7.A09
            goto L_0x01cc
        L_0x0353:
            if (r5 == 0) goto L_0x0359
            long r3 = r0.A0I
            goto L_0x019c
        L_0x0359:
            long r3 = r11.A02
            long r5 = r0.A0I
            long r3 = r3 + r5
            goto L_0x0369
        L_0x035f:
            int r3 = r7.A02
            if (r3 == r10) goto L_0x036c
            X.5NA r3 = r2.A0C
            long r3 = A02(r3)
        L_0x0369:
            r5 = r3
            goto L_0x01a0
        L_0x036c:
            long r5 = r11.A02
            long r3 = r11.A01
            long r5 = r5 + r3
            r3 = r5
            goto L_0x01a0
        L_0x0374:
            r24 = r14
            r9 = r14
            r28 = -1
            goto L_0x0187
        L_0x037b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C284515Mu.A0G(X.5Mu, X.5NA, int, int, int, int, long, boolean, boolean):void");
    }

    public static void A0H(C284515Mu r12, Object obj) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        AnonymousClass4PL[] r7 = r12.A17;
        int length = r7.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= length) {
                break;
            }
            AnonymousClass4PL r3 = r7[i];
            if (((AnonymousClass4PK) r3).A0B == 2) {
                AnonymousClass4SA A072 = r12.A07(r3);
                A072.A01(1);
                A072.A02(obj);
                A072.A00();
                arrayList.add(A072);
            }
            i++;
        }
        Object obj2 = r12.A0E;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass4SA r8 = (AnonymousClass4SA) it.next();
                    long j = r12.A0l;
                    synchronized (r8) {
                        C256703wD.A04(r8.A07);
                        boolean z2 = false;
                        if (r8.A03.getThread() != Thread.currentThread()) {
                            z2 = true;
                        }
                        C256703wD.A04(z2);
                        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
                        while (!r8.A06) {
                            if (j > 0) {
                                r8.wait(j);
                                j = elapsedRealtime - SystemClock.elapsedRealtime();
                            } else {
                                throw new TimeoutException("Message delivery timed out.");
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = r12.A0E;
            Surface surface = r12.A08;
            if (obj3 == surface) {
                surface.release();
                r12.A08 = null;
            }
        }
        r12.A0E = obj;
        if (z) {
            r12.A0C(C2612348u.A01(new Y5H(3), 1003), false);
        }
    }

    public static void A0I(C284515Mu r5, Object obj, int i, int i2) {
        for (AnonymousClass4PL r1 : r5.A17) {
            if (((AnonymousClass4PK) r1).A0B == i) {
                AnonymousClass4SA A072 = r5.A07(r1);
                A072.A01(i2);
                A072.A02(obj);
                A072.A00();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [X.5ND, java.lang.Object] */
    public final void A0K(int i, int i2, boolean z, long j) {
        long j2;
        A0A();
        int i3 = 1;
        boolean z2 = false;
        int i4 = i;
        if (i >= 0) {
            z2 = true;
        }
        C256703wD.A03(z2);
        Timeline timeline = this.A0C.A06;
        if (timeline.A02() == 0 || i4 < timeline.A02()) {
            this.A03++;
            if (CZN()) {
                2AG.A04("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                AnonymousClass5NA r0 = this.A0C;
                ? obj = new Object();
                obj.A03 = r0;
                obj.A00(1);
                C284515Mu r2 = ((AnonymousClass5N8) this.A0p).A00;
                ((AnonymousClass4S5) r2.A0g).A00.post(new C284575Nc(r2, obj));
                return;
            }
            A0A();
            if (this.A0C.A00 != 1) {
                i3 = 2;
            }
            if (this.A0z) {
                A0A();
                i3 = this.A0C.A00;
            }
            int AuC = AuC();
            AnonymousClass5NA A012 = this.A0C.A01(i3);
            if (this.A14) {
                timeline = A012.A06;
            }
            long j3 = j;
            AnonymousClass5NA A062 = A06(A03(timeline, i4, j3), A012, timeline, false);
            this.A0b.A0k.CsU(new C284705Np(timeline, i4, Util.A07(j3)), 3).A01();
            if (this.A13) {
                try {
                    j2 = A01(A062);
                } catch (Exception e) {
                    2AG.A06("ExoPlayerImpl", "Encountered error in periodUid whilst retrieving current position", e);
                    j2 = -9223372036854775807L;
                }
            } else {
                j2 = A01(A062);
            }
            A0G(this, A062, 3, 1, 1, AuC, j2, true, true);
        }
    }

    public final void A8z(AnonymousClass4RS r4) {
        AnonymousClass5N4 r1 = this.A0h;
        r4.getClass();
        synchronized (r1.A06) {
            if (!r1.A01) {
                r1.A09.add(new AnonymousClass5NG(r4));
            }
        }
    }

    public final void A9I(C265164Su r17) {
        A0A();
        List singletonList = Collections.singletonList(r17);
        A0A();
        List list = this.A0i;
        int size = list.size();
        A0A();
        boolean z = false;
        if (size >= 0) {
            z = true;
        }
        C256703wD.A03(z);
        int min = Math.min(size, list.size());
        A0A();
        Timeline timeline = this.A0C.A06;
        this.A03++;
        ArrayList A082 = A08(singletonList, min);
        AnonymousClass4TA r2 = new AnonymousClass4TA(this.A0D, list);
        AnonymousClass5NA A062 = A06(A04(timeline, r2), this.A0C, r2, false);
        AnonymousClass5NB r0 = this.A0b;
        AnonymousClass5N7 r9 = this.A0D;
        AnonymousClass4S6 r3 = r0.A0k;
        AnonymousClass5NU r8 = new AnonymousClass5NU(r9, A082, -1, -9223372036854775807L);
        AnonymousClass4S5 r32 = (AnonymousClass4S5) r3;
        AnonymousClass4SD A002 = AnonymousClass4S5.A00();
        A002.A00 = r32.A00.obtainMessage(18, min, 0, r8);
        A002.A01 = r32;
        A002.A01();
        A0G(this, A062, 3, 1, 4, -1, -9223372036854775807L, false, false);
    }

    public final SparseArray Aar() {
        AnonymousClass4TC r0 = this.A0b.A0c.A05;
        SparseArray sparseArray = new SparseArray();
        if (r0 != null) {
            AnonymousClass4TD[] r4 = r0.A0B;
            for (AnonymousClass4TD r1 : r4) {
                if (r1 instanceof AnonymousClass4TP) {
                    AnonymousClass4TP r12 = (AnonymousClass4TP) r1;
                    sparseArray.put(r12.A0F, Long.valueOf(r12.A0I.A05()));
                }
            }
        }
        return sparseArray;
    }

    public final long AiQ() {
        long j = this.A0C.A0H;
        UUID uuid = AnonymousClass4T7.A03;
        return Util.A08(j);
    }

    public final long AiR() {
        long j = this.A0C.A0J;
        UUID uuid = AnonymousClass4T7.A03;
        return Util.A08(j);
    }

    public final long Atl() {
        if (!this.A11) {
            return AuI();
        }
        AnonymousClass5NA r1 = this.A0C;
        if (r1.A06.A02() == 0) {
            return this.A06;
        }
        long j = r1.A0I;
        UUID uuid = AnonymousClass4T7.A03;
        return Util.A08(j);
    }

    public final HandlerThread BIU() {
        return this.A0b.A0X;
    }

    public final boolean BIz() {
        return this.A0C.A0D;
    }

    public final long BlI() {
        return this.A0b.A0l.Bds() / 1000;
    }

    public final Integer Byk() {
        return this.A0C.A0B;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0071, code lost:
        if (r4 >= r8.A02) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x011c, code lost:
        if (r5 >= r9.A02) goto L_0x011e;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E3q(X.C265164Su r26, boolean r27, boolean r28) {
        /*
            r25 = this;
            r10 = r25
            r10.A0A()
            boolean r0 = r10.A0T
            if (r0 == 0) goto L_0x00ca
            r10.A0A()
            int r4 = r10.A00()
            X.5NA r0 = r10.A0C
            com.google.android.exoplayer2.Timeline r0 = r0.A06
            int r0 = r0.A02()
            if (r0 != 0) goto L_0x00c4
            r2 = 0
            long r5 = r10.A07
            long r0 = r10.A06
            long r0 = java.lang.Math.max(r5, r0)
            long r0 = java.lang.Math.max(r2, r0)
        L_0x0028:
            int r2 = r10.A03
            r13 = 1
            int r2 = r2 + 1
            r10.A03 = r2
            java.util.List r5 = r10.A0i
            boolean r2 = r5.isEmpty()
            r3 = 0
            if (r2 != 0) goto L_0x003f
            int r2 = r5.size()
            r10.A0B(r2)
        L_0x003f:
            java.util.List r2 = java.util.Collections.singletonList(r26)
            java.util.ArrayList r21 = r10.A08(r2, r3)
            X.5NA r2 = r10.A0C
            int r2 = r2.A00
            if (r2 != r13) goto L_0x00c3
            X.5N7 r2 = r10.A0D
            X.4TA r8 = new X.4TA
            r8.<init>(r2, r5)
            X.5NA r5 = r10.A0C
            android.util.Pair r2 = r10.A03(r8, r4, r0)
            r18 = 0
            X.5NA r7 = r10.A06(r2, r5, r8, r3)
            int r6 = r7.A00
            r15 = -1
            r5 = 2
            if (r4 == r15) goto L_0x0074
            if (r6 == r13) goto L_0x0074
            int r2 = r8.A02()
            if (r2 == 0) goto L_0x0073
            int r2 = r8.A02
            r6 = 2
            if (r4 < r2) goto L_0x0074
        L_0x0073:
            r6 = 4
        L_0x0074:
            X.5NA r6 = r7.A01(r6)
            X.5NA r2 = r10.A0C
            X.4Rq r2 = r2.A08
            java.lang.Object r7 = r2.A04
            X.4Rq r2 = r6.A08
            java.lang.Object r2 = r2.A04
            boolean r2 = r7.equals(r2)
            if (r2 != 0) goto L_0x0093
            X.5NA r2 = r10.A0C
            com.google.android.exoplayer2.Timeline r2 = r2.A06
            int r2 = r2.A02()
            if (r2 == 0) goto L_0x0093
            r3 = 1
        L_0x0093:
            r2 = 0
            X.5NA r2 = r6.A03(r2)
            X.5NA r11 = r2.A01(r5)
            X.5NB r2 = r10.A0b
            long r16 = com.google.android.exoplayer2.util.Util.A07(r0)
            X.5N7 r0 = r10.A0D
            X.4S6 r2 = r2.A0k
            X.5NU r1 = new X.5NU
            r19 = r1
            r20 = r0
            r22 = r4
            r23 = r16
            r19.<init>(r20, r21, r22, r23)
            r0 = 27
            X.4SD r0 = r2.CsU(r1, r0)
            r0.A01()
            r12 = 4
            r14 = r12
            r19 = r3
            A0G(r10, r11, r12, r13, r14, r15, r16, r18, r19)
        L_0x00c3:
            return
        L_0x00c4:
            long r0 = r10.AuI()
            goto L_0x0028
        L_0x00ca:
            r10.A0A()
            java.util.List r7 = java.util.Collections.singletonList(r26)
            r10.A0A()
            r15 = -1
            int r5 = r10.A00()
            long r0 = r10.AuI()
            int r2 = r10.A03
            r3 = 1
            int r2 = r2 + 1
            r10.A03 = r2
            java.util.List r6 = r10.A0i
            boolean r4 = r6.isEmpty()
            r2 = 0
            if (r4 != 0) goto L_0x00f4
            int r4 = r6.size()
            r10.A0B(r4)
        L_0x00f4:
            java.util.ArrayList r18 = r10.A08(r7, r2)
            X.5N7 r4 = r10.A0D
            X.4TA r9 = new X.4TA
            r9.<init>(r4, r6)
            int r4 = r9.A02()
            r8 = 0
            if (r4 != 0) goto L_0x016e
            r8 = 1
        L_0x0107:
            X.5NA r6 = r10.A0C
            android.util.Pair r4 = r10.A03(r9, r5, r0)
            X.5NA r7 = r10.A06(r4, r6, r9, r2)
            int r6 = r7.A00
            if (r5 == r15) goto L_0x011f
            if (r6 == r3) goto L_0x011f
            if (r8 != 0) goto L_0x011e
            int r4 = r9.A02
            r6 = 2
            if (r5 < r4) goto L_0x011f
        L_0x011e:
            r6 = 4
        L_0x011f:
            X.5NA r11 = r7.A01(r6)
            X.5NB r4 = r10.A0b
            long r20 = com.google.android.exoplayer2.util.Util.A07(r0)
            X.5N7 r0 = r10.A0D
            X.4S6 r4 = r4.A0k
            X.5NU r1 = new X.5NU
            r16 = r1
            r17 = r0
            r19 = r5
            r16.<init>(r17, r18, r19, r20)
            r0 = 17
            X.4SD r0 = r4.CsU(r1, r0)
            r0.A01()
            X.5NA r0 = r10.A0C
            X.4Rq r0 = r0.A08
            java.lang.Object r1 = r0.A04
            X.4Rq r0 = r11.A08
            java.lang.Object r0 = r0.A04
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x015b
            X.5NA r0 = r10.A0C
            com.google.android.exoplayer2.Timeline r0 = r0.A06
            int r0 = r0.A02()
            if (r0 != 0) goto L_0x015c
        L_0x015b:
            r3 = 0
        L_0x015c:
            r12 = 3
            long r16 = r10.A01(r11)
            r13 = 1
            r14 = 7
            r19 = r3
            r18 = r2
            A0G(r10, r11, r12, r13, r14, r15, r16, r18, r19)
            r10.E3m()
            return
        L_0x016e:
            int r4 = r9.A02
            if (r15 < r4) goto L_0x0107
            X.V22 r0 = new X.V22
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C284515Mu.E3q(X.4Su, boolean, boolean):void");
    }

    public final void EDF() {
        AnonymousClass5N4 r0 = this.A0h;
        AnonymousClass5N4.A00(r0);
        r0.A09.clear();
    }

    public final void EL1(long j) {
        long j2;
        long j3 = j;
        if (!this.A11) {
            A0J(AuC(), j3);
            return;
        }
        A0A();
        Timeline timeline = this.A0C.A06;
        this.A03++;
        this.A06 = j3;
        A0A();
        AnonymousClass5NA r4 = this.A0C;
        int i = 2;
        if (r4.A00 == 1) {
            i = 1;
        }
        if (this.A0z) {
            A0A();
            r4 = this.A0C;
            i = r4.A00;
        }
        AnonymousClass5NA A062 = A06(A03(timeline, 0, j3), r4.A01(i), timeline, true);
        this.A0b.A0k.CsU(new C290315f7(A062.A08, Util.A07(j3)), 26).A01();
        if (this.A13) {
            try {
                j2 = A01(A062);
            } catch (Exception e) {
                2AG.A06("ExoPlayerImpl", "Encountered error in periodUid whilst retrieving current position", e);
                j2 = -9223372036854775807L;
            }
        } else {
            j2 = A01(A062);
        }
        A0G(this, A062, 3, 1, 1, 0, j2, true, true);
    }

    public final void EiI(long j) {
        this.A0b.A0l.A02(j * 1000);
    }

    public final void release() {
        String str;
        boolean z;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str2 = Util.A02;
        synchronized (27e.class) {
            str = 27e.A00;
        }
        002.A18("Release ", hexString, " [", "ExoPlayerLib/2.8.1", "] [", str2, "] [", str, "]");
        2AG.A02();
        A0A();
        this.A0d.release();
        this.A0r.Elw(false);
        this.A0s.Elw(false);
        this.A0Z.release();
        AnonymousClass5NB r5 = this.A0b;
        synchronized (r5) {
            if (r5.A0P || !r5.A0Y.getThread().isAlive()) {
                z = true;
            } else {
                ((AnonymousClass4S5) r5.A0k).A00.sendEmptyMessage(7);
                long j = 500;
                long elapsedRealtime = SystemClock.elapsedRealtime() + 500;
                boolean z2 = false;
                while (!r5.A0P && j > 0) {
                    try {
                        r5.wait(j);
                    } catch (InterruptedException unused) {
                        z2 = true;
                    }
                    j = elapsedRealtime - SystemClock.elapsedRealtime();
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                z = r5.A0P;
            }
        }
        if (!z) {
            AnonymousClass5N4 r2 = this.A0h;
            r2.A02(new C22301XzB(), 10);
            r2.A01();
        }
        AnonymousClass5N4 r0 = this.A0h;
        AnonymousClass5N4.A00(r0);
        synchronized (r0.A06) {
            r0.A01 = true;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = r0.A09;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            AnonymousClass5NG r1 = (AnonymousClass5NG) it.next();
            r1.A02 = true;
            if (r1.A01) {
                r1.A01 = false;
                r1.A00.A00();
            }
        }
        copyOnWriteArraySet.clear();
        ((AnonymousClass4S5) this.A0g).A00.removeCallbacksAndMessages((Object) null);
        this.A0w.EDe(this.A0t);
        AnonymousClass5NA A012 = this.A0C.A01(1);
        this.A0C = A012;
        AnonymousClass5NA A062 = A012.A06(A012.A08);
        this.A0C = A062;
        A062.A0H = A062.A0I;
        this.A0C.A0J = 0;
        this.A0v.A02();
        Surface surface = this.A08;
        if (surface != null) {
            surface.release();
            this.A08 = null;
        }
        this.A0Q = C264804Ri.A01;
        this.A0W = true;
    }

    public static AnonymousClass4RP A05(C284515Mu r5) {
        r5.A0A();
        Timeline timeline = r5.A0C.A06;
        if (timeline.A02() == 0) {
            return r5.A0B;
        }
        AnonymousClass4RL r2 = timeline.A0E(r5.A00, r5.AuC(), 0).A09;
        AnonymousClass4RQ r1 = new AnonymousClass4RQ(r5.A0B);
        r1.A00(r2.A05);
        return new AnonymousClass4RP(r1);
    }

    private AnonymousClass4SA A07(AnonymousClass4PM r8) {
        int A002 = A00();
        AnonymousClass5NB r2 = this.A0b;
        Timeline timeline = this.A0C.A06;
        if (A002 == -1) {
            A002 = 0;
        }
        return new AnonymousClass4SA(r2.A0Y, r2, r8, timeline, this.A0x, A002);
    }

    public static void A0D(C284515Mu r4) {
        r4.A0A();
        int i = r4.A0C.A00;
        boolean z = true;
        if (i != 1) {
            if (i == 2 || i == 3) {
                r4.A0A();
                boolean z2 = r4.A0C.A0G;
                AnonymousClass4T6 r1 = r4.A0r;
                r4.A0A();
                if (!r4.A0C.A0F || z2) {
                    z = false;
                }
                r1.Elw(z);
                AnonymousClass4UM r12 = r4.A0s;
                r4.A0A();
                r12.Elw(r4.A0C.A0F);
                return;
            } else if (i != 4) {
                throw new IllegalStateException();
            }
        }
        r4.A0r.Elw(false);
        r4.A0s.Elw(false);
    }

    public final long A0L() {
        A0A();
        if (!CZN()) {
            return AuI();
        }
        AnonymousClass5NA r0 = this.A0C;
        Timeline timeline = r0.A06;
        Object obj = r0.A08.A04;
        C264744Rc r6 = this.A0e;
        timeline.A0B(r6, obj);
        AnonymousClass5NA r3 = this.A0C;
        long j = r3.A03;
        if (j != -9223372036854775807L) {
            return Util.A08(r6.A02) + Util.A08(j);
        }
        return Util.A08(r3.A06.A0E(this.A00, AuC(), 0).A02);
    }

    public final void ADy(long j) {
        A0J(AuC(), j);
    }

    public final AnonymousClass4SA AMN(AnonymousClass4PM r2) {
        A0A();
        return A07(r2);
    }

    public final long AiT() {
        long j;
        A0A();
        if (CZN()) {
            AnonymousClass5NA r0 = this.A0C;
            if (!r0.A07.equals(r0.A08)) {
                return AzG();
            }
            j = this.A0C.A0H;
        } else {
            A0A();
            AnonymousClass5NA r6 = this.A0C;
            Timeline timeline = r6.A06;
            if (timeline.A02() == 0) {
                return this.A07;
            }
            if (r6.A07.A03 != r6.A08.A03) {
                j = timeline.A0E(this.A00, AuC(), 0).A03;
            } else {
                long j2 = r6.A0H;
                AnonymousClass5NA r2 = this.A0C;
                C264874Rq r5 = r2.A07;
                if (r5.A00 != -1) {
                    r2.A06.A0B(this.A0e, r5.A04);
                    r2 = this.A0C;
                    r5 = r2.A07;
                    j2 = 0;
                }
                Timeline timeline2 = r2.A06;
                Object obj = r5.A04;
                C264744Rc r02 = this.A0e;
                timeline2.A0B(r02, obj);
                return Util.A08(j2 + r02.A02);
            }
        }
        return Util.A08(j);
    }

    public final int AuC() {
        A0A();
        int A002 = A00();
        if (A002 == -1) {
            return 0;
        }
        return A002;
    }

    public final long AuI() {
        A0A();
        return Util.A08(A01(this.A0C));
    }

    public final Timeline AuY() {
        A0A();
        return this.A0C.A06;
    }

    public final C264844Rn Aub() {
        A0A();
        return this.A0C.A09;
    }

    public final AnonymousClass4TK Auc() {
        A0A();
        return new AnonymousClass4TK(this.A0C.A0A.A04);
    }

    public final int Auj() {
        return AuC();
    }

    public final long AzG() {
        long j;
        A0A();
        if (CZN()) {
            AnonymousClass5NA r0 = this.A0C;
            C264874Rq r3 = r0.A08;
            Timeline timeline = r0.A06;
            Object obj = r3.A04;
            C264744Rc r2 = this.A0e;
            timeline.A0B(r2, obj);
            j = r2.A01(r3.A00, r3.A01);
        } else {
            A0A();
            Timeline timeline2 = this.A0C.A06;
            if (timeline2.A02() == 0) {
                return -9223372036854775807L;
            }
            j = timeline2.A0E(this.A00, AuC(), 0).A03;
        }
        return Util.A08(j);
    }

    public final boolean Bd1() {
        A0A();
        return this.A0C.A0F;
    }

    public final int BdC() {
        A0A();
        return this.A0C.A00;
    }

    public final int Bm2() {
        A0A();
        return this.A0J;
    }

    public final boolean BwE() {
        A0A();
        return false;
    }

    public final boolean CZN() {
        A0A();
        if (this.A0C.A08.A00 != -1) {
            return true;
        }
        return false;
    }

    @Deprecated
    public final void EJE() {
        A0A();
        E3m();
    }

    public final void Efw(boolean z) {
        A0A();
        AnonymousClass5NJ r1 = this.A0Z;
        A0A();
        int FJe = r1.FJe(z, this.A0C.A00);
        int i = 1;
        if (z && FJe != 1) {
            i = 2;
        }
        A0F(this, FJe, i, z);
    }

    public final void EiZ(int i) {
        A0A();
        if (this.A0J != i) {
            this.A0J = i;
            this.A0b.A0k.CsT(11, i, 0).A01();
            AnonymousClass5N4 r2 = this.A0h;
            r2.A02(new C284655Nk(), 8);
            A09();
            r2.A01();
        }
    }

    public final void EjX(AnonymousClass4P6 r3) {
        A0A();
        if (r3 == null) {
            r3 = AnonymousClass4P6.A03;
        }
        if (!this.A0O.equals(r3)) {
            this.A0O = r3;
            this.A0b.A0k.CsU(r3, 5).A01();
        }
    }

    public final void Eq9(List list) {
        A0A();
        A0I(this, list, 2, 13);
    }

    public final void EXr(boolean z) {
        A0A();
    }
}
