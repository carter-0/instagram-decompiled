package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.Achievement;
import com.instagram.common.session.UserSession;
import com.instagram.creator.achievements.modules.models.Badge;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.IQb  reason: case insensitive filesystem */
public final class C57138IQb implements JO1 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1ZT A02;
    public final /* synthetic */ C331157Pu A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public final void Ct8(Achievement achievement) {
        ArrayList arrayList;
        1ZT r4 = this.A02;
        C331127Pr A012 = C64006LIm.A01(this.A00, this.A01);
        Map map = this.A05;
        List list = (List) map.get(achievement);
        ArrayList arrayList2 = null;
        if (list != null) {
            arrayList = AnonymousClass7TE.A1C();
            for (Object next : list) {
                if (((Badge.AchievementBadge) next).A09) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        List list2 = (List) map.get(achievement);
        if (list2 != null) {
            arrayList2 = AnonymousClass7TE.A1C();
            for (Object next2 : list2) {
                if (!((Badge.AchievementBadge) next2).A09) {
                    arrayList2.add(next2);
                }
            }
        }
        r4.A00();
        this.A03.A0F(C54925HYh.A00(String.valueOf(achievement.A01), (String) null, this.A04, arrayList, arrayList2, true, false), A012);
    }

    public C57138IQb(FragmentActivity fragmentActivity, UserSession userSession, 1ZT r3, C331157Pu r4, String str, Map map) {
        this.A02 = r3;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A05 = map;
        this.A04 = str;
        this.A03 = r4;
    }
}
