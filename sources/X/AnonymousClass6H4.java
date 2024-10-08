package X;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6H4  reason: invalid class name */
public final class AnonymousClass6H4 {
    public int A00;
    public C305636Ix A01;
    public C267814cG A02;
    public final 0vr A03 = new 0vr(6);
    public final 0vq A04;
    public final Modifier A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final List A09;
    public final List A0A;

    public static final void A01(AnonymousClass6JQ r10, AnonymousClass6JL r11, int i) {
        long j;
        long j2;
        long j3;
        int i2 = 0;
        long BXq = r11.BXq(0);
        if (r11.CeR()) {
            j2 = ((long) ((int) (BXq >> 32))) << 32;
            j3 = (long) i;
            j = 4294967295L;
        } else {
            j = 4294967295L;
            j2 = ((long) i) << 32;
            j3 = (long) ((int) (4294967295L & BXq));
        }
        long j4 = j2 | (j3 & j);
        C56602I4b[] i4bArr = r10.A06;
        int length = i4bArr.length;
        int i3 = 0;
        while (i2 < length) {
            C56602I4b i4b = i4bArr[i2];
            int i4 = i3 + 1;
            if (i4b != null) {
                i4b.A02 = C289165d8.A01(j4, C289165d8.A00(r11.BXq(i3), BXq));
            }
            i2++;
            i3 = i4;
        }
    }

    public static final void A02(AnonymousClass6H4 r18, AnonymousClass6JL r19, boolean z) {
        AnonymousClass6JL r9 = r19;
        Object A032 = r18.A03.A03(r9.getKey());
        0qQ.A0A(A032);
        C56602I4b[] i4bArr = ((AnonymousClass6JQ) A032).A06;
        int length = i4bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            C56602I4b i4b = i4bArr[i];
            int i3 = i2 + 1;
            if (i4b != null) {
                long BXq = r9.BXq(i2);
                long j = i4b.A02;
                if (!(j == C56602I4b.A0G || j == BXq)) {
                    long A002 = C289165d8.A00(BXq, j);
                    AnonymousClass5b8 r15 = i4b.A03;
                    if (r15 != null) {
                        long A003 = C289165d8.A00(((C289165d8) i4b.A0C.getValue()).A00, A002);
                        C56602I4b.A00(i4b, A003);
                        i4b.A0B.Epw(true);
                        i4b.A05 = z;
                        C262224Cq r4 = i4b.A0E;
                        1Eo.A05(19B.A00, new C52359GPe((Object) i4b, (Object) r15, A003, (AnonymousClass4D7) null, 2), r4);
                    }
                }
                i4b.A02 = BXq;
            }
            i++;
            i2 = i3;
        }
    }

    public static final void A03(AnonymousClass6H4 r2, Object obj) {
        C56602I4b[] i4bArr;
        AnonymousClass6JQ r0 = (AnonymousClass6JQ) r2.A03.A07(obj);
        if (r0 != null && (i4bArr = r0.A06) != null) {
            for (C56602I4b i4b : i4bArr) {
                if (i4b != null) {
                    i4b.A03();
                }
            }
        }
    }

    public final long A04() {
        long j = 0;
        List list = this.A06;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C56602I4b i4b = (C56602I4b) list.get(i);
            GraphicsLayer graphicsLayer = i4b.A04;
            if (graphicsLayer != null) {
                long j2 = i4b.A02;
                long j3 = graphicsLayer.A05;
                j = C289155d7.A00(Math.max((int) (j >> 32), ((int) (j2 >> 32)) + ((int) (j3 >> 32))), Math.max(C289005cr.A00(j), ((int) (j2 & 4294967295L)) + C289005cr.A00(j3)));
            }
        }
        return j;
    }

    public final C56602I4b A05(Object obj, int i) {
        C56602I4b[] i4bArr;
        AnonymousClass6JQ r0 = (AnonymousClass6JQ) this.A03.A03(obj);
        if (r0 == null || (i4bArr = r0.A06) == null) {
            return null;
        }
        return i4bArr[i];
    }

    public final void A06() {
        0vr r13 = this.A03;
        boolean z = false;
        if (r13.A01 != 0) {
            z = true;
        }
        if (z) {
            Object[] objArr = r13.A04;
            long[] jArr = r13.A02;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((-1 ^ j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i2 = 8 - (((i - length) ^ -1) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (C56602I4b i4b : ((AnonymousClass6JQ) objArr[(i << 3) + i3]).A06) {
                                    if (i4b != null) {
                                        i4b.A03();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            r13.A08();
        }
        this.A01 = C305636Ix.A00;
        this.A00 = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        if (r63 == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03a9, code lost:
        if (r2 == r5.BGq(r4)) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0101, code lost:
        if (r11 != -1) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.C305636Ix r50, X.AnonymousClass6J4 r51, X.C285855Sz r52, java.util.List r53, X.C262224Cq r54, int r55, int r56, int r57, int r58, int r59, int r60, boolean r61, boolean r62, boolean r63) {
        /*
            r49 = this;
            r6 = r49
            X.6Ix r5 = r6.A01
            r48 = r50
            r0 = r48
            r6.A01 = r0
            r47 = r53
            int r8 = r47.size()
            r10 = 0
            r7 = 0
        L_0x0012:
            if (r7 >= r8) goto L_0x00af
            r0 = r47
            java.lang.Object r4 = r0.get(r7)
            X.6JL r4 = (X.AnonymousClass6JL) r4
            int r3 = r4.Bco()
            r2 = 0
        L_0x0021:
            if (r2 >= r3) goto L_0x00ab
            java.lang.Object r1 = r4.BaY(r2)
            boolean r0 = r1 instanceof X.AnonymousClass6JN
            if (r0 == 0) goto L_0x00a7
            if (r1 == 0) goto L_0x00a7
        L_0x002d:
            int r0 = r6.A00
            r28 = r0
            java.lang.Object r0 = X.00k.A0J(r47)
            X.6JL r0 = (X.AnonymousClass6JL) r0
            if (r0 == 0) goto L_0x00a5
            int r0 = r0.getIndex()
        L_0x003d:
            r6.A00 = r0
            r0 = r55
            if (r61 == 0) goto L_0x00a0
            long r0 = X.AnonymousClass5TW.A00(r10, r0)
        L_0x0047:
            if (r62 != 0) goto L_0x004d
            r32 = 0
            if (r63 != 0) goto L_0x004f
        L_0x004d:
            r32 = 1
        L_0x004f:
            X.0vr r7 = r6.A03
            java.lang.Object[] r12 = r7.A03
            long[] r11 = r7.A02
            int r9 = r11.length
            r2 = 2
            int r9 = r9 - r2
            r22 = 128(0x80, double:6.32E-322)
            r20 = 255(0xff, double:1.26E-321)
            r33 = 7
            r18 = -1
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            if (r9 < 0) goto L_0x00b9
        L_0x0067:
            r24 = r11[r10]
            long r13 = r24 ^ r18
            long r13 = r13 << r33
            long r3 = r24 & r13
            long r3 = r3 & r16
            int r2 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r2 == 0) goto L_0x009b
            int r2 = r10 - r9
            r2 = r2 ^ -1
            int r2 = r2 >>> 31
            int r8 = 8 - r2
            r4 = 0
        L_0x007e:
            if (r4 >= r8) goto L_0x0097
            long r13 = r24 & r20
            int r2 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r2 >= 0) goto L_0x0090
            int r2 = r10 << 3
            int r2 = r2 + r4
            r3 = r12[r2]
            X.0vq r2 = r6.A04
            r2.A09(r3)
        L_0x0090:
            r2 = 8
            long r24 = r24 >> r2
            int r4 = r4 + 1
            goto L_0x007e
        L_0x0097:
            r2 = 8
            if (r8 != r2) goto L_0x00b9
        L_0x009b:
            if (r10 == r9) goto L_0x00b9
            int r10 = r10 + 1
            goto L_0x0067
        L_0x00a0:
            long r0 = (long) r0
            r2 = 32
            long r0 = r0 << r2
            goto L_0x0047
        L_0x00a5:
            r0 = 0
            goto L_0x003d
        L_0x00a7:
            int r2 = r2 + 1
            goto L_0x0021
        L_0x00ab:
            int r7 = r7 + 1
            goto L_0x0012
        L_0x00af:
            X.0vr r0 = r6.A03
            int r0 = r0.A01
            if (r0 != 0) goto L_0x002d
            r6.A06()
            return
        L_0x00b9:
            int r15 = r47.size()
            r9 = 0
        L_0x00be:
            r36 = r52
            r37 = r54
            r38 = r59
            r39 = r60
            if (r9 >= r15) goto L_0x01ec
            r2 = r47
            java.lang.Object r4 = r2.get(r9)
            X.6JL r4 = (X.AnonymousClass6JL) r4
            X.0vq r3 = r6.A04
            java.lang.Object r2 = r4.getKey()
            r3.A0A(r2)
            int r10 = r4.Bco()
            r8 = 0
        L_0x00de:
            if (r8 >= r10) goto L_0x01e3
            java.lang.Object r3 = r4.BaY(r8)
            boolean r2 = r3 instanceof X.AnonymousClass6JN
            if (r2 == 0) goto L_0x01df
            if (r3 == 0) goto L_0x01df
            java.lang.Object r2 = r4.getKey()
            java.lang.Object r8 = r7.A03(r2)
            X.6JQ r8 = (X.AnonymousClass6JQ) r8
            if (r5 == 0) goto L_0x01dc
            java.lang.Object r2 = r4.getKey()
            int r11 = r5.BGq(r2)
            r2 = -1
            r27 = 1
            if (r11 == r2) goto L_0x0105
        L_0x0103:
            r27 = 0
        L_0x0105:
            if (r8 != 0) goto L_0x0175
            X.6JQ r10 = new X.6JQ
            r10.<init>(r6)
            r12 = 0
            long r2 = r4.BXq(r12)
            boolean r8 = r4.CeR()
            if (r8 != 0) goto L_0x0171
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r13
        L_0x011d:
            int r8 = (int) r2
            r34 = r10
            r35 = r4
            r40 = r8
            r34.A00(r35, r36, r37, r38, r39, r40)
            java.lang.Object r2 = r4.getKey()
            r7.A09(r2, r10)
            int r2 = r4.getIndex()
            if (r2 == r11) goto L_0x0147
            r2 = -1
            if (r11 == r2) goto L_0x0147
            r2 = r28
            if (r11 >= r2) goto L_0x0144
            java.util.List r2 = r6.A0A
        L_0x013d:
            r2.add(r4)
        L_0x0140:
            int r9 = r9 + 1
            goto L_0x00be
        L_0x0144:
            java.util.List r2 = r6.A09
            goto L_0x013d
        L_0x0147:
            long r2 = r4.BXq(r12)
            boolean r8 = r4.CeR()
            if (r8 == 0) goto L_0x016d
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r11
        L_0x0157:
            int r8 = (int) r2
            A01(r10, r4, r8)
            if (r27 == 0) goto L_0x0140
            X.I4b[] r4 = r10.A06
            int r3 = r4.length
            r2 = 0
        L_0x0161:
            if (r2 >= r3) goto L_0x0140
            r8 = r4[r2]
            if (r8 == 0) goto L_0x016a
            r8.A01()
        L_0x016a:
            int r2 = r2 + 1
            goto L_0x0161
        L_0x016d:
            r8 = 32
            long r2 = r2 >> r8
            goto L_0x0157
        L_0x0171:
            r8 = 32
            long r2 = r2 >> r8
            goto L_0x011d
        L_0x0175:
            if (r32 == 0) goto L_0x0140
            r13 = 0
            long r2 = r4.BXq(r13)
            boolean r10 = r4.CeR()
            if (r10 != 0) goto L_0x01af
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r10
        L_0x0188:
            int r10 = (int) r2
            r34 = r8
            r35 = r4
            r40 = r10
            r34.A00(r35, r36, r37, r38, r39, r40)
            X.I4b[] r12 = r8.A06
            int r14 = r12.length
            r11 = 0
        L_0x0196:
            if (r11 >= r14) goto L_0x01b3
            r10 = r12[r11]
            if (r10 == 0) goto L_0x01ac
            long r2 = r10.A02
            long r25 = X.C56602I4b.A0G
            int r24 = (r2 > r25 ? 1 : (r2 == r25 ? 0 : -1))
            if (r24 == 0) goto L_0x01ac
            long r2 = r10.A02
            long r2 = X.C289165d8.A01(r2, r0)
            r10.A02 = r2
        L_0x01ac:
            int r11 = r11 + 1
            goto L_0x0196
        L_0x01af:
            r10 = 32
            long r2 = r2 >> r10
            goto L_0x0188
        L_0x01b3:
            if (r27 == 0) goto L_0x01d7
            X.I4b[] r11 = r8.A06
            int r10 = r11.length
            r8 = 0
        L_0x01b9:
            if (r8 >= r10) goto L_0x01d7
            r3 = r11[r8]
            if (r3 == 0) goto L_0x01d4
            boolean r2 = r3.A04()
            if (r2 == 0) goto L_0x01d1
            java.util.List r2 = r6.A06
            r2.remove(r3)
            X.4cG r2 = r6.A02
            if (r2 == 0) goto L_0x01d1
            X.C288785cT.A00(r2)
        L_0x01d1:
            r3.A01()
        L_0x01d4:
            int r8 = r8 + 1
            goto L_0x01b9
        L_0x01d7:
            A02(r6, r4, r13)
            goto L_0x0140
        L_0x01dc:
            r11 = -1
            goto L_0x0103
        L_0x01df:
            int r8 = r8 + 1
            goto L_0x00de
        L_0x01e3:
            java.lang.Object r2 = r4.getKey()
            A03(r6, r2)
            goto L_0x0140
        L_0x01ec:
            r12 = r58
            int[] r11 = new int[r12]
            r0 = 0
        L_0x01f1:
            if (r0 >= r12) goto L_0x01f9
            r1 = 0
            r11[r0] = r1
            int r0 = r0 + 1
            goto L_0x01f1
        L_0x01f9:
            if (r32 == 0) goto L_0x028f
            if (r5 == 0) goto L_0x028f
            java.util.List r9 = r6.A0A
            boolean r0 = r9.isEmpty()
            r8 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0244
            int r0 = r9.size()
            if (r0 <= r8) goto L_0x0216
            X.Ijt r0 = new X.Ijt
            r0.<init>(r5)
            X.01V.A1D(r9, r0)
        L_0x0216:
            int r4 = r9.size()
            r3 = 0
        L_0x021b:
            if (r3 >= r4) goto L_0x0240
            java.lang.Object r2 = r9.get(r3)
            X.6JL r2 = (X.AnonymousClass6JL) r2
            int r0 = A00(r2, r11)
            int r1 = r59 - r0
            java.lang.Object r0 = r2.getKey()
            java.lang.Object r0 = r7.A03(r0)
            X.0qQ.A0A(r0)
            X.6JQ r0 = (X.AnonymousClass6JQ) r0
            A01(r0, r2, r1)
            r0 = 0
            A02(r6, r2, r0)
            int r3 = r3 + 1
            goto L_0x021b
        L_0x0240:
            r0 = 0
            java.util.Arrays.fill(r11, r0, r12, r0)
        L_0x0244:
            java.util.List r3 = r6.A09
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x028f
            int r0 = r3.size()
            if (r0 <= r8) goto L_0x025c
            X.Ijr r0 = new X.Ijr
            r0.<init>(r5)
            X.01V.A1D(r3, r0)
        L_0x025c:
            int r4 = r3.size()
            r2 = 0
        L_0x0261:
            if (r2 >= r4) goto L_0x028b
            java.lang.Object r1 = r3.get(r2)
            X.6JL r1 = (X.AnonymousClass6JL) r1
            int r0 = A00(r1, r11)
            int r8 = r60 + r0
            int r0 = r1.BOp()
            int r8 = r8 - r0
            java.lang.Object r0 = r1.getKey()
            java.lang.Object r0 = r7.A03(r0)
            X.0qQ.A0A(r0)
            X.6JQ r0 = (X.AnonymousClass6JQ) r0
            A01(r0, r1, r8)
            r0 = 0
            A02(r6, r1, r0)
            int r2 = r2 + 1
            goto L_0x0261
        L_0x028b:
            r0 = 0
            java.util.Arrays.fill(r11, r0, r12, r0)
        L_0x028f:
            X.0vq r0 = r6.A04
            r46 = r0
            java.lang.Object[] r0 = r0.A03
            r31 = r0
            r0 = r46
            long[] r0 = r0.A02
            r30 = r0
            int r10 = r0.length
            r0 = 2
            int r10 = r10 - r0
            if (r10 < 0) goto L_0x03c3
            r9 = 0
        L_0x02a3:
            r28 = r30[r9]
            long r1 = r28 ^ r18
            long r1 = r1 << r33
            long r1 = r1 & r28
            long r1 = r1 & r16
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x03bd
            int r0 = r9 - r10
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r27 = 8 - r0
            r8 = 0
        L_0x02ba:
            r0 = r27
            if (r8 >= r0) goto L_0x03b9
            long r1 = r28 & r20
            int r0 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r0 >= 0) goto L_0x03b1
            int r0 = r9 << 3
            int r0 = r0 + r8
            r4 = r31[r0]
            java.lang.Object r3 = r7.A03(r4)
            X.0qQ.A0A(r3)
            X.6JQ r3 = (X.AnonymousClass6JQ) r3
            r0 = r48
            int r2 = r0.BGq(r4)
            int r0 = r3.A04
            int r0 = java.lang.Math.min(r12, r0)
            r3.A04 = r0
            int r1 = r58 - r0
            int r0 = r3.A01
            int r0 = java.lang.Math.min(r1, r0)
            r3.A01 = r0
            r0 = -1
            if (r2 != r0) goto L_0x034f
            X.I4b[] r13 = r3.A06
            int r14 = r13.length
            r2 = 0
            r26 = 0
            r25 = 0
        L_0x02f5:
            if (r2 >= r14) goto L_0x03ac
            r1 = r13[r2]
            int r24 = r26 + 1
            if (r1 == 0) goto L_0x0325
            boolean r0 = r1.A04()
            if (r0 != 0) goto L_0x0343
            X.5Oz r0 = r1.A09
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x032a
            r1.A03()
            X.I4b[] r0 = r3.A06
            r15 = 0
            r0[r26] = r15
            java.util.List r0 = r6.A06
            r0.remove(r1)
            X.4cG r0 = r6.A02
            if (r0 == 0) goto L_0x0325
            X.C288785cT.A00(r0)
        L_0x0325:
            int r2 = r2 + 1
            r26 = r24
            goto L_0x02f5
        L_0x032a:
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = r1.A04
            if (r0 == 0) goto L_0x0331
            r1.A04()
        L_0x0331:
            boolean r0 = r1.A04()
            if (r0 == 0) goto L_0x0346
            java.util.List r0 = r6.A06
            r0.add(r1)
            X.4cG r0 = r6.A02
            if (r0 == 0) goto L_0x0343
            X.C288785cT.A00(r0)
        L_0x0343:
            r25 = 1
            goto L_0x0325
        L_0x0346:
            r1.A03()
            X.I4b[] r0 = r3.A06
            r1 = 0
            r0[r26] = r1
            goto L_0x0325
        L_0x034f:
            androidx.compose.ui.unit.Constraints r0 = r3.A05
            X.0qQ.A0A(r0)
            long r0 = r0.A00
            int r14 = r3.A01
            int r13 = r3.A04
            r40 = r51
            r41 = r2
            r42 = r14
            r43 = r13
            r44 = r0
            X.6JL r15 = r40.AbW(r41, r42, r43, r44)
            r14 = 1
            r15.EeC(r14)
            X.I4b[] r13 = r3.A06
            int r0 = r13.length
            r24 = r0
            r1 = 0
        L_0x0372:
            r0 = r24
            if (r1 >= r0) goto L_0x03a3
            r0 = r13[r1]
            if (r0 == 0) goto L_0x03a0
            X.5Oz r0 = r0.A0B
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != r14) goto L_0x03a0
        L_0x0388:
            int r0 = r3.A00
            r34 = r3
            r35 = r15
            r40 = r0
            r34.A00(r35, r36, r37, r38, r39, r40)
            int r0 = r6.A00
            if (r2 >= r0) goto L_0x039d
            java.util.List r0 = r6.A08
        L_0x0399:
            r0.add(r15)
            goto L_0x03b1
        L_0x039d:
            java.util.List r0 = r6.A07
            goto L_0x0399
        L_0x03a0:
            int r1 = r1 + 1
            goto L_0x0372
        L_0x03a3:
            if (r5 == 0) goto L_0x0388
            int r0 = r5.BGq(r4)
            if (r2 != r0) goto L_0x0388
            goto L_0x03ae
        L_0x03ac:
            if (r25 != 0) goto L_0x03b1
        L_0x03ae:
            A03(r6, r4)
        L_0x03b1:
            r0 = 8
            long r28 = r28 >> r0
            int r8 = r8 + 1
            goto L_0x02ba
        L_0x03b9:
            r1 = 8
            if (r0 != r1) goto L_0x03c3
        L_0x03bd:
            if (r9 == r10) goto L_0x03c3
            int r9 = r9 + 1
            goto L_0x02a3
        L_0x03c3:
            java.util.List r2 = r6.A08
            boolean r0 = r2.isEmpty()
            r4 = 1
            r0 = r0 ^ 1
            r8 = r56
            r5 = r57
            if (r0 == 0) goto L_0x0434
            int r0 = r2.size()
            if (r0 <= r4) goto L_0x03e2
            X.Iju r1 = new X.Iju
            r0 = r48
            r1.<init>(r0)
            X.01V.A1D(r2, r1)
        L_0x03e2:
            int r14 = r2.size()
            r13 = 0
        L_0x03e7:
            if (r13 >= r14) goto L_0x0430
            java.lang.Object r10 = r2.get(r13)
            X.6JL r10 = (X.AnonymousClass6JL) r10
            java.lang.Object r0 = r10.getKey()
            java.lang.Object r9 = r7.A03(r0)
            X.0qQ.A0A(r9)
            X.6JQ r9 = (X.AnonymousClass6JQ) r9
            int r17 = A00(r10, r11)
            if (r62 == 0) goto L_0x042d
            java.lang.Object r3 = X.00k.A0I(r47)
            X.6JL r3 = (X.AnonymousClass6JL) r3
            r0 = 0
            long r0 = r3.BXq(r0)
            boolean r3 = r3.CeR()
            if (r3 == 0) goto L_0x0429
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r15
        L_0x0419:
            int r3 = (int) r0
        L_0x041a:
            int r3 = r3 - r17
            int r0 = r9.A00
            r10.E3D(r3, r0, r8, r5)
            if (r32 == 0) goto L_0x0426
            A02(r6, r10, r4)
        L_0x0426:
            int r13 = r13 + 1
            goto L_0x03e7
        L_0x0429:
            r3 = 32
            long r0 = r0 >> r3
            goto L_0x0419
        L_0x042d:
            int r3 = r9.A03
            goto L_0x041a
        L_0x0430:
            r0 = 0
            java.util.Arrays.fill(r11, r0, r12, r0)
        L_0x0434:
            java.util.List r3 = r6.A07
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x04a1
            int r0 = r3.size()
            if (r0 <= r4) goto L_0x044e
            X.Ijs r1 = new X.Ijs
            r0 = r48
            r1.<init>(r0)
            X.01V.A1D(r3, r1)
        L_0x044e:
            int r14 = r3.size()
            r13 = 0
        L_0x0453:
            if (r13 >= r14) goto L_0x04a1
            java.lang.Object r12 = r3.get(r13)
            X.6JL r12 = (X.AnonymousClass6JL) r12
            java.lang.Object r0 = r12.getKey()
            java.lang.Object r10 = r7.A03(r0)
            X.0qQ.A0A(r10)
            X.6JQ r10 = (X.AnonymousClass6JQ) r10
            int r17 = A00(r12, r11)
            if (r62 == 0) goto L_0x0499
            java.lang.Object r9 = X.00k.A0K(r47)
            X.6JL r9 = (X.AnonymousClass6JL) r9
            r0 = 0
            long r0 = r9.BXq(r0)
            boolean r9 = r9.CeR()
            if (r9 == 0) goto L_0x0495
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r15
        L_0x0485:
            int r9 = (int) r0
        L_0x0486:
            int r9 = r9 + r17
            int r0 = r10.A00
            r12.E3D(r9, r0, r8, r5)
            if (r32 == 0) goto L_0x0492
            A02(r6, r12, r4)
        L_0x0492:
            int r13 = r13 + 1
            goto L_0x0453
        L_0x0495:
            r9 = 32
            long r0 = r0 >> r9
            goto L_0x0485
        L_0x0499:
            int r9 = r10.A02
            int r0 = r12.BOp()
            int r9 = r9 - r0
            goto L_0x0486
        L_0x04a1:
            java.util.Collections.reverse(r2)
            r1 = 0
            r0 = r47
            r0.addAll(r1, r2)
            r0.addAll(r3)
            java.util.List r0 = r6.A0A
            r0.clear()
            java.util.List r0 = r6.A09
            r0.clear()
            r2.clear()
            r3.clear()
            r46.A05()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6H4.A07(X.6Ix, X.6J4, X.5Sz, java.util.List, X.4Cq, int, int, int, int, int, int, boolean, boolean, boolean):void");
    }

    public AnonymousClass6H4() {
        long[] jArr = 01o.A00;
        0vq r0 = AnonymousClass01q.A00;
        this.A04 = new 0vq(6);
        this.A0A = new ArrayList();
        this.A09 = new ArrayList();
        this.A08 = new ArrayList();
        this.A07 = new ArrayList();
        this.A06 = new ArrayList();
        this.A05 = new LazyLayoutItemAnimator$DisplayingDisappearingItemsElement(this);
    }

    public static final int A00(AnonymousClass6JL r5, int[] iArr) {
        int BKU = r5.BKU();
        int By3 = r5.By3() + BKU;
        int i = 0;
        while (BKU < By3) {
            int BOp = iArr[BKU] + r5.BOp();
            iArr[BKU] = BOp;
            i = Math.max(i, BOp);
            BKU++;
        }
        return i;
    }
}
