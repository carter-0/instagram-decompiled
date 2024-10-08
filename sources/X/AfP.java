package X;

import com.instagram.common.session.UserSession;

public final class AfP implements MUC {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C62320sa A01;
    public final /* synthetic */ C62320sa A02;
    public final /* synthetic */ boolean A03;

    public AfP(UserSession userSession, C62320sa r2, C62320sa r3, boolean z) {
        this.A02 = r2;
        this.A00 = userSession;
        this.A03 = z;
        this.A01 = r3;
    }

    public final void DED() {
        this.A01.invoke();
        UserSession userSession = this.A00;
        boolean z = this.A03;
        Integer num = AnonymousClass05K.A00;
        AnonymousClass9Q7.A06(userSession, "server_setting_updated_failed", (String) null, C378169Ot.A01(num), C367288qV.A06(userSession), z);
    }

    public final void DoV(C383489ff r9) {
        String str;
        this.A02.invoke();
        UserSession userSession = this.A00;
        boolean z = this.A03;
        boolean A1V = AnonymousClass7TF.A1V(r9);
        Integer num = AnonymousClass05K.A00;
        boolean A06 = C367288qV.A06(userSession);
        if (!A1V || !z) {
            str = "OFF";
        } else {
            str = "ON";
        }
        AnonymousClass9Q7.A06(userSession, "server_setting_updated_success", str, C378169Ot.A01(num), A06, z);
    }
}
