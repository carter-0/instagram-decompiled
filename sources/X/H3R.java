package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.media.EffectPreviewIntf;

public final class H3R extends C57088IOc {
    public final ImageUrl A00;
    public final EffectPreviewIntf A01;
    public final 1Xj A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3R) {
                H3R h3r = (H3R) obj;
                if (!0qQ.A0K(this.A03, h3r.A03) || !0qQ.A0K(this.A04, h3r.A04) || !0qQ.A0K(this.A05, h3r.A05) || !0qQ.A0K(this.A06, h3r.A06) || !0qQ.A0K(this.A00, h3r.A00) || this.A07 != h3r.A07 || !0qQ.A0K(this.A01, h3r.A01) || !0qQ.A0K(this.A02, h3r.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A04, AnonymousClass7TE.A0O(this.A03))))))));
    }

    public H3R(ImageUrl imageUrl, EffectPreviewIntf effectPreviewIntf, 1Xj r3, String str, String str2, String str3, String str4, boolean z) {
        AnonymousClass7TG.A1O(str, str2);
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A00 = imageUrl;
        this.A07 = z;
        this.A01 = effectPreviewIntf;
        this.A02 = r3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Effect(id=");
        C57088IOc.A01(A1A, this.A03);
        C57088IOc.A03(A1A, this.A04);
        C57088IOc.A02(A1A, this.A05);
        G9w.A1T(A1A, this.A06);
        A1A.append(this.A00);
        A1A.append(", isChecked=");
        A1A.append(this.A07);
        A1A.append(", config=");
        A1A.append(this.A01);
        A1A.append(", media=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
