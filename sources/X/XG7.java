package X;

import java.util.ArrayList;

public final class XG7 extends C286545Wv {
    public static final XG7 A00 = new XG7();

    public XG7() {
        super(1, 0);
    }

    public final String A00(int i) {
        if (i == 0) {
            return "offset";
        }
        return super.A00(i);
    }

    public final void A02(C286475Wm r20, C288455bw r21, AnonymousClass5X4 r22, C288475by r23) {
        String str;
        C288465bx r2 = (C288465bx) r23;
        int i = r2.A03.A05[r2.A00];
        AnonymousClass5X4 r7 = r22;
        if (r7.A06 == 0) {
            str = "Parameter offset is out of bounds";
            if (Pxf.A1R(i)) {
                if (i != 0) {
                    int i2 = r7.A00;
                    int i3 = r7.A08;
                    int i4 = r7.A01;
                    int i5 = i2;
                    while (true) {
                        if (i > 0) {
                            i5 += r7.A0I[(AnonymousClass5X4.A00(r7, i5) * 5) + 3];
                            if (i5 > i4) {
                                break;
                            }
                            i--;
                        } else {
                            int[] iArr = r7.A0I;
                            int A002 = AnonymousClass5X4.A00(r7, i5);
                            int i6 = iArr[(A002 * 5) + 3];
                            int A01 = AnonymousClass5X4.A01(r7, iArr, AnonymousClass5X4.A00(r7, i2));
                            int A012 = AnonymousClass5X4.A01(r7, iArr, A002);
                            int i7 = i5 + i6;
                            int A013 = AnonymousClass5X4.A01(r7, iArr, AnonymousClass5X4.A00(r7, i7));
                            int i8 = A013 - A012;
                            AnonymousClass5X4.A09(r7, i8, Math.max(i2 - 1, 0));
                            AnonymousClass5X4.A05(r7, i6);
                            int[] iArr2 = r7.A0I;
                            int A003 = AnonymousClass5X4.A00(r7, i7) * 5;
                            0Yw.A0T(iArr2, iArr2, AnonymousClass5X4.A00(r7, i2) * 5, A003, (i6 * 5) + A003);
                            if (i8 > 0) {
                                Object[] objArr = r7.A0J;
                                int i9 = A012 + i8;
                                int i10 = r7.A0B;
                                if (i9 >= i10) {
                                    i9 += r7.A09;
                                }
                                int i11 = A013 + i8;
                                if (i11 >= i10) {
                                    i11 += r7.A09;
                                }
                                0Yw.A0V(objArr, objArr, A01, i9, i11);
                            }
                            int i12 = A012 + i8;
                            int i13 = i12 - A01;
                            int i14 = r7.A0B;
                            int i15 = r7.A09;
                            int length = r7.A0J.length;
                            int i16 = r7.A0A;
                            int i17 = i2 + i6;
                            for (int i18 = i2; i18 < i17; i18++) {
                                int A004 = AnonymousClass5X4.A00(r7, i18);
                                int A014 = AnonymousClass5X4.A01(r7, iArr2, A004) - i13;
                                int i19 = i14;
                                if (i16 < A004) {
                                    i19 = 0;
                                }
                                if (A014 > i19) {
                                    A014 = -(((length - i15) - A014) + 1);
                                }
                                if (A014 > i14) {
                                    A014 = -(((length - i15) - A014) + 1);
                                }
                                iArr2[(A004 * 5) + 4] = A014;
                            }
                            int i20 = i6 + i7;
                            int length2 = (r7.A0I.length / 5) - r7.A04;
                            ArrayList arrayList = r7.A0F;
                            int A015 = AnonymousClass5X6.A01(arrayList, i7, length2);
                            if (A015 < 0) {
                                A015 = -(A015 + 1);
                            }
                            ArrayList A1C = AnonymousClass7TE.A1C();
                            if (A015 >= 0) {
                                while (A015 < arrayList.size() && (r0 = r7.A0H(r1)) >= i7 && r0 < i20) {
                                    A1C.add((r1 = (AnonymousClass5X7) arrayList.get(A015)));
                                    arrayList = r7.A0F;
                                    arrayList.remove(A015);
                                }
                            }
                            int i21 = i2 - i7;
                            int size = A1C.size();
                            for (int i22 = 0; i22 < size; i22++) {
                                AnonymousClass5X7 r24 = (AnonymousClass5X7) A1C.get(i22);
                                int A0H = r7.A0H(r24) + i21;
                                if (A0H >= r7.A05) {
                                    r24.A00 = -(length2 - A0H);
                                } else {
                                    r24.A00 = A0H;
                                }
                                ArrayList arrayList2 = r7.A0F;
                                int A016 = AnonymousClass5X6.A01(arrayList2, A0H, length2);
                                if (A016 < 0) {
                                    A016 = -(A016 + 1);
                                }
                                arrayList2.add(A016, r24);
                            }
                            if (!(!AnonymousClass5X4.A0F(r7, i7, i6))) {
                                str = "Unexpectedly removed anchors";
                            } else {
                                AnonymousClass5X4.A0B(r7, i3, r7.A01, i2);
                                if (i8 > 0) {
                                    AnonymousClass5X4.A0C(r7, i12, i8, i7 - 1);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        } else {
            str = "Cannot move a group while inserting";
        }
        AnonymousClass5XN.A03(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
