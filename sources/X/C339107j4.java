package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.7j4  reason: invalid class name and case insensitive filesystem */
public final class C339107j4 extends C268694dq implements C339117j5 {
    public float A00;
    public boolean A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final float A0B;
    public final float A0C;
    public final float A0D;
    public final float A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final Drawable A0I;
    public final ShapeDrawable A0J;
    public final ShapeDrawable A0K;
    public final ShapeDrawable A0L;

    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        canvas.save();
        canvas.rotate(this.A02, (float) getBounds().centerX(), (float) getBounds().centerY());
        Drawable drawable = this.A0I;
        float intrinsicWidth = ((float) this.A0F) / ((float) drawable.getIntrinsicWidth());
        canvas.scale(intrinsicWidth, intrinsicWidth, (float) getBounds().centerX(), (float) getBounds().centerY());
        if (this.A01) {
            i = (int) 0mi.A02(this.A00, 0.0f, 1.0f, 0.0f, 255.0f);
        } else {
            i = 255;
        }
        drawable.setAlpha(i);
        drawable.draw(canvas);
        canvas.restore();
        Rect bounds = getBounds();
        0qQ.A07(bounds);
        float f = ((float) (bounds.left + bounds.right)) / 2.0f;
        float f2 = ((float) (bounds.top + bounds.bottom)) / 2.0f;
        A01(canvas2, this.A0J, f + this.A05, f2 + this.A06, f + this.A03, f2 + this.A04);
        A01(canvas2, this.A0K, f + this.A09, f2 + this.A0A, f + this.A07, f2 + this.A08);
        A01(canvas2, this.A0L, f + this.A0D, f2 + this.A0E, f + this.A0B, f2 + this.A0C);
    }

    public /* synthetic */ C339107j4(Context context, Drawable drawable, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        float f14 = f5;
        float f15 = f4;
        float f16 = f9;
        float f17 = f8;
        float f18 = f13;
        int i9 = i6;
        float f19 = f12;
        int i10 = i3;
        int i11 = i2;
        float f20 = (i6 & 8) != 0 ? 0.0f : f;
        Context context2 = context;
        if ((i6 & 16) != 0) {
            i7 = (int) 0nA.A04(context2, 4);
        } else {
            i7 = 0;
        }
        i11 = (i6 & 32) != 0 ? context2.getColor(R.color.activator_card_progress_bad) : i11;
        float f21 = f2;
        f15 = (i9 & 256) != 0 ? f21 : f15;
        float f22 = f3;
        f14 = (i9 & 512) != 0 ? f22 : f14;
        if ((i9 & 1024) != 0) {
            i8 = context2.getColor(R.color.igds_creation_tools_pink);
        } else {
            i8 = 0;
        }
        float f23 = f6;
        f17 = (i9 & 8192) != 0 ? f23 : f17;
        float f24 = f7;
        f16 = (i9 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? f24 : f16;
        i10 = (32768 & i6) != 0 ? context2.getColor(R.color.igds_creation_tools_purple) : i10;
        float f25 = f10;
        f19 = (262144 & i6) != 0 ? f25 : f19;
        float f26 = f11;
        f18 = (i6 & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0 ? f26 : f18;
        0qQ.A0B(context2, 1);
        this.A0I = drawable;
        this.A0F = i;
        this.A02 = f20;
        this.A03 = f21;
        this.A04 = f22;
        this.A05 = f15;
        this.A06 = f14;
        this.A07 = f23;
        this.A08 = f24;
        this.A09 = f17;
        this.A0A = f16;
        this.A0B = f25;
        this.A0C = f26;
        this.A0D = f19;
        this.A0E = f18;
        this.A0H = i4;
        this.A0G = i5;
        this.A0J = A00(i7, i11);
        this.A0K = A00(i7, i8);
        this.A0L = A00(i7, i10);
    }

    public static final ShapeDrawable A00(int i, int i2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setIntrinsicWidth(i);
        shapeDrawable.setIntrinsicHeight(i);
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(i2);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        shapeDrawable.setBounds(new Rect(0, 0, i, i));
        return shapeDrawable;
    }

    public final List A07() {
        return 0sr.A1M(new Drawable[]{this.A0I, this.A0J, this.A0K, this.A0L});
    }

    public final void EOg(float f) {
        this.A00 = f;
        invalidateSelf();
    }

    public final int getIntrinsicHeight() {
        return this.A0G;
    }

    public final int getIntrinsicWidth() {
        return this.A0H;
    }

    private final void A01(Canvas canvas, Drawable drawable, float f, float f2, float f3, float f4) {
        canvas.save();
        float f5 = this.A00;
        float f6 = 1.0f - 0.0f;
        float f7 = f3 - f;
        float f8 = 0.0f;
        if (f6 != 0.0f) {
            f8 = (f5 - 0.0f) / f6;
        }
        float f9 = (f8 * f7) + f;
        float f10 = f4 - f2;
        float f11 = 0.0f;
        if (f6 != 0.0f) {
            f11 = (f5 - 0.0f) / f6;
        }
        canvas.translate(f9, (f11 * f10) + f2);
        drawable.draw(canvas);
        canvas.restore();
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Drawable drawable = this.A0I;
        int i5 = this.A0F;
        int i6 = ((i3 - i) - i5) / 2;
        float intrinsicHeight = (((float) (i4 - i2)) - (((float) i5) * (((float) drawable.getIntrinsicHeight()) / ((float) drawable.getIntrinsicWidth())))) / 2.0f;
        drawable.setBounds(i + i6, (int) (((float) i2) + intrinsicHeight), i3 - i6, (int) (((float) i4) - intrinsicHeight));
    }
}
