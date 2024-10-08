package X;

/* renamed from: X.42I  reason: invalid class name */
public abstract class AnonymousClass42I {
    public static Object A02(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(002.A0O(Pxd.A00(805), i));
        } else if (i <= 256) {
            return new byte[i];
        } else {
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
    }

    public static int A00(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i] & 65535;
        }
        return ((int[]) obj)[i];
    }

    public static void A03(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static int A01(Object obj, Object obj2, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2, int i) {
        int i2;
        int i3;
        int A02 = 1J7.A02(obj);
        int i4 = A02 & i;
        int A00 = A00(obj3, i4);
        if (A00 != 0) {
            int i5 = i ^ -1;
            int i6 = A02 & i5;
            int i7 = -1;
            while (true) {
                i2 = A00 - 1;
                i3 = iArr[i2];
                if ((i3 & i5) != i6 || !2PP.A00(obj, objArr[i2]) || (objArr2 != null && !2PP.A00(obj2, objArr2[i2]))) {
                    A00 = i3 & i;
                    if (A00 == 0) {
                        break;
                    }
                    i7 = i2;
                }
            }
            int i8 = i3 & i;
            if (i7 == -1) {
                A03(obj3, i4, i8);
                return i2;
            }
            iArr[i7] = (iArr[i7] & i5) | (i8 & i);
            return i2;
        }
        return -1;
    }
}
