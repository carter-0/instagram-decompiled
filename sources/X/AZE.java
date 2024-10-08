package X;

import android.graphics.Bitmap;
import android.view.View;
import com.instagram.common.gallery.model.GalleryItem;

public final class AZE implements AnonymousClass3NL {
    public final /* synthetic */ C380639Yy A00;
    public final /* synthetic */ C362608iB A01;
    public final /* synthetic */ C361698ge A02;

    public final void DP5(View view) {
    }

    public AZE(C380639Yy r1, C362608iB r2, C361698ge r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final boolean Dqe(View view) {
        C380639Yy r5 = this.A00;
        Bitmap bitmap = r5.A01.A06;
        GalleryItem galleryItem = (GalleryItem) 00k.A0J(this.A01.A00);
        if (bitmap == null || galleryItem == null) {
            return false;
        }
        this.A02.DMR(galleryItem, new C59787JYg(bitmap), r5.getAbsoluteAdapterPosition(), false);
        return true;
    }
}
