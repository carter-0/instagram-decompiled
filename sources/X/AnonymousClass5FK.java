package X;

import android.util.Pair;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5FK  reason: invalid class name */
public final class AnonymousClass5FK {
    public final void A00(1Fa r7, UserSession userSession, String str, Map map, Set set, boolean z) {
        Set<Map.Entry> entrySet;
        ArrayList arrayList = new ArrayList();
        ReelStore A03 = ReelStore.A03(userSession);
        0qQ.A07(A03);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Reel A0M = A03.A0M(str2);
            if (A0M != null || (A0M = A03.A0N(str2)) != null) {
                arrayList.add(A0M);
            }
        }
        if (!00l.A0d(str, "push_notification", false) && (!arrayList.isEmpty())) {
            try {
                r7.A9m("exclude_media_ids", AnonymousClass5FL.A00.A02(userSession, arrayList));
            } catch (IOException unused) {
                0wb.A03("ReelRequestHelper.addParams", AnonymousClass000.A00(111));
            }
        }
        r7.AA0("reel_ids", AnonymousClass49G.A01(set));
        if (!(map == null || (entrySet = map.entrySet()) == null)) {
            for (Map.Entry entry : entrySet) {
                r7.A9m((String) entry.getKey(), (String) entry.getValue());
            }
        }
        r7.A9m("source", str);
        UserSession userSession2 = 1NM.A00(userSession).A00;
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession2, 36317517608850675L)) {
            r7.A06 = 1CE.A04;
        }
        if (182.A06(r3, 1NM.A00(userSession).A00, 36324651546194122L)) {
            r7.A0I("initial_story_media_fetch", z);
        }
        if (!182.A06(r3, userSession, 36317517607408866L)) {
            Pair A00 = C278474ww.A00(userSession);
            Object obj = A00.first;
            0qQ.A06(obj);
            r7.A0G((String) obj, (String) A00.second);
        }
    }
}
