package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.AchievementIntf;
import java.util.List;

public abstract class HZ2 {
    public static final void A00(C286575Wy r21, Modifier modifier, AchievementIntf achievementIntf, 0sP r24, int i, int i2) {
        Modifier modifier2 = modifier;
        AchievementIntf achievementIntf2 = achievementIntf;
        0sP r0 = r24;
        boolean A1U = AnonymousClass7TF.A1U(0, achievementIntf2, r0);
        C286575Wy r8 = r21;
        r8.ExV(-1486932256);
        int i3 = i2;
        if ((i2 & 4) != 0) {
            modifier2 = Modifier.A00;
        }
        if (0fL.A02()) {
            0fL.A01(-925163838, "com.instagram.creator.achievements.modules.views.ProgressMediaList (ProgressMediaList.kt:39)");
        }
        List AoO = achievementIntf2.AoO();
        if (AoO != null && !AoO.isEmpty()) {
            AnonymousClass6HY.A01((AnonymousClass6HS) null, C287275Zs.A01(16.0f), (C304836Fk) null, (LazyListState) null, r8, (C287265Zr) null, C51967G9n.A0C(C287205Zk.A00(C287215Zl.A02, C51966G9m.A0V(modifier2)), 16.0f), new C58769IxG(33, modifier2, AoO, r0, achievementIntf), 12607488, 110, false, A1U);
        }
        if (0fL.A02()) {
            0fL.A00(100435148);
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i, i3, 26, achievementIntf2, r0, modifier2);
        }
    }
}
