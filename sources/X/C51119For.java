package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.meta.foa.session.FoaUserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.For  reason: case insensitive filesystem */
public final class C51119For implements C51892G6h {
    public 05G A00 = DbS.A10(new HHF(AnonymousClass05K.A0C, 0sn.A00));
    public final UserSession A01;

    public final void E3m() {
        1wM A002 = 1wB.A00(this.A01);
        if (A002.A0C()) {
            A002.A0K(C46399DeM.A00, new C51124Fow(1, A002, this), "fx_company_identity_switcher_linking_cache", true, false);
            return;
        }
        this.A00.Epw(new HHF(AnonymousClass05K.A00, A00(A002, this)));
    }

    public C51119For(FoaUserSession foaUserSession) {
        this.A01 = C56316HwT.A00(foaUserSession);
    }

    public static final List A00(1wM r6, C51119For forR) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        CallerContext callerContext = C46399DeM.A00;
        A1C.addAll(r6.A02(callerContext, "FACEBOOK"));
        if (AnonymousClass3EM.A05(18312718348466359L, true) && AnonymousClass3EM.A05(18314891601395674L, false)) {
            A1C.addAll(r6.A02(callerContext, "THREADS"));
        }
        ArrayList A012 = C46399DeM.A01(forR.A01, A1C);
        ArrayList A0r = AnonymousClass7TG.A0r(A012);
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            0qQ.A0A(map);
            A0r.add(C49257Es0.A00(map));
        }
        return A0r;
    }
}
