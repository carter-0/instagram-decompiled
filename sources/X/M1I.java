package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.Map;

public final class M1I implements C66520MUy {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C61923KRs A01;
    public final /* synthetic */ K4Y A02;

    public final void getPrimaryCtaAction() {
        C51127Foz foz = new C51127Foz(3);
        K4Y k4y = this.A02;
        DbX.A10(this.A00, AnonymousClass37D.A00);
        String A012 = EXN.A0O.A01();
        1Z9 A002 = C48920EmK.A00();
        C61923KRs kRs = this.A01;
        UserSession userSession = kRs.A01;
        A002.A01(k4y, userSession, foz).A06(A012, 00k.A0U(C317816nt.A00(userSession).A00));
        FFL.A02(C48152EZu.A0C, userSession, "upsell_primary_click", (Map) null, 2);
        C61923KRs.A00(C368278sM.ACCEPT, kRs);
        kRs.A00 = true;
    }

    public M1I(Activity activity, C61923KRs kRs, K4Y k4y) {
        this.A02 = k4y;
        this.A00 = activity;
        this.A01 = kRs;
    }

    public final void getDismissAction() {
        C61923KRs kRs = this.A01;
        if (!kRs.A00) {
            String A002 = AnonymousClass000.A00(1914);
            FFL.A02(C48152EZu.A0C, kRs.A01, A002, (Map) null, 2);
        }
        kRs.A00 = false;
    }

    public final void getSecondaryCtaAction() {
        C61923KRs kRs = this.A01;
        String A002 = AnonymousClass000.A00(389);
        FFL.A02(C48152EZu.A0C, kRs.A01, A002, (Map) null, 2);
        C61923KRs.A00(C368278sM.DECLINE, kRs);
        kRs.A00 = true;
        DbX.A10(this.A00, AnonymousClass37D.A00);
    }
}
