package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Wft  reason: case insensitive filesystem */
public final class C19812Wft implements XAF {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ V43 A01;
    public final /* synthetic */ 1WW A02;

    public C19812Wft(UserSession userSession, V43 v43, 1WW r3) {
        this.A02 = r3;
        this.A00 = userSession;
        this.A01 = v43;
    }

    public final /* bridge */ /* synthetic */ Object DTf(C17678Vc9 vc9, Object obj, int i) {
        UserSession userSession = this.A00;
        17i A002 = 17h.A00(userSession);
        V43 v43 = this.A01;
        A002.A03(v43.A04);
        FGv.A04(v43.A01.A0O);
        v43.A04.A0d(userSession);
        C46354Dcy.A02(userSession).A00 = true;
        this.A02.A06("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93", v43);
        return null;
    }
}
