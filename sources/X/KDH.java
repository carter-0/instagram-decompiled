package X;

import android.content.Context;
import com.instagram.brandedcontent.repository.BrandedContentSettingsRepository;
import com.instagram.common.session.UserSession;
import com.instagram.mediakit.analytics.MediaKitEntryPoint;
import com.instagram.mediakit.repository.MediaKitRepository;
import com.instagram.monetization.repository.MonetizationRepository;

public final class KDH extends C228042kh {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public KDH(Context context, AnonymousClass0iw r3, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Context context = this.A00;
        UserSession userSession = this.A02;
        AnonymousClass0iw r4 = this.A01;
        BrandedContentSettingsRepository A002 = C63091KrK.A00(userSession);
        MonetizationRepository A003 = AnonymousClass2o3.A00(userSession);
        LDW A004 = C63313Kuw.A00(userSession);
        A004.A00(MediaKitEntryPoint.BRANDED_CONTENT_SETTINGS);
        AnonymousClass7TF.A1H(userSession, A004);
        return new C60305Jj4(context, A002, r4, userSession, (MediaKitRepository) userSession.A01(MediaKitRepository.class, MMW.A00(A004, userSession, 0)), A003, 1Al.A01(userSession));
    }
}
