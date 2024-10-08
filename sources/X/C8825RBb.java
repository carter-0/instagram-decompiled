package X;

import java.util.List;

/* renamed from: X.RBb  reason: case insensitive filesystem */
public final class C8825RBb extends 2UH {
    public int A00 = 0;
    public long A01 = 0;

    public final int A00() {
        return 5;
    }

    public final String A01() {
        return "crash";
    }

    public final void A02(StringBuilder sb) {
        0qQ.A0B(sb, 0);
        sb.append(this.A00);
        sb.append("|");
        sb.append(this.A01);
    }

    public final void A03(List list) {
        0qQ.A0B(list, 0);
        this.A00 = Integer.parseInt(AnonymousClass7TE.A19(list, 0));
        this.A01 = Pxg.A0J(list, 1);
    }

    public final boolean A04(1Jp r2) {
        return false;
    }

    public final String toString() {
        String str;
        int i = this.A00;
        if (i == 0) {
            str = "app crashed";
        } else if (i != 1) {
            str = "unknown reliability issue";
        } else {
            str = "app ANR";
        }
        return 002.A0s(str, " after ", "ms", this.A01);
    }
}
