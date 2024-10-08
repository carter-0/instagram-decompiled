package X;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.40D  reason: invalid class name */
public abstract class AnonymousClass40D implements SerialDescriptor {
    public final SerialDescriptor A00;

    public final int B0T(String str) {
        0qQ.A0B(str, 0);
        Integer A0l = 00y.A0l(str);
        if (A0l != null) {
            return A0l.intValue();
        }
        throw new IllegalArgumentException(002.A0R(str, " is not a valid list index"));
    }

    public final boolean CRn(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(002.A08(i, "Illegal index ", ", ", BsV(), " expects only non-negative indices"));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass40D) {
                AnonymousClass40D r5 = (AnonymousClass40D) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(BsV(), r5.BsV())) {
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
        throw new IllegalArgumentException(002.A08(i, "Illegal index ", ", ", BsV(), " expects only non-negative indices"));
    }

    public final SerialDescriptor B0R(int i) {
        if (i >= 0) {
            return this.A00;
        }
        throw new IllegalArgumentException(002.A08(i, "Illegal index ", ", ", BsV(), " expects only non-negative indices"));
    }

    public final int B0a() {
        return 1;
    }

    public final C255513uF BKK() {
        return C2591140l.A00;
    }

    public final boolean CYM() {
        return false;
    }

    public final List getAnnotations() {
        return 0sn.A00;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + BsV().hashCode();
    }

    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BsV());
        sb.append('(');
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass40D(SerialDescriptor serialDescriptor) {
        this.A00 = serialDescriptor;
    }

    public final String B0V(int i) {
        return String.valueOf(i);
    }
}
