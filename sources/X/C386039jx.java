package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9jx  reason: invalid class name and case insensitive filesystem */
public final class C386039jx extends C268694dq {
    public boolean A00;
    public final int A01 = 2131974207;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Resources A06;
    public final Drawable A07;
    public final Drawable A08;
    public final C244303ay A09;
    public final C306386Ly A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;

    public final void draw(Canvas canvas) {
        Drawable drawable;
        0qQ.A0B(canvas, 0);
        Drawable drawable2 = this.A08;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if ((!this.A00 && (drawable = this.A09) != null) || (drawable = this.A07) != null) {
            drawable.draw(canvas);
        }
        this.A0A.draw(canvas);
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        int centerY = rect.centerY();
        int i = rect.left;
        int i2 = this.A04;
        int i3 = i2 + i;
        int i4 = this.A02;
        int i5 = centerY - (i4 / 2);
        int i6 = i3 + i4;
        int i7 = i4 + i5;
        C244303ay r0 = this.A09;
        if (r0 != null) {
            r0.setBounds(i3, i5, i6, i7);
        }
        Drawable drawable = this.A07;
        if (drawable != null) {
            drawable.setBounds(i3, i5, i6, i7);
        }
        C306386Ly r3 = this.A0A;
        int i8 = r3.A06 / 2;
        r3.setBounds(i6 + this.A05, centerY - i8, rect.right - i2, centerY + i8);
        Drawable drawable2 = this.A08;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public static final SpannableString A00(C386039jx r4, String str) {
        if (str == null) {
            return new SpannableString(r4.A0B);
        }
        String A0e = AnonymousClass7TF.A0e(r4.A06, str, r4.A01);
        0qQ.A07(A0e);
        int A082 = 00l.A08(A0e, str, 0, false);
        SpannableString spannableString = new SpannableString(A0e);
        spannableString.setSpan(new CharacterStyle(), A082, str.length() + A082, 33);
        return spannableString;
    }

    public final List A07() {
        return this.A0D;
    }

    public final int getIntrinsicHeight() {
        return this.A03;
    }

    public final int getIntrinsicWidth() {
        int i = this.A04;
        return i + this.A02 + this.A05 + this.A0A.A0A + i;
    }

    public C386039jx(Context context, ImageUrl imageUrl, String str, String str2, int i) {
        String str3 = str2;
        this.A0C = str3;
        Resources A0A2 = AnonymousClass7TF.A0A(context);
        this.A06 = A0A2;
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A0D = A1C;
        this.A03 = A0A2.getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
        int dimensionPixelSize = A0A2.getDimensionPixelSize(R.dimen.asset_picker_static_sticker_last_row_padding);
        this.A02 = dimensionPixelSize;
        int A0E = AnonymousClass7TE.A0E(A0A2);
        this.A05 = A0E;
        this.A04 = A0E;
        this.A0B = A0A2.getString(2131974205);
        int dimensionPixelSize2 = A0A2.getDimensionPixelSize(R.dimen.challenge_sticker_subtitle_text_size);
        A0A2.getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height);
        Drawable drawable = context.getDrawable(R.drawable.bottom_sticker_attribution_background);
        this.A08 = drawable;
        if (drawable != null) {
            drawable.mutate();
        }
        setAlpha(128);
        setColorFilter(C9162RRn.A00(AnonymousClass05K.A1I, context.getColor(R.color.chat_sticker_chat_bubble_color)));
        C306386Ly A0s = AnonymousClass7TE.A0s(context, ((i - dimensionPixelSize) - (A0E * 2)) - A0E);
        A0s.A0L(A00(this, str3));
        AnonymousClass7TE.A1O(context, A0s, R.color.countdown_sticker_title_text_color);
        A0s.A0A((float) dimensionPixelSize2);
        A0s.A0C(0.0f, 0.0f);
        A0s.A0G(1, "…");
        A0s.setCallback(this);
        this.A0A = A0s;
        int color = context.getColor(R.color.fds_transparent);
        C244303ay r6 = new C244303ay(imageUrl, str, dimensionPixelSize, 0, color, color);
        r6.setCallback(this);
        this.A09 = r6;
        Drawable drawable2 = context.getDrawable(R.drawable.sticker_attribution_anonymous_avatar);
        this.A07 = drawable2;
        Collections.addAll(A1C, new Drawable[]{this.A09, drawable, A0s, drawable2, null});
    }
}
