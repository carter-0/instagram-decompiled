package X;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.Wrg  reason: case insensitive filesystem */
public final class C20438Wrg implements SerialDescriptor {
    public final String A00;
    public final C62230ry A01;
    public final SerialDescriptor A02;

    public final List B0P(int i) {
        return this.A02.B0P(i);
    }

    public final SerialDescriptor B0R(int i) {
        return this.A02.B0R(i);
    }

    public final int B0T(String str) {
        0qQ.A0B(str, 0);
        return this.A02.B0T(str);
    }

    public final String B0V(int i) {
        return this.A02.B0V(i);
    }

    public final int B0a() {
        return this.A02.B0a();
    }

    public final C255513uF BKK() {
        return this.A02.BKK();
    }

    public final boolean CRn(int i) {
        return this.A02.CRn(i);
    }

    public final boolean CYM() {
        return this.A02.CYM();
    }

    public final List getAnnotations() {
        return this.A02.getAnnotations();
    }

    public final boolean isInline() {
        return this.A02.isInline();
    }

    public final String BsV() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        C20438Wrg wrg;
        if (obj instanceof C20438Wrg) {
            wrg = (C20438Wrg) obj;
        } else {
            wrg = null;
        }
        if (wrg == null || !0qQ.A0K(this.A02, wrg.A02)) {
            return false;
        }
        return C51971G9r.A1Z(wrg.A01, this.A01, false);
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, this.A01.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContextDescriptor(kClass: ");
        sb.append(this.A01);
        sb.append(", original: ");
        return AnonymousClass7TG.A0n(this.A02, sb);
    }

    public C20438Wrg(C62230ry r3, SerialDescriptor serialDescriptor) {
        this.A02 = serialDescriptor;
        this.A01 = r3;
        StringBuilder sb = new StringBuilder();
        sb.append(serialDescriptor.BsV());
        sb.append('<');
        sb.append(0q1.A01(((0Yh) r3).A00));
        this.A00 = C51967G9n.A0r(sb, '>');
    }
}
