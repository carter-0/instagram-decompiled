package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import java.util.List;

public final class LDQ {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final String A02;
    public final List A03;

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.0JR] */
    public final void A00(Venue venue) {
        UserSession userSession = this.A01;
        KNN knn = new KNN(new Object(), this.A00, userSession, AnonymousClass05K.A0C, true);
        knn.A03();
        List list = this.A03;
        knn.A01("", this.A02, list);
        String A022 = venue.A02();
        0qQ.A07(A022);
        knn.A02(A022, list);
    }

    public LDQ(AnonymousClass0iw r1, UserSession userSession, String str, List list) {
        this.A01 = userSession;
        this.A00 = r1;
        this.A03 = list;
        this.A02 = str;
    }
}
