package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.instagram.android.R;

/* renamed from: X.9WW  reason: invalid class name */
public final class AnonymousClass9WW extends Drawable {
    public final Rect A00;
    public final Drawable A01;
    public final C15904UkT A02;
    public final C306386Ly A03;

    public AnonymousClass9WW(Context context, Drawable drawable, C15904UkT ukT) {
        int i;
        this.A02 = ukT;
        this.A01 = drawable;
        Rect A0W = AnonymousClass7TE.A0W();
        this.A00 = A0W;
        C306386Ly A0s = AnonymousClass7TE.A0s(context, ukT.A04);
        AnonymousClass7TF.A1A(A0s, 002.A0D(ukT.A0I, '@'));
        A0s.A0A(context.getResources().getDimension(R.dimen.achievements_only_you_top_margin));
        AnonymousClass7TE.A1O(context, A0s, R.color.canvas_bottom_sheet_description_text_color);
        A0s.A0D(1.0f, 0.0f, 1.0f, context.getColor(R.color.clips_remix_camera_outer_container_default_background));
        TextPaint textPaint = A0s.A0b;
        textPaint.setFakeBoldText(true);
        A0s.A0N("…", 1, true);
        String str = ukT.A0I;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        textPaint.getTextBounds(str, 0, i, A0W);
        this.A03 = A0s;
    }

    public final int getIntrinsicHeight() {
        C306386Ly r0 = this.A03;
        return r0.A06 + AnonymousClass1GB.A01(r0.A0b.getFontMetrics().descent);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        AnonymousClass7TF.A12(canvas);
        Drawable drawable = this.A01;
        if (drawable != null) {
            AnonymousClass7TG.A0z(canvas, drawable);
        }
        C15904UkT ukT = this.A02;
        float f = (float) ukT.A01;
        float height = (float) (ukT.A00 + this.A00.height() + ukT.A02);
        C306386Ly r1 = this.A03;
        AnonymousClass7TF.A15(canvas, r1, f, height + r1.A0b.getFontMetrics().ascent);
    }
}
