package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.3zv  reason: invalid class name and case insensitive filesystem */
public final class C258963zv implements C258943zt {
    public final UserSession A00;
    public final C258953zu A01;

    public C258963zv(UserSession userSession, C258953zu r3) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(userSession, 2);
        this.A01 = r3;
        this.A00 = userSession;
    }

    public final String getId() {
        return "StoryFeatureSourceForV10";
    }

    public final AnonymousClass40G ATg(OdinContext odinContext) {
        ArrayList arrayList;
        0sn arrayList2;
        0sn singletonList;
        C258953zu r3 = this.A01;
        AnonymousClass40G E6Z = ((AnonymousClass40N) r3.A01.getValue()).E6Z(0sr.A1P(new String[]{"recent_time_on_story", "last_story_session_end_timestamp"}), 0);
        if (E6Z.A02) {
            Map map = (Map) E6Z.A00;
            arrayList = new ArrayList();
            try {
                0sn r4 = (List) map.get("recent_time_on_story");
                if (r4 == null) {
                    r4 = 0sn.A00;
                }
                if (r4.isEmpty()) {
                    arrayList2 = 0sn.A00;
                } else {
                    arrayList2 = new ArrayList();
                    C255463uA[] r0 = FeatureData.A0E;
                    Type type = Type.LONG;
                    arrayList2.add(new FeatureData(type, "3343", (String) null, (List) null, 0.0d, 16376, ((Number) r4.get(((int) Math.ceil((20.0d / 100.0d) * ((double) r4.size()))) - 1)).longValue()));
                    arrayList2.add(new FeatureData(type, "3344", (String) null, (List) null, 0.0d, 16376, ((Number) r4.get(((int) Math.ceil((50.0d / 100.0d) * ((double) r4.size()))) - 1)).longValue()));
                }
                arrayList.addAll(arrayList2);
                0sn r8 = (List) map.get("last_story_session_end_timestamp");
                if (r8 == null) {
                    r8 = 0sn.A00;
                }
                if (r8.isEmpty()) {
                    singletonList = 0sn.A00;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    long longValue = currentTimeMillis - ((Number) r8.get(r8.size() - 1)).longValue();
                    if (longValue <= 0) {
                        SOZ.A00((Exception) null, 002.A0f("Invalid time interval since last story session value, currentTimestampMs is : ", ", lastSessionEndTimestampMs: ", currentTimeMillis, ((Number) r8.get(r8.size() - 1)).longValue()));
                    }
                    Type type2 = Type.LONG;
                    long j = new long[]{longValue, -1}[0];
                    if (-1 > j) {
                        j = -1;
                    }
                    singletonList = Collections.singletonList(new FeatureData(type2, "3353", (String) null, (List) null, 0.0d, 16376, j));
                    0qQ.A07(singletonList);
                }
                arrayList.addAll(singletonList);
            } catch (Exception e) {
                SOZ.A00((Exception) null, 002.A0R(Pxd.A00(483), e.getMessage()));
            }
        } else {
            arrayList = 0sn.A00;
        }
        return new AnonymousClass40G(arrayList, (String) null, true);
    }
}
