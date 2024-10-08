package X;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: X.48h  reason: invalid class name and case insensitive filesystem */
public final class C2611148h {
    public final 2Ed A00;
    public final Object A01;
    public final Object A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2611148h)) {
                return false;
            }
            C2611148h r5 = (C2611148h) obj;
            2Ed r1 = this.A00;
            if (r1 != r5.A00) {
                return false;
            }
            Comparator comparator = r1.A02;
            if (!(comparator.compare(this.A02, r5.A02) == 0 && comparator.compare(this.A01, r5.A01) == 0)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A01() {
        if (this.A00.A02.compare(this.A02, this.A01) >= 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A02, this.A01});
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        Object obj = this.A02;
        2Ed r2 = this.A00;
        if (obj.equals(r2.A01)) {
            str = "[";
        } else {
            str = "(";
        }
        sb.append(str);
        sb.append(obj);
        sb.append(", ");
        Object obj2 = this.A01;
        sb.append(obj2);
        if (obj2.equals(r2.A00)) {
            str2 = "]";
        } else {
            str2 = ")";
        }
        sb.append(str2);
        return sb.toString();
    }

    public C2611148h(2Ed r1, Object obj, Object obj2) {
        this.A00 = r1;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final C2611148h A00(C2611148h r7) {
        if (r7.A01()) {
            return this;
        }
        if (A01()) {
            return r7;
        }
        2Ed r5 = this.A00;
        Object obj = this.A02;
        Object obj2 = r7.A02;
        Comparator comparator = r5.A02;
        0qQ.A0B(comparator, 2);
        if (obj == null || (obj2 != null && comparator.compare(obj, obj2) > 0)) {
            obj = obj2;
        }
        Object obj3 = this.A01;
        Object obj4 = r7.A01;
        if (obj3 == null || (obj4 != null && comparator.compare(obj3, obj4) < 0)) {
            obj3 = obj4;
        }
        return new C2611148h(r5, obj, obj3);
    }
}
