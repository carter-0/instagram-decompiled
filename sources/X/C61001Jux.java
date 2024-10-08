package X;

import java.util.List;

/* renamed from: X.Jux  reason: case insensitive filesystem */
public final class C61001Jux extends AnonymousClass0T0 {
    public final List A00;

    public C61001Jux(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C61001Jux) && 0qQ.A0K(this.A00, ((C61001Jux) obj).A00));
    }

    public final int hashCode() {
        return (AnonymousClass7TE.A0K(this.A00) * 31) + C54732HQn.A00();
    }

    public C61001Jux() {
        this(0sn.A00);
    }
}
