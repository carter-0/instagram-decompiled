package X;

import android.view.View;
import com.instagram.common.gallery.model.GalleryItem;

/* renamed from: X.JbU  reason: case insensitive filesystem */
public final class C59905JbU implements C361698ge {
    public final /* synthetic */ JWL A00;

    public final void DLy(GalleryItem galleryItem, MQT mqt, int i) {
        0qQ.A0B(mqt, 1);
        JWL jwl = this.A00;
        if (182.A06(0Tu.A05, jwl.A08, 36331192781390796L)) {
            JW8.A01(galleryItem, jwl.A0A.A00, true);
        } else {
            A00(galleryItem, mqt);
        }
    }

    public final void DM8(View view, GalleryItem galleryItem, MQT mqt, int i) {
        0qQ.A0B(mqt, 1);
        JWL jwl = this.A00;
        if (!182.A06(0Tu.A05, jwl.A08, 36321060954842165L)) {
            A00(galleryItem, mqt);
        } else if (mqt instanceof C59787JYg) {
            jwl.A0A.A01(galleryItem);
        }
    }

    public final /* synthetic */ void DMO(GalleryItem galleryItem, boolean z) {
    }

    public final void DMR(GalleryItem galleryItem, MQT mqt, int i, boolean z) {
        0qQ.A0B(mqt, 1);
        A00(galleryItem, mqt);
    }

    public final /* synthetic */ void DSb() {
    }

    public final /* synthetic */ void DdF(String str) {
    }

    public C59905JbU(JWL jwl) {
        this.A00 = jwl;
    }

    private final void A00(GalleryItem galleryItem, MQT mqt) {
        if (!(mqt instanceof C59787JYg)) {
            if (!182.A06(0Tu.A05, this.A00.A08, 36321060954252332L)) {
                return;
            }
        }
        JW8.A01(galleryItem, this.A00.A0A.A00, false);
    }
}
