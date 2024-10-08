package X;

/* renamed from: X.5ep  reason: invalid class name and case insensitive filesystem */
public final class C290145ep {
    public final String A00;
    public final AnonymousClass0eL A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C290145ep) {
                C290145ep r5 = (C290145ep) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        String str = this.A00;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        AnonymousClass0eL r0 = this.A01;
        if (r0 != null) {
            i2 = r0.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccessibilityAction(label=");
        sb.append(this.A00);
        sb.append(", action=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C290145ep(String str, AnonymousClass0eL r2) {
        this.A00 = str;
        this.A01 = r2;
    }
}
