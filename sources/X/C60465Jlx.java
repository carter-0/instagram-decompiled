package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Jlx  reason: case insensitive filesystem */
public final class C60465Jlx extends AnonymousClass3B3 {
    public final int A00 = 1;
    public final int A01;
    public final Paint A02;

    public C60465Jlx(int i, int i2) {
        this.A01 = i2;
        Paint A0C = JTO.A0C();
        this.A02 = A0C;
        A0C.setColor(i);
        A0C.setStrokeWidth(1.0f);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r6) {
        0qQ.A0B(rect, 0);
        AnonymousClass7TG.A1U(view, recyclerView, r6);
        super.getItemOffsets(rect, view, recyclerView, r6);
        rect.set(0, 0, 0, this.A00);
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, AnonymousClass3AW r16) {
        Canvas canvas2 = canvas;
        AnonymousClass7TG.A1T(canvas, recyclerView, r16);
        int paddingLeft = recyclerView.getPaddingLeft() + this.A01;
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount() - 1;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            0qQ.A07(childAt);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            0qQ.A0C(layoutParams, C273654mx.A00(9));
            float bottom = (float) (childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
            canvas2.drawLine((float) paddingLeft, bottom, (float) width, bottom, this.A02);
        }
    }
}
