package X;

import android.net.Uri;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.6ED  reason: invalid class name */
public abstract class AnonymousClass6ED {
    public static final AnonymousClass65S A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (AnonymousClass65S) userSession.A01(AnonymousClass65S.class, new AnonymousClass9L9(userSession, 37));
    }

    public static final String A01(String str) {
        if (str != null) {
            try {
                Uri A03 = 0cp.A03(str);
                0qQ.A07(A03);
                return A03.getQueryParameter("x");
            } catch (Exception e) {
                0KC.A0Q("SecureMessageOverWAIGNotificationsE2ELogger", "message ID parsing exception: ", new Object[]{e.getMessage()});
            }
        }
        return null;
    }

    public static final boolean A03(AnonymousClass5HJ r4) {
        String str = r4.A0g;
        if (str == null) {
            return false;
        }
        if (r4.A05() || r4.A1S || 00l.A0d(str, "ig_advanced_crypto_transport", false) || 00l.A0d(str, "is_vanish_mode", false)) {
            return true;
        }
        return false;
    }

    public static final String A02(boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(15);
        }
        if (z2) {
            arrayList.add(23);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return 00k.A0P(",", "", "", arrayList, (0sP) null);
    }
}
