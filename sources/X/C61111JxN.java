package X;

import com.instagram.api.schemas.AudioBrowserPlaylistType;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.JxN  reason: case insensitive filesystem */
public final class C61111JxN extends AnonymousClass0T0 implements C66566MWu {
    public final AudioBrowserPlaylistType A00;
    public final ImageUrl A01;
    public final ImageUrl A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public C61111JxN(AudioBrowserPlaylistType audioBrowserPlaylistType, ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, String str3, String str4, List list) {
        AnonymousClass7TF.A1F(str2, 4, str4);
        this.A03 = str;
        this.A01 = imageUrl;
        this.A02 = imageUrl2;
        this.A04 = str2;
        this.A00 = audioBrowserPlaylistType;
        this.A07 = list;
        this.A05 = str3;
        this.A06 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61111JxN) {
                C61111JxN jxN = (C61111JxN) obj;
                if (!0qQ.A0K(this.A03, jxN.A03) || !0qQ.A0K(this.A01, jxN.A01) || !0qQ.A0K(this.A02, jxN.A02) || !0qQ.A0K(this.A04, jxN.A04) || this.A00 != jxN.A00 || !0qQ.A0K(this.A07, jxN.A07) || !0qQ.A0K(this.A05, jxN.A05) || !0qQ.A0K(this.A06, jxN.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Aab() {
        return this.A03;
    }

    public final ImageUrl BEO() {
        return this.A02;
    }

    public final AudioBrowserPlaylistType BdL() {
        return this.A00;
    }

    public final List Bf2() {
        return this.A07;
    }

    public final String getId() {
        return this.A04;
    }

    public final String getSubtitle() {
        return this.A05;
    }

    public final String getTitle() {
        return this.A06;
    }

    public final int hashCode() {
        String str = this.A04;
        return C41845B3m.A01(this.A06, (((((AnonymousClass7TF.A08(str, ((((AnonymousClass7TG.A0E(this.A03) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + C41845B3m.A00(this.A05)) * 31);
    }

    public final C66566MWu E7u(1E9 r1) {
        return this;
    }
}
