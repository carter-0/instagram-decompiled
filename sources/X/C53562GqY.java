package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.GqY  reason: case insensitive filesystem */
public final class C53562GqY extends AnonymousClass0T0 implements YBO {
    public final Medium A00;
    public final ImageUrl A01;
    public final String A02;
    public final boolean A03;

    public C53562GqY(Medium medium, ImageUrl imageUrl, String str, boolean z) {
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A00 = medium;
        this.A01 = imageUrl;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53562GqY) {
                C53562GqY gqY = (C53562GqY) obj;
                if (!0qQ.A0K(this.A02, gqY.A02) || !0qQ.A0K(this.A00, gqY.A00) || !0qQ.A0K(this.A01, gqY.A01) || this.A03 != gqY.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A02);
        return DbS.A06(this.A03, (AnonymousClass7TF.A07(this.A00, A0O) + AnonymousClass7TG.A0C(this.A01)) * 31);
    }
}
