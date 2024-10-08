package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Map;

public final class IYW implements C228232l0 {
    public final C55789HnO A00;

    public final /* bridge */ /* synthetic */ void DUE(C301165yf r22, C233162v9 r23, Object obj, Object obj2) {
        C230472pg r16;
        String str;
        C230472pg r5;
        User A2A;
        C255773uh r2 = (C255773uh) obj;
        C250973mM r4 = (C250973mM) obj2;
        C233162v9 r3 = r23;
        AnonymousClass7TG.A1T(r3, r2, r4);
        C233162v9 r6 = C233162v9.TAP_AND_HOLD;
        if (r3 == r6) {
            C55789HnO hnO = this.A00;
            1Xj r52 = r2.A0b;
            if (r52 == null || r52.CcK()) {
                r16 = C230472pg.SPONSORED;
            } else {
                r16 = C230472pg.ORGANIC;
            }
            1Kv r0 = hnO.A02;
            String A0j = AnonymousClass7TG.A0j();
            AnonymousClass4EC r17 = AnonymousClass4EC.COLLECTED_TO_MEMORY;
            C230432pc r1 = hnO.A03;
            C55650Hl9 hl9 = hnO.A01;
            AnonymousClass9J4 r14 = new AnonymousClass9J4(C254373sN.A01(r52), r16, r17, r6, r1, A0j);
            String moduleName = hl9.A01.getModuleName();
            String A06 = C254373sN.A06(G9t.A1B(r52));
            if (r52 == null || (A2A = r52.A2A(hl9.A00)) == null) {
                str = "n/a";
            } else {
                str = A2A.getId();
            }
            UserSession userSession = hl9.A00;
            String A04 = C254373sN.A04(userSession, r52);
            if (r52 == null || r52.CcK()) {
                r5 = C230472pg.SPONSORED;
            } else {
                r5 = C230472pg.ORGANIC;
            }
            r0.DUD(new AnonymousClass9IV(r14, (C253513qu) new HF6(r5, moduleName, A06, str, A04, C309976aE.A02(r2), C309976aE.A03(userSession, r4), System.currentTimeMillis())));
            return;
        }
        throw C51973G9u.A0g(r3, "Wrong signal type in TapAndHoldRealtimeSignalProviderImpl for Stories: ", AnonymousClass7TE.A1A());
    }

    public IYW(C55789HnO hnO) {
        this.A00 = hnO;
    }

    public final Map AUH(String str) {
        return AnonymousClass7TE.A1H();
    }
}
