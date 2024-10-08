package X;

import java.util.Map;

/* renamed from: X.KPu  reason: case insensitive filesystem */
public final class C61881KPu extends C62791KmT {
    public final Map A00;

    public C61881KPu(Map map) {
        0qQ.A0B(map, 1);
        this.A00 = map;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C61881KPu) && 0qQ.A0K(this.A00, ((C61881KPu) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
