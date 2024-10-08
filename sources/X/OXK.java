package X;

import com.instagram.model.direct.threadkey.impl.MsysPendingRecipient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class OXK {
    public static final MsysPendingRecipient A00(AnonymousClass170 r19) {
        AnonymousClass170 r0 = r19;
        0qQ.A0B(r0, 0);
        String id = r0.getId();
        Long BST = r0.BST();
        if (BST != null) {
            long longValue = BST.longValue();
            int BIW = r0.BIW();
            String username = r0.getUsername();
            String fullName = r0.getFullName();
            String shortName = r0.getShortName();
            String B8Q = r0.B8Q();
            return new MsysPendingRecipient(r0.Bh3(), r0.B6o(), r0.Bjj(), id, username, fullName, shortName, B8Q, BIW, longValue, r0.isVerified(), r0.CPm(), r0.Cdl(), r0.CPV(), r0.isRestricted(), r0.isConnected(), r0.CXO(), r0.CXR());
        }
        throw new IllegalStateException();
    }

    public static final List A01(List list) {
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(A00(C66580MXl.A0k(it)));
        }
        return A0r;
    }

    public static final List A02(List list) {
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(A00(DbT.A0k(it)));
        }
        return A0r;
    }
}
