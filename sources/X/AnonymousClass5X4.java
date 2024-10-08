package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.5X4  reason: invalid class name */
public final class AnonymousClass5X4 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public 0yC A0C;
    public 0yC A0D;
    public AnonymousClass6IF A0E;
    public ArrayList A0F;
    public HashMap A0G;
    public boolean A0H;
    public int[] A0I;
    public Object[] A0J;
    public final AnonymousClass5X0 A0K = new AnonymousClass5X0();
    public final C286505Wq A0L;
    public final AnonymousClass5X0 A0M = new AnonymousClass5X0();
    public final AnonymousClass5X0 A0N = new AnonymousClass5X0();

    public static final boolean A0F(AnonymousClass5X4 r8, int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = r8.A0F;
            A06(r8, i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = r8.A0G;
                int i3 = i2 + i;
                int length = (r8.A0I.length / 5) - r8.A04;
                ArrayList arrayList2 = r8.A0F;
                int A012 = AnonymousClass5X6.A01(arrayList2, i3, length);
                if (A012 < 0) {
                    A012 = -(A012 + 1);
                }
                if (A012 >= arrayList2.size()) {
                    A012--;
                }
                int i4 = A012 + 1;
                int i5 = 0;
                while (A012 >= 0) {
                    AnonymousClass5X7 r1 = (AnonymousClass5X7) r8.A0F.get(A012);
                    int A0H2 = r8.A0H(r1);
                    if (A0H2 < i) {
                        break;
                    }
                    if (A0H2 < i3) {
                        r1.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
                        if (hashMap != null) {
                            hashMap.remove(r1);
                        }
                        if (i5 == 0) {
                            i5 = A012 + 1;
                        }
                        i4 = A012;
                    }
                    A012--;
                }
                if (i4 < i5) {
                    z = true;
                    r8.A0F.subList(i4, i5).clear();
                }
            }
            r8.A05 = i;
            r8.A04 += i2;
            int i6 = r8.A0A;
            if (i6 > i) {
                r8.A0A = Math.max(i, i6 - i2);
            }
            int i7 = r8.A01;
            if (i7 >= i) {
                r8.A01 = i7 - i2;
            }
            int i8 = r8.A08;
            if (i8 >= 0 && (r8.A0I[(A00(r8, i8) * 5) + 1] & 67108864) != 0) {
                A08(r8, i8);
            }
        }
        return z;
    }

    public final void A0P(boolean z) {
        this.A0H = true;
        if (z && this.A0N.A00 == 0) {
            A06(this, (this.A0I.length / 5) - this.A04);
            A0A(this, this.A0J.length - this.A09, this.A05);
            int i = this.A0B;
            0Yw.A0U(this.A0J, i, this.A09 + i);
            A04(this);
        }
        C286505Wq r9 = this.A0L;
        int[] iArr = this.A0I;
        int i2 = this.A05;
        Object[] objArr = this.A0J;
        int i3 = this.A0B;
        ArrayList arrayList = this.A0F;
        HashMap hashMap = this.A0G;
        0yC r2 = this.A0C;
        if (r9.A07) {
            r9.A07 = false;
            r9.A08 = iArr;
            r9.A00 = i2;
            r9.A09 = objArr;
            r9.A02 = i3;
            r9.A05 = arrayList;
            r9.A06 = hashMap;
            r9.A04 = r2;
            return;
        }
        C18086VlG.A00("Unexpected writer close()");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final int A00(AnonymousClass5X4 r1, int i) {
        if (i >= r1.A05) {
            return i + r1.A04;
        }
        return i;
    }

    public static final int A01(AnonymousClass5X4 r3, int[] iArr, int i) {
        if (i >= r3.A0I.length / 5) {
            return r3.A0J.length - r3.A09;
        }
        int i2 = iArr[(i * 5) + 4];
        int i3 = r3.A09;
        int length = r3.A0J.length;
        if (i2 < 0) {
            return (length - i3) + i2 + 1;
        }
        return i2;
    }

    public static final int A03(AnonymousClass5X4 r3, int[] iArr, int i) {
        if (i >= r3.A0I.length / 5) {
            return r3.A0J.length - r3.A09;
        }
        int i2 = i * 5;
        int A002 = iArr[i2 + 4] + AnonymousClass5X6.A00(iArr[i2 + 1] >> 28);
        int i3 = r3.A09;
        int length = r3.A0J.length;
        if (A002 < 0) {
            return (length - i3) + A002 + 1;
        }
        return A002;
    }

    public static final void A04(AnonymousClass5X4 r10) {
        boolean z;
        AnonymousClass6IF r7 = r10.A0E;
        if (r7 != null) {
            while (!r7.A00.isEmpty()) {
                int A002 = r7.A00();
                int A003 = A00(r10, A002);
                int i = A002 + 1;
                int[] iArr = r10.A0I;
                int i2 = A003 * 5;
                int i3 = A002 + iArr[i2 + 3];
                while (true) {
                    if (i >= i3) {
                        z = false;
                        break;
                    } else if ((iArr[(A00(r10, i) * 5) + 1] & 201326592) != 0) {
                        z = true;
                        break;
                    } else {
                        i += iArr[(A00(r10, i) * 5) + 3];
                    }
                }
                boolean z2 = true;
                int i4 = i2 + 1;
                int i5 = iArr[i4];
                if ((i5 & 67108864) == 0) {
                    z2 = false;
                }
                if (z2 != z) {
                    int i6 = i5 | 67108864;
                    if (!z) {
                        i6 = -67108865 & i5;
                    }
                    iArr[i4] = i6;
                    int A022 = A02(r10, iArr, A002);
                    if (A022 >= 0) {
                        r7.A01(A022);
                    }
                }
            }
        }
    }

    public static final void A05(AnonymousClass5X4 r12, int i) {
        int i2;
        if (i > 0) {
            int i3 = r12.A00;
            A06(r12, i3);
            int i4 = r12.A05;
            int i5 = r12.A04;
            int[] iArr = r12.A0I;
            int length = iArr.length / 5;
            int i6 = length - i5;
            int i7 = 0;
            if (i5 < i) {
                int max = Math.max(Math.max(length * 2, i6 + i), 32);
                int[] iArr2 = new int[(max * 5)];
                int i8 = max - i6;
                0Yw.A0T(iArr, iArr2, 0, 0, i4 * 5);
                0Yw.A0T(iArr, iArr2, (i4 + i8) * 5, (i5 + i4) * 5, length * 5);
                r12.A0I = iArr2;
                iArr = iArr2;
                i5 = i8;
            }
            int i9 = r12.A01;
            if (i9 >= i4) {
                r12.A01 = i9 + i;
            }
            int i10 = i4 + i;
            r12.A05 = i10;
            r12.A04 = i5 - i;
            if (i6 > 0) {
                i2 = A01(r12, iArr, A00(r12, i3 + i));
            } else {
                i2 = 0;
            }
            int i11 = r12.A0A;
            if (i11 >= i4) {
                i7 = r12.A0B;
            }
            int i12 = r12.A09;
            int length2 = r12.A0J.length;
            if (i2 > i7) {
                i2 = -(((length2 - i12) - i2) + 1);
            }
            for (int i13 = i4; i13 < i10; i13++) {
                iArr[(i13 * 5) + 4] = i2;
            }
            if (i11 >= i4) {
                r12.A0A = i11 + i;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        r1 = (X.AnonymousClass5X7) r5.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        r1 = (X.AnonymousClass5X7) r5.get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.AnonymousClass5X4 r8, int r9) {
        /*
            int r4 = r8.A04
            int r3 = r8.A05
            if (r3 == r9) goto L_0x00b6
            java.util.ArrayList r0 = r8.A0F
            boolean r0 = r0.isEmpty()
            r7 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x005f
            int r1 = r8.A04
            int[] r0 = r8.A0I
            int r0 = r0.length
            int r6 = r0 / 5
            int r6 = r6 - r1
            java.util.ArrayList r5 = r8.A0F
            if (r3 >= r9) goto L_0x003e
            int r2 = X.AnonymousClass5X6.A01(r5, r3, r6)
            if (r2 >= 0) goto L_0x0026
            int r0 = r2 + 1
            int r2 = -r0
        L_0x0026:
            int r0 = r5.size()
            if (r2 >= r0) goto L_0x005f
            java.lang.Object r1 = r5.get(r2)
            X.5X7 r1 = (X.AnonymousClass5X7) r1
            int r0 = r1.A00
            if (r0 >= 0) goto L_0x005f
            int r0 = r0 + r6
            if (r0 >= r9) goto L_0x005f
            r1.A00 = r0
            int r2 = r2 + 1
            goto L_0x0026
        L_0x003e:
            int r2 = X.AnonymousClass5X6.A01(r5, r9, r6)
            if (r2 >= 0) goto L_0x0047
            int r0 = r2 + 1
            int r2 = -r0
        L_0x0047:
            int r0 = r5.size()
            if (r2 >= r0) goto L_0x005f
            java.lang.Object r1 = r5.get(r2)
            X.5X7 r1 = (X.AnonymousClass5X7) r1
            int r0 = r1.A00
            if (r0 < 0) goto L_0x005f
            int r0 = r6 - r0
            int r0 = -r0
            r1.A00 = r0
            int r2 = r2 + 1
            goto L_0x0047
        L_0x005f:
            if (r4 <= 0) goto L_0x006f
            int[] r6 = r8.A0I
            int r5 = r9 * 5
            int r2 = r4 * 5
            int r1 = r3 * 5
            if (r9 >= r3) goto L_0x00af
            int r2 = r2 + r5
            X.0Yw.A0T(r6, r6, r2, r5, r1)
        L_0x006f:
            if (r9 >= r3) goto L_0x0073
            int r3 = r9 + r4
        L_0x0073:
            int[] r0 = r8.A0I
            int r0 = r0.length
            int r5 = r0 / 5
            if (r3 < r5) goto L_0x007b
            r7 = 0
        L_0x007b:
            X.AnonymousClass5XN.A06(r7)
        L_0x007e:
            if (r3 >= r5) goto L_0x00b6
            int[] r2 = r8.A0I
            int r0 = r3 * 5
            int r0 = r0 + 2
            r7 = r2[r0]
            r6 = r7
            r0 = -2
            if (r7 > r0) goto L_0x0095
            int r0 = r2.length
            int r1 = r0 / 5
            int r0 = r8.A04
            int r1 = r1 - r0
            int r1 = r1 + r7
            int r6 = r1 + 2
        L_0x0095:
            if (r6 < r9) goto L_0x00a1
            int r0 = r2.length
            int r1 = r0 / 5
            int r0 = r8.A04
            int r1 = r1 - r0
            int r1 = r1 - r6
            int r0 = r1 + 2
            int r6 = -r0
        L_0x00a1:
            if (r6 == r7) goto L_0x00a9
            int r0 = r3 * 5
            int r0 = r0 + 2
            r2[r0] = r6
        L_0x00a9:
            int r3 = r3 + 1
            if (r3 != r9) goto L_0x007e
            int r3 = r3 + r4
            goto L_0x007e
        L_0x00af:
            int r0 = r1 + r2
            int r5 = r5 + r2
            X.0Yw.A0T(r6, r6, r1, r0, r5)
            goto L_0x006f
        L_0x00b6:
            r8.A05 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5X4.A06(X.5X4, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r1 = r4.A0F;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.AnonymousClass5X4 r4, int r5) {
        /*
            java.util.HashMap r3 = r4.A0G
            if (r3 == 0) goto L_0x0021
            if (r5 < 0) goto L_0x0021
            int[] r0 = r4.A0I
            int r0 = r0.length
            int r2 = r0 / 5
            int r0 = r4.A04
            int r2 = r2 - r0
            if (r5 >= r2) goto L_0x0021
            java.util.ArrayList r1 = r4.A0F
            int r0 = X.AnonymousClass5X6.A01(r1, r5, r2)
            if (r0 < 0) goto L_0x0021
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x0021
            r3.get(r0)
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5X4.A07(X.5X4, int):void");
    }

    public static final void A08(AnonymousClass5X4 r3, int i) {
        if (i >= 0) {
            AnonymousClass6IF r2 = r3.A0E;
            if (r2 == null) {
                r2 = new AnonymousClass6IF((List) null, (DefaultConstructorMarker) null, 1);
                r3.A0E = r2;
            }
            r2.A01(i);
        }
    }

    public static final void A09(AnonymousClass5X4 r10, int i, int i2) {
        if (i > 0) {
            A0A(r10, r10.A02, i2);
            int i3 = r10.A0B;
            int i4 = r10.A09;
            if (i4 < i) {
                Object[] objArr = r10.A0J;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                0Yw.A0V(objArr, objArr2, 0, 0, i3);
                0Yw.A0V(objArr, objArr2, i3 + i7, i4 + i3, length);
                r10.A0J = objArr2;
                i4 = i7;
            }
            int i8 = r10.A03;
            if (i8 >= i3) {
                r10.A03 = i8 + i;
            }
            r10.A0B = i3 + i;
            r10.A09 = i4 - i;
        }
    }

    public static final void A0A(AnonymousClass5X4 r9, int i, int i2) {
        String str;
        int i3 = r9.A09;
        int i4 = r9.A0B;
        int i5 = r9.A0A;
        if (i4 != i) {
            Object[] objArr = r9.A0J;
            if (i < i4) {
                0Yw.A0V(objArr, objArr, i + i3, i, i4);
            } else {
                0Yw.A0V(objArr, objArr, i4, i4 + i3, i + i3);
            }
        }
        int[] iArr = r9.A0I;
        int i6 = r9.A04;
        int min = Math.min(i2 + 1, (iArr.length / 5) - i6);
        if (i5 != min) {
            int length = r9.A0J.length - i3;
            if (min < i5) {
                int A002 = A00(r9, min);
                int A003 = A00(r9, i5);
                int i7 = r9.A05;
                while (A002 < A003) {
                    int i8 = (A002 * 5) + 4;
                    int i9 = iArr[i8];
                    if (i9 >= 0) {
                        iArr[i8] = -((length - i9) + 1);
                        A002++;
                        if (A002 == i7) {
                            A002 += i6;
                        }
                    } else {
                        str = "Unexpected anchor value, expected a positive anchor";
                    }
                }
                r9.A0A = min;
            } else {
                int A004 = A00(r9, i5);
                int A005 = A00(r9, min);
                while (A004 < A005) {
                    int i10 = iArr[(A004 * 5) + 4];
                    if (i10 < 0) {
                        iArr[(A004 * 5) + 4] = i10 + length + 1;
                        A004++;
                        if (A004 == r9.A05) {
                            A004 += i6;
                        }
                    } else {
                        str = "Unexpected anchor value, expected a negative anchor";
                    }
                }
                r9.A0A = min;
            }
            AnonymousClass5XN.A03(str);
            throw AnonymousClass00P.createAndThrow();
        }
        r9.A0B = i;
    }

    public static final void A0B(AnonymousClass5X4 r3, int i, int i2, int i3) {
        if (i >= r3.A05) {
            i = -((((r3.A0I.length / 5) - r3.A04) - i) + 2);
        }
        while (i3 < i2) {
            int[] iArr = r3.A0I;
            int A002 = A00(r3, i3) * 5;
            iArr[A002 + 2] = i;
            int i4 = iArr[A002 + 3] + i3;
            A0B(r3, i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public static final void A0C(AnonymousClass5X4 r2, int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = r2.A09;
            int i5 = i + i2;
            A0A(r2, i5, i3);
            r2.A0B = i;
            r2.A09 = i4 + i2;
            0Yw.A0U(r2.A0J, i, i5);
            int i6 = r2.A03;
            if (i6 >= i) {
                r2.A03 = i6 - i2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        if (r3 == r0) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0E(X.AnonymousClass5X4 r16, java.lang.Object r17, java.lang.Object r18, int r19, boolean r20) {
        /*
            r4 = r16
            int r6 = r4.A08
            int r0 = r4.A06
            r5 = 0
            r8 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x000c
            r2 = 1
        L_0x000c:
            X.5X0 r1 = r4.A0M
            int r0 = r4.A07
            r1.A00(r0)
            r3 = r18
            if (r2 == 0) goto L_0x00b2
            int r7 = r4.A00
            int[] r1 = r4.A0I
            int r0 = A00(r4, r7)
            int r10 = A01(r4, r1, r0)
            A05(r4, r8)
            r4.A02 = r10
            r4.A03 = r10
            int r16 = A00(r4, r7)
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            r15 = 0
            r8 = r17
            if (r8 == r0) goto L_0x0036
            r15 = 1
        L_0x0036:
            if (r20 != 0) goto L_0x003b
            r14 = 1
            if (r3 != r0) goto L_0x003c
        L_0x003b:
            r14 = 0
        L_0x003c:
            int r9 = r4.A09
            int r2 = r4.A0B
            java.lang.Object[] r0 = r4.A0J
            int r1 = r0.length
            if (r10 <= r2) goto L_0x004b
            int r0 = r1 - r9
            int r0 = r0 - r10
            int r0 = r0 + 1
            int r10 = -r0
        L_0x004b:
            if (r10 < 0) goto L_0x0056
            int r0 = r4.A0A
            if (r0 >= r7) goto L_0x0056
            int r1 = r1 - r9
            int r1 = r1 - r10
            int r0 = r1 + 1
            int r10 = -r0
        L_0x0056:
            int[] r9 = r4.A0I
            int r12 = r4.A08
            r13 = 0
            if (r20 == 0) goto L_0x005f
            r13 = 1073741824(0x40000000, float:2.0)
        L_0x005f:
            r11 = 0
            if (r15 == 0) goto L_0x0064
            r11 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0064:
            r2 = 0
            if (r14 == 0) goto L_0x0069
            r2 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0069:
            int r1 = r16 * 5
            r9[r1] = r19
            int r0 = r1 + 1
            r13 = r13 | r11
            r13 = r13 | r2
            r9[r0] = r13
            int r0 = r1 + 2
            r9[r0] = r12
            int r0 = r1 + 3
            r9[r0] = r5
            int r0 = r1 + 4
            r9[r0] = r10
            int r0 = r20 + r15
            int r0 = r0 + r14
            if (r0 <= 0) goto L_0x00a2
            A09(r4, r0, r7)
            java.lang.Object[] r2 = r4.A0J
            int r1 = r4.A02
            if (r20 == 0) goto L_0x0092
            int r0 = r1 + 1
            r2[r1] = r18
            r1 = r0
        L_0x0092:
            if (r15 == 0) goto L_0x0099
            int r0 = r1 + 1
            r2[r1] = r17
            r1 = r0
        L_0x0099:
            if (r14 == 0) goto L_0x00a0
            int r0 = r1 + 1
            r2[r1] = r18
            r1 = r0
        L_0x00a0:
            r4.A02 = r1
        L_0x00a2:
            r4.A07 = r5
            int r5 = r7 + 1
            r4.A08 = r7
            r4.A00 = r5
            if (r6 < 0) goto L_0x00af
            A07(r4, r6)
        L_0x00af:
            r4.A01 = r5
            return
        L_0x00b2:
            X.5X0 r0 = r4.A0N
            r0.A00(r6)
            X.5X0 r2 = r4.A0K
            int[] r0 = r4.A0I
            int r0 = r0.length
            int r1 = r0 / 5
            int r0 = r4.A04
            int r1 = r1 - r0
            int r0 = r4.A01
            int r1 = r1 - r0
            r2.A00(r1)
            int r5 = r4.A00
            int r1 = A00(r4, r5)
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x00dc
            if (r20 == 0) goto L_0x010a
            int r0 = r4.A00
            A0D(r4, r3, r0)
        L_0x00dc:
            int[] r3 = r4.A0I
            int r0 = A03(r4, r3, r1)
            r4.A02 = r0
            int r0 = r4.A00
            int r0 = r0 + 1
            int r0 = A00(r4, r0)
            int r0 = A01(r4, r3, r0)
            r4.A03 = r0
            int r2 = r1 * 5
            int r0 = r2 + 1
            r1 = r3[r0]
            r0 = 67108863(0x3ffffff, float:1.5046327E-36)
            r1 = r1 & r0
            r4.A07 = r1
            r4.A08 = r5
            int r0 = r5 + 1
            r4.A00 = r0
            int r0 = r2 + 3
            r0 = r3[r0]
            int r5 = r5 + r0
            goto L_0x00af
        L_0x010a:
            r4.A0O(r3)
            goto L_0x00dc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5X4.A0E(X.5X4, java.lang.Object, java.lang.Object, int, boolean):void");
    }

    public final int A0H(AnonymousClass5X7 r4) {
        int i = r4.A00;
        if (i < 0) {
            return i + ((this.A0I.length / 5) - this.A04);
        }
        return i;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.5X7, java.lang.Object] */
    public final AnonymousClass5X7 A0I(int i) {
        ArrayList arrayList = this.A0F;
        int length = (this.A0I.length / 5) - this.A04;
        int A012 = AnonymousClass5X6.A01(arrayList, i, length);
        if (A012 >= 0) {
            return (AnonymousClass5X7) arrayList.get(A012);
        }
        if (i > this.A05) {
            i = -(length - i);
        }
        ? obj = new Object();
        obj.A00 = i;
        arrayList.add(-(A012 + 1), obj);
        return obj;
    }

    public final void A0J() {
        int i = this.A06;
        this.A06 = i + 1;
        if (i == 0) {
            this.A0K.A00(((this.A0I.length / 5) - this.A04) - this.A01);
        }
    }

    public final void A0K() {
        int i;
        int A002;
        01j r0;
        int i2 = 0;
        boolean z = false;
        if (this.A06 > 0) {
            z = true;
        }
        int i3 = this.A00;
        int i4 = this.A01;
        int i5 = this.A08;
        int A003 = A00(this, i5);
        int i6 = this.A07;
        int i7 = i3 - i5;
        int[] iArr = this.A0I;
        boolean A032 = AnonymousClass5X6.A03(iArr, A003);
        if (z) {
            0yC r10 = this.A0D;
            if (!(r10 == null || (r0 = (01j) r10.A03(i5)) == null)) {
                Object[] objArr = r0.A01;
                int i8 = r0.A00;
                for (int i9 = 0; i9 < i8; i9++) {
                    Object obj = objArr[i9];
                    if (this.A06 > 0) {
                        A09(this, 1, this.A08);
                    }
                    this.A02++;
                    A0N(obj);
                }
                r10.A07(i5);
            }
            int[] iArr2 = this.A0I;
            boolean z2 = false;
            if (i7 >= 0) {
                z2 = true;
            }
            AnonymousClass5XN.A06(z2);
            iArr2[(A003 * 5) + 3] = i7;
            AnonymousClass5X6.A02(iArr2, A003, i6);
            AnonymousClass5X0 r2 = this.A0M;
            int[] iArr3 = r2.A01;
            int i10 = r2.A00 - 1;
            r2.A00 = i10;
            int i11 = iArr3[i10];
            if (A032) {
                i6 = 1;
            }
            this.A07 = i11 + i6;
            int A022 = A02(this, iArr2, i5);
            this.A08 = A022;
            if (A022 < 0) {
                A002 = (this.A0I.length / 5) - this.A04;
            } else {
                A002 = A00(this, A022 + 1);
            }
            if (A002 >= 0) {
                i2 = A01(this, iArr2, A002);
            }
            this.A02 = i2;
            this.A03 = i2;
        } else if (i3 == i4) {
            int i12 = A003 * 5;
            int i13 = i12 + 3;
            int i14 = iArr[i13];
            int i15 = iArr[i12 + 1] & 67108863;
            boolean z3 = false;
            if (i7 >= 0) {
                z3 = true;
            }
            AnonymousClass5XN.A06(z3);
            iArr[i13] = i7;
            AnonymousClass5X6.A02(iArr, A003, i6);
            AnonymousClass5X0 r22 = this.A0N;
            int[] iArr4 = r22.A01;
            int i16 = r22.A00 - 1;
            r22.A00 = i16;
            int i17 = iArr4[i16];
            int length = (this.A0I.length / 5) - this.A04;
            AnonymousClass5X0 r23 = this.A0K;
            int[] iArr5 = r23.A01;
            int i18 = r23.A00 - 1;
            r23.A00 = i18;
            this.A01 = length - iArr5[i18];
            this.A08 = i17;
            int A023 = A02(this, iArr, i5);
            AnonymousClass5X0 r24 = this.A0M;
            int[] iArr6 = r24.A01;
            int i19 = r24.A00 - 1;
            r24.A00 = i19;
            int i20 = iArr6[i19];
            this.A07 = i20;
            if (A023 == i17) {
                if (!A032) {
                    i2 = i6 - i15;
                }
                i = i20 + i2;
            } else {
                int i21 = i7 - i14;
                int i22 = i6 - i15;
                if (A032) {
                    i22 = 0;
                }
                if (!(i21 == 0 && i22 == 0)) {
                    while (A023 != 0 && A023 != i17 && (i22 != 0 || i21 != 0)) {
                        int A004 = A00(this, A023);
                        if (i21 != 0) {
                            int i23 = iArr[(A004 * 5) + 3] + i21;
                            boolean z4 = false;
                            if (i23 >= 0) {
                                z4 = true;
                            }
                            AnonymousClass5XN.A06(z4);
                            iArr[(A004 * 5) + 3] = i23;
                        }
                        if (i22 != 0) {
                            AnonymousClass5X6.A02(iArr, A004, (iArr[(A004 * 5) + 1] & 67108863) + i22);
                        }
                        if (AnonymousClass5X6.A03(iArr, A004)) {
                            i22 = 0;
                        }
                        A023 = A02(this, iArr, A023);
                    }
                }
                i = i20 + i22;
            }
            this.A07 = i;
        } else {
            AnonymousClass5XN.A03("Expected to be at the end of a group");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A0L() {
        int i = this.A06;
        if (i > 0) {
            int i2 = i - 1;
            this.A06 = i2;
            if (i2 != 0) {
                return;
            }
            if (this.A0M.A00 == this.A0N.A00) {
                int length = (this.A0I.length / 5) - this.A04;
                AnonymousClass5X0 r2 = this.A0K;
                int[] iArr = r2.A01;
                int i3 = r2.A00 - 1;
                r2.A00 = i3;
                this.A01 = length - iArr[i3];
                return;
            }
            AnonymousClass5XN.A03("startGroup/endGroup mismatch while inserting");
        } else {
            C18086VlG.A01("Unbalanced begin/end insert");
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0M() {
        int i = this.A01;
        this.A00 = i;
        this.A02 = A01(this, this.A0I, A00(this, i));
    }

    public final void A0N(Object obj) {
        int i = this.A02;
        if (i <= this.A03) {
            Object[] objArr = this.A0J;
            int i2 = i - 1;
            if (i2 >= this.A0B) {
                i2 += this.A09;
            }
            objArr[i2] = obj;
            return;
        }
        AnonymousClass5XN.A03("Writing to an invalid slot");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0O(Object obj) {
        int A002 = A00(this, this.A00);
        int[] iArr = this.A0I;
        int i = iArr[(A002 * 5) + 1];
        if ((268435456 & i) != 0) {
            Object[] objArr = this.A0J;
            int A012 = A01(this, iArr, A002) + AnonymousClass5X6.A00(i >> 29);
            if (A012 >= this.A0B) {
                A012 += this.A09;
            }
            objArr[A012] = obj;
            return;
        }
        AnonymousClass5XN.A03("Updating the data of a group that was not created with a data slot");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SlotWriter(current = ");
        sb.append(this.A00);
        sb.append(" end=");
        sb.append(this.A01);
        sb.append(" size = ");
        int i = this.A04;
        sb.append((this.A0I.length / 5) - i);
        sb.append(" gap=");
        int i2 = this.A05;
        sb.append(i2);
        sb.append('-');
        sb.append(i2 + i);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass5X4(C286505Wq r5) {
        this.A0L = r5;
        int[] iArr = r5.A08;
        this.A0I = iArr;
        Object[] objArr = r5.A09;
        this.A0J = objArr;
        this.A0F = r5.A05;
        this.A0G = r5.A06;
        this.A0C = r5.A04;
        int i = r5.A00;
        this.A05 = i;
        this.A04 = (iArr.length / 5) - i;
        int i2 = r5.A02;
        this.A0B = i2;
        this.A09 = objArr.length - i2;
        this.A0A = i;
        this.A01 = i;
        this.A08 = -1;
    }

    public static final int A02(AnonymousClass5X4 r3, int[] iArr, int i) {
        int i2 = iArr[(A00(r3, i) * 5) + 2];
        if (i2 <= -2) {
            return ((r3.A0I.length / 5) - r3.A04) + i2 + 2;
        }
        return i2;
    }

    public static final void A0D(AnonymousClass5X4 r4, Object obj, int i) {
        int A002 = A00(r4, i);
        int[] iArr = r4.A0I;
        if (A002 >= iArr.length || !AnonymousClass5X6.A03(iArr, A002)) {
            AnonymousClass5XN.A03(002.A0c("Updating the node of a group at ", " that was not created with as a node group", i));
            throw AnonymousClass00P.createAndThrow();
        }
        Object[] objArr = r4.A0J;
        int A012 = A01(r4, iArr, A002);
        if (A012 >= r4.A0B) {
            A012 += r4.A09;
        }
        objArr[A012] = obj;
    }

    public final int A0G(int i, int i2) {
        int A002 = A00(this, i);
        int[] iArr = this.A0I;
        int A032 = A03(this, iArr, A002);
        int A012 = A01(this, iArr, A00(this, i + 1));
        int i3 = A032 + i2;
        if (i3 >= A032 && i3 < A012) {
            return i3;
        }
        AnonymousClass5XN.A03(002.A02(i2, i, "Write to an invalid slot index ", " for group "));
        throw AnonymousClass00P.createAndThrow();
    }
}
