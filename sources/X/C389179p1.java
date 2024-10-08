package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.instagram.android.R;

/* renamed from: X.9p1  reason: invalid class name and case insensitive filesystem */
public final class C389179p1 extends AnonymousClass3O7 {
    public static final float[] A07 = {1.0f, 1.03f, 1.2f, 1.07f, 1.2f, 1.3f, 0.62f, 0.62f};
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final Paint A05;
    public final RectF A06 = AnonymousClass7TE.A0Y();

    public C389179p1(Context context) {
        super(context, (AttributeSet) null);
        Resources resources = getResources();
        this.A01 = resources.getDimension(R.dimen.abc_button_inset_vertical_material) + 0nA.A04(context, 8);
        this.A04 = 0nA.A04(context, 2);
        this.A03 = resources.getDimension(R.dimen.refinements_header_destination_item_placeholder_standard_width);
        this.A02 = 0nA.A04(context, 33);
        this.A00 = 0nA.A04(context, 8);
        Paint paint = new Paint();
        this.A05 = paint;
        AnonymousClass7TE.A1N(context, paint, 2Yu.A04(context));
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        float f = this.A01;
        float f2 = f;
        float[] fArr = A07;
        int i = 0;
        do {
            float f3 = this.A03 * fArr[i];
            RectF rectF = this.A06;
            float f4 = this.A04;
            rectF.set(f, f4, f + f3, this.A02 + f4);
            float f5 = this.A00;
            canvas.drawRoundRect(rectF, f5, f5, this.A05);
            f += f3 + f2;
            i++;
        } while (i < 8);
    }
}
