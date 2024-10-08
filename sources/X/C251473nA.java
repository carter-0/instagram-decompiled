package X;

import java.util.Map;

/* renamed from: X.3nA  reason: invalid class name and case insensitive filesystem */
public final class C251473nA extends 2UD {
    public final int A00;

    public final int A00() {
        return 9;
    }

    public final String A03() {
        return "volume_down";
    }

    public final void A05(StringBuilder sb) {
        0qQ.A0B(sb, 0);
        sb.append(this.A00);
    }

    public final String A02() {
        int i = this.A00;
        if (i == 1) {
            return "user tapped volume down button";
        }
        return 002.A0c("user pressed on volume down button and triggered it ", " times", i);
    }

    public final Map A04() {
        return 0se.A0M(new 0eP("count", Integer.valueOf(this.A00)));
    }

    public C251473nA(long j, String str, int i) {
        super(j, str);
        this.A00 = i;
    }
}
