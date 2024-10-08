package X;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

public final class AZI implements B1H {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C380519Ym A01;
    public final /* synthetic */ C317876nz A02;

    public AZI(Drawable drawable, C380519Ym r2, C317876nz r3) {
        this.A00 = drawable;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void DjV(ConstrainedImageView constrainedImageView, int i, int i2, int i3, int i4) {
        RectF rectF = AIM.A01;
        Drawable drawable = this.A00;
        if (drawable != null) {
            AIM.A01(drawable, this.A01, this.A02, i3 - i, i4 - i2);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
