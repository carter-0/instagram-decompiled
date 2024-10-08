package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LHw  reason: case insensitive filesystem */
public abstract class C63996LHw {
    public static final int A00(28D r5, List list) {
        boolean z = list instanceof Collection;
        if (!z || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Medium A0O = JTP.A0O(it);
                if (A0O != null && A0O.A0G.A0B) {
                    return 54;
                }
            }
        }
        if (r5 == 28D.A37 && (!z || !list.isEmpty())) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Medium A0O2 = JTP.A0O(it2);
                if (A0O2 != null && A0O2.A0Y != null) {
                    return 108;
                }
            }
        }
        if (r5 == 28D.A4b && (!z || !list.isEmpty())) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                Medium A0O3 = JTP.A0O(it3);
                if (A0O3 != null && A0O3.A0Y != null) {
                    return 3;
                }
            }
        }
        return 0;
    }

    public static final void A01(GalleryItem galleryItem, UserSession userSession, AnonymousClass3Q2 r5) {
        String str;
        Medium medium = galleryItem.A00;
        MediaUploadMetadata mediaUploadMetadata = null;
        if (medium != null) {
            str = medium.A0G.A03;
        } else {
            str = null;
        }
        String[] strArr = {str, r5.A13.A03};
        0qQ.A0B(strArr, 0);
        C59737JVv.A02(userSession, "", 03t.A0I(strArr));
        MediaUploadMetadata mediaUploadMetadata2 = r5.A13;
        Medium medium2 = galleryItem.A00;
        if (medium2 != null) {
            mediaUploadMetadata = medium2.A0G;
        }
        mediaUploadMetadata2.A00(mediaUploadMetadata);
    }
}
