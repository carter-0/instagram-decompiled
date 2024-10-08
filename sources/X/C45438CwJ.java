package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CwJ  reason: case insensitive filesystem */
public final class C45438CwJ {
    public final List A00(Context context, UserSession userSession, 1Xj r12, boolean z) {
        List<DSU> Av2;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 1);
        Context context2 = context;
        if (182.A06(0Tu.A05, userSession, 36323083883129677L)) {
            List<AnonymousClass5DY> Av3 = r12.A0C.Av3();
            if (Av3 != null) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (AnonymousClass5DY r5 : Av3) {
                    A1C.add(new H3S(context2, r5, userSession2, r5.getId(), ""));
                }
                return A1C;
            }
        } else {
            1Xy r0 = r12.A0C;
            if (z) {
                List<DSZ> Av22 = r0.Av2();
                if (Av22 != null) {
                    ArrayList A1C2 = AnonymousClass7TE.A1C();
                    for (DSZ dsz : Av22) {
                        String Bxs = dsz.Bxs();
                        if (Bxs != null) {
                            A1C2.add(new H3S(context2, (AnonymousClass5DY) null, userSession2, dsz.Bxn(), Bxs));
                        }
                    }
                    return A1C2;
                }
            } else {
                C67231sQ clipsMetadata = r0.getClipsMetadata();
                if (!(clipsMetadata == null || (Av2 = clipsMetadata.Av2()) == null)) {
                    ArrayList A1C3 = AnonymousClass7TE.A1C();
                    for (DSU dsu : Av2) {
                        String Bxs2 = dsu.Bxs();
                        if (Bxs2 != null) {
                            A1C3.add(new H3S(context2, (AnonymousClass5DY) null, userSession2, dsu.Bxn(), Bxs2));
                        }
                    }
                    return A1C3;
                }
            }
        }
        return 0sn.A00;
    }
}
