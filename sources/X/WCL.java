package X;

import android.view.ViewTreeObserver;
import com.instagram.api.schemas.MediaCroppingCoordinatesIntf;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class WCL implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ MediaCroppingCoordinatesIntf A02;
    public final /* synthetic */ IgImageView A03;

    public WCL(MediaCroppingCoordinatesIntf mediaCroppingCoordinatesIntf, IgImageView igImageView, int i, int i2) {
        this.A03 = igImageView;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = mediaCroppingCoordinatesIntf;
    }

    public final boolean onPreDraw() {
        IgImageView igImageView = this.A03;
        if (igImageView.getWidth() <= 0) {
            return true;
        }
        int i = this.A01;
        int i2 = this.A00;
        MediaCroppingCoordinatesIntf mediaCroppingCoordinatesIntf = this.A02;
        C14347TuU.A00(igImageView, mediaCroppingCoordinatesIntf.Ass(), mediaCroppingCoordinatesIntf.Asu(), mediaCroppingCoordinatesIntf.Asv(), i, i2);
        C13988Tno.A12(igImageView, this);
        return true;
    }
}
