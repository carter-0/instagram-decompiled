package X;

public final class Q3G extends C9108RPf {
    public final Object A00;
    public final String A01;

    public Q3G(String str, Object obj) {
        0qQ.A0B(str, 1);
        0qQ.A0B(obj, 2);
        this.A01 = str;
        this.A00 = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Q3G) {
                Q3G q3g = (Q3G) obj;
                if (!0qQ.A0K(this.A01, q3g.A01) || !0qQ.A0K(this.A00, q3g.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SnapshotUpdate(dataModuleType=");
        A1A.append(this.A01);
        A1A.append(", snapshot=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
