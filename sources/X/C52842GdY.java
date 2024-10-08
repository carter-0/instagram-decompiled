package X;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;

/* renamed from: X.GdY  reason: case insensitive filesystem */
public final class C52842GdY extends View.DragShadowBuilder {
    public final void onDrawShadow(Canvas canvas) {
    }

    public final void onProvideShadowMetrics(Point point, Point point2) {
        boolean A1U = AnonymousClass7TF.A1U(0, point, point2);
        point.set(A1U ? 1 : 0, A1U);
        point2.set(0, 0);
    }
}
