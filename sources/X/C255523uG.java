package X;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.3uG  reason: invalid class name and case insensitive filesystem */
public final class C255523uG implements SerialDescriptor {
    public final String A00;
    public final C255503uE A01;

    public final int B0a() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C255523uG) {
                C255523uG r5 = (C255523uG) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List B0P(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final SerialDescriptor B0R(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int B0T(String str) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String B0V(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final /* bridge */ /* synthetic */ C255513uF BKK() {
        return this.A01;
    }

    public final String BsV() {
        return this.A00;
    }

    public final boolean CRn(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final boolean CYM() {
        return false;
    }

    public final List getAnnotations() {
        return 0sn.A00;
    }

    public final int hashCode() {
        return this.A00.hashCode() + (this.A01.hashCode() * 31);
    }

    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return 002.A0S("PrimitiveDescriptor(", this.A00, ')');
    }

    public C255523uG(String str, C255503uE r2) {
        this.A00 = str;
        this.A01 = r2;
    }
}
