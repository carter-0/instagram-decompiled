package X;

import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.fanclub.settings.repository.FanClubSettingsRecommendationsRepository;
import com.instagram.fanclub.settings.repository.FanClubSettingsRepository;

/* renamed from: X.JiU  reason: case insensitive filesystem */
public final class C60273JiU extends 2YL {
    public final UserSession A00;
    public final C273004lm A01;
    public final FanClubSettingsRepository A02;
    public final LNy A03;
    public final AnonymousClass0r6 A04;
    public final 05G A05;
    public final 05G A06;
    public final AnonymousClass0Ud A07;

    public /* synthetic */ C60273JiU(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        String str2 = userSession.A06;
        C314996jB A002 = C314986jA.A00(userSession);
        C64829Lip A003 = C54975Ha8.A00(userSession);
        FanClubSettingsRepository fanClubSettingsRepository = new FanClubSettingsRepository(new FanClubApi(userSession), A003, (FanClubSettingsRecommendationsRepository) userSession.A01(FanClubSettingsRecommendationsRepository.class, new C58176Ing(userSession, 29)), AnonymousClass2o3.A00(userSession), A002, str2);
        C273004lm A004 = C272994ll.A00(userSession);
        LNy lNy = new LNy(userSession, str);
        0qQ.A0B(str, 2);
        0qQ.A0B(A004, 4);
        this.A00 = userSession;
        this.A02 = fanClubSettingsRepository;
        this.A01 = A004;
        this.A03 = lNy;
        02z A012 = 106.A01(ELA.A00);
        this.A05 = A012;
        this.A07 = A012;
        02z A10 = C51970G9q.A10(false);
        this.A06 = A10;
        this.A04 = MCA.A00(this, new AnonymousClass0r6[]{A10, fanClubSettingsRepository.A03.A0F, fanClubSettingsRepository.A05, fanClubSettingsRepository.A06, fanClubSettingsRepository.A02.A01, fanClubSettingsRepository.A01.A02}, 51);
    }

    public static final void A00(C60273JiU jiU, String str) {
        AnonymousClass7TE.A1Z(new C66187MGy(jiU, str, (AnonymousClass4D7) null, 28), C318116oQ.A00(jiU));
    }
}
