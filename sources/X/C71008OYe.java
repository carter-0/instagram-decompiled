package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OYe  reason: case insensitive filesystem */
public final class C71008OYe {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public C71008OYe(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = r2;
    }

    public static final String A00(C71008OYe oYe, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!C51966G9m.A1W(oYe.A02, obj)) {
                break;
            }
        }
        String str = (String) obj;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (r1 != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(java.lang.String r4) {
        /*
            android.net.Uri r3 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x0029 }
            java.util.List r0 = r3.getPathSegments()     // Catch:{ Exception -> 0x0029 }
            r2 = 1
            if (r0 == 0) goto L_0x0012
            boolean r1 = r0.isEmpty()     // Catch:{ Exception -> 0x0029 }
            r0 = 0
            if (r1 == 0) goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            if (r0 != 0) goto L_0x0031
            int r0 = X.DbV.A03(r3)     // Catch:{ Exception -> 0x0029 }
            if (r0 == r2) goto L_0x0031
            java.util.List r1 = r3.getPathSegments()     // Catch:{ Exception -> 0x0029 }
            int r0 = X.DbV.A03(r3)     // Catch:{ Exception -> 0x0029 }
            int r0 = r0 - r2
            java.lang.String r4 = X.AnonymousClass7TE.A19(r1, r0)     // Catch:{ Exception -> 0x0029 }
            return r4
        L_0x0029:
            r2 = move-exception
            java.lang.String r1 = "AppointmentBookingXMACtaHandler"
            java.lang.String r0 = "error in parsing payload url"
            X.0wb.A06(r1, r0, r2)
        L_0x0031:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71008OYe.A01(java.lang.String):java.lang.String");
    }
}
