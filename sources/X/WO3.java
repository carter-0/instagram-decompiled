package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

public final class WO3 implements AnonymousClass9FE {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WO3(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onError(Throwable th) {
        if (this.A00 != 0) {
            E3F.A02((Uri) ((0rm) this.A01).A00, (E3F) this.A02);
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String A002;
        if (this.A00 != 0) {
            C18458Vs7 vs7 = (C18458Vs7) obj;
            0qQ.A0B(vs7, 0);
            String str = vs7.A01;
            if (str != null && !00l.A0W(str)) {
                ((0rm) this.A01).A00 = 0cp.A03(str);
            }
            E3F.A02((Uri) ((0rm) this.A01).A00, (E3F) this.A02);
            return;
        }
        C375999Gd r2 = ((VVL) obj).A01;
        if (r2 == null) {
            A002 = null;
        } else {
            A002 = r2.A00(new AnonymousClass9JK(CallerContext.A01(AnonymousClass000.A00(4338)), AnonymousClass000.A00(3282), AnonymousClass000.A00(239), C16678UzE.PROMOTION_INFORMATION.toString(), "promotion_list"), ((Dd4) this.A01).A0A);
        }
        Dd4 dd4 = (Dd4) this.A01;
        String A09 = ((C283155Gi) this.A02).A09("media_id");
        UserSession userSession = dd4.A0A;
        C18662VwK A003 = VA1.A00(userSession);
        String obj2 = C16678UzE.PROMOTION_INFORMATION.toString();
        String A004 = AnonymousClass000.A00(239);
        A003.A05(A004, obj2, A09);
        C18676VwZ.A01(dd4.A05, new WO8(dd4, A09, A002), userSession, A004);
    }
}
