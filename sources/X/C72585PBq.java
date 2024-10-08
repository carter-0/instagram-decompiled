package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PBq  reason: case insensitive filesystem */
public final class C72585PBq implements C74333Pt9 {
    public final /* synthetic */ UserSession A00;

    public C72585PBq(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void Ct4(boolean z) {
        C372178zu A002 = C372178zu.A0A.A00();
        if (A002 != null) {
            A002.A04.add(this.A00.A06);
        }
        C66957Mfq A003 = C66957Mfq.A0A.A00();
        if (A003 != null) {
            A003.A03.add(this.A00.A06);
        }
        UserSession userSession = this.A00;
        boolean A1Z = DbX.A1Z(2HM.A00(userSession).A0D);
        1a3 A004 = C65011a4.A00();
        if (A1Z) {
            A004.deactivateUserInstanceSequence(userSession, false, new PVX(userSession));
        } else {
            A004.deactivateUserInstance(userSession, false, new PVY(userSession));
        }
    }
}
