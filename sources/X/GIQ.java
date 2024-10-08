package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

public final class GIQ extends C46329Dbx {
    public C2366634p A00 = A02("first_media_load");
    public C227342j3 A01;
    public boolean A02;
    public final Dc1 A03;

    public final void A05() {
        C227342j3 r0 = this.A01;
        if (r0 != null) {
            A0J(TraceFieldType.ContentType, r0.BCb());
        }
    }

    public GIQ(UserSession userSession, C227342j3 r4) {
        super(userSession, "clips_fetch", 31795699);
        this.A01 = r4;
        this.A03 = GAH.A00(userSession);
    }
}
