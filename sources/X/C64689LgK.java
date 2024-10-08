package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LgK  reason: case insensitive filesystem */
public final class C64689LgK implements 1wn {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C311296cS A01;

    public C64689LgK(C255773uh r1, C311296cS r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-8929611);
        C61149Jy0 jy0 = (C61149Jy0) obj;
        int A0D = AnonymousClass7TG.A0D(jy0, 1196874628);
        C311296cS r8 = this.A01;
        UserSession userSession = r8.A07;
        if (182.A06(0Tu.A05, userSession, 36329723902837029L)) {
            C363388je.A00(userSession).A01(r8.A06, new C65242Lpm(1, jy0, this.A00, r8), "after_new_fbc");
        } else {
            C311296cS.A03(this.A00, jy0, r8);
        }
        AnonymousClass0fD.A0A(-1786719845, A0D);
        AnonymousClass0fD.A0A(1345504476, A03);
    }
}
