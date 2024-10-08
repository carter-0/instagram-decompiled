package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.MvY  reason: case insensitive filesystem */
public final class C67830MvY extends AnonymousClass3B3 {
    public final int A00 = 1;
    public final int A01;
    public final Paint A02;

    public C67830MvY(int i, int i2) {
        Paint A0C = JTO.A0C();
        this.A02 = A0C;
        A0C.setColor(i);
        A0C.setStrokeWidth(1.0f);
        this.A01 = i2;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r6) {
        super.getItemOffsets(rect, view, recyclerView, r6);
        rect.set(0, 0, 0, this.A00);
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, AnonymousClass3AW r15) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int i = this.A01;
        int i2 = paddingLeft + i;
        int width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - i;
        int childCount = recyclerView.getChildCount() - 1;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            float bottom = (float) (childAt.getBottom() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin);
            canvas.drawLine((float) i2, bottom, (float) width, bottom, this.A02);
        }
    }
}
