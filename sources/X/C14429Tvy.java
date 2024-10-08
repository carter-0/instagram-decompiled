package X;

import android.content.Context;
import android.graphics.PointF;
import com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager;

/* renamed from: X.Tvy  reason: case insensitive filesystem */
public final class C14429Tvy extends AnonymousClass52S {
    public final /* synthetic */ FlowingGridLayoutManager A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14429Tvy(Context context, FlowingGridLayoutManager flowingGridLayoutManager) {
        super(context);
        this.A00 = flowingGridLayoutManager;
    }

    public final PointF A00(int i) {
        FlowingGridLayoutManager flowingGridLayoutManager = this.A00;
        int A002 = FlowingGridLayoutManager.A00(flowingGridLayoutManager, i, 0);
        int i2 = flowingGridLayoutManager.A04;
        float f = 1.0f;
        if (A002 <= i2) {
            f = -1.0f;
        }
        return new PointF(0.0f, f);
    }
}
