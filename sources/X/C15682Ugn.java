package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Ugn  reason: case insensitive filesystem */
public final class C15682Ugn extends C252233om {
    public C3034368u A00;
    public final C20928X4t A01;
    public final UserSession A02;
    public final C15677Ugi A03;

    public C15682Ugn(Context context, AnonymousClass07i r9, UserSession userSession, C20928X4t x4t, Integer num, String str) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = x4t;
        this.A03 = new C15677Ugi(context, r9, userSession, new VP1(this), num, str);
    }

    public final void A00() {
        String str;
        C15677Ugi ugi = this.A03;
        HashMap hashMap = new HashMap();
        String str2 = ugi.A05;
        if (str2 != null) {
            hashMap.put("merchant_igid", str2);
        }
        switch (ugi.A04.intValue()) {
            case 1:
                str = "IG_SINGLE_MERCHANT_RECONSIDERATION";
                break;
            case 2:
                str = "IG_WISHLIST";
                break;
            default:
                str = "IG_MULTI_MERCHANT_RECONSIDERATION";
                break;
        }
        hashMap.put("surface", str);
        C228602lw r3 = new C228602lw(ugi.A00, ugi.A01, (Integer) null);
        C360678ey A06 = C359988do.A06(ugi.A02, "com.bloks.www.minishops.ssh.data_signifier", hashMap);
        A06.A00(new C15412UcO(ugi, 2));
        r3.schedule(A06);
    }
}
