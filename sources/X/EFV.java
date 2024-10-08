package X;

import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;

public final class EFV extends C228042kh {
    public final XIGIGBoostCallToAction A00;
    public final XIGIGBoostDestination A01;
    public final WGU A02;
    public final C48748EjX A03;
    public final UserSession A04;
    public final String A05;
    public final boolean A06;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.EjX, java.lang.Object] */
    public /* synthetic */ EFV(XIGIGBoostCallToAction xIGIGBoostCallToAction, XIGIGBoostDestination xIGIGBoostDestination, WGU wgu, UserSession userSession, String str, boolean z) {
        ? obj = new Object();
        AnonymousClass7TG.A1O(userSession, xIGIGBoostDestination);
        0qQ.A0B(xIGIGBoostCallToAction, 4);
        this.A04 = userSession;
        this.A01 = xIGIGBoostDestination;
        this.A05 = str;
        this.A00 = xIGIGBoostCallToAction;
        this.A06 = z;
        this.A02 = wgu;
        this.A03 = obj;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A04;
        XIGIGBoostDestination xIGIGBoostDestination = this.A01;
        String str = this.A05;
        return new C46761Dko(this.A00, xIGIGBoostDestination, this.A02, this.A03, userSession, str, this.A06);
    }
}
