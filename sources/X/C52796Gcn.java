package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.Gcn  reason: case insensitive filesystem */
public final class C52796Gcn extends Drawable {
    public float A00;
    public float A01 = -1.0f;
    public float A02 = -1.0f;
    public float A03 = -1.0f;
    public float A04 = -1.0f;
    public float A05;
    public int A06;
    public int A07;
    public boolean A08 = true;
    public boolean A09;
    public boolean A0A;
    public final Paint A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final Path A0E = C51965G9l.A0C();
    public final Path A0F = C51965G9l.A0C();
    public final Path A0G = C51965G9l.A0C();
    public final Path A0H = C51965G9l.A0C();

    public static void A00(Path path, float f, int i, int i2) {
        float f2 = (float) i;
        float f3 = (float) i2;
        float f4 = 2.0f * f;
        RectF rectF = new RectF(f2, f3, f2 + f4, f3 + f4);
        RectF rectF2 = new RectF(0.0f, 0.0f, f4, f4);
        path.reset();
        path.setFillType(Path.FillType.EVEN_ODD);
        float f5 = f2 + f;
        path.moveTo(f5, f3);
        path.arcTo(rectF, 270.0f, -90.0f, true);
        path.rLineTo((float) (-i), 0.0f);
        path.lineTo(0.0f, f);
        path.arcTo(rectF2, 180.0f, 90.0f, true);
        path.lineTo(f5, 0.0f);
        path.rLineTo(0.0f, f3);
        path.close();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void draw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        if (this.A08) {
            float f4 = this.A03;
            if (f4 == -1.0f) {
                f4 = this.A05;
            }
            float f5 = this.A04;
            if (f5 == -1.0f) {
                f5 = this.A05;
            }
            float f6 = this.A00;
            float f7 = f4 + f6;
            float f8 = f6 + f5;
            Paint paint = this.A0B;
            int i = this.A07;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new RadialGradient(f7, f7, f7, new int[]{i, i, this.A06}, new float[]{0.0f, 0.2f, 1.0f}, tileMode));
            Paint paint2 = this.A0C;
            int i2 = this.A07;
            paint2.setShader(new RadialGradient(f8, f8, f8, new int[]{i2, i2, this.A06}, new float[]{0.0f, 0.2f, 1.0f}, tileMode));
            float f9 = this.A01;
            if (f9 == -1.0f) {
                f9 = 0.0f;
            }
            float f10 = this.A02;
            if (f10 == -1.0f) {
                int i3 = (int) (this.A05 + 0.5f);
                if (i3 % 2 == 1) {
                    i3--;
                }
                f10 = ((float) i3) * 0.5f;
            }
            int i4 = (int) (f4 + 0.5f);
            if (i4 % 2 == 1) {
                i4--;
            }
            int ceil = (int) Math.ceil((double) (((float) i4) - f9));
            int i5 = (int) (f5 + 0.5f);
            if (i5 % 2 == 1) {
                i5--;
            }
            int ceil2 = (int) Math.ceil((double) (((float) i5) + f9));
            int i6 = (int) (this.A05 + 0.5f);
            int i7 = i6;
            int i8 = i6 % 2;
            if (i8 == 1) {
                i6--;
            }
            int ceil3 = (int) Math.ceil((double) (((float) i6) - f10));
            if (i8 == 1) {
                i7--;
            }
            int ceil4 = (int) Math.ceil((double) (((float) i7) + f10));
            A00(this.A0G, this.A00, ceil, ceil3);
            A00(this.A0H, this.A00, ceil2, ceil3);
            A00(this.A0E, this.A00, ceil, ceil4);
            A00(this.A0F, this.A00, ceil2, ceil4);
            Paint paint3 = this.A0D;
            int i9 = this.A07;
            paint3.setShader(new LinearGradient(0.0f, f7, 0.0f, 0.0f, new int[]{i9, i9, this.A06}, new float[]{0.0f, 0.2f, 1.0f}, tileMode));
            paint3.setAntiAlias(false);
            this.A08 = false;
        }
        Rect bounds = getBounds();
        Canvas canvas2 = canvas;
        int save = canvas2.save();
        if (!this.A0A) {
            AnonymousClass7TF.A13(canvas2, bounds);
            Path path = this.A0G;
            Paint paint4 = this.A0B;
            canvas2.drawPath(path, paint4);
            canvas2.restoreToCount(save);
            int save2 = canvas2.save();
            canvas2.translate((float) bounds.right, (float) bounds.top);
            canvas2.scale(-1.0f, 1.0f);
            canvas2.drawPath(this.A0H, paint4);
            canvas2.restoreToCount(save2);
        }
        if (!this.A09) {
            int save3 = canvas2.save();
            canvas2.translate((float) bounds.right, (float) bounds.bottom);
            canvas2.scale(-1.0f, -1.0f);
            Path path2 = this.A0F;
            Paint paint5 = this.A0C;
            canvas2.drawPath(path2, paint5);
            canvas2.restoreToCount(save3);
            int save4 = canvas2.save();
            canvas2.translate((float) bounds.left, (float) bounds.bottom);
            canvas2.scale(1.0f, -1.0f);
            canvas2.drawPath(this.A0E, paint5);
            canvas2.restoreToCount(save4);
        }
        float f11 = this.A01;
        float f12 = 0.0f;
        if (f11 == -1.0f) {
            f11 = 0.0f;
        }
        float f13 = this.A02;
        if (f13 == -1.0f) {
            int i10 = (int) (this.A05 + 0.5f);
            if (i10 % 2 == 1) {
                i10--;
            }
            f13 = ((float) i10) * 0.5f;
        }
        float f14 = this.A03;
        if (f14 == -1.0f) {
            f14 = this.A05;
        }
        float f15 = this.A04;
        if (f15 == -1.0f) {
            f15 = this.A05;
        }
        int i11 = (int) (f14 + 0.5f);
        if (i11 % 2 == 1) {
            i11--;
        }
        int ceil5 = (int) Math.ceil((double) (((float) i11) - f11));
        int i12 = (int) (f15 + 0.5f);
        if (i12 % 2 == 1) {
            i12--;
        }
        int ceil6 = (int) Math.ceil((double) (((float) i12) + f11));
        int i13 = (int) (this.A05 + 0.5f);
        int i14 = i13;
        int i15 = i13 % 2;
        if (i15 == 1) {
            i13--;
        }
        int ceil7 = (int) Math.ceil((double) (((float) i13) - f13));
        if (i15 == 1) {
            i14--;
        }
        int ceil8 = (int) Math.ceil((double) (((float) i14) + f13));
        int save5 = canvas2.save();
        if (!this.A0A) {
            AnonymousClass7TF.A13(canvas2, bounds);
            canvas2.drawRect(this.A00 + ((float) ceil5), 0.0f, (((float) bounds.width()) - this.A00) - ((float) ceil6), (float) ceil7, this.A0D);
            canvas2.restoreToCount(save5);
        }
        if (!this.A09) {
            int save6 = canvas2.save();
            canvas2.translate((float) bounds.right, (float) bounds.bottom);
            canvas2.rotate(180.0f);
            canvas2.drawRect(this.A00 + ((float) ceil6), 0.0f, (((float) bounds.width()) - this.A00) - ((float) ceil5), (float) ceil8, this.A0D);
            canvas2.restoreToCount(save6);
        }
        int save7 = canvas2.save();
        canvas2.translate((float) bounds.left, (float) bounds.bottom);
        canvas2.rotate(270.0f);
        if (this.A09) {
            f = 0.0f;
        } else {
            f = ((float) ceil8) + this.A00;
        }
        float height = (float) bounds.height();
        if (this.A0A) {
            f2 = 0.0f;
        } else {
            f2 = this.A00 + ((float) ceil7);
        }
        Paint paint6 = this.A0D;
        canvas2.drawRect(f, 0.0f, height - f2, (float) ceil5, paint6);
        canvas2.restoreToCount(save7);
        int save8 = canvas2.save();
        canvas2.translate((float) bounds.right, (float) bounds.top);
        canvas2.rotate(90.0f);
        if (this.A0A) {
            f3 = 0.0f;
        } else {
            f3 = ((float) ceil7) + this.A00;
        }
        float height2 = (float) bounds.height();
        if (!this.A09) {
            f12 = this.A00 + ((float) ceil8);
        }
        Canvas canvas3 = canvas2;
        float f16 = f3;
        canvas3.drawRect(f16, 0.0f, height2 - f12, (float) ceil6, paint6);
        canvas2.restoreToCount(save8);
    }

    public final void setAlpha(int i) {
        this.A0B.setAlpha(i);
        this.A0C.setAlpha(i);
        this.A0D.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0B.setColorFilter(colorFilter);
        this.A0C.setColorFilter(colorFilter);
        this.A0D.setColorFilter(colorFilter);
    }

    public C52796Gcn() {
        Paint A0V = AnonymousClass7TE.A0V(5);
        this.A0B = A0V;
        Paint.Style style = Paint.Style.FILL;
        A0V.setStyle(style);
        Paint A0V2 = AnonymousClass7TE.A0V(5);
        this.A0C = A0V2;
        A0V2.setStyle(style);
        Paint paint = new Paint(A0V);
        this.A0D = paint;
        paint.setAntiAlias(false);
    }
}
