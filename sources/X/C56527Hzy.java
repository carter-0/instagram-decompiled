package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hzy  reason: case insensitive filesystem */
public final class C56527Hzy {
    public final AnonymousClass4DU A00;
    public final IPB A01 = A00("instagram_organic_vpvd_imp");
    public final IPB A02 = A00("instagram_ad_vpvd_imp");
    public final Context A03;
    public final UserSession A04;
    public final String A05;

    private final IPB A00(String str) {
        Context context = this.A03;
        UserSession userSession = this.A04;
        Class<C54511HGx> cls = C54511HGx.class;
        1Ua r6 = (1Ua) userSession.A00(cls);
        if (r6 == null) {
            r6 = new 1Ua(context, userSession, "igtv_impression_store");
            userSession.A04(cls, r6);
        }
        return new IPB(new C57468IbC(new C55810Hnq(userSession, this.A00, r6, this.A05, str)), C51972G9s.A0f(userSession));
    }

    public C56527Hzy(Context context, UserSession userSession, AnonymousClass4DU r4, String str) {
        this.A03 = context;
        this.A04 = userSession;
        this.A05 = str;
        this.A00 = r4;
    }
}
