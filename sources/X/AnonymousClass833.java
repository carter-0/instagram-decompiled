package X;

import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;

/* renamed from: X.833  reason: invalid class name */
public final class AnonymousClass833 {
    public static final AnonymousClass834 A01 = new Object();
    public final UserSession A00;

    public static final void A00(AnonymousClass51M r7, 2Nn r8) {
        try {
            File file = new File(r7.A0F.A0F);
            long j = (long) r7.A09;
            StringBuilder sb = new StringBuilder();
            sb.append("user_trimmed_");
            sb.append(j);
            sb.append('_');
            sb.append((long) r7.A08);
            File A012 = C39907AIy.A01(r8, file, sb.toString());
            if (A012.exists()) {
                A012.delete();
            }
        } catch (IOException unused) {
        }
    }

    public AnonymousClass833(UserSession userSession) {
        this.A00 = userSession;
    }
}
