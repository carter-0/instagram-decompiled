package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public final class EI9 extends 0ng {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FYV A01;
    public final /* synthetic */ String A02;

    public final void run() {
        1OC A05;
        FYV fyv = this.A01;
        Context context = this.A00;
        String str = this.A02;
        if (str == null) {
            HashSet hashSet = new HashSet(Arrays.asList(new C368098s4[]{C368098s4.FACEBOOK}));
            UserSession userSession = fyv.A00;
            List A03 = AJ0.A03(context, userSession, "fx_ig4a_app_startup_native_auth_token_verification", "FxNativeAuthTokenVerifier", userSession.A06, hashSet);
            if (A03.size() != 0) {
                A03.get(0);
                str = ((C376139Gr) A03.get(0)).A01.A00;
            } else {
                str = null;
            }
        }
        if (str != null) {
            C47699EDi eDi = new C47699EDi(fyv, 1);
            2IS A04 = C41845B3m.A04();
            A04.A04("access_token", str);
            A04.A04("account_type", "FACEBOOK");
            C239113Fa r0 = new C239113Fa(A04, C47106Dqi.class, "IGFxNativeAuthTokenVerificationQuery", false);
            UserSession userSession2 = fyv.A00;
            C239123Fb A012 = C46479Dfi.A01(userSession2);
            A012.A08(r0);
            if (182.A06(0Tu.A05, userSession2, 36312123126907819L)) {
                A05 = A012.A06();
            } else {
                A05 = A012.A05();
            }
            A05.A00 = eDi;
            1ES.A03(A05);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EI9(Context context, FYV fyv, String str) {
        super(1250893273);
        this.A01 = fyv;
        this.A00 = context;
        this.A02 = str;
    }
}
