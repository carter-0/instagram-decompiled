package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class M1H implements G7U {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ L2V A03;
    public final /* synthetic */ C63882LAl A04;
    public final /* synthetic */ C47522E6i A05;

    public M1H(Context context, AnonymousClass4DH r2, UserSession userSession, L2V l2v, C63882LAl lAl, C47522E6i e6i) {
        this.A02 = userSession;
        this.A01 = r2;
        this.A04 = lAl;
        this.A03 = l2v;
        this.A00 = context;
        this.A05 = e6i;
    }

    public final void onAuthorizeFail() {
        JTT.A1N(this.A04.A06);
    }

    public final void onAuthorizeSuccess(String str, String str2) {
        UserSession userSession = this.A02;
        if (!182.A06(0Tu.A05, userSession, 36322452522936512L)) {
            AnonymousClass4DH r5 = this.A01;
            C363388je.A00(userSession).A01(LTD.A01, new C65241Lpl(3, r5, userSession), "reels_row_share");
            C63882LAl lAl = this.A04;
            JTT.A1N(lAl.A06);
            LTD.A01(this.A00, r5, userSession, new L56(this.A03.A00, false), lAl, this.A05);
        }
    }
}
