package X;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

public final class AZH implements B1H {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C380509Yl A01;
    public final /* synthetic */ C317876nz A02;

    public AZH(Drawable drawable, C380509Yl r2, C317876nz r3) {
        this.A00 = drawable;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void DjV(ConstrainedImageView constrainedImageView, int i, int i2, int i3, int i4) {
        RectF rectF = C39859ACf.A01;
        Drawable drawable = this.A00;
        if (drawable != null) {
            C39859ACf.A00(drawable, this.A01, this.A02, i3 - i, i4 - i2);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
