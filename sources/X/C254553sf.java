package X;

import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3sf  reason: invalid class name and case insensitive filesystem */
public abstract class C254553sf {
    public static final ArrayList A00(UserSession userSession, 1Xj r8, String str) {
        boolean A07;
        List A3b;
        int i;
        Long A0n;
        List<User> A0d;
        0qQ.A0B(str, 2);
        if (00p.A0k(str, "clips_viewer", false)) {
            A07 = C52114GFi.A02(userSession);
        } else {
            A07 = AnonymousClass3DI.A00.A07(userSession, str);
        }
        ArrayList arrayList = null;
        if (A07 && ((A3b = r8.A3b()) == null || A3b.isEmpty())) {
            boolean A0k = 00p.A0k(str, "clips_viewer", false);
            SocialContextType socialContextType = SocialContextType.COMMENTED_BY;
            if (00p.A0k(str, "clips_viewer", false)) {
                0qQ.A0B(socialContextType, 0);
                i = 1;
            } else {
                i = 2;
            }
            if (A0k) {
                List A01 = C243483Yy.A01(socialContextType, userSession, r8, true);
                if (!(A01 == null || (A0d = 00k.A0d(A01, i)) == null)) {
                    arrayList = new ArrayList();
                    for (User id : A0d) {
                        Long A0n2 = 00y.A0n(10, id.getId());
                        if (A0n2 != null) {
                            arrayList.add(A0n2);
                        }
                    }
                }
            } else {
                List list = r8.A1X().A00;
                ArrayList arrayList2 = new ArrayList();
                for (Object next : list) {
                    C247733gp r1 = (C247733gp) next;
                    if (r1.A08 != null && !r1.A03()) {
                        if (r1.A0j || AnonymousClass3DI.A01(userSession)) {
                            arrayList2.add(next);
                        }
                    }
                }
                List<C247733gp> A0d2 = 00k.A0d(arrayList2, i);
                if (A0d2 != null) {
                    arrayList = new ArrayList();
                    for (C247733gp r0 : A0d2) {
                        User user = r0.A08;
                        if (!(user == null || (A0n = 00y.A0n(10, user.getId())) == null)) {
                            arrayList.add(A0n);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static final ArrayList A01(UserSession userSession, 1Xj r7, String str) {
        boolean A07;
        List A3b;
        List<User> A0d;
        0qQ.A0B(str, 2);
        if (00p.A0k(str, "clips_viewer", false)) {
            A07 = C52114GFi.A02(userSession);
        } else {
            A07 = AnonymousClass3DI.A00.A07(userSession, str);
        }
        ArrayList arrayList = null;
        if (A07 && ((A3b = r7.A3b()) == null || A3b.isEmpty())) {
            SocialContextType socialContextType = SocialContextType.LIKED_BY;
            if (00p.A0k(str, "clips_viewer", false)) {
                0qQ.A0B(socialContextType, 0);
            }
            List A01 = C243483Yy.A01(socialContextType, userSession, r7, 00p.A0k(str, "clips_viewer", false));
            if (!(A01 == null || (A0d = 00k.A0d(A01, 3)) == null)) {
                arrayList = new ArrayList();
                for (User id : A0d) {
                    Long A0n = 00y.A0n(10, id.getId());
                    if (A0n != null) {
                        arrayList.add(A0n);
                    }
                }
            }
        }
        return arrayList;
    }
}
