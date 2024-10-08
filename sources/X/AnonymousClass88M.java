package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.88M  reason: invalid class name */
public final class AnonymousClass88M extends Drawable {
    public Bitmap A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Matrix A06;
    public final Paint A07;
    public final Path A08 = new Path();
    public final RectF A09;
    public final RectF A0A;
    public final RectF A0B;
    public final float A0C;
    public final int A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final Shader A0G;

    public final int getOpacity() {
        return -1;
    }

    public final void setColorFilter(int i, PorterDuff.Mode mode) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass88M(Resources resources) {
        Paint paint = new Paint(1);
        this.A0F = paint;
        Paint paint2 = new Paint(1);
        this.A07 = paint2;
        Paint paint3 = new Paint(1);
        this.A0E = paint3;
        RectF rectF = new RectF(0.0f, 0.0f, 62.0f, 73.0f);
        this.A09 = rectF;
        this.A0B = new RectF();
        this.A06 = new Matrix();
        Resources resources2 = resources;
        int dimensionPixelSize = resources2.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
        this.A05 = dimensionPixelSize;
        float f = (float) dimensionPixelSize;
        float width = f / (rectF.width() / rectF.height());
        int color = resources2.getColor(R.color.design_dark_default_color_on_background);
        int dimensionPixelSize2 = resources2.getDimensionPixelSize(R.dimen.achievements_only_you_top_margin);
        int color2 = resources2.getColor(R.color.black_30_transparent);
        int dimensionPixelSize3 = resources2.getDimensionPixelSize(R.dimen.afi_indicator_arrow_margin_top);
        this.A04 = dimensionPixelSize3;
        int dimensionPixelSize4 = resources2.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A02 = dimensionPixelSize4;
        int dimensionPixelSize5 = resources2.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        this.A0D = dimensionPixelSize5;
        float f2 = f / 6.0f;
        float f3 = f2 / 2.0f;
        this.A01 = f3;
        float f4 = (float) dimensionPixelSize4;
        float f5 = f4 + f3;
        this.A0C = f5;
        int i = (int) ((width / 3.5f) + width + f2 + f4);
        this.A03 = i;
        this.A0G = new RadialGradient((float) ((dimensionPixelSize / 2) + dimensionPixelSize3 + dimensionPixelSize4), ((float) i) - f3, f5, color2, 0, Shader.TileMode.CLAMP);
        float f6 = (float) dimensionPixelSize3;
        this.A0A = new RectF(f6, f6, (float) (dimensionPixelSize - dimensionPixelSize3), width - f6);
        paint2.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(f6);
        paint.setStrokeMiter((float) dimensionPixelSize2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(color);
        paint3.setShadowLayer((float) dimensionPixelSize5, 0.0f, 0.0f, color2);
        Path path = this.A08;
        path.reset();
        path.moveTo(0.0f, 31.02f);
        path.cubicTo(-0.18f, 55.51f, 31.0f, 73.0f, 31.0f, 73.0f);
        path.cubicTo(31.0f, 73.0f, 62.0f, 55.51f, 62.0f, 31.02f);
        path.cubicTo(62.0f, 13.89f, 48.12f, 0.0f, 31.0f, 0.0f);
        path.cubicTo(13.88f, 0.0f, 0.13f, 13.89f, 0.0f, 31.02f);
        path.close();
        RectF rectF2 = this.A09;
        RectF rectF3 = this.A0A;
        RectF rectF4 = this.A0B;
        0qQ.A0B(rectF2, 1);
        0qQ.A0B(rectF3, 2);
        0qQ.A0B(rectF4, 3);
        if (rectF2.equals(rectF3)) {
            rectF4.set(rectF2);
        } else {
            float width2 = rectF2.width();
            float height = rectF2.height();
            float min = Math.min(Math.abs(rectF3.width() / width2), Math.abs(rectF3.height() / height));
            float abs = Math.abs(rectF2.width() * min);
            float f7 = abs / 2.0f;
            float abs2 = Math.abs(rectF2.height() * min) / 2.0f;
            rectF4.set(rectF3.centerX() - f7, rectF3.centerY() - abs2, rectF3.centerX() + f7, rectF3.centerY() + abs2);
        }
        Matrix matrix = this.A06;
        matrix.setScale(rectF4.width() / rectF2.width(), rectF4.height() / rectF2.height(), 0.0f, 0.0f);
        path.transform(matrix);
    }

    public final void draw(Canvas canvas) {
        if (this.A00 == null) {
            Bitmap createBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
            this.A00 = createBitmap;
            Canvas canvas2 = new Canvas(createBitmap);
            canvas2.save();
            float f = (float) (this.A04 + this.A0D);
            canvas2.translate(f, f);
            canvas2.drawPath(this.A08, this.A0E);
            canvas2.restore();
        }
        canvas.drawBitmap(this.A00, 0.0f, 0.0f, (Paint) null);
        canvas.save();
        int i = this.A04;
        float f2 = (float) (this.A0D + i);
        canvas.translate(f2, f2);
        Path path = this.A08;
        Paint paint = this.A07;
        canvas.drawPath(path, paint);
        Paint paint2 = this.A0F;
        canvas.drawPath(path, paint2);
        canvas.restore();
        canvas.save();
        paint.setShader(this.A0G);
        float f3 = (float) ((this.A05 / 2) + i + this.A02);
        float f4 = this.A01;
        float f5 = ((float) this.A03) - f4;
        canvas.drawCircle(f3, f5, this.A0C, paint);
        paint.setShader((Shader) null);
        canvas.drawCircle(f3, f5, f4, paint);
        canvas.drawCircle(f3, f5, f4, paint2);
        canvas.restore();
    }

    public final int getIntrinsicHeight() {
        return this.A03 + (this.A0D * 2);
    }

    public final int getIntrinsicWidth() {
        return this.A05 + (this.A0D * 2);
    }

    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
        invalidateSelf();
    }
}
