package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Dta  reason: case insensitive filesystem */
public final class C47249Dta extends AnonymousClass0T0 implements C232262tL {
    public final ImageUrl A00;
    public final C16648Uyk A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47249Dta) {
                C47249Dta dta = (C47249Dta) obj;
                if (!0qQ.A0K(this.A00, dta.A00) || !0qQ.A0K(this.A02, dta.A02) || this.A01 != dta.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        String url = this.A00.getUrl();
        0qQ.A07(url);
        return url;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C47249Dta dta = (C47249Dta) obj;
        0qQ.A0B(dta, 0);
        String url = this.A00.getUrl();
        0qQ.A07(url);
        String url2 = dta.A00.getUrl();
        0qQ.A07(url2);
        return url.equals(url2);
    }

    public C47249Dta(ImageUrl imageUrl, C16648Uyk uyk, String str) {
        this.A00 = imageUrl;
        this.A02 = str;
        this.A01 = uyk;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FanClubConsiderationTeaserViewModel(imageUrl=");
        A1A.append(this.A00);
        A1A.append(", mediaId=");
        A1A.append(this.A02);
        A1A.append(C66579MXk.A00(48));
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
