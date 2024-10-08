package X;

import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.4TG  reason: invalid class name */
public final class AnonymousClass4TG implements AnonymousClass4TH, C264934Rw, AnonymousClass4TJ {
    public static final Pattern A0P = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern A0Q = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public int A00;
    public C264924Rv A01;
    public C256633w6 A02;
    public List A03;
    public AnonymousClass4TP[] A04 = new AnonymousClass4TP[0];
    public AnonymousClass4TI A05 = new AnonymousClass4TT(this.A04);
    public AnonymousClass4TS[] A06 = new AnonymousClass4TS[0];
    public final int A07;
    public final long A08;
    public final C264544Qh A09;
    public final C264894Rs A0A;
    public final C265184Sw A0B;
    public final C265114Sp A0C;
    public final C265174Sv A0D;
    public final C264844Rn A0E;
    public final C265194Sx A0F;
    public final C264984Sb A0G;
    public final AnonymousClass4TL A0H;
    public final AnonymousClass4QW A0I;
    public final C265084Sm A0J;
    public final AnonymousClass4T1 A0K;
    public final C250823m7 A0L;
    public final IdentityHashMap A0M = new IdentityHashMap();
    public final AnonymousClass4TV[] A0N;
    public final C265104So A0O;

    public static C256533vv A00(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            C256533vv r1 = (C256533vv) list.get(i);
            if (str.equals(r1.A01)) {
                return r1;
            }
        }
        return null;
    }

    public final long E6K() {
        return -9223372036854775807L;
    }

    public final void A01(C256633w6 r53, int i) {
        IOException iOException;
        long j;
        long j2;
        long BrS;
        AnonymousClass4XR r34;
        long j3;
        long j4;
        C256633w6 r50 = r53;
        this.A02 = r50;
        int i2 = i;
        this.A00 = i2;
        AnonymousClass4TL r6 = this.A0H;
        r6.A02 = false;
        r6.A00 = r50;
        Iterator it = r6.A08.entrySet().iterator();
        while (it.hasNext()) {
            if (((Number) ((Map.Entry) it.next()).getKey()).longValue() < r6.A00.A0C) {
                it.remove();
            }
        }
        AnonymousClass4TP[] r0 = this.A04;
        AnonymousClass4TP[] r32 = r0;
        int length = r0.length;
        int i3 = 0;
        loop1:
        while (i3 < length) {
            AnonymousClass4XN r12 = (AnonymousClass4XN) ((AnonymousClass4XO) r32[i3].A0K);
            try {
                C264544Qh r47 = r12.A0U;
                r12.A03++;
                r12.A0D = r50;
                r12.A02 = i2;
                r12.A06 = System.currentTimeMillis();
                r12.A0A(r12.A07());
                long A002 = r12.A0D.A00(r12.A02);
                ArrayList A062 = r12.A06();
                long j5 = -1;
                int i4 = 0;
                while (true) {
                    AnonymousClass4XR[] r02 = r12.A0f;
                    AnonymousClass4XR[] r29 = r02;
                    if (i4 < r02.length) {
                        C256733wG r28 = (C256733wG) A062.get(r12.A0E.BGu(i4));
                        if (r47.A0I) {
                            AnonymousClass4XR r13 = r29[i4];
                            j = j5;
                            AnonymousClass4XE A003 = r13.A03.A00();
                            AnonymousClass4XE A004 = r28.A00();
                            if (A003 == null) {
                                r34 = new AnonymousClass4XR(r13.A05, r13.A06, A003, r13.A07, r28, r13.A04, A002, r13.A01, r13.A08);
                            } else {
                                if (A003.isExplicit()) {
                                    long BrO = A003.BrO(A002);
                                    if (BrO != 0) {
                                        long B6B = A003.B6B();
                                        long j6 = (BrO + B6B) - 1;
                                        long B6B2 = A004.B6B();
                                        long j7 = r13.A01;
                                        long C7P = A003.C7P(B6B);
                                        long C7P2 = A003.C7P(j6) + A003.AzV(j6, A002);
                                        long C7P3 = A004.C7P(B6B2);
                                        if (C7P2 == C7P3) {
                                            j4 = j6 + 1;
                                        } else {
                                            if (C7P2 < C7P3) {
                                                if (!r13.A08) {
                                                    iOException = new IOException();
                                                    break loop1;
                                                } else {
                                                    j3 = j7 + ((j6 + 1) - B6B2);
                                                    String.format("Discontinuity detected for live: oldIndexEndTimeUs is %d, newIndexStartTimeUs is is %d, segmentNumberShift is %d, representation id is %s", new Object[]{Long.valueOf(C7P2), Long.valueOf(C7P3), Long.valueOf(j3), r13.A03.A02.A0T});
                                                }
                                            } else if (C7P3 < C7P) {
                                                j3 = j7 - (A004.BrS(C7P, A002) - B6B);
                                            } else {
                                                j4 = A003.BrS(C7P3, A002);
                                            }
                                            r34 = new AnonymousClass4XR(r13.A05, r13.A06, A004, r13.A07, r28, r13.A04, A002, j3, r13.A08);
                                        }
                                        j3 = j7 + (j4 - B6B2);
                                        r34 = new AnonymousClass4XR(r13.A05, r13.A06, A004, r13.A07, r28, r13.A04, A002, j3, r13.A08);
                                    }
                                }
                                r34 = new AnonymousClass4XR(r13.A05, r13.A06, A004, r13.A07, r28, r13.A04, A002, r13.A01, r13.A08);
                            }
                            r29[i4] = r34;
                        } else {
                            j = j5;
                            AnonymousClass4XR r10 = r29[i4];
                            AnonymousClass4XE A005 = r10.A03.A00();
                            AnonymousClass4XE A006 = r28.A00();
                            r10.A00 = A002;
                            r10.A03 = r28;
                            if (A005 != null) {
                                r10.A02 = A006;
                                if (A005.isExplicit()) {
                                    long BrO2 = A005.BrO(A002);
                                    if (BrO2 != 0) {
                                        long B6B3 = (A005.B6B() + BrO2) - 1;
                                        long B6B4 = A006.B6B();
                                        long C7P4 = A006.C7P(B6B4);
                                        long C7P5 = A005.C7P(B6B3) + A005.AzV(B6B3, r10.A00);
                                        if (C7P5 == C7P4) {
                                            j2 = r10.A01;
                                            BrS = B6B3 + 1;
                                        } else if (C7P5 < C7P4) {
                                            if (!r10.A08) {
                                                iOException = new IOException();
                                                break loop1;
                                            }
                                            long j8 = r10.A01 + ((B6B3 + 1) - B6B4);
                                            r10.A01 = j8;
                                            String.format("Discontinuity detected for live: oldIndexEndTimeUs is %d, newIndexStartTimeUs is is %d, segmentNumberShift is %d, representation id is %s", new Object[]{Long.valueOf(C7P5), Long.valueOf(C7P4), Long.valueOf(j8), r10.A03.A02.A0T});
                                        } else {
                                            j2 = r10.A01;
                                            BrS = A005.BrS(C7P4, r10.A00);
                                        }
                                        r10.A01 = j2 + (BrS - B6B4);
                                    }
                                }
                            }
                        }
                        AnonymousClass4XR r2 = r29[i4];
                        if (r12.A0D.A0R) {
                            j5 = r2.A03(((Number) r12.A03(r2).second).longValue());
                            if (j != -1) {
                                if (j < j5) {
                                }
                            }
                            i4++;
                        }
                        j5 = j;
                        i4++;
                    } else {
                        r12.A00 = 0;
                        if (r12.A0K && (j5 != r12.A04 || !r12.A0D.A0R)) {
                            r12.A0K = false;
                        }
                        r12.A04 = j5;
                    }
                }
                throw iOException;
            } catch (AnonymousClass4UN e) {
                r12.A0F = e;
            }
        }
        this.A01.D6K(this);
        this.A03 = r50.A02(i2).A04;
        for (AnonymousClass4TS r3 : this.A06) {
            Iterator it2 = this.A03.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                S2T s2t = (S2T) it2.next();
                if (s2t.A00().equals(r3.A00.A00())) {
                    boolean z = true;
                    int size = r50.A0Q.size() - 1;
                    if (!r50.A0R || i2 != size) {
                        z = false;
                    }
                    r3.A01(s2t, z);
                }
            }
        }
        return;
        i3++;
    }

    public final void AGR(long j) {
        this.A05.AGR(j);
    }

    public final boolean AJh(long j, long j2) {
        C264114Oq r11;
        AnonymousClass4XR r9;
        long A002;
        AnonymousClass4SM r2;
        AnonymousClass4TI r48 = this.A05;
        long j3 = -9223372036854775807L;
        for (AnonymousClass4TP r22 : this.A04) {
            if (!r22.A04()) {
                AnonymousClass4Y2 r4 = null;
                if (!2BY.A02(2BQ.A0t) || !r22.A0N.isEmpty()) {
                    ArrayList arrayList = r22.A0N;
                    r4 = (AnonymousClass4Y2) arrayList.get(arrayList.size() - 1);
                }
                AnonymousClass4XP r0 = r22.A0K;
                long j4 = r22.A02;
                AnonymousClass4XN r02 = (AnonymousClass4XN) r0;
                if (r02.A0D.A0R && !((r4 == null && j4 == -9223372036854775807L) || (r11 = r02.A09) == null)) {
                    AnonymousClass4XR[] r7 = r02.A0f;
                    if (r4 == null) {
                        r9 = r7[0];
                        if (!(r9.A02.BrO(r9.A00) == 0 || r9.A02.BrO(r9.A00) == -1)) {
                            A002 = r7[r02.A0E.Brh()].A04(j4);
                        }
                    } else {
                        r9 = r7[r02.A0E.Brh()];
                        j4 = r4.A02;
                        A002 = r4.A00();
                    }
                    r9.A02.getClass();
                    Pair A032 = r02.A03(r9);
                    long C7P = r9.A02.C7P(((Number) A032.first).longValue() - r9.A01);
                    long A033 = r9.A03(((Number) A032.second).longValue());
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AnonymousClass4RX r13 = r02.A0E;
                    C256633w6 r3 = r02.A0D;
                    boolean z = r3.A0R;
                    boolean z2 = r3.A0S;
                    long BTQ = r13.BTQ(r02.A0V, r02, j4, A002, C7P, A033, ((Number) A032.first).longValue(), ((Number) A032.second).longValue(), r11.A03.get(), r11.A04.get(), r11.A05.get(), z, z2, r02.A0I);
                    if (!(BTQ == -9223372036854775807L || (r2 = r11.A00) == null)) {
                        r2.A00.A0O.A02.add(Pair.create(AnonymousClass4SI.JUMP_BY_DISCONTINUITY_LOADING, Long.valueOf(elapsedRealtime)));
                    }
                    if (BTQ != -9223372036854775807L) {
                        j3 = Math.max(j3, BTQ);
                    }
                }
            }
        }
        return r48.AJh(j, j3);
    }

    public final boolean AJi(C21415XaP xaP) {
        return this.A05.AJi(xaP);
    }

    public final void APR(long j, boolean z) {
        AnonymousClass4Y1 r0;
        long j2;
        for (AnonymousClass4TP r7 : this.A04) {
            if (!r7.A04()) {
                C265984Xc r2 = r7.A0I;
                int i = r2.A00;
                r2.A0B(j, z, true);
                int i2 = r2.A00;
                if (i2 > i) {
                    synchronized (r2) {
                        if (r2.A02 == 0) {
                            j2 = Long.MIN_VALUE;
                        } else {
                            j2 = r2.A0N[r2.A04];
                        }
                    }
                    int i3 = 0;
                    while (true) {
                        C265984Xc[] r6 = r7.A0U;
                        if (i3 >= r6.length) {
                            break;
                        }
                        r6[i3].A0B(j2, z, r7.A0V[i3]);
                        i3++;
                    }
                }
                int A002 = AnonymousClass4TP.A00(r7, i2, 0);
                if (A002 > 0) {
                    ArrayList arrayList = r7.A0N;
                    int i4 = A002 - 1;
                    if (((C266194Xx) arrayList.get(i4)).A04 > j || j > ((C266194Xx) arrayList.get(i4)).A02) {
                        arrayList.get(i4);
                        r0 = null;
                    } else {
                        r0 = (AnonymousClass4Y1) arrayList.get(i4);
                    }
                    r7.A05 = r0;
                    if (A002 <= arrayList.size()) {
                        arrayList.subList(0, A002).clear();
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public final long AZp(AnonymousClass4P6 r7, long j) {
        for (AnonymousClass4TP r2 : this.A04) {
            if (r2.A0F == 2) {
                return r2.A0K.AZp(r7, j);
            }
        }
        return j;
    }

    public final long AiS(long j) {
        return this.A05.AiS(j);
    }

    public final long AiU() {
        return this.A05.AiU();
    }

    public final long BWC() {
        return this.A05.BWC();
    }

    public final C264844Rn C99() {
        return this.A0E;
    }

    public final void Cnk() {
        this.A0K.Cnj();
    }

    public final /* bridge */ /* synthetic */ void D6K(AnonymousClass4TI r2) {
        C264924Rv r0 = this.A01;
        if (r0 != null) {
            r0.D6K(this);
        }
    }

    public final long E3Q(long j) {
        for (AnonymousClass4TP r0 : this.A04) {
            r0.A03 = j;
        }
        return j;
    }

    public final void E3p(C264924Rv r1, long j) {
        this.A01 = r1;
        r1.DZ1(this);
    }

    public final void EB7(long j) {
        this.A05.EB7(j);
    }

    public final long EL5(long j, boolean z) {
        ArrayList arrayList;
        boolean z2;
        AnonymousClass4TP[] r10 = this.A04;
        int length = r10.length;
        int i = 0;
        while (true) {
            long j2 = j;
            if (i < length) {
                AnonymousClass4TP r6 = r10[i];
                r6.A03 = -1;
                r6.A01 = j2;
                if (r6.A04()) {
                    r6.A02 = j2;
                } else {
                    AnonymousClass4Y1 r14 = null;
                    int i2 = 0;
                    while (true) {
                        arrayList = r6.A0N;
                        if (i2 >= arrayList.size()) {
                            break;
                        }
                        AnonymousClass4Y1 r11 = (AnonymousClass4Y1) arrayList.get(i2);
                        long j3 = r11.A04;
                        if (j3 != j || r11.A03 != -9223372036854775807L) {
                            if (j3 > j) {
                                break;
                            }
                            i2++;
                        } else {
                            r14 = r11;
                            break;
                        }
                    }
                    C265984Xc r2 = r6.A0I;
                    if (r14 != null) {
                        z2 = false;
                        int[] iArr = r14.A01;
                        C256703wD.A01(iArr);
                        int i3 = iArr[0];
                        synchronized (r2) {
                            r2.A03 = 0;
                            C266004Xe r1 = r2.A0T;
                            r1.A02 = r1.A01;
                            int i4 = r2.A00;
                            if (i3 >= i4 && i3 <= r2.A02 + i4) {
                                r2.A08 = Long.MIN_VALUE;
                                r2.A03 = i3 - i4;
                                z2 = true;
                            }
                        }
                    } else {
                        boolean z3 = false;
                        if (j < r6.BWC()) {
                            z3 = true;
                        }
                        z2 = r2.A0D(j2, z3);
                    }
                    if (!z2 || (r6.A0C && !z)) {
                        r6.A02 = j2;
                        r6.A0B = false;
                        arrayList.clear();
                        AnonymousClass4XY r4 = r6.A0M;
                        if (r4.A01 != null) {
                            r2.A06();
                            for (C265984Xc A062 : r6.A0U) {
                                A062.A06();
                            }
                            r4.A00();
                        } else {
                            r4.A02 = null;
                            r2.A0C(false);
                            for (C265984Xc A0C2 : r6.A0U) {
                                A0C2.A0C(false);
                            }
                        }
                    } else {
                        for (C265984Xc A0D2 : r6.A0U) {
                            A0D2.A0D(j2, true);
                        }
                    }
                }
                r6.A0C = false;
                i++;
            } else {
                for (AnonymousClass4TS A002 : this.A06) {
                    A002.A00(j2);
                }
                return j;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: X.4TS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v75, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v82, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v100, resolved type: X.4TP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: X.4TP} */
    /* JADX WARNING: type inference failed for: r0v32 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long ELF(X.AnonymousClass4TD[] r39, X.AnonymousClass4RX[] r40, boolean[] r41, boolean[] r42, long r43) {
        /*
            r38 = this;
            r6 = r40
            int r5 = r6.length
            int[] r4 = new int[r5]
            r2 = 0
        L_0x0006:
            r8 = r38
            if (r2 >= r5) goto L_0x0023
            r1 = r40[r2]
            if (r1 == 0) goto L_0x0021
            X.4Rn r0 = r8.A0E
            X.4Ro r1 = r1.C98()
            com.google.common.collect.ImmutableList r0 = r0.A02
            int r0 = r0.indexOf(r1)
            if (r0 < 0) goto L_0x0021
        L_0x001c:
            r4[r2] = r0
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0021:
            r0 = -1
            goto L_0x001c
        L_0x0023:
            r3 = 0
        L_0x0024:
            r7 = r39
            if (r3 >= r5) goto L_0x006d
            r0 = r40[r3]
            if (r0 == 0) goto L_0x0030
            boolean r0 = r41[r3]
            if (r0 != 0) goto L_0x006a
        L_0x0030:
            r9 = r39[r3]
            boolean r0 = r9 instanceof X.AnonymousClass4TP
            if (r0 == 0) goto L_0x004d
            X.4TP r9 = (X.AnonymousClass4TP) r9
            r9.A07 = r8
            X.4Xc r0 = r9.A0I
            r0.A08()
            X.4Xc[] r10 = r9.A0U
            int r2 = r10.length
            r1 = 0
        L_0x0043:
            if (r1 >= r2) goto L_0x0062
            r0 = r10[r1]
            r0.A08()
            int r1 = r1 + 1
            goto L_0x0043
        L_0x004d:
            boolean r0 = r9 instanceof X.C265324Tk
            if (r0 == 0) goto L_0x0067
            X.4Tk r9 = (X.C265324Tk) r9
            X.4TP r0 = r9.A04
            boolean[] r2 = r0.A0V
            int r1 = r9.A01
            boolean r0 = r2[r1]
            X.C256703wD.A04(r0)
            r0 = 0
            r2[r1] = r0
            goto L_0x0067
        L_0x0062:
            X.4XY r0 = r9.A0M
            r0.A03(r9)
        L_0x0067:
            r0 = 0
            r39[r3] = r0
        L_0x006a:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x006d:
            r3 = 0
        L_0x006e:
            if (r3 >= r5) goto L_0x00c8
            r1 = r39[r3]
            boolean r0 = r1 instanceof X.C265334Tl
            if (r0 != 0) goto L_0x007a
            boolean r0 = r1 instanceof X.C265324Tk
            if (r0 == 0) goto L_0x00a2
        L_0x007a:
            r0 = r4[r3]
            r10 = -1
            if (r0 == r10) goto L_0x00a8
            X.4TV[] r9 = r8.A0N
            r0 = r9[r0]
            int r1 = r0.A03
            r2 = 0
        L_0x0086:
            if (r2 >= r5) goto L_0x00a8
            r0 = r4[r2]
            if (r0 != r1) goto L_0x00a5
            r0 = r9[r0]
            int r0 = r0.A04
            if (r0 != 0) goto L_0x00a5
            if (r2 == r10) goto L_0x00a8
            r1 = r39[r3]
            boolean r0 = r1 instanceof X.C265324Tk
            if (r0 == 0) goto L_0x00ae
            X.4Tk r1 = (X.C265324Tk) r1
            X.4TP r1 = r1.A02
            r0 = r39[r2]
            if (r1 != r0) goto L_0x00ae
        L_0x00a2:
            int r3 = r3 + 1
            goto L_0x006e
        L_0x00a5:
            int r2 = r2 + 1
            goto L_0x0086
        L_0x00a8:
            r0 = r39[r3]
            boolean r0 = r0 instanceof X.C265334Tl
            if (r0 != 0) goto L_0x00a2
        L_0x00ae:
            r1 = r39[r3]
            boolean r0 = r1 instanceof X.C265324Tk
            if (r0 == 0) goto L_0x00c4
            X.4Tk r1 = (X.C265324Tk) r1
            X.4TP r0 = r1.A04
            boolean[] r2 = r0.A0V
            int r1 = r1.A01
            boolean r0 = r2[r1]
            X.C256703wD.A04(r0)
            r0 = 0
            r2[r1] = r0
        L_0x00c4:
            r0 = 0
            r39[r3] = r0
            goto L_0x00a2
        L_0x00c8:
            r9 = 0
            r11 = 0
        L_0x00ca:
            r3 = 1
            r16 = r43
            if (r11 >= r5) goto L_0x0209
            r14 = r40[r11]
            if (r14 == 0) goto L_0x0202
            r1 = r39[r11]
            if (r1 != 0) goto L_0x01d1
            r42[r11] = r3
            r1 = r4[r11]
            X.4TV[] r0 = r8.A0N
            r13 = r0[r1]
            int r0 = r13.A04
            if (r0 != 0) goto L_0x01e0
            int r3 = r13.A01
            r1 = -1
            r12 = 0
            r35 = 0
            if (r3 == r1) goto L_0x00ed
            r35 = 1
        L_0x00ed:
            r2 = 0
            if (r35 == 0) goto L_0x01cd
            X.4Rn r0 = r8.A0E
            com.google.common.collect.ImmutableList r0 = r0.A02
            java.lang.Object r0 = r0.get(r3)
            X.4Ro r0 = (X.C264854Ro) r0
            r3 = 1
        L_0x00fb:
            int r10 = r13.A00
            if (r10 == r1) goto L_0x01c8
            r18 = 1
            X.4Rn r1 = r8.A0E
            com.google.common.collect.ImmutableList r1 = r1.A02
            java.lang.Object r1 = r1.get(r10)
            X.4Ro r1 = (X.C264854Ro) r1
            int r10 = r1.A01
            int r3 = r3 + r10
        L_0x010e:
            X.3wB[] r10 = new X.C256683wB[r3]
            int[] r3 = new int[r3]
            if (r35 == 0) goto L_0x01c4
            X.3wB[] r0 = r0.A04
            r0 = r0[r9]
            r10[r9] = r0
            r0 = 5
            r3[r9] = r0
            r19 = 1
        L_0x011f:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            if (r18 == 0) goto L_0x013c
        L_0x0126:
            int r0 = r1.A01
            if (r12 >= r0) goto L_0x013c
            X.3wB[] r0 = r1.A04
            r0 = r0[r12]
            r10[r19] = r0
            r18 = 3
            r3[r19] = r18
            r15.add(r0)
            int r19 = r19 + 1
            int r12 = r12 + 1
            goto L_0x0126
        L_0x013c:
            X.3w6 r0 = r8.A02
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x0153
            if (r35 != 0) goto L_0x014a
            X.4Qh r0 = r8.A09
            boolean r0 = r0.A0J
            if (r0 == 0) goto L_0x0153
        L_0x014a:
            X.4TL r1 = r8.A0H
            X.4QW r0 = r1.A07
            X.5fQ r2 = new X.5fQ
            r2.<init>(r1, r0)
        L_0x0153:
            X.4Sb r0 = r8.A0G
            r37 = r0
            X.4T1 r0 = r8.A0K
            r27 = r0
            X.3w6 r0 = r8.A02
            r25 = r0
            X.4Sx r0 = r8.A0F
            r22 = r0
            int r0 = r8.A00
            r31 = r0
            int[] r0 = r13.A06
            r18 = r0
            int r0 = r13.A05
            r32 = r0
            long r0 = r8.A08
            r20 = r0
            X.3m7 r13 = r8.A0L
            X.4Rs r12 = r8.A0A
            X.4Qh r0 = r8.A09
            r19 = r0
            X.4TL r1 = r8.A0H
            X.4Sv r0 = r8.A0D
            r36 = r0
            r23 = r2
            r24 = r1
            r26 = r14
            r28 = r13
            r29 = r15
            r30 = r18
            r33 = r20
            r18 = r37
            r20 = r12
            r21 = r0
            X.4XO r24 = r18.ALm(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35)
            X.4QW r14 = r8.A0I
            X.4Sp r13 = r8.A0C
            X.4Sw r12 = r8.A0B
            X.4Sm r1 = r8.A0J
            X.4TP r0 = new X.4TP
            r18 = r0
            r20 = r12
            r21 = r13
            r22 = r36
            r23 = r8
            r25 = r14
            r26 = r1
            r27 = r3
            r28 = r10
            r29 = r32
            r30 = r16
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            monitor-enter(r8)
            java.util.IdentityHashMap r1 = r8.A0M     // Catch:{ all -> 0x0206 }
            r1.put(r0, r2)     // Catch:{ all -> 0x0206 }
            monitor-exit(r8)     // Catch:{ all -> 0x0206 }
            goto L_0x0200
        L_0x01c4:
            r19 = 0
            goto L_0x011f
        L_0x01c8:
            r18 = 0
            r1 = r2
            goto L_0x010e
        L_0x01cd:
            r0 = r2
            r3 = 0
            goto L_0x00fb
        L_0x01d1:
            boolean r0 = r1 instanceof X.AnonymousClass4TP
            if (r0 == 0) goto L_0x0202
            X.4TP r1 = (X.AnonymousClass4TP) r1
            X.4XP r0 = r1.A0K
            X.4XO r0 = (X.AnonymousClass4XO) r0
            X.4XN r0 = (X.AnonymousClass4XN) r0
            r0.A0E = r14
            goto L_0x0202
        L_0x01e0:
            int r1 = r13.A04
            r0 = 2
            if (r1 != r0) goto L_0x0202
            java.util.List r1 = r8.A03
            int r0 = r13.A02
            java.lang.Object r3 = r1.get(r0)
            X.S2T r3 = (X.S2T) r3
            X.4Ro r0 = r14.C98()
            X.3wB[] r0 = r0.A04
            r2 = r0[r9]
            X.3w6 r0 = r8.A02
            boolean r1 = r0.A0R
            X.4TS r0 = new X.4TS
            r0.<init>(r2, r3, r1)
        L_0x0200:
            r39[r11] = r0
        L_0x0202:
            int r11 = r11 + 1
            goto L_0x00ca
        L_0x0206:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0206 }
            throw r0
        L_0x0209:
            if (r9 >= r5) goto L_0x0277
            r0 = r39[r9]
            if (r0 != 0) goto L_0x0262
            r0 = r40[r9]
            if (r0 == 0) goto L_0x0262
            r0 = r4[r9]
            X.4TV[] r11 = r8.A0N
            r12 = r11[r0]
            int r0 = r12.A04
            if (r0 != r3) goto L_0x0262
            r0 = r4[r9]
            r10 = -1
            if (r0 == r10) goto L_0x026b
            r0 = r11[r0]
            int r2 = r0.A03
            r1 = 0
        L_0x0227:
            if (r1 >= r5) goto L_0x026b
            r0 = r4[r1]
            if (r0 != r2) goto L_0x0268
            r0 = r11[r0]
            int r0 = r0.A04
            if (r0 != 0) goto L_0x0268
            if (r1 == r10) goto L_0x026b
            r11 = r39[r1]
            X.4TP r11 = (X.AnonymousClass4TP) r11
            int r1 = r12.A05
            r10 = 0
        L_0x023c:
            X.4Xc[] r12 = r11.A0U
            int r0 = r12.length
            if (r10 >= r0) goto L_0x0271
            int[] r0 = r11.A0S
            r0 = r0[r10]
            if (r0 != r1) goto L_0x0265
            boolean[] r1 = r11.A0V
            boolean r0 = r1[r10]
            r0 = r0 ^ 1
            X.C256703wD.A04(r0)
            r1[r10] = r3
            r2 = r12[r10]
            r0 = r16
            r2.A0D(r0, r3)
            r1 = r12[r10]
            X.4Tk r0 = new X.4Tk
            r0.<init>(r1, r11, r11, r10)
        L_0x0260:
            r39[r9] = r0
        L_0x0262:
            int r9 = r9 + 1
            goto L_0x0209
        L_0x0265:
            int r10 = r10 + 1
            goto L_0x023c
        L_0x0268:
            int r1 = r1 + 1
            goto L_0x0227
        L_0x026b:
            X.4Tl r0 = new X.4Tl
            r0.<init>()
            goto L_0x0260
        L_0x0271:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0277:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r3 = r7.length
            r2 = 0
        L_0x0283:
            if (r2 >= r3) goto L_0x0299
            r1 = r39[r2]
            boolean r0 = r1 instanceof X.AnonymousClass4TP
            if (r0 == 0) goto L_0x0291
            r5.add(r1)
        L_0x028e:
            int r2 = r2 + 1
            goto L_0x0283
        L_0x0291:
            boolean r0 = r1 instanceof X.AnonymousClass4TS
            if (r0 == 0) goto L_0x028e
            r4.add(r1)
            goto L_0x028e
        L_0x0299:
            int r0 = r5.size()
            X.4TP[] r0 = new X.AnonymousClass4TP[r0]
            r8.A04 = r0
            r5.toArray(r0)
            int r0 = r4.size()
            X.4TS[] r0 = new X.AnonymousClass4TS[r0]
            r8.A06 = r0
            r4.toArray(r0)
            X.4TP[] r1 = r8.A04
            X.4TT r0 = new X.4TT
            r0.<init>(r1)
            r8.A05 = r0
            return r43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TG.ELF(X.4TD[], X.4RX[], boolean[], boolean[], long):long");
    }

    public final void Efw(boolean z) {
        this.A05.Efw(z);
    }

    public final void FKi(byte b, boolean z) {
        this.A05.FKi(b, z);
    }

    public final boolean isLoading() {
        return this.A05.isLoading();
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x0263 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0261  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4TG(X.C264544Qh r32, X.C264894Rs r33, X.C265184Sw r34, X.C265114Sp r35, X.C265104So r36, X.C265174Sv r37, X.C265194Sx r38, X.C264984Sb r39, X.C265214Sz r40, X.C256633w6 r41, X.AnonymousClass4QW r42, X.C265084Sm r43, X.AnonymousClass4T1 r44, X.C250823m7 r45, int r46, int r47, long r48) {
        /*
            r31 = this;
            r2 = r31
            r2.<init>()
            r0 = r46
            r2.A07 = r0
            r4 = r41
            r2.A02 = r4
            r0 = r38
            r2.A0F = r0
            r3 = r47
            r2.A00 = r3
            r0 = r39
            r2.A0G = r0
            r0 = r45
            r2.A0L = r0
            r30 = r35
            r0 = r30
            r2.A0C = r0
            r0 = r34
            r2.A0B = r0
            r0 = r43
            r2.A0J = r0
            r0 = r37
            r2.A0D = r0
            r0 = r48
            r2.A08 = r0
            r0 = r44
            r2.A0K = r0
            r1 = r42
            r2.A0I = r1
            r0 = r36
            r2.A0O = r0
            r0 = r33
            r2.A0A = r0
            r0 = r32
            r2.A09 = r0
            X.4TL r0 = new X.4TL
            r5 = r40
            r0.<init>(r5, r4, r1)
            r2.A0H = r0
            r20 = 0
            r0 = r20
            X.4TP[] r0 = new X.AnonymousClass4TP[r0]
            r2.A04 = r0
            r0 = r20
            X.4TS[] r0 = new X.AnonymousClass4TS[r0]
            r2.A06 = r0
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            r2.A0M = r0
            X.4TP[] r1 = r2.A04
            X.4TT r0 = new X.4TT
            r0.<init>(r1)
            r2.A05 = r0
            X.3wM r1 = r4.A02(r3)
            java.util.List r0 = r1.A04
            r29 = r0
            r2.A03 = r0
            java.util.List r7 = r1.A03
            int r13 = r7.size()
            android.util.SparseIntArray r12 = new android.util.SparseIntArray
            r12.<init>(r13)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r13)
            android.util.SparseArray r11 = new android.util.SparseArray
            r11.<init>(r13)
            r8 = 0
            r3 = 0
        L_0x008f:
            if (r3 >= r13) goto L_0x00b1
            java.lang.Object r0 = r7.get(r3)
            X.3wK r0 = (X.C256773wK) r0
            int r0 = r0.A00
            r12.put(r0, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.add(r0)
            r9.add(r1)
            r11.put(r3, r1)
            int r3 = r3 + 1
            goto L_0x008f
        L_0x00b1:
            r10 = 0
        L_0x00b2:
            if (r10 >= r13) goto L_0x0141
            java.lang.Object r3 = r7.get(r10)
            X.3wK r3 = (X.C256773wK) r3
            java.util.List r0 = r3.A06
            java.lang.String r1 = "http://dashif.org/guidelines/trickmode"
            X.3vv r0 = A00(r1, r0)
            if (r0 != 0) goto L_0x00ca
            java.util.List r0 = r3.A08
            X.3vv r0 = A00(r1, r0)
        L_0x00ca:
            r6 = -1
            if (r0 == 0) goto L_0x013f
            java.lang.String r0 = r0.A02
            int r0 = java.lang.Integer.parseInt(r0)
            int r5 = r12.get(r0, r6)
            if (r5 == r6) goto L_0x013f
        L_0x00d9:
            if (r5 != r10) goto L_0x00fc
            int r1 = r3.A01
            r0 = 1
            if (r1 == r0) goto L_0x00fc
            java.util.List r0 = r3.A07
            java.util.Iterator r4 = r0.iterator()
        L_0x00e6:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0116
            java.lang.Object r0 = r4.next()
            X.3wG r0 = (X.C256733wG) r0
            if (r0 == 0) goto L_0x00e6
            X.3wB r0 = r0.A02
            int r1 = r0.A0E
            r0 = 16
            if (r1 != r0) goto L_0x00e6
        L_0x00fc:
            if (r5 == r10) goto L_0x0113
            java.lang.Object r1 = r11.get(r10)
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r0 = r11.get(r5)
            java.util.List r0 = (java.util.List) r0
            r0.addAll(r1)
            r11.put(r10, r0)
            r9.remove(r1)
        L_0x0113:
            int r10 = r10 + 1
            goto L_0x00b2
        L_0x0116:
            java.util.List r1 = r3.A08
            java.lang.String r0 = "urn:mpeg:dash:adaptation-set-switching:2016"
            X.3vv r0 = A00(r0, r1)
            if (r0 == 0) goto L_0x00fc
            java.lang.String r1 = r0.A02
            java.lang.String r0 = ","
            java.lang.String[] r4 = r1.split(r0, r6)
            int r3 = r4.length
            r1 = 0
        L_0x012a:
            if (r1 >= r3) goto L_0x00fc
            r0 = r4[r1]
            int r0 = java.lang.Integer.parseInt(r0)
            int r0 = r12.get(r0, r6)
            if (r0 == r6) goto L_0x013c
            int r5 = java.lang.Math.min(r5, r0)
        L_0x013c:
            int r1 = r1 + 1
            goto L_0x012a
        L_0x013f:
            r5 = r10
            goto L_0x00d9
        L_0x0141:
            int r6 = r9.size()
            int[][] r0 = new int[r6][]
            r19 = r0
        L_0x0149:
            if (r8 >= r6) goto L_0x015d
            java.lang.Object r0 = r9.get(r8)
            java.util.Collection r0 = (java.util.Collection) r0
            int[] r0 = X.1WJ.A04(r0)
            r19[r8] = r0
            java.util.Arrays.sort(r0)
            int r8 = r8 + 1
            goto L_0x0149
        L_0x015d:
            boolean[] r0 = new boolean[r6]
            r18 = r0
            X.3wB[][] r0 = new X.C256683wB[r6][]
            r17 = r0
            r14 = 0
            r13 = 0
        L_0x0167:
            if (r14 >= r6) goto L_0x026f
            r9 = r19[r14]
            int r8 = r9.length
            r5 = 0
        L_0x016d:
            if (r5 >= r8) goto L_0x0193
            r0 = r9[r5]
            r4 = 1
            java.lang.Object r0 = r7.get(r0)
            X.3wK r0 = (X.C256773wK) r0
            java.util.List r3 = r0.A07
            r1 = 0
        L_0x017b:
            int r0 = r3.size()
            if (r1 >= r0) goto L_0x026b
            java.lang.Object r0 = r3.get(r1)
            X.3wG r0 = (X.C256733wG) r0
            java.util.List r0 = r0.A06
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0267
            r18[r14] = r4
            int r13 = r13 + 1
        L_0x0193:
            r11 = r19[r14]
            int r10 = r11.length
            r9 = 0
        L_0x0197:
            if (r9 >= r10) goto L_0x0258
            r0 = r11[r9]
            java.lang.Object r5 = r7.get(r0)
            X.3wK r5 = (X.C256773wK) r5
            java.lang.Object r0 = r7.get(r0)
            X.3wK r0 = (X.C256773wK) r0
            java.util.List r8 = r0.A05
            r3 = 0
        L_0x01aa:
            int r0 = r8.size()
            if (r3 >= r0) goto L_0x0254
            java.lang.Object r4 = r8.get(r3)
            X.3vv r4 = (X.C256533vv) r4
            java.lang.String r1 = r4.A01
            java.lang.String r0 = "urn:scte:dash:cc:cea-608:2015"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x022b
            X.3w8 r3 = new X.3w8
            r3.<init>()
            java.lang.String r0 = "application/cea-608"
            r3.A0U = r0
            int r1 = r5.A00
            java.lang.String r0 = ":cea608"
            java.lang.String r0 = X.002.A03(r1, r0)
            r3.A0R = r0
            X.3wB r15 = new X.3wB
            r15.<init>(r3)
            java.util.regex.Pattern r12 = A0P
        L_0x01da:
            java.lang.String r3 = r4.A02
            r16 = 1
            if (r3 == 0) goto L_0x0226
            java.lang.String r1 = ";"
            r0 = -1
            java.lang.String[] r10 = r3.split(r1, r0)
            int r9 = r10.length
            X.3wB[] r11 = new X.C256683wB[r9]
            r8 = 0
        L_0x01eb:
            if (r8 >= r9) goto L_0x025c
            r0 = r10[r8]
            java.util.regex.Matcher r5 = r12.matcher(r0)
            boolean r0 = r5.matches()
            if (r0 == 0) goto L_0x0226
            r0 = r16
            java.lang.String r0 = r5.group(r0)
            int r4 = java.lang.Integer.parseInt(r0)
            X.3w8 r3 = new X.3w8
            r3.<init>(r15)
            java.lang.String r0 = r15.A0T
            r1 = r0
            java.lang.String r0 = ":"
            java.lang.String r0 = X.002.A0b(r1, r0, r4)
            r3.A0R = r0
            r3.A02 = r4
            r0 = 2
            java.lang.String r0 = r5.group(r0)
            r3.A0T = r0
            X.3wB r0 = new X.3wB
            r0.<init>(r3)
            r11[r8] = r0
            int r8 = r8 + 1
            goto L_0x01eb
        L_0x0226:
            X.3wB[] r11 = new X.C256683wB[]{r15}
            goto L_0x025c
        L_0x022b:
            java.lang.String r1 = r4.A01
            java.lang.String r0 = "urn:scte:dash:cc:cea-708:2015"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0250
            X.3w8 r3 = new X.3w8
            r3.<init>()
            java.lang.String r0 = "application/cea-708"
            r3.A0U = r0
            int r1 = r5.A00
            java.lang.String r0 = ":cea708"
            java.lang.String r0 = X.002.A03(r1, r0)
            r3.A0R = r0
            X.3wB r15 = new X.3wB
            r15.<init>(r3)
            java.util.regex.Pattern r12 = A0Q
            goto L_0x01da
        L_0x0250:
            int r3 = r3 + 1
            goto L_0x01aa
        L_0x0254:
            int r9 = r9 + 1
            goto L_0x0197
        L_0x0258:
            r0 = r20
            X.3wB[] r11 = new X.C256683wB[r0]
        L_0x025c:
            r17[r14] = r11
            int r0 = r11.length
            if (r0 == 0) goto L_0x0263
            int r13 = r13 + 1
        L_0x0263:
            int r14 = r14 + 1
            goto L_0x0167
        L_0x0267:
            int r1 = r1 + 1
            goto L_0x017b
        L_0x026b:
            int r5 = r5 + 1
            goto L_0x016d
        L_0x026f:
            int r13 = r13 + r6
            int r0 = r29.size()
            int r13 = r13 + r0
            X.4Ro[] r1 = new X.C264854Ro[r13]
            X.4TV[] r0 = new X.AnonymousClass4TV[r13]
            r5 = 0
            r25 = 0
        L_0x027c:
            if (r5 >= r6) goto L_0x0361
            r8 = r19[r5]
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r9 = r8.length
            r4 = 0
        L_0x0287:
            if (r4 >= r9) goto L_0x0299
            r3 = r8[r4]
            java.lang.Object r3 = r7.get(r3)
            X.3wK r3 = (X.C256773wK) r3
            java.util.List r3 = r3.A07
            r11.addAll(r3)
            int r4 = r4 + 1
            goto L_0x0287
        L_0x0299:
            int r10 = r11.size()
            X.3wB[] r12 = new X.C256683wB[r10]
            r9 = 0
        L_0x02a0:
            if (r9 >= r10) goto L_0x02c1
            java.lang.Object r3 = r11.get(r9)
            X.3wG r3 = (X.C256733wG) r3
            X.3wB r13 = r3.A02
            r3 = r30
            int r3 = r3.At6(r13)
            X.3w8 r4 = new X.3w8
            r4.<init>(r13)
            r4.A05 = r3
            X.3wB r3 = new X.3wB
            r3.<init>(r4)
            r12[r9] = r3
            int r9 = r9 + 1
            goto L_0x02a0
        L_0x02c1:
            r3 = r8[r20]
            java.lang.Object r13 = r7.get(r3)
            X.3wK r13 = (X.C256773wK) r13
            int r3 = r13.A00
            r4 = -1
            if (r3 == r4) goto L_0x0359
            java.lang.String r10 = java.lang.Integer.toString(r3)
        L_0x02d2:
            int r9 = r25 + 1
            boolean r11 = r18[r5]
            int r3 = r9 + 1
            if (r11 != 0) goto L_0x02dc
            r3 = r9
            r9 = -1
        L_0x02dc:
            r11 = r17[r5]
            int r11 = r11.length
            int r14 = r3 + 1
            if (r11 != 0) goto L_0x02e5
            r14 = r3
            r3 = -1
        L_0x02e5:
            X.4Ro r11 = new X.4Ro
            r11.<init>(r10, r12)
            r1[r25] = r11
            int r11 = r13.A01
            X.4TV r21 = new X.4TV
            r24 = r20
            r26 = r9
            r27 = r3
            r28 = r4
            r22 = r8
            r23 = r11
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            r0[r25] = r21
            if (r9 == r4) goto L_0x0333
            java.lang.String r11 = ":emsg"
            java.lang.String r13 = X.002.A0R(r10, r11)
            X.3w8 r12 = new X.3w8
            r12.<init>()
            r12.A0R = r13
            java.lang.String r11 = "application/x-emsg"
            r12.A0U = r11
            X.3wB r11 = new X.3wB
            r11.<init>(r12)
            r24 = 1
            X.3wB[] r12 = new X.C256683wB[]{r11}
            X.4Ro r11 = new X.4Ro
            r11.<init>(r13, r12)
            r1[r9] = r11
            r23 = 5
            X.4TV r21 = new X.4TV
            r26 = r4
            r27 = r4
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            r0[r9] = r21
        L_0x0333:
            if (r3 == r4) goto L_0x0353
            java.lang.String r9 = ":cc"
            java.lang.String r11 = X.002.A0R(r10, r9)
            r10 = r17[r5]
            X.4Ro r9 = new X.4Ro
            r9.<init>(r11, r10)
            r1[r3] = r9
            r23 = 3
            r24 = 1
            X.4TV r21 = new X.4TV
            r26 = r4
            r27 = r4
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            r0[r3] = r21
        L_0x0353:
            int r5 = r5 + 1
            r25 = r14
            goto L_0x027c
        L_0x0359:
            java.lang.String r3 = "unset:"
            java.lang.String r10 = X.002.A0O(r3, r5)
            goto L_0x02d2
        L_0x0361:
            r8 = r25
            r6 = 0
        L_0x0364:
            int r3 = r29.size()
            if (r6 >= r3) goto L_0x03b4
            r3 = r29
            java.lang.Object r5 = r3.get(r6)
            X.S2T r5 = (X.S2T) r5
            X.3w8 r4 = new X.3w8
            r4.<init>()
            java.lang.String r3 = r5.A00()
            r4.A0R = r3
            java.lang.String r3 = "application/x-emsg"
            r4.A0U = r3
            X.3wB r7 = new X.3wB
            r7.<init>(r4)
            java.lang.String r4 = r5.A00()
            java.lang.String r3 = ":"
            java.lang.String r5 = X.002.A0b(r4, r3, r6)
            X.3wB[] r4 = new X.C256683wB[]{r7}
            X.4Ro r3 = new X.4Ro
            r3.<init>(r5, r4)
            r1[r25] = r3
            int r25 = r25 + 1
            r3 = r20
            int[] r10 = new int[r3]
            r11 = 5
            r12 = 2
            r13 = -1
            X.4TV r9 = new X.4TV
            r14 = r13
            r15 = r13
            r16 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r0[r8] = r9
            int r6 = r6 + 1
            r8 = r25
            goto L_0x0364
        L_0x03b4:
            X.4Rn r3 = new X.4Rn
            r3.<init>(r1)
            android.util.Pair r1 = android.util.Pair.create(r3, r0)
            java.lang.Object r0 = r1.first
            X.4Rn r0 = (X.C264844Rn) r0
            r2.A0E = r0
            java.lang.Object r0 = r1.second
            X.4TV[] r0 = (X.AnonymousClass4TV[]) r0
            r2.A0N = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TG.<init>(X.4Qh, X.4Rs, X.4Sw, X.4Sp, X.4So, X.4Sv, X.4Sx, X.4Sb, X.4Sz, X.3w6, X.4QW, X.4Sm, X.4T1, X.3m7, int, int, long):void");
    }
}
