package X;

import com.instagram.common.session.UserSession;

public final class HB3 extends C322186vO {
    public final /* synthetic */ 1sw A00;
    public final /* synthetic */ AnonymousClass32F A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public final boolean A00(1Xj r4) {
        0qQ.A0B(r4, 0);
        AnonymousClass32F r1 = this.A01;
        if (r1.A0H) {
            if (r4.A2K() != AnonymousClass05K.A0C || r4.A00 == 2) {
                return false;
            }
        } else if (!super.Esp(r4) && !this.A03 && r1.A08 != C270394gf.FEED_MEDIA) {
            return false;
        } else {
            if (this.A02 || r4.A1u() == this.A00) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HB3(UserSession userSession, 1sw r2, AnonymousClass32F r3, boolean z, boolean z2) {
        super(userSession);
        this.A01 = r3;
        this.A03 = z;
        this.A02 = z2;
        this.A00 = r2;
    }
}
