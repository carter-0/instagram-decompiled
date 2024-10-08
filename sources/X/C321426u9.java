package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.6u9  reason: invalid class name and case insensitive filesystem */
public abstract class C321426u9 {
    public static final C321456uC A00(AnonymousClass0iw r10, UserSession userSession, 2el r12, AnonymousClass4DU r13, C294255m9 r14, AnonymousClass32Q r15, User user, Set set, Set set2) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r12, 4);
        0qQ.A0B(r15, 5);
        Set set3 = set;
        0qQ.A0B(set3, 6);
        Set set4 = set2;
        0qQ.A0B(set4, 7);
        0qQ.A0B(r14, 8);
        ArrayList arrayList = new ArrayList();
        AnonymousClass0iw r5 = r10;
        AnonymousClass4DU r7 = r13;
        User user2 = user;
        arrayList.add(new C321436uA(r5, userSession2, r7, r14, r15, user2, set3));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C321446uB(r5, userSession2, r7, r15, user2, set4));
        return new C321456uC(r12, new C229932oe(), arrayList, arrayList2);
    }
}
