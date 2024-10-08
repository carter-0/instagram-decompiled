package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.KbX  reason: case insensitive filesystem */
public final class C62175KbX extends C62876Knq {
    public final Drawable A00;
    public final ImageUrl A01;
    public final L7E A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62175KbX) {
                C62175KbX kbX = (C62175KbX) obj;
                if (!0qQ.A0K(this.A06, kbX.A06) || !0qQ.A0K(this.A05, kbX.A05) || !0qQ.A0K(this.A01, kbX.A01) || !0qQ.A0K(this.A03, kbX.A03) || !0qQ.A0K(this.A00, kbX.A00) || !0qQ.A0K(this.A02, kbX.A02) || !0qQ.A0K(this.A04, kbX.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A08(this.A05, AnonymousClass7TE.A0O(this.A06)));
        return C41845B3m.A01(this.A04, (((AnonymousClass7TF.A08(this.A03, A07) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A02)) * 31);
    }

    public C62175KbX(Drawable drawable, ImageUrl imageUrl, L7E l7e, String str, String str2, String str3, String str4) {
        C51974G9v.A1M(str2, imageUrl, str3);
        0qQ.A0B(str4, 7);
        this.A06 = str;
        this.A05 = str2;
        this.A01 = imageUrl;
        this.A03 = str3;
        this.A00 = drawable;
        this.A02 = l7e;
        this.A04 = str4;
    }
}
