package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.5Wx  reason: invalid class name and case insensitive filesystem */
public final class C286565Wx implements C286575Wy {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06 = -1;
    public C63120yJ A07;
    public AnonymousClass5XQ A08;
    public AnonymousClass5RM A09 = AnonymousClass5RL.A00;
    public AnonymousClass5RM A0A;
    public AnonymousClass5X3 A0B;
    public C286505Wq A0C;
    public AnonymousClass5X4 A0D;
    public AnonymousClass5Ws A0E;
    public AnonymousClass5Ws A0F;
    public AnonymousClass5Ws A0G;
    public AnonymousClass5X8 A0H;
    public C301455zI A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public int[] A0R;
    public AnonymousClass5X7 A0S;
    public final C286475Wm A0T;
    public final AnonymousClass5PL A0U;
    public final C285025Pj A0V;
    public final AnonymousClass5X0 A0W = new AnonymousClass5X0();
    public final AnonymousClass5X0 A0X = new AnonymousClass5X0();
    public final C286505Wq A0Y;
    public final C286585Wz A0Z;
    public final C286585Wz A0a = new C286585Wz();
    public final AnonymousClass5X5 A0b;
    public final List A0c = new ArrayList();
    public final Set A0d;
    public final AnonymousClass5X1 A0e;
    public final AnonymousClass5X0 A0f = new AnonymousClass5X0();

    private final void A0B(int i) {
        A03(this, i, 0, false);
        AnonymousClass5X5.A02(this.A0b);
    }

    public static final void A0H(C286565Wx r4) {
        r4.A08 = null;
        r4.A04 = 0;
        r4.A03 = 0;
        r4.A02 = 0;
        r4.A0M = false;
        AnonymousClass5X5 r1 = r4.A0b;
        r1.A06 = false;
        r1.A0A.A00 = 0;
        r1.A03 = 0;
        r4.A0Z.A00.clear();
        r4.A0R = null;
        r4.A07 = null;
    }

    public static final void A0I(C286565Wx r1) {
        A0L(r1, false);
    }

    public final void AII() {
        this.A0J = true;
        this.A0P = true;
        this.A0Y.A06 = new HashMap();
        this.A0C.A06 = new HashMap();
        AnonymousClass5X4 r2 = this.A0D;
        C286505Wq r1 = r2.A0L;
        r2.A0G = r1.A06;
        r2.A0C = r1.A04;
    }

    public final void ASM() {
        A0L(this, false);
        C286625Xd A0O2 = A0O();
        if (A0O2 != null) {
            int i = A0O2.A01;
            if ((i & 1) != 0) {
                A0O2.A01 = i | 2;
            }
        }
    }

    public final void ASN() {
        A0L(this, true);
    }

    public final void Ewr() {
        A0K(this, (Object) null, (Object) null, -127, 0);
    }

    public final void ExC(int i, Object obj) {
        A0K(this, obj, (Object) null, i, 0);
    }

    public final void ExT(int i) {
        A0K(this, (Object) null, (Object) null, i, 0);
    }

    public final void ExX() {
        A0K(this, (Object) null, (Object) null, 125, 2);
        this.A0M = true;
    }

    private final int A00(int i) {
        int[] iArr = this.A0B.A0A;
        int i2 = 0;
        for (int i3 = iArr[(i * 5) + 2] + 1; i3 < i; i3 += iArr[(i3 * 5) + 3]) {
            if ((iArr[(i3 * 5) + 1] & 536870912) == 0) {
                i2++;
            }
        }
        return i2;
    }

    private final int A01(int i) {
        int i2;
        int A032;
        if (i < 0) {
            C63120yJ r0 = this.A07;
            if (r0 == null || (A032 = r0.A03(i)) < 0) {
                return 0;
            }
            return r0.A03[A032];
        }
        int[] iArr = this.A0R;
        if (iArr == null || (i2 = iArr[i]) < 0) {
            return this.A0B.A0A[(i * 5) + 1] & 67108863;
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r1.equals(X.AnonymousClass5XT.A00) == false) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A02(int r8, int r9, int r10, int r11) {
        /*
            r7 = this;
            if (r8 == r10) goto L_0x0029
            X.5X3 r6 = r7.A0B
            int[] r1 = r6.A0A
            int r5 = r8 * 5
            int r4 = r5 + 1
            r0 = r1[r4]
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x002a
            java.lang.Object r1 = X.AnonymousClass5X3.A00(r6, r1, r8)
            if (r1 == 0) goto L_0x0044
            boolean r0 = r1 instanceof java.lang.Enum
            if (r0 == 0) goto L_0x003f
            java.lang.Enum r1 = (java.lang.Enum) r1
            int r2 = r1.ordinal()
        L_0x0021:
            r0 = 126665345(0x78cc281, float:2.1179178E-34)
            if (r2 != r0) goto L_0x0045
            r11 = 126665345(0x78cc281, float:2.1179178E-34)
        L_0x0029:
            return r11
        L_0x002a:
            r2 = r1[r5]
            r0 = 207(0xcf, float:2.9E-43)
            if (r2 != r0) goto L_0x0021
            java.lang.Object r1 = r6.A05(r8)
            if (r1 == 0) goto L_0x0021
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003f
            goto L_0x0021
        L_0x003f:
            int r2 = r1.hashCode()
            goto L_0x0021
        L_0x0044:
            r2 = 0
        L_0x0045:
            X.5X3 r0 = r7.A0B
            int[] r1 = r0.A0A
            int r0 = r5 + 2
            r1 = r1[r0]
            if (r1 == r10) goto L_0x0057
            int r0 = r7.A00(r1)
            int r11 = r7.A02(r1, r0, r10, r11)
        L_0x0057:
            X.5X3 r0 = r7.A0B
            int[] r0 = r0.A0A
            r0 = r0[r4]
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0061
            r9 = 0
        L_0x0061:
            r1 = 3
            int r0 = java.lang.Integer.rotateLeft(r11, r1)
            r0 = r0 ^ r2
            int r11 = java.lang.Integer.rotateLeft(r0, r1)
            r11 = r11 ^ r9
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C286565Wx.A02(int, int, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e6, code lost:
        if (r9 == false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e8, code lost:
        r0 = r13 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ea, code lost:
        r1 = r1 + A03(r11, r3, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ef, code lost:
        if (r9 == false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f1, code lost:
        r0 = r11.A0b;
        X.AnonymousClass5X5.A02(r0);
        r0.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0104, code lost:
        if (r14 != false) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A03(X.C286565Wx r11, int r12, int r13, boolean r14) {
        /*
            X.5X3 r6 = r11.A0B
            int[] r5 = r6.A0A
            int r4 = r12 * 5
            r3 = 1
            int r9 = r4 + 1
            r1 = r5[r9]
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0011
            r3 = 0
        L_0x0011:
            r10 = 1
            r2 = 0
            if (r3 == 0) goto L_0x00ac
            r3 = r5[r4]
            java.lang.Object r1 = X.AnonymousClass5X3.A00(r6, r5, r12)
            r0 = 126665345(0x78cc281, float:2.1179178E-34)
            if (r3 == r0) goto L_0x010e
            r0 = 206(0xce, float:2.89E-43)
            if (r3 != r0) goto L_0x010e
            java.lang.Object r0 = X.AnonymousClass5XN.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x010e
            java.lang.Object r1 = r6.A06(r12, r2)
            boolean r0 = r1 instanceof X.AnonymousClass6IG
            if (r0 == 0) goto L_0x0117
            X.6IG r1 = (X.AnonymousClass6IG) r1
            if (r1 == 0) goto L_0x0117
            X.5Q1 r0 = r1.A00
            java.util.Set r0 = r0.A03
            java.util.Iterator r8 = r0.iterator()
        L_0x0040:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0117
            java.lang.Object r7 = r8.next()
            X.5Wx r7 = (X.C286565Wx) r7
            X.5Wq r3 = r7.A0Y
            int r0 = r3.A00
            if (r0 <= 0) goto L_0x009b
            int[] r0 = r3.A08
            r1 = r0[r10]
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009b
            X.5Ws r0 = new X.5Ws
            r0.<init>()
            r7.A0F = r0
            X.5X3 r5 = r3.A00()
            r7.A0B = r5     // Catch:{ all -> 0x00a7 }
            X.5X5 r4 = r7.A0b     // Catch:{ all -> 0x00a7 }
            X.5Ws r3 = r4.A05     // Catch:{ all -> 0x00a7 }
            r4.A05 = r0     // Catch:{ all -> 0x00a3 }
            r7.A0B(r2)     // Catch:{ all -> 0x00a3 }
            X.AnonymousClass5X5.A00(r4)     // Catch:{ all -> 0x00a3 }
            boolean r0 = r4.A06     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x0096
            X.5Ws r0 = r4.A05     // Catch:{ all -> 0x00a3 }
            X.5Wu r1 = r0.A00     // Catch:{ all -> 0x00a3 }
            X.XG5 r0 = X.XG5.A00     // Catch:{ all -> 0x00a3 }
            r1.A02(r0)     // Catch:{ all -> 0x00a3 }
            boolean r0 = r4.A06     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x0096
            X.AnonymousClass5X5.A03(r4, r2)     // Catch:{ all -> 0x00a3 }
            X.AnonymousClass5X5.A03(r4, r2)     // Catch:{ all -> 0x00a3 }
            X.5Ws r0 = r4.A05     // Catch:{ all -> 0x00a3 }
            X.5Wu r1 = r0.A00     // Catch:{ all -> 0x00a3 }
            X.5c6 r0 = X.C288555c6.A00     // Catch:{ all -> 0x00a3 }
            r1.A02(r0)     // Catch:{ all -> 0x00a3 }
            r4.A06 = r2     // Catch:{ all -> 0x00a3 }
        L_0x0096:
            r4.A05 = r3     // Catch:{ all -> 0x00a7 }
            r5.A07()
        L_0x009b:
            X.5PL r1 = r11.A0U
            X.5Pj r0 = r7.A0V
            r1.A0A(r0)
            goto L_0x0040
        L_0x00a3:
            r0 = move-exception
            r4.A05 = r3     // Catch:{ all -> 0x00a7 }
            throw r0     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r0 = move-exception
            r5.A07()
            throw r0
        L_0x00ac:
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x010e
            int r0 = r4 + 3
            r4 = r5[r0]
            int r4 = r4 + r12
            int r3 = r12 + 1
            r1 = 0
        L_0x00b9:
            int[] r0 = r6.A0A
            if (r3 >= r4) goto L_0x0107
            boolean r9 = X.AnonymousClass5X6.A03(r0, r3)
            if (r9 == 0) goto L_0x0103
            X.5X5 r7 = r11.A0b
            X.AnonymousClass5X5.A02(r7)
            int[] r8 = r6.A0A
            boolean r0 = X.AnonymousClass5X6.A03(r8, r3)
            if (r0 == 0) goto L_0x0101
            java.lang.Object[] r2 = r6.A0B
            int r0 = r3 * 5
            int r0 = r0 + 4
            r0 = r8[r0]
            r2 = r2[r0]
        L_0x00da:
            X.AnonymousClass5X5.A02(r7)
            X.5Wz r0 = r7.A04
            java.util.ArrayList r0 = r0.A00
            r0.add(r2)
        L_0x00e4:
            r2 = 1
            r0 = 0
            if (r9 != 0) goto L_0x00ea
        L_0x00e8:
            int r0 = r13 + r1
        L_0x00ea:
            int r0 = A03(r11, r3, r0, r2)
            int r1 = r1 + r0
            if (r9 == 0) goto L_0x00f9
            X.5X5 r0 = r11.A0b
            X.AnonymousClass5X5.A02(r0)
            r0.A04()
        L_0x00f9:
            int r0 = r3 * 5
            int r0 = r0 + 3
            r0 = r5[r0]
            int r3 = r3 + r0
            goto L_0x00b9
        L_0x0101:
            r2 = 0
            goto L_0x00da
        L_0x0103:
            r2 = 0
            if (r14 == 0) goto L_0x00e8
            goto L_0x00e4
        L_0x0107:
            boolean r0 = X.AnonymousClass5X6.A03(r0, r12)
            if (r0 == 0) goto L_0x011f
            return r10
        L_0x010e:
            int[] r0 = r6.A0A
            boolean r0 = X.AnonymousClass5X6.A03(r0, r12)
            if (r0 == 0) goto L_0x0117
            return r10
        L_0x0117:
            int[] r0 = r6.A0A
            r1 = r0[r9]
            r0 = 67108863(0x3ffffff, float:1.5046327E-36)
            r1 = r1 & r0
        L_0x011f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C286565Wx.A03(X.5Wx, int, int, boolean):int");
    }

    public static final AnonymousClass5RM A04(C286565Wx r9) {
        Object A052;
        Object obj;
        AnonymousClass5RM r0 = r9.A0A;
        if (r0 == null) {
            int i = r9.A0B.A05;
            if (r9.A0K && r9.A0Q) {
                AnonymousClass5X4 r2 = r9.A0D;
                int i2 = r2.A08;
                while (true) {
                    if (i2 <= 0) {
                        break;
                    }
                    int[] iArr = r2.A0I;
                    if (iArr[AnonymousClass5X4.A00(r2, i2) * 5] == 202) {
                        int A002 = AnonymousClass5X4.A00(r2, i2) * 5;
                        int i3 = iArr[A002 + 1];
                        if ((536870912 & i3) != 0) {
                            obj = r2.A0J[iArr[A002 + 4] + AnonymousClass5X6.A00(i3 >> 30)];
                        } else {
                            obj = null;
                        }
                        if (0qQ.A0K(obj, AnonymousClass5XN.A00)) {
                            AnonymousClass5X4 r6 = r9.A0D;
                            int A003 = AnonymousClass5X4.A00(r6, i2);
                            int[] iArr2 = r6.A0I;
                            int i4 = iArr2[(A003 * 5) + 1];
                            if ((268435456 & i4) != 0) {
                                A052 = r6.A0J[AnonymousClass5X4.A01(r6, iArr2, A003) + AnonymousClass5X6.A00(i4 >> 29)];
                            } else {
                                A052 = AnonymousClass5XT.A00;
                            }
                        }
                    }
                    r2 = r9.A0D;
                    i2 = AnonymousClass5X4.A02(r2, r2.A0I, i2);
                }
                0qQ.A0C(A052, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                r0 = (AnonymousClass5RM) A052;
                r9.A0A = r0;
            }
            AnonymousClass5X3 r3 = r9.A0B;
            if (r3.A08 > 0) {
                while (true) {
                    if (i <= 0) {
                        break;
                    }
                    int[] iArr3 = r3.A0A;
                    int i5 = i * 5;
                    if (iArr3[i5] != 202 || !0qQ.A0K(AnonymousClass5X3.A00(r3, iArr3, i), AnonymousClass5XN.A00)) {
                        r3 = r9.A0B;
                        i = r3.A0A[i5 + 2];
                    } else {
                        C301455zI r02 = r9.A0I;
                        if (r02 == null || (r0 = (AnonymousClass5RM) r02.A00.get(i)) == null) {
                            A052 = r9.A0B.A05(i);
                        }
                    }
                }
                r9.A0A = r0;
            }
            r0 = r9.A09;
            r9.A0A = r0;
        }
        return r0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map, X.5Ya, X.5YZ] */
    public static final AnonymousClass5RL A05(C286565Wx r5, AnonymousClass5RM r6, AnonymousClass5RM r7) {
        AnonymousClass5RL r62 = (AnonymousClass5RL) r6;
        ? r0 = new C286845Ya(r62);
        r0.A00 = r62;
        r0.putAll(r7);
        AnonymousClass5RL A062 = r0.A06();
        A0K(r5, AnonymousClass5XN.A03, (Object) null, 204, 0);
        r5.A0P();
        r5.A0Q(A062);
        r5.A0P();
        r5.A0Q(r7);
        A0L(r5, false);
        return A062;
    }

    private final void A06() {
        C286505Wq r2 = new C286505Wq();
        if (this.A0P) {
            r2.A06 = new HashMap();
        }
        if (this.A0U.A0D()) {
            r2.A04 = new 0yC(6);
        }
        this.A0C = r2;
        AnonymousClass5X4 A012 = r2.A01();
        A012.A0P(true);
        this.A0D = A012;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0087, code lost:
        if ((!r3.ASs(r2.AuM().A04, r5.A03(r2))) != false) goto L_0x0089;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x026f A[EDGE_INSN: B:119:0x026f->B:111:0x026f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x023a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A07() {
        /*
            r31 = this;
            r7 = r31
            boolean r0 = r7.A0L
            r30 = r0
            r26 = 1
            r0 = r26
            r7.A0L = r0
            X.5X3 r2 = r7.A0B
            int r11 = r2.A05
            r10 = r11
            r29 = r11
            int[] r1 = r2.A0A
            int r0 = r11 * 5
            int r0 = r0 + 3
            r9 = r1[r0]
            int r9 = r9 + r11
            int r0 = r7.A04
            r25 = r0
            int r0 = r7.A02
            r28 = r0
            int r8 = r7.A03
            int r0 = r7.A05
            r27 = r0
            java.util.List r12 = r7.A0c
            int r0 = r2.A01
            int r1 = X.AnonymousClass5XN.A00(r12, r0)
            if (r1 >= 0) goto L_0x0037
            int r0 = r1 + 1
            int r1 = -r0
        L_0x0037:
            int r0 = r12.size()
            if (r1 >= r0) goto L_0x028b
            java.lang.Object r13 = r12.get(r1)
            X.5to r13 = (X.C298655to) r13
            int r0 = r13.A01
            if (r0 >= r9) goto L_0x028b
            r24 = 0
        L_0x0049:
            int r6 = r13.A01
            int r0 = X.AnonymousClass5XN.A00(r12, r6)
            if (r0 < 0) goto L_0x0054
            r12.remove(r0)
        L_0x0054:
            X.5Xd r0 = r13.A02
            java.lang.Object r2 = r13.A00
            if (r2 == 0) goto L_0x0089
            X.0vr r5 = r0.A03
            if (r5 == 0) goto L_0x0089
            boolean r0 = r2 instanceof X.AnonymousClass5TY
            if (r0 == 0) goto L_0x013a
            X.5TY r2 = (X.AnonymousClass5TY) r2
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>"
            X.0qQ.A0C(r2, r0)
            r0 = r2
            X.5TX r0 = (X.AnonymousClass5TX) r0
            X.5Os r3 = r0.A01
            if (r3 != 0) goto L_0x0077
            X.5Or r3 = X.C284885Or.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            X.0qQ.A0C(r3, r0)
        L_0x0077:
            X.5TZ r0 = r2.AuM()
            java.lang.Object r1 = r0.A04
            java.lang.Object r0 = r5.A03(r2)
            boolean r0 = r3.ASs(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01bd
        L_0x0089:
            X.5X3 r0 = r7.A0B
            r0.A0B(r6)
            int r11 = r0.A01
            r0 = r29
            r7.A0F(r0, r11, r10)
            r4 = r25
            X.5X3 r0 = r7.A0B
            int[] r1 = r0.A0A
            int r0 = r11 * 5
            r14 = r0
        L_0x009e:
            int r0 = r0 + 2
            r5 = r1[r0]
            if (r5 == r10) goto L_0x00ad
            boolean r0 = X.AnonymousClass5X6.A03(r1, r5)
            if (r0 != 0) goto L_0x00ad
            int r0 = r5 * 5
            goto L_0x009e
        L_0x00ad:
            boolean r0 = X.AnonymousClass5X6.A03(r1, r5)
            if (r0 == 0) goto L_0x00b4
            r4 = 0
        L_0x00b4:
            if (r5 == r11) goto L_0x00ec
            int r3 = r7.A01(r5)
            X.5X3 r0 = r7.A0B
            int[] r1 = r0.A0A
            int r0 = r14 + 1
            r1 = r1[r0]
            r0 = 67108863(0x3ffffff, float:1.5046327E-36)
            r1 = r1 & r0
            int r3 = r3 - r1
            int r3 = r3 + r4
        L_0x00c8:
            if (r4 >= r3) goto L_0x00ec
            if (r5 == r6) goto L_0x00ec
            int r5 = r5 + 1
        L_0x00ce:
            if (r5 >= r6) goto L_0x00ec
            X.5X3 r0 = r7.A0B
            int[] r2 = r0.A0A
            int r0 = r5 * 5
            int r0 = r0 + 3
            r1 = r2[r0]
            int r1 = r1 + r5
            if (r6 < r1) goto L_0x00c8
            boolean r0 = X.AnonymousClass5X6.A03(r2, r5)
            if (r0 == 0) goto L_0x00e7
            r0 = 1
        L_0x00e4:
            int r4 = r4 + r0
            r5 = r1
            goto L_0x00ce
        L_0x00e7:
            int r0 = r7.A01(r5)
            goto L_0x00e4
        L_0x00ec:
            r7.A04 = r4
            int r0 = r7.A00(r11)
            r7.A05 = r0
            X.5X3 r0 = r7.A0B
            r29 = r11
            int[] r1 = r0.A0A
            int r0 = r14 + 2
            r2 = r1[r0]
            int r1 = r7.A00(r2)
            r0 = r28
            int r0 = r7.A02(r2, r1, r10, r0)
            r7.A02 = r0
            r2 = 0
            r7.A0A = r2
            X.5Xd r0 = r13.A02
            X.0sL r1 = r0.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r26)
            if (r1 == 0) goto L_0x025f
            r1.invoke(r7, r0)
            r7.A0A = r2
            X.5X3 r3 = r7.A0B
            int[] r1 = r3.A0A
            int r0 = r10 * 5
            int r0 = r0 + 3
            r1 = r1[r0]
            int r1 = r1 + r10
            int r2 = r3.A01
            r0 = 0
            if (r2 < r10) goto L_0x024f
            if (r2 > r1) goto L_0x024f
            r3.A05 = r10
            r3.A00 = r1
            r3.A02 = r0
            r3.A03 = r0
            r24 = 1
            goto L_0x0230
        L_0x013a:
            boolean r0 = r2 instanceof X.01p
            if (r0 == 0) goto L_0x0089
            X.01p r2 = (X.01p) r2
            int r0 = r2.A01
            if (r0 == 0) goto L_0x01bd
            java.lang.Object[] r0 = r2.A03
            r23 = r0
            long[] r0 = r2.A02
            r22 = r0
            int r0 = r0.length
            int r4 = r0 + -2
            if (r4 < 0) goto L_0x01bd
            r3 = 0
        L_0x0152:
            r20 = r22[r3]
            r14 = -1
            long r14 = r14 ^ r20
            r0 = 7
            long r14 = r14 << r0
            long r14 = r14 & r20
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r1
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01b8
            int r0 = r3 - r4
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            r19 = 8
            int r2 = 8 - r0
            r14 = 0
        L_0x0171:
            if (r14 >= r2) goto L_0x01b4
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r17 & r20
            r15 = 128(0x80, double:6.32E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x01af
            int r0 = r3 << 3
            int r0 = r0 + r14
            r15 = r23[r0]
            boolean r0 = r15 instanceof X.AnonymousClass5TY
            if (r0 == 0) goto L_0x0089
            X.5TY r15 = (X.AnonymousClass5TY) r15
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>"
            X.0qQ.A0C(r15, r0)
            r0 = r15
            X.5TX r0 = (X.AnonymousClass5TX) r0
            X.5Os r1 = r0.A01
            if (r1 != 0) goto L_0x019b
            X.5Or r1 = X.C284885Or.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            X.0qQ.A0C(r1, r0)
        L_0x019b:
            X.5TZ r0 = r15.AuM()
            java.lang.Object r0 = r0.A04
            java.lang.Object r15 = r5.A03(r15)
            boolean r0 = r1.ASs(r0, r15)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01af
            goto L_0x0089
        L_0x01af:
            long r20 = r20 >> r19
            int r14 = r14 + 1
            goto L_0x0171
        L_0x01b4:
            r0 = r19
            if (r2 != r0) goto L_0x01bd
        L_0x01b8:
            if (r3 == r4) goto L_0x01bd
            int r3 = r3 + 1
            goto L_0x0152
        L_0x01bd:
            X.5Wz r0 = r7.A0Z
            X.5Xd r3 = r13.A02
            java.util.ArrayList r4 = r0.A00
            r4.add(r3)
            X.5Wo r14 = r3.A05
            if (r14 == 0) goto L_0x0227
            X.0vu r1 = r3.A02
            if (r1 == 0) goto L_0x0227
            int r0 = r3.A01
            r0 = r0 | 32
            r3.A01 = r0
            java.lang.Object[] r0 = r1.A04     // Catch:{ all -> 0x0267 }
            r22 = r0
            long[] r15 = r1.A03     // Catch:{ all -> 0x0267 }
            int r0 = r15.length     // Catch:{ all -> 0x0267 }
            int r13 = r0 + -2
            if (r13 < 0) goto L_0x0221
            r6 = 0
        L_0x01e0:
            r20 = r15[r6]     // Catch:{ all -> 0x0267 }
            r16 = -1
            long r16 = r16 ^ r20
            r0 = 7
            long r16 = r16 << r0
            long r16 = r16 & r20
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r16 = r16 & r1
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x021c
            int r0 = r6 - r13
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            r5 = 8
            int r2 = 8 - r0
            r1 = 0
        L_0x0201:
            if (r1 >= r2) goto L_0x021a
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r18 & r20
            r16 = 128(0x80, double:6.32E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x0215
            int r0 = r6 << 3
            int r0 = r0 + r1
            r0 = r22[r0]     // Catch:{ all -> 0x0267 }
            r14.EAv(r0)     // Catch:{ all -> 0x0267 }
        L_0x0215:
            long r20 = r20 >> r5
            int r1 = r1 + 1
            goto L_0x0201
        L_0x021a:
            if (r2 != r5) goto L_0x0221
        L_0x021c:
            if (r6 == r13) goto L_0x0221
            int r6 = r6 + 1
            goto L_0x01e0
        L_0x0221:
            int r0 = r3.A01
            r0 = r0 & -33
            r3.A01 = r0
        L_0x0227:
            int r0 = r4.size()
            int r0 = r0 + -1
            r4.remove(r0)
        L_0x0230:
            X.5X3 r0 = r7.A0B
            int r0 = r0.A01
            int r1 = X.AnonymousClass5XN.A00(r12, r0)
            if (r1 >= 0) goto L_0x023d
            int r0 = r1 + 1
            int r1 = -r0
        L_0x023d:
            int r0 = r12.size()
            if (r1 >= r0) goto L_0x026f
            java.lang.Object r13 = r12.get(r1)
            X.5to r13 = (X.C298655to) r13
            int r0 = r13.A01
            if (r0 >= r9) goto L_0x026f
            goto L_0x0049
        L_0x024f:
            java.lang.String r1 = "Index "
            java.lang.String r0 = " is not a parent of "
            java.lang.String r0 = X.002.A02(r10, r2, r1, r0)
            X.AnonymousClass5XN.A03(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x025f:
            java.lang.String r0 = "Invalid restart scope"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0267:
            r1 = move-exception
            int r0 = r3.A01
            r0 = r0 & -33
            r3.A01 = r0
            throw r1
        L_0x026f:
            if (r24 == 0) goto L_0x028b
            r7.A0F(r11, r10, r10)
            X.5X3 r0 = r7.A0B
            r0.A09()
            int r1 = r7.A01(r10)
            int r25 = r25 + r1
            r0 = r25
            r7.A04 = r0
            int r8 = r8 + r1
            r7.A03 = r8
            r0 = r27
            r7.A05 = r0
            goto L_0x028e
        L_0x028b:
            r7.A09()
        L_0x028e:
            r0 = r28
            r7.A02 = r0
            r0 = r30
            r7.A0L = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C286565Wx.A07():void");
    }

    private final void A08() {
        A0B(this.A0B.A01);
        AnonymousClass5X5 r3 = this.A0b;
        AnonymousClass5X5.A01(r3);
        r3.A05.A00.A02(C288585c9.A00);
        int i = r3.A03;
        AnonymousClass5X3 r0 = r3.A09.A0B;
        r3.A03 = i + r0.A0A[(r0.A01 * 5) + 3];
    }

    private final void A09() {
        int i;
        AnonymousClass5X3 r2 = this.A0B;
        int i2 = r2.A05;
        if (i2 >= 0) {
            i = r2.A0A[(i2 * 5) + 1] & 67108863;
        } else {
            i = 0;
        }
        this.A03 = i;
        r2.A09();
    }

    private final void A0A() {
        if (!(!this.A0M)) {
            AnonymousClass5XN.A03("A call to createNode(), emitNode() or useNode() expected");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    private final void A0C(int i, int i2) {
        Object obj;
        if (i > 0 && i != i2) {
            int i3 = i * 5;
            A0C(this.A0B.A0A[i3 + 2], i2);
            AnonymousClass5X3 r1 = this.A0B;
            if (AnonymousClass5X6.A03(r1.A0A, i)) {
                AnonymousClass5X5 r3 = this.A0b;
                int[] iArr = r1.A0A;
                if (AnonymousClass5X6.A03(iArr, i)) {
                    obj = r1.A0B[iArr[i3 + 4]];
                } else {
                    obj = null;
                }
                AnonymousClass5X5.A02(r3);
                r3.A04.A00.add(obj);
            }
        }
    }

    private final void A0F(int i, int i2, int i3) {
        AnonymousClass5X3 r4 = this.A0B;
        int i4 = i;
        int i5 = i2;
        if (i != i2) {
            if (i == i3 || i2 == i3) {
                i4 = i3;
            } else {
                int[] iArr = r4.A0A;
                int i6 = iArr[(i * 5) + 2];
                if (i6 == i2) {
                    i4 = i2;
                } else {
                    int i7 = iArr[(i2 * 5) + 2];
                    if (i7 != i) {
                        if (i6 == i7) {
                            i4 = i6;
                        } else {
                            int i8 = i;
                            int i9 = 0;
                            while (i8 > 0 && i8 != i3) {
                                i8 = iArr[(i8 * 5) + 2];
                                i9++;
                            }
                            int i10 = i2;
                            int i11 = 0;
                            while (i10 > 0 && i10 != i3) {
                                i10 = iArr[(i10 * 5) + 2];
                                i11++;
                            }
                            int i12 = i9 - i11;
                            for (int i13 = 0; i13 < i12; i13++) {
                                i4 = iArr[(i4 * 5) + 2];
                            }
                            int i14 = i11 - i9;
                            for (int i15 = 0; i15 < i14; i15++) {
                                i5 = iArr[(i5 * 5) + 2];
                            }
                            while (i4 != i5) {
                                i4 = iArr[(i4 * 5) + 2];
                                i5 = iArr[(i5 * 5) + 2];
                            }
                        }
                    }
                }
            }
        }
        while (i > 0 && i != i4) {
            if (AnonymousClass5X6.A03(r4.A0A, i)) {
                this.A0b.A04();
            }
            i = r4.A0A[(i * 5) + 2];
        }
        A0C(i2, i4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x026c A[Catch:{ all -> 0x02de, all -> 0x02e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x027f A[Catch:{ all -> 0x02de, all -> 0x02e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0299 A[Catch:{ all -> 0x02de, all -> 0x02e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02a9 A[Catch:{ all -> 0x02de, all -> 0x02e6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0J(X.C286565Wx r17, X.C286515Wr r18, X.0sL r19) {
        /*
            r13 = r17
            boolean r0 = r13.A0L
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "Reentrant composition is not supported"
            X.AnonymousClass5XN.A03(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0012:
            java.lang.String r1 = "Compose:recompose"
            r0 = 1854082573(0x6e830e0d, float:2.0279761E28)
            X.0fg.A01(r1, r0)
            r14 = 0
            androidx.compose.runtime.snapshots.Snapshot r0 = X.AnonymousClass5P3.A00()     // Catch:{ all -> 0x02fa }
            int r0 = r0.A01()     // Catch:{ all -> 0x02fa }
            r13.A01 = r0     // Catch:{ all -> 0x02fa }
            r13.A0I = r14     // Catch:{ all -> 0x02fa }
            r0 = r18
            X.0vr r0 = r0.A00     // Catch:{ all -> 0x02fa }
            java.lang.Object[] r10 = r0.A03     // Catch:{ all -> 0x02fa }
            java.lang.Object[] r9 = r0.A04     // Catch:{ all -> 0x02fa }
            long[] r8 = r0.A02     // Catch:{ all -> 0x02fa }
            int r7 = r8.length     // Catch:{ all -> 0x02fa }
            r2 = 2
            int r7 = r7 - r2
            if (r7 < 0) goto L_0x0093
            r6 = 0
        L_0x0037:
            r17 = r8[r6]     // Catch:{ all -> 0x02fa }
            r11 = -1
            long r11 = r11 ^ r17
            r0 = 7
            long r11 = r11 << r0
            long r11 = r11 & r17
            r3 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r3
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x008e
            int r0 = r6 - r7
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r5 = 8 - r0
            r11 = 0
        L_0x0054:
            if (r11 >= r5) goto L_0x008a
            r0 = 255(0xff, double:1.26E-321)
            long r15 = r17 & r0
            r3 = 128(0x80, double:6.32E-322)
            int r0 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0083
            int r0 = r6 << 3
            int r0 = r0 + r11
            r12 = r10[r0]     // Catch:{ all -> 0x02fa }
            r4 = r9[r0]     // Catch:{ all -> 0x02fa }
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            X.0qQ.A0C(r12, r0)     // Catch:{ all -> 0x02fa }
            X.5Xd r12 = (X.C286625Xd) r12     // Catch:{ all -> 0x02fa }
            X.5X7 r0 = r12.A04     // Catch:{ all -> 0x02fa }
            if (r0 == 0) goto L_0x0083
            int r3 = r0.A00     // Catch:{ all -> 0x02fa }
            java.util.List r1 = r13.A0c     // Catch:{ all -> 0x02fa }
            X.5tl r0 = X.C298625tl.A00     // Catch:{ all -> 0x02fa }
            if (r4 != r0) goto L_0x007b
            r4 = 0
        L_0x007b:
            X.5to r0 = new X.5to     // Catch:{ all -> 0x02fa }
            r0.<init>(r12, r4, r3)     // Catch:{ all -> 0x02fa }
            r1.add(r0)     // Catch:{ all -> 0x02fa }
        L_0x0083:
            r0 = 8
            long r17 = r17 >> r0
            int r11 = r11 + 1
            goto L_0x0054
        L_0x008a:
            r0 = 8
            if (r5 != r0) goto L_0x0093
        L_0x008e:
            if (r6 == r7) goto L_0x0093
            int r6 = r6 + 1
            goto L_0x0037
        L_0x0093:
            java.util.List r0 = r13.A0c     // Catch:{ all -> 0x02fa }
            r17 = r0
            java.util.Comparator r1 = X.AnonymousClass5XN.A05     // Catch:{ all -> 0x02fa }
            X.01V.A1D(r0, r1)     // Catch:{ all -> 0x02fa }
            r12 = 0
            r13.A04 = r12     // Catch:{ all -> 0x02fa }
            r11 = 1
            r13.A0L = r11     // Catch:{ all -> 0x02fa }
            r13.A05 = r12     // Catch:{ all -> 0x02e6 }
            X.5Wq r4 = r13.A0Y     // Catch:{ all -> 0x02e6 }
            X.5X3 r0 = r4.A00()     // Catch:{ all -> 0x02e6 }
            r13.A0B = r0     // Catch:{ all -> 0x02e6 }
            r0 = 100
            A0K(r13, r14, r14, r0, r12)     // Catch:{ all -> 0x02e6 }
            X.5PL r10 = r13.A0U     // Catch:{ all -> 0x02e6 }
            boolean r9 = r10 instanceof X.AnonymousClass5Q1     // Catch:{ all -> 0x02e6 }
            if (r9 == 0) goto L_0x00c2
            r0 = r10
            X.5Q1 r0 = (X.AnonymousClass5Q1) r0     // Catch:{ all -> 0x02e6 }
            X.5Wx r1 = r0.A07     // Catch:{ all -> 0x02e6 }
            int r0 = r1.A00     // Catch:{ all -> 0x02e6 }
            int r0 = r0 + 1
            r1.A00 = r0     // Catch:{ all -> 0x02e6 }
        L_0x00c2:
            if (r9 == 0) goto L_0x00c5
            goto L_0x00c8
        L_0x00c5:
            X.5RM r0 = X.AnonymousClass5XW.A00     // Catch:{ all -> 0x02e6 }
            goto L_0x00d3
        L_0x00c8:
            r0 = r10
            X.5Q1 r0 = (X.AnonymousClass5Q1) r0     // Catch:{ all -> 0x02e6 }
            X.5Oz r0 = r0.A02     // Catch:{ all -> 0x02e6 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x02e6 }
            X.5RM r0 = (X.AnonymousClass5RM) r0     // Catch:{ all -> 0x02e6 }
        L_0x00d3:
            r13.A09 = r0     // Catch:{ all -> 0x02e6 }
            X.5X0 r8 = r13.A0X     // Catch:{ all -> 0x02e6 }
            boolean r0 = r13.A0N     // Catch:{ all -> 0x02e6 }
            r8.A00(r0)     // Catch:{ all -> 0x02e6 }
            X.5RM r0 = r13.A09     // Catch:{ all -> 0x02e6 }
            boolean r0 = r13.AGu(r0)     // Catch:{ all -> 0x02e6 }
            r13.A0N = r0     // Catch:{ all -> 0x02e6 }
            r13.A0A = r14     // Catch:{ all -> 0x02e6 }
            boolean r0 = r13.A0J     // Catch:{ all -> 0x02e6 }
            if (r0 != 0) goto L_0x00f7
            boolean r0 = r10 instanceof androidx.compose.runtime.Recomposer     // Catch:{ all -> 0x02e6 }
            if (r0 == 0) goto L_0x00f0
            r0 = 0
            goto L_0x00f5
        L_0x00f0:
            r0 = r10
            X.5Q1 r0 = (X.AnonymousClass5Q1) r0     // Catch:{ all -> 0x02e6 }
            boolean r0 = r0.A04     // Catch:{ all -> 0x02e6 }
        L_0x00f5:
            r13.A0J = r0     // Catch:{ all -> 0x02e6 }
        L_0x00f7:
            boolean r0 = r13.A0P     // Catch:{ all -> 0x02e6 }
            if (r0 != 0) goto L_0x0108
            boolean r0 = r10 instanceof androidx.compose.runtime.Recomposer     // Catch:{ all -> 0x02e6 }
            if (r0 == 0) goto L_0x0101
            r0 = 0
            goto L_0x0106
        L_0x0101:
            r0 = r10
            X.5Q1 r0 = (X.AnonymousClass5Q1) r0     // Catch:{ all -> 0x02e6 }
            boolean r0 = r0.A05     // Catch:{ all -> 0x02e6 }
        L_0x0106:
            r13.A0P = r0     // Catch:{ all -> 0x02e6 }
        L_0x0108:
            X.5RM r1 = r13.A09     // Catch:{ all -> 0x02e6 }
            X.4bM r0 = X.AnonymousClass5XX.A00     // Catch:{ all -> 0x02e6 }
            java.lang.Object r3 = X.C286615Xc.A01(r0, r1)     // Catch:{ all -> 0x02e6 }
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ all -> 0x02e6 }
            if (r3 == 0) goto L_0x012c
            r3.add(r4)     // Catch:{ all -> 0x02e6 }
            boolean r0 = r10 instanceof androidx.compose.runtime.Recomposer     // Catch:{ all -> 0x02e6 }
            if (r0 != 0) goto L_0x012c
            r1 = r10
            X.5Q1 r1 = (X.AnonymousClass5Q1) r1     // Catch:{ all -> 0x02e6 }
            java.util.Set r0 = r1.A00     // Catch:{ all -> 0x02e6 }
            if (r0 != 0) goto L_0x0129
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x02e6 }
            r0.<init>()     // Catch:{ all -> 0x02e6 }
            r1.A00 = r0     // Catch:{ all -> 0x02e6 }
        L_0x0129:
            r0.add(r3)     // Catch:{ all -> 0x02e6 }
        L_0x012c:
            boolean r0 = r10 instanceof androidx.compose.runtime.Recomposer     // Catch:{ all -> 0x02e6 }
            if (r0 == 0) goto L_0x0133
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0138
        L_0x0133:
            r0 = r10
            X.5Q1 r0 = (X.AnonymousClass5Q1) r0     // Catch:{ all -> 0x02e6 }
            int r0 = r0.A01     // Catch:{ all -> 0x02e6 }
        L_0x0138:
            A0K(r13, r14, r14, r0, r12)     // Catch:{ all -> 0x02e6 }
            java.lang.Object r3 = r13.A0P()     // Catch:{ all -> 0x02e6 }
            r4 = r19
            if (r3 == r4) goto L_0x0148
            if (r19 == 0) goto L_0x0148
            r13.A0Q(r4)     // Catch:{ all -> 0x02e6 }
        L_0x0148:
            X.5X1 r0 = r13.A0e     // Catch:{ all -> 0x02e6 }
            X.5Pl r7 = X.AnonymousClass5XF.A00()     // Catch:{ all -> 0x02e6 }
            r7.A09(r0)     // Catch:{ all -> 0x02de }
            if (r19 == 0) goto L_0x0165
            java.lang.Object r1 = X.AnonymousClass5XN.A01     // Catch:{ all -> 0x02de }
            r0 = 200(0xc8, float:2.8E-43)
            A0K(r13, r1, r14, r0, r12)     // Catch:{ all -> 0x02de }
            X.0u4.A05(r4, r2)     // Catch:{ all -> 0x02de }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x02de }
            r4.invoke(r13, r0)     // Catch:{ all -> 0x02de }
            goto L_0x018e
        L_0x0165:
            boolean r0 = r13.A0N     // Catch:{ all -> 0x02de }
            if (r0 == 0) goto L_0x0193
            if (r3 == 0) goto L_0x0193
            java.lang.Object r0 = X.AnonymousClass5XT.A00     // Catch:{ all -> 0x02de }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x02de }
            if (r0 != 0) goto L_0x0193
            java.lang.Object r1 = X.AnonymousClass5XN.A01     // Catch:{ all -> 0x02de }
            r0 = 200(0xc8, float:2.8E-43)
            A0K(r13, r1, r14, r0, r12)     // Catch:{ all -> 0x02de }
            X.0u4.A05(r3, r2)     // Catch:{ all -> 0x02de }
            X.0sL r3 = (X.0sL) r3     // Catch:{ all -> 0x02de }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>"
            X.0qQ.A0C(r3, r0)     // Catch:{ all -> 0x02de }
            X.0u4.A05(r3, r2)     // Catch:{ all -> 0x02de }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x02de }
            r3.invoke(r13, r0)     // Catch:{ all -> 0x02de }
        L_0x018e:
            A0L(r13, r12)     // Catch:{ all -> 0x02de }
            goto L_0x0260
        L_0x0193:
            boolean r0 = r17.isEmpty()     // Catch:{ all -> 0x02de }
            if (r0 == 0) goto L_0x01a6
            int r1 = r13.A03     // Catch:{ all -> 0x02de }
            X.5X3 r0 = r13.A0B     // Catch:{ all -> 0x02de }
            int r0 = r0.A01()     // Catch:{ all -> 0x02de }
            int r1 = r1 + r0
            r13.A03 = r1     // Catch:{ all -> 0x02de }
            goto L_0x0260
        L_0x01a6:
            X.5X3 r6 = r13.A0B     // Catch:{ all -> 0x02de }
            int r3 = r6.A01     // Catch:{ all -> 0x02de }
            int r2 = r6.A00     // Catch:{ all -> 0x02de }
            if (r3 >= r2) goto L_0x01b5
            int[] r1 = r6.A0A     // Catch:{ all -> 0x02de }
            int r0 = r3 * 5
            r5 = r1[r0]     // Catch:{ all -> 0x02de }
            goto L_0x01b6
        L_0x01b5:
            r5 = 0
        L_0x01b6:
            if (r3 >= r2) goto L_0x01b9
            goto L_0x01bb
        L_0x01b9:
            r4 = 0
            goto L_0x01c1
        L_0x01bb:
            int[] r0 = r6.A0A     // Catch:{ all -> 0x02de }
            java.lang.Object r4 = X.AnonymousClass5X3.A00(r6, r0, r3)     // Catch:{ all -> 0x02de }
        L_0x01c1:
            java.lang.Object r3 = r6.A03()     // Catch:{ all -> 0x02de }
            int r2 = r13.A05     // Catch:{ all -> 0x02de }
            r16 = 207(0xcf, float:2.9E-43)
            r1 = 3
            if (r4 != 0) goto L_0x01d3
            if (r3 == 0) goto L_0x021b
            r0 = r16
            if (r5 != r0) goto L_0x021b
            goto L_0x01ef
        L_0x01d3:
            boolean r0 = r4 instanceof java.lang.Enum     // Catch:{ all -> 0x02de }
            if (r0 == 0) goto L_0x01ea
            r0 = r4
            java.lang.Enum r0 = (java.lang.Enum) r0     // Catch:{ all -> 0x02de }
            int r15 = r0.ordinal()     // Catch:{ all -> 0x02de }
        L_0x01de:
            int r0 = r13.A02     // Catch:{ all -> 0x02de }
            int r0 = java.lang.Integer.rotateLeft(r0, r1)     // Catch:{ all -> 0x02de }
            r15 = r15 ^ r0
            int r0 = java.lang.Integer.rotateLeft(r15, r1)     // Catch:{ all -> 0x02de }
            goto L_0x0207
        L_0x01ea:
            int r15 = r4.hashCode()     // Catch:{ all -> 0x02de }
            goto L_0x01de
        L_0x01ef:
            java.lang.Object r0 = X.AnonymousClass5XT.A00     // Catch:{ all -> 0x02de }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x02de }
            if (r0 != 0) goto L_0x021b
            int r15 = r3.hashCode()     // Catch:{ all -> 0x02de }
            int r0 = r13.A02     // Catch:{ all -> 0x02de }
            int r0 = java.lang.Integer.rotateLeft(r0, r1)     // Catch:{ all -> 0x02de }
            r15 = r15 ^ r0
        L_0x0202:
            int r0 = java.lang.Integer.rotateLeft(r15, r1)     // Catch:{ all -> 0x02de }
            r0 = r0 ^ r2
        L_0x0207:
            r13.A02 = r0     // Catch:{ all -> 0x02de }
            int[] r0 = r6.A0A     // Catch:{ all -> 0x02de }
            int r15 = r6.A01     // Catch:{ all -> 0x02de }
            boolean r0 = X.AnonymousClass5X6.A03(r0, r15)     // Catch:{ all -> 0x02de }
            r13.A0N(r0, r14)     // Catch:{ all -> 0x02de }
            r13.A07()     // Catch:{ all -> 0x02de }
            r6.A08()     // Catch:{ all -> 0x02de }
            goto L_0x0223
        L_0x021b:
            int r0 = r13.A02     // Catch:{ all -> 0x02de }
            int r15 = java.lang.Integer.rotateLeft(r0, r1)     // Catch:{ all -> 0x02de }
            r15 = r15 ^ r5
            goto L_0x0202
        L_0x0223:
            if (r4 != 0) goto L_0x0243
            if (r3 == 0) goto L_0x023b
            r0 = r16
            if (r5 != r0) goto L_0x023b
            java.lang.Object r0 = X.AnonymousClass5XT.A00     // Catch:{ all -> 0x02de }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x02de }
            if (r0 != 0) goto L_0x023b
            int r3 = r3.hashCode()     // Catch:{ all -> 0x02de }
            int r0 = r13.A02     // Catch:{ all -> 0x02de }
            r0 = r0 ^ r2
            goto L_0x024f
        L_0x023b:
            int r0 = r13.A02     // Catch:{ all -> 0x02de }
            r0 = r0 ^ r2
            int r3 = java.lang.Integer.rotateRight(r0, r1)     // Catch:{ all -> 0x02de }
            goto L_0x0253
        L_0x0243:
            boolean r0 = r4 instanceof java.lang.Enum     // Catch:{ all -> 0x02de }
            if (r0 == 0) goto L_0x025b
            java.lang.Enum r4 = (java.lang.Enum) r4     // Catch:{ all -> 0x02de }
            int r3 = r4.ordinal()     // Catch:{ all -> 0x02de }
        L_0x024d:
            int r0 = r13.A02     // Catch:{ all -> 0x02de }
        L_0x024f:
            int r5 = java.lang.Integer.rotateRight(r0, r1)     // Catch:{ all -> 0x02de }
        L_0x0253:
            r3 = r3 ^ r5
            int r0 = java.lang.Integer.rotateRight(r3, r1)     // Catch:{ all -> 0x02de }
            r13.A02 = r0     // Catch:{ all -> 0x02de }
            goto L_0x0260
        L_0x025b:
            int r3 = r4.hashCode()     // Catch:{ all -> 0x02de }
            goto L_0x024d
        L_0x0260:
            int r0 = r7.A00     // Catch:{ all -> 0x02e6 }
            int r0 = r0 - r11
            r7.A00(r0)     // Catch:{ all -> 0x02e6 }
            r2 = 0
            A0L(r13, r12)     // Catch:{ all -> 0x02e6 }
            if (r9 == 0) goto L_0x0276
            X.5Q1 r10 = (X.AnonymousClass5Q1) r10     // Catch:{ all -> 0x02e6 }
            X.5Wx r1 = r10.A07     // Catch:{ all -> 0x02e6 }
            int r0 = r1.A00     // Catch:{ all -> 0x02e6 }
            int r0 = r0 + -1
            r1.A00 = r0     // Catch:{ all -> 0x02e6 }
        L_0x0276:
            A0L(r13, r12)     // Catch:{ all -> 0x02e6 }
            X.5X5 r3 = r13.A0b     // Catch:{ all -> 0x02e6 }
            boolean r0 = r3.A06     // Catch:{ all -> 0x02e6 }
            if (r0 == 0) goto L_0x0290
            X.AnonymousClass5X5.A03(r3, r12)     // Catch:{ all -> 0x02e6 }
            X.AnonymousClass5X5.A03(r3, r12)     // Catch:{ all -> 0x02e6 }
            X.5Ws r0 = r3.A05     // Catch:{ all -> 0x02e6 }
            X.5Wu r1 = r0.A00     // Catch:{ all -> 0x02e6 }
            X.5c6 r0 = X.C288555c6.A00     // Catch:{ all -> 0x02e6 }
            r1.A02(r0)     // Catch:{ all -> 0x02e6 }
            r3.A06 = r12     // Catch:{ all -> 0x02e6 }
        L_0x0290:
            X.AnonymousClass5X5.A00(r3)     // Catch:{ all -> 0x02e6 }
            X.5X0 r0 = r3.A0A     // Catch:{ all -> 0x02e6 }
            int r0 = r0.A00     // Catch:{ all -> 0x02e6 }
            if (r0 != 0) goto L_0x02a9
            X.5Wz r0 = r13.A0a     // Catch:{ all -> 0x02e6 }
            java.util.ArrayList r0 = r0.A00     // Catch:{ all -> 0x02e6 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x02e6 }
            if (r0 != 0) goto L_0x02b1
            java.lang.String r0 = "Start/end imbalance"
        L_0x02a5:
            X.AnonymousClass5XN.A03(r0)     // Catch:{ all -> 0x02e6 }
            goto L_0x02ac
        L_0x02a9:
            java.lang.String r0 = "Missed recording an endGroup()"
            goto L_0x02a5
        L_0x02ac:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            goto L_0x02e5
        L_0x02b1:
            A0H(r13)     // Catch:{ all -> 0x02e6 }
            X.5X3 r0 = r13.A0B     // Catch:{ all -> 0x02e6 }
            r0.A07()     // Catch:{ all -> 0x02e6 }
            int[] r1 = r8.A01     // Catch:{ all -> 0x02e6 }
            int r0 = r8.A00     // Catch:{ all -> 0x02e6 }
            int r0 = r0 + -1
            r8.A00 = r0     // Catch:{ all -> 0x02e6 }
            r0 = r1[r0]     // Catch:{ all -> 0x02e6 }
            if (r0 == 0) goto L_0x02c6
            r2 = 1
        L_0x02c6:
            r13.A0N = r2     // Catch:{ all -> 0x02e6 }
            r13.A0L = r12     // Catch:{ all -> 0x02fa }
            r17.clear()     // Catch:{ all -> 0x02fa }
            X.5X4 r0 = r13.A0D     // Catch:{ all -> 0x02fa }
            boolean r0 = r0.A0H     // Catch:{ all -> 0x02fa }
            X.AnonymousClass5XN.A06(r0)     // Catch:{ all -> 0x02fa }
            r13.A06()     // Catch:{ all -> 0x02fa }
            r0 = 1166705813(0x458a8495, float:4432.5728)
            X.0fg.A00(r0)
            return
        L_0x02de:
            r1 = move-exception
            int r0 = r7.A00     // Catch:{ all -> 0x02e6 }
            int r0 = r0 - r11
            r7.A00(r0)     // Catch:{ all -> 0x02e6 }
        L_0x02e5:
            throw r1     // Catch:{ all -> 0x02e6 }
        L_0x02e6:
            r1 = move-exception
            r13.A0L = r12     // Catch:{ all -> 0x02fa }
            r17.clear()     // Catch:{ all -> 0x02fa }
            A0G(r13)     // Catch:{ all -> 0x02fa }
            X.5X4 r0 = r13.A0D     // Catch:{ all -> 0x02fa }
            boolean r0 = r0.A0H     // Catch:{ all -> 0x02fa }
            X.AnonymousClass5XN.A06(r0)     // Catch:{ all -> 0x02fa }
            r13.A06()     // Catch:{ all -> 0x02fa }
            throw r1     // Catch:{ all -> 0x02fa }
        L_0x02fa:
            r1 = move-exception
            r0 = 1166705813(0x458a8495, float:4432.5728)
            X.0fg.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C286565Wx.A0J(X.5Wx, X.5Wr, X.0sL):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.5XS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.5XS} */
    /* JADX WARNING: type inference failed for: r0v17, types: [X.5XV, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v110, types: [X.5XV, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0298, code lost:
        if (r12 == r0) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a2, code lost:
        if (r8.A0O == false) goto L_0x00a4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0K(X.C286565Wx r26, java.lang.Object r27, java.lang.Object r28, int r29, int r30) {
        /*
            r8 = r26
            r7 = r28
            r10 = r27
            r8.A0A()
            int r3 = r8.A05
            r6 = 0
            r2 = 3
            r9 = r29
            if (r27 != 0) goto L_0x0328
            if (r28 == 0) goto L_0x031e
            r0 = 207(0xcf, float:2.9E-43)
            if (r9 != r0) goto L_0x031e
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x031e
            int r1 = r7.hashCode()
            int r0 = r8.A02
            int r0 = java.lang.Integer.rotateLeft(r0, r2)
            r1 = r1 ^ r0
        L_0x002a:
            int r0 = java.lang.Integer.rotateLeft(r1, r2)
            r3 = r3 ^ r0
        L_0x002f:
            r8.A02 = r3
            r5 = 1
            if (r27 != 0) goto L_0x003a
            int r0 = r8.A05
            int r0 = r0 + 1
            r8.A05 = r0
        L_0x003a:
            r4 = 0
            r1 = r30
            if (r1 == r6) goto L_0x0040
            r4 = 1
        L_0x0040:
            boolean r0 = r8.A0K
            r3 = -1
            r2 = 0
            if (r0 == 0) goto L_0x009c
            X.5X3 r1 = r8.A0B
            int r0 = r1.A04
            int r0 = r0 + 1
            r1.A04 = r0
            X.5X4 r1 = r8.A0D
            int r12 = r1.A00
            if (r4 == 0) goto L_0x0088
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            X.AnonymousClass5X4.A0E(r1, r0, r0, r9, r5)
        L_0x0059:
            X.5XQ r11 = r8.A08
            if (r11 == 0) goto L_0x0084
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            int r0 = -2 - r12
            X.5XS r10 = new X.5XS
            r10.<init>(r1, r9, r0, r3)
            int r7 = r8.A04
            int r0 = r11.A01
            int r7 = r7 - r0
            X.0yC r5 = r11.A02
            int r1 = r10.A01
            X.5XV r0 = new X.5XV
            r0.<init>()
            r0.A02 = r3
            r0.A01 = r7
            r0.A00 = r6
            r5.A08(r1, r0)
            java.util.List r0 = r11.A04
            r0.add(r10)
        L_0x0084:
            r8.A0M(r2, r4)
            return
        L_0x0088:
            if (r28 == 0) goto L_0x0092
            if (r27 != 0) goto L_0x008e
            java.lang.Object r10 = X.AnonymousClass5XT.A00
        L_0x008e:
            X.AnonymousClass5X4.A0E(r1, r10, r7, r9, r6)
            goto L_0x0059
        L_0x0092:
            if (r27 != 0) goto L_0x0096
            java.lang.Object r10 = X.AnonymousClass5XT.A00
        L_0x0096:
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            X.AnonymousClass5X4.A0E(r1, r10, r0, r9, r6)
            goto L_0x0059
        L_0x009c:
            if (r1 != r5) goto L_0x00a4
            boolean r0 = r8.A0O
            r18 = 1
            if (r0 != 0) goto L_0x00a6
        L_0x00a4:
            r18 = 0
        L_0x00a6:
            X.5XQ r0 = r8.A08
            if (r0 != 0) goto L_0x00cd
            X.5X3 r13 = r8.A0B
            int r12 = r13.A01
            int r11 = r13.A00
            if (r12 >= r11) goto L_0x01f8
            int[] r1 = r13.A0A
            int r0 = r12 * 5
            r0 = r1[r0]
        L_0x00b8:
            if (r18 != 0) goto L_0x01aa
            if (r0 != r9) goto L_0x01aa
            if (r12 >= r11) goto L_0x01a7
            int[] r0 = r13.A0A
            java.lang.Object r0 = X.AnonymousClass5X3.A00(r13, r0, r12)
        L_0x00c4:
            boolean r0 = X.0qQ.A0K(r10, r0)
            if (r0 == 0) goto L_0x01aa
            r8.A0N(r4, r7)
        L_0x00cd:
            X.5XQ r11 = r8.A08
            if (r11 == 0) goto L_0x0084
            if (r27 == 0) goto L_0x01a1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            X.HsK r13 = new X.HsK
            r13.<init>(r0, r10)
        L_0x00dc:
            X.0eM r0 = r11.A05
            java.lang.Object r0 = r0.getValue()
            X.5XR r0 = (X.AnonymousClass5XR) r0
            X.0vr r12 = r0.A00
            java.lang.Object r1 = r12.A03(r13)
            if (r1 == 0) goto L_0x019e
            boolean r0 = X.0u4.A08(r1)
            if (r0 == 0) goto L_0x0199
            java.util.List r0 = X.0u4.A01(r1)
            java.lang.Object r1 = r0.remove(r6)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0103
            r12.A07(r13)
        L_0x0103:
            java.lang.String r0 = "null cannot be cast to non-null type V of androidx.compose.runtime.MutableScatterMultiMap.pop_impl$lambda$1"
            X.0qQ.A0C(r1, r0)
        L_0x0108:
            X.5XS r1 = (X.AnonymousClass5XS) r1
            if (r18 != 0) goto L_0x029f
            if (r1 == 0) goto L_0x029f
            java.util.List r0 = r11.A04
            r0.add(r1)
            int r0 = r1.A01
            r30 = r0
            X.0yC r12 = r11.A02
            java.lang.Object r9 = r12.A03(r0)
            X.5XV r9 = (X.AnonymousClass5XV) r9
            if (r9 == 0) goto L_0x0197
            int r1 = r9.A01
        L_0x0123:
            int r0 = r11.A01
            int r1 = r1 + r0
            r8.A04 = r1
            if (r9 == 0) goto L_0x0195
            int r10 = r9.A02
        L_0x012c:
            int r9 = r11.A00
            int r29 = r10 - r9
            r27 = 255(0xff, double:1.26E-321)
            r26 = 7
            r24 = -1
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r1 = 8
            if (r10 <= r9) goto L_0x01fb
            java.lang.Object[] r0 = r12.A04
            r23 = r0
            long[] r0 = r12.A03
            r22 = r0
            int r0 = r0.length
            int r15 = r0 + -2
            if (r15 < 0) goto L_0x0256
            r14 = 0
        L_0x014d:
            r20 = r22[r14]
            long r16 = r20 ^ r24
            long r16 = r16 << r26
            long r11 = r20 & r16
            long r11 = r11 & r18
            int r0 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x018b
            int r0 = r14 - r15
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r13 = 8 - r0
            r12 = 0
        L_0x0164:
            if (r12 >= r13) goto L_0x0189
            long r18 = r20 & r27
            r16 = 128(0x80, double:6.32E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x017b
            int r0 = r14 << 3
            int r0 = r0 + r12
            r11 = r23[r0]
            X.5XV r11 = (X.AnonymousClass5XV) r11
            int r0 = r11.A02
            if (r0 != r10) goto L_0x0180
            r11.A02 = r9
        L_0x017b:
            long r20 = r20 >> r1
            int r12 = r12 + 1
            goto L_0x0164
        L_0x0180:
            if (r9 > r0) goto L_0x017b
            if (r0 >= r10) goto L_0x017b
            int r0 = r0 + 1
            r11.A02 = r0
            goto L_0x017b
        L_0x0189:
            if (r13 != r1) goto L_0x0256
        L_0x018b:
            if (r14 == r15) goto L_0x0256
            int r14 = r14 + 1
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto L_0x014d
        L_0x0195:
            r10 = -1
            goto L_0x012c
        L_0x0197:
            r1 = -1
            goto L_0x0123
        L_0x0199:
            r12.A07(r13)
            goto L_0x0103
        L_0x019e:
            r1 = 0
            goto L_0x0108
        L_0x01a1:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            goto L_0x00dc
        L_0x01a7:
            r0 = 0
            goto L_0x00c4
        L_0x01aa:
            X.5X3 r14 = r8.A0B
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            int r0 = r14.A04
            if (r0 > 0) goto L_0x01eb
            int r13 = r14.A01
        L_0x01b7:
            int r0 = r14.A00
            if (r13 >= r0) goto L_0x01eb
            int[] r12 = r14.A0A
            int r0 = r13 * 5
            r1 = r12[r0]
            java.lang.Object r16 = X.AnonymousClass5X3.A00(r14, r12, r13)
            boolean r0 = X.AnonymousClass5X6.A03(r12, r13)
            if (r0 == 0) goto L_0x01e0
            r15 = 1
        L_0x01cc:
            X.5XS r11 = new X.5XS
            r0 = r16
            r11.<init>(r0, r1, r13, r15)
            r0 = r17
            r0.add(r11)
            int r0 = r13 * 5
            int r0 = r0 + 3
            r0 = r12[r0]
            int r13 = r13 + r0
            goto L_0x01b7
        L_0x01e0:
            int r0 = r13 * 5
            int r0 = r0 + 1
            r15 = r12[r0]
            r0 = 67108863(0x3ffffff, float:1.5046327E-36)
            r15 = r15 & r0
            goto L_0x01cc
        L_0x01eb:
            int r11 = r8.A04
            X.5XQ r1 = new X.5XQ
            r0 = r17
            r1.<init>(r0, r11)
            r8.A08 = r1
            goto L_0x00cd
        L_0x01f8:
            r0 = 0
            goto L_0x00b8
        L_0x01fb:
            if (r9 <= r10) goto L_0x0256
            java.lang.Object[] r0 = r12.A04
            r22 = r0
            long[] r0 = r12.A03
            r21 = r0
            int r0 = r0.length
            int r12 = r0 + -2
            if (r12 < 0) goto L_0x0256
            r11 = 0
        L_0x020b:
            r19 = r21[r11]
            long r15 = r19 ^ r24
            long r15 = r15 << r26
            long r15 = r15 & r19
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r15 = r15 & r13
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x0251
            int r0 = r11 - r12
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r18 = 8 - r0
            r13 = 0
        L_0x0226:
            r0 = r18
            if (r13 >= r0) goto L_0x024f
            long r16 = r19 & r27
            r14 = 128(0x80, double:6.32E-322)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x023f
            int r0 = r11 << 3
            int r0 = r0 + r13
            r14 = r22[r0]
            X.5XV r14 = (X.AnonymousClass5XV) r14
            int r15 = r14.A02
            if (r15 != r10) goto L_0x0244
            r14.A02 = r9
        L_0x023f:
            long r19 = r19 >> r1
            int r13 = r13 + 1
            goto L_0x0226
        L_0x0244:
            int r0 = r10 + 1
            if (r0 > r15) goto L_0x023f
            if (r15 >= r9) goto L_0x023f
            int r0 = r15 + -1
            r14.A02 = r0
            goto L_0x023f
        L_0x024f:
            if (r0 != r1) goto L_0x0256
        L_0x0251:
            if (r11 == r12) goto L_0x0256
            int r11 = r11 + 1
            goto L_0x020b
        L_0x0256:
            X.5X5 r9 = r8.A0b
            int r1 = r9.A03
            X.5Wx r0 = r9.A09
            X.5X3 r0 = r0.A0B
            int r0 = r0.A01
            int r0 = r30 - r0
            int r1 = r1 + r0
            r9.A03 = r1
            X.5X3 r1 = r8.A0B
            r0 = r30
            r1.A0B(r0)
            if (r29 <= 0) goto L_0x029a
            X.AnonymousClass5X5.A01(r9)
            X.5Ws r0 = r9.A05
            X.5Wu r11 = r0.A00
            X.XG7 r9 = X.XG7.A00
            r11.A02(r9)
            r10 = 0
            r0 = r29
            X.C286685Xj.A00(r11, r6, r0)
            int r1 = r11.A03
            int r6 = r9.A00
            r0 = 0
            if (r6 == 0) goto L_0x028b
            int r0 = 32 - r6
            int r0 = r3 >>> r0
        L_0x028b:
            if (r1 != r0) goto L_0x0345
            int r12 = r11.A04
            int r1 = r9.A01
            r0 = 0
            if (r1 == 0) goto L_0x0298
            int r0 = 32 - r1
            int r0 = r3 >>> r0
        L_0x0298:
            if (r12 != r0) goto L_0x0345
        L_0x029a:
            r8.A0N(r4, r7)
            goto L_0x0084
        L_0x029f:
            X.5X3 r1 = r8.A0B
            int r0 = r1.A04
            int r0 = r0 + 1
            r1.A04 = r0
            r8.A0K = r5
            r8.A0A = r2
            X.5X4 r1 = r8.A0D
            boolean r0 = r1.A0H
            if (r0 == 0) goto L_0x02c0
            X.5Wq r0 = r8.A0C
            X.5X4 r1 = r0.A01()
            r8.A0D = r1
            r1.A0M()
            r8.A0Q = r6
            r8.A0A = r2
        L_0x02c0:
            r1.A0J()
            X.5X4 r1 = r8.A0D
            int r2 = r1.A00
            if (r4 == 0) goto L_0x030d
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            X.AnonymousClass5X4.A0E(r1, r0, r0, r9, r5)
        L_0x02ce:
            X.5X4 r0 = r8.A0D
            X.5X7 r0 = r0.A0I(r2)
            r8.A0S = r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            int r0 = -2 - r2
            X.5XS r7 = new X.5XS
            r7.<init>(r1, r9, r0, r3)
            int r5 = r8.A04
            int r0 = r11.A01
            int r5 = r5 - r0
            X.0yC r2 = r11.A02
            int r1 = r7.A01
            X.5XV r0 = new X.5XV
            r0.<init>()
            r0.A02 = r3
            r0.A01 = r5
            r0.A00 = r6
            r2.A08(r1, r0)
            java.util.List r0 = r11.A04
            r0.add(r7)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r4 != 0) goto L_0x0306
            int r6 = r8.A04
        L_0x0306:
            X.5XQ r2 = new X.5XQ
            r2.<init>(r0, r6)
            goto L_0x0084
        L_0x030d:
            if (r28 == 0) goto L_0x0317
            if (r27 != 0) goto L_0x0313
            java.lang.Object r10 = X.AnonymousClass5XT.A00
        L_0x0313:
            X.AnonymousClass5X4.A0E(r1, r10, r7, r9, r6)
            goto L_0x02ce
        L_0x0317:
            if (r27 != 0) goto L_0x031b
            java.lang.Object r10 = X.AnonymousClass5XT.A00
        L_0x031b:
            java.lang.Object r7 = X.AnonymousClass5XT.A00
            goto L_0x0313
        L_0x031e:
            int r0 = r8.A02
            int r1 = java.lang.Integer.rotateLeft(r0, r2)
            r1 = r1 ^ r29
            goto L_0x002a
        L_0x0328:
            boolean r0 = r10 instanceof java.lang.Enum
            if (r0 == 0) goto L_0x0340
            r0 = r10
            java.lang.Enum r0 = (java.lang.Enum) r0
            int r1 = r0.ordinal()
        L_0x0333:
            int r0 = r8.A02
            int r0 = java.lang.Integer.rotateLeft(r0, r2)
            r1 = r1 ^ r0
            int r3 = java.lang.Integer.rotateLeft(r1, r2)
            goto L_0x002f
        L_0x0340:
            int r1 = r10.hashCode()
            goto L_0x0333
        L_0x0345:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 0
            r7 = 0
        L_0x034c:
            java.lang.String r8 = ", "
            if (r2 >= r6) goto L_0x0368
            int r1 = r5 << r2
            int r0 = r11.A03
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0365
            if (r7 <= 0) goto L_0x035c
            r3.append(r8)
        L_0x035c:
            java.lang.String r0 = r9.A00(r2)
            r3.append(r0)
            int r7 = r7 + 1
        L_0x0365:
            int r2 = r2 + 1
            goto L_0x034c
        L_0x0368:
            java.lang.String r6 = r3.toString()
            X.0qQ.A07(r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r2 = r9.A01
            r3 = 0
        L_0x0377:
            if (r10 >= r2) goto L_0x0391
            int r1 = r5 << r10
            int r0 = r11.A04
            r1 = r1 & r0
            if (r1 == 0) goto L_0x038e
            if (r7 <= 0) goto L_0x0385
            r4.append(r8)
        L_0x0385:
            java.lang.String r0 = r9.A01(r10)
            r4.append(r0)
            int r3 = r3 + 1
        L_0x038e:
            int r10 = r10 + 1
            goto L_0x0377
        L_0x0391:
            java.lang.String r2 = r4.toString()
            X.0qQ.A07(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Error while pushing "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ". Not all arguments were provided. Missing "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " int arguments ("
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ") and "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " object arguments ("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ")."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C18086VlG.A01(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C286565Wx.A0K(X.5Wx, java.lang.Object, java.lang.Object, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5, types: [int] */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9, types: [int] */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03a6, code lost:
        if (r7 == r1) goto L_0x03a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04d2, code lost:
        if (r3 == r1) goto L_0x04d4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02c2 A[LOOP:6: B:130:0x02b6->B:134:0x02c2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02da A[EDGE_INSN: B:286:0x02da->B:135:0x02da ?: BREAK  
    EDGE_INSN: B:287:0x02da->B:135:0x02da ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0097 A[LOOP:0: B:20:0x0095->B:21:0x0097, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0L(X.C286565Wx r37, boolean r38) {
        /*
            r14 = r37
            X.5X0 r13 = r14.A0W
            int[] r1 = r13.A01
            int r0 = r13.A00
            int r0 = r0 + -2
            r5 = r1[r0]
            r12 = 1
            int r5 = r5 - r12
            boolean r0 = r14.A0K
            r7 = 207(0xcf, float:2.9E-43)
            r4 = 3
            if (r0 == 0) goto L_0x00ca
            X.5X4 r9 = r14.A0D
            int r0 = r9.A08
            int[] r3 = r9.A0I
            int r1 = X.AnonymousClass5X4.A00(r9, r0)
            int r2 = r1 * 5
            r6 = r3[r2]
            int r0 = r2 + 1
            r10 = r3[r0]
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r10
            if (r0 == 0) goto L_0x00c7
            java.lang.Object[] r8 = r9.A0J
            int r0 = r2 + 4
            r2 = r3[r0]
            int r0 = r10 >> 30
            int r0 = X.AnonymousClass5X6.A00(r0)
            int r2 = r2 + r0
            r8 = r8[r2]
        L_0x003b:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = r0 & r10
            if (r0 == 0) goto L_0x00c4
            java.lang.Object[] r2 = r9.A0J
            int r1 = X.AnonymousClass5X4.A01(r9, r3, r1)
            int r0 = r10 >> 29
            int r0 = X.AnonymousClass5X6.A00(r0)
            int r1 = r1 + r0
            r1 = r2[r1]
        L_0x004f:
            if (r8 != 0) goto L_0x00ae
            if (r1 == 0) goto L_0x00a5
            if (r6 != r7) goto L_0x00a5
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00a5
            int r2 = r1.hashCode()
            int r0 = r14.A02
            r5 = r5 ^ r0
            int r1 = java.lang.Integer.rotateRight(r5, r4)
        L_0x0068:
            r1 = r1 ^ r2
        L_0x0069:
            int r0 = java.lang.Integer.rotateRight(r1, r4)
            r14.A02 = r0
            int r11 = r14.A03
            X.5XQ r10 = r14.A08
            if (r10 == 0) goto L_0x02b4
            java.util.List r0 = r10.A03
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x02b4
            java.util.List r0 = r10.A03
            r37 = r0
            java.util.List r0 = r10.A04
            r36 = r0
            int r1 = r36.size()
            java.util.HashSet r35 = new java.util.HashSet
            r0 = r35
            r0.<init>(r1)
            int r3 = r36.size()
            r2 = 0
        L_0x0095:
            if (r2 >= r3) goto L_0x00de
            r0 = r36
            java.lang.Object r1 = r0.get(r2)
            r0 = r35
            r0.add(r1)
            int r2 = r2 + 1
            goto L_0x0095
        L_0x00a5:
            int r0 = r14.A02
            r5 = r5 ^ r0
            int r1 = java.lang.Integer.rotateRight(r5, r4)
            r1 = r1 ^ r6
            goto L_0x0069
        L_0x00ae:
            boolean r0 = r8 instanceof java.lang.Enum
            if (r0 == 0) goto L_0x00bf
            java.lang.Enum r8 = (java.lang.Enum) r8
            int r1 = r8.ordinal()
        L_0x00b8:
            int r0 = r14.A02
            int r2 = java.lang.Integer.rotateRight(r0, r4)
            goto L_0x0068
        L_0x00bf:
            int r1 = r8.hashCode()
            goto L_0x00b8
        L_0x00c4:
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            goto L_0x004f
        L_0x00c7:
            r8 = 0
            goto L_0x003b
        L_0x00ca:
            X.5X3 r3 = r14.A0B
            int r2 = r3.A05
            int[] r1 = r3.A0A
            int r0 = r2 * 5
            r6 = r1[r0]
            java.lang.Object r8 = X.AnonymousClass5X3.A00(r3, r1, r2)
            java.lang.Object r1 = r3.A05(r2)
            goto L_0x004f
        L_0x00de:
            java.util.LinkedHashSet r34 = new java.util.LinkedHashSet
            r34.<init>()
            int r33 = r36.size()
            int r32 = r37.size()
            r9 = 0
            r31 = 0
            r8 = 0
        L_0x00ef:
            r0 = r32
            if (r9 >= r0) goto L_0x0296
            r0 = r37
            java.lang.Object r2 = r0.get(r9)
            X.5XS r2 = (X.AnonymousClass5XS) r2
            r0 = r35
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x014e
            X.0yC r1 = r10.A02
            int r0 = r2.A01
            java.lang.Object r0 = r1.A03(r0)
            X.5XV r0 = (X.AnonymousClass5XV) r0
            if (r0 == 0) goto L_0x014c
            int r1 = r0.A01
        L_0x0111:
            X.5X5 r4 = r14.A0b
            int r0 = r10.A01
            int r1 = r1 + r0
            int r0 = r2.A02
            r4.A05(r1, r0)
            int r3 = r2.A01
            r0 = 0
            r10.A00(r3, r0)
            int r1 = r4.A03
            X.5Wx r0 = r4.A09
            X.5X3 r0 = r0.A0B
            int r0 = r0.A01
            int r0 = r3 - r0
            int r1 = r1 + r0
            r4.A03 = r1
            X.5X3 r0 = r14.A0B
            r0.A0B(r3)
            r14.A08()
            X.5X3 r0 = r14.A0B
            r0.A01()
            java.util.List r2 = r14.A0c
            int[] r1 = r0.A0A
            int r0 = r3 * 5
            int r0 = r0 + 3
            r0 = r1[r0]
            int r0 = r0 + r3
            X.AnonymousClass5XN.A05(r2, r3, r0)
        L_0x0149:
            int r9 = r9 + 1
            goto L_0x00ef
        L_0x014c:
            r1 = -1
            goto L_0x0111
        L_0x014e:
            r0 = r34
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0149
            r1 = r33
            r0 = r31
            if (r0 >= r1) goto L_0x00ef
            r1 = r36
            java.lang.Object r7 = r1.get(r0)
            X.5XS r7 = (X.AnonymousClass5XS) r7
            if (r7 == r2) goto L_0x027e
            X.0yC r3 = r10.A02
            int r0 = r7.A01
            java.lang.Object r0 = r3.A03(r0)
            X.5XV r0 = (X.AnonymousClass5XV) r0
            if (r0 == 0) goto L_0x021e
            int r6 = r0.A01
        L_0x0174:
            r0 = r34
            r0.add(r7)
            if (r6 == r8) goto L_0x0280
            int r0 = r7.A01
            java.lang.Object r0 = r3.A03(r0)
            X.5XV r0 = (X.AnonymousClass5XV) r0
            if (r0 == 0) goto L_0x021a
            int r5 = r0.A00
        L_0x0187:
            X.5X5 r2 = r14.A0b
            int r0 = r10.A01
            int r16 = r0 + r6
            int r15 = r8 + r0
            if (r5 <= 0) goto L_0x01a6
            int r1 = r2.A00
            if (r1 <= 0) goto L_0x020e
            int r0 = r2.A01
            r4 = r0
            int r0 = r16 - r1
            if (r4 != r0) goto L_0x020e
            int r0 = r2.A02
            r4 = r0
            int r0 = r15 - r1
            if (r4 != r0) goto L_0x020e
            int r1 = r1 + r5
            r2.A00 = r1
        L_0x01a6:
            r29 = 255(0xff, double:1.26E-321)
            r28 = 7
            r26 = -1
            r24 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r23 = 8
            if (r6 <= r8) goto L_0x0221
            java.lang.Object[] r0 = r3.A04
            r22 = r0
            long[] r0 = r3.A03
            r21 = r0
            int r0 = r0.length
            int r15 = r0 + -2
            if (r15 < 0) goto L_0x0280
            r4 = 0
        L_0x01c3:
            r19 = r21[r4]
            long r16 = r19 ^ r26
            long r16 = r16 << r28
            long r1 = r19 & r16
            long r1 = r1 & r24
            int r0 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r0 == 0) goto L_0x0209
            int r0 = r4 - r15
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r18 = 8 - r0
            r3 = 0
        L_0x01da:
            r0 = r18
            if (r3 >= r0) goto L_0x0204
            long r16 = r19 & r29
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01f9
            int r0 = r4 << 3
            int r0 = r0 + r3
            r2 = r22[r0]
            X.5XV r2 = (X.AnonymousClass5XV) r2
            int r1 = r2.A01
            if (r6 > r1) goto L_0x01fe
            int r0 = r6 + r5
            if (r1 >= r0) goto L_0x01fe
            int r1 = r1 - r6
            int r1 = r1 + r8
        L_0x01f7:
            r2.A01 = r1
        L_0x01f9:
            long r19 = r19 >> r23
            int r3 = r3 + 1
            goto L_0x01da
        L_0x01fe:
            if (r8 > r1) goto L_0x01f9
            if (r1 >= r6) goto L_0x01f9
            int r1 = r1 + r5
            goto L_0x01f7
        L_0x0204:
            r1 = r0
            r0 = r23
            if (r1 != r0) goto L_0x0280
        L_0x0209:
            if (r4 == r15) goto L_0x0280
            int r4 = r4 + 1
            goto L_0x01c3
        L_0x020e:
            X.AnonymousClass5X5.A02(r2)
            r0 = r16
            r2.A01 = r0
            r2.A02 = r15
            r2.A00 = r5
            goto L_0x01a6
        L_0x021a:
            int r5 = r7.A02
            goto L_0x0187
        L_0x021e:
            r6 = -1
            goto L_0x0174
        L_0x0221:
            if (r8 <= r6) goto L_0x0280
            java.lang.Object[] r0 = r3.A04
            r22 = r0
            long[] r0 = r3.A03
            r21 = r0
            int r0 = r0.length
            int r15 = r0 + -2
            if (r15 < 0) goto L_0x0280
            r4 = 0
        L_0x0231:
            r19 = r21[r4]
            long r16 = r19 ^ r26
            long r16 = r16 << r28
            long r16 = r16 & r19
            long r16 = r16 & r24
            int r0 = (r16 > r24 ? 1 : (r16 == r24 ? 0 : -1))
            if (r0 == 0) goto L_0x0279
            int r0 = r4 - r15
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r18 = 8 - r0
            r3 = 0
        L_0x0248:
            r0 = r18
            if (r3 >= r0) goto L_0x0274
            long r16 = r19 & r29
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0267
            int r0 = r4 << 3
            int r0 = r0 + r3
            r2 = r22[r0]
            X.5XV r2 = (X.AnonymousClass5XV) r2
            int r1 = r2.A01
            if (r6 > r1) goto L_0x026c
            int r0 = r6 + r5
            if (r1 >= r0) goto L_0x026c
            int r1 = r1 - r6
            int r1 = r1 + r8
        L_0x0265:
            r2.A01 = r1
        L_0x0267:
            long r19 = r19 >> r23
            int r3 = r3 + 1
            goto L_0x0248
        L_0x026c:
            int r0 = r6 + 1
            if (r0 > r1) goto L_0x0267
            if (r1 >= r8) goto L_0x0267
            int r1 = r1 - r5
            goto L_0x0265
        L_0x0274:
            r1 = r0
            r0 = r23
            if (r1 != r0) goto L_0x0280
        L_0x0279:
            if (r4 == r15) goto L_0x0280
            int r4 = r4 + 1
            goto L_0x0231
        L_0x027e:
            int r9 = r9 + 1
        L_0x0280:
            int r31 = r31 + 1
            X.0yC r1 = r10.A02
            int r0 = r7.A01
            java.lang.Object r0 = r1.A03(r0)
            X.5XV r0 = (X.AnonymousClass5XV) r0
            if (r0 == 0) goto L_0x0293
            int r0 = r0.A00
        L_0x0290:
            int r8 = r8 + r0
            goto L_0x00ef
        L_0x0293:
            int r0 = r7.A02
            goto L_0x0290
        L_0x0296:
            X.5X5 r4 = r14.A0b
            X.AnonymousClass5X5.A02(r4)
            int r0 = r37.size()
            if (r0 <= 0) goto L_0x02b4
            X.5X3 r3 = r14.A0B
            int r2 = r3.A00
            int r1 = r4.A03
            X.5Wx r0 = r4.A09
            X.5X3 r0 = r0.A0B
            int r0 = r0.A01
            int r2 = r2 - r0
            int r1 = r1 + r2
            r4.A03 = r1
            r3.A09()
        L_0x02b4:
            int r3 = r14.A04
        L_0x02b6:
            X.5X3 r1 = r14.A0B
            int r0 = r1.A04
            if (r0 > 0) goto L_0x02da
            int r2 = r1.A01
            int r0 = r1.A00
            if (r2 == r0) goto L_0x02da
            r14.A08()
            X.5X3 r0 = r14.A0B
            int r1 = r0.A01()
            X.5X5 r0 = r14.A0b
            r0.A05(r3, r1)
            java.util.List r1 = r14.A0c
            X.5X3 r0 = r14.A0B
            int r0 = r0.A01
            X.AnonymousClass5XN.A05(r1, r2, r0)
            goto L_0x02b6
        L_0x02da:
            boolean r2 = r14.A0K
            if (r2 == 0) goto L_0x0498
            if (r38 == 0) goto L_0x0342
            X.5X8 r1 = r14.A0H
            X.5Wu r15 = r1.A01
            int r0 = r15.A02
            if (r0 == 0) goto L_0x0337
            X.5Wu r11 = r1.A00
            X.5Wv[] r1 = r15.A06
            int r0 = r0 + -1
            r15.A02 = r0
            r5 = r1[r0]
            X.0qQ.A0A(r5)
            X.5Wv[] r1 = r15.A06
            int r0 = r15.A02
            r8 = 0
            r1[r0] = r8
            r11.A02(r5)
            int r7 = r15.A01
            r10 = r7
            int r6 = r11.A01
            int r9 = r5.A01
            r16 = 0
            r4 = 0
        L_0x0309:
            if (r4 >= r9) goto L_0x031c
            int r6 = r6 + -1
            int r7 = r7 + -1
            java.lang.Object[] r3 = r11.A07
            java.lang.Object[] r1 = r15.A07
            r0 = r1[r7]
            r3[r6] = r0
            r1[r7] = r8
            int r4 = r4 + 1
            goto L_0x0309
        L_0x031c:
            int r8 = r15.A00
            r7 = r8
            int r6 = r11.A00
            int r5 = r5.A00
            r4 = 0
        L_0x0324:
            if (r4 >= r5) goto L_0x033b
            int r6 = r6 + -1
            int r8 = r8 + -1
            int[] r3 = r11.A05
            int[] r1 = r15.A05
            r0 = r1[r8]
            r3[r6] = r0
            r1[r8] = r16
            int r4 = r4 + 1
            goto L_0x0324
        L_0x0337:
            java.lang.String r0 = "Cannot end node insertion, there are no pending operations that can be realized."
            goto L_0x0555
        L_0x033b:
            int r10 = r10 - r9
            r15.A01 = r10
            int r7 = r7 - r5
            r15.A00 = r7
            r11 = 1
        L_0x0342:
            X.5X3 r1 = r14.A0B
            int r0 = r1.A04
            if (r0 <= 0) goto L_0x05e7
            int r0 = r0 + -1
            r1.A04 = r0
            X.5X4 r0 = r14.A0D
            int r1 = r0.A08
            r0.A0K()
            X.5X3 r0 = r14.A0B
            int r0 = r0.A04
            if (r0 > 0) goto L_0x0518
            int r6 = -2 - r1
            X.5X4 r0 = r14.A0D
            r0.A0L()
            r0.A0P(r12)
            X.5X7 r8 = r14.A0S
            X.5X8 r7 = r14.A0H
            X.5Wu r0 = r7.A00
            int r0 = r0.A02
            r3 = 0
            if (r0 != 0) goto L_0x036f
            r3 = 1
        L_0x036f:
            X.5X5 r0 = r14.A0b
            X.5Wq r1 = r14.A0C
            X.AnonymousClass5X5.A00(r0)
            X.AnonymousClass5X5.A01(r0)
            X.AnonymousClass5X5.A02(r0)
            X.5Ws r0 = r0.A05
            X.5Wu r4 = r0.A00
            if (r3 == 0) goto L_0x03b8
            X.5xL r3 = X.C300525xL.A00
            r4.A02(r3)
            r5 = 0
            X.C286685Xj.A01(r4, r8, r5)
            X.C286685Xj.A01(r4, r1, r12)
            int r7 = r4.A03
            int r9 = r3.A00
            r1 = 0
            if (r9 == 0) goto L_0x0399
            r1 = -1
            int r0 = 32 - r9
            int r1 = r1 >>> r0
        L_0x0399:
            if (r7 != r1) goto L_0x03ea
            int r7 = r4.A04
            int r0 = r3.A01
            r1 = 0
            if (r0 == 0) goto L_0x03a6
            r1 = -1
            int r0 = 32 - r0
            int r1 = r1 >>> r0
        L_0x03a6:
            if (r7 != r1) goto L_0x03ea
        L_0x03a8:
            r14.A0K = r5
            X.5Wq r0 = r14.A0Y
            int r0 = r0.A00
            if (r0 == 0) goto L_0x0518
            r14.A0D(r6, r5)
            r14.A0E(r6, r11)
            goto L_0x0518
        L_0x03b8:
            X.5bp r3 = X.C288385bp.A00
            r4.A02(r3)
            r5 = 0
            X.C286685Xj.A01(r4, r8, r5)
            X.C286685Xj.A01(r4, r1, r12)
            r0 = 2
            X.C286685Xj.A01(r4, r7, r0)
            int r7 = r4.A03
            int r9 = r3.A00
            r1 = 0
            if (r9 == 0) goto L_0x03d3
            r1 = -1
            int r0 = 32 - r9
            int r1 = r1 >>> r0
        L_0x03d3:
            if (r7 != r1) goto L_0x0436
            int r7 = r4.A04
            int r0 = r3.A01
            r1 = 0
            if (r0 == 0) goto L_0x03e0
            r1 = -1
            int r0 = 32 - r0
            int r1 = r1 >>> r0
        L_0x03e0:
            if (r7 != r1) goto L_0x0436
            X.5X8 r0 = new X.5X8
            r0.<init>()
            r14.A0H = r0
            goto L_0x03a8
        L_0x03ea:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r2 = 0
            r8 = 0
        L_0x03f1:
            java.lang.String r6 = ", "
            if (r2 >= r9) goto L_0x040d
            int r1 = r12 << r2
            int r0 = r4.A03
            r1 = r1 & r0
            if (r1 == 0) goto L_0x040a
            if (r8 <= 0) goto L_0x0401
            r7.append(r6)
        L_0x0401:
            java.lang.String r0 = r3.A00(r2)
            r7.append(r0)
            int r8 = r8 + 1
        L_0x040a:
            int r2 = r2 + 1
            goto L_0x03f1
        L_0x040d:
            java.lang.String r10 = r7.toString()
            X.0qQ.A07(r10)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            int r2 = r3.A01
            r9 = 0
        L_0x041c:
            if (r5 >= r2) goto L_0x0482
            int r1 = r12 << r5
            int r0 = r4.A04
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0433
            if (r8 <= 0) goto L_0x042a
            r7.append(r6)
        L_0x042a:
            java.lang.String r0 = r3.A01(r5)
            r7.append(r0)
            int r9 = r9 + 1
        L_0x0433:
            int r5 = r5 + 1
            goto L_0x041c
        L_0x0436:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r2 = 0
            r8 = 0
        L_0x043d:
            java.lang.String r6 = ", "
            if (r2 >= r9) goto L_0x0459
            int r1 = r12 << r2
            int r0 = r4.A03
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0456
            if (r8 <= 0) goto L_0x044d
            r7.append(r6)
        L_0x044d:
            java.lang.String r0 = r3.A00(r2)
            r7.append(r0)
            int r8 = r8 + 1
        L_0x0456:
            int r2 = r2 + 1
            goto L_0x043d
        L_0x0459:
            java.lang.String r10 = r7.toString()
            X.0qQ.A07(r10)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            int r2 = r3.A01
            r9 = 0
        L_0x0468:
            if (r5 >= r2) goto L_0x0482
            int r1 = r12 << r5
            int r0 = r4.A04
            r1 = r1 & r0
            if (r1 == 0) goto L_0x047f
            if (r8 <= 0) goto L_0x0476
            r7.append(r6)
        L_0x0476:
            java.lang.String r0 = r3.A01(r5)
            r7.append(r0)
            int r9 = r9 + 1
        L_0x047f:
            int r5 = r5 + 1
            goto L_0x0468
        L_0x0482:
            java.lang.String r2 = r7.toString()
            X.0qQ.A07(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Error while pushing "
            r1.append(r0)
            r1.append(r3)
            goto L_0x05ba
        L_0x0498:
            if (r38 == 0) goto L_0x049f
            X.5X5 r0 = r14.A0b
            r0.A04()
        L_0x049f:
            X.5X3 r0 = r14.A0B
            int r1 = r0.A03
            int r0 = r0.A02
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x04d4
            X.5X5 r0 = r14.A0b
            X.AnonymousClass5X5.A01(r0)
            X.5Ws r0 = r0.A05
            X.5Wu r6 = r0.A00
            X.XG9 r5 = X.XG9.A00
            r6.A02(r5)
            r4 = 0
            X.C286685Xj.A00(r6, r4, r1)
            int r3 = r6.A03
            int r9 = r5.A00
            r1 = 0
            if (r9 == 0) goto L_0x04c5
            r1 = -1
            int r0 = 32 - r9
            int r1 = r1 >>> r0
        L_0x04c5:
            if (r3 != r1) goto L_0x055a
            int r3 = r6.A04
            int r0 = r5.A01
            r1 = 0
            if (r0 == 0) goto L_0x04d2
            r1 = -1
            int r0 = 32 - r0
            int r1 = r1 >>> r0
        L_0x04d2:
            if (r3 != r1) goto L_0x055a
        L_0x04d4:
            X.5X5 r3 = r14.A0b
            X.5Wx r0 = r3.A09
            X.5X3 r0 = r0.A0B
            int r6 = r0.A05
            X.5X0 r5 = r3.A0A
            r0 = -1
            int r4 = r5.A00
            if (r4 <= 0) goto L_0x04e9
            int[] r1 = r5.A01
            int r0 = r4 + -1
            r0 = r1[r0]
        L_0x04e9:
            if (r0 > r6) goto L_0x0553
            if (r0 != r6) goto L_0x0500
            r0 = 0
            X.AnonymousClass5X5.A03(r3, r0)
            int r0 = r5.A00
            int r0 = r0 + -1
            r5.A00 = r0
            X.5Ws r0 = r3.A05
            X.5Wu r1 = r0.A00
            X.5c6 r0 = X.C288555c6.A00
            r1.A02(r0)
        L_0x0500:
            X.5X3 r0 = r14.A0B
            int r1 = r0.A05
            int r0 = r14.A01(r1)
            if (r11 == r0) goto L_0x050d
            r14.A0E(r1, r11)
        L_0x050d:
            if (r38 == 0) goto L_0x0510
            r11 = 1
        L_0x0510:
            X.5X3 r0 = r14.A0B
            r0.A08()
            X.AnonymousClass5X5.A02(r3)
        L_0x0518:
            X.5Wz r0 = r14.A0a
            java.util.ArrayList r1 = r0.A00
            int r0 = r1.size()
            int r0 = r0 + -1
            java.lang.Object r1 = r1.remove(r0)
            X.5XQ r1 = (X.AnonymousClass5XQ) r1
            if (r1 == 0) goto L_0x0532
            if (r2 != 0) goto L_0x0532
            int r0 = r1.A00
            int r0 = r0 + 1
            r1.A00 = r0
        L_0x0532:
            r14.A08 = r1
            int[] r2 = r13.A01
            int r0 = r13.A00
            int r1 = r0 + -1
            r13.A00 = r1
            r0 = r2[r1]
            int r0 = r0 + r11
            r14.A04 = r0
            int r1 = r1 + -1
            r13.A00 = r1
            r0 = r2[r1]
            r14.A05 = r0
            int r0 = r1 + -1
            r13.A00 = r0
            r0 = r2[r0]
            int r0 = r0 + r11
            r14.A03 = r0
            return
        L_0x0553:
            java.lang.String r0 = "Missed recording an endGroup"
        L_0x0555:
            X.AnonymousClass5XN.A03(r0)
            goto L_0x05ec
        L_0x055a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 0
            r8 = 0
        L_0x0561:
            java.lang.String r7 = ", "
            if (r2 >= r9) goto L_0x057d
            int r1 = r12 << r2
            int r0 = r6.A03
            r1 = r1 & r0
            if (r1 == 0) goto L_0x057a
            if (r8 <= 0) goto L_0x0571
            r3.append(r7)
        L_0x0571:
            java.lang.String r0 = r5.A00(r2)
            r3.append(r0)
            int r8 = r8 + 1
        L_0x057a:
            int r2 = r2 + 1
            goto L_0x0561
        L_0x057d:
            java.lang.String r10 = r3.toString()
            X.0qQ.A07(r10)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r2 = r5.A01
            r9 = 0
        L_0x058c:
            if (r4 >= r2) goto L_0x05a6
            int r1 = r12 << r4
            int r0 = r6.A04
            r1 = r1 & r0
            if (r1 == 0) goto L_0x05a3
            if (r8 <= 0) goto L_0x059a
            r3.append(r7)
        L_0x059a:
            java.lang.String r0 = r5.A01(r4)
            r3.append(r0)
            int r9 = r9 + 1
        L_0x05a3:
            int r4 = r4 + 1
            goto L_0x058c
        L_0x05a6:
            java.lang.String r2 = r3.toString()
            X.0qQ.A07(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Error while pushing "
            r1.append(r0)
            r1.append(r5)
        L_0x05ba:
            java.lang.String r0 = ". Not all arguments were provided. Missing "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " int arguments ("
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ") and "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " object arguments ("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ")."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C18086VlG.A01(r0)
            goto L_0x05ec
        L_0x05e7:
            java.lang.String r0 = "Unbalanced begin/end empty"
            X.C18086VlG.A00(r0)
        L_0x05ec:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C286565Wx.A0L(X.5Wx, boolean):void");
    }

    private final void A0M(AnonymousClass5XQ r3, boolean z) {
        C286585Wz r0 = this.A0a;
        r0.A00.add(this.A08);
        this.A08 = r3;
        AnonymousClass5X0 r1 = this.A0W;
        r1.A00(this.A03);
        r1.A00(this.A05);
        r1.A00(this.A04);
        if (z) {
            this.A04 = 0;
        }
        this.A03 = 0;
        this.A05 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (r2 == r1) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0N(boolean r13, java.lang.Object r14) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x001c
            X.5X3 r2 = r12.A0B
            int r0 = r2.A04
            if (r0 > 0) goto L_0x00ea
            int[] r1 = r2.A0A
            int r0 = r2.A01
            boolean r0 = X.AnonymousClass5X6.A03(r1, r0)
            if (r0 != 0) goto L_0x00e7
            java.lang.String r0 = "Expected a node group"
            X.C18086VlG.A00(r0)
        L_0x0017:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001c:
            if (r14 == 0) goto L_0x0053
            X.5X3 r0 = r12.A0B
            java.lang.Object r0 = r0.A03()
            if (r0 == r14) goto L_0x0053
            X.5X5 r0 = r12.A0b
            r1 = 0
            X.AnonymousClass5X5.A03(r0, r1)
            X.5Ws r0 = r0.A05
            X.5Wu r9 = r0.A00
            X.5c5 r7 = X.C288545c5.A00
            r9.A02(r7)
            r8 = 0
            X.C286685Xj.A01(r9, r14, r1)
            int r2 = r9.A03
            int r4 = r7.A00
            if (r4 == 0) goto L_0x0043
            r1 = -1
            int r0 = 32 - r4
            int r1 = r1 >>> r0
        L_0x0043:
            r11 = 1
            if (r2 != r1) goto L_0x0059
            int r2 = r9.A04
            int r0 = r7.A01
            r1 = 0
            if (r0 == 0) goto L_0x0051
            r1 = -1
            int r0 = 32 - r0
            int r1 = r1 >>> r0
        L_0x0051:
            if (r2 != r1) goto L_0x0059
        L_0x0053:
            X.5X3 r0 = r12.A0B
            r0.A0A()
            return
        L_0x0059:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 0
            r6 = 0
        L_0x0060:
            java.lang.String r10 = ", "
            if (r2 >= r4) goto L_0x007c
            int r1 = r11 << r2
            int r0 = r9.A03
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0079
            if (r6 <= 0) goto L_0x0070
            r3.append(r10)
        L_0x0070:
            java.lang.String r0 = r7.A00(r2)
            r3.append(r0)
            int r6 = r6 + 1
        L_0x0079:
            int r2 = r2 + 1
            goto L_0x0060
        L_0x007c:
            java.lang.String r5 = r3.toString()
            X.0qQ.A07(r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r2 = r7.A01
            r3 = 0
        L_0x008b:
            if (r8 >= r2) goto L_0x00a5
            int r1 = r11 << r8
            int r0 = r9.A04
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a2
            if (r6 <= 0) goto L_0x0099
            r4.append(r10)
        L_0x0099:
            java.lang.String r0 = r7.A01(r8)
            r4.append(r0)
            int r3 = r3 + 1
        L_0x00a2:
            int r8 = r8 + 1
            goto L_0x008b
        L_0x00a5:
            java.lang.String r2 = r4.toString()
            X.0qQ.A07(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Error while pushing "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ". Not all arguments were provided. Missing "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " int arguments ("
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ") and "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " object arguments ("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ")."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C18086VlG.A01(r0)
            goto L_0x0017
        L_0x00e7:
            r2.A0A()
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C286565Wx.A0N(boolean, java.lang.Object):void");
    }

    public final C286625Xd A0O() {
        C286585Wz r1 = this.A0Z;
        if (this.A00 != 0) {
            return null;
        }
        ArrayList arrayList = r1.A00;
        if (!arrayList.isEmpty()) {
            return (C286625Xd) arrayList.get(arrayList.size() - 1);
        }
        return null;
    }

    public final Object A0P() {
        if (this.A0K) {
            A0A();
        } else {
            Object A042 = this.A0B.A04();
            if (!this.A0O || (A042 instanceof AnonymousClass6IH)) {
                return A042;
            }
        }
        return AnonymousClass5XT.A00;
    }

    /* JADX WARNING: type inference failed for: r1v40, types: [java.lang.Object, X.01j] */
    public final void A0Q(Object obj) {
        StringBuilder sb;
        String str;
        int i;
        C286545Wv r4;
        int i2;
        if (this.A0K) {
            AnonymousClass5X4 r2 = this.A0D;
            if (r2.A06 > 0) {
                if (r2.A02 != r2.A0B) {
                    0yC r3 = r2.A0D;
                    if (r3 == null) {
                        r3 = new 0yC(6);
                    }
                    r2.A0D = r3;
                    int i3 = r2.A08;
                    Object A032 = r3.A03(i3);
                    Object obj2 = A032;
                    if (A032 == null) {
                        ? obj3 = new Object();
                        obj3.A01 = new Object[16];
                        r3.A08(i3, obj3);
                        obj2 = obj3;
                    }
                    ((0vt) obj2).A00(obj);
                    return;
                }
                AnonymousClass5X4.A09(r2, 1, r2.A08);
            }
            r2.A02++;
            r2.A0N(obj);
            return;
        }
        AnonymousClass5X3 r42 = this.A0B;
        if (r42.A07) {
            int i4 = r42.A02;
            int[] iArr = r42.A0A;
            int i5 = r42.A05;
            int i6 = i5 * 5;
            int A002 = (i4 - (iArr[i6 + 4] + AnonymousClass5X6.A00(iArr[i6 + 1] >> 28))) - 1;
            AnonymousClass5X5 r32 = this.A0b;
            if (r32.A09.A0B.A05 - r32.A03 < 0) {
                AnonymousClass5X7 A022 = r42.A02(i5);
                C286535Wu r8 = r32.A05.A00;
                r4 = XE1.A00;
                r8.A02(r4);
                C286685Xj.A01(r8, obj, 0);
                C286685Xj.A01(r8, A022, 1);
                C286685Xj.A00(r8, 0, A002);
                int i7 = r8.A03;
                int i8 = r4.A00;
                int i9 = 0;
                if (i8 != 0) {
                    i9 = -1 >>> (32 - i8);
                }
                if (i7 == i9) {
                    int i10 = r8.A04;
                    int i11 = r4.A01;
                    int i12 = 0;
                    if (i11 != 0) {
                        i12 = -1 >>> (32 - i11);
                    }
                    if (i10 == i12) {
                        return;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                i2 = 0;
                for (int i13 = 0; i13 < i8; i13++) {
                    if (((1 << i13) & r8.A03) != 0) {
                        if (i2 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(r4.A00(i13));
                        i2++;
                    }
                }
                str = sb2.toString();
                0qQ.A07(str);
                sb = new StringBuilder();
                int i14 = r4.A01;
                i = 0;
                for (int i15 = 0; i15 < i14; i15++) {
                    if (((1 << i15) & r8.A04) != 0) {
                        if (i2 > 0) {
                            sb.append(", ");
                        }
                        sb.append(r4.A01(i15));
                        i++;
                    }
                }
            } else {
                AnonymousClass5X5.A03(r32, true);
                C286535Wu r9 = r32.A05.A00;
                r4 = C288505c1.A00;
                r9.A02(r4);
                C286685Xj.A01(r9, obj, 0);
                C286685Xj.A00(r9, 0, A002);
                int i16 = -1 >>> 31;
                if (r9.A03 != i16 || r9.A04 != i16) {
                    StringBuilder sb3 = new StringBuilder();
                    i2 = 0;
                    for (int i17 = 0; i17 < 1; i17 = 1) {
                        if (((1 << i17) & r9.A03) != 0) {
                            if (i2 > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(r4.A00(i17));
                            i2++;
                        }
                    }
                    str = sb3.toString();
                    0qQ.A07(str);
                    sb = new StringBuilder();
                    i = 0;
                    if (((1 << 0) & r9.A04) != 0) {
                        if (i2 > 0) {
                            sb.append(", ");
                        }
                        sb.append(r4.A01(0));
                        i = 1;
                    }
                } else {
                    return;
                }
            }
        } else {
            AnonymousClass5X5 r22 = this.A0b;
            AnonymousClass5X7 A023 = r42.A02(r42.A05);
            C286535Wu r92 = r22.A05.A00;
            r4 = XG6.A00;
            r92.A02(r4);
            C286685Xj.A01(r92, A023, 0);
            C286685Xj.A01(r92, obj, 1);
            int i18 = r92.A03;
            int i19 = r4.A00;
            int i20 = 0;
            if (i19 != 0) {
                i20 = -1 >>> (32 - i19);
            }
            if (i18 == i20) {
                int i21 = r92.A04;
                int i22 = r4.A01;
                int i23 = 0;
                if (i22 != 0) {
                    i23 = -1 >>> (32 - i22);
                }
                if (i21 == i23) {
                    return;
                }
            }
            StringBuilder sb4 = new StringBuilder();
            i2 = 0;
            for (int i24 = 0; i24 < i19; i24++) {
                if (((1 << i24) & r92.A03) != 0) {
                    if (i2 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(r4.A00(i24));
                    i2++;
                }
            }
            str = sb4.toString();
            0qQ.A07(str);
            sb = new StringBuilder();
            int i25 = r4.A01;
            i = 0;
            for (int i26 = 0; i26 < i25; i26++) {
                if (((1 << i26) & r92.A04) != 0) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(r4.A01(i26));
                    i++;
                }
            }
        }
        String obj4 = sb.toString();
        0qQ.A07(obj4);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Error while pushing ");
        sb5.append(r4);
        sb5.append(". Not all arguments were provided. Missing ");
        sb5.append(i2);
        sb5.append(" int arguments (");
        sb5.append(str);
        sb5.append(") and ");
        sb5.append(i);
        sb5.append(" object arguments (");
        sb5.append(obj4);
        sb5.append(").");
        C18086VlG.A01(sb5.toString());
        throw AnonymousClass00P.createAndThrow();
    }

    public final void ABr(Object obj, 0sL r14) {
        StringBuilder sb;
        int i;
        AnonymousClass5aP r5;
        String str;
        int i2;
        if (this.A0K) {
            C286535Wu r8 = this.A0H.A00;
            r5 = AnonymousClass5aP.A00;
            r8.A02(r5);
            C286685Xj.A01(r8, obj, 0);
            0qQ.A0C(r14, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            0u4.A05(r14, 2);
            C286685Xj.A01(r8, r14, 1);
            int i3 = r8.A03;
            int i4 = r5.A00;
            int i5 = 0;
            if (i4 != 0) {
                i5 = -1 >>> (32 - i4);
            }
            if (i3 == i5) {
                int i6 = r8.A04;
                int i7 = r5.A01;
                int i8 = 0;
                if (i7 != 0) {
                    i8 = -1 >>> (32 - i7);
                }
                if (i6 == i8) {
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            i = 0;
            for (int i9 = 0; i9 < i4; i9++) {
                if (((1 << i9) & r8.A03) != 0) {
                    if (i > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(r5.A00(i9));
                    i++;
                }
            }
            str = sb2.toString();
            0qQ.A07(str);
            sb = new StringBuilder();
            int i10 = r5.A01;
            i2 = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                if (((1 << i11) & r8.A04) != 0) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(r5.A01(i11));
                    i2++;
                }
            }
        } else {
            AnonymousClass5X5 r0 = this.A0b;
            AnonymousClass5X5.A00(r0);
            C286535Wu r82 = r0.A05.A00;
            r5 = AnonymousClass5aP.A00;
            r82.A02(r5);
            C286685Xj.A01(r82, obj, 0);
            0qQ.A0C(r14, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            0u4.A05(r14, 2);
            C286685Xj.A01(r82, r14, 1);
            int i12 = r82.A03;
            int i13 = r5.A00;
            int i14 = 0;
            if (i13 != 0) {
                i14 = -1 >>> (32 - i13);
            }
            if (i12 == i14) {
                int i15 = r82.A04;
                int i16 = r5.A01;
                int i17 = 0;
                if (i16 != 0) {
                    i17 = -1 >>> (32 - i16);
                }
                if (i15 == i17) {
                    return;
                }
            }
            StringBuilder sb3 = new StringBuilder();
            i = 0;
            for (int i18 = 0; i18 < i13; i18++) {
                if (((1 << i18) & r82.A03) != 0) {
                    if (i > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(r5.A00(i18));
                    i++;
                }
            }
            str = sb3.toString();
            0qQ.A07(str);
            sb = new StringBuilder();
            int i19 = r5.A01;
            i2 = 0;
            for (int i20 = 0; i20 < i19; i20++) {
                if (((1 << i20) & r82.A04) != 0) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(r5.A01(i20));
                    i2++;
                }
            }
        }
        String obj2 = sb.toString();
        0qQ.A07(obj2);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Error while pushing ");
        sb4.append(r5);
        sb4.append(". Not all arguments were provided. Missing ");
        sb4.append(i);
        sb4.append(" int arguments (");
        sb4.append(str);
        sb4.append(") and ");
        sb4.append(i2);
        sb4.append(" object arguments (");
        sb4.append(obj2);
        sb4.append(").");
        C18086VlG.A01(sb4.toString());
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        if (r4 != r3) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AMT(X.C62320sa r19) {
        /*
            r18 = this;
            r3 = r18
            boolean r0 = r3.A0M
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "A call to createNode(), emitNode() or useNode() expected was not expected"
        L_0x0008:
            X.AnonymousClass5XN.A03(r0)
        L_0x000b:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0010:
            r11 = 0
            r3.A0M = r11
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = "createNode() can only be called when inserting"
            goto L_0x0008
        L_0x001a:
            X.5X0 r0 = r3.A0W
            int[] r1 = r0.A01
            int r0 = r0.A00
            int r0 = r0 + -1
            r2 = r1[r0]
            X.5X4 r1 = r3.A0D
            int r0 = r1.A08
            X.5X7 r1 = r1.A0I(r0)
            int r0 = r3.A03
            int r0 = r0 + 1
            r3.A03 = r0
            X.5X8 r14 = r3.A0H
            X.5Wu r12 = r14.A00
            X.5aM r8 = X.C287575aM.A00
            r12.A02(r8)
            r0 = r19
            X.C286685Xj.A01(r12, r0, r11)
            X.C286685Xj.A00(r12, r11, r2)
            r10 = 1
            X.C286685Xj.A01(r12, r1, r10)
            int r4 = r12.A03
            int r13 = r8.A00
            r3 = 0
            if (r13 == 0) goto L_0x0052
            r3 = -1
            int r0 = 32 - r13
            int r3 = r3 >>> r0
        L_0x0052:
            if (r4 != r3) goto L_0x0062
            int r4 = r12.A04
            int r0 = r8.A01
            r3 = 0
            if (r0 == 0) goto L_0x005f
            r3 = -1
            int r0 = 32 - r0
            int r3 = r3 >>> r0
        L_0x005f:
            r0 = 1
            if (r4 == r3) goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            java.lang.String r17 = ")."
            java.lang.String r7 = " object arguments ("
            java.lang.String r6 = ") and "
            java.lang.String r5 = " int arguments ("
            java.lang.String r4 = ". Not all arguments were provided. Missing "
            java.lang.String r3 = "Error while pushing "
            java.lang.String r9 = ", "
            if (r0 != 0) goto L_0x00be
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r2 = 0
        L_0x0079:
            if (r11 >= r13) goto L_0x0093
            int r1 = r10 << r11
            int r0 = r12.A03
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0090
            if (r2 <= 0) goto L_0x0087
            r14.append(r9)
        L_0x0087:
            java.lang.String r0 = r8.A00(r11)
            r14.append(r0)
            int r2 = r2 + 1
        L_0x0090:
            int r11 = r11 + 1
            goto L_0x0079
        L_0x0093:
            java.lang.String r13 = r14.toString()
            X.0qQ.A07(r13)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r15 = r8.A01
            r14 = 0
            r11 = 0
        L_0x00a3:
            if (r11 >= r15) goto L_0x010a
            int r16 = r10 << r11
            int r0 = r12.A04
            r16 = r16 & r0
            if (r16 == 0) goto L_0x00bb
            if (r2 <= 0) goto L_0x00b2
            r1.append(r9)
        L_0x00b2:
            java.lang.String r0 = r8.A01(r11)
            r1.append(r0)
            int r14 = r14 + 1
        L_0x00bb:
            int r11 = r11 + 1
            goto L_0x00a3
        L_0x00be:
            X.5Wu r12 = r14.A01
            X.5aN r8 = X.C287585aN.A00
            r12.A02(r8)
            X.C286685Xj.A00(r12, r11, r2)
            X.C286685Xj.A01(r12, r1, r11)
            int r13 = r12.A03
            r1 = -1
            r0 = 31
            int r1 = r1 >>> r0
            if (r13 != r1) goto L_0x00d8
            int r0 = r12.A04
            if (r0 != r1) goto L_0x00d8
            return
        L_0x00d8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            int r10 = r10 << r11
            r0 = r10 & r13
            if (r0 == 0) goto L_0x00eb
            java.lang.String r0 = r8.A00(r11)
            r1.append(r0)
            r2 = 1
        L_0x00eb:
            java.lang.String r13 = r1.toString()
            X.0qQ.A07(r13)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r14 = 0
            int r0 = r12.A04
            r10 = r10 & r0
            if (r10 == 0) goto L_0x010a
            if (r2 <= 0) goto L_0x0102
            r1.append(r9)
        L_0x0102:
            java.lang.String r0 = r8.A01(r11)
            r1.append(r0)
            r14 = 1
        L_0x010a:
            java.lang.String r0 = r1.toString()
            X.0qQ.A07(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r8)
            r1.append(r4)
            r1.append(r2)
            r1.append(r5)
            r1.append(r13)
            r1.append(r6)
            r1.append(r14)
            r1.append(r7)
            r1.append(r0)
            r0 = r17
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C18086VlG.A01(r0)
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C286565Wx.AMT(X.0sa):void");
    }

    public final void ANY(boolean z) {
        if (this.A03 != 0) {
            AnonymousClass5XN.A03("No nodes can be emitted before calling dactivateToEndGroup");
            throw AnonymousClass00P.createAndThrow();
        } else if (this.A0K) {
        } else {
            if (!z) {
                A09();
                return;
            }
            AnonymousClass5X3 r0 = this.A0B;
            int i = r0.A01;
            int i2 = r0.A00;
            AnonymousClass5X5 r1 = this.A0b;
            AnonymousClass5X5.A03(r1, false);
            r1.A05.A00.A02(C288485bz.A00);
            AnonymousClass5XN.A05(this.A0c, i, i2);
            this.A0B.A09();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        if (r6 == r1) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C286625Xd ASQ() {
        /*
            r20 = this;
            r4 = r20
            X.5Wz r0 = r4.A0Z
            java.util.ArrayList r1 = r0.A00
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            r19 = 0
            if (r0 == 0) goto L_0x00e1
            int r0 = r1.size()
            int r0 = r0 + -1
            java.lang.Object r3 = r1.remove(r0)
            X.5Xd r3 = (X.C286625Xd) r3
        L_0x001c:
            r2 = 0
            if (r3 == 0) goto L_0x00c7
            int r0 = r3.A01
            r0 = r0 & -9
            r3.A01 = r0
            int r12 = r4.A01
            X.0vu r11 = r3.A02
            if (r11 == 0) goto L_0x009f
            r0 = r0 & 16
            if (r0 != 0) goto L_0x009f
            int[] r10 = r11.A02
            long[] r9 = r11.A03
            int r0 = r9.length
            int r8 = r0 + -2
            if (r8 < 0) goto L_0x009f
            r7 = 0
        L_0x0039:
            r17 = r9[r7]
            r13 = -1
            long r13 = r13 ^ r17
            r0 = 7
            long r13 = r13 << r0
            long r13 = r13 & r17
            r5 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r5
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00db
            int r0 = r7 - r8
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            r6 = 8
            int r5 = 8 - r0
            r1 = 0
        L_0x0058:
            if (r1 >= r5) goto L_0x00d9
            r13 = 255(0xff, double:1.26E-321)
            long r15 = r17 & r13
            r13 = 128(0x80, double:6.32E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d4
            int r0 = r7 << 3
            int r0 = r0 + r1
            r0 = r10[r0]
            if (r0 == r12) goto L_0x00d4
            X.9M6 r5 = new X.9M6
            r5.<init>((int) r12, (int) r2, (java.lang.Object) r3, (java.lang.Object) r11)
            X.5X5 r0 = r4.A0b
            X.5Pj r1 = r4.A0V
            X.5Ws r0 = r0.A05
            X.5Wu r11 = r0.A00
            X.XE0 r8 = X.XE0.A00
            r11.A02(r8)
            r10 = 0
            X.C286685Xj.A01(r11, r5, r2)
            r9 = 1
            X.C286685Xj.A01(r11, r1, r9)
            int r6 = r11.A03
            int r5 = r8.A00
            r1 = 0
            if (r5 == 0) goto L_0x0090
            r1 = -1
            int r0 = 32 - r5
            int r1 = r1 >>> r0
        L_0x0090:
            if (r6 != r1) goto L_0x00e5
            int r6 = r11.A04
            int r0 = r8.A01
            r1 = 0
            if (r0 == 0) goto L_0x009d
            r1 = -1
            int r0 = 32 - r0
            int r1 = r1 >>> r0
        L_0x009d:
            if (r6 != r1) goto L_0x00e5
        L_0x009f:
            int r1 = r3.A01
            r0 = r1 & 16
            if (r0 != 0) goto L_0x00c7
            r0 = r1 & 1
            if (r0 != 0) goto L_0x00ad
            boolean r0 = r4.A0J
            if (r0 == 0) goto L_0x00c7
        L_0x00ad:
            X.5X7 r0 = r3.A04
            if (r0 != 0) goto L_0x00bf
            boolean r0 = r4.A0K
            if (r0 == 0) goto L_0x00cb
            X.5X4 r1 = r4.A0D
            int r0 = r1.A08
            X.5X7 r0 = r1.A0I(r0)
        L_0x00bd:
            r3.A04 = r0
        L_0x00bf:
            int r0 = r3.A01
            r0 = r0 & -5
            r3.A01 = r0
            r19 = r3
        L_0x00c7:
            A0L(r4, r2)
            return r19
        L_0x00cb:
            X.5X3 r1 = r4.A0B
            int r0 = r1.A05
            X.5X7 r0 = r1.A02(r0)
            goto L_0x00bd
        L_0x00d4:
            long r17 = r17 >> r6
            int r1 = r1 + 1
            goto L_0x0058
        L_0x00d9:
            if (r5 != r6) goto L_0x009f
        L_0x00db:
            if (r7 == r8) goto L_0x009f
            int r7 = r7 + 1
            goto L_0x0039
        L_0x00e1:
            r3 = r19
            goto L_0x001c
        L_0x00e5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r7 = 0
        L_0x00eb:
            java.lang.String r6 = ", "
            if (r2 >= r5) goto L_0x0107
            int r1 = r9 << r2
            int r0 = r11.A03
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0104
            if (r7 <= 0) goto L_0x00fb
            r3.append(r6)
        L_0x00fb:
            java.lang.String r0 = r8.A00(r2)
            r3.append(r0)
            int r7 = r7 + 1
        L_0x0104:
            int r2 = r2 + 1
            goto L_0x00eb
        L_0x0107:
            java.lang.String r5 = r3.toString()
            X.0qQ.A07(r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r2 = r8.A01
            r3 = 0
        L_0x0116:
            if (r10 >= r2) goto L_0x0130
            int r1 = r9 << r10
            int r0 = r11.A04
            r1 = r1 & r0
            if (r1 == 0) goto L_0x012d
            if (r7 <= 0) goto L_0x0124
            r4.append(r6)
        L_0x0124:
            java.lang.String r0 = r8.A01(r10)
            r4.append(r0)
            int r3 = r3 + 1
        L_0x012d:
            int r10 = r10 + 1
            goto L_0x0116
        L_0x0130:
            java.lang.String r2 = r4.toString()
            X.0qQ.A07(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Error while pushing "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ". Not all arguments were provided. Missing "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " int arguments ("
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ") and "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " object arguments ("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ")."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C18086VlG.A01(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C286565Wx.ASQ():X.5Xd");
    }

    public final void ASR() {
        if (this.A0O && this.A0B.A05 == this.A06) {
            this.A06 = -1;
            this.A0O = false;
        }
        A0L(this, false);
    }

    public final boolean Bwn() {
        C286625Xd A0O2;
        if (this.A0K || this.A0O || this.A0N || (A0O2 = A0O()) == null || (A0O2.A01 & 8) != 0) {
            return false;
        }
        return true;
    }

    public final Object ECw() {
        if (this.A0K) {
            A0A();
        } else {
            Object A042 = this.A0B.A04();
            if (!this.A0O || (A042 instanceof AnonymousClass6IH)) {
                if (A042 instanceof C286695Xk) {
                    return ((C286695Xk) A042).A01;
                }
                return A042;
            }
        }
        return AnonymousClass5XT.A00;
    }

    public final void Evl() {
        if (this.A03 == 0) {
            C286625Xd A0O2 = A0O();
            if (A0O2 != null) {
                A0O2.A01 |= 16;
            }
            if (this.A0c.isEmpty()) {
                A09();
            } else {
                A07();
            }
        } else {
            AnonymousClass5XN.A03("No nodes can be emitted before calling skipAndEndGroup");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void ExS(int i) {
        int i2;
        if (this.A08 != null) {
            A0K(this, (Object) null, (Object) null, i, 0);
            return;
        }
        A0A();
        this.A02 = this.A05 ^ Integer.rotateLeft(Integer.rotateLeft(this.A02, 3) ^ i, 3);
        this.A05++;
        AnonymousClass5X3 r5 = this.A0B;
        if (this.A0K) {
            r5.A04++;
            AnonymousClass5X4 r1 = this.A0D;
            Object obj = AnonymousClass5XT.A00;
            AnonymousClass5X4.A0E(r1, obj, obj, i, false);
            A0M((AnonymousClass5XQ) null, false);
            return;
        }
        int i3 = r5.A01;
        int i4 = r5.A00;
        if (i3 < i4) {
            i2 = r5.A0A[i3 * 5];
        } else {
            i2 = 0;
        }
        if (i2 != i || (i3 < i4 && (r5.A0A[(i3 * 5) + 1] & 536870912) != 0)) {
            if (r5.A04 <= 0 && i3 != i4) {
                int i5 = this.A04;
                A08();
                this.A0b.A05(i5, r5.A01());
                AnonymousClass5XN.A05(this.A0c, i3, r5.A01);
            }
            r5.A04++;
            this.A0K = true;
            this.A0A = null;
            AnonymousClass5X4 r2 = this.A0D;
            if (r2.A0H) {
                r2 = this.A0C.A01();
                this.A0D = r2;
                r2.A0M();
                this.A0Q = false;
                this.A0A = null;
            }
            r2.A0J();
            int i6 = r2.A00;
            Object obj2 = AnonymousClass5XT.A00;
            AnonymousClass5X4.A0E(r2, obj2, obj2, i, false);
            this.A0S = r2.A0I(i6);
            A0M((AnonymousClass5XQ) null, false);
            return;
        }
        r5.A0A();
        A0M((AnonymousClass5XQ) null, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r4 = r5.A0B;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ExW(int r6, java.lang.Object r7) {
        /*
            r5 = this;
            r3 = 207(0xcf, float:2.9E-43)
            boolean r0 = r5.A0K
            if (r0 != 0) goto L_0x002d
            X.5X3 r4 = r5.A0B
            int r2 = r4.A01
            int r0 = r4.A00
            if (r2 >= r0) goto L_0x002d
            int[] r1 = r4.A0A
            int r0 = r2 * 5
            r0 = r1[r0]
            if (r0 != r3) goto L_0x002d
            java.lang.Object r0 = r4.A03()
            boolean r0 = X.0qQ.A0K(r0, r7)
            if (r0 != 0) goto L_0x002d
            int r0 = r5.A06
            if (r0 >= 0) goto L_0x002d
            X.5X3 r0 = r5.A0B
            int r0 = r0.A01
            r5.A06 = r0
            r0 = 1
            r5.A0O = r0
        L_0x002d:
            r1 = 0
            r0 = 0
            A0K(r5, r1, r7, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C286565Wx.ExW(int, java.lang.Object):void");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.5Xk] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r2 == r1) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FLL(java.lang.Object r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.AnonymousClass2DP
            if (r0 == 0) goto L_0x011b
            boolean r0 = r12.A0K
            if (r0 == 0) goto L_0x0032
            X.5X5 r0 = r12.A0b
            X.5Ws r0 = r0.A05
            X.5Wu r9 = r0.A00
            X.5Xi r7 = X.C286675Xi.A00
            r9.A02(r7)
            r8 = 0
            X.C286685Xj.A01(r9, r13, r8)
            int r2 = r9.A03
            int r4 = r7.A00
            r1 = 0
            if (r4 == 0) goto L_0x0022
            r1 = -1
            int r0 = 32 - r4
            int r1 = r1 >>> r0
        L_0x0022:
            r11 = 1
            if (r2 != r1) goto L_0x007c
            int r2 = r9.A04
            int r0 = r7.A01
            r1 = 0
            if (r0 == 0) goto L_0x0030
            r1 = -1
            int r0 = 32 - r0
            int r1 = r1 >>> r0
        L_0x0030:
            if (r2 != r1) goto L_0x007c
        L_0x0032:
            java.util.Set r0 = r12.A0d
            r0.add(r13)
            X.2DP r13 = (X.AnonymousClass2DP) r13
            boolean r0 = r12.A0K
            r2 = 0
            if (r0 == 0) goto L_0x0060
            X.5X4 r4 = r12.A0D
            int r1 = r4.A00
            int r3 = r4.A08
            int r0 = r3 + 1
            if (r1 <= r0) goto L_0x0111
            int r2 = r1 + -1
            int[] r1 = r4.A0I
            int r0 = X.AnonymousClass5X4.A02(r4, r1, r2)
        L_0x0050:
            if (r0 == r3) goto L_0x005a
            if (r0 < 0) goto L_0x005a
            r2 = r0
            int r0 = X.AnonymousClass5X4.A02(r4, r1, r0)
            goto L_0x0050
        L_0x005a:
            X.5X7 r2 = r4.A0I(r2)
            goto L_0x0111
        L_0x0060:
            X.5X3 r4 = r12.A0B
            int r1 = r4.A01
            int r3 = r4.A05
            int r0 = r3 + 1
            if (r1 <= r0) goto L_0x0111
            int r2 = r1 + -1
            int[] r1 = r4.A0A
            int r0 = r2 * 5
        L_0x0070:
            int r0 = r0 + 2
            r0 = r1[r0]
            if (r0 == r3) goto L_0x010d
            if (r0 < 0) goto L_0x010d
            r2 = r0
            int r0 = r0 * 5
            goto L_0x0070
        L_0x007c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 0
            r6 = 0
        L_0x0083:
            java.lang.String r10 = ", "
            if (r2 >= r4) goto L_0x009f
            int r1 = r11 << r2
            int r0 = r9.A03
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009c
            if (r6 <= 0) goto L_0x0093
            r3.append(r10)
        L_0x0093:
            java.lang.String r0 = r7.A00(r2)
            r3.append(r0)
            int r6 = r6 + 1
        L_0x009c:
            int r2 = r2 + 1
            goto L_0x0083
        L_0x009f:
            java.lang.String r5 = r3.toString()
            X.0qQ.A07(r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r2 = r7.A01
            r3 = 0
        L_0x00ae:
            if (r8 >= r2) goto L_0x00c8
            int r1 = r11 << r8
            int r0 = r9.A04
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00c5
            if (r6 <= 0) goto L_0x00bc
            r4.append(r10)
        L_0x00bc:
            java.lang.String r0 = r7.A01(r8)
            r4.append(r0)
            int r3 = r3 + 1
        L_0x00c5:
            int r8 = r8 + 1
            goto L_0x00ae
        L_0x00c8:
            java.lang.String r2 = r4.toString()
            X.0qQ.A07(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Error while pushing "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ". Not all arguments were provided. Missing "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " int arguments ("
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ") and "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " object arguments ("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ")."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C18086VlG.A01(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x010d:
            X.5X7 r2 = r4.A02(r2)
        L_0x0111:
            X.5Xk r0 = new X.5Xk
            r0.<init>()
            r0.A01 = r13
            r0.A00 = r2
            r13 = r0
        L_0x011b:
            r12.A0Q(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C286565Wx.FLL(java.lang.Object):void");
    }

    public final void FMk() {
        Object obj;
        String str;
        if (!this.A0M) {
            str = "A call to createNode(), emitNode() or useNode() expected was not expected";
        } else {
            this.A0M = false;
            if (!(!this.A0K)) {
                str = "useNode() called while inserting";
            } else {
                AnonymousClass5X3 r1 = this.A0B;
                int i = r1.A05;
                int[] iArr = r1.A0A;
                if (AnonymousClass5X6.A03(iArr, i)) {
                    obj = r1.A0B[iArr[(i * 5) + 4]];
                } else {
                    obj = null;
                }
                AnonymousClass5X5 r12 = this.A0b;
                AnonymousClass5X5.A02(r12);
                r12.A04.A00.add(obj);
                if (this.A0O && (obj instanceof AnonymousClass5R9)) {
                    AnonymousClass5X5.A00(r12);
                    r12.A05.A00.A02(C288495c0.A00);
                    return;
                }
                return;
            }
        }
        AnonymousClass5XN.A03(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0049, code lost:
        if (r8.A0D() != false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C286565Wx(X.C286475Wm r7, X.AnonymousClass5PL r8, X.C285025Pj r9, X.C286505Wq r10, X.AnonymousClass5Ws r11, X.AnonymousClass5Ws r12, java.util.Set r13) {
        /*
            r6 = this;
            r6.<init>()
            r6.A0T = r7
            r6.A0U = r8
            r6.A0Y = r10
            r6.A0d = r13
            r6.A0E = r11
            r6.A0G = r12
            r6.A0V = r9
            X.5Wz r0 = new X.5Wz
            r0.<init>()
            r6.A0a = r0
            X.5X0 r0 = new X.5X0
            r0.<init>()
            r6.A0W = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.A0c = r0
            X.5X0 r0 = new X.5X0
            r0.<init>()
            r6.A0f = r0
            X.5RL r0 = X.AnonymousClass5RL.A00
            r6.A09 = r0
            X.5X0 r0 = new X.5X0
            r0.<init>()
            r6.A0X = r0
            r0 = -1
            r6.A06 = r0
            boolean r0 = r8 instanceof androidx.compose.runtime.Recomposer
            if (r0 == 0) goto L_0x009c
            r5 = 0
        L_0x0040:
            r3 = 0
            r4 = 1
            if (r5 != 0) goto L_0x004b
            boolean r1 = r8.A0D()
            r0 = 0
            if (r1 == 0) goto L_0x004c
        L_0x004b:
            r0 = 1
        L_0x004c:
            r6.A0P = r0
            X.5X1 r0 = new X.5X1
            r0.<init>(r6)
            r6.A0e = r0
            X.5Wz r0 = new X.5Wz
            r0.<init>()
            r6.A0Z = r0
            X.5X3 r0 = r10.A00()
            r0.A07()
            r6.A0B = r0
            X.5Wq r2 = new X.5Wq
            r2.<init>()
            if (r5 == 0) goto L_0x0073
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.A06 = r0
        L_0x0073:
            boolean r0 = r8.A0D()
            if (r0 == 0) goto L_0x0081
            r1 = 6
            X.0yC r0 = new X.0yC
            r0.<init>(r1)
            r2.A04 = r0
        L_0x0081:
            r6.A0C = r2
            X.5X4 r0 = r2.A01()
            r0.A0P(r4)
            r6.A0D = r0
            X.5Ws r1 = r6.A0E
            X.5X5 r0 = new X.5X5
            r0.<init>(r6, r1)
            r6.A0b = r0
            X.5Wq r0 = r6.A0C
            X.5X3 r1 = r0.A00()
            goto L_0x00a2
        L_0x009c:
            r0 = r8
            X.5Q1 r0 = (X.AnonymousClass5Q1) r0
            boolean r5 = r0.A05
            goto L_0x0040
        L_0x00a2:
            X.5X7 r0 = r1.A02(r3)     // Catch:{ all -> 0x00b3 }
            r1.A07()
            r6.A0S = r0
            X.5X8 r0 = new X.5X8
            r0.<init>()
            r6.A0H = r0
            return
        L_0x00b3:
            r0 = move-exception
            r1.A07()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C286565Wx.<init>(X.5Wm, X.5PL, X.5Pj, X.5Wq, X.5Ws, X.5Ws, java.util.Set):void");
    }

    private final void A0D(int i, int i2) {
        if (A01(i) == i2) {
            return;
        }
        if (i < 0) {
            01H r1 = this.A07;
            if (r1 == null) {
                r1 = new 01H();
                long[] jArr = 01o.A00;
                C63120yJ.A02(r1, 6);
                this.A07 = r1;
            }
            r1.A05(i, i2);
            return;
        }
        int[] iArr = this.A0R;
        if (iArr == null) {
            int i3 = this.A0B.A08;
            iArr = new int[i3];
            Arrays.fill(iArr, 0, i3, -1);
            this.A0R = iArr;
        }
        iArr[i] = i2;
    }

    private final void A0E(int i, int i2) {
        int A012 = A01(i);
        if (A012 != i2) {
            int i3 = i2 - A012;
            ArrayList arrayList = this.A0a.A00;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int A013 = A01(i) + i3;
                A0D(i, A013);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        AnonymousClass5XQ r0 = (AnonymousClass5XQ) arrayList.get(i4);
                        if (r0 != null && r0.A00(i, A013)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                AnonymousClass5X3 r02 = this.A0B;
                if (i < 0) {
                    i = r02.A05;
                } else {
                    int[] iArr = r02.A0A;
                    if (!AnonymousClass5X6.A03(iArr, i)) {
                        i = iArr[(i * 5) + 2];
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static final void A0G(C286565Wx r3) {
        A0H(r3);
        r3.A0a.A00.clear();
        r3.A0W.A00 = 0;
        r3.A0f.A00 = 0;
        r3.A0X.A00 = 0;
        r3.A0I = null;
        AnonymousClass5X8 r1 = r3.A0H;
        r1.A01.A00();
        r1.A00.A00();
        r3.A02 = 0;
        r3.A00 = 0;
        r3.A0M = false;
        r3.A0K = false;
        r3.A0O = false;
        r3.A0L = false;
        r3.A06 = -1;
        AnonymousClass5X3 r12 = r3.A0B;
        if (!r12.A06) {
            r12.A07();
        }
        if (!r3.A0D.A0H) {
            r3.A06();
        }
    }

    public final boolean AGq(double d) {
        Object A0P2 = A0P();
        if ((A0P2 instanceof Double) && d == ((Number) A0P2).doubleValue()) {
            return false;
        }
        A0Q(Double.valueOf(d));
        return true;
    }

    public final boolean AGr(float f) {
        Object A0P2 = A0P();
        if ((A0P2 instanceof Float) && f == ((Number) A0P2).floatValue()) {
            return false;
        }
        A0Q(Float.valueOf(f));
        return true;
    }

    public final boolean AGs(int i) {
        Object A0P2 = A0P();
        if ((A0P2 instanceof Integer) && i == ((Number) A0P2).intValue()) {
            return false;
        }
        A0Q(Integer.valueOf(i));
        return true;
    }

    public final boolean AGt(long j) {
        Object A0P2 = A0P();
        if ((A0P2 instanceof Long) && j == ((Number) A0P2).longValue()) {
            return false;
        }
        A0Q(Long.valueOf(j));
        return true;
    }

    public final boolean AGu(Object obj) {
        if (0qQ.A0K(A0P(), obj)) {
            return false;
        }
        A0Q(obj);
        return true;
    }

    public final boolean AGv(boolean z) {
        Object A0P2 = A0P();
        if ((A0P2 instanceof Boolean) && z == ((Boolean) A0P2).booleanValue()) {
            return false;
        }
        A0Q(Boolean.valueOf(z));
        return true;
    }

    public final boolean AGw(Object obj) {
        if (A0P() == obj) {
            return false;
        }
        A0Q(obj);
        return true;
    }

    public final Object AJO(C267304bL r2) {
        return C286615Xc.A01(r2, A04(this));
    }

    public final boolean Aw3() {
        C286625Xd A0O2;
        if (!Bwn() || this.A0N || ((A0O2 = A0O()) != null && (A0O2.A01 & 4) != 0)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [X.5Xd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v5, types: [X.5Xd, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C286565Wx ExV(int r5) {
        /*
            r4 = this;
            r4.ExS(r5)
            boolean r0 = r4.A0K
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            if (r0 == 0) goto L_0x002c
            X.5Pj r0 = r4.A0V
            X.0qQ.A0C(r0, r2)
            X.5Wn r0 = (X.AnonymousClass5Wn) r0
            X.5Xd r3 = new X.5Xd
            r3.<init>()
            r3.A05 = r0
            X.5Wz r0 = r4.A0Z
            java.util.ArrayList r0 = r0.A00
            r0.add(r3)
            r4.A0Q(r3)
        L_0x0021:
            int r0 = r4.A01
            r3.A00 = r0
            int r0 = r3.A01
            r0 = r0 & -17
            r3.A01 = r0
            return r4
        L_0x002c:
            java.util.List r1 = r4.A0c
            X.5X3 r0 = r4.A0B
            int r0 = r0.A05
            int r0 = X.AnonymousClass5XN.A00(r1, r0)
            if (r0 < 0) goto L_0x0083
            java.lang.Object r1 = r1.remove(r0)
        L_0x003c:
            X.5X3 r0 = r4.A0B
            java.lang.Object r3 = r0.A04()
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 == 0) goto L_0x007b
            X.5Pj r0 = r4.A0V
            X.0qQ.A0C(r0, r2)
            X.5Wn r0 = (X.AnonymousClass5Wn) r0
            X.5Xd r3 = new X.5Xd
            r3.<init>()
            r3.A05 = r0
            r4.A0Q(r3)
        L_0x005b:
            r2 = 0
            if (r1 != 0) goto L_0x0068
            int r1 = r3.A01
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0069
            r0 = r1 & -65
            r3.A01 = r0
        L_0x0068:
            r2 = 1
        L_0x0069:
            int r1 = r3.A01
            r0 = r1 & -9
            if (r2 == 0) goto L_0x0071
            r0 = r1 | 8
        L_0x0071:
            r3.A01 = r0
            X.5Wz r0 = r4.A0Z
            java.util.ArrayList r0 = r0.A00
            r0.add(r3)
            goto L_0x0021
        L_0x007b:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            X.0qQ.A0C(r3, r0)
            X.5Xd r3 = (X.C286625Xd) r3
            goto L_0x005b
        L_0x0083:
            r1 = 0
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C286565Wx.ExV(int):X.5Wx");
    }
}
