package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.instagram.common.ui.base.IgSimpleImageView;

public final /* synthetic */ class APP implements 1MD {
    public final /* synthetic */ IgSimpleImageView A00;

    public /* synthetic */ APP(IgSimpleImageView igSimpleImageView) {
        this.A00 = igSimpleImageView;
    }

    public final Object apply(Object obj) {
        IgSimpleImageView igSimpleImageView = this.A00;
        Bitmap bitmap = (Bitmap) obj;
        if (igSimpleImageView != null) {
            igSimpleImageView.draw(new Canvas(bitmap));
        }
        return bitmap;
    }
}
