package X;

import java.util.Map;

/* renamed from: X.6RJ  reason: invalid class name */
public final class AnonymousClass6RJ implements C307666Qz {
    public final Map A00;

    public final C7315Q3r EzP(String str) {
        return (C7315Q3r) this.A00.get(str);
    }

    public final boolean equals(Object obj) {
        Map map = this.A00;
        if (!(obj instanceof AnonymousClass6RJ) || !0qQ.A0K(map, ((AnonymousClass6RJ) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        Map map = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append("Snapshot(snapshot=");
        sb.append(map);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ AnonymousClass6RJ(Map map) {
        this.A00 = map;
    }
}
