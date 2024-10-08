package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.9yR  reason: invalid class name and case insensitive filesystem */
public abstract class C394639yR {
    public static final String A00(Context context, C369968vc r6, UserSession userSession) {
        0qQ.A0B(r6, 0);
        AnonymousClass7TF.A1B(context, 1, userSession);
        File A01 = 2Nm.A00(context, userSession).A01();
        String str = r6.A09;
        String canonicalPath = new File(A01, str).getCanonicalPath();
        String str2 = r6.A0D;
        if (str2 != null) {
            0qQ.A0A(canonicalPath);
            if (00p.A0k(str2, canonicalPath, false)) {
                return str2;
            }
        }
        2Nn A00 = 2Nm.A00(context, userSession);
        0qQ.A0B(A00, 0);
        0qQ.A0B(str, 1);
        File file = new File(A00.A01(), str);
        C357818Zu.A00(file);
        return new File(file, "cover_photo.jpg").getCanonicalPath();
    }
}
