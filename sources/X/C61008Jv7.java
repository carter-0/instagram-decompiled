package X;

import com.instagram.api.schemas.TextPostAppAYSFButton;
import com.instagram.api.schemas.TextPostAppAYSFStyle;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Jv7  reason: case insensitive filesystem */
public final class C61008Jv7 extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    public C61008Jv7(N4D n4d, TextPostAppAYSFButton textPostAppAYSFButton, TextPostAppAYSFStyle textPostAppAYSFStyle, String str, String str2, int i) {
        AnonymousClass7TG.A1S(textPostAppAYSFStyle, n4d);
        this.A02 = textPostAppAYSFButton;
        this.A05 = str;
        this.A06 = str2;
        this.A01 = i;
        this.A03 = textPostAppAYSFStyle;
        this.A04 = n4d;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C61008Jv7)) {
                return false;
            }
            C61008Jv7 jv7 = (C61008Jv7) obj;
            if (jv7.A00 != 1 || this.A04 != jv7.A04 || !0qQ.A0K(this.A03, jv7.A03) || !0qQ.A0K(this.A02, jv7.A02) || !0qQ.A0K(this.A06, jv7.A06) || !0qQ.A0K(this.A05, jv7.A05) || this.A01 != jv7.A01) {
                return false;
            }
            return true;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C61008Jv7)) {
                return false;
            }
            C61008Jv7 jv72 = (C61008Jv7) obj;
            if (jv72.A00 == 0 && this.A02 == jv72.A02 && 0qQ.A0K(this.A05, jv72.A05) && 0qQ.A0K(this.A06, jv72.A06) && this.A01 == jv72.A01 && this.A03 == jv72.A03 && 0qQ.A0K(this.A04, jv72.A04)) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int A07;
        int hashCode;
        if (this.A00 != 0) {
            A07 = (((AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A04))) + AnonymousClass7TG.A0E(this.A06)) * 31) + C41845B3m.A00(this.A05)) * 31;
            hashCode = this.A01;
        } else {
            A07 = AnonymousClass7TF.A07(this.A03, ((((((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + C41845B3m.A00(this.A06)) * 31) + this.A01) * 31);
            hashCode = this.A04.hashCode();
        }
        return A07 + hashCode;
    }

    public C61008Jv7(AnonymousClass5FV r2, ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, int i) {
        this.A04 = r2;
        this.A03 = imageUrl;
        this.A02 = imageUrl2;
        this.A06 = str;
        this.A05 = str2;
        this.A01 = i;
    }
}
