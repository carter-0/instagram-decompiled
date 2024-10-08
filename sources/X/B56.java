package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public abstract class B56 {
    public static final void A00(1Xj r4, String str, boolean z) {
        ArrayList arrayList;
        0qQ.A0B(str, 1);
        List<AnonymousClass5DY> Av3 = r4.A0C.Av3();
        if (Av3 != null) {
            arrayList = AnonymousClass7TG.A0r(Av3);
            for (AnonymousClass5DY r1 : Av3) {
                if (0qQ.A0K(r1.getId(), str)) {
                    C45448Cwb AK9 = r1.AK9();
                    AK9.A02 = Boolean.valueOf(z);
                    r1 = AK9.A00();
                }
                arrayList.add(r1);
            }
        } else {
            arrayList = null;
        }
        r4.A0C.ETm(arrayList);
    }

    public static final boolean A01(UserSession userSession, 1Xj r5) {
        List Av3;
        List Av2;
        C67231sQ clipsMetadata = r5.A0C.getClipsMetadata();
        if ((clipsMetadata == null || (Av2 = clipsMetadata.Av2()) == null || !(!Av2.isEmpty())) && ((Av3 = r5.A0C.Av3()) == null || !(!Av3.isEmpty()) || !182.A06(0Tu.A05, userSession, 36323083883129677L))) {
            return false;
        }
        return true;
    }
}
