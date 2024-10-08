package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3ih  reason: invalid class name and case insensitive filesystem */
public final class C248853ih extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248853ih(2Lk r7) {
        super("initProfileInstaller", 609119367, 3, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r4 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r4.A04;
        0qQ.A0B(userSession, 0);
        0wc A02 = AnonymousClass0kN.A02(userSession);
        0Aj A002 = A02.A00(A02.A00, AnonymousClass000.A00(3281));
        A002.AAJ("step", "profile_write_start");
        A002.Cgf();
        08G.A00(r4.A01, new C375549Ea(r4), new 0nX(609119367), false);
    }
}
