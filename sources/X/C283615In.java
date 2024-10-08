package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5In  reason: invalid class name and case insensitive filesystem */
public final class C283615In extends 1P0 {
    public final UserSession A00;
    public final C241063Ns A01;

    public C283615In(UserSession userSession, C241063Ns r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final void onFailInBackground(C268654dm r7) {
        int A03 = AnonymousClass0fD.A03(-766511324);
        UserSession userSession = this.A00;
        C46436Dey.A00(userSession, AnonymousClass05K.A1F, "IGFetcherCallback: Failed to fetch promotions", (Throwable) null);
        this.A01.A0K(new C283915Jv((AnonymousClass4W5) null, userSession.A06));
        AnonymousClass0fD.A0A(-727736410, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-179569229);
        AnonymousClass4W5 r7 = (AnonymousClass4W5) obj;
        int A032 = AnonymousClass0fD.A03(1130505584);
        0qQ.A0B(r7, 0);
        C241063Ns r2 = this.A01;
        UserSession userSession = this.A00;
        r2.A0K(new C283915Jv(r7, userSession.A06));
        if (182.A06(0Tu.A05, userSession, 36329453319700612L)) {
            C46436Dey.A00(userSession, AnonymousClass05K.A02, "IGFetcherCallback: success call", (Throwable) null);
        }
        AnonymousClass0fD.A0A(708738284, A032);
        AnonymousClass0fD.A0A(-996622988, A03);
    }
}
