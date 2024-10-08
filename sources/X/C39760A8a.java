package X;

import android.net.Uri;
import com.instagram.common.session.UserSession;

/* renamed from: X.A8a  reason: case insensitive filesystem */
public final class C39760A8a {
    public final 0bY A00 = new 1Q7("IgSecureUriParser").A00;

    public final void A00(AnonymousClass0iw r6, UserSession userSession, String str, String str2, boolean z) {
        String obj;
        if (!z && str != null && str2 != null && !182.A06(0Tu.A05, userSession, 36324161919922009L)) {
            0wc A01 = AnonymousClass0kN.A01(r6, userSession);
            Uri A012 = 0cp.A01(this.A00, str);
            if (A012 != null) {
                String host = A012.getHost();
                if (host == null || !00l.A0d(host, Pxd.A00(237), false)) {
                    obj = A012.toString();
                    0qQ.A0A(obj);
                } else {
                    obj = String.valueOf(A012.getQueryParameter("u"));
                }
                0Aj A0e = AnonymousClass7TE.A0e(A01, "messaging_outbound_click");
                if (A0e.isSampled()) {
                    A0e.A9F("sender_id", AnonymousClass7TE.A10(str2));
                    A0e.AAJ("url", obj);
                    A0e.Cgf();
                }
            }
        }
    }
}
