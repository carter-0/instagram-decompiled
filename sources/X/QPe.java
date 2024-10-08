package X;

import com.instagram.api.schemas.IntegrityInterstitialType;

public final class QPe extends AnonymousClass0T0 implements C13878Tiz {
    public final IntegrityInterstitialType A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QPe) {
                QPe qPe = (QPe) obj;
                if (!0qQ.A0K(this.A03, qPe.A03) || this.A00 != qPe.A00 || !0qQ.A0K(this.A01, qPe.A01) || !0qQ.A0K(this.A02, qPe.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A03) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02);
    }

    public QPe(IntegrityInterstitialType integrityInterstitialType, String str, String str2, String str3) {
        this.A03 = str;
        this.A00 = integrityInterstitialType;
        this.A01 = str2;
        this.A02 = str3;
    }
}
