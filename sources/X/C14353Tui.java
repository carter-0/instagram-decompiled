package X;

import android.view.ViewTreeObserver;
import com.instagram.api.schemas.MediaCroppingCoordinatesIntf;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Tui  reason: case insensitive filesystem */
public final class C14353Tui implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ MediaCroppingCoordinatesIntf A02;
    public final /* synthetic */ IgImageView A03;

    public C14353Tui(MediaCroppingCoordinatesIntf mediaCroppingCoordinatesIntf, IgImageView igImageView, int i, int i2) {
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
        float Ass = mediaCroppingCoordinatesIntf.Ass();
        float Asu = mediaCroppingCoordinatesIntf.Asu();
        float Asv = mediaCroppingCoordinatesIntf.Asv();
        if (Ass >= 0.0f && Asu >= 0.0f && Asv >= 0.0f && Asu - Ass > 0.0f) {
            C14347TuU.A00(igImageView, Ass, Asu, Asv, i, i2);
        }
        C13988Tno.A12(igImageView, this);
        return true;
    }
}
