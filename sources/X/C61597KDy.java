package X;

import com.instagram.common.session.UserSession;
import com.instagram.igtv.repository.series.IGTVSeriesRepository;
import com.instagram.igtv.repository.user.UserNetworkDataSource;
import com.instagram.igtv.repository.user.UserRepository;

/* renamed from: X.KDy  reason: case insensitive filesystem */
public final class C61597KDy extends C228042kh {
    public final UserSession A00;
    public final C63640L1c A01;
    public final C63777L6j A02;
    public final String A03;

    public C61597KDy(UserSession userSession, C63640L1c l1c, C63777L6j l6j, String str) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = l1c;
        this.A03 = str;
        this.A02 = l6j;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        C63640L1c l1c = this.A01;
        String str = this.A03;
        UserNetworkDataSource userNetworkDataSource = new UserNetworkDataSource(userSession);
        0qQ.A0B(userSession, 0);
        Class<UserRepository> cls = UserRepository.class;
        return new C60280Jib(userSession, l1c, (IGTVSeriesRepository) userSession.A01(IGTVSeriesRepository.class, C66306MMp.A02(userSession, 1)), (UserRepository) userSession.A01(cls, new C58185Inp(43, userNetworkDataSource, userSession)), this.A02, str);
    }
}
