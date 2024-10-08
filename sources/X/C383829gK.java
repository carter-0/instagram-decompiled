package X;

import java.math.BigDecimal;

/* renamed from: X.9gK  reason: invalid class name and case insensitive filesystem */
public final class C383829gK extends C282615Dy {
    public static final C383829gK A01 = new C383829gK(BigDecimal.ZERO);
    public static final BigDecimal A02 = BigDecimal.valueOf(2147483647L);
    public static final BigDecimal A03 = BigDecimal.valueOf(Long.MAX_VALUE);
    public static final BigDecimal A04 = BigDecimal.valueOf(-2147483648L);
    public static final BigDecimal A05 = BigDecimal.valueOf(Long.MIN_VALUE);
    public final BigDecimal A00;

    public final boolean equals(Object obj) {
        if (obj != this) {
            return obj != null && (obj instanceof C383829gK) && ((C383829gK) obj).A00.compareTo(this.A00) == 0;
        }
        return true;
    }

    public final String A06() {
        return this.A00.toString();
    }

    public final 16L A0B() {
        return 16L.A0H;
    }

    public final int A0C() {
        return this.A00.intValue();
    }

    public final void EN9(17Z r2, C269504fE r3) {
        r2.A0u(this.A00);
    }

    public final int hashCode() {
        return Double.valueOf(this.A00.doubleValue()).hashCode();
    }

    public C383829gK(BigDecimal bigDecimal) {
        this.A00 = bigDecimal;
    }
}
