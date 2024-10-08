package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.7jD  reason: invalid class name and case insensitive filesystem */
public final class C339197jD extends C268694dq {
    public final int A00;
    public final int A01;
    public final Resources A02;
    public final Drawable A03;
    public final C306386Ly A04;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Drawable drawable = this.A03;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        this.A04.draw(canvas);
    }

    public final List A07() {
        return 00k.A0U(00k.A0X(0sr.A1M(new Drawable[]{this.A03, this.A04})));
    }

    public final int getIntrinsicHeight() {
        int i = this.A04.A06;
        int i2 = this.A00;
        if (i < i2) {
            return i2;
        }
        return i;
    }

    public final int getIntrinsicWidth() {
        return this.A01;
    }

    public /* synthetic */ C339197jD(Context context, Integer num) {
        Drawable drawable;
        int i;
        Resources resources = context.getResources();
        this.A02 = resources;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.achievements_list_container_height);
        int color = context.getColor(R.color.igds_pill_active_text);
        if (num != null) {
            drawable = context.getDrawable(num.intValue());
            if (drawable != null) {
                drawable.setColorFilter(AnonymousClass37O.A00(color));
                drawable.setCallback(this);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            drawable = null;
        }
        this.A03 = drawable;
        int i2 = 0;
        if (num != null) {
            i = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        } else {
            i = 0;
        }
        this.A00 = i;
        i2 = num != null ? resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material) : i2;
        C306386Ly r3 = new C306386Ly(context, dimensionPixelSize);
        C339207jE.A00(context, AnonymousClass0qo.A00(context).A02(0qm.A0u), r3, AnonymousClass05K.A0C);
        r3.A0A((float) resources.getDimensionPixelSize(R.dimen.bio_product_sticker_subtitle_size_smaller));
        r3.A0F(color);
        r3.A0M(context.getString(2131970878));
        r3.A0B(0.0f, 1.33f);
        r3.setCallback(this);
        this.A04 = r3;
        this.A01 = r3.A0A + i + i2;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        float f3 = (float) (this.A01 / 2);
        int A012 = AnonymousClass1GB.A01(f - f3);
        int A013 = AnonymousClass1GB.A01(f + f3);
        Drawable drawable = this.A03;
        if (drawable != null) {
            int i5 = this.A00;
            float f4 = (float) (i5 / 2);
            drawable.setBounds(A012, AnonymousClass1GB.A01(f2 - f4), i5 + A012, AnonymousClass1GB.A01(f4 + f2));
        }
        C306386Ly r4 = this.A04;
        int i6 = A013 - r4.A0A;
        float f5 = (float) (r4.A06 / 2);
        r4.setBounds(i6, AnonymousClass1GB.A01(f2 - f5), A013, AnonymousClass1GB.A01(f2 + f5));
    }
}
