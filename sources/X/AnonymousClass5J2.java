package X;

import java.math.BigInteger;

/* renamed from: X.5J2  reason: invalid class name */
public final class AnonymousClass5J2 implements Comparable {
    public static final AnonymousClass5J2 A05 = new AnonymousClass5J2(0, 1, "", 0);
    public static final AnonymousClass5J2 A06;
    public static final AnonymousClass5J2 A07 = new AnonymousClass5J2(0, 0, "", 0);
    public static final AnonymousClass5J2 A08;
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new C377179Kv(this, 0));
    public final String A04;

    static {
        AnonymousClass5J2 r0 = new AnonymousClass5J2(1, 0, "", 0);
        A08 = r0;
        A06 = r0;
    }

    /* renamed from: A00 */
    public final int compareTo(AnonymousClass5J2 r3) {
        0qQ.A0B(r3, 0);
        Object value = this.A03.getValue();
        0qQ.A07(value);
        Object value2 = r3.A03.getValue();
        0qQ.A07(value2);
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass5J2)) {
            return false;
        }
        AnonymousClass5J2 r4 = (AnonymousClass5J2) obj;
        if (this.A00 == r4.A00 && this.A01 == r4.A01 && this.A02 == r4.A02) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((527 + this.A00) * 31) + this.A01) * 31) + this.A02;
    }

    public final String toString() {
        String str;
        String str2 = this.A04;
        if (!00l.A0W(str2)) {
            str = 002.A0D(str2, '-');
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append('.');
        sb.append(this.A01);
        sb.append('.');
        sb.append(this.A02);
        sb.append(str);
        return sb.toString();
    }

    public AnonymousClass5J2(int i, int i2, String str, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A04 = str;
    }
}
