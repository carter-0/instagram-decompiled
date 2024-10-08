package X;

/* renamed from: X.Vzy  reason: case insensitive filesystem */
public final class C18763Vzy {
    public static final int[][] A02;
    public final byte A00;
    public final Integer A01;

    static {
        int[][] iArr = new int[32][];
        int[] iArr2 = new int[2];
        int[] iArr3 = iArr2;
        // fill-array-data instruction
        iArr2[0] = 21522;
        iArr2[1] = 0;
        int[] iArr4 = new int[2];
        int[] iArr5 = iArr4;
        // fill-array-data instruction
        iArr4[0] = 20773;
        iArr4[1] = 1;
        int[] iArr6 = new int[2];
        int[] iArr7 = iArr6;
        // fill-array-data instruction
        iArr6[0] = 24188;
        iArr6[1] = 2;
        int[] iArr8 = new int[2];
        int[] iArr9 = iArr8;
        // fill-array-data instruction
        iArr8[0] = 23371;
        iArr8[1] = 3;
        int[] iArr10 = new int[2];
        int[] iArr11 = iArr10;
        // fill-array-data instruction
        iArr10[0] = 17913;
        iArr10[1] = 4;
        int[] iArr12 = new int[2];
        int[] iArr13 = iArr12;
        // fill-array-data instruction
        iArr12[0] = 16590;
        iArr12[1] = 5;
        int[] iArr14 = new int[2];
        int[] iArr15 = iArr14;
        // fill-array-data instruction
        iArr14[0] = 20375;
        iArr14[1] = 6;
        int[] iArr16 = new int[2];
        int[] iArr17 = iArr16;
        // fill-array-data instruction
        iArr16[0] = 19104;
        iArr16[1] = 7;
        int[] iArr18 = new int[2];
        int[] iArr19 = iArr18;
        // fill-array-data instruction
        iArr18[0] = 30660;
        iArr18[1] = 8;
        int[] iArr20 = new int[2];
        int[] iArr21 = iArr20;
        // fill-array-data instruction
        iArr20[0] = 29427;
        iArr20[1] = 9;
        int[] iArr22 = new int[2];
        int[] iArr23 = iArr22;
        // fill-array-data instruction
        iArr22[0] = 32170;
        iArr22[1] = 10;
        int[] iArr24 = new int[2];
        int[] iArr25 = iArr24;
        // fill-array-data instruction
        iArr24[0] = 30877;
        iArr24[1] = 11;
        int[] iArr26 = new int[2];
        // fill-array-data instruction
        iArr26[0] = 26159;
        iArr26[1] = 12;
        System.arraycopy(new int[][]{new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}}, AnonymousClass7TF.A1X(new int[][]{iArr3, iArr5, iArr7, iArr9, iArr11, iArr13, iArr15, iArr17, iArr19, iArr21, iArr23, iArr25, iArr26, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}}, iArr) ? 1 : 0, iArr, 27, 5);
        A02 = iArr;
    }

    public static C18763Vzy A00(int i, int i2) {
        int bitCount;
        int[][] iArr = A02;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        int i5 = 0;
        do {
            int[] iArr2 = iArr[i4];
            int i6 = iArr2[0];
            if (i6 == i || i6 == i2) {
                return new C18763Vzy(iArr2[1]);
            }
            int bitCount2 = Integer.bitCount(i ^ i6);
            if (bitCount2 < i3) {
                i5 = iArr2[1];
                i3 = bitCount2;
            }
            if (i != i2 && (bitCount = Integer.bitCount(i2 ^ i6)) < i3) {
                i5 = iArr2[1];
                i3 = bitCount;
            }
            i4++;
        } while (i4 < 32);
        if (i3 <= 3) {
            return new C18763Vzy(i5);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18763Vzy)) {
            return false;
        }
        C18763Vzy vzy = (C18763Vzy) obj;
        if (this.A01 == vzy.A01 && this.A00 == vzy.A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.A01.intValue() << 3) | this.A00;
    }

    public C18763Vzy(int i) {
        int i2 = (i >> 3) & 3;
        if (i2 >= 0) {
            Integer[] numArr = C18298VpM.A00;
            if (i2 < 4) {
                this.A01 = numArr[i2];
                this.A00 = (byte) (i & 7);
                return;
            }
        }
        throw new IllegalArgumentException();
    }
}
