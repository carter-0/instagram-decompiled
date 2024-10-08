package X;

import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LQQ {
    public final MediaPickerItemView A00;
    public final /* synthetic */ C60054JeM A01;

    public LQQ(C60054JeM jeM, MediaPickerItemView mediaPickerItemView) {
        this.A01 = jeM;
        this.A00 = mediaPickerItemView;
    }

    public static final AnonymousClass9I9 A01(GalleryItem galleryItem, LQQ lqq) {
        HashMap hashMap = lqq.A01.A05;
        String str = galleryItem.A0A;
        AnonymousClass9I9 r2 = (AnonymousClass9I9) hashMap.get(str);
        if (r2 == null) {
            r2 = new AnonymousClass9I9((DefaultConstructorMarker) null, 0, 0, 15, 3, false, false);
            hashMap.put(str, r2);
        }
        r2.A02 = C51970G9q.A1W(lqq.A00(galleryItem), -1);
        r2.A00 = lqq.A00(galleryItem);
        return r2;
    }

    private final int A00(GalleryItem galleryItem) {
        if (galleryItem.A05()) {
            int i = 0;
            for (Object A0K : this.A01.A03.A01.A0Y) {
                if (0qQ.A0K(A0K, galleryItem)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }
}
