package X;

import com.instagram.api.schemas.SocialContextType;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class B4R {
    public static Map A00(C258223yf r5) {
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        ArrayList arrayList2 = null;
        if (r5.BxP() != null) {
            List<C258203yd> BxP = r5.BxP();
            if (BxP != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C258203yd r0 : BxP) {
                    if (r0 != null) {
                        arrayList.add(r0.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put("social_context_action_metadata", arrayList);
        }
        if (r5.BxQ() != null) {
            List<User> BxQ = r5.BxQ();
            ArrayList A0r = AnonymousClass7TG.A0r(BxQ);
            for (User A08 : BxQ) {
                A0r.add(A08.A08());
            }
            A1H.put("social_context_facepile_users", A0r);
        }
        if (r5.BxR() != null) {
            A1H.put(AnonymousClass000.A00(5270), r5.BxR());
        }
        if (r5.BxU() != null) {
            List<C2608647i> BxU = r5.BxU();
            if (BxU != null) {
                arrayList2 = AnonymousClass7TE.A1C();
                for (C2608647i r02 : BxU) {
                    if (r02 != null) {
                        arrayList2.add(r02.FHC());
                    }
                }
            }
            A1H.put("social_context_subitems", arrayList2);
        }
        if (r5.BxW() != null) {
            SocialContextType BxW = r5.BxW();
            0qQ.A0B(BxW, 0);
            A1H.put("social_context_type", BxW.A00);
        }
        r5.getSocialContextUsersCount();
        return C41845B3m.A0u("social_context_users_count", Integer.valueOf(r5.getSocialContextUsersCount()), A1H);
    }
}
