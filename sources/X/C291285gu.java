package X;

/* renamed from: X.5gu  reason: invalid class name and case insensitive filesystem */
public final class C291285gu {
    public final String A00;
    public final 2HY A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C291285gu) {
                C291285gu r5 = (C291285gu) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
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
        sb.append("MatchGroup(value=");
        sb.append(this.A00);
        sb.append(", range=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C291285gu(String str, 2HY r2) {
        this.A00 = str;
        this.A01 = r2;
    }
}
