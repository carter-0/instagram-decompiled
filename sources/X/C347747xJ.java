package X;

import java.util.List;

/* renamed from: X.7xJ  reason: invalid class name and case insensitive filesystem */
public final class C347747xJ {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C347747xJ) {
                C347747xJ r5 = (C347747xJ) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SourceAndDestinationConfig(sources=");
        sb.append(this.A01);
        sb.append(", destinations=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C347747xJ(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
