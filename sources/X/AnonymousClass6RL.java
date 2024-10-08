package X;

import java.util.Map;

/* renamed from: X.6RL  reason: invalid class name */
public final class AnonymousClass6RL {
    public final Map A00;

    public AnonymousClass6RL(Map map) {
        0qQ.A0B(map, 1);
        this.A00 = map;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6RL) && 0qQ.A0K(this.A00, ((AnonymousClass6RL) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Snapshot(memorySnapshot=");
        Map map = this.A00;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Snapshot(snapshot=");
        sb2.append(map);
        sb2.append(')');
        sb.append(sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
