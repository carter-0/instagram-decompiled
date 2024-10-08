package X;

/* renamed from: X.6Eq  reason: invalid class name and case insensitive filesystem */
public final class C304646Eq {
    public final String A00;
    public final C62320sa A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C304646Eq) {
                C304646Eq r5 = (C304646Eq) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomAccessibilityAction(label=");
        sb.append(this.A00);
        sb.append(", action=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C304646Eq(String str, C62320sa r2) {
        this.A00 = str;
        this.A01 = r2;
    }
}
