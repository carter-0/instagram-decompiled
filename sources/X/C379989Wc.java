package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.instagram.android.R;

/* renamed from: X.9Wc  reason: invalid class name and case insensitive filesystem */
public final class C379989Wc extends Drawable {
    public final int A00;
    public final int A01;
    public final Drawable A02;
    public final C306386Ly A03;
    public final boolean A04 = true;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (this.A04) {
            int height = getBounds().height();
            C306386Ly r3 = this.A03;
            int i = r3.A0A;
            int i2 = ((this.A01 + this.A00) - i) / 2;
            r3.setBounds(i2, height - r3.A06, i + i2, height);
            r3.draw(canvas);
        }
        Drawable drawable = this.A02;
        int i3 = this.A00 / 2;
        int i4 = this.A01 + i3;
        drawable.setBounds(i3, i3, i4, i4);
        drawable.draw(canvas);
        invalidateSelf();
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        int i;
        int i2 = this.A01 + this.A00;
        if (this.A04) {
            i = this.A03.A06;
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final int getIntrinsicWidth() {
        return this.A01 + this.A00;
    }

    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
        this.A03.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
        this.A03.setColorFilter(colorFilter);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        this.A02.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public C379989Wc(Context context, Drawable drawable, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = drawable;
        Spannable spannable = C306386Ly.A0d;
        C306386Ly A0s = AnonymousClass7TE.A0s(context, AnonymousClass8XF.A01(context));
        A0s.A0M(context.getResources().getText(2131957330));
        A0s.A0F(context.getResources().getColor(R.color.canvas_bottom_sheet_description_text_color));
        this.A03 = A0s;
        AJB.A08(context, A0s, AnonymousClass7TE.A01(context.getResources(), R.dimen.avatar_search_sticker_tray_text_size), 0.0f, 0.0f);
    }
}
