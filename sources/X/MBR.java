package X;

import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;

public final /* synthetic */ class MBR implements C62320sa {
    public final /* synthetic */ AnonymousClass9I9 A00;
    public final /* synthetic */ GalleryItem A01;
    public final /* synthetic */ MediaPickerItemView A02;
    public final /* synthetic */ C60442Jla A03;

    public /* synthetic */ MBR(AnonymousClass9I9 r1, GalleryItem galleryItem, MediaPickerItemView mediaPickerItemView, C60442Jla jla) {
        this.A03 = jla;
        this.A02 = mediaPickerItemView;
        this.A01 = galleryItem;
        this.A00 = r1;
    }

    public final Object invoke() {
        C60442Jla jla = this.A03;
        MediaPickerItemView mediaPickerItemView = this.A02;
        GalleryItem galleryItem = this.A01;
        return Boolean.valueOf(jla.A02.DM5(mediaPickerItemView, this.A00, galleryItem));
    }
}
