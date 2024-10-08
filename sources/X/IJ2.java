package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;

public final class IJ2 implements AnonymousClass2WT {
    public final /* synthetic */ C53992Gxa A00;

    public IJ2(C53992Gxa gxa) {
        this.A00 = gxa;
    }

    public final /* bridge */ /* synthetic */ Object AB5(Context context) {
        0qQ.A0B(context, 0);
        C53992Gxa gxa = this.A00;
        View A08 = DbU.A08(LayoutInflater.from(context), R.layout.simple_zoomable_media_primitive_component);
        0qQ.A0C(A08, "null cannot be cast to non-null type com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer");
        SimpleZoomableViewContainer simpleZoomableViewContainer = (SimpleZoomableViewContainer) A08;
        C53992Gxa.A00(simpleZoomableViewContainer, gxa);
        return simpleZoomableViewContainer;
    }
}
