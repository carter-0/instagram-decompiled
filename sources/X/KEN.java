package X;

import android.app.Activity;
import com.instagram.appreciation.analytics.LoggingFanData;
import com.instagram.appreciation.gifting.repository.AppreciationGiftingDataSource;
import com.instagram.appreciation.gifting.repository.AppreciationGiftingRepository;
import com.instagram.common.session.UserSession;

public final class KEN extends C228042kh {
    public final Activity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public KEN(Activity activity, AnonymousClass0iw r2, UserSession userSession, String str, String str2, String str3) {
        C51974G9v.A1P(userSession, str, str2, str3);
        this.A02 = userSession;
        this.A05 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = r2;
        this.A00 = activity;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Kqc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, X.Kqa] */
    public final /* bridge */ /* synthetic */ 2YL create() {
        String A012 = C2818159r.A01();
        UserSession userSession = this.A02;
        AppreciationGiftingRepository appreciationGiftingRepository = new AppreciationGiftingRepository(new AppreciationGiftingDataSource(userSession), new Object(), A012, AnonymousClass7TG.A0j());
        ? obj = new Object();
        LPB lpb = new LPB(new LoggingFanData(A012, this.A05, this.A03, this.A04), this.A01, userSession);
        LCZ lcz = new LCZ(02m.A0p);
        LFO lfo = new LFO(userSession, this.A00, A012);
        0qQ.A0B(userSession, 0);
        return new C60301Jiz(lpb, lcz, (C64823Lij) userSession.A01(C64823Lij.class, new MMI(lfo, 0)), obj, appreciationGiftingRepository);
    }
}
