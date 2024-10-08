package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.GroupUserStoryTarget;
import com.instagram.pendingmedia.model.UserStoryTarget;
import java.util.Collections;

/* renamed from: X.LIx  reason: case insensitive filesystem */
public abstract class C64010LIx {
    public static final C61002Juy A00(DirectShareTarget directShareTarget) {
        String str;
        0qQ.A0B(directShareTarget, 0);
        C254783t2 A01 = directShareTarget.A01();
        C61002Juy juy = C61002Juy.A02;
        if (Collections.unmodifiableList(directShareTarget.A0Q).size() == 1) {
            str = "direct_user";
        } else {
            str = "direct_thread";
        }
        return new C61002Juy(str, A01);
    }

    public static final C61002Juy A01(UserStoryTarget userStoryTarget) {
        String CAh;
        String str;
        0qQ.A0B(userStoryTarget, 0);
        boolean z = userStoryTarget instanceof GroupUserStoryTarget;
        C61002Juy juy = C61002Juy.A02;
        if (z) {
            DirectThreadKey directThreadKey = ((GroupUserStoryTarget) userStoryTarget).A00;
            if (directThreadKey != null) {
                CAh = directThreadKey.A00;
            } else {
                CAh = null;
            }
            str = "group_story";
        } else {
            CAh = userStoryTarget.CAh();
            str = "story";
        }
        return new C61002Juy(str, CAh);
    }
}
