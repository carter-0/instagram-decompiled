package X;

import android.graphics.Matrix;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.instagram.api.schemas.MediaCroppingCoordinatesIntf;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;

public final class WCK implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ MediaCroppingCoordinatesIntf A00;
    public final /* synthetic */ ImageUrl A01;
    public final /* synthetic */ IgProgressImageView A02;

    public WCK(MediaCroppingCoordinatesIntf mediaCroppingCoordinatesIntf, ImageUrl imageUrl, IgProgressImageView igProgressImageView) {
        this.A02 = igProgressImageView;
        this.A01 = imageUrl;
        this.A00 = mediaCroppingCoordinatesIntf;
    }

    public final boolean onPreDraw() {
        IgProgressImageView igProgressImageView = this.A02;
        if (igProgressImageView.getWidth() <= 0) {
            return true;
        }
        igProgressImageView.setScaleType(ImageView.ScaleType.MATRIX);
        ImageUrl imageUrl = this.A01;
        float width = ((float) igProgressImageView.getWidth()) / ((float) imageUrl.getWidth());
        float Asv = this.A00.Asv();
        Matrix matrix = igProgressImageView.getMatrix();
        matrix.setScale(width, width);
        matrix.postTranslate(0.0f, ((float) imageUrl.getHeight()) * width * Asv * -1.0f);
        igProgressImageView.getIgImageView().setImageMatrix(matrix);
        C13988Tno.A12(igProgressImageView, this);
        return true;
    }
}
