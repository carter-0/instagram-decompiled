package X;

import com.instagram.common.gallery.model.GalleryItem;

/* renamed from: X.8gg  reason: invalid class name and case insensitive filesystem */
public final class C361718gg implements C232262tL {
    public final AnonymousClass9I9 A00;
    public final GalleryItem.LocalGalleryMedium A01;
    public final C362958in A02;
    public final String A03;

    public C361718gg(AnonymousClass9I9 r2, GalleryItem.LocalGalleryMedium localGalleryMedium, C362958in r4, String str) {
        0qQ.A0B(str, 1);
        this.A03 = str;
        this.A01 = localGalleryMedium;
        this.A00 = r2;
        this.A02 = r4;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C361718gg r4 = (C361718gg) obj;
        if (this == r4 || (r4 != null && 0qQ.A0K(this.A03, r4.A03) && 0qQ.A0K(this.A01, r4.A01) && 0qQ.A0K(this.A00, r4.A00) && 0qQ.A0K(this.A02, r4.A02))) {
            return true;
        }
        return false;
    }
}
