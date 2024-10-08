package X;

/* renamed from: X.3wD  reason: invalid class name and case insensitive filesystem */
public abstract class C256703wD {
    public static void A00(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(String.format("Index: %d. Start: %d. Limit: %d", new Object[]{Integer.valueOf(i), 0, Integer.valueOf(i2)}));
        }
    }

    public static void A01(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void A02(Object obj) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf("The uri must be set."));
        }
    }

    public static void A03(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void A04(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void A05(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }
}
