package X;

import com.facebook.pando.IPandoGraphQLService$Token;
import com.facebook.pando.PandoGraphQLConnectionConfig;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Feu  reason: case insensitive filesystem */
public final class C50585Feu implements C51949G8s {
    public C45407Cvn A00;
    public boolean A01;
    public final UserSession A02;
    public final 1vn A03;
    public final C47289DuI A04;
    public final 17i A05;
    public IPandoGraphQLService$Token token;

    public final Object AUv(AnonymousClass4D7 r26, boolean z) {
        2IS A042 = C41845B3m.A04();
        2IS A043 = C41845B3m.A04();
        Boolean A0R = AnonymousClass7TF.A0R(0Tu.A05, this.A02, 36317341514470464L);
        A042.A02(AnonymousClass000.A00(1269), A0R);
        boolean A1V = AnonymousClass7TF.A1V(A0R);
        Boolean valueOf = Boolean.valueOf(z);
        A042.A02(AnonymousClass000.A00(1326), valueOf);
        boolean A1V2 = AnonymousClass7TF.A1V(valueOf);
        17k.A0E(A1V);
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(new PandoGraphQLConnectionConfig("XDTPendingUsersResponse", "edges", "users", "PendingFollows_At_Pando_Connection_Pagination_Query_users", (String) null, "users_after_cursor", "users_first", (String) null, "users_stream_enabled", "users_stream_initial_count", true));
        return new MC0(6, this, new C51623FxC((AnonymousClass0r6) this.A03.A05(new PandoGraphQLRequest(C41845B3m.A06(A1V2), "PendingFollows", A042.getParamsCopy(), A043.getParamsCopy(), C43388BxQ.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_friendships_pending_users", A1C)), 9));
    }

    public final /* synthetic */ Object AOR(AnonymousClass4D7 r2) {
        return C41845B3m.A0d(new 1XQ());
    }

    public final void CgS() {
        C45407Cvn cvn = this.A00;
        if (cvn != null && cvn.A04 && !cvn.A05) {
            this.token = C44756CkS.A00(cvn, this.A03, 200);
        }
    }

    public /* synthetic */ C50585Feu(UserSession userSession, C47289DuI duI) {
        1vn A012 = 1vm.A01(userSession);
        17i A002 = 17h.A00(userSession);
        AnonymousClass7TF.A1D(A012, 3, A002);
        this.A02 = userSession;
        this.A04 = duI;
        this.A03 = A012;
        this.A05 = A002;
    }
}
