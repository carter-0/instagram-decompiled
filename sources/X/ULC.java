package X;

import com.instagram.discovery.filters.analytics.FiltersLoggingInfo;

public final class ULC extends AnonymousClass0T0 {
    public final C376699Iz A00;
    public final FiltersLoggingInfo A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ULC) {
                ULC ulc = (ULC) obj;
                if (!0qQ.A0K(this.A04, ulc.A04) || !0qQ.A0K(this.A01, ulc.A01) || !0qQ.A0K(this.A03, ulc.A03) || !0qQ.A0K(this.A00, ulc.A00) || !0qQ.A0K(this.A02, ulc.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((AnonymousClass7TG.A0E(this.A04) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31 * 31 * 31 * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0C((Object) null)) * 31;
    }

    public ULC(C376699Iz r1, FiltersLoggingInfo filtersLoggingInfo, String str, String str2, String str3) {
        this.A04 = str;
        this.A01 = filtersLoggingInfo;
        this.A03 = str2;
        this.A00 = r1;
        this.A02 = str3;
    }

    public ULC() {
        this((C376699Iz) null, (FiltersLoggingInfo) null, (String) null, (String) null, (String) null);
    }
}
