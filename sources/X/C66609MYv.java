package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.MYv  reason: case insensitive filesystem */
public final class C66609MYv {
    public List A00;
    public final UserSession A01;
    public final int A02;
    public final 2Dm A03;

    public static final void A00(C66609MYv mYv, C62320sa r6, 0sP r7) {
        List<2Eq> A0F = mYv.A03.A0C.A0F(AnonymousClass43A.A00);
        int min = Math.min(mYv.A02, A0F.size());
        if (min > 0) {
            A0F = A0F.subList(0, min);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (2Eq r1 : A0F) {
            if (!r1.CUG() && !r1.COb()) {
                A1C.addAll(r1.BRV());
            }
        }
        if (!A1C.isEmpty()) {
            UserSession userSession = mYv.A01;
            1OP r0 = 1OP.$redex_init_class;
            0qQ.A0B(userSession, 0);
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0A("feed/get_latest_reel_media/");
            A0a.A0R(CFP.class, B71.class);
            try {
                A0a.A9m("user_ids", AnonymousClass49G.A01(A1C));
            } catch (IOException e) {
                0KC.A0G("ReelApiUtil", "Failed to convert a collection to json", e);
            }
            1OC A0M = A0a.A0M();
            A0M.A00 = new CHB(1, r7, r6);
            1ES.A06(A0M, 119, false);
        }
    }

    public C66609MYv(UserSession userSession, 2Dm r5) {
        this.A01 = userSession;
        this.A03 = r5;
        this.A02 = DbS.A04(0Tu.A05, userSession, 36593005397803909L);
    }
}
