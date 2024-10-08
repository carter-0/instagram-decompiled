package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

public final class H3M extends C57088IOc {
    public final Drawable A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05 = "";
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3M) {
                H3M h3m = (H3M) obj;
                if (!0qQ.A0K(this.A02, h3m.A02) || !0qQ.A0K(this.A03, h3m.A03) || !0qQ.A0K(this.A04, h3m.A04) || !0qQ.A0K(this.A05, h3m.A05) || !0qQ.A0K(this.A01, h3m.A01) || !0qQ.A0K(this.A00, h3m.A00) || this.A06 != h3m.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ H3M(Drawable drawable, String str, String str2, String str3, boolean z) {
        SimpleImageUrl A0V = DbS.A0V("");
        0qQ.A0B(str2, 2);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = A0V;
        this.A00 = drawable;
        this.A06 = z;
    }

    public final int hashCode() {
        int A012 = G9w.A01(AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A02)))));
        return DbS.A06(this.A06, (AnonymousClass7TF.A07(this.A01, A012) + AnonymousClass7TG.A0C(this.A00)) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AppMoreInfo(id=");
        C57088IOc.A01(A1A, this.A02);
        C57088IOc.A03(A1A, this.A03);
        C57088IOc.A02(A1A, this.A04);
        A1A.append(this.A05);
        C51975G9x.A1G(A1A, ", isChecked=");
        A1A.append(", imageUrl=");
        A1A.append(this.A01);
        A1A.append(", imageDrawable=");
        A1A.append(this.A00);
        A1A.append(", isRatingsReviews=");
        return G9t.A1C(A1A, this.A06);
    }
}
