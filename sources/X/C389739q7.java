package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import com.instagram.android.R;
import com.instagram.user.model.Product;

/* renamed from: X.9q7  reason: invalid class name and case insensitive filesystem */
public final class C389739q7 extends C369528uu implements B2E, C41780B0j {
    public C62565Khv A00;
    public Product A01;
    public boolean A02;
    public boolean A03;
    public final C380069Wl A04;
    public final String A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C389739q7(Context context, String str) {
        this(context, 0nA.A09(context), context.getResources().getDimensionPixelSize(R.dimen.product_sticker_text_size), str);
        0qQ.A0B(context, 1);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A04.draw(canvas);
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A04.onBoundsChange(rect);
    }

    public final String C4F() {
        return this.A04.A0P;
    }

    public final C358868bb C5B() {
        return this.A04.A0D;
    }

    public final int getAlpha() {
        return this.A04.A01;
    }

    public final int getIntrinsicHeight() {
        return this.A04.A04;
    }

    public final int getIntrinsicWidth() {
        return this.A04.A08;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.A04.setAlpha(i);
    }

    public void setTextFormat(C358868bb r2) {
        if (r2 != null) {
            this.A04.A04(r2);
        }
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A04.setBounds(i, i2, i3, i4);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C389739q7(Context context, int i, int i2, String str) {
        this(context, str, i, i2, false, true);
    }

    public C389739q7(Context context, String str, int i, int i2, boolean z, boolean z2) {
        this.A05 = str;
        C380069Wl r2 = new C380069Wl(context, str, i, i2, z);
        this.A04 = r2;
        r2.A0G = z2;
        r2.A05(context.getResources().getString(2131969843), -1);
    }
}
