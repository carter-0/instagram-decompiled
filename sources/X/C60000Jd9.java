package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Jd9  reason: case insensitive filesystem */
public final class C60000Jd9 extends Drawable implements Drawable.Callback {
    public final int A00;
    public final int A01;
    public final C306386Ly A02;
    public final int A03;
    public final Context A04;
    public final C59980Jcp A05;
    public final C46668Dix A06;
    public final List A07;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        int A062 = JTP.A06(this);
        C306386Ly r3 = this.A02;
        int i = r3.A0A;
        int i2 = ((this.A01 + this.A00) - i) / 2;
        r3.setBounds(i2, A062 - r3.A06, i + i2, A062);
        r3.draw(canvas);
        C46668Dix dix = this.A06;
        if (dix.A01) {
            dix.draw(canvas);
            invalidateSelf();
            return;
        }
        this.A05.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public final int getIntrinsicHeight() {
        return this.A01 + this.A00 + this.A03 + this.A02.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A01 + this.A00;
    }

    public final void setAlpha(int i) {
        this.A05.setAlpha(i);
        this.A02.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
        this.A02.setColorFilter(colorFilter);
    }

    public C60000Jd9(Context context, UserSession userSession, List list, int i) {
        Context context2 = context;
        this.A04 = context2;
        List list2 = list;
        this.A07 = list2;
        UserSession userSession2 = userSession;
        int A012 = LPK.A01(context2, userSession2);
        this.A00 = A012;
        int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
        int A022 = LPK.A02(context2, userSession2);
        this.A01 = A022;
        this.A03 = AnonymousClass7TG.A07(context2);
        int A002 = LPK.A00(context2, userSession2);
        this.A05 = new C59980Jcp(context2, Integer.valueOf(R.color.canvas_bottom_sheet_description_text_color), i, A022, A012);
        this.A06 = new C46668Dix(context2, list2, new MIW(this, 56), A022, A012, dimensionPixelOffset, A002);
        Spannable spannable = C306386Ly.A0d;
        C306386Ly A0s = AnonymousClass7TE.A0s(context2, AnonymousClass8XF.A01(context2));
        A0s.A0M(A0s.A0Z.getResources().getText(2131953495));
        this.A02 = A0s;
        JTU.A0h(context2, A0s);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
