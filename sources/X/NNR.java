package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

public final class NNR extends C228042kh {
    public final UserSession A00;
    public final ImageUrl A01;
    public final O7F A02;
    public final C254793t3 A03;
    public final String A04;
    public final List A05;
    public final boolean A06;

    public NNR(UserSession userSession, ImageUrl imageUrl, O7F o7f, C254793t3 r5, String str, List list, boolean z) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A03 = r5;
        this.A04 = str;
        this.A01 = imageUrl;
        this.A05 = list;
        this.A06 = z;
        this.A02 = o7f;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        C254793t3 r4 = this.A03;
        String str = this.A04;
        return new C53027GhI(userSession, this.A01, this.A02, r4, str, this.A05, this.A06);
    }
}
