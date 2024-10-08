package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;

/* renamed from: X.9Wb  reason: invalid class name and case insensitive filesystem */
public final class C379979Wb extends Drawable {
    public final C306386Ly A00;
    public final Context A01;

    public C379979Wb(Context context) {
        0qQ.A0B(context, 1);
        this.A01 = context;
        Resources resources = context.getResources();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(resources.getString(2131953812));
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.accent_edge_thickness);
        Paint paint = AnonymousClass3JT.A00;
        Drawable A05 = AnonymousClass3JT.A05(context, R.drawable.instagram_cake_pano_outline_24, context.getColor(R.color.canvas_bottom_sheet_description_text_color));
        C263324Kh.A01(resources, A05, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        C263324Kh.A02(A05, spannableStringBuilder, 0, 0, dimensionPixelSize);
        Spannable spannable = C306386Ly.A0d;
        C306386Ly A0s = AnonymousClass7TE.A0s(context, resources.getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width));
        A0s.A0L(spannableStringBuilder);
        float A012 = AnonymousClass7TE.A01(resources, R.dimen.audition_flow_footer_button_horizontal_padding);
        float A013 = AnonymousClass7TE.A01(resources, R.dimen.accent_edge_thickness);
        float A014 = AnonymousClass7TE.A01(resources, R.dimen.accent_edge_thickness);
        AnonymousClass7TG.A1N(context, A0s);
        A0s.A0I(AnonymousClass7TG.A0O(context));
        AJB.A0B(A0s, A012, A013, A014);
        this.A00 = A0s;
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A00.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.A00.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A00.A0A;
    }

    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A00.setColorFilter(colorFilter);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        C306386Ly r4 = this.A00;
        float f3 = ((float) r4.A0A) / 2.0f;
        float f4 = ((float) r4.A06) / 2.0f;
        r4.setBounds((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
