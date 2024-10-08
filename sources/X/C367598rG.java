package X;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.8rG  reason: invalid class name and case insensitive filesystem */
public final class C367598rG extends AnonymousClass3B3 {
    public final RectF A00 = new RectF(Float.MAX_VALUE, Float.MAX_VALUE, 0.0f, 0.0f);

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, AnonymousClass3AW r10) {
        0qQ.A0B(canvas, 0);
        0qQ.A0B(recyclerView, 1);
        0qQ.A0B(r10, 2);
        RectF rectF = this.A00;
        RectF rectF2 = new RectF(rectF);
        Rect rect = new Rect();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.A0E(recyclerView.getChildAt(i), rect);
            rectF2.left = Math.min(rectF2.left, (float) rect.left);
            rectF2.top = Math.min(rectF2.top, (float) rect.top);
            rectF2.right = Math.max(rectF2.right, (float) rect.right);
            rectF2.bottom = Math.max(rectF2.bottom, (float) rect.bottom);
        }
        if (!rectF2.equals(rectF)) {
            Path path = new Path();
            path.addRoundRect(rectF2, 0.0f, 0.0f, Path.Direction.CW);
            canvas.clipPath(path);
        }
    }
}
