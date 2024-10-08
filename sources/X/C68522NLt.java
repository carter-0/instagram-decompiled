package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NLt  reason: case insensitive filesystem */
public final class C68522NLt extends 1P0 {
    public final UserSession A00;
    public final String A01 = "direct_v2/visual_threads";
    public final 0sP A02;

    public C68522NLt(0sP r3, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1555366810);
        1XP r8 = (1XP) obj;
        int A032 = AnonymousClass0fD.A03(1967814075);
        0qQ.A0B(r8, 0);
        1bc A002 = C370748x0.A00();
        UserSession userSession = this.A00;
        A002.A00(userSession);
        String str = this.A01;
        0sP r3 = this.A02;
        0qQ.A0B(userSession, 0);
        C51972G9s.A1C(str, r3);
        if (182.A06(0Tu.A05, userSession, 36318891999697572L)) {
            if (!r8.isOk()) {
                r8.getErrorMessage();
            }
            if (!C51971G9r.A1a(r8, r3)) {
                0KC.A0C("ArmadilloExpressSnapshotInterceptManager", "Invalid response: We may have received encrypted messages from server which are not handled for this endpoint.");
                throw AnonymousClass7TE.A15("Invalid response: We may have received encrypted messages from server which are not handled for this endpoint.");
            }
        }
        AnonymousClass0fD.A0A(601284520, A032);
        AnonymousClass0fD.A0A(-760166987, A03);
    }
}
