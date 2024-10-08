package X;

public final class F3c {
    public final String A00;
    public final String A01;

    public F3c(String str, String str2) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof F3c) {
                F3c f3c = (F3c) obj;
                if (!0qQ.A0K(this.A00, f3c.A00) || !0qQ.A0K(this.A01, f3c.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, (AnonymousClass7TE.A0O(this.A00) + ((int) (0 >>> 32))) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CdsAnalyticsConfig(analyticsName=");
        A1A.append(this.A00);
        A1A.append(", featureId=");
        A1A.append(0);
        A1A.append(", moduleClassNameOverride=");
        A1A.append(this.A01);
        return AnonymousClass7TG.A0p(A1A);
    }
}
