package X;

import com.instagram.common.session.UserSession;

public final class EKA extends AnonymousClass799 {
    public final UserSession A00;
    public final 2Er A01;
    public final 1Av A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EKA(UserSession userSession, 2Er r3) {
        super(2131972679);
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = r3;
        this.A02 = 1Au.A00(userSession);
    }

    public final boolean A00() {
        if (DbT.A00(this.A02.A01, C273654mx.A00(266)) < 1) {
            return false;
        }
        return true;
    }

    public final boolean A01() {
        if (!C3268378i.A00(this.A00, this.A01) || DbT.A00(this.A02.A01, C273654mx.A00(266)) >= 1) {
            return false;
        }
        return true;
    }

    public final void DsH(AnonymousClass5Gv r5) {
        0xa r2 = this.A02.A01;
        0xY AR4 = r2.AR4();
        String A002 = C273654mx.A00(266);
        AR4.E5Z(A002, DbT.A00(r2, A002) + 1);
        AR4.E5c(C273654mx.A00(2265), System.currentTimeMillis());
        AR4.apply();
    }
}
