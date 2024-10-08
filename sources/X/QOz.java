package X;

import com.facebook.privacy.zone.policy.ZonePolicy;

public final class QOz extends AnonymousClass0T0 {
    public static final QOz A02 = new QOz(ZonePolicy.A05, "UNKNOWN");
    public final ZonePolicy A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QOz) {
                QOz qOz = (QOz) obj;
                if (this.A00 != qOz.A00 || !0qQ.A0K(this.A01, qOz.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public QOz(ZonePolicy zonePolicy, String str) {
        this.A00 = zonePolicy;
        this.A01 = str;
    }
}
