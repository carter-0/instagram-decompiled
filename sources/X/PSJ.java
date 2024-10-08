package X;

import android.util.Pair;
import com.facebook.msys.mci.AuthData;
import com.instagram.common.session.UserSession;

public final /* synthetic */ class PSJ implements 1aV {
    public final /* synthetic */ 1pE A00;
    public final /* synthetic */ AnonymousClass9HR A01;

    public /* synthetic */ PSJ(1pE r1, AnonymousClass9HR r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void accept(Object obj) {
        1pE r7 = this.A00;
        AnonymousClass9HR r6 = this.A01;
        Pair pair = (Pair) obj;
        AuthData authData = (AuthData) pair.first;
        C74513Pw8 pw8 = (C74513Pw8) pair.second;
        if (pw8.getCount() == 2) {
            for (int i = 0; i < pw8.getCount(); i++) {
                String BF8 = pw8.BF8(i);
                UserSession userSession = r7.A16;
                if (!userSession.A06.equals(BF8) && !1pE.A04(r7, r6, C70882OPz.A00(authData, pw8, 17h.A00(userSession), i))) {
                    1pE.A03(r7, r6, 0);
                }
            }
            return;
        }
        1pE.A03(r7, r6, 0);
    }
}
