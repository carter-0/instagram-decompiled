package X;

import java.util.Map;

/* renamed from: X.5V0  reason: invalid class name */
public final class AnonymousClass5V0 {
    public int[] A00 = AnonymousClass5V1.A00;
    public Object[] A01 = AnonymousClass5V1.A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            try {
                return (obj instanceof AnonymousClass5V0) || ((obj instanceof Map) && 0 == ((Map) obj).size());
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }
}
