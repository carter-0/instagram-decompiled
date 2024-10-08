package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.instagram.android.R;
import java.util.regex.Pattern;

/* renamed from: X.9X6  reason: invalid class name */
public final class AnonymousClass9X6 extends Drawable implements AnonymousClass5MJ {
    public int A00;
    public final Paint A01;
    public final Rect A02;
    public final Drawable A03;
    public final C15904UkT A04;

    public AnonymousClass9X6(Context context, Drawable drawable, C15904UkT ukT) {
        this.A04 = ukT;
        this.A03 = drawable;
        Rect A0W = AnonymousClass7TE.A0W();
        this.A02 = A0W;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(context.getResources().getDimension(R.dimen.achievements_only_you_top_margin));
        AnonymousClass7TE.A1N(context, textPaint, R.color.canvas_bottom_sheet_description_text_color);
        textPaint.setShadowLayer(5.0f, 0.0f, 0.0f, AnonymousClass7TE.A08(context));
        textPaint.setTypeface(AnonymousClass7TG.A0N(context));
        String A002 = A00();
        String A003 = A00();
        Pattern pattern = 0mp.A00;
        textPaint.getTextBounds(A002, 0, A003.length(), A0W);
        this.A01 = textPaint;
    }

    public final /* synthetic */ void EqG() {
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private final String A00() {
        Long l = this.A04.A06;
        if (l != null) {
            return 1G0.A02(l.longValue() - ((long) this.A00));
        }
        throw AnonymousClass7TE.A0y();
    }

    public final C2802350v BzV() {
        return this.A04;
    }

    public final int getDurationInMs() {
        Long l = this.A04.A06;
        if (l != null) {
            long longValue = l.longValue();
            if (longValue > 15000) {
                longValue = 15000;
            }
            return (int) longValue;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void draw(Canvas canvas) {
        AnonymousClass7TF.A12(canvas);
        Drawable drawable = this.A03;
        if (drawable != null) {
            AnonymousClass7TG.A0z(canvas, drawable);
        }
        String A002 = A00();
        C15904UkT ukT = this.A04;
        Rect rect = this.A02;
        float width = (((float) ukT.A04) - ((float) ukT.A01)) - ((float) rect.width());
        float height = ((float) ukT.A02) + (((float) rect.height()) / 2.0f);
        Paint paint = this.A01;
        canvas.drawText(A002, width, height - paint.getFontMetrics().ascent, paint);
        canvas.restore();
    }

    public final void EXC(int i, int i2) {
        this.A00 = i;
    }
}
