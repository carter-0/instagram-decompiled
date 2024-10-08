package X;

import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.ClipsMidCardType;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.api.schemas.MidCardLayoutType;

/* renamed from: X.Gok  reason: case insensitive filesystem */
public final class C53452Gok extends AnonymousClass0T0 implements C46242DRx {
    public final int A00;
    public final int A01;
    public final int A02;
    public final ClipsMidCardSubtype A03;
    public final ClipsMidCardType A04;
    public final InstagramMidcardType A05;
    public final C53449Goh A06;
    public final MidCardLayoutType A07;
    public final C53453Gol A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public C53452Gok(ClipsMidCardSubtype clipsMidCardSubtype, ClipsMidCardType clipsMidCardType, InstagramMidcardType instagramMidcardType, C53449Goh goh, MidCardLayoutType midCardLayoutType, C53453Gol gol, String str, String str2, String str3, int i, int i2, int i3) {
        C51973G9u.A0r(3, goh, str2, midCardLayoutType);
        0qQ.A0B(instagramMidcardType, 11);
        this.A0A = str;
        this.A00 = i;
        this.A06 = goh;
        this.A09 = str2;
        this.A07 = midCardLayoutType;
        this.A08 = gol;
        this.A03 = clipsMidCardSubtype;
        this.A04 = clipsMidCardType;
        this.A0B = str3;
        this.A01 = i2;
        this.A05 = instagramMidcardType;
        this.A02 = i3;
    }

    public final C46242DRx E7f(1E9 r1) {
        return this;
    }

    public final C53452Gok F6L(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53452Gok) {
                C53452Gok gok = (C53452Gok) obj;
                if (!(0qQ.A0K(this.A0A, gok.A0A) && this.A00 == gok.A00 && 0qQ.A0K(this.A06, gok.A06) && 0qQ.A0K(this.A09, gok.A09) && this.A07 == gok.A07 && 0qQ.A0K(this.A08, gok.A08) && this.A03 == gok.A03 && this.A04 == gok.A04 && 0qQ.A0K(this.A0B, gok.A0B) && this.A01 == gok.A01 && this.A05 == gok.A05 && this.A02 == gok.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A09, AnonymousClass7TF.A07(this.A06, ((AnonymousClass7TG.A0E(this.A0A) * 31) + this.A00) * 31));
        return AnonymousClass7TF.A07(this.A05, (((((((((AnonymousClass7TF.A07(this.A07, A082) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + C41845B3m.A00(this.A0B)) * 31) + this.A01) * 31) + this.A02;
    }
}
