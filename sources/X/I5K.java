package X;

public abstract class I5K {
    public static final JS3 A00 = new C56901IGw(C56476Hz8.A00, 0, 0);

    public static final void A01(int i, int i2, int i3) {
        if (i < 0 || i > i2) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("OffsetMapping.originalToTransformed returned invalid mapping: ");
            A1A.append(i3);
            A1A.append(" -> ");
            A1A.append(i);
            A1A.append(" is not in range of transformed text [0, ");
            A1A.append(i2);
            throw AnonymousClass7TE.A0z(C51967G9n.A0r(A1A, ']'));
        }
    }

    public static final void A02(int i, int i2, int i3) {
        if (i < 0 || i > i2) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("OffsetMapping.transformedToOriginal returned invalid mapping: ");
            A1A.append(i3);
            A1A.append(" -> ");
            A1A.append(i);
            A1A.append(" is not in range of original text [0, ");
            A1A.append(i2);
            throw AnonymousClass7TE.A0z(C51967G9n.A0r(A1A, ']'));
        }
    }

    public static final C56072HsL A00(C286025Tq r7, C59648JRq jRq) {
        C56072HsL AV6 = jRq.AV6(r7);
        int length = r7.length();
        C286025Tq r5 = AV6.A00;
        int length2 = r5.length();
        int min = Math.min(length, 100);
        for (int i = 0; i < min; i++) {
            A01(AV6.A01.E1S(i), length2, i);
        }
        JS3 js3 = AV6.A01;
        A01(js3.E1S(length), length2, length);
        int min2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < min2; i2++) {
            A02(js3.FHr(i2), length, i2);
        }
        A02(js3.FHr(length2), length, length2);
        return new C56072HsL(r5, new C56901IGw(js3, length, length2));
    }
}
