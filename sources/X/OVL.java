package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class OVL {
    public final Context A00;
    public final UserSession A01;
    public final C62320sa A02;
    public final C62320sa A03;
    public final C62320sa A04;

    public static final AnonymousClass3U9 A00(OVL ovl) {
        String str;
        C62320sa r3 = ovl.A02;
        N3Z n3z = (N3Z) r3.invoke();
        String str2 = null;
        if (n3z == null || (str = n3z.A04) == null) {
            C68162N3c n3c = (C68162N3c) ovl.A04.invoke();
            if (n3c != null) {
                str = n3c.A05;
            } else {
                C68160N3a n3a = (C68160N3a) ovl.A03.invoke();
                if (n3a == null || (str = n3a.A08) == null) {
                    return null;
                }
            }
        }
        N3Z n3z2 = (N3Z) r3.invoke();
        if (n3z2 != null) {
            str2 = n3z2.A05;
        }
        return 2Dr.A04(1bJ.A00(ovl.A01), str, str2);
    }

    public final String A01() {
        String str;
        N3Z n3z = (N3Z) this.A02.invoke();
        if (n3z != null && (str = n3z.A04) != null) {
            return str;
        }
        C68162N3c n3c = (C68162N3c) this.A04.invoke();
        if (n3c != null) {
            return n3c.A05;
        }
        return null;
    }

    public OVL(Context context, UserSession userSession, C62320sa r3, C62320sa r4, C62320sa r5) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r3;
        this.A04 = r4;
        this.A03 = r5;
    }
}
