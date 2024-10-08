package X;

import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import androidx.fragment.app.Fragment;

/* renamed from: X.NvI  reason: case insensitive filesystem */
public abstract class C69978NvI {
    public static final ShapeDrawable A00(Fragment fragment) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        AnonymousClass7TE.A1N(fragment.requireContext(), paint, 2Yu.A0B(fragment.requireContext()));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(0nA.A00(fragment.requireContext(), 1.0f));
        paint.setAntiAlias(true);
        return shapeDrawable;
    }
}
