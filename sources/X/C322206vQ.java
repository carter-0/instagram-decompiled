package X;

import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import com.instagram.common.session.UserSession;

/* renamed from: X.6vQ  reason: invalid class name and case insensitive filesystem */
public class C322206vQ implements C231802sQ {
    public final UserSession A00;

    public C322206vQ(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* renamed from: A00 */
    public boolean Esp(C17884Vhb vhb) {
        1Xj r1;
        0qQ.A0B(vhb, 0);
        if (vhb.A01 != ProfileGridItemTypeEnum.MEDIA || (r1 = vhb.A02) == null || (r1.A00 == 0 && !1sd.A00(this.A00).A05(r1))) {
            return true;
        }
        return false;
    }
}
