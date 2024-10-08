package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.keyword.Keyword;

/* renamed from: X.Tvp  reason: case insensitive filesystem */
public final class C14420Tvp implements 0lm {
    public static final C20998X8v A01 = new C66636Ma5(2);
    public static final C20980X7u A02 = new C14141Tqb(2);
    public final C14016ToI A00;

    public final synchronized void A00(Keyword keyword) {
        0qQ.A0B(keyword, 0);
        this.A00.A04(keyword);
    }

    public final void onUserSessionWillEnd(boolean z) {
        if (z) {
            synchronized (this) {
                this.A00.A03();
            }
        }
    }

    public C14420Tvp(UserSession userSession) {
        this.A00 = new C14016ToI(userSession, A01, A02, 100);
    }
}
