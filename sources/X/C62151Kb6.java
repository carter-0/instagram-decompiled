package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Kb6  reason: case insensitive filesystem */
public final class C62151Kb6 extends C67680MsG {
    public final C59979Jco A00;

    public C62151Kb6(Context context) {
        super(context, (AttributeSet) null, 0);
        Resources resources = getResources();
        this.A00 = new C59979Jco(AnonymousClass7TE.A0C(resources), resources.getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material), context.getColor(R.color.gradient_dark), AnonymousClass7TE.A0A(context));
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A00.draw(canvas);
    }

    public final void onMeasure(int i, int i2) {
        C59979Jco jco = this.A00;
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(AnonymousClass7TF.A06(jco), SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(JTP.A06(jco), SN3.MAX_SIGNED_POWER_OF_TWO));
    }

    public void setProgress(String str) {
        this.A00.A00 = str;
        invalidate();
    }
}
