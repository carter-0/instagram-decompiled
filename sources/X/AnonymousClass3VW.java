package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.3VW  reason: invalid class name */
public abstract class AnonymousClass3VW {
    public static final void A00(UserSession userSession, String str, List list, List list2, boolean z) {
        1Xj A02;
        String id;
        List list3 = list;
        int size = list3.size();
        for (int i = 0; i < size; i++) {
            List list4 = list2;
            int size2 = list4.size();
            for (int i2 = 0; i2 < size2; i2++) {
                1Xg r7 = (1Xg) list3.get(i);
                if (r7.equals(list4.get(i2)) && ((A02 = 1Xi.A02(r7.A05)) == null || !A02.CcK())) {
                    if (userSession != null) {
                        AnonymousClass3VK A00 = AnonymousClass3VI.A00(userSession);
                        AnonymousClass3VL r8 = AnonymousClass3VL.FEED;
                        Integer num = AnonymousClass05K.A00;
                        if (A02 == null) {
                            id = "";
                        } else {
                            id = A02.getId();
                        }
                        Integer valueOf = Integer.valueOf(list3.size() + i2);
                        int i3 = i;
                        if (z) {
                            i3 = -100;
                        }
                        A00.A07(new C52567GXs(r8, num, valueOf, Integer.valueOf(i3), (Integer) null, (Integer) null, str, id));
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
        }
    }
}
