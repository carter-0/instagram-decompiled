package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data.DictionaryRepository;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.impl.HiddenWordsPostsDictionary;

public final class KDT extends C228042kh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final Integer A02;

    public KDT(AnonymousClass0iw r2, UserSession userSession, Integer num) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
        this.A02 = num;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        C297145rH r0 = null;
        0nV A0V = JTP.A0V(AnonymousClass12T.A00, 104699016);
        Integer num = this.A02;
        Integer num2 = AnonymousClass05K.A01;
        UserSession userSession = this.A01;
        if (num == num2) {
            r0 = new HiddenWordsPostsDictionary(userSession);
        } else {
            MutedWordsFilterManager A002 = AnonymousClass92E.A00(userSession);
            if (A002 != null) {
                r0 = A002.A00;
            }
        }
        return new C60272JiT(new DictionaryRepository(r0), new C63940LEd(this.A00, userSession), A0V, 19E.A02(A0V));
    }
}
