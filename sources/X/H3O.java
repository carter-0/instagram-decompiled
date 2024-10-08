package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

public final class H3O extends C57088IOc {
    public final Drawable A00;
    public final ImageUrl A01;
    public final 1Xj A02;
    public final String A03;
    public final String A04;
    public final String A05 = "";
    public final String A06 = "";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3O) {
                H3O h3o = (H3O) obj;
                if (!0qQ.A0K(this.A03, h3o.A03) || !0qQ.A0K(this.A04, h3o.A04) || !0qQ.A0K(this.A05, h3o.A05) || !0qQ.A0K(this.A06, h3o.A06) || !0qQ.A0K(this.A01, h3o.A01) || !0qQ.A0K(this.A00, h3o.A00) || !0qQ.A0K(this.A02, h3o.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ H3O(Drawable drawable, 1Xj r4, String str, String str2) {
        SimpleImageUrl A0V = DbS.A0V("");
        this.A03 = str;
        this.A04 = str2;
        this.A01 = A0V;
        this.A00 = drawable;
        this.A02 = r4;
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A04, AnonymousClass7TE.A0O(this.A03))));
        return AnonymousClass7TE.A0N(this.A02, ((C51975G9x.A05(this.A01, A08) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MetaQuestLabel(id=");
        C57088IOc.A01(A1A, this.A03);
        C57088IOc.A03(A1A, this.A04);
        C57088IOc.A02(A1A, this.A05);
        G9w.A1T(A1A, this.A06);
        C57088IOc.A00(A1A, this.A01);
        A1A.append(", imageDrawable=");
        A1A.append(this.A00);
        A1A.append(", media=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
