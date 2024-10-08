package X;

import android.app.Activity;
import android.app.Application;
import com.instagram.appreciation.analytics.LoggingFanData;
import com.instagram.appreciation.funding.AppreciationFundingViewModel;
import com.instagram.common.session.UserSession;

public final class KED extends C228042kh {
    public final int A00;
    public final Activity A01;
    public final LoggingFanData A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;

    /* JADX WARNING: type inference failed for: r10v0, types: [java.lang.Object, X.LHE] */
    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, X.LHD] */
    public final /* bridge */ /* synthetic */ 2YL create() {
        Activity activity = this.A01;
        Application A0A = JTP.A0A(activity);
        int i = this.A00;
        LoggingFanData loggingFanData = this.A02;
        String str = loggingFanData.A03;
        UserSession userSession = this.A04;
        LFO lfo = new LFO(userSession, activity, str);
        Object obj = new Object();
        0qQ.A0B(userSession, 0);
        Class<C64826Lim> cls = C64826Lim.class;
        ? obj2 = new Object();
        C64165LRg lRg = new C64165LRg(loggingFanData, this.A03, userSession);
        2BJ A002 = AnonymousClass2BF.A00().A00(userSession);
        return new AppreciationFundingViewModel(A0A, lRg, new Object(), A002, obj2, (C64826Lim) userSession.A01(cls, new MMZ(29, (Object) lfo, obj)), SMf.A00, str, i);
    }

    public KED(Activity activity, LoggingFanData loggingFanData, AnonymousClass0iw r3, UserSession userSession, int i) {
        C51972G9s.A1D(userSession, loggingFanData);
        this.A00 = i;
        this.A01 = activity;
        this.A04 = userSession;
        this.A02 = loggingFanData;
        this.A03 = r3;
    }
}
