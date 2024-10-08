package X;

import com.instagram.common.gallery.model.GalleryItem;
import java.util.Comparator;

public final class JXI implements Comparator {
    public static final JXI A00 = new JXI();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        GalleryItem galleryItem = (GalleryItem) obj;
        GalleryItem galleryItem2 = (GalleryItem) obj2;
        AnonymousClass7TG.A1N(galleryItem, galleryItem2);
        C64153LQs lQs = C64153LQs.A00;
        return 0qQ.A01(lQs.A01(galleryItem), lQs.A01(galleryItem2));
    }
}
