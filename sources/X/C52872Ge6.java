package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.facebook.litho.LithoView;
import java.util.List;

/* renamed from: X.Ge6  reason: case insensitive filesystem */
public final class C52872Ge6 extends HorizontalScrollView implements C251303mt {
    public int A00;
    public int A01;
    public HQS A02;
    public final LithoView A03;

    public final void CsS(List list) {
        list.add(this.A03);
    }

    public final void onMeasure(int i, int i2) {
        this.A03.measure(View.MeasureSpec.makeMeasureSpec(this.A01, SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(this.A00, SN3.MAX_SIGNED_POWER_OF_TWO));
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    public C52872Ge6(Context context) {
        super(context);
        LithoView lithoView = new LithoView(context);
        this.A03 = lithoView;
        addView(lithoView);
    }

    public final void draw(Canvas canvas) {
        int A032 = AnonymousClass0fD.A03(1692151401);
        super.draw(canvas);
        AnonymousClass0fD.A0A(91124656, A032);
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.A03.CsJ();
        HQS hqs = this.A02;
        if (hqs != null) {
            hqs.A00 = getScrollX();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = AnonymousClass0fD.A05(-18511607);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        AnonymousClass0fD.A0C(-1727271642, A05);
        return onTouchEvent;
    }

    public final void fling(int i) {
        super.fling(i);
    }
}
