package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.people.PeopleTag;
import com.instagram.tagging.model.Tag;
import com.instagram.user.model.User;
import java.util.ArrayList;

public final class GGO {
    public final C272324kW A00;
    public final UserSession A01;

    public final C266444Yx A00(1Xj r8) {
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList A3E = r8.A3E();
        if (A3E != null) {
            arrayList.addAll(A3E);
        }
        ArrayList A3I = r8.A3I();
        if (A3I != null && (!A3I.isEmpty())) {
            UserSession userSession = this.A01;
            User A2A = r8.A2A(userSession);
            if (A2A != null) {
                str = A2A.getId();
            } else {
                str = null;
            }
            if ((2R8.A05(userSession, str) && !182.A06(0Tu.A06, userSession, 36321108198499430L)) || 182.A06(0Tu.A05, userSession, 36321108198237282L)) {
                arrayList.addAll(A3I);
            }
        }
        String str2 = "";
        if (!arrayList.isEmpty()) {
            Tag tag = (Tag) 00k.A0J(arrayList);
            if (tag != null) {
                if (tag instanceof PeopleTag) {
                    str2 = ((PeopleTag) tag).A00.A04;
                } else if (tag instanceof FBUserTag) {
                    str2 = ((FBUserTag) tag).A02.A01;
                }
            }
            if (arrayList.size() != 1) {
                return new GKO(new Object[]{String.valueOf(arrayList.size())}, 2131969342);
            }
            0qQ.A0A(str2);
        }
        return JUH.A00(str2);
    }

    public /* synthetic */ GGO(UserSession userSession) {
        C272324kW A03 = AnonymousClass2BF.A00().A03();
        0qQ.A0B(A03, 2);
        this.A01 = userSession;
        this.A00 = A03;
    }
}
