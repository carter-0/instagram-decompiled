package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.H8k  reason: case insensitive filesystem */
public final class C54338H8k extends C230622pv {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ void A00(Object obj, long j, Object obj2) {
        C267324bN r7 = (C267324bN) obj;
        C52058GDe gDe = (C52058GDe) obj2;
        AnonymousClass7TG.A1N(r7, gDe);
        AnonymousClass3OA A07 = r7.A07();
        if (A07 != null) {
            String A0R = 002.A0R("instagram_ad_", "time_spent");
            AnonymousClass4DU r5 = this.A01;
            C254523sc r4 = new C254523sc((C270594gz) null, r5, A0R);
            r4.A0B(j);
            UserSession userSession = this.A00;
            r4.A0K(userSession, A07);
            r4.A6L = this.A02;
            r4.A5W = A07.A0f;
            if (AnonymousClass7TF.A0R(0Tu.A06, userSession, 36330067499958708L).booleanValue()) {
                C52058GDe.A08(r7, gDe, userSession, j);
            }
            C233822wX.A0H(userSession, r4, r5);
        }
    }

    public C54338H8k(UserSession userSession, AnonymousClass4DU r2, String str) {
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = r2;
    }
}
