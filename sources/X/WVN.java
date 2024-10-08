package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

public final class WVN implements C51868G5f {
    public final Activity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final W03 A03;
    public final W1W A04;
    public final X9C A05;

    public final void Dj9(String str) {
        String str2;
        0qQ.A0B(str, 0);
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A13 = Dbc.A13(str, i2);
            if (z) {
                if (!A13) {
                    break;
                }
                length--;
            } else if (!A13) {
                z = true;
            } else {
                i++;
            }
        }
        String A0c = Dba.A0c(str, length, i);
        if (A0c != null && A0c.length() != 0) {
            Product product = this.A05.Bz5().A09;
            if (product != null) {
                W03 w03 = this.A03;
                if (w03 != null) {
                    C15054ULx A032 = C294165ly.A03(w03.A03, product);
                    0Aj A0e = AnonymousClass7TE.A0e(w03.A02, "instagram_ads_app_message_advertiser_send");
                    if (A0e.isSampled()) {
                        C15029UKi uKi = w03.A01;
                        if (uKi == null || (str2 = uKi.A05) == null) {
                            str2 = "";
                        }
                        C51965G9l.A1L(A0e, W03.A00(A0e, w03, str2));
                        W03.A01(A0e, w03, C15054ULx.A01(A0e, A032));
                        A0e.Cgf();
                    }
                }
                1as.A04.A0E(this.A02, product, this.A01.getModuleName(), "message_merchant", A0c);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public WVN(Activity activity, AnonymousClass0iw r2, UserSession userSession, W03 w03, W1W w1w, X9C x9c) {
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = r2;
        this.A05 = x9c;
        this.A04 = w1w;
        this.A03 = w03;
    }
}
