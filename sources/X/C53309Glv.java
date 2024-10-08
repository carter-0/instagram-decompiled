package X;

import android.graphics.Bitmap;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;

/* renamed from: X.Glv  reason: case insensitive filesystem */
public final class C53309Glv extends AnonymousClass0T0 {
    public final int A00;
    public final Bitmap A01;
    public final ImageUrl A02;
    public final Reel A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53309Glv) {
                C53309Glv glv = (C53309Glv) obj;
                if (!0qQ.A0K(this.A05, glv.A05) || !0qQ.A0K(this.A03, glv.A03) || !0qQ.A0K(this.A02, glv.A02) || this.A07 != glv.A07 || this.A08 != glv.A08 || !0qQ.A0K(this.A01, glv.A01) || !0qQ.A0K(this.A04, glv.A04) || this.A06 != glv.A06 || this.A00 != glv.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A05);
        int A09 = AnonymousClass7TF.A09(this.A07, (AnonymousClass7TF.A07(this.A03, A0O) + AnonymousClass7TG.A0C(this.A02)) * 31);
        return AnonymousClass7TF.A09(this.A06, (((AnonymousClass7TF.A09(this.A08, A09) + AnonymousClass7TG.A0C(this.A01)) * 31) + C41845B3m.A00(this.A04)) * 31) + this.A00;
    }

    public C53309Glv(Bitmap bitmap, ImageUrl imageUrl, Reel reel, String str, String str2, int i, boolean z, boolean z2, boolean z3) {
        this.A05 = str;
        this.A03 = reel;
        this.A02 = imageUrl;
        this.A07 = z;
        this.A08 = z2;
        this.A01 = bitmap;
        this.A04 = str2;
        this.A06 = z3;
        this.A00 = i;
    }
}
