package X;

import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.upsells.fragment.dismissnudge.DismissNudgeRepository;

/* renamed from: X.UhL  reason: case insensitive filesystem */
public final class C15714UhL extends C228042kh {
    public final UserSession A00;
    public final C56154Hth A01;
    public final I10 A02;

    public C15714UhL(UserSession userSession, C56154Hth hth, I10 i10) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = hth;
        this.A02 = i10;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C60260JiH(new DismissNudgeRepository(this.A00, this.A01, this.A02), C16500Uvw.ON);
    }
}
