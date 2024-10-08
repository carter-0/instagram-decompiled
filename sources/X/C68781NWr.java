package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.NWr  reason: case insensitive filesystem */
public final class C68781NWr extends C69600Noi {
    public final ImageUrl A00;
    public final ImageUrl A01;
    public final DirectShareTarget A02;
    public final C254743sy A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68781NWr) {
                C68781NWr nWr = (C68781NWr) obj;
                if (!0qQ.A0K(this.A03, nWr.A03) || !0qQ.A0K(this.A02, nWr.A02) || this.A04 != nWr.A04 || !0qQ.A0K(this.A00, nWr.A00) || !0qQ.A0K(this.A01, nWr.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A03))) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C68781NWr(ImageUrl imageUrl, ImageUrl imageUrl2, DirectShareTarget directShareTarget, C254743sy r4, boolean z) {
        this.A03 = r4;
        this.A02 = directShareTarget;
        this.A04 = z;
        this.A00 = imageUrl;
        this.A01 = imageUrl2;
    }
}
