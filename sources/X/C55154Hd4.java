package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hd4  reason: case insensitive filesystem */
public abstract class C55154Hd4 {
    public static final AnonymousClass2vG A00(UserSession userSession, C233182vC r5, C233192vD r6, AnonymousClass2vG r7, String str, String str2, String str3) {
        AnonymousClass2vG r2;
        AnonymousClass7TG.A0w(1, str, str2, str3);
        UserSession userSession2 = userSession;
        if (!AnonymousClass1P8.A00(userSession).booleanValue() || !182.A06(0Tu.A05, userSession, 36323779669208554L)) {
            C233262vP A00 = C233242vN.A00.A00(userSession);
            IYJ iyj = IYJ.A00;
            r2 = new AnonymousClass2vM(userSession2, A00, r5, r6, r7, iyj, (28s) userSession.A01(28s.class, AnonymousClass28q.A00), str3);
        } else {
            C233262vP A002 = C233242vN.A00.A00(userSession);
            IYL iyl = IYL.A00;
            r2 = new IYI(userSession2, A002, r5, r6, r7, iyl, (28s) userSession.A01(28s.class, AnonymousClass28q.A00), str3);
        }
        return r2;
    }
}
