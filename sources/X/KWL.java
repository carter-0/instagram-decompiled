package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.instagram.android.R;
import com.instagram.user.model.User;
import java.util.List;

public final class KWL extends KHj {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Drawable A05;
    public final C306386Ly A06;
    public final User A07;

    public KWL(Context context, User user, String str) {
        this.A07 = user;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.achievements_list_container_height);
        this.A03 = dimensionPixelSize;
        int A022 = AnonymousClass7TG.A02(context);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.abc_star_medium);
        this.A02 = dimensionPixelSize2;
        this.A04 = AnonymousClass7TG.A07(context);
        C244303ay r4 = new C244303ay(user.Bh3(), str, dimensionPixelSize2, AnonymousClass7TG.A04(context), context.getColor(2Yu.A05(context)), context.getColor(2Yu.A09(context)));
        r4.setCallback(this);
        this.A05 = r4;
        C306386Ly A0P = AnonymousClass7TF.A0P(context, A022, dimensionPixelSize);
        A0P.A0A((float) C51972G9s.A08(context));
        A0P.A0F(DbV.A01(context));
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.prompt_sticker_title_text_line_spacing_multiplier, typedValue, true);
        A0P.A0B(0.0f, typedValue.getFloat());
        A0P.A0M(user.getUsername());
        A0P.setCallback(this);
        this.A06 = A0P;
        int i = dimensionPixelSize2 / 2;
        this.A00 = i;
        this.A01 = getIntrinsicHeight() - i;
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A05.draw(canvas);
        this.A06.draw(canvas);
    }

    public final List A07() {
        return 0sr.A1P(new Drawable[]{this.A05, this.A06});
    }

    public final int getIntrinsicHeight() {
        return this.A02 + this.A06.A06 + (this.A04 * 2);
    }

    public final int getIntrinsicWidth() {
        return this.A03;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float intrinsicHeight = (((float) (i2 + i4)) / 2.0f) - (((float) getIntrinsicHeight()) / 2.0f);
        Drawable drawable = this.A05;
        drawable.setBounds(JTR.A0A(drawable, f), (int) intrinsicHeight, (int) ((((float) drawable.getIntrinsicWidth()) / 2.0f) + f), (int) (intrinsicHeight + ((float) drawable.getIntrinsicHeight())));
        C306386Ly r6 = this.A06;
        int A062 = JTO.A06(drawable);
        int i5 = this.A04;
        r6.setBounds((int) (f - (((float) r6.A0A) / 2.0f)), A062 + i5, (int) (f + (((float) r6.A0A) / 2.0f)), JTO.A06(drawable) + i5 + r6.A06);
    }
}
