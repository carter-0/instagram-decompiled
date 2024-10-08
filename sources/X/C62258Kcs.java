package X;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.user.model.User;

/* renamed from: X.Kcs  reason: case insensitive filesystem */
public final class C62258Kcs extends Us8 {
    public View A00;
    public final Context A01;
    public final RelativeLayout A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C270194gL A05;
    public final GradientSpinner A06;
    public final User A07;
    public final AnonymousClass0eM A08 = AnonymousClass1YB.A00(new C73654PhT(this, 49));

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62258Kcs(android.content.Context r4, android.view.View r5, X.AnonymousClass0iw r6, com.instagram.common.session.UserSession r7, X.C270194gL r8, com.instagram.user.model.User r9) {
        /*
            r3 = this;
            r0 = 4
            X.0qQ.A0B(r6, r0)
            android.view.LayoutInflater r1 = X.DbV.A0D(r5)
            r0 = 2131626836(0x7f0e0b54, float:1.888092E38)
            android.view.View r1 = X.DbU.A08(r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.RelativeLayout"
            X.0qQ.A0C(r1, r0)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r0 = 1
            X.0qQ.A0B(r1, r0)
            r3.<init>(r1)
            r3.A00 = r1
            r3.A02 = r1
            r3.A00 = r5
            r3.A07 = r9
            r3.A04 = r7
            r3.A03 = r6
            r3.A01 = r4
            r3.A05 = r8
            r0 = 2131434445(0x7f0b1bcd, float:1.8490704E38)
            android.view.View r0 = X.AnonymousClass7TF.A0F(r1, r0)
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = (com.instagram.ui.widget.gradientspinner.GradientSpinner) r0
            r3.A06 = r0
            r1 = 49
            X.PhT r0 = new X.PhT
            r0.<init>(r3, r1)
            X.0eM r0 = X.AnonymousClass1YB.A00(r0)
            r3.A08 = r0
            android.view.View r2 = r3.A00
            android.widget.RelativeLayout r1 = r3.A02
            r0 = 0
            r1.addView(r2, r0)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r1 = -1
            r0.height = r1
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r0.width = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62258Kcs.<init>(android.content.Context, android.view.View, X.0iw, com.instagram.common.session.UserSession, X.4gL, com.instagram.user.model.User):void");
    }

    public final void A03(View view) {
        RelativeLayout relativeLayout = this.A02;
        relativeLayout.addView(view, 0);
        view.getLayoutParams().height = -1;
        view.getLayoutParams().width = -1;
        relativeLayout.removeView(this.A00);
        this.A00 = view;
    }

    public final View A02() {
        return this.A00;
    }
}
