package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.ODz  reason: case insensitive filesystem */
public final class C70628ODz {
    public final 02m A00;
    public final Set A01;
    public final UserSession A02;

    public C70628ODz(02m r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = r2;
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        0qQ.A07(newSetFromMap);
        this.A01 = newSetFromMap;
    }
}
