package X;

import android.content.Context;
import android.util.AttributeSet;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;

/* renamed from: X.GGv  reason: case insensitive filesystem */
public final class C52153GGv implements AnonymousClass2WT {
    public final /* synthetic */ C52152GGu A00;

    public C52153GGv(C52152GGu gGu) {
        this.A00 = gGu;
    }

    public final /* bridge */ /* synthetic */ Object AB5(Context context) {
        0qQ.A0B(context, 0);
        SimpleZoomableViewContainer simpleZoomableViewContainer = new SimpleZoomableViewContainer(context, (AttributeSet) null, 0);
        simpleZoomableViewContainer.addView(new GIC(context, this.A00.A03));
        return simpleZoomableViewContainer;
    }
}
