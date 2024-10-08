package X;

import android.graphics.Bitmap;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class M9Q implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ Medium A01;
    public final /* synthetic */ C59739JVx A02;
    public final /* synthetic */ C361698ge A03;

    public M9Q(Bitmap bitmap, Medium medium, C59739JVx jVx, C361698ge r4) {
        this.A00 = bitmap;
        this.A02 = jVx;
        this.A01 = medium;
        this.A03 = r4;
    }

    public final void run() {
        C361698ge r4;
        GalleryItem.LocalGalleryMedium A0f;
        MQT mqt;
        int absoluteAdapterPosition;
        ConstraintLayout constraintLayout;
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            C59739JVx jVx = this.A02;
            IgImageView igImageView = jVx.A03.A07;
            Medium medium = this.A01;
            if (AnonymousClass8XE.A05(igImageView, medium)) {
                r4 = this.A03;
                A0f = JTR.A0f(medium);
                mqt = new C59787JYg(bitmap);
                absoluteAdapterPosition = jVx.getAbsoluteAdapterPosition();
                constraintLayout = jVx.A01;
                r4.DM8(constraintLayout, A0f, mqt, absoluteAdapterPosition);
            }
        }
        r4 = this.A03;
        A0f = JTR.A0f(this.A01);
        mqt = C65122Lnk.A00;
        C59739JVx jVx2 = this.A02;
        absoluteAdapterPosition = jVx2.getAbsoluteAdapterPosition();
        constraintLayout = jVx2.A01;
        r4.DM8(constraintLayout, A0f, mqt, absoluteAdapterPosition);
    }
}
