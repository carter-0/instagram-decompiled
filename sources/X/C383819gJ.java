package X;

import java.math.BigInteger;

/* renamed from: X.9gJ  reason: invalid class name and case insensitive filesystem */
public final class C383819gJ extends C282615Dy {
    public static final BigInteger A01 = BigInteger.valueOf(2147483647L);
    public static final BigInteger A02 = BigInteger.valueOf(Long.MAX_VALUE);
    public static final BigInteger A03 = BigInteger.valueOf(-2147483648L);
    public static final BigInteger A04 = BigInteger.valueOf(Long.MIN_VALUE);
    public final BigInteger A00;

    public final String A06() {
        return this.A00.toString();
    }

    public final 16L A0B() {
        return 16L.A0I;
    }

    public final int A0C() {
        return this.A00.intValue();
    }

    public final void EN9(17Z r2, C269504fE r3) {
        r2.A0v(this.A00);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C383819gJ)) {
            return false;
        }
        return ((C383819gJ) obj).A00.equals(this.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C383819gJ(BigInteger bigInteger) {
        this.A00 = bigInteger;
    }
}
