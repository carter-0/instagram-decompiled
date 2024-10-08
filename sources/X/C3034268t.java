package X;

import java.util.Map;

/* renamed from: X.68t  reason: invalid class name and case insensitive filesystem */
public final class C3034268t {
    public final Map A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C3034268t) && 0qQ.A0K(this.A00, ((C3034268t) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BloksFunctionTable(entries=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C3034268t(Map map) {
        this.A00 = map;
    }
}
