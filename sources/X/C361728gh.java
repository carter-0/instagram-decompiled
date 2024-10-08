package X;

import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.8gh  reason: invalid class name and case insensitive filesystem */
public final class C361728gh implements C232262tL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final GalleryItem A03;
    public final ImageUrl A04;
    public final String A05;
    public final String A06;
    public final 0sP A07;
    public final boolean A08;
    public final boolean A09;

    public C361728gh(GalleryItem galleryItem, ImageUrl imageUrl, String str, String str2, 0sP r6, int i, int i2, int i3, boolean z, boolean z2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 3);
        this.A05 = str;
        this.A04 = imageUrl;
        this.A06 = str2;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = galleryItem;
        this.A02 = i3;
        this.A08 = z;
        this.A09 = z2;
        this.A07 = r6;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return false;
    }
}
