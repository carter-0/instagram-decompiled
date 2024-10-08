package X;

import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

@Deprecated(message = "Keep in sync with AB Tested Kotlin Conversion SponsoredContentLoggerFactoryKt")
/* renamed from: X.2vL  reason: invalid class name and case insensitive filesystem */
public abstract class C233232vL {
    public static AnonymousClass2vG A00(UserSession userSession, C233182vC r7, C233192vD r8, AnonymousClass2vG r9, String str) {
        UserSession userSession2 = userSession;
        boolean booleanValue = AnonymousClass1P8.A00(userSession).booleanValue();
        C233182vC r5 = r7;
        C233192vD r6 = r8;
        AnonymousClass2vG r72 = r9;
        if (!booleanValue || !182.A06(0Tu.A05, userSession2, 36323779669208554L)) {
            Class<28s> cls = 28s.class;
            return new AnonymousClass2vM(userSession2, C233242vN.A00.A00(userSession2), r5, r6, r72, new C233272vQ(), (28s) userSession2.A01(cls, AnonymousClass28q.A00), str);
        }
        Class<28s> cls2 = 28s.class;
        return new IYI(userSession2, C233242vN.A00.A00(userSession2), r5, r6, r72, new IYK(), (28s) userSession2.A01(cls2, AnonymousClass28q.A00), str);
    }
}
