package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6tK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C320956tK implements AnonymousClass0hF {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass70F A01;

    public /* synthetic */ C320956tK(UserSession userSession, AnonymousClass70F r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final void Dms(07T r4, AnonymousClass07Z r5) {
        C321266tq r0;
        AnonymousClass70F r2 = this.A01;
        UserSession userSession = this.A00;
        if (r4 == 07T.ON_DESTROY && (r0 = r2.A03) != null) {
            r0.A03();
            AnonymousClass73C A002 = AnonymousClass73B.A00(userSession);
            if (A002 != null) {
                A002.A01();
            }
        }
    }
}
