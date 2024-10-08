package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class F32 {
    public final 1Av A00;

    public final List A00(List list) {
        Set C1t = this.A00.A01.C1t("minor_education_acknowledged_users");
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            User user = (User) next;
            if (user.B6o() == FollowStatus.A06 && !DbV.A1a(user, C1t)) {
                A1C.add(next);
            }
        }
        return A1C;
    }

    public final boolean A01(List list) {
        Set C1t = this.A00.A01.C1t("minor_education_acknowledged_users");
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User A0k = DbT.A0k(it);
            Boolean CSI = A0k.A03.CSI();
            if (CSI != null && CSI.booleanValue() && !DbV.A1a(A0k, C1t)) {
                return true;
            }
        }
        return false;
    }

    public F32(1Av r1) {
        this.A00 = r1;
    }
}
