package X;

import android.app.Activity;
import android.app.Application;
import com.instagram.appreciation.analytics.LoggingFanData;
import com.instagram.appreciation.funding.AppreciationBuyAndSendViewModel;
import com.instagram.appreciation.gifting.repository.AppreciationGiftingDataSource;
import com.instagram.common.session.UserSession;

/* renamed from: X.KEa  reason: case insensitive filesystem */
public final class C61599KEa extends C228042kh {
    public final int A00;
    public final int A01;
    public final Activity A02;
    public final LoggingFanData A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final String A06;
    public final String A07;

    /* JADX WARNING: type inference failed for: r9v0, types: [X.KqW, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, X.LHD] */
    public final /* bridge */ /* synthetic */ 2YL create() {
        Activity activity = this.A02;
        Application A0A = JTP.A0A(activity);
        String str = this.A06;
        int i = this.A00;
        int i2 = this.A01;
        String str2 = this.A07;
        UserSession userSession = this.A05;
        LoggingFanData loggingFanData = this.A03;
        LFO lfo = new LFO(userSession, activity, loggingFanData.A03);
        AppreciationGiftingDataSource appreciationGiftingDataSource = new AppreciationGiftingDataSource(userSession);
        0qQ.A0B(userSession, 0);
        Class<C64827Lin> cls = C64827Lin.class;
        ? obj = new Object();
        return new AppreciationBuyAndSendViewModel(A0A, new C64165LRg(loggingFanData, this.A04, userSession), new Object(), obj, (C64827Lin) userSession.A01(cls, new MMZ(28, (Object) lfo, (Object) appreciationGiftingDataSource)), str, str2, i, i2);
    }

    public C61599KEa(Activity activity, LoggingFanData loggingFanData, AnonymousClass0iw r4, UserSession userSession, String str, String str2, int i, int i2) {
        C51974G9v.A1M(userSession, loggingFanData, str);
        0qQ.A0B(str2, 7);
        this.A02 = activity;
        this.A05 = userSession;
        this.A03 = loggingFanData;
        this.A06 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A07 = str2;
        this.A04 = r4;
    }
}
