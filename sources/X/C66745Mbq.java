package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Mbq  reason: case insensitive filesystem */
public final class C66745Mbq implements C74503Pvy {
    public final C67251Mkl A00;
    public final C67254Mko A01;
    public final C66751Mbw A02;
    public final C74504Pvz A03;
    public final C67054MhR A04;
    public final C67245Mkf A05;
    public final P3Z A06;
    public final C74565PxE A07;
    public final C74566PxF A08;
    public final C74542Pwb A09;

    public C66745Mbq(Context context, UserSession userSession, C66975Mg9 mg9, C67245Mkf mkf) {
        0qQ.A0B(userSession, 1);
        this.A05 = mkf;
        C66741Mbm mbm = mg9.A02;
        C66752Mbx mbx = mkf.A02;
        C67014Mgn mgn = mg9.A04;
        this.A02 = new C66751Mbw(mgn.Ezk(), userSession, mbm, mbx);
        this.A09 = mkf.A05;
        this.A04 = mkf.A04;
        this.A01 = new C67254Mko(context, userSession, mg9.A01, mkf.A01);
        this.A03 = new C67053MhQ(userSession, mgn, mkf.A03);
        this.A00 = new C67251Mkl(userSession, mg9.A00, mkf.A00);
        C74504Pvz pvz = this.A03;
        this.A07 = pvz.B6g();
        this.A08 = pvz.C6W();
        this.A06 = mg9.A03;
    }

    public final void A8Y(Map map) {
        this.A05.A8Y(map);
        map.put("direct_inbox_infra_type", "btv");
    }

    public final C74542Pwb B4p() {
        return this.A09;
    }

    public final C74565PxE B6g() {
        return this.A07;
    }

    public final /* bridge */ /* synthetic */ C74510Pw5 BNZ() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ C74395PuB BVW() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ C74462PvH BbU() {
        return this.A04;
    }

    public final P3Z BbV() {
        return this.A06;
    }

    public final C74504Pvz BzE() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ C74515PwA C61() {
        return this.A01;
    }

    public final C74566PxF C6W() {
        return this.A08;
    }
}
