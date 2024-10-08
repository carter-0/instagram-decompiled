package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import com.instagram.android.R;
import com.instagram.user.model.User;

/* renamed from: X.9q8  reason: invalid class name and case insensitive filesystem */
public final class C389749q8 extends C369558ux implements B2E {
    public final Context A00;
    public final C380069Wl A01;
    public final User A02;
    public final String A03;

    public C389749q8(Context context, User user, String str) {
        0qQ.A0B(str, 2);
        this.A00 = context;
        this.A03 = str;
        this.A02 = user;
        C380069Wl r2 = new C380069Wl(context, this.A03, 0nA.A09(context), context.getResources().getDimensionPixelSize(R.dimen.product_sticker_text_size), false);
        this.A01 = r2;
        r2.A05(AnonymousClass7TG.A0o(AnonymousClass7TE.A16(this.A00, 2131976671)), -1);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A01.draw(canvas);
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A01.onBoundsChange(rect);
    }

    public final String C4F() {
        return this.A03;
    }

    public final C358868bb C5B() {
        return this.A01.A0D;
    }

    public final int getAlpha() {
        return this.A01.A01;
    }

    public final int getIntrinsicHeight() {
        return this.A01.A04;
    }

    public final int getIntrinsicWidth() {
        return this.A01.A08;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
    }

    public final void setTextFormat(C358868bb r2) {
        if (r2 != null) {
            this.A01.A04(r2);
        }
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A01.setBounds(i, i2, i3, i4);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
