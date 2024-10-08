package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;

/* renamed from: X.8hR  reason: invalid class name and case insensitive filesystem */
public final class C362158hR {
    public final UserSession A00;

    public final void A00(GalleryItem galleryItem, String str, String str2, int i, boolean z) {
        long j;
        long j2;
        long j3 = 0;
        27r A01 = 27p.A01(this.A00);
        GalleryItem galleryItem2 = galleryItem;
        boolean A06 = galleryItem2.A06();
        Medium medium = galleryItem2.A00;
        String str3 = str;
        int i2 = i;
        if (z) {
            if (medium != null) {
                j2 = (long) medium.A0B;
                j3 = (long) medium.A04;
            } else {
                j2 = 0;
            }
            A01.A1v(str3, str2, j2, j3, (long) i2, A06);
            return;
        }
        if (medium != null) {
            j = (long) medium.A0B;
            j3 = (long) medium.A04;
        } else {
            j = 0;
        }
        A01.A1u(str3, j, j3, (long) i2, A06);
    }

    public C362158hR(UserSession userSession) {
        this.A00 = userSession;
    }
}
