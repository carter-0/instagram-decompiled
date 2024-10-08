package X;

import com.instagram.api.schemas.PollType;
import com.instagram.api.schemas.StoryPollColorType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CoL  reason: case insensitive filesystem */
public abstract class C44982CoL {
    public static C272024jy A00(PollType pollType, C258223yf r6, StoryPollColorType storyPollColorType, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num, Integer num2, Integer num3, String str, String str2, String str3, List list, List list2) {
        ArrayList arrayList;
        C258213ye r62;
        ArrayList arrayList2 = null;
        1E9 A0p = C41847B3o.A0p();
        if (list != null) {
            arrayList = AnonymousClass7TF.A0p(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C41846B3n.A1V(arrayList, it);
            }
        } else {
            arrayList = null;
        }
        if (r6 != null) {
            r62 = r6.F99(A0p);
        } else {
            r62 = null;
        }
        if (list2 != null) {
            arrayList2 = AnonymousClass7TF.A0p(list2);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C41846B3n.A1V(arrayList2, it2);
            }
        }
        return new C272024jy(pollType, r62, storyPollColorType, bool, bool2, bool3, bool4, bool5, num, num2, num3, str, str2, str3, arrayList, arrayList2);
    }
}
