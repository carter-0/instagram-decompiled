package X;

import com.instagram.common.session.UserSession;
import com.instagram.friendmap.data.FriendMapRepository;
import java.util.Locale;
import java.util.Set;

public final class NNF extends C228042kh {
    public final UserSession A00;
    public final T6B A01;
    public final C71144Ody A02;
    public final Locale A03;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        T6B t6b = this.A01;
        FriendMapRepository A002 = AnonymousClass4A3.A00(userSession);
        C71144Ody ody = this.A02;
        Set set = XYM.A00;
        Locale locale = this.A03;
        String str = null;
        if (locale != null) {
            str = locale.getCountry();
        }
        return new NdC(userSession, t6b, ody, A002, 00k.A0u(set, str));
    }

    public NNF(UserSession userSession, T6B t6b, C71144Ody ody, Locale locale) {
        AnonymousClass7TG.A1O(userSession, t6b);
        this.A00 = userSession;
        this.A01 = t6b;
        this.A02 = ody;
        this.A03 = locale;
    }
}
