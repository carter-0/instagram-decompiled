package X;

/* renamed from: X.3MU  reason: invalid class name */
public abstract class AnonymousClass3MU {
    public static boolean[] A00 = new boolean[3];

    public static void A00(2dA r8, 2d3 r9, 2d1 r10) {
        r9.A0D = -1;
        r9.A0Q = -1;
        Integer[] numArr = r10.A14;
        Integer num = numArr[0];
        Integer num2 = AnonymousClass05K.A01;
        if (num != num2 && r9.A14[0] == AnonymousClass05K.A0N) {
            2d6 r7 = r9.A0e;
            int i = r7.A02;
            int A07 = r10.A07();
            2d6 r1 = r9.A0f;
            int i2 = A07 - r1.A02;
            r7.A03 = r8.A09(r7);
            r1.A03 = r8.A09(r1);
            r8.A0D(r7.A03, i);
            r8.A0D(r1.A03, i2);
            r9.A0D = 2;
            r9.A0V = i;
            int i3 = i2 - i;
            r9.A0S = i3;
            int i4 = r9.A0N;
            if (i3 < i4) {
                r9.A0S = i4;
            }
        }
        if (numArr[1] != num2 && r9.A14[1] == AnonymousClass05K.A0N) {
            2d6 r5 = r9.A0g;
            int i5 = r5.A02;
            int A06 = r10.A06();
            2d6 r12 = r9.A0a;
            int i6 = A06 - r12.A02;
            r5.A03 = r8.A09(r5);
            r12.A03 = r8.A09(r12);
            r8.A0D(r5.A03, i5);
            r8.A0D(r12.A03, i6);
            if (r9.A08 > 0 || r9.A0R == 8) {
                2d6 r0 = r9.A0Z;
                2dB A09 = r8.A09(r0);
                r0.A03 = A09;
                r8.A0D(A09, r9.A08 + i5);
            }
            r9.A0Q = 2;
            r9.A0W = i5;
            int i7 = i6 - i5;
            r9.A0A = i7;
            int i8 = r9.A0M;
            if (i7 < i8) {
                r9.A0A = i8;
            }
        }
    }
}
