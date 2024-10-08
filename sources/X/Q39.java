package X;

import java.util.Map;

public final class Q39 {
    public final long A00;
    public final Q3K A01;
    public final String A02;
    public final Map A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Q39) {
                Q39 q39 = (Q39) obj;
                if (!0qQ.A0K(this.A02, q39.A02) || !0qQ.A0K(this.A03, q39.A03) || this.A00 != q39.A00 || this.A01 != q39.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, C51972G9s.A07(this.A00, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0O(this.A02))));
    }

    public Q39(Q3K q3k, String str, Map map, long j) {
        this.A02 = str;
        this.A03 = map;
        this.A00 = j;
        this.A01 = q3k;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ComponentQueryStoreRequest(appId=");
        A1A.append(this.A02);
        A1A.append(", params=");
        A1A.append(this.A03);
        A1A.append(", cacheTtlSeconds=");
        A1A.append(this.A00);
        A1A.append(", queryPurpose=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
