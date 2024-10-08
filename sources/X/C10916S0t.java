package X;

import android.net.Uri;
import com.instagram.common.session.UserSession;

/* renamed from: X.S0t  reason: case insensitive filesystem */
public final class C10916S0t {
    public final AnonymousClass0vF A00;

    public final void A00(Uri uri, UserSession userSession, boolean z) {
        1CE r3;
        1Fe r2;
        if (182.A06(0Tu.A05, userSession, 36325471885013990L)) {
            r3 = 1CE.A0A;
            if (z) {
                r2 = 1Fe.A02;
            }
            r2 = 1Fe.A03;
        } else {
            r3 = 1CE.A02;
            r2 = 1Fe.A03;
        }
        this.A00.ATE(new RAV(uri, r2, r3, this));
    }

    public C10916S0t() {
        C61620nx A002 = C61610nw.A00();
        A002.A01 = "VideoSubtitleFetcher";
        this.A00 = new AnonymousClass0vF(A002);
    }
}
