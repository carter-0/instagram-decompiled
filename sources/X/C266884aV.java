package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;

/* renamed from: X.4aV  reason: invalid class name and case insensitive filesystem */
public abstract class C266884aV {
    public static final AnonymousClass9IV A00(UserSession userSession, byte[] bArr) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(bArr, 1);
        try {
            return new AnonymousClass9IV(22, (Object) 1Xj.A0h.A0C(0c9.A04.A01(userSession, new String(bArr, AnonymousClass15Q.A05)), false, false), (Object) null);
        } catch (IOException e) {
            return new AnonymousClass9IV(22, (Object) null, (Object) e);
        }
    }
}
