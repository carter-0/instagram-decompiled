package X;

import com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager;

public final class M6K implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ GalleryPreviewMultiselectPager A01;

    public M6K(GalleryPreviewMultiselectPager galleryPreviewMultiselectPager, int i) {
        this.A01 = galleryPreviewMultiselectPager;
        this.A00 = i;
    }

    public final void run() {
        this.A01.A0L(this.A00, 0.0f);
    }
}
