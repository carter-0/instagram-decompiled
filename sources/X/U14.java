package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;

public final class U14 extends Drawable {
    public float A00;
    public ColorStateList A01;
    public String A02;
    public String A03;
    public int A04 = 255;
    public Bitmap A05;
    public boolean A06;
    public final Paint A07;
    public final String A08;
    public final int A09;
    public final Paint A0A;
    public final Rect A0B;
    public final RectF A0C;

    private void A00() {
        this.A06 = true;
        Paint paint = this.A07;
        String str = this.A02;
        int length = str.length();
        Rect rect = this.A0B;
        paint.getTextBounds(str, 0, length, rect);
        rect.offsetTo(0, 0);
        setBounds(0, 0, rect.width(), rect.height());
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        return true;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        if (this.A06) {
            Bitmap bitmap = this.A05;
            if (bitmap != null) {
                if (bitmap.getWidth() == AnonymousClass7TF.A06(this) && this.A05.getHeight() == JTP.A06(this)) {
                    this.A05.eraseColor(0);
                    Canvas canvas2 = new Canvas(this.A05);
                    RectF rectF = this.A0C;
                    C13988Tno.A0v(rectF, this);
                    float f = (float) this.A09;
                    rectF.inset(f, f);
                    Paint paint = this.A0A;
                    paint.setColor(this.A01.getColorForState(getState(), 0));
                    paint.setAlpha(this.A04);
                    float f2 = this.A00;
                    canvas2.drawRoundRect(rectF, f2, f2, paint);
                    canvas2.drawText(this.A03, (float) AnonymousClass7TF.A04(this), ((float) AnonymousClass7TF.A05(this)) + (((float) this.A0B.height()) / 2.0f), this.A07);
                } else {
                    this.A05.recycle();
                }
            }
            this.A05 = Bitmap.createBitmap(AnonymousClass7TF.A06(this), JTP.A06(this), Bitmap.Config.ARGB_8888);
            Canvas canvas22 = new Canvas(this.A05);
            RectF rectF2 = this.A0C;
            C13988Tno.A0v(rectF2, this);
            float f3 = (float) this.A09;
            rectF2.inset(f3, f3);
            Paint paint2 = this.A0A;
            paint2.setColor(this.A01.getColorForState(getState(), 0));
            paint2.setAlpha(this.A04);
            float f22 = this.A00;
            canvas22.drawRoundRect(rectF2, f22, f22, paint2);
            canvas22.drawText(this.A03, (float) AnonymousClass7TF.A04(this), ((float) AnonymousClass7TF.A05(this)) + (((float) this.A0B.height()) / 2.0f), this.A07);
        }
        Bitmap bitmap2 = this.A05;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            0wb.A03("CounterPillDrawable", "cachebitmap null or recycled");
        } else {
            canvas.drawBitmap(this.A05, 0.0f, 0.0f, (Paint) null);
        }
    }

    public final void setAlpha(int i) {
        this.A04 = i;
        this.A0A.setAlpha(i);
        this.A07.setAlpha(i);
    }

    public U14(Context context, ColorStateList colorStateList, String str, float f, float f2, int i, int i2, int i3, boolean z) {
        String str2;
        Paint paint = new Paint(1);
        this.A0A = paint;
        AnonymousClass7TE.A1Q(paint);
        this.A08 = str;
        this.A09 = i3;
        Paint paint2 = new Paint();
        this.A07 = paint2;
        paint2.setFilterBitmap(true);
        paint2.setAntiAlias(true);
        if (i2 == 0) {
            Pxi.A0v(paint2, PorterDuff.Mode.DST_OUT);
        } else {
            paint2.setColor(i2);
        }
        paint2.setTypeface(AnonymousClass7TG.A0N(context));
        paint2.setTextAlign(Paint.Align.CENTER);
        this.A0B = new Rect();
        this.A0C = new RectF();
        if (i < 100) {
            str2 = String.valueOf(i);
        } else if (z) {
            str2 = C14066TpE.A00(context.getResources(), Integer.valueOf(i), Integer.valueOf(IgNetworkConsentStorage.MAX_ENTRIES), true);
        } else {
            str2 = "99+";
        }
        this.A03 = str2;
        String str3 = this.A08;
        if (str3 != null) {
            str2 = 002.A0R(str3, str2);
            this.A03 = str2;
        }
        this.A02 = str2.replaceAll("\\d", "8");
        A00();
        this.A00 = f;
        A00();
        this.A01 = colorStateList;
        A00();
        A00();
        this.A07.setTextSize(f2);
        A00();
    }

    public final int getIntrinsicHeight() {
        return JTP.A06(this);
    }

    public final int getIntrinsicWidth() {
        return AnonymousClass7TF.A06(this);
    }
}
