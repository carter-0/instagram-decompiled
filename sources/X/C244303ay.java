package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.3ay  reason: invalid class name and case insensitive filesystem */
public final class C244303ay extends Drawable implements AnonymousClass1MK {
    public boolean A00;
    public final int A01;
    public final Paint A02;
    public final Paint A03;
    public final ImageUrl A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Matrix A08;
    public final Paint A09;
    public final Paint A0A;
    public final Paint A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final Runnable A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public C244303ay(ImageUrl imageUrl, String str, int i, int i2, int i3, int i4) {
        this(imageUrl, str, i, i2, i3, 0, 0, 0, i4, false);
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final int getOpacity() {
        return -1;
    }

    public static void A00(Bitmap bitmap, C244303ay r6) {
        int i = r6.A01 - ((r6.A07 + r6.A06) * 2);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        Rect rect2 = new Rect(0, 0, i, i);
        Matrix matrix = r6.A08;
        AnonymousClass3JT.A0A(matrix, rect, rect2);
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, matrix, r6.A0A);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        r6.A02.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        11Z.A02(r6.A0E);
    }

    public final void A01(Bitmap bitmap) {
        if (bitmap == null) {
            0wb.A03("CircularUrlDrawable#setBitmap with null bitmap", "");
        } else if (this.A0G) {
            0nY.A00().ATE(new AnonymousClass50Z(bitmap, this));
        } else {
            A00(bitmap, this);
        }
    }

    public final void CyF(C226952iF r2, AnonymousClass3LX r3) {
        A01(r3.A01);
    }

    public final int getAlpha() {
        return this.A02.getAlpha();
    }

    public final int getIntrinsicHeight() {
        return this.A01;
    }

    public final int getIntrinsicWidth() {
        return this.A01;
    }

    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
        this.A09.setAlpha(i);
        this.A03.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        canvas.translate((float) bounds.left, (float) bounds.top);
        int i = this.A01;
        int i2 = i / 2;
        if (this.A0H) {
            float f = (float) i2;
            canvas.drawCircle(f, f, f, this.A0B);
        }
        int i3 = this.A06;
        if (i3 > 0 && (this.A0F || this.A00)) {
            float f2 = (float) i2;
            canvas.drawCircle(f2, f2, f2, this.A0C);
        }
        int i4 = this.A07;
        if (i4 > 0 && (this.A0F || this.A00)) {
            float f3 = (float) i2;
            canvas.drawCircle(f3, f3, (float) (i2 - i3), this.A03);
        }
        int i5 = i4 + i3;
        int i6 = (i - (i5 * 2)) / 2;
        canvas.save();
        float f4 = (float) i5;
        canvas.translate(f4, f4);
        if (this.A0F) {
            float f5 = (float) i6;
            canvas.drawCircle(f5, f5, f5, this.A09);
        }
        if (this.A00) {
            float f6 = (float) i6;
            canvas.drawCircle(f6, f6, (float) (i6 - this.A05), this.A02);
        }
        canvas.restoreToCount(save);
    }

    public C244303ay(ImageUrl imageUrl, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.A08 = new Matrix();
        Paint paint = new Paint(3);
        this.A02 = paint;
        boolean z2 = true;
        Paint paint2 = new Paint(1);
        this.A09 = paint2;
        this.A0A = new Paint(3);
        Paint paint3 = new Paint(1);
        this.A03 = paint3;
        Paint paint4 = new Paint(1);
        this.A0C = paint4;
        Paint paint5 = new Paint(1);
        this.A0D = paint5;
        Paint paint6 = new Paint(1);
        this.A0B = paint6;
        this.A0E = new C244313az(this);
        this.A0G = z;
        this.A07 = i2;
        this.A06 = i4;
        this.A01 = i;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint3.setStyle(style);
        paint3.setStrokeWidth((float) i2);
        paint3.setColor(i3);
        paint4.setStyle(style);
        paint4.setStrokeWidth((float) i4);
        paint4.setColor(i5);
        paint5.setStyle(style);
        paint5.setStrokeWidth(0.0f);
        paint5.setColor(0);
        int i8 = i7;
        this.A0F = i7 != 0;
        this.A05 = i6;
        paint2.setStyle(style);
        paint2.setColor(i8);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint6.setStyle(style);
        this.A0H = (i3 != 0 || i2 <= 0) ? false : z2;
        this.A04 = imageUrl;
        if (imageUrl != null) {
            1OO A0J = 1NK.A00().A0J(imageUrl, str);
            A0J.A02(this);
            A0J.A01();
        }
    }

    public C244303ay(ImageUrl imageUrl, String str, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this(imageUrl, str, i, i2, i3, i4, i5, 0, i6, z);
    }
}
