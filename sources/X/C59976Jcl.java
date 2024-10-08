package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jcl  reason: case insensitive filesystem */
public final class C59976Jcl extends Drawable {
    public final C59980Jcp A00;
    public final int A01;
    public final C306386Ly A02;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        C59980Jcp jcp = this.A00;
        jcp.draw(canvas);
        int A06 = JTP.A06(this);
        int i = jcp.A00;
        C306386Ly r3 = this.A02;
        int i2 = r3.A0A;
        int i3 = (i - i2) / 2;
        r3.setBounds(i3, A06 - r3.A06, i2 + i3, A06);
        r3.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.A00.A00 + this.A01 + this.A02.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A00.A00;
    }

    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
        this.A02.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A00.setColorFilter(colorFilter);
        this.A02.setColorFilter(colorFilter);
    }

    public C59976Jcl(Context context, UserSession userSession, int i) {
        this.A00 = new C59980Jcp(context, Integer.valueOf(R.color.canvas_bottom_sheet_description_text_color), i, LPK.A02(context, userSession), LPK.A01(context, userSession));
        Spannable spannable = C306386Ly.A0d;
        C306386Ly A0s = AnonymousClass7TE.A0s(context, AnonymousClass8XF.A01(context));
        A0s.A0M(context.getResources().getText(2131953495));
        this.A02 = A0s;
        this.A01 = AnonymousClass7TG.A07(context);
        JTU.A0h(context, A0s);
    }
}
