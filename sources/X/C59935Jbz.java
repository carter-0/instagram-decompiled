package X;

import com.instagram.common.gallery.model.GalleryItem;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jbz  reason: case insensitive filesystem */
public abstract class C59935Jbz {
    public static final boolean A01(String str, List list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (0qQ.A0K(((GalleryItem) it.next()).A0A, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final HashMap A00(List list) {
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GalleryItem galleryItem = (GalleryItem) it.next();
            A1E.put(galleryItem.A0A, galleryItem);
        }
        return A1E;
    }
}
