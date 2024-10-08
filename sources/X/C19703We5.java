package X;

import android.widget.ImageView;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;

/* renamed from: X.We5  reason: case insensitive filesystem */
public final class C19703We5 implements C234382xm {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C15641Ug7 A01;
    public final /* synthetic */ SimpleZoomableViewContainer A02;
    public final /* synthetic */ C234372xl A03;

    public final boolean Dgn(C253913rc r2) {
        return true;
    }

    public final void Dgt(C253913rc r1) {
    }

    public C19703We5(ImageView imageView, C15641Ug7 ug7, SimpleZoomableViewContainer simpleZoomableViewContainer, C234372xl r4) {
        this.A01 = ug7;
        this.A03 = r4;
        this.A02 = simpleZoomableViewContainer;
        this.A00 = imageView;
    }

    public final boolean Dgo(C253913rc r4) {
        C234372xl r2 = this.A03;
        if (!r2.isIdle()) {
            return true;
        }
        r2.Exy(this.A00, this.A02, r4);
        return true;
    }
}
