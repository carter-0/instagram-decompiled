package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.GiO  reason: case insensitive filesystem */
public final class C53090GiO extends AnonymousClass3B3 {
    public Paint A00;
    public final int A01;
    public final int A02;
    public final boolean A03;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r7) {
        int i;
        C51973G9u.A1E(rect, view, recyclerView);
        int A032 = RecyclerView.A03(view);
        rect.left = 0;
        rect.right = 0;
        if (A032 == 0) {
            i = this.A02;
        } else {
            i = this.A01;
        }
        rect.top = i;
        2Rw r0 = recyclerView.A0A;
        if (r0 == null || A032 != r0.getItemCount()) {
            rect.bottom = 0;
        } else {
            rect.bottom = this.A02;
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, AnonymousClass3AW r14) {
        Canvas canvas2 = canvas;
        AnonymousClass7TG.A1T(canvas, recyclerView, r14);
        if (this.A03) {
            int width = recyclerView.getWidth();
            int childCount = recyclerView.getChildCount() - 1;
            for (int i = 0; i < childCount; i++) {
                int bottom = recyclerView.getChildAt(i).getBottom() + this.A01;
                Paint paint = this.A00;
                if (paint != null) {
                    float f = (float) bottom;
                    canvas2.drawLine(0.0f, f, (float) width, f, paint);
                }
            }
        }
    }

    public C53090GiO(int i, int i2, int i3, boolean z) {
        Paint paint;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = z;
        if (z) {
            paint = new Paint();
            paint.setColor(i3);
            paint.setStrokeWidth((float) i2);
        } else {
            paint = null;
        }
        this.A00 = paint;
    }
}
