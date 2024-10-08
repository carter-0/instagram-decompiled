package X;

import com.instagram.api.schemas.AdsAPIInstagramPosition;

/* renamed from: X.Gmc  reason: case insensitive filesystem */
public final class C53352Gmc extends AnonymousClass0T0 {
    public static final String A02;
    public static final String A03;
    public final AdsAPIInstagramPosition A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53352Gmc) {
                C53352Gmc gmc = (C53352Gmc) obj;
                if (this.A00 != gmc.A00 || !0qQ.A0K(this.A01, gmc.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    static {
        String name = C53352Gmc.class.getName();
        A03 = 002.A0R(name, "_instagramPosition");
        A02 = 002.A0R(name, "_callToAction");
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0E(this.A01);
    }

    public C53352Gmc(AdsAPIInstagramPosition adsAPIInstagramPosition, String str) {
        this.A00 = adsAPIInstagramPosition;
        this.A01 = str;
    }
}
