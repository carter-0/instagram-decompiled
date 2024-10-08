package X;

/* renamed from: X.3Zr  reason: invalid class name and case insensitive filesystem */
public final class C243653Zr {
    public final AnonymousClass2Si A00;
    public final 2TB A01;

    public C243653Zr(AnonymousClass2Si r2, 2TB r3) {
        0qQ.A0B(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C243653Zr) {
                C243653Zr r5 = (C243653Zr) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        AnonymousClass2Si r0 = this.A00;
        return hashCode + (r0 == null ? 0 : r0.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ComponentState(value=");
        sb.append(this.A01);
        sb.append(", eventDispatchInfo=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
