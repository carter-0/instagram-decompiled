package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.74f  reason: invalid class name and case insensitive filesystem */
public abstract class C3258074f {
    public static final ArrayList A00(AnonymousClass2Ep r7) {
        int i;
        C242283Tk r1;
        ArrayList arrayList = new ArrayList(5);
        List C64 = r7.C64();
        int i2 = 0;
        if (C64 != null) {
            i = C64.size();
        } else {
            i = 0;
        }
        do {
            String str = null;
            if (!(i2 >= i || C64 == null || (r1 = (C242283Tk) C64.get(i2)) == null)) {
                str = r1.A01;
            }
            arrayList.add(str);
            i2++;
        } while (i2 < 5);
        return arrayList;
    }

    public static final 0eP A01(UserSession userSession, List list) {
        User A01 = AnonymousClass0t1.A01.A01(userSession);
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (!0qQ.A0K(((User) next).getId(), userSession.A06)) {
                arrayList.add(next);
            }
        }
        AnonymousClass34S A02 = AnonymousClass3UE.A02((ImageUrl) null, A01, (String) null, arrayList);
        Object obj = A02.A00;
        if (obj != null) {
            return new 0eP(obj, A02.A01);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
