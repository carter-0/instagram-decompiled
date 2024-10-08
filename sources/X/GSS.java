package X;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

public class GSS extends ViewGroup {
    public boolean A00;

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void requestLayout() {
    }

    public int getChildCount() {
        if (this.A00) {
            return super.getChildCount();
        }
        return 0;
    }

    public final void A00(View view, AnonymousClass5QA r3, long j) {
        super.drawChild(AnonymousClass5R4.A00(r3), view, j);
    }

    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            0qQ.A0C(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((C289385dV) childAt).A00) {
                this.A00 = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.A00 = false;
                }
            } else {
                i++;
            }
        }
    }
}
