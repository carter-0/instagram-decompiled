package X;

import com.instagram.common.gallery.model.GalleryItem;

/* renamed from: X.LhX  reason: case insensitive filesystem */
public final class C64755LhX implements C232262tL {
    public final GalleryItem A00;

    public C64755LhX(GalleryItem galleryItem) {
        0qQ.A0B(galleryItem, 1);
        this.A00 = galleryItem;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A0A;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64755LhX lhX = (C64755LhX) obj;
        0qQ.A0B(lhX, 0);
        return 0qQ.A0K(this.A00, lhX.A00);
    }
}
