package X;

import com.instagram.api.schemas.IntentAwareAdsInfo;

public final class XM9 extends AnonymousClass0T0 {
    public final IntentAwareAdsInfo A00;
    public final XMA A01;

    public XM9(IntentAwareAdsInfo intentAwareAdsInfo, XMA xma) {
        0qQ.A0B(intentAwareAdsInfo, 1);
        this.A00 = intentAwareAdsInfo;
        this.A01 = xma;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof XM9) {
                XM9 xm9 = (XM9) obj;
                if (!0qQ.A0K(this.A00, xm9.A00) || !0qQ.A0K(this.A01, xm9.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + AnonymousClass7TG.A0C(this.A01);
    }
}
