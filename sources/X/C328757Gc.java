package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Gc  reason: invalid class name and case insensitive filesystem */
public final class C328757Gc extends 2YL {
    public final C328767Gd A00;

    public C328757Gc(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = new C328767Gd(userSession);
    }

    public final void A00(List list) {
        GalleryItem galleryItem;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A52 a52 = (A52) it.next();
            C365798nh r0 = a52.A00;
            C352218Cl r2 = r0.A02;
            C349307zv r1 = r0.A03;
            if (r2 != null) {
                galleryItem = new GalleryItem(r2, r2.A0h);
            } else if (r1 != null) {
                galleryItem = new GalleryItem(r1);
            }
            if (galleryItem.A02()) {
                Medium medium = galleryItem.A00;
                if (medium != null) {
                    galleryItem = new GalleryItem.LocalGalleryMedium(medium, String.valueOf(medium.A05));
                }
            } else if (!galleryItem.A04() && !galleryItem.A03() && !galleryItem.A06()) {
            }
            arrayList.add(new C388699oF(galleryItem, a52, a52.A01));
        }
        this.A00.EaZ(arrayList);
    }
}
