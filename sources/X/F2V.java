package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.concurrent.ConcurrentHashMap;

public final class F2V {
    public final UserSession A00;
    public final 1vn A01;
    public final ConcurrentHashMap A02 = new ConcurrentHashMap(3);
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new C51796G2f(this, 42));

    public F2V(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = 1vm.A01(userSession);
    }

    public final void A00(C46443Df5 df5, String str, int i, boolean z) {
        PandoGraphQLRequest A012;
        0qQ.A0B(str, 1);
        C61076JwE jwE = new C61076JwE(df5, str);
        ConcurrentHashMap concurrentHashMap = this.A02;
        if (!concurrentHashMap.containsKey(jwE)) {
            concurrentHashMap.put(new C61076JwE(df5, str), new Object());
            if (df5 == C46443Df5.FOLLOWERS) {
                A012 = C49302Esl.A00.A00(this.A00, ((User) this.A03.getValue()).A03.B70(), Integer.valueOf(i), "", (String) null, jwE.A01, "");
            } else if (df5 == C46443Df5.FOLLOWING) {
                A012 = C49302Esl.A00.A01(this.A00, ((User) this.A03.getValue()).A03.B70(), Integer.valueOf(i), "", (String) null, (String) null, jwE.A01, "");
            } else {
                return;
            }
            1OC A002 = AnonymousClass9D0.A00(this.A01.A03(A012));
            A002.A00 = new NMH(18, jwE, this);
            int i2 = 2;
            if (z) {
                i2 = 3;
            }
            1ES.A05(A002, 1592315407, i2, true, false);
        }
    }
}
