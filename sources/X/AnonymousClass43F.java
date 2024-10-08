package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.43F  reason: invalid class name */
public final class AnonymousClass43F {
    public final C262224Cq A00 = 19E.A02(AnonymousClass12T.A00.CO6(1622264421, 3));

    public static final void A00(ImageUrl imageUrl, C262224Cq r4) {
        if (imageUrl != null) {
            C376879Jr r2 = new C376879Jr(imageUrl, (AnonymousClass4D7) null, 23);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r4);
        }
    }

    public final void A01(UserSession userSession, List list) {
        int A01 = (int) 182.A01(0Tu.A05, userSession, 36609051395888918L);
        if (A01 > 0) {
            C262224Cq r3 = this.A00;
            AnonymousClass9KF r2 = new AnonymousClass9KF(this, list, (AnonymousClass4D7) null, A01);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
        }
    }
}
