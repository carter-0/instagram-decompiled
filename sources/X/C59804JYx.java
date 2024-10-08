package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.PhotoSession;
import com.instagram.util.creation.ShaderBridge;
import java.util.Map;

/* renamed from: X.JYx  reason: case insensitive filesystem */
public final class C59804JYx implements MV3, C66488MTr {
    public LSA A00;
    public final /* synthetic */ JWH A01;

    public final synchronized LSA A00() {
        return this.A00;
    }

    public final MVM ALj(String str, String str2) {
        return null;
    }

    public final void AMk(C10954S2m s2m, PhotoSession photoSession, String str) {
        JWH jwh = this.A01;
        C364798m1 A002 = JWH.A00(jwh, str, photoSession.A09);
        C10954S2m s2m2 = s2m;
        C65163LoS loS = new C65163LoS(jwh.A02, s2m2, jwh.A04.CCy(), photoSession.A05, this, this, A002, photoSession.A0D.getValue());
        jwh.A0A.put(str, loS);
        ShaderBridge.loadLibraries(new M08(loS));
    }

    public final void AOw() {
    }

    public final void DCn(Exception exc) {
        JWH jwh = this.A01;
        if (!jwh.A01) {
            jwh.A01 = true;
            0xI A002 = C59882Jb5.A00(AnonymousClass05K.A0R);
            A002.A0C("error", AnonymousClass7TG.A0m(exc, "Rendering error: ", AnonymousClass7TE.A1A()));
            UserSession userSession = jwh.A03;
            DbU.A1R(A002, userSession);
            jwh.A05.A0A((DialogInterface.OnClickListener) null, AnonymousClass05K.A1I);
            JW1.A00(userSession).A0B(false, exc.getMessage());
        }
    }

    public final synchronized void destroy() {
        LSA lsa = this.A00;
        if (lsa != null) {
            synchronized (lsa.A04) {
                lsa.A00 = true;
            }
            if (lsa.A09 != null) {
                LSA.A01(lsa);
                LSA.A00(lsa);
            }
            this.A00 = null;
            JWH jwh = this.A01;
            Map map = jwh.A0A;
            jwh.A00 = new M2U(Dba.A0e(map));
            map.clear();
        }
    }

    public C59804JYx(JWH jwh) {
        this.A01 = jwh;
    }

    public final void Ddq() {
        JWH jwh = this.A01;
        jwh.A01 = false;
        Runnable runnable = jwh.A00;
        if (runnable != null) {
            runnable.run();
            jwh.A00 = null;
        }
    }
}
