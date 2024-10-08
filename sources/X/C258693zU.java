package X;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.3zU  reason: invalid class name and case insensitive filesystem */
public abstract class C258693zU implements SerialDescriptor {
    public final String A00;
    public final SerialDescriptor A01;
    public final SerialDescriptor A02;

    public final SerialDescriptor B0R(int i) {
        if (i >= 0) {
            int i2 = i % 2;
            if (i2 == 0) {
                return this.A01;
            }
            if (i2 == 1) {
                return this.A02;
            }
            throw new IllegalStateException("Unreached");
        }
        throw new IllegalArgumentException(002.A08(i, "Illegal index ", ", ", this.A00, " expects only non-negative indices"));
    }

    public final int B0T(String str) {
        0qQ.A0B(str, 0);
        Integer A0l = 00y.A0l(str);
        if (A0l != null) {
            return A0l.intValue();
        }
        throw new IllegalArgumentException(002.A0R(str, " is not a valid map index"));
    }

    public final boolean CRn(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(002.A08(i, "Illegal index ", ", ", this.A00, " expects only non-negative indices"));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C258693zU) {
                C258693zU r5 = (C258693zU) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List B0P(int i) {
        if (i >= 0) {
            return 0sn.A00;
        }
        throw new IllegalArgumentException(002.A08(i, "Illegal index ", ", ", this.A00, " expects only non-negative indices"));
    }

    public final int B0a() {
        return 2;
    }

    public final C255513uF BKK() {
        return C2591240m.A00;
    }

    public final String BsV() {
        return this.A00;
    }

    public final boolean CYM() {
        return false;
    }

    public final List getAnnotations() {
        return 0sn.A00;
    }

    public final int hashCode() {
        return (((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode();
    }

    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append('(');
        sb.append(this.A01);
        sb.append(", ");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C258693zU(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.A00 = str;
        this.A01 = serialDescriptor;
        this.A02 = serialDescriptor2;
    }

    public final String B0V(int i) {
        return String.valueOf(i);
    }
}
