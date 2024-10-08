package X;

import com.instagram.api.schemas.OverlayAdsTextStyleEnum;

/* renamed from: X.BFh  reason: case insensitive filesystem */
public final class C42054BFh extends AnonymousClass0T0 implements C46254DSj {
    public final OverlayAdsTextStyleEnum A00;
    public final Integer A01;
    public final String A02;

    public final C42054BFh F7M() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42054BFh) {
                C42054BFh bFh = (C42054BFh) obj;
                if (!0qQ.A0K(this.A02, bFh.A02) || !0qQ.A0K(this.A01, bFh.A01) || this.A00 != bFh.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer Bwe() {
        return this.A01;
    }

    public final OverlayAdsTextStyleEnum C24() {
        return this.A00;
    }

    public final String getColor() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C42054BFh(OverlayAdsTextStyleEnum overlayAdsTextStyleEnum, Integer num, String str) {
        this.A02 = str;
        this.A01 = num;
        this.A00 = overlayAdsTextStyleEnum;
    }
}
