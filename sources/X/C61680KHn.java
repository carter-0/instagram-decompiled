package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.KHn  reason: case insensitive filesystem */
public final class C61680KHn extends C268694dq implements Drawable.Callback {
    public int A00;
    public final GradientDrawable A01;
    public final List A02;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        for (Drawable draw : this.A02) {
            draw.draw(canvas);
        }
    }

    public final List A07() {
        return this.A02;
    }

    public final int getIntrinsicHeight() {
        GradientDrawable gradientDrawable = this.A01;
        if (gradientDrawable != null) {
            return gradientDrawable.getIntrinsicHeight();
        }
        return 0;
    }

    public final int getIntrinsicWidth() {
        return this.A00;
    }

    public C61680KHn(Context context) {
        Object obj;
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width);
        Drawable drawable = context.getDrawable(R.drawable.interactive_sticker_background);
        GradientDrawable gradientDrawable = null;
        if (drawable != null) {
            obj = drawable.mutate();
        } else {
            obj = null;
        }
        gradientDrawable = obj instanceof GradientDrawable ? (GradientDrawable) obj : gradientDrawable;
        this.A01 = gradientDrawable;
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A02 = A1C;
        if (gradientDrawable != null) {
            Collections.addAll(A1C, new GradientDrawable[]{gradientDrawable});
        }
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int max = (int) (((float) Math.max((i3 - i) - this.A00, 0)) / 2.0f);
        int i5 = i + max;
        int i6 = i3 - max;
        GradientDrawable gradientDrawable = this.A01;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(i5, i2, i6, i4);
        }
    }
}
