package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;

public final class KAM extends 1P0 {
    public MRV A00;
    public String A01;
    public final /* synthetic */ LG3 A02;

    public KAM(MRV mrv, LG3 lg3, String str) {
        this.A02 = lg3;
        this.A01 = str;
        this.A00 = mrv;
    }

    public final void onFail(C268654dm r6) {
        int A03 = AnonymousClass0fD.A03(1650844737);
        LG3 lg3 = this.A02;
        11Z.A03(new C65848M1o(lg3));
        Context context = lg3.A00;
        C59689JTv.A03(context, context.getResources().getString(2131975944), "DeleteHighlightReel_unknown_error_occured", 0);
        AnonymousClass0fD.A0A(-11522592, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1873542779);
        int A032 = AnonymousClass0fD.A03(1336010352);
        LG3 lg3 = this.A02;
        11Z.A03(new C65848M1o(lg3));
        UserSession userSession = lg3.A05;
        ReelStore A05 = 1OP.A05(userSession);
        String str = this.A01;
        Reel A0M = A05.A0M(str);
        if (A0M != null) {
            for (C255773uh r2 : A0M.A0O(userSession)) {
                if (r2.A0e == C250963mL.MEDIA) {
                    1Xj r0 = r2.A0b;
                    r0.getClass();
                    r0.A4F(str);
                }
            }
            1OP.A05(userSession).A0c(str);
            lg3.A04.A05(new C312456eS(A0M));
        }
        MRV mrv = this.A00;
        if (mrv != null) {
            mrv.D8L();
        }
        AnonymousClass0fD.A0A(1370542398, A032);
        AnonymousClass0fD.A0A(973775680, A03);
    }
}
