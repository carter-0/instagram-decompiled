package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.reactions.repository.CollectionItemEmojiReactionsListRepository;

public final class KEH extends C228042kh {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public KEH(UserSession userSession, String str, String str2, String str3, String str4) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A03 = str4;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C60227Jhk(new CollectionItemEmojiReactionsListRepository(this.A00, this.A01, this.A02, this.A04, this.A03));
    }
}
