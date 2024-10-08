package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;

/* renamed from: X.4bF  reason: invalid class name and case insensitive filesystem */
public final class C267244bF implements AnonymousClass2WT {
    public final /* synthetic */ C267214b9 A00;

    public C267244bF(C267214b9 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object AB5(Context context) {
        0qQ.A0B(context, 0);
        C267214b9 r2 = this.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.zoomable_image_media_primitive_component, (ViewGroup) null);
        0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer");
        SimpleZoomableViewContainer simpleZoomableViewContainer = (SimpleZoomableViewContainer) inflate;
        C267214b9.A00(simpleZoomableViewContainer, r2);
        return simpleZoomableViewContainer;
    }
}
