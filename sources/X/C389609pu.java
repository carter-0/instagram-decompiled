package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.9pu  reason: invalid class name and case insensitive filesystem */
public final class C389609pu extends C299875vz implements C268714ds {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final C40593Aeh A03;
    public final C306386Ly A04;
    public final Drawable A05;
    public final Drawable A06;
    public final Drawable A07;

    public C389609pu(Context context, C40593Aeh aeh) {
        Drawable drawable;
        GradientDrawable gradientDrawable;
        0qQ.A0B(aeh, 2);
        this.A02 = context;
        this.A03 = aeh;
        int A022 = AnonymousClass7TF.A02(context, R.dimen.ad_tag_max_width);
        this.A00 = A022;
        int A023 = AnonymousClass7TF.A02(this.A02, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A01 = A023;
        this.A05 = context.getDrawable(R.drawable.pics_please_sticker_background);
        this.A06 = new C379999Wd(context);
        C19477WaP waP = aeh.A00;
        String A052 = waP.A05();
        C306386Ly r3 = null;
        if (A052 == null || 00l.A0W(A052)) {
            drawable = null;
        } else {
            drawable = context.getDrawable(R.drawable.pics_please_sticker_title_background);
            if ((drawable instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable) != null) {
                gradientDrawable.setColor(ColorStateList.valueOf(waP.A03(context)));
            }
        }
        this.A07 = drawable;
        String A053 = waP.A05();
        if (A053 != null && !00l.A0W(A053)) {
            r3 = AnonymousClass7TF.A0P(context, A023, A022);
            AnonymousClass7TF.A11(this.A02.getResources(), r3, R.dimen.backup_codes_text_size);
            Context context2 = r3.A0Z;
            AnonymousClass7TE.A1O(context2, r3, 2Yu.A0A(context2));
            r3.A0I(AnonymousClass7TG.A0O(context2));
            r3.A09();
            r3.A0M(A053);
        }
        this.A04 = r3;
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Drawable drawable = this.A05;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        this.A06.draw(canvas);
        Drawable drawable2 = this.A07;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        C306386Ly r0 = this.A04;
        if (r0 != null) {
            r0.draw(canvas);
        }
    }

    public final C2802350v BzV() {
        return this.A03;
    }

    public final int getIntrinsicHeight() {
        int i;
        int intrinsicHeight;
        int A022 = AnonymousClass7TF.A02(this.A02, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        String A052 = this.A03.A00.A05();
        if (A052 == null || A052.length() != 0) {
            C306386Ly r2 = this.A04;
            if (r2 != null) {
                i = ((this.A01 * 2) + r2.A06) - r2.A08;
            } else {
                i = 0;
            }
            intrinsicHeight = i + this.A06.getIntrinsicHeight();
        } else {
            intrinsicHeight = this.A06.getIntrinsicHeight();
        }
        return intrinsicHeight + (A022 * 2);
    }

    public final int getIntrinsicWidth() {
        return this.A00;
    }

    public final List A07() {
        return AnonymousClass7TE.A1C();
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        super.setBounds(i, i2, i3, i4);
        int i6 = (int) (((float) (i + i3)) / 2.0f);
        C306386Ly r4 = this.A04;
        if (r4 != null) {
            i5 = ((this.A01 * 2) + r4.A06) - r4.A08;
        } else {
            i5 = 0;
        }
        int A022 = AnonymousClass7TF.A02(this.A02, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        Drawable drawable = this.A05;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3, i4);
        }
        int i7 = i5 + i2;
        this.A06.setBounds(i, i7 + A022, i3, i4 - A022);
        Drawable drawable2 = this.A07;
        if (drawable2 != null) {
            drawable2.setBounds(i, i2, i3, i7);
        }
        if (r4 != null) {
            int i8 = r4.A08;
            int i9 = (int) (((float) r4.A0A) / 2.0f);
            int i10 = this.A01 + i2;
            r4.setBounds(i6 - i9, i10 - i8, i6 + i9, i10 + r4.A06);
        }
    }
}
