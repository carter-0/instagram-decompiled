package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EpR  reason: case insensitive filesystem */
public abstract class C49102EpR {
    public static final void A00(Context context, UserSession userSession, List list) {
        0qQ.A0B(userSession, 1);
        C59689JTv.A07(context, 2131957572);
        HashSet A1F = AnonymousClass7TE.A1F();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            1Xj r0 = (1Xj) it.next();
            DbX.A1Q(r0, 1);
            r0.AE7(userSession);
            0sn BDV = r0.A0C.BDV();
            if (BDV == null) {
                BDV = 0sn.A00;
            }
            A1F.addAll(BDV);
        }
        Iterator it2 = A1F.iterator();
        while (it2.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it2);
            Reel A0M = ReelStore.A03(userSession).A0M(A18);
            if (A0M != null) {
                A0M.A1q = true;
                if (A0M.A15(userSession)) {
                    ReelStore.A03(userSession).A0c(A18);
                }
            }
        }
    }
}
