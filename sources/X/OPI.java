package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class OPI {
    public static List A00(UserSession userSession, int i) {
        if (!182.A06(0Tu.A05, userSession, 36328328039578864L)) {
            return 0sn.A00;
        }
        Set C1t = AnonymousClass7TE.A0q(userSession).C1t("recent_direct_stickers");
        ArrayList A0r = AnonymousClass7TG.A0r(C1t);
        Iterator it = C1t.iterator();
        while (it.hasNext()) {
            A0r.add(OPJ.parseFromJson(16P.A00(AnonymousClass7TE.A18(it))));
        }
        return 00k.A0d(00k.A0Z(A0r), i);
    }

    public static void A01(UserSession userSession, PUH puh, int i) {
        if (182.A06(0Tu.A05, userSession, 36328328039578864L)) {
            Set A06 = 0sc.A06(new PUH[]{puh});
            Iterator it = 00k.A0k(AnonymousClass7TE.A0q(userSession).C1t("recent_direct_stickers")).iterator();
            while (it.hasNext()) {
                PUH parseFromJson = OPJ.parseFromJson(16P.A00(AnonymousClass7TE.A18(it)));
                0qQ.A07(parseFromJson);
                A06.add(parseFromJson);
            }
            1Av A00 = 1Au.A00(userSession);
            List<PUH> A0d = 00k.A0d(00k.A0Z(A06), i);
            ArrayList A0r = AnonymousClass7TG.A0r(A0d);
            for (PUH A002 : A0d) {
                A0r.add(OPJ.A00(A002));
            }
            Set A0k = 00k.A0k(A0r);
            0xa r1 = A00.A01;
            0xY AR4 = r1.AR4();
            AR4.ED3("recent_direct_stickers");
            AR4.apply();
            JTU.A1E(r1, "recent_direct_stickers", A0k);
        }
    }
}
