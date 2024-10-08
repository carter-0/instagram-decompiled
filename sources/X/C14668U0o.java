package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.U0o  reason: case insensitive filesystem */
public final class C14668U0o extends Drawable {
    public List A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final Paint A05;
    public final Paint A06;
    public final Paint A07;
    public final RectF A08 = new RectF();
    public final GVQ A09;
    public final float[] A0A;
    public final int[] A0B;

    public C14668U0o(Context context, boolean z) {
        GVQ gvq;
        0qQ.A0B(context, 1);
        Paint paint = new Paint();
        AnonymousClass7TE.A1N(context, paint, 2Yu.A0H(context, R.attr.fastScrubberLineColor));
        paint.setAntiAlias(true);
        this.A07 = paint;
        Paint paint2 = new Paint();
        AnonymousClass7TE.A1N(context, paint2, 2Yu.A0H(context, R.attr.fastScrubberDotColor));
        paint2.setAntiAlias(true);
        AnonymousClass7TE.A1N(context, paint2, 2Yu.A0H(context, R.attr.igds_color_creation_tools_pink));
        paint2.setStrokeWidth((float) JTR.A08(context));
        JTO.A1N(paint2);
        this.A06 = paint2;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A04 = dimensionPixelSize;
        float A012 = C13988Tno.A01(dimensionPixelSize);
        this.A01 = A012;
        float A022 = (float) AnonymousClass7TF.A02(context, R.dimen.abc_control_corner_material);
        this.A02 = A022;
        float dimension = context.getResources().getDimension(R.dimen.abc_action_bar_elevation_material);
        this.A03 = dimension;
        int[] iArr = {AnonymousClass7TF.A03(context, R.attr.igds_color_creation_tools_pink), AnonymousClass7TF.A03(context, R.attr.igds_color_creation_tools_pink)};
        this.A0B = iArr;
        float[] fArr = {0.0f, 1.0f};
        this.A0A = fArr;
        Paint paint3 = new Paint();
        float f = -A022;
        paint3.setShader(new LinearGradient(f, f, A022, f, iArr, fArr, Shader.TileMode.CLAMP));
        this.A05 = paint3;
        this.A00 = 0sn.A00;
        if (z) {
            gvq = GVQ.A00(context, dimension, A012);
        } else {
            gvq = null;
        }
        this.A09 = gvq;
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        GVQ gvq = this.A09;
        if (gvq != null) {
            gvq.draw(canvas);
        }
        RectF rectF = this.A08;
        float f = this.A01;
        canvas.drawRoundRect(rectF, f, f, this.A07);
        int size = this.A00.size();
        for (int i = 0; i < size; i++) {
            canvas.save();
            float f2 = this.A02;
            canvas.translate((AnonymousClass7TG.A00(this.A00, i) * rectF.width()) - f2, rectF.centerY());
            canvas.drawCircle(0.0f, 0.0f, f2, this.A06);
            canvas.drawCircle(0.0f, 0.0f, f2, this.A05);
            canvas.restore();
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A08;
        float f = (float) rect.left;
        float centerY = (float) rect.centerY();
        float A012 = C13988Tno.A01(this.A04);
        rectF.set(f, centerY - A012, (float) rect.right, ((float) rect.centerY()) + A012);
        GVQ gvq = this.A09;
        if (gvq != null) {
            float f2 = rectF.left;
            float f3 = this.A03;
            gvq.setBounds(AnonymousClass1GB.A01(f2 - f3), AnonymousClass1GB.A01(rectF.top - f3), AnonymousClass1GB.A01(rectF.right + f3), AnonymousClass1GB.A01(rectF.bottom + f3));
        }
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
        this.A06.setColorFilter(colorFilter);
        C13989Tnp.A11(colorFilter, this.A09);
        invalidateSelf();
    }
}
