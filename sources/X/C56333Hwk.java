package X;

import com.instagram.common.session.UserSession;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Hwk  reason: case insensitive filesystem */
public abstract class C56333Hwk {
    public static final 1OC A00(UserSession userSession, String str, String str2, Set set) {
        DbZ.A0t(0, userSession, set, str2);
        String A02 = new C239023El(",").A02(set);
        0qQ.A07(A02);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("usertags/review/");
        DbX.A1M(A0a, str, A02);
        C51965G9l.A1S(A0a, str2);
        return DbW.A0K(A0a);
    }

    public static final 1OC A01(UserSession userSession, String str, Set set) {
        AnonymousClass7TG.A1T(userSession, set, str);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("usertags/remove/");
        StringWriter stringWriter = new StringWriter();
        17W A0e = C51970G9q.A0e(stringWriter);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            A0e.A0t(AnonymousClass7TE.A18(it));
        }
        A0e.A0Y();
        A0e.close();
        DbX.A1M(A0a, "media_to_untag", DbT.A10(stringWriter));
        return DbT.A0T(A0a, "container_module", str);
    }
}
