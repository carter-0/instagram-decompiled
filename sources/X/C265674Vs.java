package X;

import java.util.List;

/* renamed from: X.4Vs  reason: invalid class name and case insensitive filesystem */
public final class C265674Vs {
    public final List A00;

    public C265674Vs(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
            return false;
        }
        return 0qQ.A0K(this.A00, ((C265674Vs) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return 00k.A0P(", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", this.A00, (0sP) null);
    }
}
