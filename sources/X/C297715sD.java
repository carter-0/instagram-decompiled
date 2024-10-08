package X;

import android.content.Context;
import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;

/* renamed from: X.5sD  reason: invalid class name and case insensitive filesystem */
public abstract class C297715sD {
    public static final void A00(Context context, UserSession userSession, 1Xj r7, String str) {
        AndroidLink A02;
        String Avj;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(context, 2);
        0qQ.A0B(str, 3);
        C297765sI A00 = C297725sE.A00().A00(userSession);
        if (r7.CcK() && (A02 = AnonymousClass47K.A02(context, userSession, r7, 0, false)) != null && (Avj = A02.Avj()) != null && Avj.length() != 0 && C271714jT.A01(A02) == AnonymousClass47L.AD_DESTINATION_AR_CAMERA) {
            try {
                String Avj2 = A02.Avj();
                if (Avj2 != null) {
                    Uri A03 = 0cp.A03(Avj2);
                    String queryParameter = A03.getQueryParameter("effect_id");
                    String queryParameter2 = A03.getQueryParameter("encoded_token");
                    if (queryParameter != null && queryParameter.length() != 0 && queryParameter2 != null && queryParameter2.length() != 0) {
                        A00.A01(queryParameter2).A04(Sm2.A00);
                        LFK lfk = new LFK(context, new C64508LdA(), AnonymousClass12T.A00, userSession);
                        C64350LaS laS = new C64350LaS();
                        lfk.A01(queryParameter, (String) null);
                        lfk.A00(laS);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            } catch (SecurityException unused) {
                0KC.A0C("ArAdPrefetchUtil", "Unable to parse URI");
            }
        }
    }
}
