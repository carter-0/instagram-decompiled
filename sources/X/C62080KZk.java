package X;

import java.util.List;

/* renamed from: X.KZk  reason: case insensitive filesystem */
public final class C62080KZk extends C62862Knc {
    public final List A00;

    public C62080KZk(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C62080KZk) && 0qQ.A0K(this.A00, ((C62080KZk) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C62080KZk() {
        this(0sn.A00);
    }
}
