package X;

import android.content.Context;
import android.widget.FrameLayout;

public final class U4P extends FrameLayout {
    public final U55 A00;

    public final void setChartData(V2G v2g) {
        0qQ.A0B(v2g, 0);
        this.A00.setViewModel(v2g);
        throw AnonymousClass00P.createAndThrow();
    }

    public U4P(Context context) {
        super(context);
        U55 u55 = new U55(context);
        this.A00 = u55;
        addView(u55);
    }
}
