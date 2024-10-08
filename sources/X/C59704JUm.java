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

/* renamed from: X.JUm  reason: case insensitive filesystem */
public final class C59704JUm extends Drawable {
    public RectF A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Context A0A;
    public final Paint A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final Path A0E;
    public final AnonymousClass0eM A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;

    public final void draw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        0qQ.A0B(canvas, 0);
        if (this.A0H && this.A0J) {
            JTQ.A0u(canvas, this.A0F);
        }
        boolean z = this.A0I;
        if (z) {
            Paint paint3 = this.A0D;
            if (paint3 != null) {
                canvas.drawPath(this.A0E, paint3);
            }
            if (AnonymousClass1GD.A03() && (paint2 = this.A0C) != null) {
                canvas.drawPath(this.A0E, paint2);
            }
        }
        Path path = this.A0E;
        Paint paint4 = this.A0B;
        canvas.drawPath(path, paint4);
        float A012 = A01();
        if (z && (paint = this.A0D) != null) {
            canvas.drawCircle(A012 + 12.0f, ((float) JTO.A06(this)) - 6.0f, 6.0f, paint);
        }
        canvas.drawCircle(A012 + 12.0f, ((float) JTO.A06(this)) - 6.0f, 6.0f, paint4);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        float f;
        Paint paint;
        float f2;
        Rect rect2 = rect;
        0qQ.A0B(rect2, 0);
        super.onBoundsChange(rect2);
        RectF rectF = new RectF(rect2);
        rectF.inset((float) this.A04, (float) this.A06);
        this.A00 = rectF;
        float A002 = (rectF.bottom - A00()) - 4.0f;
        if (this.A0G) {
            int i = (((double) this.A00.width()) > (((double) this.A05) * 1.5d) ? 1 : (((double) this.A00.width()) == (((double) this.A05) * 1.5d) ? 0 : -1));
            float A003 = this.A00.bottom - A00();
            if (i < 0) {
                f2 = 10.0f;
            } else {
                f2 = 6.0f;
            }
            f = A003 - f2;
        } else {
            f = A002;
        }
        float A012 = A01();
        float f3 = this.A02;
        float f4 = f3 + A012;
        Float valueOf = Float.valueOf(f);
        float f5 = f3 / 2.0f;
        float f6 = f4 - f5;
        float floatValue = valueOf.floatValue() + A00();
        float f7 = A012 - f5;
        Path path = this.A0E;
        path.reset();
        path.moveTo(f4, valueOf.floatValue());
        path.cubicTo(f6, valueOf.floatValue(), f6 + 4.0f, floatValue, A012, floatValue);
        Path path2 = path;
        float f8 = floatValue;
        path2.cubicTo(f7 - 4.0f, f8, f7, valueOf.floatValue(), A012 - f3, valueOf.floatValue());
        path.close();
        RectF rectF2 = this.A00;
        RectF rectF3 = new RectF(rectF2.left, rectF2.top, rectF2.right, A002);
        float f9 = this.A01;
        path.addRoundRect(rectF3, f9, f9, Path.Direction.CW);
        if (this.A0I) {
            Paint paint2 = this.A0D;
            if (paint2 != null) {
                float centerX = this.A00.centerX();
                RectF rectF4 = this.A00;
                paint2.setShader(new LinearGradient(centerX, rectF4.top, rectF4.right, rectF4.bottom, new int[]{this.A09, 0}, new float[]{0.0f, 0.35f}, Shader.TileMode.CLAMP));
            }
            float centerX2 = this.A00.centerX();
            RectF rectF5 = this.A00;
            float f10 = rectF5.top;
            float centerX3 = rectF5.centerX();
            float f11 = this.A00.bottom;
            int i2 = this.A03;
            this.A0B.setShader(new LinearGradient(centerX2, f10, centerX3, f11, new int[]{2eL.A06(i2, 216), i2}, (float[]) null, Shader.TileMode.CLAMP));
            if (AnonymousClass1GD.A03() && (paint = this.A0C) != null) {
                RectF rectF6 = this.A00;
                paint.setShader(new LinearGradient(rectF6.left, rectF6.top, rectF6.right, rectF6.bottom, new int[]{this.A08, 0}, new float[]{0.0f, 0.4f}, Shader.TileMode.CLAMP));
            }
        }
        if (this.A0H && this.A0J) {
            JTO.A0D(this.A0F).setBounds(new Rect(rect2.left, rect2.top, rect2.right, (rect2.bottom - ((int) A00())) - 8));
        }
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public /* synthetic */ C59704JUm(Context context, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        float f;
        float f2;
        int i4;
        int i5;
        boolean z5 = z2;
        boolean z6 = z3;
        boolean z7 = z4;
        if ((i3 & 2) != 0) {
            f = AnonymousClass7TE.A01(context.getResources(), R.dimen.abc_dialog_padding_top_material);
        } else {
            f = 0.0f;
        }
        if ((i3 & 16) != 0) {
            f2 = AnonymousClass7TE.A01(context.getResources(), R.dimen.iconic_note_entry_point_stroke_width);
        } else {
            f2 = 0.0f;
        }
        if ((i3 & 32) != 0) {
            i4 = context.getColor(R.color.facepile_inner_stroke_color);
        } else {
            i4 = 0;
        }
        if ((i3 & 64) != 0) {
            i5 = context.getColor(R.color.track_background_color);
        } else {
            i5 = 0;
        }
        z = (i3 & 128) != 0 ? true : z;
        z5 = (i3 & 512) != 0 ? false : z5;
        z6 = (i3 & 1024) != 0 ? true : z6;
        z7 = (i3 & C249703kE.FLAG_MOVED) != 0 ? false : z7;
        this.A0A = context;
        this.A01 = f;
        this.A03 = i;
        this.A09 = i2;
        this.A07 = i4;
        this.A08 = i5;
        this.A0I = z;
        this.A0G = z5;
        this.A0H = z6;
        this.A0J = z7;
        this.A04 = AnonymousClass7TG.A03(context);
        this.A06 = AnonymousClass7TG.A07(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(z5 ? R.dimen.ab_test_media_thumbnail_preview_item_internal_padding : R.dimen.abc_dialog_padding_top_material);
        this.A05 = dimensionPixelSize;
        this.A00 = AnonymousClass7TE.A0Y();
        this.A0E = C51965G9l.A0C();
        Paint A0C2 = JTO.A0C();
        JTO.A1N(A0C2);
        A0C2.setAntiAlias(true);
        A0C2.setStrokeWidth(f2);
        Paint paint = null;
        this.A0D = !z ? null : A0C2;
        Paint A0C3 = JTO.A0C();
        A0C3.setColor(i);
        Paint.Style style = Paint.Style.FILL;
        A0C3.setStyle(style);
        A0C3.setAntiAlias(true);
        if (z6 && !z7) {
            A0C3.setShadowLayer(15.0f, 2.0f, 2.0f, i4);
        }
        this.A0B = A0C3;
        Paint A0C4 = JTO.A0C();
        A0C4.setStyle(style);
        A0C4.setAntiAlias(true);
        if (z && AnonymousClass1GD.A03()) {
            paint = A0C4;
        }
        this.A0C = paint;
        this.A02 = ((float) dimensionPixelSize) / 2.0f;
        this.A0F = AnonymousClass0eN.A01(new MMC(this, 17));
    }

    private final float A01() {
        float f;
        float width;
        float f2;
        float f3;
        boolean z = this.A0G;
        if (!z || ((double) this.A00.width()) <= ((double) this.A05) * 1.5d) {
            float width2 = this.A00.width();
            int i = this.A05;
            int i2 = (width2 > ((float) (i * 4)) ? 1 : (width2 == ((float) (i * 4)) ? 0 : -1));
            RectF rectF = this.A00;
            if (i2 > 0) {
                f = rectF.left;
                width = rectF.width();
                f2 = 3.05f;
            } else {
                int i3 = (rectF.width() > ((float) (i * 3)) ? 1 : (rectF.width() == ((float) (i * 3)) ? 0 : -1));
                RectF rectF2 = this.A00;
                f = rectF2.left;
                width = rectF2.width();
                if (i3 > 0) {
                    f2 = 2.4f;
                } else if (z) {
                    f2 = 2.0f;
                } else {
                    f2 = 2.2f;
                }
            }
            f3 = width / f2;
        } else {
            f = this.A00.left;
            f3 = 36.0f;
        }
        return f + f3;
    }

    private final float A00() {
        return C51967G9n.A00((float) JTP.A06(this), this.A00.height()) * 0.94f;
    }
}
