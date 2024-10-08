package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5I5  reason: invalid class name */
public final class AnonymousClass5I5 extends C272124k8 {
    public final /* synthetic */ AnonymousClass43G A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5I5(UserSession userSession, AnonymousClass43G r2) {
        super(userSession);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void A04(UserSession userSession, Object obj) {
        int A03 = AnonymousClass0fD.A03(-1138475925);
        C272104k6 r7 = (C272104k6) obj;
        int A032 = AnonymousClass0fD.A03(-1853324151);
        0qQ.A0B(r7, 1);
        AnonymousClass43G.A01(this.A00, r7.A00, r7.A01);
        AnonymousClass0fD.A0A(-1439655022, A032);
        AnonymousClass0fD.A0A(684066053, A03);
    }

    public final void onFailInBackground(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(-1731690165);
        0qQ.A0B(r5, 0);
        super.onFailInBackground(r5);
        AnonymousClass43G r0 = this.A00;
        0wc A01 = AnonymousClass0kN.A01(r0.A00, r0.A07);
        A01.A00(A01.A00, "direct_http_fetch_pending_request_fail").Cgf();
        AnonymousClass0fD.A0A(-457844012, A03);
    }
}
