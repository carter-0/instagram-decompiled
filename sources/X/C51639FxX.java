package X;

import java.util.StringTokenizer;

/* renamed from: X.FxX  reason: case insensitive filesystem */
public final class C51639FxX extends StringTokenizer {
    public int A00;
    public String A01;
    public final String A02;

    public C51639FxX(String str) {
        super(str, "<,>", true);
        this.A02 = str;
    }

    public final boolean hasMoreTokens() {
        if (this.A01 != null || super.hasMoreTokens()) {
            return true;
        }
        return false;
    }

    public final String nextToken() {
        String str = this.A01;
        if (str != null) {
            this.A01 = null;
            return str;
        }
        String nextToken = super.nextToken();
        this.A00 += nextToken.length();
        return nextToken.trim();
    }
}
