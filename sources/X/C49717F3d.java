package X;

/* renamed from: X.F3d  reason: case insensitive filesystem */
public final class C49717F3d {
    public final Object A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C49717F3d) {
                C49717F3d f3d = (C49717F3d) obj;
                if (!0qQ.A0K(this.A01, f3d.A01) || !0qQ.A0K(this.A00, f3d.A00)) {
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

    public C49717F3d(String str, Object obj) {
        this.A01 = str;
        this.A00 = obj;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ScreenKey(name=");
        A1A.append(this.A01);
        A1A.append(", args=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
