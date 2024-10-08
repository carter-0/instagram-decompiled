package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.UserStoryTarget;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.ADt  reason: case insensitive filesystem */
public final class C39892ADt {
    public final List A00;
    public final List A01;

    public static C39892ADt A00(LD4 ld4) {
        DirectShareTarget directShareTarget = ld4.A00;
        if (directShareTarget != null) {
            return new C39892ADt(Collections.singletonList(directShareTarget), (List) null);
        }
        UserStoryTarget userStoryTarget = ld4.A01;
        if (userStoryTarget != null) {
            return new C39892ADt((List) null, Arrays.asList(new UserStoryTarget[]{userStoryTarget}));
        }
        return new C39892ADt((List) null, (List) null);
    }

    public final boolean A01() {
        List list = this.A01;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean A02(UserStoryTarget userStoryTarget) {
        List list = this.A01;
        if (list == null || !list.contains(userStoryTarget)) {
            return false;
        }
        return true;
    }

    public C39892ADt(List list, List list2) {
        this.A00 = list;
        this.A01 = list2;
    }
}
