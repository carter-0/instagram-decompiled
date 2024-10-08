package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.session.UserSession;
import com.instagram.creator.achievements.modules.models.Badge;
import java.util.List;

/* renamed from: X.JGj  reason: case insensitive filesystem */
public final class C59357JGj extends 0Yg implements 0sK {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ 0sP A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59357JGj(UserSession userSession, List list, 0sP r4, int i) {
        super(3);
        this.A02 = list;
        this.A00 = i;
        this.A01 = userSession;
        this.A03 = r4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C286575Wy r4 = (C286575Wy) obj2;
        if (C51968G9o.A0E(obj3) != 16 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(962716395, "com.instagram.creator.achievements.modules.views.EarnedAchievementsRow.<anonymous>.<anonymous>.<anonymous> (EarnedAchievementsRow.kt:47)");
            }
            List list = this.A02;
            int i = this.A00;
            Badge badge = (Badge) 00k.A0O(list, i);
            if (badge != null) {
                UserSession userSession = this.A01;
                C59102J6k j6k = new C59102J6k(33, (Object) this.A03, (Object) badge);
                boolean z = true;
                boolean A1Q = AnonymousClass7TF.A1Q(i);
                if (i != DbT.A02(list, 1)) {
                    z = false;
                }
                C54939HYv.A00(r4, (Modifier) null, userSession, badge, j6k, 72, 8, A1Q, z);
            }
            if (0fL.A02()) {
                0fL.A00(-1812436966);
            }
        } else {
            r4.Evl();
        }
        return C60340gF.A00;
    }
}
