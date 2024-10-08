package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class LG7 {
    public AnonymousClass2k4 A00 = AnonymousClass2k4.DEFAULT;
    public KKN A01;
    public C331157Pu A02;
    public C331127Pr A03;
    public final C63705L3p A04;
    public final Context A05;
    public final UserSession A06;

    public LG7(Context context, UserSession userSession, C63705L3p l3p) {
        0qQ.A0B(userSession, 2);
        this.A05 = context;
        this.A06 = userSession;
        this.A04 = l3p;
    }

    public final void A00(View view, 0hq r5, C361518gM r6) {
        0qQ.A0B(view, 0);
        KKN A002 = C63133Ks1.A00(this.A06, this.A04);
        A002.A02 = r6;
        A002.setDayNightMode(this.A00);
        0s1 r1 = new 0s1(r5);
        r1.A0A(A002, view.getId());
        r1.A00();
        this.A01 = A002;
    }

    public final void A01(View view, C361518gM r4) {
        FragmentActivity fragmentActivity = this.A05;
        0qQ.A0C(fragmentActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        0hq supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        0qQ.A07(supportFragmentManager);
        A00(view, supportFragmentManager, r4);
    }

    public final void A02(C361518gM r6) {
        UserSession userSession = this.A06;
        KKN A002 = C63133Ks1.A00(userSession, this.A04);
        A002.setDayNightMode(this.A00);
        A002.A02 = r6;
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A0k = false;
        A0W.A0q = false;
        A0W.A03 = 1.0f;
        A0W.A04 = 1.0f;
        A0W.A0x = false;
        DbS.A1S(A0W, true);
        A0W.A0T = A002;
        Context context = this.A05;
        DbZ.A0z(context, A0W, 2131973025);
        A0W.A1C = false;
        A0W.A0O = this.A00;
        C65745Lyz.A00(A0W, this, 3);
        A0W.A1O = false;
        this.A03 = A0W;
        C331157Pu A003 = A0W.A00();
        this.A02 = A003;
        A002.A00 = new C55716HmD(context, A002, A003);
        A003.A03(context, A002);
        this.A01 = A002;
    }
}
