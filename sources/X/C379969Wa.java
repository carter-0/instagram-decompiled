package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.instagram.android.R;

/* renamed from: X.9Wa  reason: invalid class name and case insensitive filesystem */
public final class C379969Wa extends Drawable {
    public final TextPaint A00;
    public final String A01;
    public final int A02;
    public final int A03;
    public final Context A04;
    public final Paint A05;
    public final boolean A06;

    public C379969Wa(Context context, boolean z) {
        this.A04 = context;
        this.A06 = z;
        this.A01 = AnonymousClass7TE.A16(context, 2131956460);
        this.A02 = AnonymousClass7TG.A03(context);
        this.A03 = AnonymousClass7TG.A04(context);
        Paint paint = new Paint();
        AnonymousClass7TE.A1N(context, paint, 2Yu.A0H(context, R.attr.igds_color_creation_tools_blue));
        this.A05 = paint;
        TextPaint textPaint = new TextPaint();
        AnonymousClass7TE.A1N(context, textPaint, 2Yu.A0A(context));
        textPaint.setTextSize(AnonymousClass7TE.A01(context.getResources(), R.dimen.autocomplete_dropdown_header_text_size));
        textPaint.setAntiAlias(true);
        this.A00 = textPaint;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect A0L = AnonymousClass7TG.A0L(this, canvas2);
        canvas2.save();
        canvas2.rotate(-5.0f, A0L.exactCenterX(), A0L.exactCenterY());
        boolean z = this.A06;
        if (!z) {
            canvas2.drawRoundRect((float) A0L.left, (float) A0L.top, (float) A0L.right, (float) A0L.bottom, 30.0f, 30.0f, this.A05);
        }
        TextPaint textPaint = this.A00;
        String str = this.A01;
        int measureText = (int) textPaint.measureText(str);
        int descent = (int) (textPaint.descent() - textPaint.ascent());
        float centerX = ((float) A0L.centerX()) - (((float) measureText) / 2.0f);
        float centerY = (((float) A0L.centerY()) + (((float) descent) / 2.0f)) - textPaint.descent();
        if (!z) {
            canvas2.drawText(str, centerX, centerY, textPaint);
        }
        canvas2.restore();
    }

    public final int getIntrinsicHeight() {
        TextPaint textPaint = this.A00;
        return ((int) (textPaint.descent() - textPaint.ascent())) + (this.A03 * 2);
    }

    public final int getIntrinsicWidth() {
        return ((int) this.A00.measureText(this.A01)) + (this.A02 * 2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
        this.A00.setColorFilter(colorFilter);
    }
}
