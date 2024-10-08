package X;

import java.util.Map;

/* renamed from: X.WqY  reason: case insensitive filesystem */
public final class C20392WqY implements Map.Entry, C62650uo {
    public final Object A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20392WqY) {
                C20392WqY wqY = (C20392WqY) obj;
                if (!0qQ.A0K(this.A00, wqY.A00) || !0qQ.A0K(this.A01, wqY.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Object getKey() {
        return this.A00;
    }

    public final Object getValue() {
        return this.A01;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MapEntry(key=");
        sb.append(this.A00);
        sb.append(", value=");
        return AnonymousClass7TG.A0n(this.A01, sb);
    }

    public C20392WqY(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final Object setValue(Object obj) {
        throw Pxh.A0s();
    }
}
