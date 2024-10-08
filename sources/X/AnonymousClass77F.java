package X;

import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import java.lang.ref.WeakReference;

/* renamed from: X.77F  reason: invalid class name */
public final class AnonymousClass77F extends ShapeDrawable {
    public final WeakReference A00;

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        AnonymousClass77D r0 = (AnonymousClass77D) this.A00.get();
        if (r0 != null) {
            AnonymousClass77D.A00(r0);
        }
    }

    public AnonymousClass77F(Shape shape, WeakReference weakReference) {
        super(shape);
        this.A00 = weakReference;
    }
}
