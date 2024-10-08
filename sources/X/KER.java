package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.consideration.FanClubCustomizedBenefitsRepository;
import java.util.List;

public final class KER extends C228042kh {
    public final Application A00;
    public final UserSession A01;
    public final C273004lm A02;
    public final FanClubCustomizedBenefitsRepository A03;
    public final String A04;
    public final List A05;

    public /* synthetic */ KER(Application application, UserSession userSession, String str, List list) {
        FanClubCustomizedBenefitsRepository fanClubCustomizedBenefitsRepository = new FanClubCustomizedBenefitsRepository(userSession);
        C273004lm A002 = C272994ll.A00(userSession);
        C51974G9v.A1M(list, userSession, str);
        0qQ.A0B(A002, 6);
        this.A00 = application;
        this.A05 = list;
        this.A01 = userSession;
        this.A04 = str;
        this.A03 = fanClubCustomizedBenefitsRepository;
        this.A02 = A002;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Application application = this.A00;
        UserSession userSession = this.A01;
        String str = this.A04;
        List list = this.A05;
        return new C60106Jfm(application, userSession, this.A02, this.A03, str, list);
    }
}
