package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.LRz  reason: case insensitive filesystem */
public abstract class C64172LRz {
    public static final boolean A02(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (!AnonymousClass7TF.A1Y(DbX.A0m(userSession).COg(), true) || !182.A06(0Tu.A05, userSession, 36313862588336397L)) {
            return false;
        }
        return true;
    }

    public static final HashMap A00(User user) {
        AnonymousClass4Hy AqD;
        String Bgt;
        HashMap A0e = Dbb.A0e("source_owner_igid", user.getId(), AnonymousClass7TE.A1L("source_name", AnonymousClass000.A00(880)));
        AnonymousClass4I0 Amx = user.A03.Amx();
        if (!(Amx == null || (AqD = Amx.AqD()) == null || (Bgt = AqD.Bgt()) == null)) {
            A0e.put("fundraiser_id", Bgt);
        }
        return A0e;
    }

    public static final boolean A03(User user) {
        AnonymousClass4Hy AqD;
        AnonymousClass4I0 Amx = user.A03.Amx();
        if (Amx == null || (AqD = Amx.AqD()) == null) {
            return false;
        }
        return DbX.A1a(AqD.Akv());
    }

    public static final HashMap A01(User user) {
        return Dbb.A0e("source_name", AnonymousClass000.A00(880), AnonymousClass7TE.A1L("charity_igid", user.getId()));
    }
}
