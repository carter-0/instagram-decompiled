package X;

import android.graphics.RectF;
import android.text.Layout;

public final /* synthetic */ class W7Y implements Layout.TextInclusionStrategy {
    public final /* synthetic */ 0sL A00;

    public /* synthetic */ W7Y(0sL r1) {
        this.A00 = r1;
    }

    public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
        return AnonymousClass7TE.A1a(this.A00.invoke(rectF, rectF2));
    }
}
