package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

public final class U0W extends Drawable.ConstantState {
    public int A00;
    public int A01;
    public ColorStateList A02;
    public ColorStateList A03 = null;
    public Bitmap A04;
    public Paint A05;
    public PorterDuff.Mode A06;
    public PorterDuff.Mode A07 = AnonymousClass3NY.A08;
    public C18781W1h A08 = new C18781W1h();
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public final void A00(int i, int i2) {
        this.A04.eraseColor(0);
        Canvas canvas = new Canvas(this.A04);
        C18781W1h w1h = this.A08;
        C18781W1h.A00(canvas, C18781W1h.A0G, w1h.A0F, w1h, i, i2);
    }

    public int getChangingConfigurations() {
        return this.A01;
    }

    public final Drawable newDrawable(Resources resources) {
        return new AnonymousClass3NY(this);
    }

    public final Drawable newDrawable() {
        return new AnonymousClass3NY(this);
    }
}
