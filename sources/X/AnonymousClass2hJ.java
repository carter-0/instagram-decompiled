package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.2hJ  reason: invalid class name */
public final class AnonymousClass2hJ implements C64721Te {
    public final /* synthetic */ CircularImageView A00;

    public final Drawable ALw(Resources resources, 1U1 r5, C240483Lb r6) {
        0qQ.A0B(r6, 1);
        if (!(r6 instanceof C240523Lf)) {
            return null;
        }
        Bitmap CBJ = ((C240523Lf) r6).CBJ();
        0qQ.A07(CBJ);
        return new C240563Lj(CBJ, this.A00.A01);
    }

    public AnonymousClass2hJ(CircularImageView circularImageView) {
        this.A00 = circularImageView;
    }
}
