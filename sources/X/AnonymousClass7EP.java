package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.7EP  reason: invalid class name */
public final class AnonymousClass7EP implements C328007Db {
    public AnonymousClass5Gv A00;
    public final Activity A01;
    public final UserSession A02;
    public final C71662eb A03;
    public final C333167Xx A04;

    public final void A00(N8H n8h) {
        C71662eb r2 = this.A03;
        r2.A03(0);
        r2.A01().setBackgroundColor(n8h.A00);
        AnonymousClass0fU.A00(new C71316OiN(this, n8h), r2.A01());
        1Av A002 = 1Au.A00(this.A02);
        Activity activity = this.A01;
        0s0 r5 = A002.A2s;
        AnonymousClass0YZ[] r8 = 1Av.A8a;
        if (!((Boolean) r5.CDM(A002, r8[422])).booleanValue()) {
            AnonymousClass5Gt r1 = new AnonymousClass5Gt(activity, new C315476jx(2131973622));
            View A012 = r2.A01();
            0qQ.A07(A012);
            r1.A03(A012);
            r1.A02();
            r1.A0A = true;
            r1.A04 = new C389219p5();
            AnonymousClass5Gv A003 = r1.A00();
            this.A00 = A003;
            r2.A01().postDelayed(new C51197FqE(A003), 500);
            r5.Epx(A002, true, r8[422]);
        }
    }

    public final View BJd() {
        View view;
        C71662eb r1 = this.A03;
        if (r1.A00 != null) {
            view = r1.A01();
        } else {
            view = r1.A01;
        }
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AnonymousClass7EP(Activity activity, UserSession userSession, C71662eb r3, C333167Xx r4) {
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = activity;
        this.A02 = userSession;
    }
}
