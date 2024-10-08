package X;

import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.VmC  reason: case insensitive filesystem */
public abstract class C18136VmC {
    public static C49672F1e A00(UserSession userSession, String str) {
        V36 v36;
        C17481VXi vXi;
        C49672F1e f1e = new C49672F1e(userSession);
        if (str != null) {
            try {
                V35 v35 = C16896V9z.parseFromJson(0c9.A04.A01(userSession, str)).A00;
                if (!(v35 == null || (v36 = v35.A00) == null || (vXi = v36.A00) == null)) {
                    String str2 = vXi.A00;
                    if (str2 != null) {
                        f1e.A00.A0R = str2;
                    }
                    String str3 = vXi.A01;
                    if (str3 != null) {
                        f1e.A00.A0U = str3;
                    }
                    boolean z = vXi.A02;
                    IgBloksScreenConfig igBloksScreenConfig = f1e.A00;
                    igBloksScreenConfig.A0j = z;
                    igBloksScreenConfig.A0k = AnonymousClass7TF.A1Q(vXi.A03 ? 1 : 0);
                    return f1e;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return f1e;
    }

    public static HashMap A01(UserSession userSession, String str) {
        if (str != null) {
            try {
                HashMap A00 = F5I.A00(0c9.A04.A01(userSession, str));
                if (A00 != null) {
                    return A00;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return new HashMap();
    }
}
