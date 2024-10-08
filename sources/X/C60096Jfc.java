package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jfc  reason: case insensitive filesystem */
public final class C60096Jfc extends C361478gI {
    public final C67346MmN A00;
    public final 1a8 A01 = new 1a8((C269794fh) null);
    public final UserSession A02;
    public final OO6 A03;
    public final String A04;
    public final 05G A05;
    public final 05G A06;

    public final 02z A0E() {
        02z A012 = 106.A01(KQP.A00);
        1a8 r2 = this.A01;
        M1T.A00(this.A03.A01(r2), r2, A012, 2);
        return A012;
    }

    public final void onCleared() {
        this.A01.A01();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60096Jfc(Application application, C67346MmN mmN, UserSession userSession, OO6 oo6) {
        super(application);
        C51972G9s.A1B(application, userSession);
        this.A03 = oo6;
        this.A00 = mmN;
        this.A02 = userSession;
        this.A04 = userSession.A06;
        this.A06 = 106.A01(KQU.A00);
        this.A05 = 106.A01(KQS.A00);
    }
}
