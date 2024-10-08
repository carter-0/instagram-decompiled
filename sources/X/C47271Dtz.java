package X;

import java.util.Locale;

/* renamed from: X.Dtz  reason: case insensitive filesystem */
public final class C47271Dtz extends AnonymousClass0T0 implements Comparable {
    public final int A00;
    public final int A01;
    public final String A02;
    public final Locale A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47271Dtz) {
                C47271Dtz dtz = (C47271Dtz) obj;
                if (!0qQ.A0K(this.A02, dtz.A02) || this.A01 != dtz.A01 || this.A00 != dtz.A00 || !0qQ.A0K(this.A03, dtz.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C47271Dtz dtz = (C47271Dtz) obj;
        0qQ.A0B(dtz, 0);
        return this.A02.compareTo(dtz.A02);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A03, (((AnonymousClass7TE.A0O(this.A02) + this.A01) * 31) + this.A00) * 31);
    }

    public C47271Dtz(String str, Locale locale, int i, int i2) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = locale;
    }
}
