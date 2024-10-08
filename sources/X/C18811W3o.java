package X;

/* renamed from: X.W3o  reason: case insensitive filesystem */
public final class C18811W3o {
    public static final C18811W3o[] A04;
    public static final int[] A05 = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    public final int A00;
    public final int A01;
    public final int[] A02;
    public final VR9[] A03;

    public static C18811W3o A08(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        while (true) {
            int[] iArr = A05;
            if (i2 < 34) {
                int i5 = iArr[i2];
                if (i5 == i) {
                    i3 = i2 + 7;
                    break;
                }
                int bitCount = Integer.bitCount(i5 ^ i);
                if (bitCount < i4) {
                    i3 = i2 + 7;
                    i4 = bitCount;
                }
                i2++;
            } else if (i4 > 3) {
                return null;
            }
        }
        return A09(i3);
    }

    public static C18811W3o A09(int i) {
        if (i >= 1 && i <= 40) {
            return A04[i - 1];
        }
        throw new IllegalArgumentException();
    }

    static {
        C18811W3o[] w3oArr = new C18811W3o[40];
        System.arraycopy(new C18811W3o[]{new C18811W3o(new int[0], new VR9[]{new VR9(A0A(1, 19), 7), new VR9(A0A(1, 16), 10), new VR9(A0A(1, 13), 13), new VR9(A0A(1, 9), 17)}, 1), new C18811W3o(new int[]{6, 18}, new VR9[]{A02(1, 34, 10), A02(1, 28, 16), new VR9(A0A(1, 22), 22), A02(1, 16, 28)}, 2), new C18811W3o(new int[]{6, 22}, new VR9[]{new VR9(A0A(1, 55), 15), new VR9(A0A(1, 44), 26), new VR9(A0A(2, 17), 18), A02(2, 13, 22)}, 3), new C18811W3o(new int[]{6, 26}, new VR9[]{new VR9(A0A(1, 80), 20), new VR9(A0A(2, 32), 18), A02(2, 24, 26), A02(4, 9, 16)}, 4), new C18811W3o(new int[]{6, 30}, new VR9[]{A02(1, 108, 26), A02(2, 43, 24), new VR9(A0B(A00(2), 2, 16), 18), A03(new VR8(2, 11), 2, 12)}, 5), new C18811W3o(new int[]{6, 34}, new VR9[]{new VR9(A0A(2, 68), 18), A02(4, 27, 16), A02(4, 19, 24), new VR9(A0A(4, 15), 28)}, 6), new C18811W3o(new int[]{6, 22, 38}, new VR9[]{new VR9(A0A(2, 78), 20), new VR9(A0A(4, 31), 18), A07(new VR8(2, 14), 4, 15, 18), A04(new VR8(4, 13), 1, 14)}, 7), new C18811W3o(new int[]{6, 24, 42}, new VR9[]{A02(2, 97, 24), new VR9(A0B(new VR8(2, 38), 2, 39), 22), A07(new VR8(4, 18), 2, 19, 22), A04(new VR8(4, 14), 2, 15)}, 8), new C18811W3o(new int[]{6, 26, 46}, new VR9[]{new VR9(A0A(2, 116), 30), A03(new VR8(3, 36), 2, 37), new VR9(A0B(new VR8(4, 16), 4, 17), 20), A07(new VR8(4, 12), 4, 13, 24)}, 9), new C18811W3o(new int[]{6, 28, 50}, new VR9[]{new VR9(A0B(new VR8(2, 68), 2, 69), 18), A04(new VR8(4, 43), 1, 44), A07(new VR8(6, 19), 2, 20, 24), A05(A00(6), 2, 16)}, 10), new C18811W3o(new int[]{6, 30, 54}, new VR9[]{new VR9(A0A(4, 81), 20), A07(new VR8(1, 50), 4, 51, 30), A05(new VR8(4, 22), 4, 23), A07(new VR8(3, 12), 8, 13, 24)}, 11), new C18811W3o(new int[]{6, 32, 58}, new VR9[]{A07(new VR8(2, 92), 2, 93, 24), A03(new VR8(6, 36), 2, 37), A04(new VR8(4, 20), 6, 21), A05(new VR8(7, 14), 4, 15)}, 12), new C18811W3o(new int[]{6, 34, 62}, new VR9[]{new VR9(A0A(4, 107), 26), A03(new VR8(8, 37), 1, 38), A07(new VR8(8, 20), 4, 21, 24), A03(new VR8(12, 11), 4, 12)}, 13), new C18811W3o(new int[]{6, 26, 46, 66}, new VR9[]{A07(new VR8(3, 115), 1, 116, 30), A07(new VR8(4, 40), 5, 41, 24), new VR9(A0B(new VR8(11, 16), 5, 17), 20), A07(new VR8(11, 12), 5, 13, 24)}, 14), new C18811W3o(new int[]{6, 26, 48, 70}, new VR9[]{A03(new VR8(5, 87), 1, 88), A07(new VR8(5, 41), 5, 42, 24), A06(new VR8(5, 24), 7, 25), A07(new VR8(11, 12), 7, 13, 24)}, 15), new C18811W3o(new int[]{6, 26, 50, 74}, new VR9[]{A07(new VR8(5, 98), 1, 99, 24), A05(new VR8(7, 45), 3, 46), A07(new VR8(15, 19), 2, 20, 24), A06(new VR8(3, 15), 13, 16)}, 16), new C18811W3o(new int[]{6, 30, 54, 78}, new VR9[]{new VR9(A0B(new VR8(1, 107), 5, 108), 28), A07(new VR8(10, 46), 1, 47, 28), A07(new VR8(1, 22), 15, 23, 28), A07(new VR8(2, 14), 17, 15, 28)}, 17), new C18811W3o(new int[]{6, 30, 56, 82}, new VR9[]{A06(new VR8(5, 120), 1, 121), A04(new VR8(9, 43), 4, 44), new VR9(A0B(new VR8(17, 22), 1, 23), 28), A07(new VR8(2, 14), 19, 15, 28)}, 18), new C18811W3o(new int[]{6, 30, 58, 86}, new VR9[]{A05(new VR8(3, 113), 4, 114), new VR9(A0B(new VR8(3, 44), 11, 45), 26), A07(new VR8(17, 21), 4, 22, 26), A07(new VR8(9, 13), 16, 14, 26)}, 19), new C18811W3o(new int[]{6, 34, 62, 90}, new VR9[]{A05(new VR8(3, 107), 5, 108), A04(new VR8(3, 41), 13, 42), A06(A01(15), 5, 25), new VR9(A0B(new VR8(15, 15), 10, 16), 28)}, 20), new C18811W3o(new int[]{6, 28, 50, 72, 94}, new VR9[]{A07(new VR8(4, 116), 4, 117, 28), new VR9(A0A(17, 42), 26), A05(new VR8(17, 22), 6, 23), A06(new VR8(19, 16), 6, 17)}, 21), new C18811W3o(new int[]{6, 26, 50, 74, 98}, new VR9[]{new VR9(A0B(new VR8(2, 111), 7, 112), 28), A02(17, 46, 28), A06(A01(7), 16, 25), new VR9(A0A(34, 13), 24)}, 22), new C18811W3o(new int[]{6, 30, 54, 78, 102}, new VR9[]{A06(new VR8(4, 121), 5, 122), A05(new VR8(4, 47), 14, 48), new VR9(A0B(A01(11), 14, 25), 30), A07(new VR8(16, 15), 14, 16, 30)}, 23), new C18811W3o(new int[]{6, 28, 54, 80, 106}, new VR9[]{A06(new VR8(6, 117), 4, 118), A05(new VR8(6, 45), 14, 46), new VR9(A0B(A01(11), 16, 25), 30), A07(new VR8(30, 16), 2, 17, 30)}, 24), new C18811W3o(new int[]{6, 32, 58, 84, 110}, new VR9[]{A04(new VR8(8, 106), 4, 107), A05(new VR8(8, 47), 13, 48), new VR9(A0B(new VR8(7, 24), 22, 25), 30), A07(new VR8(22, 15), 13, 16, 30)}, 25), new C18811W3o(new int[]{6, 30, 58, 86, 114}, new VR9[]{new VR9(A0B(new VR8(10, 114), 2, 115), 28), A07(new VR8(19, 46), 4, 47, 28), A07(new VR8(28, 22), 6, 23, 28), new VR9(A0B(new VR8(33, 16), 4, 17), 30)}, 26), new C18811W3o(new int[]{6, 34, 62, 90, 118}, new VR9[]{A07(new VR8(8, 122), 4, 123, 30), A05(new VR8(22, 45), 3, 46), new VR9(A0B(new VR8(8, 23), 26, 24), 30), A07(new VR8(12, 15), 28, 16, 30)}, 27)}, 0, w3oArr, 0, 27);
        System.arraycopy(new C18811W3o[]{new C18811W3o(new int[]{6, 26, 50, 74, 98, 122}, new VR9[]{A06(new VR8(3, 117), 10, 118), A07(new VR8(3, 45), 23, 46, 28), new VR9(A0B(A01(4), 31, 25), 30), A07(new VR8(11, 15), 31, 16, 30)}, 28), new C18811W3o(new int[]{6, 30, 54, 78, 102, 126}, new VR9[]{A07(new VR8(7, 116), 7, 117, 30), A07(new VR8(21, 45), 7, 46, 28), A07(new VR8(1, 23), 37, 24, 30), A07(new VR8(19, 15), 26, 16, 30)}, 29), new C18811W3o(new int[]{6, 26, 52, 78, 104, 130}, new VR9[]{A07(new VR8(5, 115), 10, 116, 30), A07(new VR8(19, 47), 10, 48, 28), new VR9(new VR8[]{A01(15), new VR8(25, 25)}, 30), A07(new VR8(23, 15), 25, 16, 30)}, 30), new C18811W3o(new int[]{6, 30, 56, 82, 108, 134}, new VR9[]{A07(new VR8(13, 115), 3, 116, 30), A05(new VR8(2, 46), 29, 47), A07(A01(42), 1, 25, 30), A07(A00(23), 28, 16, 30)}, 31), new C18811W3o(new int[]{6, 34, 60, 86, 112, 138}, new VR9[]{A02(17, 115, 30), A05(new VR8(10, 46), 23, 47), A07(A01(10), 35, 25, 30), A07(A00(19), 35, 16, 30)}, 32), new C18811W3o(new int[]{6, 30, 58, 86, 114, 142}, new VR9[]{A07(new VR8(17, 115), 1, 116, 30), A05(new VR8(14, 46), 21, 47), A07(A01(29), 19, 25, 30), A07(A00(11), 46, 16, 30)}, 33), new C18811W3o(new int[]{6, 34, 62, 90, 118, 146}, new VR9[]{A07(new VR8(13, 115), 6, 116, 30), A05(new VR8(14, 46), 23, 47), A07(A01(44), 7, 25, 30), A07(new VR8(59, 16), 1, 17, 30)}, 34), new C18811W3o(new int[]{6, 30, 54, 78, 102, 126, 150}, new VR9[]{A07(new VR8(12, 121), 7, 122, 30), A05(new VR8(12, 47), 26, 48), A07(A01(39), 14, 25, 30), A07(A00(22), 41, 16, 30)}, 35), new C18811W3o(new int[]{6, 24, 50, 76, 102, 128, 154}, new VR9[]{A07(new VR8(6, 121), 14, 122, 30), A05(new VR8(6, 47), 34, 48), A07(A01(46), 10, 25, 30), A07(A00(2), 64, 16, 30)}, 36), new C18811W3o(new int[]{6, 28, 54, 80, 106, 132, 158}, new VR9[]{A07(new VR8(17, 122), 4, 123, 30), A05(new VR8(29, 46), 14, 47), A07(new VR8(49, 24), 10, 25, 30), A07(A00(24), 46, 16, 30)}, 37), new C18811W3o(new int[]{6, 32, 58, 84, 110, 136, 162}, new VR9[]{A07(new VR8(4, 122), 18, 123, 30), A05(new VR8(13, 46), 32, 47), A07(A01(48), 14, 25, 30), A07(A00(42), 32, 16, 30)}, 38), new C18811W3o(new int[]{6, 26, 54, 82, 110, 138, 166}, new VR9[]{A07(new VR8(20, 117), 4, 118, 30), A05(new VR8(40, 47), 7, 48), A07(A01(43), 22, 25, 30), A07(A00(10), 67, 16, 30)}, 39), new C18811W3o(new int[]{6, 30, 58, 86, 114, 142, C11152SCh.MAX_FACTORIAL}, new VR9[]{A07(new VR8(19, 118), 6, 119, 30), A05(new VR8(18, 47), 31, 48), A07(A01(34), 34, 25, 30), A07(A00(20), 61, 16, 30)}, 40)}, 0, w3oArr, 27, 13);
        A04 = w3oArr;
    }

    public static VR8 A00(int i) {
        return new VR8(i, 15);
    }

    public static VR8 A01(int i) {
        return new VR8(i, 24);
    }

    public static VR9 A02(int i, int i2, int i3) {
        return new VR9(new VR8[]{new VR8(i, i2)}, i3);
    }

    public static VR9 A03(VR8 vr8, int i, int i2) {
        return new VR9(new VR8[]{vr8, new VR8(i, i2)}, 22);
    }

    public static VR9 A04(VR8 vr8, int i, int i2) {
        return new VR9(new VR8[]{vr8, new VR8(i, i2)}, 26);
    }

    public static VR9 A05(VR8 vr8, int i, int i2) {
        return new VR9(new VR8[]{vr8, new VR8(i, i2)}, 28);
    }

    public static VR9 A06(VR8 vr8, int i, int i2) {
        return new VR9(new VR8[]{vr8, new VR8(i, i2)}, 30);
    }

    public static VR9 A07(VR8 vr8, int i, int i2, int i3) {
        return new VR9(new VR8[]{vr8, new VR8(i, i2)}, i3);
    }

    public static VR8[] A0A(int i, int i2) {
        return new VR8[]{new VR8(i, i2)};
    }

    public static VR8[] A0B(VR8 vr8, int i, int i2) {
        return new VR8[]{vr8, new VR8(i, i2)};
    }

    public final String toString() {
        return String.valueOf(this.A01);
    }

    public C18811W3o(int[] iArr, VR9[] vr9Arr, int i) {
        this.A01 = i;
        this.A02 = iArr;
        this.A03 = vr9Arr;
        VR9 vr9 = vr9Arr[0];
        int i2 = vr9.A00;
        int i3 = 0;
        for (VR8 vr8 : vr9.A01) {
            i3 += vr8.A00 * (vr8.A01 + i2);
        }
        this.A00 = i3;
    }
}
