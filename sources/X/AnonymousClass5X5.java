package X;

import java.util.ArrayList;

/* renamed from: X.5X5  reason: invalid class name */
public final class AnonymousClass5X5 {
    public int A00;
    public int A01 = -1;
    public int A02 = -1;
    public int A03;
    public C286585Wz A04 = new C286585Wz();
    public AnonymousClass5Ws A05;
    public boolean A06;
    public int A07;
    public int A08 = -1;
    public final C286565Wx A09;
    public final AnonymousClass5X0 A0A = new AnonymousClass5X0();

    public static final void A01(AnonymousClass5X5 r11) {
        A03(r11, false);
        AnonymousClass5X3 r6 = r11.A09.A0B;
        if (r6.A08 > 0) {
            int i = r6.A05;
            AnonymousClass5X0 r4 = r11.A0A;
            int i2 = -2;
            int i3 = r4.A00;
            if (i3 > 0) {
                i2 = r4.A01[i3 - 1];
            }
            if (i2 != i) {
                if (!r11.A06) {
                    A03(r11, false);
                    r11.A05.A00.A02(C288595cA.A00);
                    r11.A06 = true;
                }
                if (i > 0) {
                    AnonymousClass5X7 A022 = r6.A02(i);
                    r4.A00(i);
                    A03(r11, false);
                    C286535Wu r9 = r11.A05.A00;
                    C288575c8 r7 = C288575c8.A00;
                    r9.A02(r7);
                    C286685Xj.A01(r9, A022, 0);
                    int i4 = r9.A03;
                    int i5 = r7.A00;
                    int i6 = 0;
                    if (i5 != 0) {
                        i6 = -1 >>> (32 - i5);
                    }
                    if (i4 == i6) {
                        int i7 = r9.A04;
                        int i8 = r7.A01;
                        int i9 = 0;
                        if (i8 != 0) {
                            i9 = -1 >>> (32 - i8);
                        }
                        if (i7 == i9) {
                            r11.A06 = true;
                            return;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    int i10 = 0;
                    for (int i11 = 0; i11 < i5; i11++) {
                        if (((1 << i11) & r9.A03) != 0) {
                            if (i10 > 0) {
                                sb.append(", ");
                            }
                            sb.append(r7.A00(i11));
                            i10++;
                        }
                    }
                    String obj = sb.toString();
                    0qQ.A07(obj);
                    StringBuilder sb2 = new StringBuilder();
                    int i12 = r7.A01;
                    int i13 = 0;
                    for (int i14 = 0; i14 < i12; i14++) {
                        if (((1 << i14) & r9.A04) != 0) {
                            if (i10 > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(r7.A01(i14));
                            i13++;
                        }
                    }
                    String obj2 = sb2.toString();
                    0qQ.A07(obj2);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Error while pushing ");
                    sb3.append(r7);
                    sb3.append(". Not all arguments were provided. Missing ");
                    sb3.append(i10);
                    sb3.append(" int arguments (");
                    sb3.append(obj);
                    sb3.append(") and ");
                    sb3.append(i13);
                    sb3.append(" object arguments (");
                    sb3.append(obj2);
                    sb3.append(").");
                    C18086VlG.A01(sb3.toString());
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
        if (r2 == r1) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass5X5 r12) {
        /*
            int r1 = r12.A07
            if (r1 <= 0) goto L_0x002e
            X.5Ws r0 = r12.A05
            X.5Wu r8 = r0.A00
            X.5c4 r6 = X.C288535c4.A00
            r8.A02(r6)
            r7 = 0
            X.C286685Xj.A00(r8, r7, r1)
            int r2 = r8.A03
            int r9 = r6.A00
            r1 = 0
            if (r9 == 0) goto L_0x001c
            r1 = -1
            int r0 = 32 - r9
            int r1 = r1 >>> r0
        L_0x001c:
            r11 = 1
            if (r2 != r1) goto L_0x00c6
            int r2 = r8.A04
            int r0 = r6.A01
            r1 = 0
            if (r0 == 0) goto L_0x002a
            r1 = -1
            int r0 = 32 - r0
            int r1 = r1 >>> r0
        L_0x002a:
            if (r2 != r1) goto L_0x00c6
            r12.A07 = r7
        L_0x002e:
            X.5Wz r0 = r12.A04
            java.util.ArrayList r3 = r0.A00
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x007a
            X.5Ws r5 = r12.A05
            int r4 = r3.size()
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r1 = 0
        L_0x0043:
            if (r1 >= r4) goto L_0x004e
            java.lang.Object r0 = r3.get(r1)
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x0043
        L_0x004e:
            r8 = 0
            r11 = 1
            if (r4 == 0) goto L_0x0077
            X.5Wu r7 = r5.A00
            X.5c3 r6 = X.C288525c3.A00
            r7.A02(r6)
            r9 = 0
            X.C286685Xj.A01(r7, r2, r8)
            int r2 = r7.A03
            int r4 = r6.A00
            r1 = 0
            if (r4 == 0) goto L_0x0068
            r1 = -1
            int r0 = 32 - r4
            int r1 = r1 >>> r0
        L_0x0068:
            if (r2 != r1) goto L_0x007b
            int r2 = r7.A04
            int r0 = r6.A01
            r1 = 0
            if (r0 == 0) goto L_0x0075
            r1 = -1
            int r0 = 32 - r0
            int r1 = r1 >>> r0
        L_0x0075:
            if (r2 != r1) goto L_0x007b
        L_0x0077:
            r3.clear()
        L_0x007a:
            return
        L_0x007b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = 0
        L_0x0081:
            java.lang.String r3 = ", "
            if (r9 >= r4) goto L_0x009d
            int r1 = r11 << r9
            int r0 = r7.A03
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009a
            if (r5 <= 0) goto L_0x0091
            r2.append(r3)
        L_0x0091:
            java.lang.String r0 = r6.A00(r9)
            r2.append(r0)
            int r5 = r5 + 1
        L_0x009a:
            int r9 = r9 + 1
            goto L_0x0081
        L_0x009d:
            java.lang.String r9 = r2.toString()
            X.0qQ.A07(r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            int r2 = r6.A01
            r4 = 0
        L_0x00ac:
            if (r8 >= r2) goto L_0x0112
            int r1 = r11 << r8
            int r0 = r7.A04
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00c3
            if (r5 <= 0) goto L_0x00ba
            r10.append(r3)
        L_0x00ba:
            java.lang.String r0 = r6.A01(r8)
            r10.append(r0)
            int r4 = r4 + 1
        L_0x00c3:
            int r8 = r8 + 1
            goto L_0x00ac
        L_0x00c6:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r2 = 0
            r5 = 0
        L_0x00cd:
            java.lang.String r3 = ", "
            if (r2 >= r9) goto L_0x00e9
            int r1 = r11 << r2
            int r0 = r8.A03
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00e6
            if (r5 <= 0) goto L_0x00dd
            r4.append(r3)
        L_0x00dd:
            java.lang.String r0 = r6.A00(r2)
            r4.append(r0)
            int r5 = r5 + 1
        L_0x00e6:
            int r2 = r2 + 1
            goto L_0x00cd
        L_0x00e9:
            java.lang.String r9 = r4.toString()
            X.0qQ.A07(r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            int r2 = r6.A01
            r4 = 0
        L_0x00f8:
            if (r7 >= r2) goto L_0x0112
            int r1 = r11 << r7
            int r0 = r8.A04
            r1 = r1 & r0
            if (r1 == 0) goto L_0x010f
            if (r5 <= 0) goto L_0x0106
            r10.append(r3)
        L_0x0106:
            java.lang.String r0 = r6.A01(r7)
            r10.append(r0)
            int r4 = r4 + 1
        L_0x010f:
            int r7 = r7 + 1
            goto L_0x00f8
        L_0x0112:
            java.lang.String r2 = r10.toString()
            X.0qQ.A07(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Error while pushing "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ". Not all arguments were provided. Missing "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " int arguments ("
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ") and "
            r1.append(r0)
            r1.append(r4)
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
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5X5.A00(X.5X5):void");
    }

    public static final void A02(AnonymousClass5X5 r11) {
        StringBuilder sb;
        C286545Wv r7;
        int i;
        String str;
        int i2;
        int i3;
        int i4 = r11.A00;
        if (i4 > 0) {
            int i5 = r11.A08;
            if (i5 >= 0) {
                A00(r11);
                C286535Wu r9 = r11.A05.A00;
                r7 = XE3.A00;
                r9.A02(r7);
                i3 = 0;
                C286685Xj.A00(r9, 0, i5);
                C286685Xj.A00(r9, 1, i4);
                int i6 = r9.A03;
                int i7 = r7.A00;
                int i8 = 0;
                if (i7 != 0) {
                    i8 = -1 >>> (32 - i7);
                }
                if (i6 == i8) {
                    int i9 = r9.A04;
                    int i10 = r7.A01;
                    int i11 = 0;
                    if (i10 != 0) {
                        i11 = -1 >>> (32 - i10);
                    }
                    if (i9 == i11) {
                        r11.A08 = -1;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                i = 0;
                for (int i12 = 0; i12 < i7; i12++) {
                    if (((1 << i12) & r9.A03) != 0) {
                        if (i > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(r7.A00(i12));
                        i++;
                    }
                }
                str = sb2.toString();
                0qQ.A07(str);
                sb = new StringBuilder();
                int i13 = r7.A01;
                i2 = 0;
                while (i3 < i13) {
                    if (((1 << i3) & r9.A04) != 0) {
                        if (i > 0) {
                            sb.append(", ");
                        }
                        sb.append(r7.A01(i3));
                        i2++;
                    }
                    i3++;
                }
                String obj = sb.toString();
                0qQ.A07(obj);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Error while pushing ");
                sb3.append(r7);
                sb3.append(". Not all arguments were provided. Missing ");
                sb3.append(i);
                sb3.append(" int arguments (");
                sb3.append(str);
                sb3.append(") and ");
                sb3.append(i2);
                sb3.append(" object arguments (");
                sb3.append(obj);
                sb3.append(").");
                C18086VlG.A01(sb3.toString());
                throw AnonymousClass00P.createAndThrow();
            }
            int i14 = r11.A02;
            int i15 = r11.A01;
            A00(r11);
            C286535Wu r10 = r11.A05.A00;
            r7 = XG8.A00;
            r10.A02(r7);
            C286685Xj.A00(r10, 1, i14);
            i3 = 0;
            i = 0;
            C286685Xj.A00(r10, 0, i15);
            C286685Xj.A00(r10, 2, i4);
            int i16 = r10.A03;
            int i17 = r7.A00;
            int i18 = 0;
            if (i17 != 0) {
                i18 = -1 >>> (32 - i17);
            }
            if (i16 == i18) {
                int i19 = r10.A04;
                int i20 = r7.A01;
                int i21 = 0;
                if (i20 != 0) {
                    i21 = -1 >>> (32 - i20);
                }
                if (i19 == i21) {
                    r11.A01 = -1;
                    r11.A02 = -1;
                }
            }
            StringBuilder sb4 = new StringBuilder();
            for (int i22 = 0; i22 < i17; i22++) {
                if (((1 << i22) & r10.A03) != 0) {
                    if (i > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(r7.A00(i22));
                    i++;
                }
            }
            str = sb4.toString();
            0qQ.A07(str);
            sb = new StringBuilder();
            int i23 = r7.A01;
            i2 = 0;
            while (i3 < i23) {
                if (((1 << i3) & r10.A04) != 0) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(r7.A01(i3));
                    i2++;
                }
                i3++;
            }
            String obj2 = sb.toString();
            0qQ.A07(obj2);
            StringBuilder sb32 = new StringBuilder();
            sb32.append("Error while pushing ");
            sb32.append(r7);
            sb32.append(". Not all arguments were provided. Missing ");
            sb32.append(i);
            sb32.append(" int arguments (");
            sb32.append(str);
            sb32.append(") and ");
            sb32.append(i2);
            sb32.append(" object arguments (");
            sb32.append(obj2);
            sb32.append(").");
            C18086VlG.A01(sb32.toString());
            throw AnonymousClass00P.createAndThrow();
            r11.A00 = i3;
        }
    }

    public static final void A03(AnonymousClass5X5 r12, boolean z) {
        int i;
        AnonymousClass5X3 r0 = r12.A09.A0B;
        if (z) {
            i = r0.A05;
        } else {
            i = r0.A01;
        }
        int i2 = i - r12.A03;
        if (i2 < 0) {
            AnonymousClass5XN.A03("Tried to seek backward");
        } else if (i2 > 0) {
            C286535Wu r10 = r12.A05.A00;
            C288515c2 r7 = C288515c2.A00;
            r10.A02(r7);
            C286685Xj.A00(r10, 0, i2);
            int i3 = r10.A03;
            int i4 = r7.A00;
            int i5 = 0;
            if (i4 != 0) {
                i5 = -1 >>> (32 - i4);
            }
            if (i3 == i5) {
                int i6 = r10.A04;
                int i7 = r7.A01;
                int i8 = 0;
                if (i7 != 0) {
                    i8 = -1 >>> (32 - i7);
                }
                if (i6 == i8) {
                    r12.A03 = i;
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            int i9 = 0;
            for (int i10 = 0; i10 < i4; i10++) {
                if (((1 << i10) & r10.A03) != 0) {
                    if (i9 > 0) {
                        sb.append(", ");
                    }
                    sb.append(r7.A00(i10));
                    i9++;
                }
            }
            String obj = sb.toString();
            0qQ.A07(obj);
            StringBuilder sb2 = new StringBuilder();
            int i11 = r7.A01;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                if (((1 << i13) & r10.A04) != 0) {
                    if (i9 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(r7.A01(i13));
                    i12++;
                }
            }
            String obj2 = sb2.toString();
            0qQ.A07(obj2);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Error while pushing ");
            sb3.append(r7);
            sb3.append(". Not all arguments were provided. Missing ");
            sb3.append(i9);
            sb3.append(" int arguments (");
            sb3.append(obj);
            sb3.append(") and ");
            sb3.append(i12);
            sb3.append(" object arguments (");
            sb3.append(obj2);
            sb3.append(").");
            C18086VlG.A01(sb3.toString());
        } else {
            return;
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A05(int i, int i2) {
        if (i2 <= 0) {
            return;
        }
        if (i < 0) {
            AnonymousClass5XN.A03(002.A0O("Invalid remove index ", i));
            throw AnonymousClass00P.createAndThrow();
        } else if (this.A08 == i) {
            this.A00 += i2;
        } else {
            A02(this);
            this.A08 = i;
            this.A00 = i2;
        }
    }

    public AnonymousClass5X5(C286565Wx r2, AnonymousClass5Ws r3) {
        this.A09 = r2;
        this.A05 = r3;
    }

    public final void A04() {
        A02(this);
        ArrayList arrayList = this.A04.A00;
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            this.A07++;
        }
    }
}
