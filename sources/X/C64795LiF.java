package X;

import com.instagram.common.gallery.model.GalleryItem;

/* renamed from: X.LiF  reason: case insensitive filesystem */
public final class C64795LiF implements C232262tL {
    public final AnonymousClass9I9 A00;
    public final GalleryItem A01;
    public final C362958in A02;
    public final String A03;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64795LiF liF = (C64795LiF) obj;
        if (liF == null || !0qQ.A0K(this.A03, liF.A03) || !0qQ.A0K(this.A01, liF.A01) || !0qQ.A0K(this.A00, liF.A00) || !0qQ.A0K(this.A02, liF.A02)) {
            return false;
        }
        return true;
    }

    public C64795LiF(AnonymousClass9I9 r2, GalleryItem galleryItem, C362958in r4) {
        this.A01 = galleryItem;
        this.A00 = r2;
        this.A02 = r4;
        this.A03 = galleryItem.A0A;
    }
}
