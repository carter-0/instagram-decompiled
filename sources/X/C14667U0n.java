package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.U0n  reason: case insensitive filesystem */
public final class C14667U0n extends Drawable {
    public float A00;
    public RectF A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final Paint A07;
    public final Paint A08;
    public final Paint A09;
    public final Path A0A;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Path path = this.A0A;
        Paint paint = this.A09;
        canvas.drawPath(path, paint);
        Paint paint2 = this.A07;
        canvas.drawPath(path, paint2);
        Paint paint3 = this.A08;
        if (paint3 != null) {
            canvas.drawPath(path, paint3);
        }
        float A012 = C66581MXm.A01(this);
        float f = (float) this.A03;
        float f2 = f * 1.5f;
        float f3 = A012 + f2;
        canvas.drawCircle(f3, ((float) getBounds().bottom) - f2, f, paint);
        canvas.drawCircle(f3, ((float) getBounds().bottom) - f2, f, paint2);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        Rect rect2 = rect;
        0qQ.A0B(rect2, 0);
        super.onBoundsChange(rect2);
        RectF rectF = new RectF(rect2);
        rectF.inset(10.0f, 12.0f);
        this.A01 = rectF;
        float height = ((((float) rect2.height()) - this.A01.height()) / 2.0f) * 0.97f;
        this.A00 = height;
        RectF rectF2 = this.A01;
        float centerX = rectF2.centerX();
        float f = this.A02;
        float f2 = centerX + f;
        Float valueOf = Float.valueOf((rectF2.bottom - height) - 4.0f);
        float f3 = f / 2.0f;
        float f4 = f2 - f3;
        Float valueOf2 = Float.valueOf(valueOf.floatValue() + this.A00);
        Float valueOf3 = Float.valueOf(this.A01.centerX());
        float floatValue = valueOf3.floatValue() - f;
        float floatValue2 = valueOf3.floatValue() - f3;
        Path path = new Path();
        path.addCircle(this.A01.centerX(), this.A01.centerY() - (this.A00 * 0.9f), this.A01.height() / 2.0f, Path.Direction.CW);
        Path path2 = this.A0A;
        path2.reset();
        path2.moveTo(f2, valueOf.floatValue());
        path2.cubicTo(f4, valueOf.floatValue(), f4 + 4.0f, valueOf2.floatValue(), valueOf3.floatValue(), valueOf2.floatValue());
        path2.cubicTo((valueOf3.floatValue() - f3) - 4.0f, valueOf2.floatValue(), floatValue2, valueOf.floatValue(), floatValue, valueOf.floatValue());
        path2.close();
        path2.op(path, Path.Op.UNION);
        float centerX2 = this.A01.centerX();
        RectF rectF3 = this.A01;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A09.setShader(new LinearGradient(centerX2, rectF3.top, rectF3.right, rectF3.bottom, new int[]{this.A05, 0}, new float[]{0.0f, 0.35f}, tileMode));
        Paint paint = this.A08;
        if (paint != null) {
            RectF rectF4 = this.A01;
            Shader.TileMode tileMode2 = tileMode;
            paint.setShader(new LinearGradient(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom, new int[]{this.A04, 0}, new float[]{0.0f, 0.4f}, tileMode2));
        }
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public /* synthetic */ C14667U0n(Context context, int i, int i2) {
        float dimensionPixelSize = (float) context.getResources().getDimensionPixelSize(R.dimen.iconic_note_entry_point_stroke_width);
        int color = context.getColor(R.color.facepile_inner_stroke_color);
        int color2 = context.getColor(R.color.track_background_color);
        this.A06 = context;
        this.A05 = i2;
        this.A04 = color2;
        Paint paint = new Paint();
        paint.setColor(i);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        paint.setShadowLayer(10.0f, 3.0f, 3.0f, color);
        this.A07 = paint;
        Paint paint2 = new Paint();
        JTO.A1N(paint2);
        paint2.setStrokeWidth(dimensionPixelSize);
        paint2.setAntiAlias(true);
        this.A09 = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setAntiAlias(true);
        this.A08 = !AnonymousClass1GD.A03() ? null : paint3;
        this.A01 = new RectF();
        this.A03 = AnonymousClass7TG.A04(context);
        this.A02 = C13988Tno.A01(AnonymousClass7TH.A01(context));
        this.A0A = new Path();
    }
}
