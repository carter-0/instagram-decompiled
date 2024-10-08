package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.OcV  reason: case insensitive filesystem */
public abstract class C71095OcV {
    public static final String A01(UserSession userSession, String str, Map map) {
        0qQ.A0B(str, 2);
        User A0j = DbT.A0j(userSession);
        if (0qQ.A0K(A0j.getId(), str) || (A0j = (User) map.get(str)) != null) {
            return A0j.getUsername();
        }
        return null;
    }

    public static final boolean A04(UserSession userSession, OMF omf, Map map) {
        Integer nullableInteger = omf.A00.mResultSet.getNullableInteger(0, 11);
        if (nullableInteger == null || nullableInteger.intValue() != 1) {
            User A0j = DbT.A0j(userSession);
            Collection values = map.values();
            Iterator it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (C66582MXn.A1T((User) next, A0j)) {
                    if (next != null) {
                        if (!OPx.A01(omf)) {
                            Iterator it2 = values.iterator();
                            while (it2.hasNext()) {
                                User A0k = DbT.A0k(it2);
                                if (!C66582MXn.A1T(A0j, A0k) && (A0k.CXO() || A0k.isRestricted())) {
                                    return false;
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final C328497Fa A00(C74552Pwl pwl, int i) {
        int BsF = pwl.BsF(i);
        if (BsF == 0) {
            return C328497Fa.NONE;
        }
        if (BsF == 1) {
            return C328497Fa.SENDING;
        }
        if (BsF != 2) {
            if (BsF == 4) {
                return C328497Fa.PERMANENTLY_FAILED;
            }
            if (BsF == 5) {
                return C328497Fa.FAILED;
            }
        }
        return C328497Fa.SENT;
    }

    public static final String A02(C74552Pwl pwl, int i) {
        String obj;
        Long BNc = pwl.BNc(i);
        if (BNc == null || (obj = BNc.toString()) == null) {
            return pwl.BSF(i);
        }
        return obj;
    }

    public static final ArrayList A03(C70464O7p o7p, long j) {
        String str;
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (o7p != null) {
            List list = o7p.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String valueOf = String.valueOf(j);
                String str2 = ((C70702OGx) list.get(i)).A02;
                if (((C70702OGx) list.get(i)).A05) {
                    str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                } else {
                    str = NetInfoModule.CONNECTION_TYPE_NONE;
                }
                A1C.add(new C2607246u((ExtendedImageUrl) null, ((C70702OGx) list.get(i)).A00, valueOf, str2, str));
            }
        }
        return A1C;
    }
}
