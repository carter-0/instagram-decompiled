package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9EO  reason: invalid class name */
public final class AnonymousClass9EO extends 1P0 {
    public final /* synthetic */ UserSession A00;

    public AnonymousClass9EO(UserSession userSession) {
        this.A00 = userSession;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.9EK, X.11X] */
    public final void onFail(C268654dm r10) {
        int A03 = AnonymousClass0fD.A03(-2146512514);
        0qQ.A0B(r10, 0);
        AnonymousClass9EO.super.onFail(r10);
        0KC.A0O("FxExperimentationHelper", "Error: %s", new Object[]{"Unable to fetch Linked Account FX Status"});
        Throwable A01 = r10.A01();
        if (A01 != null) {
            0wb.A06("FxExperimentationHelper", "Unable to fetch Linked Account FX Status", A01);
        } else {
            0wb.A03("FxExperimentationHelper", "Unable to fetch Linked Account FX Status");
        }
        UserSession userSession = this.A00;
        if (!userSession.hasEnded()) {
            1ES.A04(new AnonymousClass9EK(userSession), 713, 3, (int) AnonymousClass9EJ.A00, true, true);
        }
        AnonymousClass0fD.A0A(-670532758, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-394627135);
        AnonymousClass3JC r7 = (AnonymousClass3JC) obj;
        int A032 = AnonymousClass0fD.A03(1823630116);
        0qQ.A0B(r7, 0);
        UserSession userSession = this.A00;
        if (!182.A06(0Tu.A05, userSession, 36311972802724688L)) {
            AnonymousClass9EJ.A02(userSession, r7);
        }
        AnonymousClass0fD.A0A(1103775869, A032);
        AnonymousClass0fD.A0A(1105829666, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1971063310);
        AnonymousClass3JC r7 = (AnonymousClass3JC) obj;
        int A032 = AnonymousClass0fD.A03(1921176164);
        0qQ.A0B(r7, 0);
        UserSession userSession = this.A00;
        if (182.A06(0Tu.A05, userSession, 36311972802724688L)) {
            AnonymousClass9EJ.A02(userSession, r7);
        }
        AnonymousClass0fD.A0A(1911765239, A032);
        AnonymousClass0fD.A0A(1271628254, A03);
    }
}
