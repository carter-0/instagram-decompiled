package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.PhotoSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class JWI implements MV3 {
    public final JWJ A00;
    public final Runnable A01;
    public final ArrayList A02 = AnonymousClass7TE.A1C();
    public final /* synthetic */ JWH A03;

    public JWI(Context context, UserSession userSession, JWH jwh) {
        0qQ.A0B(userSession, 3);
        this.A03 = jwh;
        this.A00 = new JWJ(context, userSession);
        this.A01 = new JWK(this);
    }

    public final void A00(C66444MRy mRy) {
        Handler handler = this.A00.A02;
        Runnable runnable = this.A01;
        handler.removeCallbacks(runnable);
        ArrayList arrayList = this.A02;
        JTR.A1S(mRy, arrayList);
        while (arrayList.size() > 4) {
            ((C66444MRy) arrayList.remove(0)).E25();
        }
        handler.postDelayed(runnable, 10000);
    }

    public final void AMk(C10954S2m s2m, PhotoSession photoSession, String str) {
        JWJ jwj = this.A00;
        Handler handler = jwj.A02;
        handler.post(new M2W(jwj));
        handler.postDelayed(this.A01, 10000);
        JWH jwh = this.A03;
        Map map = jwh.A0A;
        Activity activity = jwh.A02;
        UserSession userSession = jwh.A03;
        C364798m1 A002 = JWH.A00(jwh, str, photoSession.A09);
        map.put(str, new C65164LoT(activity, userSession, photoSession.A05, this, this, jwj, A002, photoSession.A0D.getValue()));
    }

    public final MVM ALj(String str, String str2) {
        JWJ jwj = this.A00;
        Handler handler = jwj.A02;
        handler.post(new M2W(jwj));
        handler.postDelayed(this.A01, 10000);
        JWH jwh = this.A03;
        UserSession userSession = jwh.A03;
        if (str2 != null) {
            return new C64910LkA(userSession, this, jwj, JWH.A00(jwh, str2, (String) null));
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void AOw() {
        JWJ jwj = this.A00;
        Handler handler = jwj.A02;
        handler.removeCallbacks(this.A01);
        handler.post(new C59949JcF(jwj));
    }

    public final void destroy() {
        Map map = this.A03.A0A;
        Iterator it = Dba.A0e(map).iterator();
        while (it.hasNext()) {
            ((C364848m7) it.next()).AOv();
        }
        map.clear();
        this.A02.clear();
    }
}
