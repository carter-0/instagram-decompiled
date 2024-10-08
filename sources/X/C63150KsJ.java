package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.KsJ  reason: case insensitive filesystem */
public abstract class C63150KsJ {
    public static final void A00(Path path, Rect rect) {
        0qQ.A0B(rect, 1);
        RectF A0Y = AnonymousClass7TE.A0Y();
        path.computeBounds(A0Y, true);
        float width = (float) rect.width();
        float height = (float) rect.height();
        float min = Math.min(width / A0Y.width(), height / A0Y.height());
        float width2 = (((float) rect.left) + ((width - (A0Y.width() * min)) / 2.0f)) - (A0Y.left * min);
        float height2 = (((float) rect.top) + ((height - (A0Y.height() * min)) / 2.0f)) - (A0Y.top * min);
        Matrix A0U = AnonymousClass7TE.A0U();
        A0U.reset();
        A0U.postScale(min, min);
        A0U.postTranslate(width2, height2);
        path.transform(A0U);
    }
}
