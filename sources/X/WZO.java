package X;

import android.content.Context;
import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class WZO implements C228372lY {
    public final /* synthetic */ C294255m9 A00;

    public WZO(C294255m9 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ List AMe(Context context, AnonymousClass0iw r10, UserSession userSession, Object obj, int i) {
        1Xj r3;
        C17884Vhb vhb = (C17884Vhb) obj;
        0qQ.A0B(vhb, 4);
        int i2 = i % 3;
        int i3 = i / 3;
        if (vhb.A01 != ProfileGridItemTypeEnum.MEDIA || (r3 = vhb.A02) == null) {
            return new ArrayList();
        }
        return AnonymousClass7TE.A1I(new AnonymousClass9IN(C3252771t.A00(context, r10, userSession, r3, this.A00, (String) null, i3, i2), i, i2));
    }
}
