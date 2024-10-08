package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.reactions.repository.DirectEmojiReactionsListRepository;

/* renamed from: X.KDu  reason: case insensitive filesystem */
public final class C61593KDu extends C228042kh {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C61593KDu(UserSession userSession, String str, String str2, String str3) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C60227Jhk(new DirectEmojiReactionsListRepository(this.A00, this.A03, this.A02, this.A01));
    }
}
