package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.762  reason: invalid class name */
public abstract class AnonymousClass762 {
    public static final 0eP A00(Shape shape, boolean z) {
        AnonymousClass763 r7;
        Shape shape2 = shape;
        ShapeDrawable shapeDrawable = new ShapeDrawable(shape);
        shapeDrawable.getPaint().setAlpha(0);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(shape);
        shapeDrawable2.getPaint().setAlpha(0);
        ShapeDrawable shapeDrawable3 = new ShapeDrawable(shape);
        shapeDrawable3.getPaint().setAlpha(0);
        ArrayList A1M = 0sr.A1M(new Drawable[]{shapeDrawable, shapeDrawable2});
        if (z) {
            r7 = new AnonymousClass763((Drawable) null);
            r7.setAlpha(0);
            A1M.add(r7);
        } else {
            r7 = null;
        }
        A1M.add(shapeDrawable3);
        LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) A1M.toArray(new Drawable[0]));
        C331277Qg r2 = new C331277Qg(shapeDrawable, shapeDrawable2, shapeDrawable3, shape2, r7, new WeakReference(layerDrawable));
        C331277Qg.A06.put(layerDrawable, r2);
        return new 0eP(layerDrawable, r2);
    }
}
