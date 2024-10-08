package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Ejc  reason: case insensitive filesystem */
public abstract class C48753Ejc {
    public static final void A00(UserSession userSession, AnonymousClass4DU r3, User user, Integer num, String str, String str2) {
        int i;
        C254523sc r1 = new C254523sc(r3, AnonymousClass000.A00(1215));
        r1.A4K = userSession.A06;
        r1.A7D = user.getId();
        switch (num.intValue()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            default:
                i = 4;
                break;
        }
        r1.A0F = i;
        r1.A5v = str;
        if (str2 != null) {
            r1.A5u = str;
            r1.A7J = str2;
        }
        if (!C271764jY.A00(userSession, r1, r3, AnonymousClass05K.A01)) {
            DbU.A1R(r1.A00(), userSession);
        }
    }
}
