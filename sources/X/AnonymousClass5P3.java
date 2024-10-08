package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.5P3  reason: invalid class name */
public abstract class AnonymousClass5P3 {
    public static int A00;
    public static AnonymousClass5P8 A01;
    public static List A02;
    public static List A03;
    public static C268494dV A04 = new AtomicInteger(0);
    public static final AnonymousClass5P5 A05 = new AnonymousClass5P5();
    public static final AnonymousClass5P9 A06 = new AnonymousClass5P9();
    public static final Object A07 = new Object();
    public static final AtomicReference A08;
    public static final 0sP A09 = AnonymousClass5P4.A00;
    public static final Snapshot A0A;
    public static final AnonymousClass5PA A0B = new AnonymousClass5PA();

    public static final Snapshot A01(Snapshot snapshot, 0sP r4, boolean z) {
        AnonymousClass5PD r1;
        Snapshot snapshot2 = snapshot;
        0sP r2 = r4;
        if (snapshot instanceof AnonymousClass5PD) {
            r1 = (AnonymousClass5PD) snapshot2;
        } else if (snapshot != null) {
            return new AnonymousClass5PG(snapshot, r4, z);
        } else {
            r1 = null;
        }
        return new AnonymousClass5PF(r1, r2, (0sP) null, false, z);
    }

    public static final AnonymousClass5P2 A05(AnonymousClass5P8 r4, AnonymousClass5P2 r5, int i) {
        AnonymousClass5P2 r2 = null;
        while (r5 != null) {
            int i2 = r5.A00;
            if (i2 != 0 && i2 <= i && !r4.A04(i2) && (r2 == null || r2.A00 < r5.A00)) {
                r2 = r5;
            }
            r5 = r5.A01;
        }
        if (r2 != null) {
            return r2;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [java.util.concurrent.atomic.AtomicInteger, X.4dV] */
    static {
        AnonymousClass5P8 r3 = AnonymousClass5P8.A04;
        A01 = r3;
        A00 = 2;
        0sn r0 = 0sn.A00;
        A02 = r0;
        A03 = r0;
        A00 = 3;
        AnonymousClass5PC r2 = new AnonymousClass5PC(r3, 2);
        A01 = A01.A01(r2.A01());
        AtomicReference atomicReference = new AtomicReference(r2);
        A08 = atomicReference;
        A0A = (Snapshot) atomicReference.get();
    }

    public static final Snapshot A00() {
        Snapshot snapshot = (Snapshot) A05.A00();
        if (snapshot == null) {
            return (Snapshot) A08.get();
        }
        return snapshot;
    }

    public static final Object A09(Snapshot snapshot, 0sP r7) {
        Object invoke = r7.invoke(A01.A00(snapshot.A01()));
        synchronized (A07) {
            int i = A00;
            A00 = i + 1;
            AnonymousClass5P8 A002 = A01.A00(snapshot.A01());
            A01 = A002;
            A08.set(new AnonymousClass5PC(A002, i));
            snapshot.A0H();
            A01 = A01.A01(i);
        }
        return invoke;
    }

    public static final Object A0A(0sP r17) {
        Object obj;
        0vq A0I;
        Object A092;
        0qQ.A0C(A0A, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        Object obj2 = A07;
        synchronized (obj2) {
            obj = A08.get();
            A0I = ((AnonymousClass5PC) obj).A0I();
            if (A0I != null) {
                A04.addAndGet(1);
            }
            A092 = A09((Snapshot) obj, r17);
        }
        if (A0I != null) {
            try {
                List list = A02;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((0sL) list.get(i)).invoke(new C285135Pw(A0I), obj);
                }
            } finally {
                A04.addAndGet(-1);
            }
        }
        synchronized (obj2) {
            A0D();
            if (A0I != null) {
                Object[] objArr = A0I.A03;
                long[] jArr = A0I.A02;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((-1 ^ j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                            int i3 = 8 - (((i2 - length) ^ -1) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                boolean z = false;
                                if ((255 & j) < 128) {
                                    z = true;
                                }
                                if (z) {
                                    A0I((C284925Ox) objArr[(i2 << 3) + i4]);
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return A092;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0055, code lost:
        r14 = (X.C284925Ox) r9[(r6 << 3) + r13];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.HashMap A0B(X.AnonymousClass5PD r17, X.AnonymousClass5PD r18, X.AnonymousClass5P8 r19) {
        /*
            r12 = r18
            X.0vq r2 = r12.A0I()
            int r11 = r17.A01()
            r18 = 0
            if (r2 == 0) goto L_0x00ad
            X.5P8 r1 = r12.A04()
            int r0 = r12.A01()
            X.5P8 r1 = r1.A01(r0)
            X.5P8 r0 = r12.A02
            X.5P8 r10 = r1.A03(r0)
            java.lang.Object[] r9 = r2.A03
            long[] r8 = r2.A02
            int r0 = r8.length
            int r7 = r0 + -2
            if (r7 < 0) goto L_0x00ac
            r1 = r18
            r6 = 0
        L_0x002c:
            r16 = r8[r6]
            r4 = -1
            long r4 = r4 ^ r16
            r0 = 7
            long r4 = r4 << r0
            long r4 = r4 & r16
            r2 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r2
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x009d
            int r0 = r6 - r7
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r5 = 8 - r0
            r13 = 0
        L_0x0049:
            if (r13 >= r5) goto L_0x0099
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r16
            r2 = 128(0x80, double:6.32E-322)
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0092
            int r0 = r6 << 3
            int r0 = r0 + r13
            r14 = r9[r0]
            X.5Ox r14 = (X.C284925Ox) r14
            X.5P2 r15 = r14.B6D()
            r0 = r19
            X.5P2 r4 = A05(r0, r15, r11)
            if (r4 == 0) goto L_0x0092
            X.5P2 r3 = A05(r10, r15, r11)
            if (r3 == 0) goto L_0x0092
            boolean r0 = r4.equals(r3)
            if (r0 != 0) goto L_0x0092
            int r2 = r12.A01()
            X.5P8 r0 = r12.A04()
            X.5P2 r0 = A05(r0, r15, r2)
            if (r0 == 0) goto L_0x00a2
            X.5P2 r0 = r14.CoB(r3, r4, r0)
            if (r0 == 0) goto L_0x00ad
            if (r1 != 0) goto L_0x008f
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
        L_0x008f:
            r1.put(r4, r0)
        L_0x0092:
            r0 = 8
            long r16 = r16 >> r0
            int r13 = r13 + 1
            goto L_0x0049
        L_0x0099:
            r0 = 8
            if (r5 != r0) goto L_0x00ab
        L_0x009d:
            if (r6 == r7) goto L_0x00aa
            int r6 = r6 + 1
            goto L_0x002c
        L_0x00a2:
            A0E()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00aa:
            return r1
        L_0x00ab:
            return r1
        L_0x00ac:
            return r18
        L_0x00ad:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5P3.A0B(X.5PD, X.5PD, X.5P8):java.util.HashMap");
    }

    public static final 0sP A0C(0sP r2, 0sP r3, boolean z) {
        if (!z) {
            r3 = null;
        }
        if (r2 == null) {
            return r3;
        }
        if (r3 == null || r2 == r3) {
            return r2;
        }
        return new C377469Ly(r2, r3, 8);
    }

    public static final void A0D() {
        Object obj;
        AnonymousClass5PA r6 = A0B;
        int i = r6.A00;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AnonymousClass5PB r1 = r6.A02[i3];
            if (!(r1 == null || (obj = r1.get()) == null || (!A0J((C284925Ox) obj)))) {
                if (i2 != i3) {
                    r6.A02[i2] = r1;
                    int[] iArr = r6.A01;
                    iArr[i2] = iArr[i3];
                }
                i2++;
            }
        }
        for (int i4 = i2; i4 < i; i4++) {
            r6.A02[i4] = null;
            r6.A01[i4] = 0;
        }
        if (i2 != i) {
            r6.A00 = i2;
        }
    }

    public static final void A0E() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final void A0F(int i) {
        int i2;
        AnonymousClass5P9 r8 = A06;
        int[] iArr = r8.A02;
        int i3 = iArr[i];
        int i4 = r8.A01 - 1;
        AnonymousClass5P9.A00(r8, i3, i4);
        r8.A01 = i4;
        int i5 = i3;
        int[] iArr2 = r8.A04;
        int i6 = iArr2[i3];
        while (i5 > 0) {
            int i7 = ((i5 + 1) >> 1) - 1;
            if (iArr2[i7] <= i6) {
                break;
            }
            AnonymousClass5P9.A00(r8, i7, i5);
            i5 = i7;
        }
        int i8 = i4 >> 1;
        while (i3 < i8) {
            int i9 = (i3 + 1) << 1;
            int i10 = i9 - 1;
            if (i9 < i4 && (i2 = iArr2[i9]) < iArr2[i10]) {
                if (i2 >= iArr2[i3]) {
                    break;
                }
                AnonymousClass5P9.A00(r8, i9, i3);
                i3 = i9;
            } else if (iArr2[i10] >= iArr2[i3]) {
                break;
            } else {
                AnonymousClass5P9.A00(r8, i10, i3);
                i3 = i10;
            }
        }
        iArr[i] = r8.A00;
        r8.A00 = i;
    }

    public static final void A0G(Snapshot snapshot) {
        Object obj;
        int i;
        AnonymousClass5PD r5;
        if (!A01.A04(snapshot.A01())) {
            StringBuilder sb = new StringBuilder();
            sb.append("Snapshot is not open: id=");
            sb.append(snapshot.A01());
            sb.append(", disposed=");
            sb.append(snapshot.A02);
            sb.append(", applied=");
            if (!(snapshot instanceof AnonymousClass5PD) || (r5 = (AnonymousClass5PD) snapshot) == null) {
                obj = "read-only";
            } else {
                obj = Boolean.valueOf(r5.A03);
            }
            sb.append(obj);
            sb.append(", lowestPin=");
            synchronized (A07) {
                AnonymousClass5P9 r2 = A06;
                i = -1;
                if (r2.A01 > 0) {
                    i = r2.A04[0];
                }
            }
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    public static final AnonymousClass5P2 A02(Snapshot snapshot, C284925Ox r7, AnonymousClass5P2 r8) {
        AnonymousClass5P2 A052;
        if (snapshot.A0G()) {
            snapshot.A0F(r7);
        }
        int A012 = snapshot.A01();
        AnonymousClass5P2 A053 = A05(snapshot.A04(), r8, A012);
        if (A053 == null) {
            A0E();
            throw AnonymousClass00P.createAndThrow();
        } else if (A053.A00 == snapshot.A01()) {
            return A053;
        } else {
            synchronized (A07) {
                A052 = A05(snapshot.A04(), r7.B6D(), A012);
                if (A052 == null) {
                    A0E();
                    throw AnonymousClass00P.createAndThrow();
                } else if (A052.A00 != A012) {
                    AnonymousClass5P2 A062 = A06(r7, A052);
                    A062.A01(A052);
                    A062.A00 = snapshot.A01();
                    A052 = A062;
                }
            }
            if (A053.A00 != 1) {
                snapshot.A0F(r7);
            }
            return A052;
        }
    }

    public static final AnonymousClass5P2 A03(Snapshot snapshot, C284925Ox r5, AnonymousClass5P2 r6, AnonymousClass5P2 r7) {
        AnonymousClass5P2 A062;
        if (snapshot.A0G()) {
            snapshot.A0F(r5);
        }
        int A012 = snapshot.A01();
        if (r7.A00 == A012) {
            return r7;
        }
        synchronized (A07) {
            A062 = A06(r5, r6);
        }
        A062.A00 = A012;
        if (r7.A00 != 1) {
            snapshot.A0F(r5);
        }
        return A062;
    }

    public static final AnonymousClass5P2 A04(Snapshot snapshot, AnonymousClass5P2 r3) {
        AnonymousClass5P2 A052 = A05(snapshot.A04(), r3, snapshot.A01());
        if (A052 != null) {
            return A052;
        }
        A0E();
        throw AnonymousClass00P.createAndThrow();
    }

    public static final AnonymousClass5P2 A06(C284925Ox r5, AnonymousClass5P2 r6) {
        AnonymousClass5P2 B6D = r5.B6D();
        AnonymousClass5P9 r2 = A06;
        int i = A00;
        if (r2.A01 > 0) {
            i = r2.A04[0];
        }
        int i2 = i - 1;
        AnonymousClass5P8 r1 = AnonymousClass5P8.A04;
        AnonymousClass5P2 r22 = null;
        while (B6D != null) {
            if (B6D.A00 != 0) {
                int i3 = B6D.A00;
                if (i3 != 0 && i3 <= i2 && !r1.A04(i3)) {
                    if (r22 == null) {
                        r22 = B6D;
                    } else if (B6D.A00 >= r22.A00) {
                        B6D = r22;
                    }
                }
                B6D = B6D.A01;
            }
            B6D.A00 = Integer.MAX_VALUE;
            return B6D;
        }
        AnonymousClass5P2 A002 = r6.A00();
        A002.A00 = Integer.MAX_VALUE;
        A002.A01 = r5.B6D();
        r5.E4K(A002);
        return A002;
    }

    public static final AnonymousClass5P2 A07(C284925Ox r5, AnonymousClass5P2 r6) {
        Snapshot A002 = A00();
        0sP A052 = A002.A05();
        if (A052 != null) {
            A052.invoke(r5);
        }
        AnonymousClass5P2 A053 = A05(A002.A04(), r6, A002.A01());
        if (A053 == null) {
            synchronized (A07) {
                Snapshot A003 = A00();
                AnonymousClass5P2 B6D = r5.B6D();
                0qQ.A0C(B6D, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
                A053 = A05(A003.A04(), B6D, A003.A01());
                if (A053 == null) {
                    A0E();
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
        return A053;
    }

    public static final AnonymousClass5P2 A08(AnonymousClass5P2 r3) {
        Snapshot A002 = A00();
        AnonymousClass5P2 A052 = A05(A002.A04(), r3, A002.A01());
        if (A052 == null) {
            synchronized (A07) {
                Snapshot A003 = A00();
                A052 = A05(A003.A04(), r3, A003.A01());
            }
            if (A052 == null) {
                A0E();
                throw AnonymousClass00P.createAndThrow();
            }
        }
        return A052;
    }

    public static final void A0H(Snapshot snapshot, C284925Ox r2) {
        snapshot.A0B(snapshot.A02() + 1);
        0sP A062 = snapshot.A06();
        if (A062 != null) {
            A062.invoke(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0067, code lost:
        r0 = r8 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0I(X.C284925Ox r10) {
        /*
            boolean r0 = A0J(r10)
            if (r0 == 0) goto L_0x0063
            X.5PA r3 = A0B
            int r5 = r3.A00
            int r4 = java.lang.System.identityHashCode(r10)
            if (r5 <= 0) goto L_0x006b
            int r2 = r5 + -1
            r1 = 0
        L_0x0013:
            if (r1 > r2) goto L_0x004c
            int r0 = r1 + r2
            int r8 = r0 >>> 1
            int[] r7 = r3.A01
            r0 = r7[r8]
            if (r0 >= r4) goto L_0x0022
            int r1 = r8 + 1
            goto L_0x0013
        L_0x0022:
            if (r0 <= r4) goto L_0x0027
            int r2 = r8 + -1
            goto L_0x0013
        L_0x0027:
            X.5PB[] r6 = r3.A02
            r0 = r6[r8]
            if (r0 == 0) goto L_0x004a
            java.lang.Object r0 = r0.get()
        L_0x0031:
            if (r10 == r0) goto L_0x0061
            int r2 = r8 + -1
        L_0x0035:
            r1 = 0
            r0 = -1
            if (r0 >= r2) goto L_0x004f
            r0 = r7[r2]
            if (r0 != r4) goto L_0x004f
            r0 = r6[r2]
            if (r0 == 0) goto L_0x0045
            java.lang.Object r1 = r0.get()
        L_0x0045:
            if (r1 == r10) goto L_0x0063
            int r2 = r2 + -1
            goto L_0x0035
        L_0x004a:
            r0 = 0
            goto L_0x0031
        L_0x004c:
            int r0 = r1 + 1
            goto L_0x0069
        L_0x004f:
            int r8 = r8 + 1
            if (r8 >= r5) goto L_0x0066
            r0 = r7[r8]
            if (r0 != r4) goto L_0x0067
            r0 = r6[r8]
            if (r0 == 0) goto L_0x0064
            java.lang.Object r0 = r0.get()
        L_0x005f:
            if (r0 != r10) goto L_0x004f
        L_0x0061:
            if (r8 < 0) goto L_0x006c
        L_0x0063:
            return
        L_0x0064:
            r0 = r1
            goto L_0x005f
        L_0x0066:
            r8 = r5
        L_0x0067:
            int r0 = r8 + 1
        L_0x0069:
            int r8 = -r0
            goto L_0x0061
        L_0x006b:
            r8 = -1
        L_0x006c:
            int r0 = r8 + 1
            int r6 = -r0
            X.5PB[] r9 = r3.A02
            int r0 = r9.length
            if (r5 != r0) goto L_0x00a7
            int r0 = r0 * 2
            X.5PB[] r8 = new X.AnonymousClass5PB[r0]
            int[] r7 = new int[r0]
            int r2 = r6 + 1
            X.0Yw.A0V(r9, r8, r2, r6, r5)
            X.5PB[] r0 = r3.A02
            r1 = 0
            X.0Yw.A0V(r0, r8, r1, r1, r6)
            int[] r0 = r3.A01
            X.0Yw.A0T(r0, r7, r2, r6, r5)
            int[] r0 = r3.A01
            X.0Yw.A0T(r0, r7, r1, r1, r6)
            r3.A02 = r8
            r3.A01 = r7
        L_0x0093:
            X.5PB[] r1 = r3.A02
            X.5PB r0 = new X.5PB
            r0.<init>(r10)
            r1[r6] = r0
            int[] r0 = r3.A01
            r0[r6] = r4
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
            return
        L_0x00a7:
            int r1 = r6 + 1
            int r0 = r5 - r6
            java.lang.System.arraycopy(r9, r6, r9, r1, r0)
            int[] r0 = r3.A01
            X.0Yw.A0T(r0, r0, r1, r6, r5)
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5P3.A0I(X.5Ox):void");
    }

    public static final boolean A0J(C284925Ox r10) {
        AnonymousClass5P9 r1 = A06;
        int i = A00;
        if (r1.A01 > 0) {
            i = r1.A04[0];
        }
        AnonymousClass5P2 r7 = null;
        AnonymousClass5P2 r0 = null;
        int i2 = 0;
        for (AnonymousClass5P2 B6D = r10.B6D(); B6D != null; B6D = B6D.A01) {
            int i3 = B6D.A00;
            if (i3 != 0) {
                if (i3 >= i) {
                    i2++;
                } else if (r7 == null) {
                    i2++;
                    r7 = B6D;
                } else {
                    AnonymousClass5P2 r9 = B6D;
                    if (B6D.A00 < r7.A00) {
                        r9 = r7;
                        r7 = B6D;
                    }
                    if (r0 == null) {
                        r0 = r10.B6D();
                        AnonymousClass5P2 r3 = r0;
                        while (true) {
                            if (r0 != null) {
                                if (r0.A00 >= i) {
                                    break;
                                }
                                if (r3.A00 < r0.A00) {
                                    r3 = r0;
                                }
                                r0 = r0.A01;
                            } else {
                                r0 = r3;
                                break;
                            }
                        }
                    }
                    r7.A00 = 0;
                    r7.A01(r0);
                    r7 = r9;
                }
            }
        }
        if (i2 > 1) {
            return true;
        }
        return false;
    }
}
