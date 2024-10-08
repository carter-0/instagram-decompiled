package X;

import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.upsell.data.CLNoticeRepository;

/* renamed from: X.KDt  reason: case insensitive filesystem */
public final class C61592KDt extends C228042kh {
    public final UserSession A00;
    public final C368378sW A01;
    public final CLNoticeRepository A02;
    public final String A03;

    public C61592KDt(UserSession userSession, C368378sW r3, CLNoticeRepository cLNoticeRepository, String str) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = cLNoticeRepository;
        this.A01 = r3;
        this.A03 = str;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C60187Jh6(this.A00, this.A01, this.A02, this.A03);
    }
}
