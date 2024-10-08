package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.Tvo  reason: case insensitive filesystem */
public final class C14419Tvo {
    public static final C20998X8v A01 = new C66636Ma5(1);
    public static final C20980X7u A02 = new C14141Tqb(1);
    public final C14016ToI A00;

    public final synchronized void A00(Hashtag hashtag) {
        0qQ.A0B(hashtag, 0);
        this.A00.A04(hashtag);
    }

    public C14419Tvo(UserSession userSession) {
        this.A00 = new C14016ToI(userSession, A01, A02, 100);
    }
}
