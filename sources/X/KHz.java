package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class KHz extends U1J {
    public final int A00;

    public KHz(Drawable drawable, int i) {
        super((Resources) null, (U0V) null);
        this.A00.A01 = drawable;
        drawable.setCallback(this);
        this.A00 = i;
    }

    public final void A00() {
        Rect A0X = AnonymousClass7TE.A0X(this);
        U0V u0v = this.A00;
        int level = u0v.A01.getLevel();
        int width = A0X.width();
        int i = this.A00;
        int i2 = (int) (((float) ((width + i) * (level % 5000))) / 5000.0f);
        u0v.A01.setBounds((-i) + i2, A0X.top, i2, A0X.bottom);
    }
}
