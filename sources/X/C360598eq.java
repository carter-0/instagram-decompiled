package X;

import java.util.List;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.8eq  reason: invalid class name and case insensitive filesystem */
public final class C360598eq implements SerialDescriptor, C255553uK {
    public final SerialDescriptor A00;
    public final String A01;
    public final Set A02;

    public C360598eq(SerialDescriptor serialDescriptor) {
        0qQ.A0B(serialDescriptor, 1);
        this.A00 = serialDescriptor;
        this.A01 = 002.A0C(serialDescriptor.BsV(), '?');
        this.A02 = C360608er.A00(serialDescriptor);
    }

    public final List B0P(int i) {
        return this.A00.B0P(i);
    }

    public final SerialDescriptor B0R(int i) {
        return this.A00.B0R(i);
    }

    public final int B0T(String str) {
        0qQ.A0B(str, 0);
        return this.A00.B0T(str);
    }

    public final String B0V(int i) {
        return this.A00.B0V(i);
    }

    public final int B0a() {
        return this.A00.B0a();
    }

    public final C255513uF BKK() {
        return this.A00.BKK();
    }

    public final boolean CRn(int i) {
        return this.A00.CRn(i);
    }

    public final boolean CYM() {
        return true;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C360598eq) && 0qQ.A0K(this.A00, ((C360598eq) obj).A00));
    }

    public final List getAnnotations() {
        return this.A00.getAnnotations();
    }

    public final boolean isInline() {
        return this.A00.isInline();
    }

    public final String BsV() {
        return this.A01;
    }

    public final Set BsW() {
        return this.A02;
    }

    public final int hashCode() {
        return this.A00.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append('?');
        return sb.toString();
    }
}
