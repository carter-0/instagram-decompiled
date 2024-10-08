package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7Lh  reason: invalid class name and case insensitive filesystem */
public final class C330067Lh {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C333517Zg A04;

    public C330067Lh(AnonymousClass0iw r2, UserSession userSession, C333517Zg r4) {
        0qQ.A0B(r4, 3);
        this.A03 = userSession;
        this.A02 = r2;
        this.A04 = r4;
    }

    public final void A00() {
        UserSession userSession = this.A03;
        if (182.A06(0Tu.A06, userSession, 36329968715776396L)) {
            0wc A012 = AnonymousClass0kN.A01(this.A02, userSession);
            0Aj A002 = A012.A00(A012.A00, "ig_business_chat_animated_header_impression");
            List BRZ = this.A04.C6l().BRZ();
            if (BRZ.size() == 1) {
                A002.A9F("consumer_igid", Long.valueOf(Long.parseLong(userSession.A06)));
                A002.A9F("business_igid", Long.valueOf(Long.parseLong(((User) BRZ.get(0)).getId())));
                A002.AAJ("platform", "android");
                A002.Cgf();
            }
        }
    }
}
