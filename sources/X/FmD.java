package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

public final class FmD implements C273414mX {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C273384mU A02;
    public final /* synthetic */ C47499E5e A03;
    public final /* synthetic */ C387339m3 A04;

    public final void Cyf() {
    }

    public FmD(Activity activity, UserSession userSession, C273384mU r3, C47499E5e e5e, C387339m3 r5) {
        this.A02 = r3;
        this.A01 = userSession;
        this.A00 = activity;
        this.A03 = e5e;
        this.A04 = r5;
    }

    public final void Cyc() {
        this.A02.EHd();
        if (C48213Eau.A00) {
            UserSession userSession = this.A01;
            Activity activity = this.A00;
            C47499E5e e5e = this.A03;
            C387339m3 r8 = this.A04;
            0qQ.A0B(e5e, 2);
            C46498Dg1 dg1 = new C46498Dg1(activity, userSession);
            dg1.A0C(AnonymousClass7TE.A16(activity, 2131963186), new FO6(20, activity, e5e, userSession, r8));
            dg1.A0A(AnonymousClass7TE.A16(activity, 2131963185), C50099FOp.A00);
            new C49945FFy(dg1).A03(activity);
        }
    }
}
