package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.5NB  reason: invalid class name */
public final class AnonymousClass5NB implements Handler.Callback, C264924Rv, C264944Rx, C264964Rz, AnonymousClass4S0, AnonymousClass5NC {
    public int A00;
    public int A01;
    public int A02;
    public long A03 = -1;
    public long A04 = -9223372036854775807L;
    public long A05 = 1000000000000L;
    public long A06;
    public long A07;
    public C2612348u A08;
    public C290315f7 A09;
    public AnonymousClass5ND A0A;
    public C284705Np A0B;
    public AnonymousClass5NA A0C;
    public AnonymousClass4PL A0D;
    public AnonymousClass4P6 A0E;
    public Integer A0F = AnonymousClass05K.A00;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public final int A0U;
    public final int A0V;
    public final long A0W;
    public final HandlerThread A0X;
    public final Looper A0Y;
    public final AnonymousClass4S3 A0Z;
    public final C284495Ms A0a;
    public final AnonymousClass4QZ A0b;
    public final AnonymousClass5NE A0c;
    public final AnonymousClass5NF A0d;
    public final C264744Rc A0e;
    public final AnonymousClass4RE A0f;
    public final C264634Qq A0g;
    public final C264734Rb A0h;
    public final AnonymousClass28n A0i;
    public final C697227w A0j;
    public final AnonymousClass4S6 A0k;
    public final AnonymousClass4S4 A0l;
    public final ArrayList A0m;
    public final Set A0n;
    public final boolean A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final boolean A0t;
    public final boolean A0u;
    public final boolean A0v;
    public final boolean A0w;
    public final boolean A0x;
    public final boolean A0y;
    public final boolean A0z;
    public final boolean A10;
    public final boolean A11;
    public final AnonymousClass4PL[] A12;
    public final AnonymousClass4PN[] A13;
    public final long A14;
    public final AnonymousClass5N9 A15;
    public final C264894Rs A16;
    public final boolean A17;
    public final boolean A18;
    public final boolean A19;
    public final boolean A1A;
    public final boolean A1B;
    public final boolean A1C;
    public final boolean A1D;
    public final boolean A1E;
    public final boolean A1F;
    public final boolean A1G;
    public final boolean A1H;
    public final boolean A1I;

    /* JADX WARNING: type inference failed for: r0v4, types: [X.5ND, java.lang.Object] */
    public AnonymousClass5NB(Looper looper, AnonymousClass4R1 r15, AnonymousClass5N9 r16, C284495Ms r17, AnonymousClass4QZ r18, AnonymousClass4P6 r19, AnonymousClass4RR r20, C264894Rs r21, C264634Qq r22, C264734Rb r23, AnonymousClass28n r24, C697227w r25, AnonymousClass4PL[] r26, int i) {
        this.A15 = r16;
        AnonymousClass4PL[] r4 = r26;
        this.A12 = r4;
        C264634Qq r8 = r22;
        this.A0g = r8;
        C264734Rb r7 = r23;
        this.A0h = r7;
        AnonymousClass4QZ r11 = r18;
        this.A0b = r11;
        AnonymousClass28n r6 = r24;
        this.A0i = r6;
        this.A02 = i;
        this.A0T = false;
        this.A0E = r19;
        C284495Ms r10 = r17;
        this.A0a = r10;
        this.A0M = false;
        int A002 = 2BY.A00(2Bb.A02);
        this.A0U = A002 <= 0 ? 10 : A002;
        C697227w r5 = r25;
        this.A0j = r5;
        C264894Rs r9 = r21;
        this.A16 = r9;
        this.A06 = -9223372036854775807L;
        this.A0W = r11.Aee();
        this.A10 = r11.EJB();
        AnonymousClass5NA A003 = AnonymousClass5NA.A00(r7);
        this.A0C = A003;
        ? obj = new Object();
        obj.A03 = A003;
        this.A0A = obj;
        int length = r4.length;
        AnonymousClass4PN[] r112 = new AnonymousClass4PN[length];
        this.A13 = r112;
        boolean z = false;
        for (int i2 = 0; i2 < length; i2++) {
            AnonymousClass4PK r0 = r26[i2];
            r0.A00 = i2;
            r0.A04 = r9;
            r112[i2] = r0;
        }
        this.A0Z = new AnonymousClass4S3(this, r5);
        this.A0m = new ArrayList();
        this.A0n = Collections.newSetFromMap(new IdentityHashMap());
        this.A0f = new AnonymousClass4RE();
        this.A0e = new C264744Rc();
        r8.A00 = this;
        r8.A01 = r6;
        this.A0G = true;
        List list = AnonymousClass4S5.A01;
        AnonymousClass4S5 r42 = new AnonymousClass4S5(new Handler(looper, (Handler.Callback) null));
        AnonymousClass4RR r62 = r20;
        this.A0c = new AnonymousClass5NE(r62, r42);
        this.A0d = new AnonymousClass5NF(this, r62, r9, r42);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        AnonymousClass0fe.A00(handlerThread);
        this.A0X = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.A0Y = looper2;
        this.A0k = new AnonymousClass4S5(new Handler(looper2, this));
        this.A0J = r15.A04;
        this.A0S = r15.A07;
        this.A0H = r15.A02;
        this.A0l = new AnonymousClass4S4(r5);
        this.A0o = 2BY.A02(2BQ.A0E);
        this.A0w = 2BY.A02(2BQ.A0h);
        long j = r15.A01;
        this.A1H = j > 0;
        this.A14 = j;
        this.A0u = 2BY.A02(2BQ.A0r);
        Object obj2 = 2BY.A01.get(2Be.A02);
        if (obj2 != null) {
            long longValue = ((Number) obj2).longValue();
            if (longValue > -1) {
                this.A05 = longValue;
            }
            this.A1B = 2BY.A02(2BQ.A0V);
            this.A0V = r15.A00;
            this.A1A = 2BY.A02(2BQ.A0N);
            this.A0O = 2BY.A02(2BQ.A1C);
            this.A18 = 2BY.A02(2BQ.A04);
            this.A0q = 2BY.A02(2BQ.A0I);
            this.A0s = 2BY.A02(2BQ.A0W);
            this.A0z = r10 != C284495Ms.A00;
            this.A17 = 2BY.A02(2BQ.A03);
            this.A0p = 2BY.A02(2BQ.A0G);
            this.A1D = 2BY.A00(2Bb.A03) < 0 ? true : z;
            this.A11 = 2BY.A02(2BQ.A1E);
            this.A0r = 2BY.A02(2BQ.A0S);
            this.A19 = 2BY.A02(2BQ.A0F);
            this.A0y = 2BY.A02(2BQ.A0U);
            this.A1I = 2BY.A02(2BQ.A0T);
            this.A1G = 2BY.A02(2BQ.A0n);
            this.A0t = 2BY.A02(2BQ.A0Y);
            this.A1F = 2BY.A02(2BQ.A0l);
            this.A0v = 2BY.A02(2BQ.A0f);
            this.A1C = 2BY.A02(2BQ.A0c);
            this.A1E = 2BY.A02(2BQ.A0i);
            this.A0x = 2BY.A02(2BQ.A0P);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private Pair A05(Timeline timeline) {
        C264874Rq A082;
        long longValue;
        Timeline timeline2 = timeline;
        if (timeline.A02() == 0) {
            longValue = 0;
            if (1 != 0) {
                A082 = AnonymousClass5NA.A0K;
                return Pair.create(A082, Long.valueOf(longValue));
            }
        }
        int A072 = timeline.A07(this.A0T);
        Pair A092 = timeline2.A09(this.A0e, this.A0f, A072, -9223372036854775807L);
        A082 = this.A0c.A08(timeline, A092.first);
        longValue = ((Number) A092.second).longValue();
        return Pair.create(A082, Long.valueOf(longValue));
    }

    public static Object A07(C264744Rc r10, AnonymousClass4RE r11, Timeline timeline, Timeline timeline2, Object obj, int i, boolean z) {
        Timeline timeline3 = timeline;
        int A062 = timeline.A06(obj);
        int A012 = timeline.A01();
        int i2 = -1;
        for (int i3 = 0; i3 < A012 && i2 == -1; i3++) {
            A062 = timeline3.A05(r10, r11, A062, i, z);
            if (A062 == -1) {
                return null;
            }
            i2 = timeline2.A06(timeline.A0C(A062));
        }
        if (i2 != -1) {
            return timeline2.A0C(i2);
        }
        return null;
    }

    private void A08() {
        boolean A0f2 = A0f(false);
        this.A0R = A0f2;
        if (A0f2) {
            boolean z = this.A0r;
            AnonymousClass4TC r4 = this.A0c.A04;
            if (z) {
                r4.A08(new C21415XaP(this.A07, this.A0C.A0F));
            } else {
                r4.A06(this.A07);
            }
        }
        A0D();
    }

    private void A0B() {
        this.A0K = false;
        AnonymousClass4S3 r1 = this.A0Z;
        r1.A03 = true;
        r1.A06.A00();
        this.A0l.A00();
        for (AnonymousClass4PL r12 : this.A12) {
            if (((AnonymousClass4PK) r12).A01 != 0) {
                r12.start();
            }
        }
    }

    private void A0F(byte b) {
        AnonymousClass4TC r0;
        if (!this.A0r && this.A0S && (r0 = this.A0c.A04) != null) {
            r0.A08.FKi(b, false);
        }
    }

    public static void A0N(AnonymousClass4SA r4) {
        synchronized (r4) {
        }
        try {
            r4.A08.CIs(r4.A01, r4.A04);
        } finally {
            r4.A03(true);
        }
    }

    private void A0O(AnonymousClass4PL r5) {
        AnonymousClass4PK r3 = (AnonymousClass4PK) r5;
        int i = r3.A01;
        if (i != 0) {
            AnonymousClass4S3 r1 = this.A0Z;
            if (r5 == r1.A00) {
                r1.A01 = null;
                r1.A00 = null;
                r1.A02 = true;
            }
            if (i == 2) {
                r3.A01 = 1;
                r3.A0I();
            }
            r5.APC();
            this.A00--;
        }
    }

    public static void A0Q(AnonymousClass4PL r2, long j) {
        ((AnonymousClass4PK) r2).A07 = true;
        if (r2 instanceof AnonymousClass4QM) {
            AnonymousClass4QM r22 = (AnonymousClass4QM) r2;
            C256703wD.A04(r22.A07);
            r22.A01 = j;
        }
    }

    private void A0R(Timeline timeline, Timeline timeline2) {
        Timeline timeline3 = timeline;
        Timeline timeline4 = timeline2;
        if (timeline.A02() != 0 || timeline2.A02() != 0) {
            ArrayList arrayList = this.A0m;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (!A0d((C284695No) arrayList.get(size), this.A0e, this.A0f, timeline3, timeline4, this.A02, this.A0T)) {
                        ((C284695No) arrayList.get(size)).A03.A03(false);
                        arrayList.remove(size);
                    }
                } else {
                    Collections.sort(arrayList);
                    return;
                }
            }
        }
    }

    private void A0W(boolean z) {
        C264874Rq r4 = this.A0c.A05.A02.A04;
        long A022 = A02(r4, this.A0C.A0I, true, false);
        if (A022 != this.A0C.A0I) {
            AnonymousClass5NA r0 = this.A0C;
            this.A0C = A06(r4, 4, A022, r0.A03, r0.A02, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r4.A0I == false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0X(boolean r5, boolean r6) {
        /*
            r4 = this;
            r3 = 0
            r2 = 1
            if (r5 != 0) goto L_0x0009
            boolean r1 = r4.A0I
            r0 = 0
            if (r1 != 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            r4.A0Y(r0, r3, r2, r3)
            X.5ND r0 = r4.A0A
            r0.A00(r6)
            X.4QZ r0 = r4.A0b
            r0.onStopped()
            r4.A0H(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5NB.A0X(boolean, boolean):void");
    }

    public final synchronized void EM3(AnonymousClass4SA r3) {
        if (this.A0P || !this.A0Y.getThread().isAlive()) {
            2AG.A04("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            r3.A03(false);
        } else {
            this.A0k.CsU(r3, 14).A01();
        }
    }

    private long A00(long j) {
        AnonymousClass4TC r7 = this.A0c.A04;
        if (r7 == null) {
            return 0;
        }
        boolean z = this.A1B;
        long j2 = this.A07 - r7.A00;
        if (z) {
            return r7.A08.AiS(j2);
        }
        return Math.max(0, j - j2);
    }

    private long A01(Timeline timeline, Object obj, long j) {
        C264744Rc r6 = this.A0e;
        int i = timeline.A0B(r6, obj).A00;
        AnonymousClass4RE r7 = this.A0f;
        timeline.A0E(r7, i, 0);
        long j2 = r7.A07;
        if (j2 == -9223372036854775807L || !r7.A01() || !r7.A0D) {
            return -9223372036854775807L;
        }
        return Util.A07(Util.A06(r7.A04) - j2) - (j + r6.A02);
    }

    public static Pair A04(C284705Np r13, C264744Rc r14, AnonymousClass4RE r15, Timeline timeline, int i, boolean z, boolean z2) {
        Object A072;
        Timeline timeline2 = r13.A02;
        Timeline timeline3 = timeline;
        boolean z3 = false;
        if (timeline3.A02() == 0) {
            z3 = true;
        }
        if (z3) {
            return null;
        }
        boolean z4 = false;
        if (timeline2.A02() == 0) {
            z4 = true;
        }
        if (z4) {
            timeline2 = timeline3;
        }
        try {
            int i2 = r13.A00;
            long j = r13.A01;
            C264744Rc r4 = r14;
            AnonymousClass4RE r5 = r15;
            C264744Rc r9 = r14;
            AnonymousClass4RE r10 = r15;
            Pair A092 = timeline2.A09(r9, r10, i2, j);
            if (timeline3.equals(timeline2)) {
                return A092;
            }
            if (timeline3.A06(A092.first) == -1) {
                if (z && (A072 = A07(r4, r5, timeline2, timeline3, A092.first, i, z2)) != null) {
                    return timeline3.A09(r14, r15, timeline3.A0B(r14, A072).A00, -9223372036854775807L);
                }
                return null;
            } else if (!timeline2.A0B(r14, A092.first).A06 || timeline2.A0E(r15, r14.A00, 0).A00 != timeline2.A06(A092.first)) {
                return A092;
            } else {
                return timeline3.A09(r9, r10, timeline3.A0B(r14, A092.first).A00, j);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r12.equals(r2.A0C.A08) == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.AnonymousClass5NA A06(X.C264874Rq r25, int r26, long r27, long r29, long r31, boolean r33) {
        /*
            r24 = this;
            r2 = r24
            boolean r0 = r2.A0G
            r12 = r25
            r16 = r27
            if (r0 != 0) goto L_0x001d
            X.5NA r0 = r2.A0C
            long r3 = r0.A0I
            int r0 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x001d
            X.5NA r0 = r2.A0C
            X.4Rq r0 = r0.A08
            boolean r1 = r12.equals(r0)
            r0 = 0
            if (r1 != 0) goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            r2.A0G = r0
            r2.A0A()
            X.5NA r1 = r2.A0C
            X.4Rn r13 = r1.A09
            X.4Rb r14 = r1.A0A
            java.util.List r15 = r1.A0C
            X.5NF r0 = r2.A0d
            boolean r0 = r0.A01
            r9 = r29
            if (r0 == 0) goto L_0x008b
            X.5NE r0 = r2.A0c
            X.4TC r5 = r0.A05
            if (r5 != 0) goto L_0x006a
            X.4Rn r13 = X.C264844Rn.A03
            X.4Rb r14 = r2.A0h
        L_0x003d:
            X.4RX[] r8 = r14.A04
            com.google.common.collect.ImmutableList$Builder r7 = new com.google.common.collect.ImmutableList$Builder
            r7.<init>()
            int r6 = r8.length
            r4 = 0
            r3 = 0
            r11 = 0
        L_0x0048:
            if (r3 >= r6) goto L_0x006f
            r0 = r8[r3]
            if (r0 == 0) goto L_0x0060
            X.3wB r1 = r0.B7Q(r4)
            com.google.android.exoplayer2.metadata.Metadata r0 = r1.A0P
            if (r0 != 0) goto L_0x0063
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r1 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r4]
            com.google.android.exoplayer2.metadata.Metadata r0 = new com.google.android.exoplayer2.metadata.Metadata
            r0.<init>((com.google.android.exoplayer2.metadata.Metadata.Entry[]) r1)
            r7.add(r0)
        L_0x0060:
            int r3 = r3 + 1
            goto L_0x0048
        L_0x0063:
            com.google.android.exoplayer2.metadata.Metadata r0 = r1.A0P
            r7.add(r0)
            r11 = 1
            goto L_0x0060
        L_0x006a:
            X.4Rn r13 = r5.A03
            X.4Rb r14 = r5.A04
            goto L_0x003d
        L_0x006f:
            if (r11 == 0) goto L_0x0086
            com.google.common.collect.ImmutableList r15 = r7.build()
        L_0x0075:
            if (r5 == 0) goto L_0x009b
            X.4TB r4 = r5.A02
            long r0 = r4.A02
            int r3 = (r0 > r29 ? 1 : (r0 == r29 ? 0 : -1))
            if (r3 == 0) goto L_0x009b
            X.4TB r0 = r4.A00(r9)
            r5.A02 = r0
            goto L_0x009b
        L_0x0086:
            com.google.common.collect.ImmutableList r15 = com.google.common.collect.ImmutableList.of()
            goto L_0x0075
        L_0x008b:
            X.4Rq r0 = r1.A08
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x009b
            X.4Rn r13 = X.C264844Rn.A03
            X.4Rb r14 = r2.A0h
            com.google.common.collect.ImmutableList r15 = com.google.common.collect.ImmutableList.of()
        L_0x009b:
            if (r33 == 0) goto L_0x00b1
            X.5ND r4 = r2.A0A
            boolean r0 = r4.A06
            r3 = 1
            r5 = r26
            if (r0 == 0) goto L_0x00c2
            int r1 = r4.A00
            r0 = 4
            if (r1 == r0) goto L_0x00c2
            if (r5 == r0) goto L_0x00ae
            r3 = 0
        L_0x00ae:
            X.C256703wD.A03(r3)
        L_0x00b1:
            X.5NA r11 = r2.A0C
            long r0 = r11.A0H
            long r22 = r2.A00(r0)
            r20 = r31
            r18 = r9
            X.5NA r0 = r11.A07(r12, r13, r14, r15, r16, r18, r20, r22)
            return r0
        L_0x00c2:
            r4.A04 = r3
            r4.A06 = r3
            r4.A00 = r5
            goto L_0x00b1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5NB.A06(X.4Rq, int, long, long, long, boolean):X.5NA");
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.5ND, java.lang.Object] */
    private void A09() {
        AnonymousClass5ND r4 = this.A0A;
        AnonymousClass5NA r3 = this.A0C;
        boolean z = r4.A04;
        boolean z2 = false;
        if (r4.A03 != r3) {
            z2 = true;
        }
        boolean z3 = z | z2;
        r4.A04 = z3;
        r4.A03 = r3;
        if (z3) {
            C284515Mu r2 = ((AnonymousClass5N8) this.A15).A00;
            AnonymousClass4S6 r0 = r2.A0g;
            ((AnonymousClass4S5) r0).A00.post(new C284575Nc(r2, r4));
            AnonymousClass5NA r1 = this.A0C;
            ? obj = new Object();
            obj.A03 = r1;
            this.A0A = obj;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r2.A0M == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0A() {
        /*
            r2 = this;
            X.5NE r0 = r2.A0c
            X.4TC r0 = r0.A05
            if (r0 == 0) goto L_0x0011
            X.4TB r0 = r0.A02
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0011
            boolean r1 = r2.A0M
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r2.A0N = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5NB.A0A():void");
    }

    private void A0C() {
        AnonymousClass4S3 r1 = this.A0Z;
        r1.A03 = false;
        r1.A06.A01();
        this.A0l.A01();
        for (AnonymousClass4PL r2 : this.A12) {
            if (((AnonymousClass4PK) r2).A01 != 0) {
                AnonymousClass4PK r22 = (AnonymousClass4PK) r2;
                if (r22.A01 == 2) {
                    r22.A01 = 1;
                    r22.A0I();
                }
            }
        }
    }

    private void A0D() {
        AnonymousClass4TC r1 = this.A0c.A04;
        boolean z = this.A0R;
        if (!this.A19) {
            if (z || (r1 != null && r1.A08.isLoading())) {
                z = true;
            } else {
                z = false;
            }
        }
        AnonymousClass5NA r10 = this.A0C;
        if (z != r10.A0E) {
            Timeline timeline = r10.A06;
            C264874Rq r40 = r10.A08;
            long j = r10.A03;
            long j2 = r10.A02;
            int i = r10.A00;
            C2612348u r39 = r10.A04;
            C264844Rn r21 = r10.A09;
            C264734Rb r20 = r10.A0A;
            List list = r10.A0C;
            C264874Rq r19 = r10.A07;
            boolean z2 = r10.A0F;
            int i2 = r10.A01;
            AnonymousClass4P7 r16 = r10.A05;
            long j3 = r10.A0H;
            long j4 = r10.A0J;
            long j5 = r10.A0I;
            boolean z3 = r10.A0G;
            Integer num = r10.A0B;
            C264874Rq r18 = r19;
            C264844Rn r192 = r21;
            Integer num2 = num;
            int i3 = i2;
            long j6 = j;
            long j7 = j2;
            C2612348u r14 = r39;
            AnonymousClass4P7 r15 = r16;
            Timeline timeline2 = timeline;
            C264874Rq r17 = r40;
            this.A0C = new AnonymousClass5NA(r14, r15, timeline2, r17, r18, r192, r20, num2, list, i, i3, j6, j7, j3, j4, j5, z, z2, z3, r10.A0D);
        }
    }

    /* JADX INFO: finally extract failed */
    private void A0E() {
        long j;
        C284695No r12;
        int i;
        AnonymousClass5NE r11 = this.A0c;
        AnonymousClass4TC r7 = r11.A05;
        if (r7 != null) {
            if (r7.A07) {
                j = r7.A08.E6K();
            } else {
                j = -9223372036854775807L;
            }
            if (j != -9223372036854775807L) {
                A0J(j);
                if (j != this.A0C.A0I) {
                    AnonymousClass5NA r2 = this.A0C;
                    this.A0C = A06(r2.A08, 4, j, r2.A03, j, true);
                }
            } else {
                AnonymousClass4S3 r22 = this.A0Z;
                boolean z = false;
                if (r7 != r11.A06) {
                    z = true;
                }
                long A002 = r22.A00(z);
                this.A07 = A002;
                long j2 = A002 - r7.A00;
                long j3 = this.A0C.A0I;
                ArrayList arrayList = this.A0m;
                if (!arrayList.isEmpty()) {
                    AnonymousClass5NA r9 = this.A0C;
                    C264874Rq r8 = r9.A08;
                    if (r8.A00 == -1) {
                        if (this.A0G) {
                            j3--;
                            this.A0G = false;
                        }
                        int A062 = r9.A06.A06(r8.A04);
                        int min = Math.min(this.A01, arrayList.size());
                        while (min > 0) {
                            C284695No r1 = (C284695No) arrayList.get(min - 1);
                            if (r1 == null || (r1.A00 <= A062 && (r1.A00 != A062 || r1.A01 <= j3))) {
                                break;
                            }
                            min--;
                        }
                        while (true) {
                            if (min >= arrayList.size() || (r12 = (C284695No) arrayList.get(min)) == null) {
                                break;
                            } else if (r12.A02 != null && ((i = r12.A00) < A062 || (i == A062 && r12.A01 <= j3))) {
                                min++;
                            }
                        }
                        while (r12.A02 != null && r12.A00 == A062) {
                            long j4 = r12.A01;
                            if (j4 <= j3 || j4 > j2) {
                                break;
                            }
                            try {
                                A0M(r12.A03);
                                arrayList.remove(min);
                                if (min < arrayList.size()) {
                                    r12 = (C284695No) arrayList.get(min);
                                    if (r12 == null) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } catch (Throwable th) {
                                arrayList.remove(min);
                                throw th;
                            }
                        }
                        this.A01 = min;
                    }
                }
                this.A0C.A0I = j2;
            }
            this.A0C.A0H = r11.A04.A00();
            AnonymousClass5NA r23 = this.A0C;
            r23.A0J = A00(r23.A0H);
            if (this.A1A) {
                AnonymousClass5NA r3 = this.A0C;
                r3.A0J = r7.A08.AiS(r3.A0I);
            }
            AnonymousClass5NA r24 = this.A0C;
            if (r24.A0F && r24.A00 == 3 && A0e(r24.A06, r24.A08)) {
                AnonymousClass5NA r5 = this.A0C;
                if (r5.A05.A01 == 1.0f) {
                    float AZo = this.A0a.AZo(A01(r5.A06, r5.A08.A04, r5.A0I), A00(this.A0C.A0H));
                    AnonymousClass4S3 r25 = this.A0Z;
                    if (r25.BdA().A01 != AZo) {
                        A0K(new AnonymousClass4P7(AZo, this.A0C.A05.A00));
                        A0L(this.A0C.A05, r25.BdA().A01, false, false);
                    }
                }
            }
        }
    }

    private void A0G(float f) {
        for (AnonymousClass4TC r4 = this.A0c.A05; r4 != null; r4 = r4.A01) {
            for (AnonymousClass4RX r0 : r4.A04.A04) {
                if (r0 != null) {
                    r0.DXe(f);
                }
            }
        }
    }

    private void A0H(int i) {
        long currentTimeMillis;
        AnonymousClass5NA r2 = this.A0C;
        if (r2.A00 != i) {
            if (i != 2) {
                this.A06 = -9223372036854775807L;
                currentTimeMillis = -1;
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            this.A03 = currentTimeMillis;
            this.A0C = r2.A01(i);
        }
    }

    private void A0I(int i, int i2, boolean z, boolean z2) {
        AnonymousClass4TC r0;
        AnonymousClass4TC r02;
        AnonymousClass5ND r1 = this.A0A;
        r1.A00(z2 ? 1 : 0);
        r1.A04 = true;
        r1.A05 = true;
        r1.A02 = i2;
        this.A0C = this.A0C.A02(i, z);
        if (this.A0O && !this.A0r && (r02 = this.A0c.A04) != null) {
            r02.A08.Efw(z);
        }
        this.A0K = false;
        AnonymousClass5NE r5 = this.A0c;
        for (AnonymousClass4TC r4 = r5.A04; r4 != null; r4 = r4.A01) {
            for (AnonymousClass4RX r03 : r4.A04.A04) {
                if (r03 != null) {
                    r03.DXU(z);
                }
            }
        }
        if (!A0c()) {
            A0C();
            A0E();
            A0F((byte) 2);
            if (!this.A0r && !this.A0x && this.A0H && (r0 = r5.A04) != null) {
                r0.A08.AGR(this.A07 - r0.A00);
            }
            if (this.A0x && this.A1E) {
                long j = this.A07;
                AnonymousClass4TC r04 = r5.A04;
                if (r04 != null) {
                    r04.A07(j);
                    return;
                }
                return;
            }
            return;
        }
        A0F((byte) 0);
        int i3 = this.A0C.A00;
        if (i3 == 3) {
            A0B();
        } else if (i3 != 2) {
            return;
        }
        ((AnonymousClass4S5) this.A0k).A00.sendEmptyMessage(2);
    }

    private void A0J(long j) {
        long j2;
        AnonymousClass4TC r0 = this.A0c.A05;
        if (r0 == null) {
            j2 = this.A05 + j;
        } else {
            j2 = j + r0.A00;
        }
        this.A07 = j2;
        this.A0Z.A06.A02(j2);
        for (AnonymousClass4PL r2 : this.A12) {
            if (((AnonymousClass4PK) r2).A01 != 0) {
                r2.EIA(this.A07);
            }
        }
    }

    private void A0K(AnonymousClass4P7 r3) {
        ((AnonymousClass4S5) this.A0k).A00.removeMessages(16);
        this.A0Z.Efz(r3);
    }

    private void A0L(AnonymousClass4P7 r6, float f, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                this.A0A.A00(1);
            }
            this.A0C = this.A0C.A04(r6);
        }
        if (!this.A17) {
            A0G(r6.A01);
        }
        for (AnonymousClass4PL r1 : this.A12) {
            if (r1 != null) {
                r1.Eg2(f, r6.A01);
            }
        }
    }

    private void A0M(AnonymousClass4SA r4) {
        if (r4.A03 == this.A0Y) {
            A0N(r4);
            int i = this.A0C.A00;
            if (i == 3 || i == 2) {
                ((AnonymousClass4S5) this.A0k).A00.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.A0k.CsU(r4, 15).A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007b, code lost:
        if (r11.A0B(r6, r5).A06 != false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02e9, code lost:
        if (r2 == false) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x030d, code lost:
        if (r17 != r7.A03) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0329, code lost:
        if (r2.A0B(r6, r5).A06 != false) goto L_0x032b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0368, code lost:
        if ((!r7.A0A(r5)) != false) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0393, code lost:
        if (r17 != r8.A03) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03af, code lost:
        if (r2.A0B(r6, r7).A06 != false) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005a, code lost:
        if (r15 != r0.A0C.A0I) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0T(com.google.android.exoplayer2.Timeline r39, boolean r40) {
        /*
            r38 = this;
            r0 = r38
            X.5NA r8 = r0.A0C
            X.5Np r10 = r0.A0B
            X.5NE r7 = r0.A0c
            int r1 = r0.A02
            r27 = r1
            boolean r9 = r0.A0T
            X.4RE r1 = r0.A0f
            r21 = r1
            X.4Rc r6 = r0.A0e
            X.5f7 r4 = r0.A09
            r3 = r39
            int r1 = r3.A02()
            r22 = 0
            if (r1 != 0) goto L_0x0022
            r22 = 1
        L_0x0022:
            if (r22 == 0) goto L_0x0065
            X.4Rq r13 = X.AnonymousClass5NA.A0K
            r14 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r18 = 0
            r19 = 1
            X.5Nb r12 = new X.5Nb
            r20 = r18
            r12.<init>(r13, r14, r16, r18, r19, r20)
        L_0x0038:
            X.4Rq r1 = r12.A02
            r26 = r1
            long r1 = r12.A01
            r17 = r1
            boolean r4 = r12.A04
            long r15 = r12.A00
            X.5NA r1 = r0.A0C
            X.4Rq r2 = r1.A08
            r1 = r26
            boolean r1 = r2.equals(r1)
            r5 = 1
            r9 = 0
            if (r1 == 0) goto L_0x005c
            X.5NA r1 = r0.A0C
            long r1 = r1.A0I
            int r8 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            r21 = 0
            if (r8 == 0) goto L_0x005e
        L_0x005c:
            r21 = 1
        L_0x005e:
            r28 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01f0
        L_0x0065:
            X.4Rq r14 = r8.A08
            java.lang.Object r5 = r14.A04
            r20 = r5
            com.google.android.exoplayer2.Timeline r11 = r8.A06
            int r1 = r11.A02()
            if (r1 == 0) goto L_0x007d
            X.4Rc r1 = r11.A0B(r6, r5)
            boolean r1 = r1.A06
            r19 = 0
            if (r1 == 0) goto L_0x007f
        L_0x007d:
            r19 = 1
        L_0x007f:
            int r15 = r14.A00
            r12 = -1
            r18 = 0
            if (r15 == r12) goto L_0x0088
            r18 = 1
        L_0x0088:
            if (r18 != 0) goto L_0x01ec
            if (r19 != 0) goto L_0x01ec
            long r1 = r8.A0I
        L_0x008e:
            r16 = r1
            r36 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r28 = 1
            r13 = 4
            if (r10 == 0) goto L_0x0139
            r23 = r10
            r24 = r6
            r25 = r21
            r26 = r3
            r29 = r9
            android.util.Pair r4 = A04(r23, r24, r25, r26, r27, r28, r29)
            if (r4 == 0) goto L_0x0158
            long r9 = r10.A01
            int r11 = (r9 > r36 ? 1 : (r9 == r36 ? 0 : -1))
            if (r11 != 0) goto L_0x012b
            java.lang.Object r4 = r4.first
            X.4Rc r4 = r3.A0B(r6, r4)
            int r4 = r4.A00
            r31 = 0
        L_0x00ba:
            int r9 = r8.A00
            r29 = 0
            if (r9 != r13) goto L_0x00c2
            r29 = 1
        L_0x00c2:
            r30 = 0
        L_0x00c4:
            if (r4 == r12) goto L_0x0129
            r32 = r3
            r33 = r6
            r34 = r21
            r35 = r4
            android.util.Pair r1 = r32.A09(r33, r34, r35, r36)
            java.lang.Object r5 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Number r1 = (java.lang.Number) r1
            long r10 = r1.longValue()
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00e1:
            X.4Rq r9 = r7.A08(r3, r5)
            r4 = r20
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0126
            if (r18 != 0) goto L_0x0126
        L_0x00ef:
            r3.A0B(r6, r5)
            if (r19 != 0) goto L_0x0100
            int r4 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r4 != 0) goto L_0x0100
            java.lang.Object r5 = r9.A04
            r4 = r20
            boolean r4 = r4.equals(r5)
        L_0x0100:
            if (r28 == 0) goto L_0x0103
            r9 = r14
        L_0x0103:
            int r4 = r9.A00
            if (r4 == r12) goto L_0x010f
            boolean r5 = r9.equals(r14)
            if (r5 == 0) goto L_0x011e
            long r10 = r8.A0I
        L_0x010f:
            X.5Nb r12 = new X.5Nb
            r23 = r12
            r24 = r9
            r25 = r10
            r27 = r1
            r23.<init>(r24, r25, r27, r29, r30, r31)
            goto L_0x0038
        L_0x011e:
            java.lang.Object r5 = r9.A04
            r3.A0B(r6, r5)
            r10 = 0
            goto L_0x010f
        L_0x0126:
            r28 = 0
            goto L_0x00ef
        L_0x0129:
            r10 = r1
            goto L_0x00e1
        L_0x012b:
            java.lang.Object r5 = r4.first
            java.lang.Object r1 = r4.second
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            r31 = 1
            r4 = -1
            goto L_0x00ba
        L_0x0139:
            if (r4 == 0) goto L_0x0164
            android.util.Pair r4 = A03(r4, r6, r3)
            if (r4 == 0) goto L_0x0158
            java.lang.Object r5 = r4.first
            java.lang.Object r1 = r4.second
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            int r4 = r8.A00
            r29 = 0
            if (r4 != r13) goto L_0x0153
            r29 = 1
        L_0x0153:
            r31 = 1
            r4 = -1
            goto L_0x00c2
        L_0x0158:
            int r4 = r3.A07(r9)
            r31 = 0
            r29 = 0
            r30 = 1
            goto L_0x00c4
        L_0x0164:
            int r4 = r11.A02()
            if (r4 != 0) goto L_0x0174
            int r4 = r3.A07(r9)
        L_0x016e:
            r31 = 0
        L_0x0170:
            r29 = 0
            goto L_0x00c2
        L_0x0174:
            int r4 = r3.A06(r5)
            if (r4 != r12) goto L_0x01a3
            r29 = r6
            r30 = r21
            r31 = r11
            r32 = r3
            r33 = r5
            r34 = r27
            r35 = r9
            java.lang.Object r4 = A07(r29, r30, r31, r32, r33, r34, r35)
            if (r4 != 0) goto L_0x019a
            int r4 = r3.A07(r9)
            r30 = 1
        L_0x0194:
            r31 = 0
            r29 = 0
            goto L_0x00c4
        L_0x019a:
            X.4Rc r4 = r3.A0B(r6, r4)
            int r4 = r4.A00
            r30 = 0
            goto L_0x0194
        L_0x01a3:
            int r4 = (r1 > r36 ? 1 : (r1 == r36 ? 0 : -1))
            if (r4 != 0) goto L_0x01ae
            X.4Rc r4 = r3.A0B(r6, r5)
            int r4 = r4.A00
            goto L_0x016e
        L_0x01ae:
            if (r19 == 0) goto L_0x01ea
            r11.A0B(r6, r5)
            int r13 = r6.A00
            r9 = 0
            r4 = r21
            X.4RE r4 = r11.A0E(r4, r13, r9)
            int r4 = r4.A00
            int r9 = r11.A06(r5)
            if (r4 != r9) goto L_0x01e6
            long r9 = r6.A02
            long r1 = r1 + r9
            X.4Rc r4 = r3.A0B(r6, r5)
            int r4 = r4.A00
            r29 = r3
            r30 = r6
            r31 = r21
            r32 = r4
            r33 = r1
            android.util.Pair r1 = r29.A09(r30, r31, r32, r33)
            java.lang.Object r5 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
        L_0x01e6:
            r4 = -1
            r31 = 1
            goto L_0x0170
        L_0x01ea:
            r4 = -1
            goto L_0x016e
        L_0x01ec:
            long r1 = r8.A03
            goto L_0x008e
        L_0x01f0:
            boolean r1 = r12.A03     // Catch:{ all -> 0x036f }
            if (r1 == 0) goto L_0x0201
            X.5NA r1 = r0.A0C     // Catch:{ all -> 0x036f }
            int r1 = r1.A00     // Catch:{ all -> 0x036f }
            if (r1 == r5) goto L_0x01fe
            r1 = 4
            r0.A0H(r1)     // Catch:{ all -> 0x036f }
        L_0x01fe:
            r0.A0Y(r9, r9, r9, r5)     // Catch:{ all -> 0x036f }
        L_0x0201:
            if (r21 != 0) goto L_0x02b2
            long r1 = r0.A07     // Catch:{ all -> 0x036f }
            r23 = r1
            X.4TC r10 = r7.A06     // Catch:{ all -> 0x036f }
            if (r10 != 0) goto L_0x020e
            r19 = 0
            goto L_0x0243
        L_0x020e:
            long r4 = r10.A00     // Catch:{ all -> 0x036f }
            boolean r1 = r10.A07     // Catch:{ all -> 0x036f }
            if (r1 == 0) goto L_0x0241
            r8 = 0
        L_0x0215:
            X.4PL[] r11 = r0.A12     // Catch:{ all -> 0x036f }
            int r1 = r11.length     // Catch:{ all -> 0x036f }
            if (r8 >= r1) goto L_0x0241
            r1 = r11[r8]     // Catch:{ all -> 0x036f }
            X.4PK r1 = (X.AnonymousClass4PK) r1     // Catch:{ all -> 0x036f }
            int r1 = r1.A01     // Catch:{ all -> 0x036f }
            if (r1 == 0) goto L_0x023e
            r1 = r11[r8]     // Catch:{ all -> 0x036f }
            X.4PK r1 = (X.AnonymousClass4PK) r1     // Catch:{ all -> 0x036f }
            X.4TD r2 = r1.A05     // Catch:{ all -> 0x036f }
            X.4TD[] r1 = r10.A0B     // Catch:{ all -> 0x036f }
            r1 = r1[r8]     // Catch:{ all -> 0x036f }
            if (r2 != r1) goto L_0x023e
            r1 = r11[r8]     // Catch:{ all -> 0x036f }
            X.4PK r1 = (X.AnonymousClass4PK) r1     // Catch:{ all -> 0x036f }
            long r1 = r1.A02     // Catch:{ all -> 0x036f }
            r19 = -9223372036854775808
            int r11 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r11 == 0) goto L_0x0243
            long r4 = java.lang.Math.max(r1, r4)     // Catch:{ all -> 0x036f }
        L_0x023e:
            int r8 = r8 + 1
            goto L_0x0215
        L_0x0241:
            r19 = r4
        L_0x0243:
            X.4TC r8 = r7.A05     // Catch:{ all -> 0x036f }
            r5 = 0
        L_0x0246:
            if (r8 == 0) goto L_0x02eb
            X.4TB r4 = r8.A02     // Catch:{ all -> 0x036f }
            if (r5 != 0) goto L_0x0261
            X.4TB r10 = r7.A07(r4, r3)     // Catch:{ all -> 0x036f }
        L_0x0250:
            long r1 = r4.A02     // Catch:{ all -> 0x036f }
            X.4TB r11 = r10.A00(r1)     // Catch:{ all -> 0x036f }
            r8.A02 = r11     // Catch:{ all -> 0x036f }
            long r4 = r4.A00     // Catch:{ all -> 0x036f }
            long r1 = r10.A00     // Catch:{ all -> 0x036f }
            int r10 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r10 == 0) goto L_0x0281
            goto L_0x027c
        L_0x0261:
            r1 = r23
            X.4TB r10 = X.AnonymousClass5NE.A00(r5, r7, r3, r1)     // Catch:{ all -> 0x036f }
            if (r10 == 0) goto L_0x0362
            long r13 = r4.A03     // Catch:{ all -> 0x036f }
            long r1 = r10.A03     // Catch:{ all -> 0x036f }
            int r11 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r11 != 0) goto L_0x0362
            X.4Rq r2 = r4.A04     // Catch:{ all -> 0x036f }
            X.4Rq r1 = r10.A04     // Catch:{ all -> 0x036f }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x036f }
            if (r1 == 0) goto L_0x0362
            goto L_0x0250
        L_0x027c:
            int r10 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r10 == 0) goto L_0x0281
            goto L_0x0286
        L_0x0281:
            X.4TC r1 = r8.A01     // Catch:{ all -> 0x036f }
            r5 = r8
            r8 = r1
            goto L_0x0246
        L_0x0286:
            r8.A04()     // Catch:{ all -> 0x036f }
            int r4 = (r1 > r28 ? 1 : (r1 == r28 ? 0 : -1))
            if (r4 != 0) goto L_0x0293
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x0296
        L_0x0293:
            long r4 = r8.A00     // Catch:{ all -> 0x036f }
            long r1 = r1 + r4
        L_0x0296:
            X.4TC r4 = r7.A06     // Catch:{ all -> 0x036f }
            if (r8 != r4) goto L_0x02aa
            boolean r4 = r11.A06     // Catch:{ all -> 0x036f }
            if (r4 != 0) goto L_0x02aa
            r10 = -9223372036854775808
            int r4 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x02a8
            int r4 = (r19 > r1 ? 1 : (r19 == r1 ? 0 : -1))
            if (r4 < 0) goto L_0x02aa
        L_0x02a8:
            r2 = 1
            goto L_0x02ab
        L_0x02aa:
            r2 = 0
        L_0x02ab:
            boolean r1 = r7.A0A(r8)     // Catch:{ all -> 0x036f }
            if (r1 != 0) goto L_0x036a
            goto L_0x02e9
        L_0x02b2:
            if (r22 != 0) goto L_0x02eb
            X.4TC r5 = r7.A05     // Catch:{ all -> 0x036f }
        L_0x02b6:
            if (r5 == 0) goto L_0x02d2
            X.4TB r1 = r5.A02     // Catch:{ all -> 0x036f }
            X.4Rq r2 = r1.A04     // Catch:{ all -> 0x036f }
            r1 = r26
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x036f }
            if (r1 == 0) goto L_0x02cf
            X.4TB r1 = r5.A02     // Catch:{ all -> 0x036f }
            X.4TB r1 = r7.A07(r1, r3)     // Catch:{ all -> 0x036f }
            r5.A02 = r1     // Catch:{ all -> 0x036f }
            r5.A04()     // Catch:{ all -> 0x036f }
        L_0x02cf:
            X.4TC r5 = r5.A01     // Catch:{ all -> 0x036f }
            goto L_0x02b6
        L_0x02d2:
            X.4TC r1 = r7.A05     // Catch:{ all -> 0x036f }
            X.4TC r2 = r7.A06     // Catch:{ all -> 0x036f }
            r34 = 0
            if (r1 == r2) goto L_0x02dc
            r34 = 1
        L_0x02dc:
            r30 = r0
            r31 = r26
            r32 = r15
            r35 = r4
            long r15 = r30.A02(r31, r32, r34, r35)     // Catch:{ all -> 0x036f }
            goto L_0x02eb
        L_0x02e9:
            if (r2 != 0) goto L_0x036a
        L_0x02eb:
            X.5NA r1 = r0.A0C
            com.google.android.exoplayer2.Timeline r5 = r1.A06
            X.4Rq r2 = r1.A08
            boolean r1 = r12.A05
            if (r1 == 0) goto L_0x02f7
            r28 = r15
        L_0x02f7:
            r4 = -1
            r23 = r0
            r24 = r3
            r25 = r5
            r27 = r2
            r30 = r9
            r23.A0S(r24, r25, r26, r27, r28, r30)
            if (r21 != 0) goto L_0x030f
            X.5NA r7 = r0.A0C
            long r1 = r7.A03
            int r5 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x0347
        L_0x030f:
            X.5NA r2 = r0.A0C
            X.4Rq r1 = r2.A08
            java.lang.Object r5 = r1.A04
            com.google.android.exoplayer2.Timeline r2 = r2.A06
            if (r21 == 0) goto L_0x032b
            if (r40 == 0) goto L_0x032b
            int r1 = r2.A02()
            if (r1 == 0) goto L_0x032b
            X.4Rc r1 = r2.A0B(r6, r5)
            boolean r1 = r1.A06
            r19 = 1
            if (r1 == 0) goto L_0x032d
        L_0x032b:
            r19 = 0
        L_0x032d:
            X.5NA r1 = r0.A0C
            long r1 = r1.A02
            int r5 = r3.A06(r5)
            r12 = 6
            if (r5 != r4) goto L_0x0339
            r12 = 7
        L_0x0339:
            r10 = r0
            r11 = r26
            r13 = r15
            r15 = r17
            r17 = r1
            X.5NA r7 = r10.A06(r11, r12, r13, r15, r17, r19)
            r0.A0C = r7
        L_0x0347:
            r0.A0A()
            com.google.android.exoplayer2.Timeline r1 = r7.A06
            r0.A0R(r3, r1)
            X.5NA r1 = r0.A0C
            X.5NA r1 = r1.A05(r3)
            r0.A0C = r1
            if (r22 != 0) goto L_0x035e
            r1 = 0
            r0.A0B = r1
            r0.A09 = r1
        L_0x035e:
            r0.A0V(r9)
            return
        L_0x0362:
            boolean r1 = r7.A0A(r5)     // Catch:{ all -> 0x036f }
            r1 = r1 ^ 1
            if (r1 != 0) goto L_0x02eb
        L_0x036a:
            r0.A0W(r9)     // Catch:{ all -> 0x036f }
            goto L_0x02eb
        L_0x036f:
            r10 = move-exception
            r5 = 0
            r4 = -1
            X.5NA r1 = r0.A0C
            com.google.android.exoplayer2.Timeline r7 = r1.A06
            X.4Rq r2 = r1.A08
            boolean r1 = r12.A05
            if (r1 == 0) goto L_0x037e
            r28 = r15
        L_0x037e:
            r23 = r0
            r24 = r3
            r25 = r7
            r27 = r2
            r30 = r9
            r23.A0S(r24, r25, r26, r27, r28, r30)
            if (r21 != 0) goto L_0x0395
            X.5NA r8 = r0.A0C
            long r1 = r8.A03
            int r7 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r7 == 0) goto L_0x03cf
        L_0x0395:
            X.5NA r2 = r0.A0C
            X.4Rq r1 = r2.A08
            java.lang.Object r7 = r1.A04
            com.google.android.exoplayer2.Timeline r2 = r2.A06
            if (r21 == 0) goto L_0x03b1
            if (r40 == 0) goto L_0x03b1
            int r1 = r2.A02()
            if (r1 == 0) goto L_0x03b1
            X.4Rc r1 = r2.A0B(r6, r7)
            boolean r1 = r1.A06
            r32 = 1
            if (r1 == 0) goto L_0x03b3
        L_0x03b1:
            r32 = 0
        L_0x03b3:
            X.5NA r1 = r0.A0C
            long r1 = r1.A02
            int r6 = r3.A06(r7)
            r25 = 6
            if (r6 != r4) goto L_0x03c1
            r25 = 7
        L_0x03c1:
            r24 = r26
            r26 = r15
            r28 = r17
            r30 = r1
            X.5NA r8 = r23.A06(r24, r25, r26, r28, r30, r32)
            r0.A0C = r8
        L_0x03cf:
            r0.A0A()
            com.google.android.exoplayer2.Timeline r1 = r8.A06
            r0.A0R(r3, r1)
            X.5NA r1 = r0.A0C
            X.5NA r1 = r1.A05(r3)
            r0.A0C = r1
            if (r22 != 0) goto L_0x03e5
            r0.A0B = r5
            r0.A09 = r5
        L_0x03e5:
            r0.A0V(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5NB.A0T(com.google.android.exoplayer2.Timeline, boolean):void");
    }

    private void A0V(boolean z) {
        C264874Rq r1;
        long A002;
        AnonymousClass4TC r4 = this.A0c.A04;
        if (r4 == null) {
            r1 = this.A0C.A08;
        } else {
            r1 = r4.A02.A04;
        }
        boolean z2 = !this.A0C.A07.equals(r1);
        if (z2) {
            this.A0C = this.A0C.A06(r1);
        }
        AnonymousClass5NA r2 = this.A0C;
        if (r4 == null) {
            A002 = r2.A0I;
        } else {
            A002 = r4.A00();
        }
        r2.A0H = A002;
        AnonymousClass5NA r22 = this.A0C;
        r22.A0J = A00(r22.A0H);
        if ((z2 || z) && r4 != null && r4.A07) {
            this.A0b.DtI(r4.A03, this.A12, r4.A04.A04);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0Y(boolean r39, boolean r40, boolean r41, boolean r42) {
        /*
            r38 = this;
            r6 = r38
            X.4S6 r0 = r6.A0k
            r1 = 2
            X.4S5 r0 = (X.AnonymousClass4S5) r0
            android.os.Handler r0 = r0.A00
            r0.removeMessages(r1)
            r5 = 0
            r6.A08 = r5
            r4 = 0
            r6.A0K = r4
            X.4S3 r0 = r6.A0Z
            r0.A03 = r4
            X.4S4 r0 = r0.A06
            r0.A01()
            X.4S4 r0 = r6.A0l
            r0.A01()
            long r0 = r6.A05
            r6.A07 = r0
            X.4PL[] r8 = r6.A12
            int r7 = r8.length
            r2 = 0
        L_0x0028:
            java.lang.String r3 = "ExoPlayerImplInternal"
            if (r2 >= r7) goto L_0x003d
            r0 = r8[r2]
            r6.A0O(r0)     // Catch:{ 48u -> 0x0034, RuntimeException -> 0x0032 }
            goto L_0x003a
        L_0x0032:
            r1 = move-exception
            goto L_0x0035
        L_0x0034:
            r1 = move-exception
        L_0x0035:
            java.lang.String r0 = "Disable failed."
            X.2AG.A05(r3, r0, r1)
        L_0x003a:
            int r2 = r2 + 1
            goto L_0x0028
        L_0x003d:
            if (r39 == 0) goto L_0x0059
            r2 = 0
        L_0x0040:
            if (r2 >= r7) goto L_0x0059
            r1 = r8[r2]
            java.util.Set r0 = r6.A0n
            boolean r0 = r0.remove(r1)
            if (r0 == 0) goto L_0x0056
            r1.reset()     // Catch:{ RuntimeException -> 0x0050 }
            goto L_0x0056
        L_0x0050:
            r1 = move-exception
            java.lang.String r0 = "Reset failed."
            X.2AG.A05(r3, r0, r1)
        L_0x0056:
            int r2 = r2 + 1
            goto L_0x0040
        L_0x0059:
            r6.A00 = r4
            X.5NA r0 = r6.A0C
            X.4Rq r9 = r0.A08
            long r2 = r0.A0I
            X.5NA r10 = r6.A0C
            X.4Rq r8 = r10.A08
            int r1 = r8.A00
            r0 = -1
            if (r1 != r0) goto L_0x0144
            X.4Rc r7 = r6.A0e
            com.google.android.exoplayer2.Timeline r1 = r10.A06
            int r0 = r1.A02()
            if (r0 == 0) goto L_0x0144
            java.lang.Object r0 = r8.A04
            X.4Rc r0 = r1.A0B(r7, r0)
            boolean r0 = r0.A06
            if (r0 != 0) goto L_0x0144
            X.5NA r0 = r6.A0C
            long r0 = r0.A0I
        L_0x0082:
            if (r40 == 0) goto L_0x0141
            r6.A0B = r5
            r6.A09 = r5
            X.5NA r0 = r6.A0C
            com.google.android.exoplayer2.Timeline r0 = r0.A06
            android.util.Pair r0 = r6.A05(r0)
            java.lang.Object r9 = r0.first
            X.4Rq r9 = (X.C264874Rq) r9
            java.lang.Object r0 = r0.second
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            X.5NA r0 = r6.A0C
            X.4Rq r0 = r0.A08
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x013c
            r10 = 1
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00ac:
            X.5NE r7 = r6.A0c
            r7.A09()
            r6.A0R = r4
            X.5NA r8 = r6.A0C
            com.google.android.exoplayer2.Timeline r7 = r8.A06
            r37 = r7
            int r15 = r8.A00
            if (r42 != 0) goto L_0x00bf
            X.48u r5 = r8.A04
        L_0x00bf:
            if (r10 == 0) goto L_0x0135
            X.4Rn r11 = X.C264844Rn.A03
            X.4Rb r10 = r6.A0h
            com.google.android.exoplayer2.metadata.Metadata[] r7 = new com.google.android.exoplayer2.metadata.Metadata[r4]
            java.util.ArrayList r8 = X.AnonymousClass4R7.A00(r7)
        L_0x00cb:
            X.5NA r7 = r6.A0C
            boolean r14 = r7.A0F
            int r13 = r7.A01
            X.4P7 r12 = r7.A05
            r29 = 0
            java.lang.Integer r19 = X.AnonymousClass05K.A00
            X.5NA r7 = new X.5NA
            r16 = r9
            r22 = r13
            r23 = r0
            r25 = r2
            r27 = r2
            r31 = r2
            r33 = r4
            r34 = r14
            r35 = r4
            r36 = r4
            r18 = r10
            r20 = r8
            r21 = r15
            r15 = r9
            r17 = r11
            r13 = r12
            r14 = r37
            r12 = r5
            r11 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r27, r29, r31, r33, r34, r35, r36)
            r6.A0C = r7
            if (r41 == 0) goto L_0x0154
            X.5NF r7 = r6.A0d
            java.util.HashMap r6 = r7.A06
            java.util.Collection r0 = r6.values()
            java.util.Iterator r5 = r0.iterator()
        L_0x010e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x014a
            java.lang.Object r3 = r5.next()
            X.5Nf r3 = (X.C284605Nf) r3
            X.4Su r1 = r3.A02     // Catch:{ RuntimeException -> 0x0122 }
            X.4Ry r0 = r3.A01     // Catch:{ RuntimeException -> 0x0122 }
            r1.ECl(r0)     // Catch:{ RuntimeException -> 0x0122 }
            goto L_0x012a
        L_0x0122:
            r2 = move-exception
            java.lang.String r1 = "MediaSourceList"
            java.lang.String r0 = "Failed to release child source."
            X.2AG.A05(r1, r0, r2)
        L_0x012a:
            X.4Su r1 = r3.A02
            X.5Ne r0 = r3.A00
            r1.EDd(r0)
            r1.EDW(r0)
            goto L_0x010e
        L_0x0135:
            X.4Rn r11 = r8.A09
            X.4Rb r10 = r8.A0A
            java.util.List r8 = r8.A0C
            goto L_0x00cb
        L_0x013c:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0141:
            r10 = 0
            goto L_0x00ac
        L_0x0144:
            X.5NA r0 = r6.A0C
            long r0 = r0.A03
            goto L_0x0082
        L_0x014a:
            r6.clear()
            java.util.Set r0 = r7.A0A
            r0.clear()
            r7.A01 = r4
        L_0x0154:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5NB.A0Y(boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        if (r13.A0C.A00 != 3) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0078, code lost:
        if (r20 == false) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0Z(boolean[] r30) {
        /*
            r29 = this;
            r13 = r29
            X.5NE r12 = r13.A0c
            X.4TC r15 = r12.A06
            X.4Rb r14 = r15.A04
            r11 = 0
            r2 = 0
        L_0x000a:
            X.4PL[] r10 = r13.A12
            int r9 = r10.length
            if (r2 >= r9) goto L_0x0027
            X.4RW[] r0 = r14.A03
            r0 = r0[r2]
            if (r0 != 0) goto L_0x0024
            java.util.Set r1 = r13.A0n
            r0 = r10[r2]
            boolean r0 = r1.remove(r0)
            if (r0 == 0) goto L_0x0024
            r0 = r10[r2]
            r0.reset()
        L_0x0024:
            int r2 = r2 + 1
            goto L_0x000a
        L_0x0027:
            if (r11 >= r9) goto L_0x00db
            X.4RW[] r0 = r14.A03
            r0 = r0[r11]
            if (r0 == 0) goto L_0x00d7
            boolean r5 = r30[r11]
            r8 = r10[r11]
            r0 = r8
            X.4PK r0 = (X.AnonymousClass4PK) r0
            int r0 = r0.A01
            if (r0 != 0) goto L_0x00d7
            X.4TC r0 = r12.A06
            X.4TC r1 = r12.A05
            r7 = 0
            if (r0 != r1) goto L_0x0042
            r7 = 1
        L_0x0042:
            X.4Rb r2 = r0.A04
            X.4RW[] r1 = r2.A03
            r22 = r1[r11]
            X.4RX[] r1 = r2.A04
            r4 = r1[r11]
            r3 = 0
            if (r4 == 0) goto L_0x0062
            int r2 = r4.length()
        L_0x0053:
            X.3wB[] r1 = new X.C256683wB[r2]
            r21 = r1
        L_0x0057:
            if (r3 >= r2) goto L_0x0064
            X.3wB r1 = r4.B7Q(r3)
            r21[r3] = r1
            int r3 = r3 + 1
            goto L_0x0057
        L_0x0062:
            r2 = 0
            goto L_0x0053
        L_0x0064:
            boolean r1 = r13.A0c()
            if (r1 == 0) goto L_0x0073
            X.5NA r1 = r13.A0C
            int r2 = r1.A00
            r1 = 3
            r20 = 1
            if (r2 == r1) goto L_0x0075
        L_0x0073:
            r20 = 0
        L_0x0075:
            if (r5 != 0) goto L_0x007a
            r6 = 1
            if (r20 != 0) goto L_0x007b
        L_0x007a:
            r6 = 0
        L_0x007b:
            int r1 = r13.A00
            int r1 = r1 + 1
            r13.A00 = r1
            java.util.Set r1 = r13.A0n
            r1.add(r8)
            X.4TD[] r1 = r0.A0B
            r23 = r1[r11]
            long r4 = r13.A07
            X.4TB r1 = r0.A02
            long r2 = r1.A03
            long r0 = r0.A00
            r18 = r0
            long r2 = r2 + r0
            r1 = r8
            X.4PK r1 = (X.AnonymousClass4PK) r1
            int r0 = r1.A01
            r17 = r0
            r16 = 1
            r0 = 0
            if (r17 != 0) goto L_0x00a2
            r0 = 1
        L_0x00a2:
            X.C256703wD.A04(r0)
            r0 = r22
            r1.A03 = r0
            r0 = r16
            r1.A01 = r0
            r1.A0M(r6, r7)
            r22 = r1
            r24 = r21
            r25 = r2
            r27 = r18
            r22.EFN(r23, r24, r25, r27)
            r0 = 0
            r1.A07 = r0
            r1.A02 = r4
            r1.A0L(r4, r6)
            r1 = 11
            X.5eO r0 = new X.5eO
            r0.<init>(r13)
            r8.CIs(r1, r0)
            X.4S3 r0 = r13.A0Z
            r0.A01(r8)
            if (r20 == 0) goto L_0x00d7
            r8.start()
        L_0x00d7:
            int r11 = r11 + 1
            goto L_0x0027
        L_0x00db:
            r0 = 1
            r15.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5NB.A0Z(boolean[]):void");
    }

    private boolean A0a() {
        AnonymousClass4TC r1 = this.A0c.A04;
        if (r1 == null || (r1.A07 && r1.A08.BWC() == Long.MIN_VALUE)) {
            return false;
        }
        return true;
    }

    private boolean A0b() {
        AnonymousClass4TC r1 = this.A0c.A05;
        long j = r1.A02.A00;
        if (!r1.A07) {
            return false;
        }
        if (j == -9223372036854775807L || this.A0C.A0I < j || !A0c()) {
            return true;
        }
        return false;
    }

    private boolean A0c() {
        AnonymousClass5NA r1 = this.A0C;
        if (!r1.A0F || r1.A01 != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0048, code lost:
        if (r3.A02 == Long.MIN_VALUE) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0d(X.C284695No r15, X.C264744Rc r16, X.AnonymousClass4RE r17, com.google.android.exoplayer2.Timeline r18, com.google.android.exoplayer2.Timeline r19, int r20, boolean r21) {
        /*
            java.lang.Object r0 = r15.A02
            r13 = 0
            r4 = 1
            r6 = -9223372036854775808
            r9 = r16
            r10 = r17
            r11 = r18
            if (r0 != 0) goto L_0x0080
            X.4SA r3 = r15.A03
            long r0 = r3.A02
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x007b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x001b:
            com.google.android.exoplayer2.Timeline r5 = r3.A09
            int r2 = r3.A00
            X.5Np r8 = new X.5Np
            r8.<init>(r5, r2, r0)
            r12 = r20
            r14 = r21
            android.util.Pair r2 = A04(r8, r9, r10, r11, r12, r13, r14)
            if (r2 == 0) goto L_0x00d7
            java.lang.Object r0 = r2.first
            int r5 = r11.A06(r0)
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.Object r2 = r2.first
            r15.A00 = r5
            r15.A01 = r0
            r15.A02 = r2
            long r0 = r3.A02
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0074
        L_0x004a:
            java.lang.Object r0 = r15.A02
            X.4Rc r0 = r11.A0B(r9, r0)
            int r2 = r0.A00
            r0 = 0
            X.4RE r0 = r11.A0E(r10, r2, r0)
            int r3 = r0.A01
            X.4Rc r0 = r11.A0D(r9, r3, r4)
            java.lang.Object r7 = r0.A05
            long r5 = r9.A01
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0075
            r0 = 1
            long r5 = r5 - r0
        L_0x006e:
            r15.A00 = r3
        L_0x0070:
            r15.A01 = r5
            r15.A02 = r7
        L_0x0074:
            return r4
        L_0x0075:
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x006e
        L_0x007b:
            long r0 = com.google.android.exoplayer2.util.Util.A07(r0)
            goto L_0x001b
        L_0x0080:
            int r3 = r11.A06(r0)
            r0 = -1
            if (r3 == r0) goto L_0x00d7
            X.4SA r0 = r15.A03
            long r0 = r0.A02
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x004a
            r15.A00 = r3
            java.lang.Object r0 = r15.A02
            r3 = r19
            r3.A0B(r9, r0)
            boolean r0 = r9.A06
            if (r0 == 0) goto L_0x0074
            int r2 = r9.A00
            r0 = 0
            X.4RE r0 = r3.A0E(r10, r2, r0)
            int r1 = r0.A00
            java.lang.Object r0 = r15.A02
            int r0 = r3.A06(r0)
            if (r1 != r0) goto L_0x0074
            long r2 = r15.A01
            long r0 = r9.A02
            long r2 = r2 + r0
            java.lang.Object r0 = r15.A02
            X.4Rc r0 = r11.A0B(r9, r0)
            int r0 = r0.A00
            r5 = r11
            r6 = r9
            r7 = r10
            r8 = r0
            r9 = r2
            android.util.Pair r2 = r5.A09(r6, r7, r8, r9)
            java.lang.Object r0 = r2.first
            int r1 = r11.A06(r0)
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            long r5 = r0.longValue()
            java.lang.Object r7 = r2.first
            r15.A00 = r1
            goto L_0x0070
        L_0x00d7:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5NB.A0d(X.5No, X.4Rc, X.4RE, com.google.android.exoplayer2.Timeline, com.google.android.exoplayer2.Timeline, int, boolean):boolean");
    }

    private boolean A0e(Timeline timeline, C264874Rq r8) {
        boolean z = false;
        if (r8.A00 != -1) {
            z = true;
        }
        if (z || timeline.A02() == 0 || !this.A0z) {
            return false;
        }
        int i = timeline.A0B(this.A0e, r8.A04).A00;
        AnonymousClass4RE r2 = this.A0f;
        timeline.A0E(r2, i, 0);
        if (!r2.A01() || !r2.A0D || r2.A07 == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b8, code lost:
        if (r23 != false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d1, code lost:
        if (r23 != false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r4.A1G == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A0f(boolean r23) {
        /*
            r22 = this;
            r4 = r22
            boolean r0 = r4.A0a()
            r7 = 0
            if (r0 != 0) goto L_0x000a
            return r7
        L_0x000a:
            X.5NE r6 = r4.A0c
            X.4TC r5 = r6.A04
            int r0 = r4.A02
            if (r0 == 0) goto L_0x0017
            boolean r0 = r4.A1G
            r1 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            boolean r0 = r4.A0s
            if (r0 != 0) goto L_0x0020
            boolean r0 = r4.A1I
            if (r0 == 0) goto L_0x0047
        L_0x0020:
            if (r1 != 0) goto L_0x0047
            long r0 = r4.A07
            long r2 = r5.A00
            long r0 = r0 - r2
            X.4TH r2 = r5.A08
            long r19 = r2.AiS(r0)
            boolean r0 = r4.A1D
            if (r0 == 0) goto L_0x0053
            X.4TC r8 = r6.A05
        L_0x0033:
            if (r8 == 0) goto L_0x0053
            if (r8 == r5) goto L_0x0053
            long r2 = r4.A07
            long r0 = r8.A00
            long r2 = r2 - r0
            X.4TH r0 = r8.A08
            long r0 = r0.AiS(r2)
            long r19 = r19 + r0
            X.4TC r8 = r8.A01
            goto L_0x0033
        L_0x0047:
            boolean r0 = r4.A1C
            if (r0 == 0) goto L_0x00de
            long r0 = r5.A00()
        L_0x004f:
            long r19 = r4.A00(r0)
        L_0x0053:
            X.4TC r8 = r6.A05
            long r0 = r4.A07
            long r2 = r5.A00
            long r0 = r0 - r2
            if (r5 == r8) goto L_0x0061
            X.4TB r2 = r5.A02
            long r2 = r2.A03
            long r0 = r0 - r2
        L_0x0061:
            boolean r12 = r4.A0c()
            boolean r2 = r4.A1F
            if (r2 == 0) goto L_0x00c3
            X.5NA r2 = r4.A0C
            com.google.android.exoplayer2.Timeline r14 = r2.A06
            X.4TB r2 = r5.A02
            X.4Rq r15 = r2.A04
            X.4S3 r5 = r4.A0Z
            X.4P7 r2 = r5.BdA()
            float r3 = r2.A01
            X.5NA r2 = r4.A0C
            boolean r2 = r2.A0F
            X.5Nj r13 = new X.5Nj
            r21 = r2
            r17 = r0
            r16 = r3
            r13.<init>(r14, r15, r16, r17, r19, r21)
            X.4QZ r15 = r4.A0b
            boolean r11 = r15.Erx(r13)
        L_0x008e:
            if (r11 != 0) goto L_0x00c2
            r8 = 500000(0x7a120, double:2.47033E-318)
            int r2 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x00c2
            long r2 = r4.A0W
            r9 = 0
            int r8 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r8 > 0) goto L_0x00a3
            boolean r2 = r4.A10
            if (r2 == 0) goto L_0x00c2
        L_0x00a3:
            X.4TC r2 = r6.A05
            X.4TH r6 = r2.A08
            X.5NA r2 = r4.A0C
            long r2 = r2.A0I
            r6.APR(r2, r7)
            X.4P7 r2 = r5.BdA()
            float r2 = r2.A01
            if (r12 != 0) goto L_0x00ba
            r21 = 0
            if (r23 == 0) goto L_0x00bc
        L_0x00ba:
            r21 = 1
        L_0x00bc:
            r16 = r2
            boolean r11 = r15.Ery(r16, r17, r19, r21)
        L_0x00c2:
            return r11
        L_0x00c3:
            X.4QZ r15 = r4.A0b
            X.4S3 r5 = r4.A0Z
            X.4P7 r2 = r5.BdA()
            float r2 = r2.A01
            if (r12 != 0) goto L_0x00d3
            r21 = 0
            if (r23 == 0) goto L_0x00d5
        L_0x00d3:
            r21 = 1
        L_0x00d5:
            r17 = r0
            r16 = r2
            boolean r11 = r15.Ery(r16, r17, r19, r21)
            goto L_0x008e
        L_0x00de:
            boolean r0 = r5.A07
            if (r0 != 0) goto L_0x00e6
            r0 = 0
            goto L_0x004f
        L_0x00e6:
            X.4TH r0 = r5.A08
            long r0 = r0.BWC()
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5NB.A0f(boolean):boolean");
    }

    public final /* bridge */ /* synthetic */ void D6K(AnonymousClass4TI r3) {
        this.A0k.CsU(r3, 9).A01();
    }

    public final void DXa(AnonymousClass4P7 r3) {
        this.A0k.CsU(r3, 16).A01();
        if (this.A17) {
            A0G(r3.A01);
        }
    }

    public final void DZ1(AnonymousClass4TH r3) {
        this.A0k.CsU(r3, 8).A01();
    }

    public final void DtA() {
        ((AnonymousClass4S5) this.A0k).A00.sendEmptyMessage(10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if ((r13 + r2.A00) < 0) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long A02(X.C264874Rq r12, long r13, boolean r15, boolean r16) {
        /*
            r11 = this;
            r11.A0C()
            r7 = 0
            r11.A0K = r7
            r6 = 2
            if (r16 != 0) goto L_0x0010
            X.5NA r0 = r11.A0C
            int r1 = r0.A00
            r0 = 3
            if (r1 != r0) goto L_0x0013
        L_0x0010:
            r11.A0H(r6)
        L_0x0013:
            X.5NE r8 = r11.A0c
            X.4TC r2 = r8.A05
            r1 = r2
        L_0x0018:
            if (r2 == 0) goto L_0x0027
            X.4TB r0 = r2.A02
            X.4Rq r0 = r0.A04
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0027
            X.4TC r2 = r2.A01
            goto L_0x0018
        L_0x0027:
            if (r15 != 0) goto L_0x0037
            if (r1 != r2) goto L_0x0037
            if (r2 == 0) goto L_0x004f
            long r0 = r2.A00
            long r9 = r13 + r0
            r3 = 0
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0062
        L_0x0037:
            X.4PL[] r4 = r11.A12
            int r3 = r4.length
            r1 = 0
        L_0x003b:
            if (r1 >= r3) goto L_0x0045
            r0 = r4[r1]
            r11.A0O(r0)
            int r1 = r1 + 1
            goto L_0x003b
        L_0x0045:
            if (r2 == 0) goto L_0x004f
        L_0x0047:
            X.4TC r0 = r8.A05
            if (r0 == r2) goto L_0x0056
            r8.A06()
            goto L_0x0047
        L_0x004f:
            r8.A09()
            r11.A0J(r13)
            goto L_0x0095
        L_0x0056:
            r8.A0A(r2)
            long r0 = r11.A05
            r2.A00 = r0
            boolean[] r0 = new boolean[r3]
            r11.A0Z(r0)
        L_0x0062:
            r8.A0A(r2)
            boolean r0 = r2.A07
            if (r0 != 0) goto L_0x00a8
            X.4TB r0 = r2.A02
            X.4TB r0 = r0.A01(r13)
            r2.A02 = r0
        L_0x0071:
            r11.A0J(r13)
            boolean r0 = r11.A18
            boolean r0 = r11.A0f(r0)
            r11.A0R = r0
            if (r0 == 0) goto L_0x0092
            boolean r0 = r11.A0r
            X.4TC r4 = r8.A04
            if (r0 == 0) goto L_0x00a2
            long r0 = r11.A07
            X.5NA r2 = r11.A0C
            boolean r3 = r2.A0F
            X.XaP r2 = new X.XaP
            r2.<init>(r0, r3)
            r4.A08(r2)
        L_0x0092:
            r11.A0D()
        L_0x0095:
            r11.A0V(r7)
            X.4S6 r0 = r11.A0k
            X.4S5 r0 = (X.AnonymousClass4S5) r0
            android.os.Handler r0 = r0.A00
            r0.sendEmptyMessage(r6)
            return r13
        L_0x00a2:
            long r0 = r11.A07
            r4.A06(r0)
            goto L_0x0092
        L_0x00a8:
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x0071
            X.4TH r5 = r2.A08
            long r13 = r5.EL5(r13, r7)
            long r3 = r11.A0W
            long r1 = r13 - r3
            boolean r0 = r11.A10
            r5.APR(r1, r0)
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5NB.A02(X.4Rq, long, boolean, boolean):long");
    }

    public static Pair A03(C290315f7 r4, C264744Rc r5, Timeline timeline) {
        boolean z = false;
        if (timeline.A02() == 0) {
            z = true;
        }
        if (z) {
            return null;
        }
        C264874Rq r1 = r4.A01;
        Object obj = r1.A04;
        if (r1.equals(AnonymousClass5NA.A0K) && (obj = r5.A05) == null) {
            if (timeline.A01() <= 0) {
                return null;
            }
            obj = timeline.A0D(r5, 0, true).A05;
        }
        return new Pair(obj, Long.valueOf(r4.A00));
    }

    private void A0P(AnonymousClass4PL r9) {
        try {
            r9.Cnm();
        } catch (C2609547r e) {
            if (e.getClass().equals(C2609547r.class) && this.A1H) {
                long j = this.A04;
                if (j == -9223372036854775807L) {
                    2AG.A04("ExoPlayerImplInternal", 002.A0R("Temporarily ignoring stream error: ", e.getMessage()));
                    this.A04 = System.currentTimeMillis();
                    return;
                } else if (System.currentTimeMillis() - j <= this.A14) {
                    return;
                }
            }
            throw e;
        }
    }

    private void A0S(Timeline timeline, Timeline timeline2, C264874Rq r14, C264874Rq r15, long j, boolean z) {
        AnonymousClass4P7 r1;
        if (!A0e(timeline, r14)) {
            if (r14.A00 != -1) {
                r1 = AnonymousClass4P7.A03;
            } else {
                r1 = this.A0C.A05;
            }
            if (!this.A0Z.BdA().equals(r1)) {
                A0K(r1);
                A0L(this.A0C.A05, r1.A01, false, false);
                return;
            }
            return;
        }
        Object obj = r14.A04;
        C264744Rc r8 = this.A0e;
        int i = timeline.A0B(r8, obj).A00;
        AnonymousClass4RE r7 = this.A0f;
        timeline.A0E(r7, i, 0);
        C284495Ms r6 = this.A0a;
        r6.EcP(r7.A08);
        long j2 = -9223372036854775807L;
        long j3 = j;
        if (j != -9223372036854775807L) {
            j2 = A01(timeline, obj, j3);
        } else {
            Object obj2 = r7.A0C;
            Object obj3 = null;
            if (timeline2.A02() != 0) {
                obj3 = timeline2.A0E(r7, timeline2.A0B(r8, r15.A04).A00, 0).A0C;
            }
            if (Util.A0I(obj3, obj2) && !z) {
                return;
            }
        }
        r6.Enw(j2);
    }

    private void A0U(IOException iOException, int i) {
        C2612348u A002 = C2612348u.A00(iOException, i);
        AnonymousClass4TC r0 = this.A0c.A05;
        if (r0 != null) {
            A002 = A002.A02(r0.A02.A04);
        }
        2AG.A05("ExoPlayerImplInternal", "Playback error", A002);
        A0X(false, false);
        this.A0C = this.A0C.A03(A002);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.4UN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: X.5OP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: X.47s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v106, resolved type: X.4UN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v107, resolved type: X.4UN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v108, resolved type: X.4UN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v104, resolved type: X.5N6} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0235, code lost:
        A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03a6, code lost:
        if (r6 > r4.A08.size()) goto L_0x03a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0409, code lost:
        if (r2.A06 != r2.A05) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x040b, code lost:
        A0W(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x040e, code lost:
        A0V(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x066c, code lost:
        if (r8.A00 < r8.A09) goto L_0x066e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x09d4, code lost:
        if (r6.CSi() == false) goto L_0x09d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x09e2, code lost:
        if (r6.CSi() == false) goto L_0x09e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0a01, code lost:
        if (r6.CSi() != false) goto L_0x0a03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0a07, code lost:
        if (r2 == false) goto L_0x0a09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0a9c, code lost:
        if (A0b() != false) goto L_0x0a9e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0aa8, code lost:
        if (((X.AnonymousClass4PK) r2).A0B == 1) goto L_0x0aaa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0b61, code lost:
        if (r8.A07 != false) goto L_0x0b63;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x0b7d, code lost:
        if ((java.lang.System.currentTimeMillis() - r2) >= ((long) r6)) goto L_0x0b7f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:0x0be6, code lost:
        if (r15 == false) goto L_0x0be8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:736:0x0e2f, code lost:
        if (r2 == r5.A0I) goto L_0x0e31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0206, code lost:
        if (r0.A0C.A0F != false) goto L_0x0208;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x071c A[Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0729 A[Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x073c A[Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }] */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x07e6 A[Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }] */
    /* JADX WARNING: Removed duplicated region for block: B:575:0x0b5e A[Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }] */
    /* JADX WARNING: Removed duplicated region for block: B:580:0x0b6b A[Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }] */
    /* JADX WARNING: Removed duplicated region for block: B:589:0x0b89 A[Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }] */
    /* JADX WARNING: Removed duplicated region for block: B:593:0x0b9f A[Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }] */
    /* JADX WARNING: Removed duplicated region for block: B:598:0x0bc6 A[Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }] */
    /* JADX WARNING: Removed duplicated region for block: B:621:0x0c0a A[Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }] */
    /* JADX WARNING: Removed duplicated region for block: B:624:0x0c6a A[Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }] */
    /* JADX WARNING: Removed duplicated region for block: B:628:0x0c7a A[Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }] */
    /* JADX WARNING: Removed duplicated region for block: B:657:0x0cd1 A[Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }] */
    /* JADX WARNING: Removed duplicated region for block: B:664:0x0ce8 A[Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }] */
    /* JADX WARNING: Removed duplicated region for block: B:680:0x0d10 A[Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }] */
    /* JADX WARNING: Removed duplicated region for block: B:688:0x0d7a A[Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }] */
    /* JADX WARNING: Removed duplicated region for block: B:693:0x0d85 A[Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }] */
    /* JADX WARNING: Removed duplicated region for block: B:696:0x0d95 A[Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }] */
    /* JADX WARNING: Removed duplicated region for block: B:827:0x08cd A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r54) {
        /*
            r53 = this;
            r0 = r53
            java.lang.String r22 = "Playback error"
            java.lang.String r21 = "ExoPlayerImplInternal"
            r19 = 1000(0x3e8, float:1.401E-42)
            r9 = 0
            r1 = 1
            r5 = r54
            int r2 = r5.what     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            switch(r2) {
                case 0: goto L_0x05e6;
                case 1: goto L_0x0025;
                case 2: goto L_0x061a;
                case 3: goto L_0x0032;
                case 4: goto L_0x017e;
                case 5: goto L_0x019b;
                case 6: goto L_0x01a3;
                case 7: goto L_0x0d9c;
                case 8: goto L_0x01a8;
                case 9: goto L_0x0222;
                case 10: goto L_0x0dc1;
                case 11: goto L_0x023a;
                case 12: goto L_0x024e;
                case 13: goto L_0x0266;
                case 14: goto L_0x02a5;
                case 15: goto L_0x02f4;
                case 16: goto L_0x0322;
                case 17: goto L_0x032d;
                case 18: goto L_0x0369;
                case 19: goto L_0x0017;
                case 20: goto L_0x038c;
                case 21: goto L_0x03ba;
                case 22: goto L_0x0ec0;
                case 23: goto L_0x03f4;
                case 24: goto L_0x0413;
                case 25: goto L_0x0012;
                case 26: goto L_0x0433;
                case 27: goto L_0x0553;
                case 28: goto L_0x05d8;
                default: goto L_0x0011;
            }     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0011:
            return r9
        L_0x0012:
            r0.A0W(r1)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x0017:
            X.5ND r2 = r0.A0A     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2.A00(r1)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.lang.String r2 = "fromIndex"
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r5.<init>(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0dc0
        L_0x0025:
            int r2 = r5.arg1     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r3 = 0
            if (r2 == 0) goto L_0x002b
            r3 = 1
        L_0x002b:
            int r2 = r5.arg2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0I(r2, r1, r3, r1)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x0032:
            java.lang.Object r7 = r5.obj     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5Np r7 = (X.C284705Np) r7     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5ND r2 = r0.A0A     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r16 = 1
            r2.A00(r1)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            com.google.android.exoplayer2.Timeline r6 = r2.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r5 = r0.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r4 = r0.A0T     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4RE r3 = r0.A0f     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rc r2 = r0.A0e     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r23 = r7
            r24 = r2
            r25 = r3
            r26 = r6
            r27 = r5
            r28 = r1
            r29 = r4
            android.util.Pair r8 = A04(r23, r24, r25, r26, r27, r28, r29)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r14 = 0
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 != 0) goto L_0x008c
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            com.google.android.exoplayer2.Timeline r2 = r2.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            android.util.Pair r2 = r0.A05(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.lang.Object r4 = r2.first     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rq r4 = (X.C264874Rq) r4     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.lang.Object r2 = r2.second     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r2.longValue()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NA r5 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            com.google.android.exoplayer2.Timeline r5 = r5.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r6 = r5.A02()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r5 = 0
            if (r6 != 0) goto L_0x0084
            r5 = 1
        L_0x0084:
            r32 = r5 ^ 1
            r28 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00b6
        L_0x008c:
            java.lang.Object r11 = r8.first     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.lang.Object r2 = r8.second     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r2.longValue()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r5 = r7.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r4 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x00a2
            r28 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00a4
        L_0x00a2:
            r28 = r2
        L_0x00a4:
            X.5NE r10 = r0.A0c     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NA r4 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            com.google.android.exoplayer2.Timeline r4 = r4.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rq r4 = r10.A08(r4, r11)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r10 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            r32 = 0
            if (r10 != 0) goto L_0x00b6
            r32 = 1
        L_0x00b6:
            X.5NA r5 = r0.A0C     // Catch:{ all -> 0x0167 }
            com.google.android.exoplayer2.Timeline r6 = r5.A06     // Catch:{ all -> 0x0167 }
            int r6 = r6.A02()     // Catch:{ all -> 0x0167 }
            if (r6 != 0) goto L_0x00c7
            r0.A0B = r7     // Catch:{ all -> 0x0167 }
            r5 = 0
            r0.A09 = r5     // Catch:{ all -> 0x0167 }
            goto L_0x0153
        L_0x00c7:
            r7 = 4
            if (r8 != 0) goto L_0x00d5
            int r5 = r5.A00     // Catch:{ all -> 0x0167 }
            if (r5 == r1) goto L_0x00d1
            r0.A0H(r7)     // Catch:{ all -> 0x0167 }
        L_0x00d1:
            r0.A0Y(r9, r1, r9, r1)     // Catch:{ all -> 0x0167 }
            goto L_0x0153
        L_0x00d5:
            X.4Rq r5 = r5.A08     // Catch:{ all -> 0x0167 }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x0167 }
            if (r5 == 0) goto L_0x0114
            X.5NE r5 = r0.A0c     // Catch:{ all -> 0x0167 }
            X.4TC r6 = r5.A05     // Catch:{ all -> 0x0167 }
            if (r6 == 0) goto L_0x00ec
            boolean r5 = r6.A07     // Catch:{ all -> 0x0167 }
            if (r5 == 0) goto L_0x00ec
            int r5 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x00ec
            goto L_0x00ef
        L_0x00ec:
            r35 = r2
            goto L_0x00f7
        L_0x00ef:
            X.4TH r6 = r6.A08     // Catch:{ all -> 0x0167 }
            X.4P6 r5 = r0.A0E     // Catch:{ all -> 0x0167 }
            long r35 = r6.AZp(r5, r2)     // Catch:{ all -> 0x0167 }
        L_0x00f7:
            long r12 = com.google.android.exoplayer2.util.Util.A08(r35)     // Catch:{ all -> 0x0167 }
            X.5NA r5 = r0.A0C     // Catch:{ all -> 0x0167 }
            long r5 = r5.A0I     // Catch:{ all -> 0x0167 }
            long r10 = com.google.android.exoplayer2.util.Util.A08(r5)     // Catch:{ all -> 0x0167 }
            int r5 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x0116
            X.5NA r8 = r0.A0C     // Catch:{ all -> 0x0167 }
            int r6 = r8.A00     // Catch:{ all -> 0x0167 }
            r5 = 2
            if (r6 == r5) goto L_0x0111
            r5 = 3
            if (r6 != r5) goto L_0x0116
        L_0x0111:
            long r2 = r8.A0I     // Catch:{ all -> 0x0167 }
            goto L_0x0153
        L_0x0114:
            r35 = r2
        L_0x0116:
            X.5NA r5 = r0.A0C     // Catch:{ all -> 0x0167 }
            int r5 = r5.A00     // Catch:{ all -> 0x0167 }
            r38 = 0
            if (r5 != r7) goto L_0x0120
            r38 = 1
        L_0x0120:
            X.5NE r5 = r0.A0c     // Catch:{ all -> 0x0167 }
            X.4TC r6 = r5.A05     // Catch:{ all -> 0x0167 }
            X.4TC r5 = r5.A06     // Catch:{ all -> 0x0167 }
            r37 = 0
            if (r6 == r5) goto L_0x012c
            r37 = 1
        L_0x012c:
            r33 = r0
            r34 = r4
            long r36 = r33.A02(r34, r35, r37, r38)     // Catch:{ all -> 0x0167 }
            int r5 = (r2 > r36 ? 1 : (r2 == r36 ? 0 : -1))
            if (r5 != 0) goto L_0x013a
            r16 = 0
        L_0x013a:
            r32 = r32 | r16
            X.5NA r2 = r0.A0C     // Catch:{ all -> 0x0165 }
            com.google.android.exoplayer2.Timeline r3 = r2.A06     // Catch:{ all -> 0x0165 }
            X.4Rq r2 = r2.A08     // Catch:{ all -> 0x0165 }
            r23 = r0
            r24 = r3
            r25 = r3
            r26 = r4
            r27 = r2
            r30 = r1
            r23.A0S(r24, r25, r26, r27, r28, r30)     // Catch:{ all -> 0x0165 }
            r2 = r36
        L_0x0153:
            r25 = 2
            r23 = r0
            r24 = r4
            r26 = r2
            r30 = r2
            X.5NA r2 = r23.A06(r24, r25, r26, r28, r30, r32)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0C = r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x0165:
            r5 = move-exception
            goto L_0x016a
        L_0x0167:
            r5 = move-exception
            r36 = r2
        L_0x016a:
            r35 = 2
            r33 = r0
            r34 = r4
            r40 = r36
            r38 = r28
            r42 = r32
            X.5NA r2 = r33.A06(r34, r35, r36, r38, r40, r42)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0C = r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0dc0
        L_0x017e:
            java.lang.Object r3 = r5.obj     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4P7 r3 = (X.AnonymousClass4P7) r3     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0K(r3)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4S4 r2 = r0.A0l     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2.Efz(r3)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r0.A0p     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x0f67
            X.4S3 r2 = r0.A0Z     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4P7 r3 = r2.BdA()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            float r2 = r3.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0L(r3, r2, r1, r1)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x019b:
            java.lang.Object r2 = r5.obj     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4P6 r2 = (X.AnonymousClass4P6) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0E = r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x01a3:
            r0.A0X(r9, r1)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x01a8:
            java.lang.Object r3 = r5.obj     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TH r3 = (X.AnonymousClass4TH) r3     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NE r6 = r0.A0c     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TC r4 = r6.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r4 == 0) goto L_0x0f67
            X.4TH r2 = r4.A08     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != r3) goto L_0x0f67
            X.4S3 r2 = r0.A0Z     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4P7 r2 = r2.BdA()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            float r2 = r2.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r4.A05(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rn r7 = r4.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rb r2 = r4.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4QZ r3 = r0.A0b     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4PL[] r5 = r0.A12     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4RX[] r2 = r2.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r3.DtI(r7, r5, r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TC r2 = r6.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r4 != r2) goto L_0x01fd
            X.4TB r2 = r4.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r2.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0J(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r5.length     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean[] r2 = new boolean[r2]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0Z(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NA r3 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rq r7 = r3.A08     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TB r2 = r4.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r4 = r2.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r3.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r25 = 4
            r23 = r0
            r24 = r7
            r26 = r4
            r28 = r2
            r30 = r4
            r32 = r9
            X.5NA r2 = r23.A06(r24, r25, r26, r28, r30, r32)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0C = r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x01fd:
            boolean r2 = r0.A0J     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x0208
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r3 = r2.A0F     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = 2
            if (r3 == 0) goto L_0x0209
        L_0x0208:
            r2 = 0
        L_0x0209:
            r0.A0F(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r0.A0O     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0235
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r3 = r2.A0F     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r0.A0r     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x0235
            X.4TC r2 = r6.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0235
            X.4TH r2 = r2.A08     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2.Efw(r3)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0235
        L_0x0222:
            java.lang.Object r3 = r5.obj     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TH r3 = (X.AnonymousClass4TH) r3     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NE r2 = r0.A0c     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TC r4 = r2.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r4 == 0) goto L_0x0f67
            X.4TH r2 = r4.A08     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != r3) goto L_0x0f67
            long r2 = r0.A07     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r4.A07(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0235:
            r0.A08()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x023a:
            int r4 = r5.arg1     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A02 = r4     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NE r3 = r0.A0c     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            com.google.android.exoplayer2.Timeline r2 = r2.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r3.A01 = r4     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = X.AnonymousClass5NE.A04(r3, r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x040e
            goto L_0x040b
        L_0x024e:
            int r2 = r5.arg1     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r4 = 0
            if (r2 == 0) goto L_0x0254
            r4 = 1
        L_0x0254:
            r0.A0T = r4     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NE r3 = r0.A0c     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            com.google.android.exoplayer2.Timeline r2 = r2.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r3.A08 = r4     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = X.AnonymousClass5NE.A04(r3, r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x040e
            goto L_0x040b
        L_0x0266:
            int r2 = r5.arg1     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r3 = 0
            if (r2 == 0) goto L_0x026c
            r3 = 1
        L_0x026c:
            java.lang.Object r7 = r5.obj     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.util.concurrent.atomic.AtomicBoolean r7 = (java.util.concurrent.atomic.AtomicBoolean) r7     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r0.A0I     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == r3) goto L_0x0295
            r0.A0I = r3     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r3 != 0) goto L_0x0295
            X.4PL[] r6 = r0.A12     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r5 = r6.length     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r4 = 0
        L_0x027c:
            if (r4 >= r5) goto L_0x0295
            r3 = r6[r4]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = r3
            X.4PK r2 = (X.AnonymousClass4PK) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r2.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x0292
            java.util.Set r2 = r0.A0n     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r2.remove(r3)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0292
            r3.reset()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0292:
            int r4 = r4 + 1
            goto L_0x027c
        L_0x0295:
            if (r7 == 0) goto L_0x0f67
            monitor-enter(r0)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r7.set(r1)     // Catch:{ all -> 0x02a1 }
            r0.notifyAll()     // Catch:{ all -> 0x02a1 }
            monitor-exit(r0)     // Catch:{ all -> 0x02a1 }
            goto L_0x0f67
        L_0x02a1:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x02a1 }
            goto L_0x0dc0
        L_0x02a5:
            java.lang.Object r4 = r5.obj     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4SA r4 = (X.AnonymousClass4SA) r4     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r4.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x02b9
            r0.A0M(r4)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x02b9:
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            com.google.android.exoplayer2.Timeline r13 = r2.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r13.A02()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x02cf
            java.util.ArrayList r3 = r0.A0m     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5No r2 = new X.5No     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2.<init>(r4)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r3.add(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x02cf:
            X.5No r10 = new X.5No     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r10.<init>(r4)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r15 = r0.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r0.A0T     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4RE r12 = r0.A0f     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rc r11 = r0.A0e     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r14 = r13
            r16 = r2
            boolean r2 = A0d(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x02ef
            java.util.ArrayList r2 = r0.A0m     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2.add(r10)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.util.Collections.sort(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x02ef:
            r4.A03(r9)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x02f4:
            java.lang.Object r6 = r5.obj     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4SA r6 = (X.AnonymousClass4SA) r6     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            android.os.Looper r5 = r6.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.lang.Thread r2 = r5.getThread()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r2.isAlive()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x0310
            java.lang.String r3 = "TAG"
            java.lang.String r2 = "Trying to send message on a dead thread."
            X.2AG.A04(r3, r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r6.A03(r9)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x0310:
            r4 = 0
            java.util.List r2 = X.AnonymousClass4S5.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            android.os.Handler r3 = new android.os.Handler     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r3.<init>(r5, r4)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.WmU r2 = new X.WmU     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2.<init>(r0, r6)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r3.post(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x0322:
            java.lang.Object r3 = r5.obj     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4P7 r3 = (X.AnonymousClass4P7) r3     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            float r2 = r3.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0L(r3, r2, r1, r9)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x032d:
            java.lang.Object r7 = r5.obj     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NU r7 = (X.AnonymousClass5NU) r7     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5ND r2 = r0.A0A     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2.A00(r1)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r6 = r7.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = -1
            if (r6 == r2) goto L_0x034d
            java.util.List r3 = r7.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5N7 r2 = r7.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TA r5 = new X.4TA     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r5.<init>(r2, r3)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r7.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5Np r4 = new X.5Np     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r4.<init>(r5, r6, r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0B = r4     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x034d:
            X.5NF r6 = r0.A0d     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.util.List r5 = r7.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5N7 r4 = r7.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.util.List r3 = r6.A08     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r3.size()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.AnonymousClass5NF.A03(r6, r9, r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r3.size()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            com.google.android.exoplayer2.Timeline r2 = r6.A05(r4, r5, r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0T(r2, r9)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x0369:
            java.lang.Object r6 = r5.obj     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NU r6 = (X.AnonymousClass5NU) r6     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r5 = r5.arg1     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5ND r2 = r0.A0A     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2.A00(r1)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NF r4 = r0.A0d     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = -1
            if (r5 != r2) goto L_0x037f
            java.util.List r2 = r4.A08     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r5 = r2.size()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x037f:
            java.util.List r3 = r6.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5N7 r2 = r6.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            com.google.android.exoplayer2.Timeline r2 = r4.A05(r2, r3, r5)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0T(r2, r9)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x038c:
            int r7 = r5.arg1     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r6 = r5.arg2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.lang.Object r5 = r5.obj     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5N7 r5 = (X.AnonymousClass5N7) r5     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5ND r2 = r0.A0A     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2.A00(r1)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NF r4 = r0.A0d     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r7 < 0) goto L_0x03a8
            if (r7 > r6) goto L_0x03a8
            java.util.List r2 = r4.A08     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r3 = r2.size()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = 1
            if (r6 <= r3) goto L_0x03a9
        L_0x03a8:
            r2 = 0
        L_0x03a9:
            X.C256703wD.A03(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r4.A00 = r5     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.AnonymousClass5NF.A03(r4, r7, r6)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            com.google.android.exoplayer2.Timeline r2 = r4.A04()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0T(r2, r9)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x03ba:
            java.lang.Object r4 = r5.obj     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5N7 r4 = (X.AnonymousClass5N7) r4     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5ND r2 = r0.A0A     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2.A00(r1)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NF r6 = r0.A0d     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.util.List r2 = r6.A08     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r5 = r2.size()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r3 = r4
            X.5N6 r3 = (X.AnonymousClass5N6) r3     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int[] r2 = r3.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r2.length     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == r5) goto L_0x03e9
            java.util.Random r2 = r3.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r2.nextLong()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.util.Random r4 = new java.util.Random     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r4.<init>(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int[] r3 = new int[r9]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5N6 r2 = new X.5N6     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2.<init>(r4, r3)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5N6 r4 = r2.AHz(r9, r5)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x03e9:
            r6.A00 = r4     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            com.google.android.exoplayer2.Timeline r2 = r6.A04()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0T(r2, r9)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x03f4:
            int r3 = r5.arg1     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = 0
            if (r3 == 0) goto L_0x03fa
            r2 = 1
        L_0x03fa:
            r0.A0M = r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0A()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r0.A0N     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0f67
            X.5NE r2 = r0.A0c     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TC r3 = r2.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TC r2 = r2.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r3 == r2) goto L_0x0f67
        L_0x040b:
            r0.A0W(r1)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x040e:
            r0.A0V(r9)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x0413:
            int r2 = r5.arg1     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r3 = 0
            if (r2 != r1) goto L_0x0419
            r3 = 1
        L_0x0419:
            boolean r2 = r0.A0L     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r3 == r2) goto L_0x0f67
            r0.A0L = r3     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r3 != 0) goto L_0x0f67
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r2.A0G     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0f67
            X.4S6 r2 = r0.A0k     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r3 = 2
            X.4S5 r2 = (X.AnonymousClass4S5) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            android.os.Handler r2 = r2.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2.sendEmptyMessage(r3)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x0433:
            java.lang.Object r7 = r5.obj     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5f7 r7 = (X.C290315f7) r7     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5ND r2 = r0.A0A     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r12 = 1
            r2.A00(r1)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r5 = r7.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            com.google.android.exoplayer2.Timeline r3 = r2.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rc r2 = r0.A0e     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            android.util.Pair r8 = A03(r7, r2, r3)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 != 0) goto L_0x0478
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            com.google.android.exoplayer2.Timeline r2 = r2.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            android.util.Pair r2 = r0.A05(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.lang.Object r4 = r2.first     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rq r4 = (X.C264874Rq) r4     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.lang.Object r2 = r2.second     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r2.longValue()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NA r5 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            com.google.android.exoplayer2.Timeline r5 = r5.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r6 = r5.A02()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r5 = 0
            if (r6 != 0) goto L_0x0470
            r5 = 1
        L_0x0470:
            r32 = r5 ^ 1
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x049d
        L_0x0478:
            java.lang.Object r3 = r8.first     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rq r2 = r2.A08     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rq r4 = r2.A00(r3)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.lang.Object r2 = r8.second     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r2.longValue()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x0494
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0495
        L_0x0494:
            r15 = r2
        L_0x0495:
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            r32 = 0
            if (r8 != 0) goto L_0x049d
            r32 = 1
        L_0x049d:
            X.5NA r6 = r0.A0C     // Catch:{ all -> 0x053e }
            com.google.android.exoplayer2.Timeline r5 = r6.A06     // Catch:{ all -> 0x053e }
            int r5 = r5.A02()     // Catch:{ all -> 0x053e }
            if (r5 != 0) goto L_0x04ad
            r5 = 0
            r0.A0B = r5     // Catch:{ all -> 0x053e }
            r0.A09 = r7     // Catch:{ all -> 0x053e }
            goto L_0x0527
        L_0x04ad:
            X.4Rq r5 = r6.A08     // Catch:{ all -> 0x053e }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x053e }
            if (r5 == 0) goto L_0x04ee
            X.5NE r5 = r0.A0c     // Catch:{ all -> 0x053e }
            X.4TC r8 = r5.A05     // Catch:{ all -> 0x053e }
            if (r8 == 0) goto L_0x04c6
            boolean r5 = r8.A07     // Catch:{ all -> 0x053e }
            if (r5 == 0) goto L_0x04c6
            r6 = 0
            int r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x04c6
            goto L_0x04c9
        L_0x04c6:
            r25 = r2
            goto L_0x04d1
        L_0x04c9:
            X.4TH r6 = r8.A08     // Catch:{ all -> 0x053e }
            X.4P6 r5 = r0.A0E     // Catch:{ all -> 0x053e }
            long r25 = r6.AZp(r5, r2)     // Catch:{ all -> 0x053e }
        L_0x04d1:
            long r10 = com.google.android.exoplayer2.util.Util.A08(r25)     // Catch:{ all -> 0x053e }
            X.5NA r5 = r0.A0C     // Catch:{ all -> 0x053e }
            long r5 = r5.A0I     // Catch:{ all -> 0x053e }
            long r6 = com.google.android.exoplayer2.util.Util.A08(r5)     // Catch:{ all -> 0x053e }
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x04f0
            X.5NA r7 = r0.A0C     // Catch:{ all -> 0x053e }
            int r6 = r7.A00     // Catch:{ all -> 0x053e }
            r5 = 2
            if (r6 == r5) goto L_0x04eb
            r5 = 3
            if (r6 != r5) goto L_0x04f0
        L_0x04eb:
            long r2 = r7.A0I     // Catch:{ all -> 0x053e }
            goto L_0x0527
        L_0x04ee:
            r25 = r2
        L_0x04f0:
            X.5NA r5 = r0.A0C     // Catch:{ all -> 0x053e }
            int r6 = r5.A00     // Catch:{ all -> 0x053e }
            r5 = 4
            r28 = 0
            if (r6 != r5) goto L_0x04fb
            r28 = 1
        L_0x04fb:
            X.5NE r5 = r0.A0c     // Catch:{ all -> 0x053e }
            X.4TC r6 = r5.A05     // Catch:{ all -> 0x053e }
            X.4TC r5 = r5.A06     // Catch:{ all -> 0x053e }
            r27 = 0
            if (r6 == r5) goto L_0x0507
            r27 = 1
        L_0x0507:
            r23 = r0
            r24 = r4
            long r6 = r23.A02(r24, r25, r27, r28)     // Catch:{ all -> 0x053e }
            int r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x0514
            r12 = 0
        L_0x0514:
            r32 = r32 | r12
            X.5NA r2 = r0.A0C     // Catch:{ all -> 0x053b }
            com.google.android.exoplayer2.Timeline r3 = r2.A06     // Catch:{ all -> 0x053b }
            X.4Rq r2 = r2.A08     // Catch:{ all -> 0x053b }
            r10 = r0
            r11 = r3
            r12 = r3
            r13 = r4
            r14 = r2
            r17 = r1
            r10.A0S(r11, r12, r13, r14, r15, r17)     // Catch:{ all -> 0x053b }
            r2 = r6
        L_0x0527:
            r25 = 2
            r23 = r0
            r24 = r4
            r26 = r2
            r30 = r2
            r28 = r15
            X.5NA r2 = r23.A06(r24, r25, r26, r28, r30, r32)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0C = r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x053b:
            r5 = move-exception
            r2 = r6
            goto L_0x053f
        L_0x053e:
            r5 = move-exception
        L_0x053f:
            r25 = 2
            r23 = r0
            r24 = r4
            r26 = r2
            r30 = r2
            r28 = r15
            X.5NA r2 = r23.A06(r24, r25, r26, r28, r30, r32)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0C = r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0dc0
        L_0x0553:
            java.lang.Object r4 = r5.obj     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NU r4 = (X.AnonymousClass5NU) r4     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5ND r2 = r0.A0A     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2.A00(r1)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r7 = r4.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = -1
            if (r7 == r2) goto L_0x0578
            boolean r2 = r0.A0q     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x058a
            X.2BQ r2 = X.2BQ.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = X.2BY.A02(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0585
            X.4Rq r6 = X.AnonymousClass5NA.A0K     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x056f:
            long r2 = r4.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5f7 r5 = new X.5f7     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r5.<init>(r6, r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A09 = r5     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0578:
            long r2 = r4.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r2 = 0
            if (r5 != 0) goto L_0x059e
            goto L_0x059d
        L_0x0585:
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rq r6 = r2.A08     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x056f
        L_0x058a:
            java.util.List r3 = r4.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5N7 r2 = r4.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TA r6 = new X.4TA     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r6.<init>(r2, r3)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r4.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5Np r5 = new X.5Np     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r5.<init>(r6, r7, r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0B = r5     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0578
        L_0x059d:
            r2 = 1
        L_0x059e:
            r0.A0Y(r9, r2, r1, r1)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4QZ r2 = r0.A0b     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2.DYy()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r5 = 2
            r0.A0H(r5)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NF r7 = r0.A0d     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.util.List r6 = r4.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5N7 r4 = r4.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.util.List r3 = r7.A08     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r3.size()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.AnonymousClass5NF.A03(r7, r9, r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r3.size()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            com.google.android.exoplayer2.Timeline r2 = r7.A05(r4, r6, r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0T(r2, r9)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.28n r2 = r0.A0i     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.3m7 r2 = r2.C9P()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r7.A06(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4S6 r2 = r0.A0k     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4S5 r2 = (X.AnonymousClass4S5) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            android.os.Handler r2 = r2.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2.sendEmptyMessage(r5)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x05d8:
            int r2 = r5.arg1     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r4 = 0
            if (r2 == 0) goto L_0x05de
            r4 = 1
        L_0x05de:
            int r3 = r5.arg2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = 7
            r0.A0I(r3, r2, r4, r1)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x05e6:
            X.5ND r2 = r0.A0A     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2.A00(r1)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0Y(r9, r9, r9, r1)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4QZ r2 = r0.A0b     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2.DYy()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            com.google.android.exoplayer2.Timeline r2 = r2.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r2.A02()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x05ff
            r2 = 4
            goto L_0x0600
        L_0x05ff:
            r2 = 2
        L_0x0600:
            r0.A0H(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NF r3 = r0.A0d     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.28n r2 = r0.A0i     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.3m7 r2 = r2.C9P()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r3.A06(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4S6 r2 = r0.A0k     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r3 = 2
            X.4S5 r2 = (X.AnonymousClass4S5) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            android.os.Handler r2 = r2.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2.sendEmptyMessage(r3)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x061a:
            long r17 = android.os.SystemClock.uptimeMillis()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4S6 r2 = r0.A0k     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r20 = 2
            X.4S5 r2 = (X.AnonymousClass4S5) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            android.os.Handler r2 = r2.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r52 = r2
            r3 = r2
            r2 = r20
            r3.removeMessages(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            com.google.android.exoplayer2.Timeline r2 = r2.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r2.A02()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0955
            X.5NF r10 = r0.A0d     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r10.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0955
            X.5NE r8 = r0.A0c     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r0.A07     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TC r4 = r8.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r4 == 0) goto L_0x0649
            r4.A07(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0649:
            X.4TC r5 = r8.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r5 == 0) goto L_0x066e
            X.4TB r2 = r5.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r2.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x0718
            boolean r2 = r5.A09()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0718
            X.4TC r5 = r8.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TB r2 = r5.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r2.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0718
            int r3 = r8.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r8.A09     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r3 >= r2) goto L_0x0718
        L_0x066e:
            long r2 = r0.A07     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NA r4 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r5 != 0) goto L_0x06b2
            com.google.android.exoplayer2.Timeline r12 = r4.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rq r2 = r4.A08     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r6 = r4.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r4 = r4.A0I     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.lang.Object r11 = r2.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rc r3 = r8.A0A     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r12.A0B(r3, r11)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r13 = r2.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r3 = -1
            if (r13 == r3) goto L_0x069f
            int r4 = r2.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r2.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r23 = r8
            r24 = r12
            r25 = r11
            r26 = r13
            r27 = r4
            r28 = r6
            r30 = r2
            X.4TB r12 = X.AnonymousClass5NE.A01(r23, r24, r25, r26, r27, r28, r30)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x06b8
        L_0x069f:
            long r2 = r2.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r23 = r8
            r24 = r12
            r25 = r11
            r26 = r4
            r28 = r6
            r30 = r2
            X.4TB r12 = X.AnonymousClass5NE.A02(r23, r24, r25, r26, r28, r30)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x06b8
        L_0x06b2:
            com.google.android.exoplayer2.Timeline r4 = r4.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TB r12 = X.AnonymousClass5NE.A00(r5, r8, r4, r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x06b8:
            if (r12 == 0) goto L_0x0718
            X.4PN[] r11 = r0.A13     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Qq r7 = r0.A0g     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4QZ r2 = r0.A0b     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4QW r28 = r2.Ab1()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rb r6 = r0.A0h     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r4 = r0.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TC r2 = r8.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x06d6
            long r4 = r2.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TB r2 = r2.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r2.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r4 = r4 + r2
            long r2 = r12.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r4 = r4 - r2
        L_0x06d6:
            X.4TC r13 = new X.4TC     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r23 = r13
            r24 = r12
            r25 = r10
            r26 = r7
            r27 = r6
            r29 = r11
            r30 = r4
            r23.<init>((X.AnonymousClass4TB) r24, (X.AnonymousClass5NF) r25, (X.C264634Qq) r26, (X.C264734Rb) r27, (X.AnonymousClass4QW) r28, (X.AnonymousClass4PN[]) r29, (long) r30)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TC r3 = r8.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r3 == 0) goto L_0x0740
            X.4TC r2 = r3.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r13 == r2) goto L_0x06f3
            r3.A01 = r13     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x06f3:
            r2 = 0
            r8.A07 = r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r8.A04 = r13     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r8.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r2 + 1
            r8.A00 = r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.AnonymousClass5NE.A03(r8)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TH r4 = r13.A08     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r12.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r4.E3p(r0, r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TC r4 = r8.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r4 != r13) goto L_0x070f
            r0.A0J(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x070f:
            boolean r2 = r0.A0t     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0715
            r0.A0R = r1     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0715:
            r0.A0V(r9)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0718:
            boolean r2 = r0.A0R     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x073c
            boolean r2 = r0.A0a()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0R = r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0D()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0725:
            X.4TC r6 = r8.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r6 == 0) goto L_0x07d1
            X.4TC r10 = r6.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r28 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11 = 0
            if (r10 == 0) goto L_0x0780
            boolean r2 = r0.A0N     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x0780
            boolean r2 = r6.A07     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x07d1
            goto L_0x0745
        L_0x073c:
            r0.A08()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0725
        L_0x0740:
            r8.A05 = r13     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r8.A06 = r13     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x06f3
        L_0x0745:
            r13 = 0
        L_0x0746:
            X.4PL[] r7 = r0.A12     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r14 = r7.length     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r13 >= r14) goto L_0x07c0
            r4 = r7[r13]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TD[] r2 = r6.A0B     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r3 = r2[r13]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = r4
            X.4PK r2 = (X.AnonymousClass4PK) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TD r2 = r2.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != r3) goto L_0x07d1
            if (r3 == 0) goto L_0x077d
            boolean r2 = r4.CKV()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x077d
            X.4TB r2 = r6.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r2.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x07d1
            boolean r2 = r10.A07     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x07d1
            boolean r2 = r4 instanceof X.AnonymousClass4QM     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x077d
            X.4PK r4 = (X.AnonymousClass4PK) r4     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r11 = r4.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TB r2 = r10.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r4 = r2.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r10.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r4 = r4 + r2
            int r2 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x07d1
        L_0x077d:
            int r13 = r13 + 1
            goto L_0x0746
        L_0x0780:
            X.4TB r10 = r6.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r10.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x078a
            boolean r2 = r0.A0N     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x07d1
        L_0x078a:
            X.4PL[] r3 = r0.A12     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r3.length     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r11 >= r2) goto L_0x07d1
            r7 = r3[r11]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TD[] r2 = r6.A0B     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r3 = r2[r11]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r3 == 0) goto L_0x07bd
            r2 = r7
            X.4PK r2 = (X.AnonymousClass4PK) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TD r2 = r2.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != r3) goto L_0x07bd
            boolean r2 = r7.CKV()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x07bd
            long r4 = r10.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r2 == 0) goto L_0x07b1
            r12 = -9223372036854775808
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x07b1
            goto L_0x07b7
        L_0x07b1:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x07ba
        L_0x07b7:
            long r2 = r6.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r2 + r4
        L_0x07ba:
            A0Q(r7, r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x07bd:
            int r11 = r11 + 1
            goto L_0x078a
        L_0x07c0:
            boolean r2 = r10.A07     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x0847
            long r11 = r0.A07     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TB r2 = r10.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r2.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r4 = r10.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r2 + r4
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0847
        L_0x07d1:
            X.4TC r12 = r8.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r12 == 0) goto L_0x08d6
            X.4TC r2 = r8.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == r12) goto L_0x08d6
            boolean r2 = r12.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x08d6
            X.4Rb r11 = r12.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r10 = 0
            r14 = 0
        L_0x07e1:
            X.4PL[] r2 = r0.A12     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r3 = r2.length     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r10 >= r3) goto L_0x08cd
            r7 = r2[r10]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = r7
            X.4PK r2 = (X.AnonymousClass4PK) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r2.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0804
            r4 = r7
            X.4PK r4 = (X.AnonymousClass4PK) r4     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TD r3 = r4.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TD[] r5 = r12.A0B     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = r5[r10]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r6 = 0
            if (r3 == r2) goto L_0x07fc
            r6 = 1
        L_0x07fc:
            X.4RW[] r2 = r11.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = r2[r10]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0807
            if (r6 != 0) goto L_0x0807
        L_0x0804:
            int r10 = r10 + 1
            goto L_0x07e1
        L_0x0807:
            boolean r2 = r4.A07     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x083b
            X.4RX[] r2 = r11.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r4 = r2[r10]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r3 = 0
            if (r4 == 0) goto L_0x0819
            int r2 = r4.length()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0816:
            X.3wB[] r6 = new X.C256683wB[r2]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x081b
        L_0x0819:
            r2 = 0
            goto L_0x0816
        L_0x081b:
            if (r3 >= r2) goto L_0x0826
            X.3wB r13 = r4.B7Q(r3)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r6[r3] = r13     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r3 = r3 + 1
            goto L_0x081b
        L_0x0826:
            r24 = r5[r10]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TB r2 = r12.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r4 = r2.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r12.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r4 = r4 + r2
            r23 = r7
            r25 = r6
            r26 = r4
            r28 = r2
            r23.EFN(r24, r25, r26, r28)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0804
        L_0x083b:
            boolean r2 = r7.CSi()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0845
            r0.A0O(r7)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0804
        L_0x0845:
            r14 = 1
            goto L_0x0804
        L_0x0847:
            X.4Rb r11 = r6.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r8.A06 = r10     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.AnonymousClass5NE.A03(r8)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TC r10 = r8.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rb r12 = r10.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            com.google.android.exoplayer2.Timeline r3 = r2.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TB r2 = r10.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rq r2 = r2.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TB r4 = r6.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rq r4 = r4.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r23 = r0
            r24 = r3
            r25 = r3
            r26 = r2
            r27 = r4
            r30 = r9
            r23.A0S(r24, r25, r26, r27, r28, r30)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r10.A07     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0894
            X.4TH r2 = r10.A08     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r3 = r2.E6K()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = (r3 > r28 ? 1 : (r3 == r28 ? 0 : -1))
            if (r2 == 0) goto L_0x0894
            X.4TB r2 = r10.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r2.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r4 = r10.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r2 + r4
            r6 = 0
        L_0x0883:
            if (r6 >= r14) goto L_0x07d1
            r5 = r7[r6]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r4 = r5
            X.4PK r4 = (X.AnonymousClass4PK) r4     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TD r4 = r4.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r4 == 0) goto L_0x0891
            A0Q(r5, r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0891:
            int r6 = r6 + 1
            goto L_0x0883
        L_0x0894:
            r13 = 0
        L_0x0895:
            if (r13 >= r14) goto L_0x07d1
            X.4RW[] r3 = r11.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = r3[r13]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r6 = 0
            if (r2 == 0) goto L_0x089f
            r6 = 1
        L_0x089f:
            X.4RW[] r4 = r12.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = r4[r13]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r5 = 0
            if (r2 == 0) goto L_0x08a7
            r5 = 1
        L_0x08a7:
            if (r6 == 0) goto L_0x08ca
            r2 = r7[r13]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4PK r2 = (X.AnonymousClass4PK) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r2.A07     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x08ca
            r3 = r3[r13]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = r4[r13]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r5 == 0) goto L_0x08be
            boolean r2 = r2.equals(r3)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x08be
            goto L_0x08ca
        L_0x08be:
            r6 = r7[r13]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TB r2 = r10.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r4 = r2.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r10.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r4 = r4 + r2
            A0Q(r6, r4)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x08ca:
            int r13 = r13 + 1
            goto L_0x0895
        L_0x08cd:
            r2 = r14 ^ 1
            if (r2 == 0) goto L_0x08d6
            boolean[] r2 = new boolean[r3]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0Z(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x08d6:
            r11 = 0
        L_0x08d7:
            boolean r2 = r0.A0c()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0955
            boolean r2 = r0.A0N     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x0955
            X.4TC r2 = r8.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0955
            X.4TC r10 = r2.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r10 == 0) goto L_0x0955
            long r6 = r0.A07     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TB r2 = r10.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r4 = r2.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r10.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r4 = r4 + r2
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x0955
            boolean r2 = r10.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0955
            if (r11 == 0) goto L_0x08ff
            r0.A09()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x08ff:
            X.4TC r5 = r8.A06()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r5.getClass()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rq r2 = r2.A08     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.lang.Object r3 = r2.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TB r2 = r5.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rq r2 = r2.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.lang.Object r2 = r2.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r3.equals(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0930
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rq r6 = r2.A08     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r6.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r3 = -1
            if (r2 != r3) goto L_0x0930
            X.4TB r2 = r5.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rq r4 = r2.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r4.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != r3) goto L_0x0930
            int r3 = r6.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r4.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r7 = 1
            if (r3 != r2) goto L_0x0931
        L_0x0930:
            r7 = 0
        L_0x0931:
            X.4TB r2 = r5.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rq r6 = r2.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r4 = r2.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r2.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r32 = r7 ^ 1
            r25 = 5
            r23 = r0
            r24 = r6
            r26 = r4
            r28 = r2
            r30 = r4
            X.5NA r2 = r23.A06(r24, r25, r26, r28, r30, r32)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0C = r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0A()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0E()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r11 = 1
            goto L_0x08d7
        L_0x0955:
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r3 = r2.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r3 == r1) goto L_0x0f67
            r24 = 4
            r2 = r24
            if (r3 == r2) goto L_0x0f67
            X.5NE r8 = r0.A0c     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TC r10 = r8.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TC r11 = r8.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r10 != 0) goto L_0x0978
            r2 = 10
            long r17 = r17 + r2
            r5 = r52
            r4 = r20
            r2 = r17
            r5.sendEmptyMessageAtTime(r4, r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x0978:
            java.lang.String r2 = "doSomeWork"
            X.27d.A01(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0E()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r4 = r10.A07     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = 1000(0x3e8, double:4.94E-321)
            if (r4 == 0) goto L_0x0a43
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r4 = r4 * r2
            X.4TH r12 = r10.A08     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r2.A0I     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r6 = r0.A0W     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r2 - r6
            boolean r6 = r0.A10     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r12.APR(r2, r6)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r7 = 0
            r14 = 1
            r13 = 1
            r15 = 1
            r23 = 0
        L_0x099f:
            X.4PL[] r12 = r0.A12     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r6 = r12.length     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r7 >= r6) goto L_0x0a20
            r6 = r12[r7]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = r6
            X.4PK r2 = (X.AnonymousClass4PK) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r2.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0a1d
            long r2 = r0.A07     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r6.EEq(r2, r4)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r0.A11     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x09cd
            if (r11 == 0) goto L_0x09cd
            X.4TB r2 = r11.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r2.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x09cd
            boolean r2 = r6.CKV()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x09cd
            int r2 = r0.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x09cd
            r2 = r6
            X.4PK r2 = (X.AnonymousClass4PK) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2.A07 = r1     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x09cd:
            if (r14 == 0) goto L_0x09d6
            boolean r2 = r6.CSi()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r14 = 1
            if (r2 != 0) goto L_0x09d7
        L_0x09d6:
            r14 = 0
        L_0x09d7:
            boolean r2 = r6 instanceof X.AnonymousClass4QM     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x09e5
            if (r13 == 0) goto L_0x09e4
            boolean r2 = r6.CSi()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r13 = 1
            if (r2 != 0) goto L_0x09e5
        L_0x09e4:
            r13 = 0
        L_0x09e5:
            X.4TD[] r2 = r10.A0B     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r3 = r2[r7]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = r6
            X.4PK r2 = (X.AnonymousClass4PK) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TD r2 = r2.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r3 != r2) goto L_0x0a03
            boolean r2 = r6.CKV()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x0a03
            boolean r2 = r6.CaO()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x0a03
            boolean r3 = r6.CSi()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = 0
            if (r3 == 0) goto L_0x0a04
        L_0x0a03:
            r2 = 1
        L_0x0a04:
            if (r15 == 0) goto L_0x0a09
            r15 = 1
            if (r2 != 0) goto L_0x0a18
        L_0x0a09:
            r15 = 0
            if (r2 != 0) goto L_0x0a18
            boolean r2 = r0.A0u     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0a14
            r0.A0P(r6)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0a1b
        L_0x0a14:
            r6.Cnm()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0a1d
        L_0x0a18:
            r0.A0D = r6     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0a1d
        L_0x0a1b:
            r23 = 1
        L_0x0a1d:
            int r7 = r7 + 1
            goto L_0x099f
        L_0x0a20:
            if (r13 == 0) goto L_0x0a4c
            if (r14 != 0) goto L_0x0a4c
            r5 = 0
        L_0x0a25:
            if (r5 >= r6) goto L_0x0a4c
            r4 = r12[r5]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = r4
            X.4PK r2 = (X.AnonymousClass4PK) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r2.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0a40
            boolean r2 = r4 instanceof X.AnonymousClass4QM     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0a40
            r2 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            r4.EEq(r2, r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r14 = r4.CSi()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0a40:
            int r5 = r5 + 1
            goto L_0x0a25
        L_0x0a43:
            X.4TH r2 = r10.A08     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2.Cnk()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r14 = 1
            r15 = 1
            r23 = 0
        L_0x0a4c:
            X.4TB r2 = r10.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r6 = r2.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 == 0) goto L_0x0a77
            boolean r2 = r10.A07     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0a77
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0a67
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r2.A0I     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r11 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r11 > 0) goto L_0x0a77
        L_0x0a67:
            r6 = 1
            boolean r2 = r0.A0N     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0a78
            r0.A0N = r9     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r3 = r2.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = 5
            r0.A0I(r3, r2, r9, r9)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0a78
        L_0x0a77:
            r6 = 0
        L_0x0a78:
            r25 = 3
            if (r6 == 0) goto L_0x0a8c
            X.4TB r2 = r10.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r2.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0a8c
            r2 = r24
            r0.A0H(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0C()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0c00
        L_0x0a8c:
            X.5NA r3 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r6 = r3.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = r20
            if (r6 != r2) goto L_0x0bd3
            int r2 = r0.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x0b1e
            boolean r2 = r0.A0b()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0bd3
        L_0x0a9e:
            X.4PL r2 = r0.A0D     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0b1b
            X.4PK r2 = (X.AnonymousClass4PK) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r2.A0B     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r51 = 1
            if (r2 != r1) goto L_0x0b1b
        L_0x0aaa:
            java.lang.Integer r2 = r0.A0F     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r34 = r2
            X.5NA r8 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r3 = r8.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = r25
            if (r3 == r2) goto L_0x0b0b
            r0.A06 = r4     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = -1
            r0.A03 = r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            com.google.android.exoplayer2.Timeline r2 = r8.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r29 = r2
            X.4Rq r2 = r8.A08     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r30 = r2
            long r15 = r8.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r13 = r8.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.48u r2 = r8.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r27 = r2
            boolean r2 = r8.A0E     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r48 = r2
            X.4Rn r2 = r8.A09     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r32 = r2
            X.4Rb r2 = r8.A0A     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r33 = r2
            java.util.List r2 = r8.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r35 = r2
            X.4Rq r2 = r8.A07     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r31 = r2
            boolean r2 = r8.A0F     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r49 = r2
            int r2 = r8.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r37 = r2
            X.4P7 r2 = r8.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r28 = r2
            long r11 = r8.A0H     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r6 = r8.A0J     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r8.A0I     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r8 = r8.A0G     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r50 = r8
            X.5NA r8 = new X.5NA     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r26 = r8
            r36 = r25
            r38 = r15
            r40 = r13
            r42 = r11
            r44 = r6
            r46 = r2
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r42, r44, r46, r48, r49, r50, r51)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0C = r8     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0b0b:
            r3 = 0
            r0.A08 = r3     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r0.A0c()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0b17
            r0.A0B()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0b17:
            r0.A0D = r3     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0c00
        L_0x0b1b:
            r51 = 0
            goto L_0x0aaa
        L_0x0b1e:
            if (r15 != 0) goto L_0x0b22
            goto L_0x0bc9
        L_0x0b22:
            boolean r2 = r3.A0E     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0a9e
            boolean r2 = r0.A0z     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0b4e
            com.google.android.exoplayer2.Timeline r3 = r3.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TC r2 = r8.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TB r2 = r2.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rq r2 = r2.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r0.A0e(r3, r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0b4e
            X.5Ms r2 = r0.A0a     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r30 = r2.C4N()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0b3e:
            X.4TC r8 = r8.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r8.A09()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0b54
            X.4TB r2 = r8.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r2.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r14 = 1
            if (r2 != 0) goto L_0x0b55
            goto L_0x0b54
        L_0x0b4e:
            r30 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0b3e
        L_0x0b54:
            r14 = 0
        L_0x0b55:
            X.4TB r2 = r8.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rq r2 = r2.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r3 = r2.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = -1
            if (r3 == r2) goto L_0x0b63
            boolean r2 = r8.A07     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r13 = 1
            if (r2 == 0) goto L_0x0b64
        L_0x0b63:
            r13 = 0
        L_0x0b64:
            java.lang.System.currentTimeMillis()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r6 = r0.A0V     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r6 <= 0) goto L_0x0b7f
            long r2 = r0.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r11 = 0
            int r7 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x0b7f
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r11 = r11 - r2
            long r2 = (long) r6     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r6 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            r33 = 1
            if (r6 < 0) goto L_0x0b81
        L_0x0b7f:
            r33 = 0
        L_0x0b81:
            boolean r2 = r0.A0s     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x0b9f
            boolean r2 = r0.A0y     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x0b9f
            boolean r2 = r0.A0v     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0b96
            long r2 = r8.A00()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r28 = r0.A00(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0baa
        L_0x0b96:
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r2.A0H     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r28 = r0.A00(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0baa
        L_0x0b9f:
            long r2 = r0.A07     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r6 = r8.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r2 - r6
            X.4TH r6 = r8.A08     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r28 = r6.AiS(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0baa:
            if (r14 != 0) goto L_0x0a9e
            if (r13 != 0) goto L_0x0a9e
            X.4QZ r6 = r0.A0b     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4S3 r2 = r0.A0Z     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4P7 r2 = r2.BdA()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            float r3 = r2.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r0.A0K     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r26 = r6
            r27 = r3
            r32 = r2
            boolean r2 = r26.EtV(r27, r28, r30, r32, r33)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x0a9e
            java.lang.Integer r2 = X.AnonymousClass05K.A0u     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0bd1
        L_0x0bc9:
            X.4PL r2 = r0.A0D     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0bd3
            X.4PK r2 = (X.AnonymousClass4PK) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.lang.Integer r2 = r2.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0bd1:
            r0.A0F = r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0bd3:
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r3 = r2.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = r25
            if (r3 != r2) goto L_0x0c00
            int r2 = r0.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x0be6
            boolean r2 = r0.A0b()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0be8
            goto L_0x0c00
        L_0x0be6:
            if (r15 != 0) goto L_0x0c00
        L_0x0be8:
            boolean r2 = r0.A0c()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0K = r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4PL r2 = r0.A0D     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0bfc
            X.4PK r2 = (X.AnonymousClass4PK) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r2.A0B     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r8 = 1
            r51 = 1
            if (r2 == r1) goto L_0x0c02
            goto L_0x0bfd
        L_0x0bfc:
            r8 = 1
        L_0x0bfd:
            r51 = 0
            goto L_0x0c02
        L_0x0c00:
            r8 = 1
            goto L_0x0c72
        L_0x0c02:
            X.5NA r6 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r6.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r3 = r20
            if (r2 == r3) goto L_0x0c66
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A03 = r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            com.google.android.exoplayer2.Timeline r2 = r6.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r29 = r2
            X.4Rq r2 = r6.A08     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r30 = r2
            long r2 = r6.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r40 = r2
            long r15 = r6.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.48u r2 = r6.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r27 = r2
            boolean r2 = r6.A0E     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r48 = r2
            X.4Rn r2 = r6.A09     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r32 = r2
            X.4Rb r2 = r6.A0A     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r33 = r2
            java.util.List r2 = r6.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r35 = r2
            X.4Rq r2 = r6.A07     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r31 = r2
            boolean r2 = r6.A0F     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r49 = r2
            int r2 = r6.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r37 = r2
            X.4P7 r2 = r6.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r28 = r2
            long r13 = r6.A0H     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r11 = r6.A0J     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r6.A0I     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r7 = r6.A0G     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r50 = r7
            java.lang.Integer r6 = r6.A0B     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r7 = r6
            X.5NA r6 = new X.5NA     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r26 = r6
            r34 = r7
            r36 = r20
            r38 = r40
            r40 = r15
            r42 = r13
            r44 = r11
            r46 = r2
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r42, r44, r46, r48, r49, r50, r51)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0C = r6     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0c66:
            boolean r2 = r0.A0K     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0c6f
            X.5Ms r2 = r0.A0a     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2.CsE()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0c6f:
            r0.A0C()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0c72:
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r3 = r2.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = r20
            if (r3 != r2) goto L_0x0ccc
            r7 = 0
        L_0x0c7b:
            X.4PL[] r6 = r0.A12     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r6.length     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r7 >= r2) goto L_0x0ca7
            r2 = r6[r7]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4PK r2 = (X.AnonymousClass4PK) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r2.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0ca4
            r2 = r6[r7]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4PK r2 = (X.AnonymousClass4PK) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TD r3 = r2.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TD[] r2 = r10.A0B     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = r2[r7]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r3 != r2) goto L_0x0ca4
            boolean r2 = r0.A0u     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r3 = r6[r7]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0c9e
            r0.A0P(r3)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0ca2
        L_0x0c9e:
            r3.Cnm()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0ca4
        L_0x0ca2:
            r23 = 1
        L_0x0ca4:
            int r7 = r7 + 1
            goto L_0x0c7b
        L_0x0ca7:
            boolean r2 = r0.A0o     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x0ccc
            X.5NA r3 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r3.A0E     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x0ccc
            long r2 = r3.A0J     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r10 = 500000(0x7a120, double:2.47033E-318)
            int r6 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x0ccc
            boolean r2 = r0.A0a()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0ccc
            boolean r2 = r0.A0w     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0cca
            boolean r2 = r0.A0c()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0ccc
        L_0x0cca:
            r3 = 1
            goto L_0x0ccd
        L_0x0ccc:
            r3 = 0
        L_0x0ccd:
            boolean r2 = r0.A0o     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != 0) goto L_0x0ce2
            if (r3 != 0) goto L_0x0cd6
            r0.A06 = r4     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0ce2
        L_0x0cd6:
            long r6 = r0.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r10 != 0) goto L_0x0cf3
            r0.A06 = r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0ce2:
            boolean r2 = r0.A0c()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0cfc
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r3 = r2.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r16 = 1
            r2 = r25
            if (r3 == r2) goto L_0x0cfe
            goto L_0x0cfc
        L_0x0cf3:
            long r2 = r2 - r6
            r10 = 4000(0xfa0, double:1.9763E-320)
            int r6 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r6 < 0) goto L_0x0ce2
            goto L_0x0db9
        L_0x0cfc:
            r16 = 0
        L_0x0cfe:
            boolean r2 = r0.A0L     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0d09
            boolean r2 = r0.A0Q     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0d09
            if (r16 == 0) goto L_0x0d09
            goto L_0x0d0a
        L_0x0d09:
            r8 = 0
        L_0x0d0a:
            X.5NA r12 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r12.A0G     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == r8) goto L_0x0d6a
            com.google.android.exoplayer2.Timeline r2 = r12.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r29 = r2
            X.4Rq r2 = r12.A08     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r30 = r2
            long r2 = r12.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r40 = r2
            long r13 = r12.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r12.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r36 = r2
            X.48u r2 = r12.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r27 = r2
            boolean r2 = r12.A0E     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r48 = r2
            X.4Rn r2 = r12.A09     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r32 = r2
            X.4Rb r2 = r12.A0A     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r33 = r2
            java.util.List r2 = r12.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r35 = r2
            X.4Rq r2 = r12.A07     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r31 = r2
            boolean r2 = r12.A0F     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r49 = r2
            int r2 = r12.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r37 = r2
            X.4P7 r2 = r12.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r28 = r2
            long r10 = r12.A0H     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r6 = r12.A0J     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r12.A0I     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            java.lang.Integer r15 = r12.A0B     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r34 = r15
            boolean r12 = r12.A0D     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r15 = r12
            X.5NA r12 = new X.5NA     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r26 = r12
            r38 = r40
            r40 = r13
            r42 = r10
            r44 = r6
            r46 = r2
            r50 = r8
            r51 = r15
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r42, r44, r46, r48, r49, r50, r51)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0C = r12     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0d6a:
            r0.A0Q = r9     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r8 != 0) goto L_0x0d93
            int r3 = r12.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = r24
            if (r3 == r2) goto L_0x0d93
            if (r16 != 0) goto L_0x0d85
            r2 = r20
            if (r3 == r2) goto L_0x0d85
            r2 = r25
            if (r3 != r2) goto L_0x0d93
            int r2 = r0.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0d93
            r2 = 1000(0x3e8, double:4.94E-321)
            goto L_0x0d88
        L_0x0d85:
            int r2 = r0.A0U     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = (long) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0d88:
            long r17 = r17 + r2
            r7 = r52
            r6 = r20
            r2 = r17
            r7.sendEmptyMessageAtTime(r6, r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0d93:
            if (r23 != 0) goto L_0x0d97
            r0.A04 = r4     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0d97:
            X.27d.A00()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x0d9c:
            r0.A0Y(r1, r9, r1, r9)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4QZ r2 = r0.A0b     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2.onReleased()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0H(r1)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            android.os.HandlerThread r2 = r0.A0X     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0dae
            r2.quit()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0dae:
            monitor-enter(r0)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0P = r1     // Catch:{ all -> 0x0db6 }
            r0.notifyAll()     // Catch:{ all -> 0x0db6 }
            monitor-exit(r0)     // Catch:{ all -> 0x0db6 }
            return r1
        L_0x0db6:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0db6 }
            goto L_0x0dc0
        L_0x0db9:
            java.lang.String r2 = "Playback stuck buffering and not loading"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r5.<init>(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0dc0:
            throw r5     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0dc1:
            X.4S3 r2 = r0.A0Z     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4P7 r2 = r2.BdA()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            float r14 = r2.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NE r12 = r0.A0c     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TC r8 = r12.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TC r13 = r12.A06     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r15 = 1
        L_0x0dd0:
            if (r8 == 0) goto L_0x0f67
            boolean r2 = r8.A07     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0f67
            X.4Rb r10 = r8.A02(r14)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rb r11 = r8.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r11 == 0) goto L_0x0e0a
            X.4RX[] r7 = r11.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r7.length     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4RX[] r6 = r10.A04     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r5 = r6.length     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 != r5) goto L_0x0e0a
            r4 = 0
        L_0x0de7:
            if (r4 >= r5) goto L_0x0e04
            X.4RW[] r2 = r10.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r3 = r2[r4]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4RW[] r2 = r11.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = r2[r4]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = com.google.android.exoplayer2.util.Util.A0I(r3, r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0e0a
            r3 = r6[r4]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = r7[r4]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = com.google.android.exoplayer2.util.Util.A0I(r3, r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0e0a
            int r4 = r4 + 1
            goto L_0x0de7
        L_0x0e04:
            if (r8 != r13) goto L_0x0e07
            r15 = 0
        L_0x0e07:
            X.4TC r8 = r8.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0dd0
        L_0x0e0a:
            r11 = 4
            if (r15 == 0) goto L_0x0e85
            X.4TC r8 = r12.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r17 = r12.A0A(r8)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4PL[] r7 = r0.A12     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r6 = r7.length     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean[] r14 = new boolean[r6]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r2.A0I     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r12 = r8
            r13 = r10
            r15 = r2
            long r2 = r12.A01(r13, r14, r15, r17)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NA r5 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r4 = r5.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r4 == r11) goto L_0x0e31
            long r4 = r5.A0I     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r32 = 1
            if (r10 != 0) goto L_0x0e33
        L_0x0e31:
            r32 = 0
        L_0x0e33:
            X.5NA r4 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4Rq r10 = r4.A08     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r12 = r4.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r4 = r4.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r23 = r0
            r24 = r10
            r25 = r11
            r26 = r2
            r28 = r12
            r30 = r4
            X.5NA r4 = r23.A06(r24, r25, r26, r28, r30, r32)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0C = r4     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r32 == 0) goto L_0x0e52
            r0.A0J(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0e52:
            boolean[] r10 = new boolean[r6]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r5 = 0
        L_0x0e55:
            if (r5 >= r6) goto L_0x0e81
            r4 = r7[r5]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2 = r4
            X.4PK r2 = (X.AnonymousClass4PK) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r2.A01     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r12 = 0
            if (r2 == 0) goto L_0x0e62
            r12 = 1
        L_0x0e62:
            r10[r5] = r12     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TD[] r2 = r8.A0B     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r3 = r2[r5]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r12 == 0) goto L_0x0e7e
            r2 = r4
            X.4PK r2 = (X.AnonymousClass4PK) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4TD r2 = r2.A05     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r3 == r2) goto L_0x0e75
            r0.A0O(r4)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0e7e
        L_0x0e75:
            boolean r2 = r14[r5]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0e7e
            long r2 = r0.A07     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r4.EIA(r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0e7e:
            int r5 = r5 + 1
            goto L_0x0e55
        L_0x0e81:
            r0.A0Z(r10)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0ea5
        L_0x0e85:
            r12.A0A(r8)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean r2 = r8.A07     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == 0) goto L_0x0ea5
            X.4TB r2 = r8.A02     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r4 = r2.A03     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r0.A07     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r6 = r8.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            long r2 = r2 - r6
            long r6 = java.lang.Math.max(r4, r2)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4PN[] r2 = r8.A0A     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r2.length     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            boolean[] r2 = new boolean[r2]     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r3 = r8
            r4 = r10
            r5 = r2
            r8 = r9
            r3.A01(r4, r5, r6, r8)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
        L_0x0ea5:
            r0.A0V(r1)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.5NA r2 = r0.A0C     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            int r2 = r2.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            if (r2 == r11) goto L_0x0f67
            r0.A08()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0E()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            X.4S6 r2 = r0.A0k     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r3 = 2
            X.4S5 r2 = (X.AnonymousClass4S5) r2     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            android.os.Handler r2 = r2.A00     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r2.sendEmptyMessage(r3)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x0ec0:
            X.5NF r2 = r0.A0d     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            com.google.android.exoplayer2.Timeline r2 = r2.A04()     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            r0.A0T(r2, r1)     // Catch:{ 48u -> 0x0efe, 5OP -> 0x0ef3, 47p -> 0x0ed3, 47s -> 0x0ecf, 4UN -> 0x0ef7, IOException -> 0x0ecb, RuntimeException -> 0x0f44 }
            goto L_0x0f67
        L_0x0ecb:
            r3 = move-exception
            r2 = 2000(0x7d0, float:2.803E-42)
            goto L_0x0efa
        L_0x0ecf:
            r3 = move-exception
            int r2 = r3.A00
            goto L_0x0efa
        L_0x0ed3:
            r4 = move-exception
            int r3 = r4.A00
            if (r3 != r1) goto L_0x0ee7
            boolean r2 = r4.A01
            r19 = 3003(0xbbb, float:4.208E-42)
            if (r2 == 0) goto L_0x0ee0
            r19 = 3001(0xbb9, float:4.205E-42)
        L_0x0ee0:
            r2 = r19
            r0.A0U(r4, r2)
            goto L_0x0f67
        L_0x0ee7:
            r2 = 4
            if (r3 != r2) goto L_0x0ee0
            boolean r2 = r4.A01
            r19 = 3004(0xbbc, float:4.21E-42)
            if (r2 == 0) goto L_0x0ee0
            r19 = 3002(0xbba, float:4.207E-42)
            goto L_0x0ee0
        L_0x0ef3:
            r3 = move-exception
            int r2 = r3.A00
            goto L_0x0efa
        L_0x0ef7:
            r3 = move-exception
            r2 = 1002(0x3ea, float:1.404E-42)
        L_0x0efa:
            r0.A0U(r3, r2)
            goto L_0x0f67
        L_0x0efe:
            r4 = move-exception
            int r2 = r4.A02
            if (r2 != r1) goto L_0x0f11
            X.5NE r2 = r0.A0c
            X.4TC r2 = r2.A06
            if (r2 == 0) goto L_0x0f11
            X.4TB r2 = r2.A02
            X.4Rq r2 = r2.A04
            X.48u r4 = r4.A02(r2)
        L_0x0f11:
            boolean r2 = r4.A06
            if (r2 == 0) goto L_0x0f3a
            X.48u r2 = r0.A08
            if (r2 != 0) goto L_0x0f3a
            java.lang.String r3 = "Recoverable renderer error"
            r2 = r21
            X.2AG.A06(r2, r3, r4)
            r0.A08 = r4
            X.4S6 r3 = r0.A0k
            r2 = 25
            X.4SD r4 = r3.CsU(r4, r2)
            X.4S5 r3 = (X.AnonymousClass4S5) r3
            android.os.Handler r3 = r3.A00
            android.os.Message r2 = r4.A00
            r2.getClass()
            r3.sendMessageAtFrontOfQueue(r2)
            X.AnonymousClass4SD.A00(r4)
            goto L_0x0f67
        L_0x0f3a:
            X.48u r2 = r0.A08
            if (r2 == 0) goto L_0x0f55
            X.C9153RRe.A00(r2, r4)
            X.48u r4 = r0.A08
            goto L_0x0f55
        L_0x0f44:
            r3 = move-exception
            boolean r2 = r3 instanceof java.lang.IllegalStateException
            if (r2 != 0) goto L_0x0f4d
            boolean r2 = r3 instanceof java.lang.IllegalArgumentException
            if (r2 == 0) goto L_0x0f4f
        L_0x0f4d:
            r19 = 1004(0x3ec, float:1.407E-42)
        L_0x0f4f:
            r2 = r19
            X.48u r4 = X.C2612348u.A01(r3, r2)
        L_0x0f55:
            r3 = r22
            r2 = r21
            X.2AG.A05(r2, r3, r4)
            r0.A0X(r1, r9)
            X.5NA r2 = r0.A0C
            X.5NA r2 = r2.A03(r4)
            r0.A0C = r2
        L_0x0f67:
            r0.A09()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5NB.handleMessage(android.os.Message):boolean");
    }
}
