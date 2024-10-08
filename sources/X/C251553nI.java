package X;

import java.util.Map;

/* renamed from: X.3nI  reason: invalid class name and case insensitive filesystem */
public final class C251553nI extends 2UD {
    public final int A00;

    public final int A00() {
        return 10;
    }

    public final String A03() {
        return "volume_up";
    }

    public final void A05(StringBuilder sb) {
        0qQ.A0B(sb, 0);
        sb.append(this.A00);
    }

    public final String A02() {
        int i = this.A00;
        if (i == 1) {
            return "user tapped volume up button";
        }
        return 002.A0c("user pressed on volume up button and triggered it ", " times", i);
    }

    public final Map A04() {
        return 0se.A0M(new 0eP("count", Integer.valueOf(this.A00)));
    }

    public C251553nI(long j, String str, int i) {
        super(j, str);
        this.A00 = i;
    }
}
