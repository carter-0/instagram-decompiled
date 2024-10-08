package X;

import android.util.Pair;
import android.util.SparseArray;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.2mu  reason: invalid class name and case insensitive filesystem */
public final class C229142mu {
    public C229382nI A00;
    public final UserSession A01;
    public final C227802jw A02;
    public final C228062kj A03;

    public final C229382nI A00() {
        C229382nI r5 = this.A00;
        if (r5 != null) {
            return r5;
        }
        UserSession userSession = this.A01;
        C227802jw r7 = this.A02;
        AnonymousClass4DU r9 = AnonymousClass2kO.A00;
        C229152mv r8 = C229152mv.A00;
        C228062kj r6 = this.A03;
        2el A05 = r6.A05();
        Pair[] pairArr = {Pair.create(Integer.valueOf(R.id.clips_netego_thumbnail_viewpoint_helper), r6.A0N()), Pair.create(Integer.valueOf(R.id.main_feed_session_id_provider), r6.A1x), Pair.create(Integer.valueOf(R.id.clips_netego_controller), r6.A0M()), Pair.create(Integer.valueOf(R.id.main_feed_state_store), r6.A0K())};
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        do {
            Pair pair = pairArr[i];
            sparseArray.put(((Number) pair.first).intValue(), pair.second);
            i++;
        } while (i < 4);
        C229382nI r52 = new C229382nI(sparseArray, r7, r8, r9, userSession, A05);
        this.A00 = r52;
        return r52;
    }

    public C229142mu(UserSession userSession, C227802jw r2, C228062kj r3) {
        this.A01 = userSession;
        this.A02 = r2;
        this.A03 = r3;
    }
}
