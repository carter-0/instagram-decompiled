package X;

import java.util.Map;

/* renamed from: X.Q3u  reason: case insensitive filesystem */
public final class C7318Q3u {
    public final String A00;
    public final Map A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7318Q3u) {
                C7318Q3u q3u = (C7318Q3u) obj;
                if (!0qQ.A0K(this.A01, q3u.A01) || !0qQ.A0K(this.A02, q3u.A02) || !0qQ.A0K(this.A00, q3u.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A00);
    }

    public C7318Q3u(Map map, String str, String str2) {
        this.A01 = map;
        this.A02 = str;
        this.A00 = str2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("BloksComponentQueryParseResult(components=");
        A1A.append(this.A01);
        A1A.append(", generatedBundleId=");
        A1A.append(this.A02);
        A1A.append(", clientBundleId=");
        return C51975G9x.A0i(this.A00, A1A);
    }
}
