package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3pz  reason: invalid class name and case insensitive filesystem */
public final class C252963pz extends C252973q0 {
    public final int A00;
    public final C238833Dp A01;
    public final 1Ng A02;
    public final UserSession A03;
    public final C247733gp A04;
    public final 1Xj A05;
    public final User A06;
    public final String A07 = "comment_owner";
    public final boolean A08;

    public final void onClick(View view) {
        String str;
        0qQ.A0B(view, 0);
        this.A01.A0B(view, new String[0]);
        C247733gp r0 = this.A04;
        if (r0 != null) {
            str = r0.A0G;
            if (r0.A0Z == AnonymousClass05K.A00) {
                C240443Kx.A00(this.A03).Eaj(str);
            }
        } else {
            str = null;
        }
        if (!this.A08) {
            this.A02.A00(new C240253Ke(this.A05, this.A06, this.A07, str, false));
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        textPaint.setColor(this.A00);
        0oh.A06((Context) null, Typeface.create("sans-serif-medium", 0), textPaint, AnonymousClass05K.A01);
        this.A00 = textPaint.getColor();
    }

    public C252963pz(UserSession userSession, C247733gp r3, 1Xj r4, User user, int i, boolean z) {
        this.A03 = userSession;
        this.A06 = user;
        this.A05 = r4;
        this.A00 = i;
        this.A04 = r3;
        this.A08 = z;
        this.A02 = AnonymousClass1Nd.A00(userSession);
        C238833Dp A002 = C238833Dp.A00(userSession);
        0qQ.A07(A002);
        this.A01 = A002;
    }
}
