package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public abstract class VEA {
    public static final View A00(Context context, ViewGroup viewGroup, boolean z) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.shopping_loading_placeholder, viewGroup, false);
        ViewGroup A0I = DbX.A0I(inflate, R.id.container);
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        A0I.setPadding(dimensionPixelSize, dimensionPixelSize2, 0, dimensionPixelSize2);
        int i = 0;
        do {
            View inflate2 = LayoutInflater.from(context).inflate(R.layout.merchant_hscroll_loading_placeholder_item, A0I, false);
            int A00 = C17095VHr.A00(context);
            Resources resources2 = context.getResources();
            int A0E = (AnonymousClass7TE.A0E(resources2) * 2) + resources2.getDimensionPixelSize(R.dimen.action_button_settings_height);
            TextPaint textPaint = new TextPaint();
            C13988Tno.A0t(resources2, textPaint, R.dimen.abc_text_size_menu_header_material);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            int A01 = A0E + AnonymousClass1GB.A01(fontMetrics.bottom - fontMetrics.top);
            TextPaint textPaint2 = new TextPaint();
            C13988Tno.A0t(resources2, textPaint2, R.dimen.button_text_size);
            Paint.FontMetrics fontMetrics2 = textPaint2.getFontMetrics();
            int A012 = A01 + AnonymousClass1GB.A01(fontMetrics2.bottom - fontMetrics2.top) + AnonymousClass7TE.A0D(resources2) + (((A00 - (AnonymousClass7TG.A05(context) * 2)) - AnonymousClass7TG.A04(context)) / 2);
            0qQ.A0A(inflate2);
            if (z) {
                A00 = A012;
            }
            0nA.A0g(inflate2, A00, A012);
            if (i > 0) {
                0nA.A0d(inflate2, AnonymousClass7TE.A0C(resources));
            }
            A0I.addView(inflate2);
            i++;
        } while (((float) i) < 2.75f);
        return inflate;
    }
}
