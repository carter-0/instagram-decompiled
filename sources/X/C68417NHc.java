package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NHc  reason: case insensitive filesystem */
public final class C68417NHc extends C272124k8 {
    public final /* synthetic */ 0sP A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68417NHc(0sP r1, UserSession userSession) {
        super(userSession);
        this.A00 = r1;
    }

    public final void onFail(C268654dm r6) {
        int A03 = AnonymousClass0fD.A03(-347308590);
        0qQ.A0B(r6, 0);
        AnonymousClass1XT r2 = (AnonymousClass1XT) r6.A00();
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (r2 == null) {
            A1A.append("failed to set e2ee eligibility via MI. response = ");
            A1A.append(r6);
        } else {
            A1A.append("failed to set e2ee eligibility via MI. error code: ");
            A1A.append(r2.getStatusCode());
            A1A.append(", error message: ");
            A1A.append(r2.getErrorMessage());
        }
        DbT.A1Q(0wj.A01, A1A.toString(), 20131955);
        C51968G9o.A1O(this.A00, false);
        AnonymousClass0fD.A0A(-336547499, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(348080229);
        int A032 = AnonymousClass0fD.A03(-2071104613);
        C51968G9o.A1O(this.A00, true);
        AnonymousClass0fD.A0A(-313372203, A032);
        AnonymousClass0fD.A0A(-1712368192, A03);
    }
}
