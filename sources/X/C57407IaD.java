package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.IaD  reason: case insensitive filesystem */
public final class C57407IaD implements MT1 {
    public final /* synthetic */ LPF A00;
    public final /* synthetic */ C55547HjT A01;

    public C57407IaD(LPF lpf, C55547HjT hjT) {
        this.A00 = lpf;
        this.A01 = hjT;
    }

    public final void DSd(int i, int i2) {
        List<GalleryItem> A012 = this.A00.A01();
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (GalleryItem galleryItem : A012) {
            Medium medium = galleryItem.A00;
            if (medium != null) {
                A1C.add(new C56108Hsv(medium.A02(), String.valueOf(medium.A05), medium.A0a));
            }
        }
        this.A01.A00.A03(C59105J6n.A02(A1C, 27));
    }
}
