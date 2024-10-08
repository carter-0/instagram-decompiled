package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

/* renamed from: X.8OE  reason: invalid class name */
public final class AnonymousClass8OE implements AnonymousClass8OD {
    public final C21006X9e ClP(Bitmap bitmap, UserSession userSession, AnonymousClass8OM r6, C17872VhP vhP) {
        C19723WeP uss;
        0qQ.A0B(r6, 0);
        0qQ.A0B(vhP, 2);
        String str = r6.A00.A01;
        0qQ.A07(str);
        if ("Pen".equals(str)) {
            uss = new C16314Usi();
        } else if ("Marker".equals(str)) {
            uss = new C16313Ush();
        } else if ("Neon".equals(str)) {
            uss = new C16312Usg();
        } else if ("Eraser".equals(str)) {
            uss = new C16315Usj();
        } else if ("Special".equals(str)) {
            uss = new C16323Ust();
        } else if (AnonymousClass000.A00(2422).equals(str)) {
            uss = new C16326Usw();
        } else {
            if ("Arrow".equals(str)) {
                uss = new C16322Uss();
            }
            return null;
        }
        uss.CMf(vhP);
        if (uss.isValid()) {
            return uss;
        }
        return null;
    }
}
