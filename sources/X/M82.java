package X;

import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.ui.widget.gallery.GalleryView;
import java.util.List;

public final class M82 implements Runnable {
    public final /* synthetic */ LPF A00;
    public final /* synthetic */ C63957LFd A01;

    public M82(LPF lpf, C63957LFd lFd) {
        this.A01 = lFd;
        this.A00 = lpf;
    }

    public final void run() {
        Integer num;
        C63957LFd lFd = this.A01;
        String str = lFd.A03;
        if (str != null) {
            this.A00.A09.A01(new LR6(str), str);
        }
        List<GalleryItem> list = lFd.A08;
        if (list != null) {
            LPF lpf = this.A00;
            lpf.A04();
            LPF.A00(lpf);
            for (GalleryItem galleryItem : list) {
                GalleryView galleryView = lpf.A03;
                if (galleryView == null) {
                    0qQ.A0F("galleryView");
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0B(galleryItem, 0);
                C60054JeM jeM = galleryView.A0C;
                if (jeM != null) {
                    num = jeM.A02(galleryItem);
                } else {
                    num = null;
                }
                GalleryView.A03(galleryItem, galleryView, num);
            }
        }
    }
}
