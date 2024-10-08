package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.MsX  reason: case insensitive filesystem */
public final class C67693MsX extends FrameLayout {
    public final float A00 = 0.75f;

    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
        float f = this.A00;
        setMeasuredDimension((int) (((float) getMeasuredWidth()) * f), (int) (((float) getMeasuredHeight()) * f));
    }

    public C67693MsX(Context context) {
        super(context, (AttributeSet) null);
        setClipChildren(false);
    }

    public final float getScaleFactor() {
        return this.A00;
    }

    public final void addView(View view) {
        super.addView(view);
        if (view != null) {
            float f = this.A00;
            view.setScaleX(f);
            view.setScaleY(f);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
        }
    }
}
