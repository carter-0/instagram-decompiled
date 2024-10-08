package X;

import com.instagram.common.gallery.model.GalleryItem;

/* renamed from: X.LiE  reason: case insensitive filesystem */
public final class C64794LiE implements C232262tL {
    public final AnonymousClass9I9 A00;
    public final GalleryItem A01;
    public final C362958in A02;
    public final String A03;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64794LiE liE = (C64794LiE) obj;
        if (liE == null || !0qQ.A0K(this.A03, liE.A03) || !0qQ.A0K(this.A01, liE.A01) || !0qQ.A0K(this.A00, liE.A00) || !0qQ.A0K(this.A02, liE.A02)) {
            return false;
        }
        return true;
    }

    public C64794LiE(AnonymousClass9I9 r2, GalleryItem galleryItem, C362958in r4) {
        this.A01 = galleryItem;
        this.A00 = r2;
        this.A02 = r4;
        this.A03 = galleryItem.A0A;
    }
}
