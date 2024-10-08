package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.genai.magicmod.consentflow.MagicModConsentMigrator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Hzh  reason: case insensitive filesystem */
public final class C56510Hzh {
    public final UserSession A00;
    public final MagicModConsentMigrator A01;
    public final C56026HrY A02;

    public /* synthetic */ C56510Hzh(UserSession userSession) {
        C56026HrY hrY = new C56026HrY(1Au.A00(userSession), userSession);
        MagicModConsentMigrator magicModConsentMigrator = new MagicModConsentMigrator(userSession, hrY);
        this.A00 = userSession;
        this.A02 = hrY;
        this.A01 = magicModConsentMigrator;
    }

    public static /* synthetic */ void A00(C56510Hzh hzh, boolean z) {
        AnonymousClass19S A022 = AnonymousClass1HX.A02(282852313, 3);
        List A1P = 0sr.A1P(new C362088hK[]{C362088hK.A09, C362088hK.A0B});
        0qQ.A0B(A022, 0);
        if (!z) {
            1Av r3 = hzh.A02.A00;
            long A0R = AnonymousClass7TE.A0R(r3.A6S.CDM(r3, 1Av.A8a[466]));
            if (A0R >= 0) {
                long currentTimeMillis = System.currentTimeMillis();
                UserSession userSession = hzh.A00;
                if (A0R + TimeUnit.HOURS.toMillis(182.A01(DbS.A0J(userSession, 0), userSession, 36601393472016544L)) >= currentTimeMillis) {
                    return;
                }
            }
        }
        AnonymousClass7TE.A1Z(new MHN((Object) A1P, (Object) hzh, (AnonymousClass4D7) null, 24), A022);
    }
}
