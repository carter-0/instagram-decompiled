package X;

import android.app.Application;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.instagram.common.session.UserSession;

/* renamed from: X.GgE  reason: case insensitive filesystem */
public final class C52961GgE extends C361478gI {
    public final C284945Oz A00;
    public final C284945Oz A01;
    public final UserSession A02;

    public final String A0E() {
        return 002.A0R(C51971G9r.A0q(this.A01), " me");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52961GgE(Application application, UserSession userSession, String str) {
        super(application);
        AnonymousClass7TG.A1O(application, userSession);
        this.A02 = userSession;
        ParcelableSnapshotMutableState A0S = C51970G9q.A0S(HY8.A00(C51967G9n.A0L(str == null ? "" : str)));
        this.A01 = A0S;
        this.A00 = C51969G9p.A0S(A0S.getValue());
    }
}
