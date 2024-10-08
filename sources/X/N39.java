package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;

public final class N39 extends AnonymousClass0T0 {
    public final int A00;
    public final ImageUrl A01;
    public final DirectThreadAnalyticsParams A02;
    public final PrivacyMediaOverlayViewModel A03;
    public final 1Xj A04;
    public final 1iA A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N39) {
                N39 n39 = (N39) obj;
                if (!0qQ.A0K(this.A06, n39.A06) || !0qQ.A0K(this.A04, n39.A04) || this.A05 != n39.A05 || this.A07 != n39.A07 || !0qQ.A0K(this.A01, n39.A01) || this.A00 != n39.A00 || !0qQ.A0K(this.A03, n39.A03) || this.A08 != n39.A08 || !0qQ.A0K(this.A02, n39.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A07;
        return AnonymousClass7TF.A09(this.A08, (((((AnonymousClass7TF.A09(z, ((((AnonymousClass7TG.A0E(this.A06) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public N39(ImageUrl imageUrl, DirectThreadAnalyticsParams directThreadAnalyticsParams, PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel, 1Xj r4, 1iA r5, String str, int i, boolean z, boolean z2) {
        this.A06 = str;
        this.A04 = r4;
        this.A05 = r5;
        this.A07 = z;
        this.A01 = imageUrl;
        this.A00 = i;
        this.A03 = privacyMediaOverlayViewModel;
        this.A08 = z2;
        this.A02 = directThreadAnalyticsParams;
    }
}
