package X;

import java.util.Comparator;
import java.util.List;

/* renamed from: X.5XN  reason: invalid class name */
public abstract class AnonymousClass5XN {
    public static final Object A00 = new AnonymousClass5XO("compositionLocalMap");
    public static final Object A01 = new AnonymousClass5XO("provider");
    public static final Object A02 = new AnonymousClass5XO("provider");
    public static final Object A03 = new AnonymousClass5XO("providers");
    public static final Object A04 = new AnonymousClass5XO("reference");
    public static final Comparator A05 = new AnonymousClass5XP();

    public static final void A01(C288455bw r14, AnonymousClass5X4 r15) {
        Object obj;
        int i;
        int i2;
        int i3 = r15.A00;
        int i4 = r15.A01;
        while (i3 < i4) {
            int A002 = AnonymousClass5X4.A00(r15, i3);
            int[] iArr = r15.A0I;
            if (AnonymousClass5X6.A03(iArr, A002)) {
                Object[] objArr = r15.A0J;
                int A012 = AnonymousClass5X4.A01(r15, iArr, A002);
                if (A012 >= r15.A0B) {
                    A012 += r15.A09;
                }
                obj = objArr[A012];
            } else {
                obj = null;
            }
            if (obj instanceof AnonymousClass5R9) {
                C288445bv r0 = (C288445bv) r14;
                C288445bv.A00(r0, (r15.A0J.length - r15.A09) - AnonymousClass5X4.A03(r15, iArr, AnonymousClass5X4.A00(r15, i3)));
                r0.A03.add(obj);
            }
            int A003 = AnonymousClass5X4.A00(r15, i3);
            int[] iArr2 = r15.A0I;
            int A032 = AnonymousClass5X4.A03(r15, iArr2, A003);
            int i5 = i3 + 1;
            int A013 = AnonymousClass5X4.A01(r15, iArr2, AnonymousClass5X4.A00(r15, i5));
            for (int i6 = A032; i6 < A013; i6++) {
                int i7 = i6 - A032;
                Object[] objArr2 = r15.A0J;
                int i8 = i6;
                if (i6 >= r15.A0B) {
                    i8 = i6 + r15.A09;
                }
                Object obj2 = objArr2[i8];
                if (obj2 instanceof C286695Xk) {
                    C286695Xk r10 = (C286695Xk) obj2;
                    AnonymousClass2DP r2 = r10.A01;
                    if (!(r2 instanceof AnonymousClass6IH)) {
                        Object obj3 = AnonymousClass5XT.A00;
                        int A0G = r15.A0G(i3, i7);
                        if (A0G >= r15.A0B) {
                            A0G += r15.A09;
                        }
                        Object[] objArr3 = r15.A0J;
                        Object obj4 = objArr3[A0G];
                        objArr3[A0G] = obj3;
                        if (obj2 == obj4) {
                            int length = objArr3.length - r15.A09;
                            int i9 = length - i7;
                            AnonymousClass5X7 r102 = r10.A00;
                            if (r102 == null || r102.A00 == Integer.MIN_VALUE) {
                                i = -1;
                                i2 = -1;
                            } else {
                                i = r15.A0H(r102);
                                int[] iArr3 = r15.A0I;
                                i2 = length - AnonymousClass5X4.A01(r15, iArr3, AnonymousClass5X4.A00(r15, iArr3[(AnonymousClass5X4.A00(r15, i) * 5) + 3] + i));
                            }
                            r14.AWN(r2, i9, i, i2);
                        } else {
                            A03("Slot table is out of sync");
                            throw AnonymousClass00P.createAndThrow();
                        }
                    } else {
                        continue;
                    }
                } else if (obj2 instanceof C286625Xd) {
                    Object obj5 = AnonymousClass5XT.A00;
                    int A0G2 = r15.A0G(i3, i7);
                    if (A0G2 >= r15.A0B) {
                        A0G2 += r15.A09;
                    }
                    Object[] objArr4 = r15.A0J;
                    Object obj6 = objArr4[A0G2];
                    objArr4[A0G2] = obj5;
                    if (obj2 == obj6) {
                        ((C286625Xd) obj2).A00();
                    } else {
                        A03("Slot table is out of sync");
                        throw AnonymousClass00P.createAndThrow();
                    }
                } else {
                    continue;
                }
            }
            i3 = i5;
        }
    }

    public static final void A02(C288455bw r10, AnonymousClass5X4 r11) {
        int i;
        int i2;
        int i3 = r11.A00;
        int A002 = AnonymousClass5X4.A00(r11, i3);
        int[] iArr = r11.A0I;
        int A012 = AnonymousClass5X4.A01(r11, iArr, AnonymousClass5X4.A00(r11, i3 + iArr[(A002 * 5) + 3]));
        for (int A013 = AnonymousClass5X4.A01(r11, iArr, A002); A013 < A012; A013++) {
            Object[] objArr = r11.A0J;
            int i4 = A013;
            if (A013 >= r11.A0B) {
                i4 = A013 + r11.A09;
            }
            Object obj = objArr[i4];
            int i5 = -1;
            if (obj instanceof AnonymousClass5R9) {
                int length = (objArr.length - r11.A09) - A013;
                C288445bv r2 = (C288445bv) r10;
                0vq r0 = r2.A00;
                if (r0 == null) {
                    0vq r02 = AnonymousClass01q.A00;
                    r0 = new 0vq(6);
                    r2.A00 = r0;
                }
                r0.A03[0vq.A01(r0, obj)] = obj;
                C288445bv.A00(r2, length);
                r2.A03.add(obj);
            }
            if (obj instanceof C286695Xk) {
                int length2 = r11.A0J.length - r11.A09;
                int i6 = length2 - A013;
                C286695Xk r7 = (C286695Xk) obj;
                AnonymousClass5X7 r9 = r7.A00;
                if (r9 == null || r9.A00 == Integer.MIN_VALUE) {
                    i2 = -1;
                } else {
                    i5 = r11.A0H(r9);
                    int[] iArr2 = r11.A0I;
                    i2 = length2 - AnonymousClass5X4.A01(r11, iArr2, AnonymousClass5X4.A00(r11, iArr2[(AnonymousClass5X4.A00(r11, i5) * 5) + 3] + i5));
                }
                r10.AWN(r7.A01, i6, i5, i2);
            }
            if (obj instanceof C286625Xd) {
                ((C286625Xd) obj).A00();
            }
        }
        if (r11.A06 == 0) {
            int i7 = r11.A00;
            int i8 = r11.A02;
            int[] iArr3 = r11.A0I;
            int A003 = AnonymousClass5X4.A00(r11, i7);
            int A014 = AnonymousClass5X4.A01(r11, iArr3, A003);
            int i9 = A003 * 5;
            int i10 = iArr3[i9 + 3] + i7;
            r11.A00 = i10;
            r11.A02 = AnonymousClass5X4.A01(r11, iArr3, AnonymousClass5X4.A00(r11, i10));
            if (AnonymousClass5X6.A03(iArr3, A003)) {
                i = 1;
            } else {
                i = iArr3[i9 + 1] & 67108863;
            }
            AnonymousClass5X4.A07(r11, r11.A08);
            AnonymousClass6IF r1 = r11.A0E;
            if (r1 != null) {
                while ((!r1.A00.isEmpty()) && ((Number) 00k.A0I(r1.A00)).intValue() >= i7) {
                    r1.A00();
                }
            }
            AnonymousClass5X4.A0F(r11, i7, r11.A00 - i7);
            AnonymousClass5X4.A0C(r11, A014, r11.A02 - A014, i7 - 1);
            r11.A00 = i7;
            r11.A02 = i8;
            r11.A07 -= i;
            return;
        }
        A03("Cannot remove group while inserting");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A03(String str) {
        throw new V23(002.A0g("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void A04(String str) {
        throw new V23(002.A0g("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void A06(boolean z) {
        if (!z) {
            A03("Check failed");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final int A00(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int A002 = 0qQ.A00(((C298655to) list.get(i3)).A01, i);
            if (A002 < 0) {
                i2 = i3 + 1;
            } else if (A002 <= 0) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void A05(List list, int i, int i2) {
        int A002 = A00(list, i);
        if (A002 < 0) {
            A002 = -(A002 + 1);
        }
        while (A002 < list.size() && ((C298655to) list.get(A002)).A01 < i2) {
            list.remove(A002);
        }
    }
}
