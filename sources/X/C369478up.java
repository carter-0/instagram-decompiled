package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;

/* renamed from: X.8up  reason: invalid class name and case insensitive filesystem */
public final class C369478up extends C306386Ly {
    public final Drawable A00;

    public C369478up(Context context, Integer num, long j) {
        super(context, context.getResources().getDisplayMetrics().widthPixels);
        String A05;
        if (num.intValue() != 0) {
            A05 = 1G0.A01((double) j);
        } else {
            A05 = 1G0.A05(context, (double) j, true);
        }
        int[] iArr = AnonymousClass6LW.A0H;
        int i = iArr[0];
        int i2 = iArr[1];
        Paint paint = AnonymousClass3JT.A00;
        Drawable drawable = context.getDrawable(R.drawable.instagram_clock_pano_outline_24);
        if (drawable != null) {
            BitmapDrawable A02 = AnonymousClass3JT.A02(context, drawable, i, i2);
            this.A00 = A02;
            Resources resources = context.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
            float f = (float) dimensionPixelSize;
            AJB.A08(context, this, (float) resources.getDimensionPixelSize(R.dimen.contextual_sticker_tray_text_size), f, f);
            Resources resources2 = context.getResources();
            0qQ.A0A(resources2);
            C263324Kh.A01(resources2, A02, R.dimen.abc_dialog_padding_material);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A05);
            AJB.A0A(resources2, spannableStringBuilder, iArr, dimensionPixelSize);
            C263324Kh.A03(A02, spannableStringBuilder, AnonymousClass05K.A00, 0, 0, resources2.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material));
            A0L(spannableStringBuilder);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
