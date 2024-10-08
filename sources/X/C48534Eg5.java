package X;

import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.Eg5  reason: case insensitive filesystem */
public abstract class C48534Eg5 {
    public static final Object A00(C307896Rx r19, AnonymousClass6Tm r20) {
        String str = (String) DbW.A0g(r20, 0);
        AnonymousClass0iw A08 = C308206Td.A08(r19);
        if (C308206Td.A0B(r19) instanceof UserSession) {
            DbW.A1J(A08, new SUL(C308206Td.A04(r19), DbT.A0Y(r19), 2EG.A0V, str, false));
            return null;
        }
        SimpleWebViewActivity.A02.A02(C308206Td.A04(r19), C308206Td.A0B(r19), new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, true, true, false, false, true, false, false, false, (String) null, str));
        return null;
    }
}
