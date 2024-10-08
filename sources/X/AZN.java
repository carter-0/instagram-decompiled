package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class AZN implements C262424Dq {
    public final /* synthetic */ IgImageView A00;
    public final /* synthetic */ C358248ab A01;

    public AZN(IgImageView igImageView, C358248ab r2) {
        this.A01 = r2;
        this.A00 = igImageView;
    }

    public final void CyE(Bitmap bitmap) {
        0qQ.A0B(bitmap, 0);
        this.A00.setImageDrawable(new C59985Jcu(bitmap, (Matrix) null, (float) this.A01.A0O, 3));
    }
}
