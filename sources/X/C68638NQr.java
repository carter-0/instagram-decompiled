package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.NQr  reason: case insensitive filesystem */
public final class C68638NQr extends C268694dq implements Drawable.Callback {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Context A04;
    public final Drawable A05;
    public final GradientDrawable A06;
    public final List A07;

    public C68638NQr(Context context, List list) {
        int i;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.audience_selector_pill_layout_height);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.asset_picker_cell_margin);
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A07 = A1C;
        this.A04 = context;
        Resources resources = context.getResources();
        this.A03 = resources.getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width);
        this.A01 = dimensionPixelSize;
        this.A00 = dimensionPixelSize2;
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height);
        this.A02 = dimensionPixelSize3;
        if (list.size() == 5) {
            i = list.size();
        } else {
            i = 4;
        }
        ON3 on3 = new ON3(context, "standalonefundraisersticker", list, dimensionPixelSize);
        on3.A0B = true;
        on3.A00 = 0.3f;
        on3.A01(dimensionPixelSize3);
        on3.A08 = DbV.A0n(context, R.color.grey_2);
        on3.A01 = i;
        on3.A02 = DbT.A02(list, i);
        on3.A05 = Integer.valueOf(AnonymousClass7TF.A03(context, R.attr.igds_color_text_on_white));
        C244323b0 A002 = on3.A00();
        this.A05 = A002;
        A002.setCallback(this);
        GradientDrawable gradientDrawable = (GradientDrawable) context.getDrawable(R.drawable.interactive_sticker_background).mutate();
        this.A06 = gradientDrawable;
        gradientDrawable.setStroke(resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin), context.getColor(R.color.grey_2));
        Collections.addAll(A1C, new Drawable[]{gradientDrawable, A002});
    }

    public final List A07() {
        return this.A07;
    }

    public final void draw(Canvas canvas) {
        for (Drawable draw : this.A07) {
            draw.draw(canvas);
        }
    }

    public final int getIntrinsicHeight() {
        return (this.A01 + this.A06.getIntrinsicHeight()) - this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A03;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = (i + i3) / 2;
        GradientDrawable gradientDrawable = this.A06;
        int i6 = this.A02;
        gradientDrawable.setBounds(i, this.A00 + i2 + i6, i3, i4);
        Drawable drawable = this.A05;
        drawable.setBounds(i5 - (drawable.getIntrinsicWidth() / 2), i2, i5 + (drawable.getIntrinsicWidth() / 2), this.A01 + i2 + (i6 * 2));
    }
}
