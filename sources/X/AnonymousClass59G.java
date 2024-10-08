package X;

import java.io.Serializable;

/* renamed from: X.59G  reason: invalid class name */
public final class AnonymousClass59G implements Serializable {
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass59G) {
                AnonymousClass59G r5 = (AnonymousClass59G) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.A00;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.A01;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.A02;
        if (obj3 != null) {
            i = obj3.hashCode();
        }
        return hashCode2 + i;
    }

    public final Object A00() {
        return this.A00;
    }

    public final Object A01() {
        return this.A01;
    }

    public final Object A02() {
        return this.A02;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.A00);
        sb.append(", ");
        sb.append(this.A01);
        sb.append(", ");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass59G(Object obj, Object obj2, Object obj3) {
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }
}
