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
import android.text.TextPaint;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.android.R;
import java.util.Calendar;

/* renamed from: X.U0v  reason: case insensitive filesystem */
public final class C14674U0v extends Drawable {
    public Bitmap A00;
    public String A01;
    public ColorStateList A02;
    public final Rect A03;
    public final TextPaint A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final int A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final RectF A0E;
    public final Drawable A0F;

    public C14674U0v(Context context, Integer num) {
        boolean z = true;
        Paint paint = new Paint(1);
        this.A0C = paint;
        this.A0F = context.getDrawable(R.drawable.instagram_calendar_pano_outline_24);
        this.A0B = C51968G9o.A04(context);
        AnonymousClass7TE.A1Q(paint);
        paint.setColor(-16777216);
        TextPaint textPaint = new TextPaint(1);
        this.A04 = textPaint;
        textPaint.setTypeface(AnonymousClass0qo.A00(context).A02(0qm.A11));
        textPaint.setTextSize(0nA.A00(context, 12.5f));
        textPaint.setColor(-16777216);
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.A0A = 0nA.A00(context, 0.5f);
        Integer num2 = AnonymousClass05K.A01;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        if (num == num2) {
            Pxi.A0v(paint, mode);
        } else {
            Pxi.A0v(textPaint, mode);
        }
        this.A0D = new Paint(1);
        this.A0E = new RectF();
        z = num != num2 ? false : z;
        float f = 3.0f;
        this.A05 = 0nA.A00(context, z ? 3.0f : 1.0f);
        this.A06 = 0nA.A00(context, z ? 3.0f : 1.0f);
        this.A07 = 0nA.A00(context, !z ? 1.0f : f);
        this.A09 = 0nA.A00(context, 1.5f);
        this.A08 = 0nA.A00(context, z ? 9.0f : 7.0f);
        this.A03 = new Rect();
        int A032 = DbU.A03(Calendar.getInstance());
        02V.A01(A032, 1, DatePickerDialogModule.ARG_DATE, 31);
        String A0m = C13989Tnp.A0m(A032);
        this.A01 = A0m;
        TextPaint textPaint2 = this.A04;
        0qQ.A0A(A0m);
        textPaint2.getTextBounds(A0m, 0, A0m.length(), this.A03);
        this.A00 = null;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Rect A0X = AnonymousClass7TE.A0X(this);
        if (this.A00 == null) {
            Bitmap createBitmap = Bitmap.createBitmap(A0X.width(), A0X.height(), Bitmap.Config.ARGB_8888);
            this.A00 = createBitmap;
            0qQ.A0A(createBitmap);
            Canvas canvas2 = new Canvas(createBitmap);
            Drawable drawable = this.A0F;
            0qQ.A0A(drawable);
            drawable.draw(canvas2);
            RectF rectF = this.A0E;
            float f = this.A09;
            canvas2.drawRoundRect(rectF, f, f, this.A0C);
            String str = this.A01;
            if (str != null) {
                float centerX = rectF.centerX();
                float f2 = this.A0A;
                float centerY = rectF.centerY();
                Rect rect = this.A03;
                canvas2.drawText(str, centerX - f2, ((centerY - ((float) rect.top)) - C13988Tno.A01(rect.height())) - f2, this.A04);
            }
        }
        Bitmap bitmap = this.A00;
        0qQ.A0A(bitmap);
        canvas.drawBitmap(bitmap, (float) A0X.left, (float) A0X.top, this.A0D);
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        return true;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        Drawable drawable = this.A0F;
        0qQ.A0A(drawable);
        drawable.setBounds(rect);
        RectF rectF = this.A0E;
        rectF.set(rect);
        rectF.left += this.A06;
        rectF.top += this.A08;
        rectF.right -= this.A07;
        rectF.bottom -= this.A05;
        this.A00 = null;
    }

    public final boolean onStateChange(int[] iArr) {
        0qQ.A0B(iArr, 0);
        ColorStateList colorStateList = this.A02;
        if (colorStateList == null) {
            return false;
        }
        AnonymousClass7TE.A1R(this, colorStateList.getColorForState(iArr, this.A0B));
        return true;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.A0F;
        0qQ.A0A(drawable);
        return drawable.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.A0F;
        0qQ.A0A(drawable);
        return drawable.getIntrinsicWidth();
    }

    public final void setAlpha(int i) {
        this.A0D.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0D.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.A02 = colorStateList;
        if (colorStateList != null) {
            AnonymousClass7TE.A1R(this, colorStateList.getColorForState(getState(), this.A0B));
        } else {
            clearColorFilter();
        }
    }
}
