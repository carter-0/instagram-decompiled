package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.KHm  reason: case insensitive filesystem */
public final class C61679KHm extends C268694dq {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final Resources A03;
    public final Drawable A04;
    public final Drawable A05;

    public C61679KHm(Context context, int i) {
        Bitmap bitmap;
        this.A02 = context;
        Resources resources = context.getResources();
        this.A03 = resources;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
        this.A00 = dimensionPixelSize2;
        this.A01 = resources.getDimensionPixelSize(i);
        C244303ay r1 = new C244303ay((ImageUrl) null, (String) null, dimensionPixelSize2, dimensionPixelSize, -1, context.getColor(2Yu.A09(context)));
        Drawable drawable = context.getDrawable(R.raw.meta_ai_icon_gradient_background);
        if (drawable != null) {
            bitmap = C62953Kp5.A00(drawable, dimensionPixelSize2, dimensionPixelSize2);
        } else {
            bitmap = null;
        }
        r1.A01(bitmap);
        r1.setCallback(this);
        this.A04 = r1;
        Drawable drawable2 = context.getDrawable(R.drawable.instagram_icons_exceptions_genai_agent_profile_filled_24);
        if (drawable2 != null) {
            drawable2.setCallback(this);
            this.A05 = drawable2;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A04.draw(canvas);
        this.A05.draw(canvas);
    }

    public final List A07() {
        return 0sr.A1P(new Drawable[]{this.A04, this.A05});
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A00;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        this.A04.setBounds(i, i2, i3, i4);
        Drawable drawable = this.A05;
        float f3 = (float) (this.A01 / 2);
        drawable.setBounds((int) (f - f3), (int) (f2 - f3), (int) (f + f3), (int) (f2 + f3));
    }
}
