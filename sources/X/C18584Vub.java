package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.Vub  reason: case insensitive filesystem */
public final class C18584Vub {
    public String A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    static {
        TimeUnit.SECONDS.toSeconds(2147483647L);
    }

    public final String toString() {
        String str = this.A00;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.A09) {
                sb.append("no-cache, ");
            }
            if (this.A0A) {
                sb.append("no-store, ");
            }
            int i = this.A01;
            if (i != -1) {
                C13988Tno.A1Q("max-age=", ", ", sb, i);
            }
            int i2 = this.A04;
            if (i2 != -1) {
                C13988Tno.A1Q("s-maxage=", ", ", sb, i2);
            }
            if (this.A06) {
                sb.append("private, ");
            }
            if (this.A07) {
                sb.append("public, ");
            }
            if (this.A08) {
                sb.append("must-revalidate, ");
            }
            int i3 = this.A02;
            if (i3 != -1) {
                C13988Tno.A1Q("max-stale=", ", ", sb, i3);
            }
            int i4 = this.A03;
            if (i4 != -1) {
                C13988Tno.A1Q("min-fresh=", ", ", sb, i4);
            }
            if (this.A0C) {
                sb.append("only-if-cached, ");
            }
            if (this.A0B) {
                sb.append("no-transform, ");
            }
            if (this.A05) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                str = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                str = sb.toString();
            }
            this.A00 = str;
        }
        return str;
    }

    public C18584Vub(String str, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A09 = z;
        this.A0A = z2;
        this.A01 = i;
        this.A04 = i2;
        this.A06 = z3;
        this.A07 = z4;
        this.A08 = z5;
        this.A02 = i3;
        this.A03 = i4;
        this.A0C = z6;
        this.A0B = z7;
        this.A05 = z8;
        this.A00 = str;
    }
}
