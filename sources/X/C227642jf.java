package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.2jf  reason: invalid class name and case insensitive filesystem */
public abstract class C227642jf {
    public static final AnonymousClass0eM A02(Fragment fragment) {
        0qQ.A0B(fragment, 0);
        return AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9M0(40, 09i.A0A, fragment));
    }

    public static final void A03(Bundle bundle, 0lg r3) {
        0qQ.A0B(r3, 1);
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r3.getToken());
    }

    public static final void A04(Bundle bundle, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        A03(bundle, userSession);
    }

    public static final AnonymousClass0eM A01(Fragment fragment) {
        return AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9M0(39, 09i.A0A, fragment));
    }

    public static final String A00(Object obj) {
        Class<?> cls = obj.getClass();
        Map map = 0Yh.A03;
        0qQ.A0B(cls, 1);
        String A00 = 0q1.A00(cls);
        if (A00 != null) {
            return A00;
        }
        String obj2 = cls.toString();
        0qQ.A07(obj2);
        return obj2;
    }
}
