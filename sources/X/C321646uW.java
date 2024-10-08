package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6uW  reason: invalid class name and case insensitive filesystem */
public final class C321646uW {
    public final Map A00 = new EnumMap(C294265mA.class);

    public C321646uW(Context context, UserSession userSession, AnonymousClass4D6 r15, C228312lJ r16, C321636uV r17, Dda dda, List list) {
        Context context2 = context;
        0qQ.A0B(context, 1);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 2);
        AnonymousClass4D6 r5 = r15;
        0qQ.A0B(r15, 3);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C294265mA r8 = (C294265mA) it.next();
            this.A00.put(r8, new C321656uX(context2, userSession2, r5, r16, r17, r8, dda, (String) null, false));
        }
    }

    public static final C321656uX A00(C321646uW r0, C294265mA r1) {
        Object obj = r0.A00.get(r1);
        if (obj != null) {
            return (C321656uX) obj;
        }
        throw new IllegalStateException("Network source must be instantiated");
    }
}
