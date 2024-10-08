package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.9ps  reason: invalid class name and case insensitive filesystem */
public final class C389589ps extends C299875vz implements C300645xY {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Context A0A;
    public final RectF A0B;
    public final Drawable A0C;
    public final C306386Ly A0D;
    public final C306386Ly A0E;

    public C389589ps(Context context) {
        int i;
        0qQ.A0B(context, 1);
        this.A0A = context;
        Resources resources = context.getResources();
        Drawable drawable = context.getDrawable(R.drawable.instagram_business_images_spa_good_ideas);
        if (drawable != null) {
            this.A0C = drawable;
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.alert_dialog_margin_horizontal);
            this.A05 = dimensionPixelSize;
            int i2 = (dimensionPixelSize * 7) / 10;
            this.A06 = i2;
            this.A0B = AnonymousClass7TE.A0Y();
            this.A02 = AnonymousClass7TE.A09(context);
            this.A03 = resources.getDimensionPixelSize(R.dimen.share_professional_profile_background_corner_radius_without_images);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
            this.A08 = dimensionPixelSize2;
            int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_left);
            this.A09 = dimensionPixelSize3;
            int A0I = AnonymousClass7TE.A0I(resources);
            int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.support_personalized_ads_sticker_secondary_text_size);
            Spannable spannable = C306386Ly.A0d;
            C306386Ly A0s = AnonymousClass7TE.A0s(context, AnonymousClass8XF.A01(context));
            this.A0D = A0s;
            C306386Ly A0s2 = AnonymousClass7TE.A0s(context, AnonymousClass8XF.A01(context));
            this.A0E = A0s2;
            AJB.A06(context, A0s, (float) A0I, 0.0f);
            AJB.A06(context, A0s2, (float) dimensionPixelSize4, 0.0f);
            A0s.A0L(A00(AnonymousClass7TG.A0o(AnonymousClass7TF.A0d(resources, 2131974806))));
            int A022 = AnonymousClass7TH.A02(A0s);
            this.A04 = A022;
            A0s2.A0L(A00(AnonymousClass7TG.A0o(AnonymousClass7TF.A0d(resources, 2131974807))));
            int A023 = AnonymousClass7TH.A02(A0s2);
            this.A07 = A023;
            A0s2.A0E(A023);
            if (A022 > A023) {
                A023 = dimensionPixelSize2 * 2;
                i = A023;
            } else {
                A022 = dimensionPixelSize2 * 2;
                i = A022;
            }
            this.A01 = A022 + A023;
            this.A00 = i2 + i + dimensionPixelSize3 + A0s.A06 + A0s2.A06;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final String C4F() {
        return "support_personalized_ads_sticker_id";
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Paint paint = new Paint();
        paint.setColor(this.A02);
        RectF rectF = this.A0B;
        float f = (float) this.A03;
        canvas.drawRoundRect(rectF, f, f, paint);
        this.A0C.draw(canvas);
        this.A0D.draw(canvas);
        this.A0E.draw(canvas);
    }

    private final SpannableStringBuilder A00(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Context context = this.A0A;
        spannableStringBuilder.setSpan(new C380229Xd(spannableStringBuilder, (float[]) null, new int[]{context.getResources().getColor(2Yu.A0H(context, R.attr.igds_color_gradient_yellow)), context.getResources().getColor(2Yu.A0H(context, R.attr.igds_color_gradient_red))}), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final List A07() {
        return 0sn.A00;
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A01;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = this.A06 + i2;
        Drawable drawable = this.A0C;
        int i6 = (int) (((float) (i + i3)) / 2.0f);
        int i7 = this.A05;
        int i8 = i7 / 2;
        drawable.setBounds(i6 - i8, i2, i8 + i6, i7 + i2);
        this.A0B.set((float) i, (float) i5, (float) i3, (float) i4);
        int i9 = this.A04 / 2;
        int i10 = i5 + this.A08;
        C306386Ly r0 = this.A0D;
        int i11 = r0.A06 + i10;
        r0.setBounds(i6 - i9, i10, i9 + i6, i11);
        int i12 = this.A07 / 2;
        int i13 = i6 - i12;
        int i14 = i11 + this.A09;
        int i15 = i6 + i12;
        C306386Ly r1 = this.A0E;
        r1.setBounds(i13, i14, i15, r1.A06 + i14);
    }
}
