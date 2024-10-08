package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.AbstractCollection;
import java.util.List;

public final class IS7 implements AnonymousClass3YT {
    public final UserSession A00;

    public IS7(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final CharSequence C4o(Context context, UserSession userSession, 1Xj r4, AnonymousClass3W1 r5) {
        0qQ.A0B(context, 0);
        return AnonymousClass7TE.A16(context, 2131976670);
    }

    public final boolean Et3(1Xj r6, AnonymousClass3W1 r7, int i) {
        List A1I;
        String id;
        AbstractCollection abstractCollection;
        0qQ.A0B(r6, 0);
        if (!r6.A56() || !r6.A4u() || (A1I = C51966G9m.A1I(r6)) == null || (id = DbZ.A0T(A1I, 0).getId()) == null || (abstractCollection = (AbstractCollection) r6.A3N().get(id)) == null || !abstractCollection.isEmpty()) {
            return true;
        }
        if (182.A06(0Tu.A05, this.A00, 36326674475857825L)) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ Integer BEK() {
        return null;
    }

    public final /* synthetic */ boolean EtS() {
        return false;
    }

    public final CharSequence Bqi(Context context, UserSession userSession, 1Xj r7, AnonymousClass4DU r8, AnonymousClass3W1 r9) {
        1Xy r1;
        1Xj A0T;
        C51972G9s.A1D(r7, r9);
        if (!r7.A5D() || C51966G9m.A1I(r7) == null) {
            r1 = r7.A0C;
        } else {
            List A1I = C51966G9m.A1I(r7);
            if (A1I == null || (A0T = DbZ.A0T(A1I, r9.A02)) == null) {
                return null;
            }
            r1 = A0T.A0C;
        }
        List BMp = r1.BMp();
        if (BMp != null) {
            return (String) 00k.A0O(BMp, 0);
        }
        return null;
    }

    public final /* synthetic */ List Bqk(1Xj r2, AnonymousClass3W1 r3) {
        return null;
    }

    public final /* synthetic */ boolean Et2(UserSession userSession, 1Xj r3) {
        return false;
    }

    public final /* synthetic */ String BSq(Context context, 1Xj r3, AnonymousClass3W1 r4) {
        return null;
    }

    public final /* synthetic */ boolean Et1(UserSession userSession, 1Xj r3, AnonymousClass3W1 r4) {
        return false;
    }
}
