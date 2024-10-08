package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jcm  reason: case insensitive filesystem */
public final class C59977Jcm extends Drawable {
    public final int A00;
    public final Context A01;
    public final C59921Jbk A02;
    public final C306386Ly A03;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        C59921Jbk jbk = this.A02;
        jbk.setBounds(getBounds().left, getBounds().top, getBounds().right, JTO.A06(this));
        jbk.draw(canvas);
        int i = jbk.A04 + jbk.A03;
        C306386Ly r3 = this.A03;
        int i2 = r3.A0A;
        int i3 = (i - i2) / 2;
        r3.setBounds(i3, i + this.A00, i2 + i3, r3.A06);
        r3.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        C59921Jbk jbk = this.A02;
        return jbk.A04 + jbk.A03 + this.A00 + this.A03.A06;
    }

    public final int getIntrinsicWidth() {
        C59921Jbk jbk = this.A02;
        return jbk.A04 + jbk.A03;
    }

    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
        this.A03.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
        this.A03.setColorFilter(colorFilter);
    }

    public C59977Jcm(Context context, UserSession userSession, String str, int i) {
        Context context2 = context;
        this.A01 = context2;
        UserSession userSession2 = userSession;
        this.A02 = new C59921Jbk(context2, (Drawable) null, (Drawable) null, str, 182.A06(0Tu.A05, userSession2, 36319385916349631L) ? R.dimen.audience_lists_text_in_badge_horizontal_margin_right : R.dimen.abc_button_inset_vertical_material, i, LPK.A00(context2, userSession2), LPK.A02(context2, userSession2), 1920, true);
        Spannable spannable = C306386Ly.A0d;
        C306386Ly A0s = AnonymousClass7TE.A0s(context2, AnonymousClass8XF.A01(context2));
        A0s.A0M(A0s.A0Z.getResources().getText(2131953495));
        this.A03 = A0s;
        this.A00 = AnonymousClass7TG.A07(context2);
        JTU.A0h(context2, A0s);
    }
}
