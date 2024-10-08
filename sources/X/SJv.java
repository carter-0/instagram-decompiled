package X;

public abstract class SJv {
    public static final char[] A00 = "0123456789abcdef".toCharArray();

    public abstract int A00();

    public abstract int A01();

    public abstract boolean A02(SJv sJv);

    public abstract byte[] A03();

    public final boolean equals(Object obj) {
        if (!(obj instanceof SJv)) {
            return false;
        }
        SJv sJv = (SJv) obj;
        if (A01() != sJv.A01() || !A02(sJv)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (A01() >= 32) {
            return A00();
        }
        byte[] A03 = A03();
        byte b = A03[0] & 255;
        for (int i = 1; i < A03.length; i++) {
            b |= (A03[i] & 255) << (i * 8);
        }
        return b;
    }

    public final String toString() {
        StringBuilder A14 = Pxe.A14(r5 + r5);
        for (byte b : A03()) {
            char[] cArr = A00;
            A14.append(cArr[(b >> 4) & 15]);
            A14.append(cArr[b & 15]);
        }
        return A14.toString();
    }
}
