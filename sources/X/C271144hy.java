package X;

import java.util.List;

/* renamed from: X.4hy  reason: invalid class name and case insensitive filesystem */
public final class C271144hy extends 2UH {
    public String A00 = "";

    public final int A00() {
        return 6;
    }

    public final String A01() {
        return "error_message";
    }

    public final void A02(StringBuilder sb) {
        0qQ.A0B(sb, 0);
        sb.append(this.A00);
    }

    public final void A03(List list) {
        0qQ.A0B(list, 0);
        this.A00 = (String) list.get(0);
    }

    public final boolean A04(1Jp r2) {
        return false;
    }

    public final String toString() {
        return 002.A0S("show error message(", this.A00, ')');
    }
}
