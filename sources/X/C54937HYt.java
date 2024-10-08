package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.HYt  reason: case insensitive filesystem */
public abstract class C54937HYt {
    public static final void A00(C286575Wy r19, Modifier modifier, UserSession userSession, C59488JLm jLm, String str, List list, 0sP r25, int i, int i2) {
        UserSession userSession2 = userSession;
        List list2 = list;
        Modifier modifier2 = modifier;
        AnonymousClass7TG.A1O(userSession2, list2);
        String str2 = str;
        0sP r11 = r25;
        int A08 = C51970G9q.A08(3, str2, r11);
        C286575Wy r0 = r19;
        r0.ExV(-75543261);
        int i3 = i2;
        if ((i2 & 1) != 0) {
            modifier2 = Modifier.A00;
        }
        if (0fL.A02()) {
            0fL.A01(494839296, "com.instagram.creator.achievements.modules.views.EarnedAchievementsRow (EarnedAchievementsRow.kt:33)");
        }
        Modifier A0B = C287195Zj.A0B(modifier2, 0.0f, 0.0f, 0.0f, 16.0f);
        AnonymousClass5RD A02 = C291495hO.A02(C287275Zs.A07, r0, C287215Zl.A02, 0);
        int A00 = C287425a7.A00(r0);
        C286565Wx r6 = (C286565Wx) r0;
        AnonymousClass5RM A04 = C286565Wx.A04(r6);
        Modifier A01 = C287435a8.A01(r0, A0B);
        C51973G9u.A0y(r0, r6);
        C51971G9r.A12(r0, A02, A04);
        0sL r5 = C287485aD.A02;
        if (r6.A0K || !C51972G9s.A1Q(r0, A00)) {
            C51971G9r.A13(r0, r5, A00);
        }
        C51965G9l.A18(r0, A01);
        FillElement fillElement = C287205Zk.A02;
        int i4 = i;
        C59488JLm jLm2 = jLm;
        C52747Gbz.A00(r0, modifier2.Ezh(fillElement), jLm, (HL9) null, str2, ((i >> 9) & 14) | Constants.LOAD_RESULT_PGO, 44);
        LazyListState A002 = C305066Gi.A00(r0, 0, 0, 0, 3);
        C287245Zp r23 = C287215Zl.A05;
        AnonymousClass6HY.A02((C287295Zu) null, new C304826Fj(16.0f, 0.0f, 16.0f, 0.0f), A002, r0, r23, modifier2.Ezh(fillElement), new J6W(30, list2, r11, userSession2), 12779904, 88);
        if (C51967G9n.A1R(r0)) {
            0fL.A00(-1625295784);
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59208JAm(userSession2, r11, jLm2, modifier2, list2, str2, i4, i3, A08);
        }
    }
}
