package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class VQP {
    public static List A01;
    public final List A00;

    public VQP(UserSession userSession) {
        ArrayList arrayList = new ArrayList();
        this.A00 = arrayList;
        arrayList.add(C16672Uz8.UNSPECIFIED);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 2342159800969794182L) || 182.A06(r2, userSession, 2342159800969859719L)) {
            arrayList.add(C16672Uz8.TOP);
        }
        if (!182.A06(r2, userSession, 36315013639572422L) && 182.A06(r2, userSession, 2342159800969794182L)) {
            arrayList.add(C16672Uz8.RECENT);
        }
        if (182.A06(r2, userSession, 2342159800969859719L)) {
            arrayList.add(C16672Uz8.CLIPS);
        }
        if (182.A06(0Tu.A06, userSession, 36315821093424696L)) {
            arrayList.add(C16672Uz8.ACCOUNT);
        }
    }
}
